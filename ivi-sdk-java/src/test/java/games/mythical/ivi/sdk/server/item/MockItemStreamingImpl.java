package games.mythical.ivi.sdk.server.item;

import com.google.protobuf.Empty;
import games.mythical.ivi.sdk.proto.api.item.Item;
import games.mythical.ivi.sdk.proto.common.item.ItemState;
import games.mythical.ivi.sdk.proto.streams.Subscribe;
import games.mythical.ivi.sdk.proto.streams.item.ItemStatusConfirmRequest;
import games.mythical.ivi.sdk.proto.streams.item.ItemStatusUpdate;
import games.mythical.ivi.sdk.proto.streams.item.ItemStreamGrpc;
import games.mythical.ivi.sdk.util.ConcurrentFinisher;
import io.grpc.stub.StreamObserver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MockItemStreamingImpl extends ItemStreamGrpc.ItemStreamImplBase {
    private final Map<String, StreamObserver<ItemStatusUpdate>> streamObservers = new ConcurrentHashMap<>();

    @Override
    public void itemStatusStream(Subscribe request, StreamObserver<ItemStatusUpdate> responseObserver) {
        streamObservers.putIfAbsent(request.getEnvironmentId(), responseObserver);
    }

    @Override
    public void itemStatusConfirmation(ItemStatusConfirmRequest request, StreamObserver<Empty> responseObserver) {
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();

        ConcurrentFinisher.finish(request.getTrackingId());
    }

    public void sendStatus(String environmentId, Item item, ItemState itemState) {
        if(streamObservers.containsKey(environmentId)) {
            var observer = streamObservers.get(environmentId);
            var itemStatus = ItemStatusUpdate.newBuilder()
                    .setGameInventoryId(item.getGameInventoryId())
                    .setPlayerId(item.getPlayerId())
                    .setDgoodsId(item.getDgoodsId())
                    .setSerialNumber(item.getSerialNumber())
                    .setGameItemTypeId(item.getGameItemTypeId())
                    .setMetadataUri(item.getMetadataUri())
                    .setTrackingId(item.getTrackingId())
                    .setItemState(itemState)
                    .build();
            observer.onNext(itemStatus);
        }
    }

    public void reset() {
        for (var observer : streamObservers.values()) {
            observer.onCompleted();
        }

        streamObservers.clear();
    }
}

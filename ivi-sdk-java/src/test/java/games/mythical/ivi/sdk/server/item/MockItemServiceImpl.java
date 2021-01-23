package games.mythical.ivi.sdk.server.item;

import games.mythical.ivi.sdk.proto.api.item.*;
import games.mythical.ivi.sdk.proto.common.item.ItemState;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MockItemServiceImpl extends ItemServiceGrpc.ItemServiceImplBase {
    private final Map<String, Item> items = new ConcurrentHashMap<>();

    @Override
    public void issueItem(IssueItemRequest request, StreamObserver<IssueItemStartedResponse> responseObserver) {
        var response = IssueItemStartedResponse.newBuilder()
                .setTrackingId(RandomStringUtils.randomAlphanumeric(30))
                .setItemState(ItemState.PENDING_ISSUED)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getItem(GetItemRequest request, StreamObserver<Item> responseObserver) {
        if(items.containsKey(request.getItemId())) {
            var item = items.get(request.getItemId());
            responseObserver.onNext(item);
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(Status.NOT_FOUND.asException());
        }
    }

    @Override
    public void getItems(GetItemsRequest request, StreamObserver<Items> responseObserver) {
        var result = new ArrayList<Item>();
        for(var itemId: request.getItemIdsList()) {
            if(items.containsKey(itemId)) {
                result.add(items.get(itemId));
            }
        }

        responseObserver.onNext(Items.newBuilder().addAllItems(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getItemsForPlayer(GetItemsForPlayerRequest request, StreamObserver<Items> responseObserver) {
        var result = new ArrayList<Item>();
        for(var item : items.values()) {
            if(item.getPlayerId().equals(request.getPlayerId())) {
                result.add(item);
            }
        }

        responseObserver.onNext(Items.newBuilder().addAllItems(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public void transferItem(TransferItemRequest request, StreamObserver<TransferItemStartedResponse> responseObserver) {
        if(!items.containsKey(request.getGameItemInventoryId())) {
            responseObserver.onError(Status.NOT_FOUND.asException());
            return;
        }

        var newItemBuilder = items.get(request.getGameItemInventoryId()).toBuilder();
        newItemBuilder.setPlayerId(request.getDestinationPlayerId());
        items.put(request.getGameItemInventoryId(), newItemBuilder.build());

        var response = TransferItemStartedResponse.newBuilder()
                .setTrackingId(RandomStringUtils.randomAlphanumeric(30))
                .setItemState(ItemState.PENDING_TRANSFERRED)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void burnItem(BurnItemRequest request, StreamObserver<BurnItemStartedResponse> responseObserver) {
        var response = BurnItemStartedResponse.newBuilder()
                .setTrackingId(RandomStringUtils.randomAlphanumeric(30))
                .setItemState(ItemState.PENDING_BURNED)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void setItems(Collection<Item> items) {
        for(var item : items) {
            this.items.putIfAbsent(item.getGameInventoryId(), item);
        }
    }

    public void reset() {
        items.clear();
    }
}

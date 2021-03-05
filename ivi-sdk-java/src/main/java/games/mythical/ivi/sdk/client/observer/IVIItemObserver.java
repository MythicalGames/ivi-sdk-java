package games.mythical.ivi.sdk.client.observer;

import games.mythical.ivi.sdk.client.executor.IVIItemExecutor;
import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.proto.streams.item.ItemStatusConfirmRequest;
import games.mythical.ivi.sdk.proto.streams.item.ItemStatusUpdate;
import games.mythical.ivi.sdk.proto.streams.item.ItemStreamGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class IVIItemObserver implements StreamObserver<ItemStatusUpdate> {
    private final IVIItemExecutor IVIItemExecutor;
    private final ItemStreamGrpc.ItemStreamBlockingStub streamBlockingStub;
    private final Consumer<IVIItemObserver> resubscribe;

    public IVIItemObserver(IVIItemExecutor IVIItemExecutor,
                           ItemStreamGrpc.ItemStreamBlockingStub streamBlockingStub,
                           Consumer<IVIItemObserver> resubscribe) {
        this.IVIItemExecutor = IVIItemExecutor;
        this.streamBlockingStub = streamBlockingStub;
        this.resubscribe = resubscribe;
    }

    @Override
    public void onNext(ItemStatusUpdate message) {
        log.trace("ItemObserver.onNext for item: {}", message.getGameInventoryId());
        try {
            IVIItemExecutor.updateItem(message.getGameInventoryId(),
                    message.getItemTypeId(),
                    message.getPlayerId(),
                    message.getDgoodsId(),
                    message.getSerialNumber(),
                    message.getMetadataUri(),
                    message.getTrackingId(),
                    message.getItemState());
            updateItemConfirmation(message.getGameInventoryId(), message.getTrackingId());
        } catch (Exception e) {
            log.error("Exception calling updateItem for {}. {}", message.getGameInventoryId(), e);
        }
    }

    @Override
    public void onError(Throwable t) {
        log.error("ItemObserver.onError", t);
        resubscribe.accept(this);
    }

    @Override
    public void onCompleted() {
        log.info("ItemObserver stream closed");
        resubscribe.accept(this);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void updateItemConfirmation(String gameInventoryId, String trackingId) {
        var request = ItemStatusConfirmRequest.newBuilder()
                .setEnvironmentId(IVIConfiguration.getEnvironmentId())
                .setGameInventoryId(gameInventoryId)
                .setTrackingId(trackingId)
                .build();
        streamBlockingStub.itemStatusConfirmation(request);
    }
}

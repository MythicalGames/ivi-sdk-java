package games.mythical.ivi.sdk.client.observer;

import games.mythical.ivi.sdk.client.executor.IVIItemExecutor;
import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.proto.common.item.ItemState;
import games.mythical.ivi.sdk.proto.streams.item.ItemStatusConfirmRequest;
import games.mythical.ivi.sdk.proto.streams.item.ItemStatusUpdate;
import games.mythical.ivi.sdk.proto.streams.item.ItemStreamGrpc;
import games.mythical.ivi.sdk.util.Procedure;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class IVIItemObserver implements StreamObserver<ItemStatusUpdate> {
    private final IVIItemExecutor IVIItemExecutor;
    private final ItemStreamGrpc.ItemStreamBlockingStub streamBlockingStub;
    private final Consumer<IVIItemObserver> resubscribe;
    private final Procedure reset;

    public IVIItemObserver(IVIItemExecutor IVIItemExecutor,
                           ItemStreamGrpc.ItemStreamBlockingStub streamBlockingStub,
                           Consumer<IVIItemObserver> resubscribe,
                           Procedure reset) {
        this.IVIItemExecutor = IVIItemExecutor;
        this.streamBlockingStub = streamBlockingStub;
        this.resubscribe = resubscribe;
        this.reset = reset;
    }

    @Override
    public void onNext(ItemStatusUpdate message) {
        log.trace("ItemObserver.onNext for item: {}", message.getGameInventoryId());
        reset.invoke();
        try {
            IVIItemExecutor.updateItem(message.getGameInventoryId(),
                    message.getGameItemTypeId(),
                    message.getPlayerId(),
                    message.getDgoodsId(),
                    message.getSerialNumber(),
                    message.getMetadataUri(),
                    message.getTrackingId(),
                    message.getItemState());
            updateItemConfirmation(message.getGameInventoryId(), message.getTrackingId(), message.getItemState());
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
    private void updateItemConfirmation(String gameInventoryId, String trackingId, ItemState itemState) {
        var request = ItemStatusConfirmRequest.newBuilder()
                .setEnvironmentId(IVIConfiguration.getEnvironmentId())
                .setGameInventoryId(gameInventoryId)
                .setTrackingId(trackingId)
                .setItemState(itemState)
                .build();
        streamBlockingStub.itemStatusConfirmation(request);
    }
}

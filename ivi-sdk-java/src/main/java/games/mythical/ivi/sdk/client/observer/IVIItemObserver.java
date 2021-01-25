package games.mythical.ivi.sdk.client.observer;

import games.mythical.ivi.sdk.client.executor.IVIItemExecutor;
import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.proto.streams.item.ItemStatusConfirmRequest;
import games.mythical.ivi.sdk.proto.streams.item.ItemStatusUpdate;
import games.mythical.ivi.sdk.proto.streams.item.ItemStreamGrpc;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IVIItemObserver implements StreamObserver<ItemStatusUpdate> {
    private final IVIItemExecutor IVIItemExecutor;
    private final ItemStreamGrpc.ItemStreamBlockingStub streamBlockingStub;

    public IVIItemObserver(IVIItemExecutor IVIItemExecutor,
                           ItemStreamGrpc.ItemStreamBlockingStub streamBlockingStub) {
        this.IVIItemExecutor = IVIItemExecutor;
        this.streamBlockingStub = streamBlockingStub;
    }

    @Override
    public void onNext(ItemStatusUpdate message) {
        log.trace("ItemObserver.onNext for item: {}", message.getGameInventoryId());
        try {
            IVIItemExecutor.updateItem(message.getGameInventoryId(),
                    message.getPlayerId(),
                    message.getDgoodsId(),
                    message.getSerialNumber(),
                    message.getTokenName(),
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
        throw new StatusRuntimeException(Status.UNKNOWN);
    }

    @Override
    public void onCompleted() {
        log.info("ItemObserver stream closed");
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

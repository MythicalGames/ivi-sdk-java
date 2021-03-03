package games.mythical.ivi.sdk.client.observer;

import games.mythical.ivi.sdk.client.executor.IVIItemTypeExecutor;
import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.proto.streams.itemtype.ItemTypeStatusConfirmRequest;
import games.mythical.ivi.sdk.proto.streams.itemtype.ItemTypeStatusStreamGrpc;
import games.mythical.ivi.sdk.proto.streams.itemtype.ItemTypeStatusUpdate;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class IVIItemTypeObserver implements StreamObserver<ItemTypeStatusUpdate> {
    private final IVIItemTypeExecutor itemTypeExecutor;
    private final ItemTypeStatusStreamGrpc.ItemTypeStatusStreamBlockingStub streamBlockingStub;
    private final Consumer<IVIItemTypeObserver> resubscribe;

    public IVIItemTypeObserver(IVIItemTypeExecutor itemTypeExecutor,
                               ItemTypeStatusStreamGrpc.ItemTypeStatusStreamBlockingStub streamBlockingStub,
                               Consumer<IVIItemTypeObserver> resubscribe) {
        this.streamBlockingStub = streamBlockingStub;
        this.itemTypeExecutor = itemTypeExecutor;
        this.resubscribe = resubscribe;
    }

    @Override
    public void onNext(ItemTypeStatusUpdate message) {
        log.trace("ItemTypeObserver.onNext for item_type id: {}", message.getItemTypeId());
        try {
            itemTypeExecutor.updateItemType(message.getItemTypeId(),
                    message.getCurrentSupply(),
                    message.getIssuedSupply(),
                    message.getBaseUri(),
                    message.getIssueTimeSpan(),
                    message.getTrackingId(),
                    message.getItemTypeState());
            updateItemTypeConfirmation(message.getItemTypeId(), message.getTrackingId());
        } catch (Exception e) {
            log.error("Exception calling updateItemType", e);
        }
    }

    @Override
    public void onError(Throwable t) {
        log.error("ItemTypeObserver.onError", t);
        resubscribe.accept(this);
    }

    @Override
    public void onCompleted() {
        log.info("ItemTypeObserver stream closed");
        resubscribe.accept(this);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void updateItemTypeConfirmation(String itemTypeId, String trackingId) {
        var request = ItemTypeStatusConfirmRequest.newBuilder()
                .setEnvironmentId(IVIConfiguration.getEnvironmentId())
                .setItemTypeId(itemTypeId)
                .setTrackingId(trackingId)
                .build();
        streamBlockingStub.itemTypeStatusConfirmation(request);
    }
}

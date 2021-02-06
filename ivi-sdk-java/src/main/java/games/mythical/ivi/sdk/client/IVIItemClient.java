package games.mythical.ivi.sdk.client;

import com.google.protobuf.InvalidProtocolBufferException;
import games.mythical.ivi.sdk.client.executor.IVIItemExecutor;
import games.mythical.ivi.sdk.client.model.IVIItem;
import games.mythical.ivi.sdk.client.model.IVIItemMetadata;
import games.mythical.ivi.sdk.client.observer.IVIItemObserver;
import games.mythical.ivi.sdk.exception.IVIErrorCode;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.item.*;
import games.mythical.ivi.sdk.proto.common.item.OptionalInformation;
import games.mythical.ivi.sdk.proto.streams.Subscribe;
import games.mythical.ivi.sdk.proto.streams.item.ItemStreamGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static games.mythical.ivi.sdk.util.ConversionUtils.convertProperties;

@Slf4j
public class IVIItemClient extends AbstractIVIClient {
    private ItemServiceGrpc.ItemServiceBlockingStub serviceBlockingStub;
    private final IVIItemExecutor iviItemExecutor;

    @SuppressWarnings("unused")
    public IVIItemClient(IVIItemExecutor iviItemExecutor) throws IVIException {
        super();

        this.iviItemExecutor = iviItemExecutor;
        var channel = ManagedChannelBuilder.forAddress(host, port)
                .build();

        initStub(channel);
    }

    IVIItemClient(IVIItemExecutor iviItemExecutor, ManagedChannel channel) throws IVIException {
        this.iviItemExecutor = iviItemExecutor;
        initStub(channel);
    }

    @Override
    void initStub(ManagedChannel channel) {
        serviceBlockingStub = ItemServiceGrpc.newBlockingStub(channel);

        // set up server stream
        var streamStub = ItemStreamGrpc.newStub(channel);
        var subscribe = Subscribe.newBuilder()
                .setEnvironmentId(environmentId)
                .build();
        streamStub.itemStatusStream(subscribe, new IVIItemObserver(iviItemExecutor,
                ItemStreamGrpc.newBlockingStub(channel)));
    }

    public void issueItem(String gameInventoryId,
                          String playerId,
                          String itemName,
                          String itemTypeId,
                          Map<String, String> properties,
                          BigDecimal amountPaid,
                          String currency) throws IVIException {
        try {
            var request = IssueItemRequest.newBuilder()
                    .setEnvironmentId(environmentId)
                    .setGameInventoryId(gameInventoryId)
                    .setPlayerId(playerId)
                    .setItemName(itemName)
                    .setItemTypeId(itemTypeId)
                    .setProperties(convertProperties(properties))
                    .setAmountPaid(amountPaid.toString())
                    .setCurrency(currency)
                    .build();
            var result = serviceBlockingStub.issueItem(request);
            iviItemExecutor.updateItemState(gameInventoryId, result.getTrackingId(), result.getItemState());
        } catch (InvalidProtocolBufferException e) {
            log.error("issueItem: couldn't convert additionalMetadata!", e);
            throw new IVIException(IVIErrorCode.LOCAL_EXCEPTION);
        } catch (Exception e) {
            log.error("Exception calling updateItemState on issueItem, item will be in an invalid state!", e);
            throw new IVIException(IVIErrorCode.LOCAL_EXCEPTION);
        }
    }

    public void transferItem(String gameInventoryId,
                             String sourcePlayerId,
                             String destPlayerId) throws IVIException {
        var request = TransferItemRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setGameItemInventoryId(gameInventoryId)
                .setSourcePlayerId(sourcePlayerId)
                .setDestinationPlayerId(destPlayerId)
                .build();

        try {
            var result = serviceBlockingStub.transferItem(request);
            iviItemExecutor.updateItemState(gameInventoryId, result.getTrackingId(), result.getItemState());
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        } catch (Exception e) {
            log.error("Exception calling updateItemState on transferItem, item will be in an invalid state!", e);
            throw new IVIException(IVIErrorCode.LOCAL_EXCEPTION);
        }
    }

    public void burnItem(String gameInventoryId) throws IVIException {
        var request = BurnItemRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setGameItemInventoryId(gameInventoryId)
                .build();

        try {
            var result = serviceBlockingStub.burnItem(request);
            iviItemExecutor.updateItemState(gameInventoryId, result.getTrackingId(), result.getItemState());
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        } catch (Exception e) {
            log.error("Exception calling updateItemState on burnItem, item will be in an invalid state!", e);
            throw new IVIException(IVIErrorCode.LOCAL_EXCEPTION);
        }
    }

    public Optional<IVIItem> getItem(String gameInventoryId) throws IVIException {
        return getItem(gameInventoryId, ItemHistory.LATEST);
    }

    public Optional<IVIItem> getItem(String gameInventoryId, ItemHistory history) throws IVIException {
        var request = GetItemRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setItemId(gameInventoryId)
                .setItemHistory(history)
                .build();

        try {
            var item = serviceBlockingStub.getItem(request);
            return Optional.of(IVIItem.fromProto(item));
        } catch (StatusRuntimeException e) {
            if (e.getStatus() == Status.NOT_FOUND) {
                return Optional.empty();
            }

            throw IVIException.fromGrpcException(e);
        }
    }

    public List<IVIItem> getItems(Collection<String> gameInventoryIds) throws IVIException {
        var request = GetItemsRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .addAllItemIds(gameInventoryIds)
                .build();

        var response = serviceBlockingStub.getItems(request);

        var result = new ArrayList<IVIItem>();
        for(var item : response.getItemsList()) {
            result.add(IVIItem.fromProto(item));
        }

        return result;
    }

    public void updateItemMetadata(String gameInventoryId, Map<String, String> properties) throws IVIException {
        var updateItems = UpdateItemMetadata.newBuilder()
                .setGameInventoryId(gameInventoryId)
                .setProperties(convertProperties(properties))
                .build();

        var request = UpdateItemMetadataRequest.newBuilder()
                .addAllUpdateItems(List.of(updateItems))
                .build();

        updateItemMetadata(request);
    }

    public void updateItemMetadataComplete(String gameInventoryId,
                                           Map<String, String> properties,
                                           IVIItemMetadata metadata) throws IVIException {
        var optionalInfo = OptionalInformation.newBuilder()
                .setDescription(metadata.getDescription())
                .setImageLarge(metadata.getImageLargeUrl())
                .setImageSmall(metadata.getImageSmallUrl())
                .setRender(metadata.getRender())
                .setAuthenticityImage(metadata.getAuthenticityImage())
                .build();

        var updateItems = UpdateItemMetadata.newBuilder()
                .setGameInventoryId(gameInventoryId)
                .setProperties(convertProperties(properties))
                .setOptionalInformation(optionalInfo)
                .build();

        var request = UpdateItemMetadataRequest.newBuilder()
                .addAllUpdateItems(List.of(updateItems))
                .build();

        updateItemMetadata(request);
    }

    private void updateItemMetadata(UpdateItemMetadataRequest request) throws IVIException {
        try {
            var response = serviceBlockingStub.updateItemMetadata(request);
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }
}

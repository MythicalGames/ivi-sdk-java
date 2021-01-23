package games.mythical.ivi.sdk.client;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.util.JsonFormat;
import games.mythical.ivi.sdk.client.executor.IVIItemExecutor;
import games.mythical.ivi.sdk.client.observer.IVIItemObserver;
import games.mythical.ivi.sdk.exception.IVIErrorCode;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.item.*;
import games.mythical.ivi.sdk.proto.streams.Subscribe;
import games.mythical.ivi.sdk.proto.streams.item.ItemStreamGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
                          String tokenName,
                          Map<String, Object> additionalMetadata,
                          BigDecimal amountPaid,
                          String currency) throws IVIException {
        try {
            var metadata = (JsonObject) new Gson().toJsonTree(additionalMetadata);
            var structBuilder = Struct.newBuilder();
            JsonFormat.parser().merge(metadata.toString(), structBuilder);
            var request = IssueItemRequest.newBuilder()
                    .setEnvironmentId(environmentId)
                    .setGameInventoryId(gameInventoryId)
                    .setPlayerId(playerId)
                    .setItemName(itemName)
                    .setTokenName(tokenName)
                    .setAdditionalMetadata(structBuilder)
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
                             String destPlayerId,
                             String memo) throws IVIException {
        var request = TransferItemRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setGameItemInventoryId(gameInventoryId)
                .setSourcePlayerId(sourcePlayerId)
                .setDestinationPlayerId(destPlayerId)
                .setMemo(memo)
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

    public Optional<Item> getItem(String gameInventoryId) throws IVIException {
        return getItem(gameInventoryId, ItemHistory.LATEST);
    }

    public Optional<Item> getItem(String gameInventoryId, ItemHistory history) throws IVIException {
        var request = GetItemRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setItemId(gameInventoryId)
                .setItemHistory(history)
                .build();

        try {
            var item = serviceBlockingStub.getItem(request);
            return Optional.of(item);
        } catch (StatusRuntimeException e) {
            if (e.getStatus() == Status.NOT_FOUND) {
                return Optional.empty();
            }

            throw IVIException.fromGrpcException(e);
        }
    }

    public List<Item> getItems(Collection<String> gameInventoryIds) {
        var request = GetItemsRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .addAllItemIds(gameInventoryIds)
                .build();

        var response = serviceBlockingStub.getItems(request);
        return response.getItemsList();
    }
}

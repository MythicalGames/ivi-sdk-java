package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.executor.IVIItemTypeExecutor;
import games.mythical.ivi.sdk.client.model.IVIItemType;
import games.mythical.ivi.sdk.client.model.IVIMetadata;
import games.mythical.ivi.sdk.client.observer.IVIItemTypeObserver;
import games.mythical.ivi.sdk.exception.IVIErrorCode;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.itemtype.*;
import games.mythical.ivi.sdk.proto.streams.Subscribe;
import games.mythical.ivi.sdk.proto.streams.itemtype.ItemTypeStatusStreamGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
public class IVIItemTypeClient extends AbstractIVIClient {
    private ItemTypeServiceGrpc.ItemTypeServiceBlockingStub serviceBlockingStub;
    private final IVIItemTypeExecutor itemTypeExecutor;

    @SuppressWarnings("unused")
    public IVIItemTypeClient(IVIItemTypeExecutor itemTypeExecutor) throws IVIException {
        super();

        this.itemTypeExecutor = itemTypeExecutor;
        var channel = ManagedChannelBuilder.forAddress(host, port)
                .build();

        initStub(channel);
    }

    IVIItemTypeClient(IVIItemTypeExecutor itemTypeExecutor, ManagedChannel channel) throws IVIException {
        this.itemTypeExecutor = itemTypeExecutor;
        initStub(channel);
    }

    @Override
    protected void initStub(ManagedChannel channel) {
        serviceBlockingStub = ItemTypeServiceGrpc.newBlockingStub(channel);

        // set up server stream
        var streamStub = ItemTypeStatusStreamGrpc.newStub(channel);
        var subscribe = Subscribe.newBuilder()
                .setEnvironmentId(this.environmentId)
                .build();
        streamStub.itemTypeStatusStream(subscribe, new IVIItemTypeObserver(itemTypeExecutor,
                ItemTypeStatusStreamGrpc.newBlockingStub(channel)));
    }

    public Optional<IVIItemType> getItemType(UUID itemTypeId) throws IVIException {
        var result = getItemTypes(List.of(itemTypeId));
        if(result.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(result.get(0));
        }
    }

    public List<IVIItemType> getItemTypes(Collection<UUID> itemTypeIds) throws IVIException {
        var request = GetItemTypesRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .addAllItemTypeIds(itemTypeIds.stream().map(UUID::toString).collect(Collectors.toList()))
                .build();
        var result = serviceBlockingStub.getItemTypes(request);
        return IVIItemType.fromProto(result.getItemTypesList());
    }

    void createItemType(String tokenName,
                        String category,
                        int maxSupply,
                        int issueTimeSpan,
                        boolean burnable,
                        boolean transferable,
                        boolean sellable,
                        Collection<UUID> agreementIds,
                        IVIMetadata metadata) throws IVIException {
        try {
            log.trace("ItemTypeClient.createItemType called for {}:{}", tokenName, category);
            var request = CreateItemTypeRequest.newBuilder()
                    .setEnvironmentId(environmentId)
                    .setTokenName(tokenName)
                    .setCategory(category)
                    .setMaxSupply(maxSupply)
                    .setIssueTimeSpan(issueTimeSpan)
                    .setBurnable(burnable)
                    .setTransferable(transferable)
                    .setSellable(sellable)
                    .addAllAgreementIds(agreementIds.stream().map(UUID::toString).collect(Collectors.toList()))
                    .setMetadata(IVIMetadata.toProto(metadata))
                    .build();
            var result = serviceBlockingStub.createItemType(request);
            itemTypeExecutor.updateItemTypeStatus(result.getItemTypeId(),
                    result.getTrackingId(),
                    result.getItemTypeState());
        } catch (IVIException e) {
            log.error("Error parsing metadata!", e);
            throw new IVIException(IVIErrorCode.PARSING_DATA_EXCEPTION);
        } catch (Exception e) {
            log.error("Exception calling updateItemType on createItemType, item type will be in an invalid state!", e);
            throw new IVIException(IVIErrorCode.LOCAL_EXCEPTION);
        }
    }

    void freezeItemType(UUID itemTypeId) {
        log.trace("ItemTypeClient.freezeItemType called for {}", itemTypeId);
        var request = FreezeItemTypeRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setItemTypeId(itemTypeId.toString())
                .build();
        var result = serviceBlockingStub.freezeItemType(request);
        try {
            itemTypeExecutor.updateItemTypeStatus(itemTypeId.toString(),
                    result.getTrackingId(),
                    result.getItemTypeState());
        } catch (Exception e) {
            log.error("Exception calling updateItemType on createItemType, item type will be in an invalid state!", e);
        }
    }
}


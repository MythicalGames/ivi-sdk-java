package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.executor.IVIItemTypeExecutor;
import games.mythical.ivi.sdk.client.observer.IVIItemTypeObserver;
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

@Slf4j
public class IVIItemTypeClient extends AbstractIVIClient {
    private ItemTypeServiceGrpc.ItemTypeServiceBlockingStub serviceBlockingStub;
    private final IVIItemTypeExecutor itemTypeExecutor;

    @SuppressWarnings("unused")
    public IVIItemTypeClient(IVIItemTypeExecutor itemTypeExecutor) throws IVIException {
        super();

        this.itemTypeExecutor = itemTypeExecutor;
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .build();
        initStub();
    }

    IVIItemTypeClient(IVIItemTypeExecutor itemTypeExecutor, ManagedChannel channel) throws IVIException {
        this.itemTypeExecutor = itemTypeExecutor;
        this.channel = channel;
        initStub();
    }

    @Override
    protected void initStub() {
        serviceBlockingStub = ItemTypeServiceGrpc.newBlockingStub(channel);
        subscribeToStream(new IVIItemTypeObserver(itemTypeExecutor, ItemTypeStatusStreamGrpc.newBlockingStub(channel),
                this::subscribeToStream));
    }

    void subscribeToStream(IVIItemTypeObserver observer) {
        // set up server stream
        var streamStub = ItemTypeStatusStreamGrpc.newStub(channel);
        var subscribe = Subscribe.newBuilder()
                .setEnvironmentId(environmentId)
                .build();
        streamStub.itemTypeStatusStream(subscribe, observer);
    }

    public Optional<ItemType> getItemType(String itemTypeId) {
        var result = getItemTypes(List.of(itemTypeId));
        if(result.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(result.get(0));
        }
    }

    public List<ItemType> getItemTypes(Collection<String> itemTypeIds) {
        var request = GetItemTypesRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .addAllItemTypeIds(itemTypeIds)
                .build();
        var result = serviceBlockingStub.getItemTypes(request);
        return result.getItemTypesList();
    }

    void createItemType(String tokenName,
                        String category,
                        int maxSupply,
                        int issueTimeSpan,
                        boolean burnable,
                        boolean transferable,
                        boolean sellable,
                        Collection<String> agreementIds) {
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
                .addAllAgreementIds(agreementIds)
                .build();
        var result = serviceBlockingStub.createItemType(request);
        try {
            itemTypeExecutor.updateItemTypeStatus(result.getItemTypeId(),
                    result.getTrackingId(),
                    result.getItemTypeState());
        } catch (Exception e) {
            log.error("Exception calling updateItemType on createItemType, item type will be in an invalid state!", e);
        }
    }

    void freezeItemType(String itemTypeId) {
        log.trace("ItemTypeClient.freezeItemType called for {}", itemTypeId);
        var request = FreezeItemTypeRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setItemTypeId(itemTypeId)
                .build();
        var result = serviceBlockingStub.freezeItemType(request);
        try {
            itemTypeExecutor.updateItemTypeStatus(itemTypeId,
                    result.getTrackingId(),
                    result.getItemTypeState());
        } catch (Exception e) {
            log.error("Exception calling updateItemType on createItemType, item type will be in an invalid state!", e);
        }
    }


}


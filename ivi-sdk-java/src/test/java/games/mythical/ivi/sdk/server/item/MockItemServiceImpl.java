package games.mythical.ivi.sdk.server.item;

import com.google.gson.Gson;
import games.mythical.ivi.sdk.client.model.IVIItem;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.item.*;
import games.mythical.ivi.sdk.proto.common.item.ItemState;
import games.mythical.ivi.sdk.proto.common.item.OptionalInformation;
import games.mythical.ivi.sdk.util.ConversionUtils;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class MockItemServiceImpl extends ItemServiceGrpc.ItemServiceImplBase {
    private final Map<String, IVIItem> items = new ConcurrentHashMap<>();

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
            try {
                var item = items.get(request.getItemId());
                responseObserver.onNext(toProto(item));
                responseObserver.onCompleted();
            } catch (IVIException e) {
                log.error("Couldn't convert item!", e);
                responseObserver.onError(e);
            }
        } else {
            responseObserver.onError(Status.NOT_FOUND.asException());
        }
    }

    @Override
    public void getItems(GetItemsRequest request, StreamObserver<Items> responseObserver) {
        try {
            var result = new ArrayList<Item>();
            for (var itemId : request.getItemIdsList()) {
                if (items.containsKey(itemId)) {
                    result.add(toProto(items.get(itemId)));
                }
            }

            responseObserver.onNext(Items.newBuilder().addAllItems(result).build());
            responseObserver.onCompleted();
        } catch (IVIException e) {
            log.error("Couldn't convert item!", e);
            responseObserver.onError(e);
        }
    }

    @Override
    public void getItemsForPlayer(GetItemsForPlayerRequest request, StreamObserver<Items> responseObserver) {
        try {
            var result = new ArrayList<Item>();
            for(var item : items.values()) {
                if(item.getPlayerId().equals(request.getPlayerId())) {
                    result.add(toProto(item));
                }
            }

            responseObserver.onNext(Items.newBuilder().addAllItems(result).build());
            responseObserver.onCompleted();
        } catch (IVIException e) {
            log.error("Couldn't convert item!", e);
            responseObserver.onError(e);
        }
    }

    @Override
    public void transferItem(TransferItemRequest request, StreamObserver<TransferItemStartedResponse> responseObserver) {
        if(!items.containsKey(request.getGameItemInventoryId())) {
            responseObserver.onError(Status.NOT_FOUND.asException());
            return;
        }

        try {
            var newItemBuilder = toProto(items.get(request.getGameItemInventoryId())).toBuilder();
            newItemBuilder.setPlayerId(request.getDestinationPlayerId());
            items.put(request.getGameItemInventoryId(), IVIItem.fromProto(newItemBuilder.build()));

            var response = TransferItemStartedResponse.newBuilder()
                    .setTrackingId(RandomStringUtils.randomAlphanumeric(30))
                    .setItemState(ItemState.PENDING_TRANSFERRED)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (IVIException e) {
            log.error("Couldn't convert item!", e);
            responseObserver.onError(e);
        }
    }

    @Override
    public void burnItem(BurnItemRequest request, StreamObserver<BurnItemStartedResponse> responseObserver) {
        try {
            var newItemBuilder = toProto(items.get(request.getGameItemInventoryId())).toBuilder();
            newItemBuilder.setItemState(ItemState.PENDING_BURNED);
            items.put(request.getGameItemInventoryId(), IVIItem.fromProto(newItemBuilder.build()));

            var response = BurnItemStartedResponse.newBuilder()
                    .setTrackingId(RandomStringUtils.randomAlphanumeric(30))
                    .setItemState(ItemState.PENDING_BURNED)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (IVIException e) {
            log.error("Couldn't convert item!", e);
            responseObserver.onError(e);
        }
    }

    @Override
    public void updateItemMetadata(UpdateItemMetadataRequest request, StreamObserver<UpdateItemMetadataResponse> responseObserver) {
        var updateMap = new HashMap<String, UpdateItemMetadata>();
        for (var updateItem : request.getUpdateItemsList()) {
            var gameInventoryId = updateItem.getGameInventoryId();
            if (!items.containsKey(gameInventoryId)) {
                responseObserver.onError(Status.NOT_FOUND.asException());
                return;
            }

            updateMap.put(updateItem.getGameInventoryId(), updateItem);
        }

        try {
            for (var gameInventoryId : updateMap.keySet()) {
                var item = items.get(gameInventoryId);
                item.setProperties(ConversionUtils.convertProperties(updateMap.get(gameInventoryId).getProperties()));

                if(updateMap.get(gameInventoryId).hasOptionalInformation()) {
                    item.getMetadata().setDescription(updateMap.get(gameInventoryId).getOptionalInformation().getDescription());
                    item.getMetadata().setImageLargeUrl(updateMap.get(gameInventoryId).getOptionalInformation().getImageLarge());
                    item.getMetadata().setImageSmallUrl(updateMap.get(gameInventoryId).getOptionalInformation().getImageSmall());
                    item.getMetadata().setRender(updateMap.get(gameInventoryId).getOptionalInformation().getRender());
                    item.getMetadata().setAuthenticityImage(updateMap.get(gameInventoryId).getOptionalInformation().getAuthenticityImage());
                }
            }

            responseObserver.onNext(UpdateItemMetadataResponse.newBuilder().build());
            responseObserver.onCompleted();
        } catch (IVIException e) {
            log.error("Couldn't convert item!", e);
            responseObserver.onError(e);
        }
    }

    public void setItems(Collection<IVIItem> items) {
        for(var item : items) {
            this.items.putIfAbsent(item.getGameInventoryId(), item);
        }
    }

    public void reset() {
        items.clear();
    }

    private Item toProto(IVIItem item) throws IVIException {
        return Item.newBuilder()
                .setGameInventoryId(item.getGameInventoryId())
                .setItemTypeId(item.getItemTypeId())
                .setDgoodsId(item.getDGoodsId())
                .setItemName(item.getItemName())
                .setPlayerId(item.getPlayerId())
                .setOwnerSidechainAccount(item.getOwnerSidechainAccount())
                .setSerialNumber(item.getSerialNumber())
                .setCurrencyBase(item.getCurrencyBase())
                .setMetadataUri(item.getMetadataUri())
                .setTrackingId(item.getTrackingId())
                .setProperties(ConversionUtils.convertProperties(item.getProperties()))
                .setOptionalInformation(OptionalInformation.newBuilder()
                        .setDescription(item.getMetadata().getDescription())
                        .setImageLarge(item.getMetadata().getImageLargeUrl())
                        .setImageSmall(item.getMetadata().getImageSmallUrl())
                        .setRender(item.getMetadata().getRender())
                        .setAuthenticityImage(item.getMetadata().getAuthenticityImage())
                        .build())
                .setItemState(item.getItemState())
                .setCreatedTimestamp(item.getCreatedTimestamp().getEpochSecond())
                .setUpdatedTimestamp(item.getUpdatedTimestamp().getEpochSecond())
                .build();
    }
}

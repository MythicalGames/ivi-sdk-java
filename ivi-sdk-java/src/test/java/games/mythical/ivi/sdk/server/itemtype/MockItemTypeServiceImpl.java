package games.mythical.ivi.sdk.server.itemtype;

import games.mythical.ivi.sdk.proto.api.itemtype.*;
import games.mythical.ivi.sdk.proto.common.itemtype.ItemTypeState;
import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MockItemTypeServiceImpl extends ItemTypeServiceGrpc.ItemTypeServiceImplBase {
    private final Map<String, ItemType> itemTypes = new ConcurrentHashMap<>();

    @Override
    public void createItemType(CreateItemTypeRequest request, StreamObserver<CreateItemAsyncResponse> responseObserver) {
        var response = CreateItemAsyncResponse.newBuilder()
                .setItemTypeId(request.getEnvironmentId() + ":" + request.getTokenName())
                .setTrackingId(RandomStringUtils.randomAlphanumeric(30))
                .setItemTypeState(ItemTypeState.PENDING_CREATE)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getItemTypes(GetItemTypesRequest request, StreamObserver<ItemTypes> responseObserver) {
        var result = new ArrayList<ItemType>();
        for (var itemTypeId : request.getItemTypeIdsList()) {
            if(itemTypes.containsKey(itemTypeId)) {
                result.add(itemTypes.get(itemTypeId));
            }
        }

        responseObserver.onNext(ItemTypes.newBuilder().addAllItemTypes(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public void freezeItemType(FreezeItemTypeRequest request, StreamObserver<FreezeItemTypeAsyncResponse> responseObserver) {
        var response = FreezeItemTypeAsyncResponse.newBuilder()
                .setTrackingId(RandomStringUtils.randomAlphanumeric(30))
                .setItemTypeState(ItemTypeState.PENDING_FREEZE)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void setItemTypes(Collection<ItemType> itemTypes) {
        for (var itemType : itemTypes) {
            this.itemTypes.putIfAbsent(itemType.getItemTypeId(), itemType);
        }
    }

    public void reset() {
        itemTypes.clear();
    }
}

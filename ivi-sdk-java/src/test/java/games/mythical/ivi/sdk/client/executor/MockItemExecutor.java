package games.mythical.ivi.sdk.client.executor;

import games.mythical.ivi.sdk.proto.api.item.Item;
import games.mythical.ivi.sdk.proto.common.item.ItemState;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MockItemExecutor implements IVIItemExecutor {
    private String gameInventoryId;
    private String playerId;
    private long dGoodsId;
    private int serialNumber;
    private String tokenName;
    private String metadataUri;
    private String trackingId;
    private ItemState itemState;

    @Override
    public void updateItem(String gameInventoryId,
                           String playerId,
                           long dGoodsId,
                           int serialNumber,
                           String tokenName,
                           String metadataUri,
                           String trackingId,
                           ItemState itemState) throws Exception {
        this.gameInventoryId = gameInventoryId;
        this.playerId = playerId;
        this.dGoodsId = dGoodsId;
        this.serialNumber = serialNumber;
        this.tokenName = tokenName;
        this.metadataUri = metadataUri;
        this.trackingId = trackingId;
        this.itemState = itemState;
    }

    @Override
    public void updateItemState(String gameInventoryId, String trackingId, ItemState itemState) throws Exception {
        this.gameInventoryId = gameInventoryId;
        this.trackingId = trackingId;
        this.itemState = itemState;
    }

    public void setFromItem(Item item) throws Exception {
        updateItem(item.getGameInventoryId(),
                item.getPlayerId(),
                item.getDgoodsId(),
                item.getSerialNumber(),
                item.getTokenName(),
                item.getMetadataUri(),
                item.getTrackingId(),
                item.getItemState());
    }
}

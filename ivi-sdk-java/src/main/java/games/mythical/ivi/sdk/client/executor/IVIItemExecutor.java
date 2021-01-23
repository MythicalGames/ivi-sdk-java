package games.mythical.ivi.sdk.client.executor;

import games.mythical.ivi.sdk.proto.common.item.ItemState;

public interface IVIItemExecutor {
    void updateItem(String gameInventoryId,
                    String playerId,
                    long dGoodsId,
                    int serialNumber,
                    String tokenName,
                    String metadataUri,
                    String trackingId,
                    ItemState itemState) throws Exception;

    void updateItemState(String gameInventoryId,
                         String trackingId,
                         ItemState itemState) throws Exception;
}

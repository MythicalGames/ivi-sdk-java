package games.mythical.ivi.sdk.client.executor;

import games.mythical.ivi.sdk.proto.common.itemtype.ItemTypeState;

public interface ItemTypeExecutor {
    void updateItemType(String itemTypeId,
                        int currentSupply,
                        int issuedSupply,
                        String baseUri,
                        int issueTimeSpan,
                        String trackingId,
                        ItemTypeState itemTypeState) throws Exception;

    void updateItemTypeStatus(String itemTypeId,
                              String trackingId,
                              ItemTypeState itemTypeState) throws Exception;
}

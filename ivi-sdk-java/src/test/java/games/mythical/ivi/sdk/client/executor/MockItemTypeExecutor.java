package games.mythical.ivi.sdk.client.executor;

import games.mythical.ivi.sdk.proto.api.itemtype.ItemType;
import games.mythical.ivi.sdk.proto.common.itemtype.ItemTypeState;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MockItemTypeExecutor implements IVIItemTypeExecutor {
    private String itemTypeId;
    private int currentSupply;
    private int issuedSupply;
    private String baseUri;
    private int issueTimeSpan;
    private String trackingId;
    private ItemTypeState itemTypeState;

    @Override
    public void updateItemType(String itemTypeId,
                               int currentSupply,
                               int issuedSupply,
                               String baseUri,
                               int issueTimeSpan,
                               String trackingId,
                               ItemTypeState itemTypeState) throws Exception {
        this.itemTypeId = itemTypeId;
        this.currentSupply = currentSupply;
        this.issuedSupply = issuedSupply;
        this.baseUri = baseUri;
        this.issueTimeSpan = issueTimeSpan;
        this.trackingId = trackingId;
        this.itemTypeState = itemTypeState;
    }

    @Override
    public void updateItemTypeStatus(String itemTypeId,
                                     String trackingId,
                                     ItemTypeState itemTypeState) throws Exception {
        this.itemTypeId = itemTypeId;
        this.trackingId = trackingId;
        this.itemTypeState = itemTypeState;
    }

    public void setFromItemType(ItemType itemType) {
            this.itemTypeId = itemType.getItemTypeId();
            this.currentSupply = itemType.getCurrentSupply();
            this.issuedSupply = itemType.getIssuedSupply();
            this.baseUri = itemType.getBaseUri();
            this.issueTimeSpan = itemType.getIssueTimeSpan();
            this.trackingId = itemType.getTrackingId();
            this.itemTypeState = itemType.getItemTypeState();
    }
}

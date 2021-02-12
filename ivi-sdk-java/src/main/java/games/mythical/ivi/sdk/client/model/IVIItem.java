package games.mythical.ivi.sdk.client.model;

import com.fasterxml.jackson.databind.JsonNode;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.item.Item;
import games.mythical.ivi.sdk.proto.common.item.ItemState;
import games.mythical.ivi.sdk.util.ConversionUtils;
import lombok.Data;

import java.time.Instant;
import java.util.Map;

@Data
public class IVIItem {
    private String gameInventoryId;
    private String itemTypeId;
    private long dGoodsId;
    private String itemName;
    private String playerId;
    private String ownerSidechainAccount;
    private int serialNumber;
    private String currencyBase;
    private String metadataUri;
    private String trackingId;
    private Map<String, Object> properties;
    private IVIItemMetadata metadata;
    private ItemState itemState;
    private Instant createdTimestamp;
    private Instant updatedTimestamp;

    IVIItem(String gameInventoryId,
                   String itemTypeId,
                   long dGoodsId,
                   String itemName,
                   String playerId,
                   String ownerSidechainAccount,
                   int serialNumber,
                   String currencyBase,
                   String metadataUri,
                   String trackingId,
                   Map<String, Object> properties,
                   IVIItemMetadata metadata,
                   ItemState itemState,
                   Instant createdTimestamp,
                   Instant updatedTimestamp) {
        this.gameInventoryId = gameInventoryId;
        this.itemTypeId = itemTypeId;
        this.dGoodsId = dGoodsId;
        this.itemName = itemName;
        this.playerId = playerId;
        this.ownerSidechainAccount = ownerSidechainAccount;
        this.serialNumber = serialNumber;
        this.currencyBase = currencyBase;
        this.metadataUri = metadataUri;
        this.trackingId = trackingId;
        this.properties = properties;
        this.metadata = metadata;
        this.itemState = itemState;
        this.createdTimestamp = createdTimestamp;
        this.updatedTimestamp = updatedTimestamp;
    }

    public static IVIItem fromProto(Item item) throws IVIException {
        var properties = ConversionUtils.convertProperties(item.getProperties());
        var createdTimestamp = Instant.ofEpochSecond(item.getCreatedTimestamp());
        var updatedTimestamp = Instant.ofEpochSecond(item.getUpdatedTimestamp());
        var metadata = IVIItemMetadata.builder()
                .description(item.getOptionalInformation().getDescription())
                .imageLargeUrl(item.getOptionalInformation().getImageLarge())
                .imageSmallUrl(item.getOptionalInformation().getImageSmall())
                .render(item.getOptionalInformation().getRender())
                .authenticityImage(item.getOptionalInformation().getAuthenticityImage())
                .build();

        return new IVIItem(item.getGameInventoryId(),
                item.getItemTypeId(),
                item.getDgoodsId(),
                item.getItemName(),
                item.getPlayerId(),
                item.getOwnerSidechainAccount(),
                item.getSerialNumber(),
                item.getCurrencyBase(),
                item.getMetadataUri(),
                item.getTrackingId(),
                properties,
                metadata,
                item.getItemState(),
                createdTimestamp,
                updatedTimestamp);
    }
}

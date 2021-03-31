package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.order.PurchasedItem;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Data
@Builder
public class IVIPurchasedItem {
    private String gameInventoryId;
    private String itemName;
    private String gameItemTypeId;
    private BigDecimal amountPaid;
    private String currency;
    private IVIMetadata metadata;

    public PurchasedItem toProto() throws IVIException {
        return PurchasedItem.newBuilder()
                .setGameInventoryId(gameInventoryId)
                .setItemName(itemName)
                .setGameItemTypeId(gameItemTypeId)
                .setAmountPaid(amountPaid.toString())
                .setCurrency(currency)
                .setMetadata(IVIMetadata.toProto(metadata))
                .build();
    }

    public static IVIPurchasedItem fromProto(PurchasedItem purchasedItem) throws IVIException {
        return IVIPurchasedItem.builder()
                .gameInventoryId(purchasedItem.getGameInventoryId())
                .itemName(purchasedItem.getItemName())
                .gameItemTypeId(purchasedItem.getGameItemTypeId())
                .amountPaid(new BigDecimal(purchasedItem.getAmountPaid()))
                .currency(purchasedItem.getCurrency())
                .metadata(IVIMetadata.fromProto(purchasedItem.getMetadata()))
                .build();
    }
}

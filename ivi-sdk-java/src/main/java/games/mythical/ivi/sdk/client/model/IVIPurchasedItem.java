package games.mythical.ivi.sdk.client.model;

import com.google.protobuf.Struct;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.order.PurchasedItem;
import games.mythical.ivi.sdk.proto.common.item.OptionalInformation;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

import static games.mythical.ivi.sdk.util.ConversionUtils.convertProperties;

@Slf4j
@Data
@Builder
public class IVIPurchasedItem {
    private String gameInventoryId;
    private String itemName;
    private String itemTypeId;
    private BigDecimal amountPaid;
    private String currency;
    @Builder.Default
    private String description = "";
    @Builder.Default
    private String imageSmallUrl = "";
    @Builder.Default
    private String imageLargeUrl = "";
    @Builder.Default
    private String render = "";
    private Map<String, String> properties;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Struct _properties;

    public void setProperties(Map<String, String> properties) throws IVIException {
        this.properties = properties;
        this._properties = convertProperties(properties);
    }

    public static class IVIPurchasedItemBuilder {
        public IVIPurchasedItemBuilder properties(Map<String, String> properties) throws IVIException {
            this.properties = properties;
            this._properties = convertProperties(properties);
            return this;
        }
    }

    public void setDescription(String description) {
        this.description = Objects.requireNonNullElse(description, "");
    }

    public void setImageSmallUrl(String imageSmallUrl) {
        this.imageSmallUrl = Objects.requireNonNullElse(imageSmallUrl, "");
    }

    public void setImageLargeUrl(String imageLargeUrl) {
        this.imageLargeUrl = Objects.requireNonNullElse(imageLargeUrl, "");
    }

    public void setRender(String render) {
        this.render = Objects.requireNonNullElse(render, "");
    }

    public PurchasedItem toProto() {
        if(StringUtils.isAllBlank(description, imageSmallUrl, imageLargeUrl, render)) {
            return PurchasedItem.newBuilder()
                    .setGameInventoryId(gameInventoryId)
                    .setItemName(itemName)
                    .setItemTypeId(itemTypeId)
                    .setAmountPaid(amountPaid.toString())
                    .setCurrency(currency)
                    .setProperties(_properties)
                    .build();
        } else {
            var optionalInfo = OptionalInformation.newBuilder()
                    .setDescription(description)
                    .setImageSmall(imageSmallUrl)
                    .setImageLarge(imageLargeUrl)
                    .setRender(render)
                    .build();

            return PurchasedItem.newBuilder()
                    .setGameInventoryId(gameInventoryId)
                    .setItemName(itemName)
                    .setItemTypeId(itemTypeId)
                    .setAmountPaid(amountPaid.toString())
                    .setCurrency(currency)
                    .setProperties(_properties)
                    .setOptionalInformation(optionalInfo)
                    .build();
        }
    }

    public static IVIPurchasedItem fromProto(PurchasedItem purchasedItem) throws IVIException {
        var iviPurchasedItemBuilder = IVIPurchasedItem.builder()
                .gameInventoryId(purchasedItem.getGameInventoryId())
                .itemName(purchasedItem.getItemName())
                .itemTypeId(purchasedItem.getItemTypeId())
                .amountPaid(new BigDecimal(purchasedItem.getAmountPaid()))
                .currency(purchasedItem.getCurrency());

        if(purchasedItem.hasOptionalInformation()) {
            iviPurchasedItemBuilder.description(purchasedItem.getOptionalInformation().getDescription())
                    .imageSmallUrl(purchasedItem.getOptionalInformation().getImageSmall())
                    .imageLargeUrl(purchasedItem.getOptionalInformation().getImageLarge())
                    .render(purchasedItem.getOptionalInformation().getRender());
        }

        var iviPurchasedItem = iviPurchasedItemBuilder.build();
        iviPurchasedItem._properties = purchasedItem.getProperties();
        iviPurchasedItem.properties = convertProperties(purchasedItem.getProperties());
        return iviPurchasedItem;
    }
}

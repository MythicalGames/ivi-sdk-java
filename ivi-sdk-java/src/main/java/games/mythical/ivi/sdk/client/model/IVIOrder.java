package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.exception.IVIErrorCode;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.order.Order;
import games.mythical.ivi.sdk.proto.api.order.PaymentProviderId;
import games.mythical.ivi.sdk.proto.common.order.OrderState;
import games.mythical.ivi.sdk.util.ConversionUtils;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Getter
public class IVIOrder {
    private final String orderId;
    private final String storeId;
    private final String buyerPlayerId;
    private final BigDecimal tax;
    private final BigDecimal total;
    private final IVIOrderAddress address;
    private List<IVIPurchasedItem> purchasedItems;
    private String listingId;
    private final PaymentProviderId paymentProviderId;
    private final Map<String, Object> metadata;
    private final String createdBy;
    private final String requestIp;
    private final String environmentId;
    private final OrderState orderStatus;
    private final Instant createdTimestamp;

    IVIOrder(Order order) throws IVIException {
        orderId = order.getOrderId();
        storeId = order.getStoreId();
        buyerPlayerId = order.getBuyerPlayerId();
        tax = new BigDecimal(order.getTax());
        total = new BigDecimal(order.getTotal());
        address = IVIOrderAddress.fromProto(order.getAddress());
        paymentProviderId = order.getPaymentProviderId();
        metadata = ConversionUtils.convertProperties(order.getMetadata());
        createdBy = order.getCreatedBy();
        requestIp = order.getRequestIp();
        environmentId = order.getEnvironmentId();
        orderStatus = order.getOrderStatus();
        createdTimestamp = Instant.ofEpochSecond(order.getCreatedTimestamp());

        switch (order.getLineItemsCase()) {
            case PURCHASED_ITEMS:
                primarySale = true;
                purchasedItems = new ArrayList<>();
                for(var purchasedItem : order.getPurchasedItems().getPurchasedItemsList()) {
                    purchasedItems.add(IVIPurchasedItem.fromProto(purchasedItem));
                }
                break;
            case LISTING_ID:
                secondarySale = true;
                listingId = order.getListingId();
                break;
            case LINEITEMS_NOT_SET:
                log.error("Unable to parse Order from IVI, line items not set! Id: {}", order.getOrderId());
                throw new IVIException(IVIErrorCode.PARSING_DATA_EXCEPTION);
        }
    }

    @Getter(AccessLevel.NONE)
    private boolean primarySale = false;

    @Getter(AccessLevel.NONE)
    private boolean secondarySale = false;

    public boolean isPrimarySale() {
        return primarySale;
    }

    public boolean isSecondarySale() {
        return secondarySale;
    }

    public static IVIOrder fromProto(Order order) throws IVIException {
        return new IVIOrder(order);
    }
}

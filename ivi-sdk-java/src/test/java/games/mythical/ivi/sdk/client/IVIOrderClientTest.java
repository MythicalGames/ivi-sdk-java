package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.executor.MockOrderExecutor;
import games.mythical.ivi.sdk.client.model.IVIOrder;
import games.mythical.ivi.sdk.client.model.IVIOrderAddress;
import games.mythical.ivi.sdk.client.model.IVIPurchasedItem;
import games.mythical.ivi.sdk.exception.IVIErrorCode;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.order.PaymentProviderId;
import games.mythical.ivi.sdk.proto.common.order.OrderState;
import games.mythical.ivi.sdk.server.order.MockOrderServer;
import games.mythical.ivi.sdk.util.ConcurrentFinisher;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class IVIOrderClientTest extends AbstractClientTest {
    private MockOrderServer orderServer;
    private MockOrderExecutor orderExecutor;
    private IVIOrderClient orderClient;
    private Map<String, IVIOrder> orders;

    @BeforeEach
    void setUp() throws Exception {
        orderServer = new MockOrderServer();
        orderServer.start();
        port = orderServer.getPort();
        setUpConfig();

        orders = generateOrders(3);
        orderServer.getOrderService().setOrders(orders.values());

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        orderExecutor = MockOrderExecutor.builder().build();
        orderClient = new IVIOrderClient(orderExecutor, channel);
    }

    @AfterEach
    void tearDown() {
        orderServer.stop();
    }

    @Test
    void getOrder() throws Exception {
        var orderId = orders.keySet().iterator().next();

        var order = orderClient.getOrder(orderId);
        assertTrue(order.isPresent());
        verifyOrder(orders.get(orderId), order.get());


        orderId = RandomStringUtils.randomAlphanumeric(30);
        order = orderClient.getOrder(orderId);
        assertTrue(order.isEmpty());

        orderServer.verifyCalls("GetOrder", 2);
    }

    @Test
    void createPrimaryOrder() throws Exception {
        var storeId = RandomStringUtils.randomAlphanumeric(30);
        var playerId = RandomStringUtils.randomAlphanumeric(30);
        var subTotal = BigDecimal.valueOf(RandomUtils.nextDouble(0, 100));
        var address = generateAddress();
        var providerId = PaymentProviderId.BRAINTREE;
        var purchasedItems = generatePurchasedItems(3);

        orderClient.createPrimaryOrder(storeId, playerId, subTotal, address, providerId, purchasedItems);

        orderServer.verifyCalls("CreateOrder", 1);
        assertNotNull(orderExecutor.getOrderId());
        assertEquals(OrderState.CREATED, orderExecutor.getOrderStatus());

        var orderId = orderExecutor.getOrderId();
        ConcurrentFinisher.start(orderId);

        orderServer.getOrderStream().sendStatus(environmentId, orderId, OrderState.PENDING);

        ConcurrentFinisher.wait(orderId);

        orderServer.verifyCalls("OrderStatusStream", 1);
        orderServer.verifyCalls("OrderStatusConfirmation", 1);

        assertEquals(orderId, orderExecutor.getOrderId());
        assertEquals(OrderState.PENDING, orderExecutor.getOrderStatus());

        var order = orderClient.getOrder(orderId);

        assertTrue(order.isPresent());
        assertEquals(orderId, order.get().getOrderId());
        assertEquals(OrderState.PENDING, order.get().getOrderStatus());
        assertTrue(order.get().isPrimarySale());
        assertFalse(order.get().isSecondarySale());

        orderServer.verifyCalls("GetOrder", 1);
    }

    @Test
    void createSecondaryOrder() throws Exception {
        var storeId = RandomStringUtils.randomAlphanumeric(30);
        var playerId = RandomStringUtils.randomAlphanumeric(30);
        var subTotal = BigDecimal.valueOf(RandomUtils.nextDouble(0, 100));
        var address = generateAddress();
        var providerId = PaymentProviderId.BRAINTREE;
        var listingId = RandomStringUtils.randomAlphanumeric(30);

        orderClient.createSecondaryOrder(storeId, playerId, subTotal, address, providerId, listingId);

        orderServer.verifyCalls("CreateOrder", 1);
        assertNotNull(orderExecutor.getOrderId());
        assertEquals(OrderState.CREATED, orderExecutor.getOrderStatus());

        var orderId = orderExecutor.getOrderId();
        ConcurrentFinisher.start(orderId);

        orderServer.getOrderStream().sendStatus(environmentId, orderId, OrderState.PENDING);

        ConcurrentFinisher.wait(orderId);

        orderServer.verifyCalls("OrderStatusStream", 1);
        orderServer.verifyCalls("OrderStatusConfirmation", 1);

        assertEquals(orderId, orderExecutor.getOrderId());
        assertEquals(OrderState.PENDING, orderExecutor.getOrderStatus());

        var order = orderClient.getOrder(orderId);

        assertTrue(order.isPresent());
        assertEquals(orderId, order.get().getOrderId());
        assertEquals(OrderState.PENDING, order.get().getOrderStatus());
        assertTrue(order.get().isSecondarySale());
        assertFalse(order.get().isPrimarySale());

        orderServer.verifyCalls("GetOrder", 1);
    }

    @Test
    void finalizeBraintreeOrder() throws Exception {
        var orderId = orders.keySet().iterator().next();
        var clientToken = RandomStringUtils.randomAlphanumeric(30);
        var paymentNonce = RandomStringUtils.randomAlphanumeric(30);

        orderExecutor.setOrderId(orders.get(orderId).getOrderId());
        orderExecutor.setOrderStatus(orders.get(orderId).getOrderStatus());

        orderClient.finalizeBraintreeOrder(orderId, clientToken, paymentNonce);

        assertEquals(orderId, orderExecutor.getOrderId());
        assertEquals(OrderState.PENDING, orderExecutor.getOrderStatus());

        orderServer.verifyCalls("FinalizeOrder", 1);

        ConcurrentFinisher.start(orderId);

        orderServer.getOrderStream().sendStatus(environmentId, orderId, OrderState.COMPLETE);

        ConcurrentFinisher.wait(orderId);

        assertEquals(orderId, orderExecutor.getOrderId());
        assertEquals(OrderState.COMPLETE, orderExecutor.getOrderStatus());

        orderServer.verifyCalls("OrderStatusStream", 1);
        orderServer.verifyCalls("OrderStatusConfirmation", 1);
    }

    @Test
    void finalizeBitpayOrder() throws Exception {
        var orderId = orders.keySet().iterator().next();
        var invoiceId = RandomStringUtils.randomAlphanumeric(30);

        orderExecutor.setOrderId(orders.get(orderId).getOrderId());
        orderExecutor.setOrderStatus(orders.get(orderId).getOrderStatus());

        orderClient.finalizeBitpayOrder(orderId, invoiceId);

        assertEquals(orderId, orderExecutor.getOrderId());
        assertEquals(OrderState.PENDING, orderExecutor.getOrderStatus());

        orderServer.verifyCalls("FinalizeOrder", 1);

        ConcurrentFinisher.start(orderId);

        orderServer.getOrderStream().sendStatus(environmentId, orderId, OrderState.COMPLETE);

        ConcurrentFinisher.wait(orderId);

        assertEquals(orderId, orderExecutor.getOrderId());
        assertEquals(OrderState.COMPLETE, orderExecutor.getOrderStatus());

        orderServer.verifyCalls("OrderStatusStream", 1);
        orderServer.verifyCalls("OrderStatusConfirmation", 1);
    }

    @Test
    void finalizeOrderNotFound() {
        var orderId = RandomStringUtils.randomAlphanumeric(30);
        var clientToken = RandomStringUtils.randomAlphanumeric(30);
        var paymentNonce = RandomStringUtils.randomAlphanumeric(30);

        try {
            orderClient.finalizeBraintreeOrder(orderId, clientToken, paymentNonce);
            fail("Didn't return an expected IVIException!");
        } catch (IVIException e) {
            assertEquals(IVIErrorCode.NOT_FOUND, e.getCode());
        }
    }

    void verifyOrder(IVIOrder expectedOrder, IVIOrder actualOrder) {
        assertEquals(expectedOrder.getOrderId(), actualOrder.getOrderId());
        assertEquals(expectedOrder.getStoreId(), actualOrder.getStoreId());
        assertEquals(expectedOrder.getPlayerId(), actualOrder.getPlayerId());
        assertEquals(expectedOrder.getTax(), actualOrder.getTax());
        assertEquals(expectedOrder.getTotal(), actualOrder.getTotal());
        assertEquals(expectedOrder.getPaymentProviderId(), actualOrder.getPaymentProviderId());
        assertEquals(expectedOrder.getOrderStatus(), actualOrder.getOrderStatus());
        verifyAddress(expectedOrder.getAddress(), actualOrder.getAddress());

        if(expectedOrder.isPrimarySale()) {
            if(!actualOrder.isPrimarySale()) {
                fail("Actual order is missing purchased items!");
            }

            for(var iviPurchaseItem : expectedOrder.getPurchasedItems()) {
                var purchaseItem = actualOrder.getPurchasedItems().stream()
                        .filter(i -> i.getGameInventoryId().equals(iviPurchaseItem.getGameInventoryId()))
                        .collect(Collectors.toList());
                if(purchaseItem.isEmpty()) {
                    fail("Matching purchase item wasn't found!");
                }

                verifyPurchaseItem(iviPurchaseItem, purchaseItem.get(0));
            }
        } else {
            if(!actualOrder.isSecondarySale()) {
                fail("Actual order is missing listing id!");
            }

            assertEquals(expectedOrder.getListingId(), actualOrder.getListingId());
        }
    }

    void verifyAddress(IVIOrderAddress expectedAddress, IVIOrderAddress actualAddress) {
        assertEquals(expectedAddress.getFirstName(), actualAddress.getFirstName());
        assertEquals(expectedAddress.getLastName(), actualAddress.getLastName());
        assertEquals(expectedAddress.getAddressLine1(), actualAddress.getAddressLine1());
        assertEquals(expectedAddress.getAddressLine2(), actualAddress.getAddressLine2());
        assertEquals(expectedAddress.getCity(), actualAddress.getCity());
        assertEquals(expectedAddress.getState(), actualAddress.getState());
        assertEquals(expectedAddress.getCountryName(), actualAddress.getCountryName());
        assertEquals(expectedAddress.getPostalCode(), actualAddress.getPostalCode());
        assertEquals(expectedAddress.getCountryIsoAlpha2(), actualAddress.getCountryIsoAlpha2());
    }

    void verifyPurchaseItem(IVIPurchasedItem expectedItem, IVIPurchasedItem actualItem) {
        assertEquals(expectedItem.getGameInventoryId(), actualItem.getGameInventoryId());
        assertEquals(expectedItem.getItemName(), actualItem.getItemName());
        assertEquals(expectedItem.getItemTypeId(), actualItem.getItemTypeId());
        assertEquals(expectedItem.getAmountPaid(), actualItem.getAmountPaid());
        assertEquals(expectedItem.getCurrency(), actualItem.getCurrency());
        assertEquals(expectedItem.getDescription(), actualItem.getDescription());
        assertEquals(expectedItem.getImageSmallUrl(), actualItem.getImageSmallUrl());
        assertEquals(expectedItem.getImageLargeUrl(), actualItem.getImageLargeUrl());
        assertEquals(expectedItem.getRender(), actualItem.getRender());
    }
}
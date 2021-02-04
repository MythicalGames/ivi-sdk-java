package games.mythical.ivi.sdk.server.order;

import games.mythical.ivi.sdk.client.model.IVIOrder;
import games.mythical.ivi.sdk.client.model.IVIPurchasedItem;
import games.mythical.ivi.sdk.proto.api.order.*;
import games.mythical.ivi.sdk.proto.common.order.OrderState;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.fail;

@Slf4j
public class MockOrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {
    private final Map<String, Order> orders = new ConcurrentHashMap<>();

    @Override
    public void createOrder(CreateOrderRequest request, StreamObserver<CreateOrderAsyncResponse> responseObserver) {
        var tax = BigDecimal.valueOf(RandomUtils.nextDouble(0, 10));
        var total = new BigDecimal(request.getSubTotal()).add(tax);
        var orderBuilder = Order.newBuilder()
                .setOrderId(RandomStringUtils.randomAlphanumeric(30))
                .setStoreId(request.getStoreId())
                .setBuyerPlayerId(request.getBuyerPlayerId())
                .setTax(String.valueOf(tax))
                .setTotal(String.valueOf(total))
                .setAddress(request.getAddress())
                .setPaymentProviderId(request.getPaymentProviderId())
                .setOrderStatus(OrderState.CREATED);

        switch (request.getLineItemsCase()) {
            case PURCHASED_ITEMS:
                orderBuilder.setPurchasedItems(request.getPurchasedItems());
                break;
            case LISTING_ID:
                orderBuilder.setListingId(request.getListingId());
                break;
            case LINEITEMS_NOT_SET:
                log.error("Order doesn't have any line items!");
                responseObserver.onError(Status.INVALID_ARGUMENT.asException());
                return;
        }

        var order = orderBuilder.build();
        orders.put(order.getOrderId(), order);

        var response = CreateOrderAsyncResponse.newBuilder()
                .setOrderId(order.getOrderId())
                .setOrderStatus(OrderState.CREATED)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getOrder(GetOrderRequest request, StreamObserver<Order> responseObserver) {
        if(orders.containsKey(request.getOrderId())) {
            responseObserver.onNext(orders.get(request.getOrderId()));
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(Status.NOT_FOUND.asException());
        }
    }

    @Override
    public void finalizeOrder(FinalizeOrderRequest request, StreamObserver<FinalizeOrderAsyncResponse> responseObserver) {
        if(!orders.containsKey(request.getOrderId())) {
            responseObserver.onError(Status.NOT_FOUND.asException());
            return;
        }

        var newOrderBuilder = orders.get(request.getOrderId()).toBuilder();
        newOrderBuilder.setOrderStatus(OrderState.PENDING);
        var order = newOrderBuilder.build();
        orders.put(order.getOrderId(), order);

        var response = FinalizeOrderAsyncResponse.newBuilder()
                .setOrderStatus(order.getOrderStatus())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void setOrders(Collection<IVIOrder> orders) {
        for(var order : orders) {
            this.orders.putIfAbsent(order.getOrderId(), toProto(order));
        }
    }

    public void updateOrder(String orderId, OrderState orderState) {
        if(orders.containsKey(orderId)) {
            var newOrderBuilder = orders.get(orderId).toBuilder();
            newOrderBuilder.setOrderStatus(orderState);
            orders.put(orderId, newOrderBuilder.build());
        }
    }

    public void reset() {
        orders.clear();
    }

    private Order toProto(IVIOrder iviOrder) {
        var orderBuilder = Order.newBuilder()
                .setOrderId(iviOrder.getOrderId())
                .setStoreId(iviOrder.getStoreId())
                .setBuyerPlayerId(iviOrder.getBuyerPlayerId())
                .setTax(String.valueOf(iviOrder.getTax()))
                .setTotal(String.valueOf(iviOrder.getTotal()))
                .setAddress(iviOrder.getAddress().toProto())
                .setPaymentProviderId(iviOrder.getPaymentProviderId())
                .setOrderStatus(iviOrder.getOrderStatus());

        if(iviOrder.isPrimarySale()) {
            var purchasedItems = iviOrder.getPurchasedItems().stream()
                    .map(IVIPurchasedItem::toProto)
                    .collect(Collectors.toList());
            orderBuilder.setPurchasedItems(PurchasedItems.newBuilder()
                    .addAllPurchasedItems(purchasedItems)
                    .build());
        } else if (iviOrder.isSecondarySale()) {
            orderBuilder.setListingId(iviOrder.getListingId());
        } else {
            fail("Invalid order passed in!");
        }

        return orderBuilder.build();
    }
}

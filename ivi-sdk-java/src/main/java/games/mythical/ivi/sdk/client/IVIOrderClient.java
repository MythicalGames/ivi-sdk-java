package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.executor.IVIOrderExecutor;
import games.mythical.ivi.sdk.client.model.IVIOrder;
import games.mythical.ivi.sdk.client.model.IVIOrderAddress;
import games.mythical.ivi.sdk.client.model.IVIPurchasedItem;
import games.mythical.ivi.sdk.client.observer.IVIOrderObserver;
import games.mythical.ivi.sdk.exception.IVIErrorCode;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.order.*;
import games.mythical.ivi.sdk.proto.streams.Subscribe;
import games.mythical.ivi.sdk.proto.streams.order.OrderStreamGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class IVIOrderClient extends AbstractIVIClient {
    private OrderServiceGrpc.OrderServiceBlockingStub serviceBlockingStub;
    private final IVIOrderExecutor orderExecutor;

    @SuppressWarnings("unused")
    public IVIOrderClient(IVIOrderExecutor orderExecutor) throws IVIException {
        super();

        this.orderExecutor = orderExecutor;
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .build();
        initStub();
    }

    IVIOrderClient(IVIOrderExecutor orderExecutor, ManagedChannel channel) throws IVIException {
        this.orderExecutor = orderExecutor;
        this.channel = channel;
        initStub();
    }

    @Override
    void initStub() {
        serviceBlockingStub = OrderServiceGrpc.newBlockingStub(channel);
        subscribeToStream(new IVIOrderObserver(orderExecutor, OrderStreamGrpc.newBlockingStub(channel), this::subscribeToStream));
    }

    void subscribeToStream(IVIOrderObserver observer) {
        // set up server stream
        var streamStub = OrderStreamGrpc.newStub(channel);
        var subscribe = Subscribe.newBuilder()
                .setEnvironmentId(environmentId)
                .build();
        streamStub.orderStatusStream(subscribe, observer);
    }

    public Optional<IVIOrder> getOrder(String orderId) throws IVIException {
        var request = GetOrderRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setOrderId(orderId)
                .build();

        try {
            var order = serviceBlockingStub.getOrder(request);
            return Optional.of(IVIOrder.fromProto(order));
        } catch (StatusRuntimeException e) {
            if (e.getStatus() == Status.NOT_FOUND) {
                return Optional.empty();
            }

            throw IVIException.fromGrpcException(e);
        }
    }

    public void createPrimaryOrder(String storeId,
                            String buyerPlayerId,
                            BigDecimal subTotal,
                            IVIOrderAddress address,
                            PaymentProviderId paymentProviderId,
                            Collection<IVIPurchasedItem> purchasedItems) throws IVIException {
        var request = CreateOrderRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setStoreId(storeId)
                .setBuyerPlayerId(buyerPlayerId)
                .setSubTotal(subTotal.toString())
                .setAddress(address.toProto())
                .setPaymentProviderId(paymentProviderId)
                .setPurchasedItems(PurchasedItems.newBuilder()
                                .addAllPurchasedItems(purchasedItems.stream().map(IVIPurchasedItem::toProto).collect(Collectors.toList()))
                                .build())
                .build();

        createOrder(request);
    }

    public void createSecondaryOrder(String storeId,
                                   String buyerPlayerId,
                                   BigDecimal subTotal,
                                   IVIOrderAddress address,
                                   PaymentProviderId paymentProviderId,
                                   String listingId) throws IVIException {
        var request = CreateOrderRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setStoreId(storeId)
                .setBuyerPlayerId(buyerPlayerId)
                .setSubTotal(subTotal.toString())
                .setAddress(address.toProto())
                .setPaymentProviderId(paymentProviderId)
                .setListingId(listingId)
                .build();

        createOrder(request);
    }

    private void createOrder(CreateOrderRequest request) throws IVIException {
        try {
            var result = serviceBlockingStub.createOrder(request);
            orderExecutor.updateOrder(result.getOrderId(), result.getOrderStatus());
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        } catch (Exception e) {
            log.error("Exception calling updateOrder on createOrder, order will be in an invalid state!", e);
            throw new IVIException(IVIErrorCode.LOCAL_EXCEPTION);
        }
    }

    public void finalizeBraintreeOrder(String orderId, String clientToken, String paymentNonce) throws IVIException {
        var paymentData = PaymentProviderProto.newBuilder()
                .setBraintree(BraintreeProto.newBuilder()
                        .setBraintreeClientToken(clientToken)
                        .setBraintreePaymentNonce(paymentNonce)
                        .build())
                .build();

        finalizeOrder(orderId, paymentData);
    }

    public void finalizeBitpayOrder(String orderId, String invoiceId) throws IVIException {
        var paymentData = PaymentProviderProto.newBuilder()
                .setBitpay(BitPayProto.newBuilder()
                        .setInvoiceId(invoiceId)
                        .build())
                .build();

        finalizeOrder(orderId, paymentData);
    }

    private void finalizeOrder(String orderId, PaymentProviderProto paymentData) throws IVIException {
        var request = FinalizeOrderRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setOrderId(orderId)
                .setPaymentProviderData(paymentData)
                .build();

        try {
            var result = serviceBlockingStub.finalizeOrder(request);
            orderExecutor.updateOrder(orderId, result.getOrderStatus());
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        } catch (Exception e) {
            log.error("Exception calling updateOrder on createOrder, order will be in an invalid state!", e);
            throw new IVIException(IVIErrorCode.LOCAL_EXCEPTION);
        }
    }
}
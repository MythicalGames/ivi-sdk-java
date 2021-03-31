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
import games.mythical.ivi.sdk.util.ConversionUtils;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Slf4j
public class IVIOrderClient extends AbstractIVIClient {
    private OrderServiceGrpc.OrderServiceBlockingStub serviceBlockingStub;
    private final IVIOrderExecutor orderExecutor;

    @SuppressWarnings("unused")
    public IVIOrderClient(IVIOrderExecutor orderExecutor) throws IVIException {
        super();

        this.orderExecutor = orderExecutor;
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .keepAliveTime(keepAlive, TimeUnit.SECONDS)
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
        serviceBlockingStub = OrderServiceGrpc.newBlockingStub(channel).withCallCredentials(addAuthentication());
        var streamBlockingStub = OrderStreamGrpc.newBlockingStub(channel)
                .withCallCredentials(addAuthentication());
        subscribeToStream(new IVIOrderObserver(orderExecutor, streamBlockingStub, this::subscribeToStream));
    }

    void subscribeToStream(IVIOrderObserver observer) {
        // set up server stream
        var streamStub = OrderStreamGrpc.newStub(channel).withCallCredentials(addAuthentication());
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
                                   Collection<IVIPurchasedItem> purchasedItems,
                                   Map<String, Object> metadata) throws IVIException {
        var purchaseItemProtos = new ArrayList<IssuedItem>();
        for(var purchasedItem : purchasedItems ) {
            purchaseItemProtos.add(purchasedItem.toProto());
        }

        var builder= CreateOrderRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setStoreId(storeId)
                .setBuyerPlayerId(buyerPlayerId)
                .setSubTotal(subTotal.toString())
                .setAddress(address.toProto())
                .setPaymentProviderId(paymentProviderId)
                .setPurchasedItems(IssuedItems.newBuilder()
                        .addAllPurchasedItems(purchaseItemProtos)
                        .build());

        if (metadata != null) {
            builder.setMetadata(ConversionUtils.convertProperties(metadata));
        }

        // TODO: IVI has these two as param, would this be too much for user to send?
//        if (StringUtils.isNotBlank(createdBy)) {
//            builder.setCreatedBy(createdBy);
//        }
//
//        if (StringUtils.isNotBlank(requestIp)) {
//            builder.setRequestIp(requestIp);
//        }

        createOrder(builder.build());
    }

    public void createSecondaryOrder(String storeId,
                                     String buyerPlayerId,
                                     BigDecimal subTotal,
                                     IVIOrderAddress address,
                                     PaymentProviderId paymentProviderId,
                                     String listingId,
                                     Map<String, Object> metadata) throws IVIException {
        var builder= CreateOrderRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setStoreId(storeId)
                .setBuyerPlayerId(buyerPlayerId)
                .setSubTotal(subTotal.toString())
                .setAddress(address.toProto())
                .setPaymentProviderId(paymentProviderId)
                .setListingId(listingId);

        if (metadata != null) {
            builder.setMetadata(ConversionUtils.convertProperties(metadata));
        }

        createOrder(builder.build());
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

    public void finalizeBraintreeOrder(String orderId,
                                       String clientToken,
                                       String paymentNonce,
                                       String fraudSessionId) throws IVIException {
        var paymentData = PaymentProviderProto.newBuilder()
                .setBraintree(BraintreeProto.newBuilder()
                        .setBraintreeClientToken(clientToken)
                        .setBraintreePaymentNonce(paymentNonce)
                        .build())
                .build();

        finalizeOrder(orderId, paymentData, fraudSessionId);
    }

    public void finalizeBitpayOrder(String orderId,
                                    String invoiceId,
                                    String fraudSessionId) throws IVIException {
        var paymentData = PaymentProviderProto.newBuilder()
                .setBitpay(BitPayProto.newBuilder()
                        .setInvoiceId(invoiceId)
                        .build())
                .build();

        finalizeOrder(orderId, paymentData, fraudSessionId);
    }

    private void finalizeOrder(String orderId, PaymentProviderProto paymentData, String fraudSessionId) throws IVIException {
        var builder = FinalizeOrderRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setOrderId(orderId)
                .setPaymentProviderData(paymentData);

        if (StringUtils.isNotBlank(fraudSessionId)) {
            builder.setFraudSessionId(fraudSessionId);
        }

        var request = builder.build();
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
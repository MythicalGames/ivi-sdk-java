package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.model.*;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.order.PaymentProviderId;
import games.mythical.ivi.sdk.proto.api.payment.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Slf4j
public class IVIPaymentClient extends AbstractIVIClient {
    private PaymentServiceGrpc.PaymentServiceBlockingStub serviceBlockingStub;

    @SuppressWarnings("unused")
    public IVIPaymentClient() throws IVIException {
        super();

        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .build();
        initStub();
    }

    IVIPaymentClient(ManagedChannel channel) throws IVIException {
        this.channel = channel;
        initStub();
    }

    @Override
    void initStub() {
        serviceBlockingStub = PaymentServiceGrpc.newBlockingStub(channel).withCallCredentials(addAuthentication());
    }

    @Deprecated(since = "2.2.0", forRemoval = true)
    public IVIToken getToken(PaymentProviderId providerId, String playerId) throws IVIException {
        return getToken(providerId, playerId, "");
    }

    public IVIToken getToken(PaymentProviderId providerId, String playerId, String origin) throws IVIException {
        var builder = CreateTokenRequest.newBuilder()
                .setEnvironmentId(environmentId);

        if (PaymentProviderId.BRAINTREE.equals(providerId)) {
            builder.setBraintree(BraintreeTokenRequest.newBuilder()
                    .setPlayerId(playerId)
                    .build());
        }

        if(PaymentProviderId.CYBERSOURCE.equals(providerId)) {
            builder.setCybersource(CybersourceTokenRequest.newBuilder()
                    .setOrigin(StringUtils.defaultString(origin, ""))
                    .build());
        }

        if (PaymentProviderId.GR4VY.equals(providerId)) {
            builder.setGr4Vy(Gr4vyTokenRequest.newBuilder()
                    .setCurrency("USD")
                    .setAmount("0")
                    .setPlayerId(playerId)
                    .build());
        }

        try {
            var order = serviceBlockingStub.generateClientToken(builder.build());
            return IVIToken.fromProto(order);
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }

    public IVIPaymentMethod createCybersourcePaymentMethod(
            String playerId,
            String cardType,
            String expirationMonth,
            String expirationYear,
            String instrumentId,
            IVIOrderAddress address
    ) throws IVIException {
        var request = CreatePaymentMethodRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setPlayerId(playerId)
                .setCardPaymentData(CardPaymentData.newBuilder()
                        .setCybersource(CybersourcePaymentData.newBuilder()
                                .setCardType(cardType)
                                .setExpirationMonth(expirationMonth)
                                .setExpirationYear(expirationYear)
                                .setInstrumentId(instrumentId)
                                .build())
                        .build())
                .setAddress(address.toProto())
                .build();

        try {
            var paymentMethod = serviceBlockingStub.createPaymentMethod(request);
            return IVIPaymentMethod.fromProto(paymentMethod);
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }

    public List<IVIPaymentMethod> getPaymentMethods(
        String playerId,
        String token,
        PaymentProviderId paymentProviderId
    ) throws IVIException {
        var request = GetPaymentMethodRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setPlayerId(playerId)
                .setToken(token)
                .setPaymentProviderId(paymentProviderId)
                .build();
        try {
            var methods = serviceBlockingStub.getPaymentMethods(request);
            return IVIPaymentMethod.fromProtos(methods);
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }

    public IVIPaymentMethod updateCybersourcePaymentMethod(
            String playerId,
            String cardType,
            String token,
            String expirationMonth,
            String expirationYear,
            String instrumentId,
            IVIOrderAddress address
    ) throws IVIException {
        var request = UpdatePaymentMethodRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setPlayerId(playerId)
                .setToken(token)
                .setCardPaymentData(CardPaymentData.newBuilder()
                        .setCybersource(CybersourcePaymentData.newBuilder()
                                .setCardType(cardType)
                                .setExpirationMonth(expirationMonth)
                                .setExpirationYear(expirationYear)
                                .setInstrumentId(instrumentId)
                                .build())
                        .build())
                .setAddress(address.toProto())
                .build();

        try {
            var paymentMethod = serviceBlockingStub.updatePaymentMethod(request);
            return IVIPaymentMethod.fromProto(paymentMethod);
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }

    public void deletePaymentMethod(String playerId, String token, PaymentProviderId paymentProviderId) throws IVIException {
        var request = DeletePaymentMethodRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setPlayerId(playerId)
                .setToken(token)
                .setPaymentProviderId(paymentProviderId)
                .build();

        try {
            serviceBlockingStub.deletePaymentMethod(request);
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }

    public IVICustomer getCustomer(String playerId, PaymentProviderId paymentProviderId) throws IVIException {
        try {
            var providerId = PaymentProviderId.valueOf(paymentProviderId.name());
            var request = GetCustomerRequest.newBuilder()
                    .setPlayerId(playerId)
                    .setProvider(providerId)
                    .setEnvironmentId(environmentId)
                    .build();
            var customer = serviceBlockingStub.getCustomer(request);
            return IVICustomer.fromProto(customer);
        } catch (StatusRuntimeException e){
            throw IVIException.fromGrpcException(e);
        }
    }

    public IVICustomer updateCustomer(IVICustomerUpdateRequest customer, PaymentProviderId paymentProviderId) throws IVIException {
        try {
            var providerId = PaymentProviderId.valueOf(paymentProviderId.name());
            var request = UpdateCustomerRequest.newBuilder()
                    .setPlayerId(customer.getPlayerId())
                    .setProvider(providerId)
                    .setEnvironmentId(environmentId)
                    .setAddress(customer.getAddress())
                    .build();
            var response = serviceBlockingStub.updateCustomer(request);
            return IVICustomer.fromProto(response);
        } catch (StatusRuntimeException e){
            throw IVIException.fromGrpcException(e);
        }
    }

    public IVICustomer createCustomer(IVICustomerCreateRequest customer) throws IVIException {
        try {
            customer.setEnvironmentId(environmentId);
            var request = IVICustomerCreateRequest.toProto(customer);
            var response = serviceBlockingStub.createCustomer(request);
            return IVICustomer.fromProto(response);
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }

    public IVICheckoutSession createCheckoutSession(IVICreateCheckoutSessionRequest sessionRequest) throws IVIException {
        try {
            var request = IVICreateCheckoutSessionRequest.toProto(environmentId, sessionRequest);
            var response = serviceBlockingStub.createCheckoutSession(request);
            return IVICheckoutSession.fromProto(response);

        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }
}

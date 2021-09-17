package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.model.IVIOrderAddress;
import games.mythical.ivi.sdk.client.model.IVIPaymentMethod;
import games.mythical.ivi.sdk.client.model.IVIToken;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.order.PaymentProviderId;
import games.mythical.ivi.sdk.proto.api.payment.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

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
}

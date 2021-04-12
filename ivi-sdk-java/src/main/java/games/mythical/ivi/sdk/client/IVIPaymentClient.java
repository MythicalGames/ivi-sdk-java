package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.model.IVIToken;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.order.PaymentProviderId;
import games.mythical.ivi.sdk.proto.api.payment.BraintreeTokenRequest;
import games.mythical.ivi.sdk.proto.api.payment.CreateTokenRequest;
import games.mythical.ivi.sdk.proto.api.payment.PaymentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class IVIPaymentClient extends AbstractIVIClient {
    private PaymentServiceGrpc.PaymentServiceBlockingStub serviceBlockingStub;

    @SuppressWarnings("unused")
    public IVIPaymentClient() throws IVIException {
        super();

        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .keepAliveTime(keepAlive, TimeUnit.SECONDS)
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

    public IVIToken getToken(PaymentProviderId providerId, String customerId) throws IVIException {
        var builder = CreateTokenRequest.newBuilder()
                .setEnvironmentId(environmentId);

        if (PaymentProviderId.BRAINTREE.equals(providerId)) {
            builder.setBraintree(BraintreeTokenRequest.newBuilder()
                    .setCustomerId(customerId)
                    .build());
        }

        try {
            var order = serviceBlockingStub.generateClientToken(builder.build());
            return IVIToken.fromProto(order);
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }
}

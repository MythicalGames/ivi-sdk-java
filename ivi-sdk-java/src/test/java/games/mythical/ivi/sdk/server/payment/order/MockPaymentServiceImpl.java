package games.mythical.ivi.sdk.server.payment.order;

import games.mythical.ivi.sdk.client.model.IVIToken;
import games.mythical.ivi.sdk.proto.api.payment.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class MockPaymentServiceImpl extends PaymentServiceGrpc.PaymentServiceImplBase {
    private final Map<String, Token> tokens = new ConcurrentHashMap<>();
    private final String BRAINTREE = "BRAINTREE";

    @Override
    public void generateClientToken(CreateTokenRequest request, StreamObserver<Token> responseObserver) {
        List<String> keys = new ArrayList<>(tokens.keySet());
        var randomKey = keys.get(new Random().nextInt(keys.size()));
        var token = tokens.get(randomKey);
        var responseBuilder = Token.newBuilder();

        if(request.hasBraintree()) {
            responseBuilder.setBraintree(BraintreeToken.newBuilder()
                    .setToken(token.getBraintree().getToken())
                    .build());
        } else if (request.hasCybersource()) {
            responseBuilder.setCybersource(CybersourceToken.newBuilder()
                    .setJwk(CybersourceJWK.newBuilder()
                            .setKty(RandomStringUtils.randomAlphanumeric(10))
                            .setE(RandomStringUtils.randomAlphanumeric(10))
                            .setUse(RandomStringUtils.randomAlphanumeric(10))
                            .setN(RandomStringUtils.randomAlphanumeric(10))
                            .setKid(RandomStringUtils.randomAlphanumeric(10))
                            .build())
                    .build());
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    public void setTokens(Collection<IVIToken> tokens) {
        var randomHash = RandomStringUtils.randomAlphanumeric(10);
        for(var token : tokens) {
            this.tokens.putIfAbsent(BRAINTREE + "_" + randomHash, toProto(token));
        }
    }

    public void reset() {
        tokens.clear();
    }


    private Token toProto(IVIToken token) {
        var builder = Token.newBuilder();
        if (StringUtils.isNotBlank(token.getBraintreeToken())) {
            builder.setBraintree(BraintreeToken.newBuilder()
                    .setToken(token.getBraintreeToken())
                    .build());
        }

        return builder.build();
    }

}

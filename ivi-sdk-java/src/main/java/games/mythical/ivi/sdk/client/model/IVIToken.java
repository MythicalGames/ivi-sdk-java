package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.payment.Token;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Builder
public class IVIToken {
    private final String braintreeToken;
    private final IVICybersourceJWK cybersourceJWK;

    public static IVIToken fromProto(Token response) throws IVIException {
        var builder = IVIToken.builder();

        if (response.hasBraintree()) {
            builder.braintreeToken(response.getBraintree().getToken());
        }

        if(response.hasCybersource()) {
            builder.cybersourceJWK(IVICybersourceJWK.builder()
                    .kty(response.getCybersource().getJwk().getKty())
                    .e(response.getCybersource().getJwk().getE())
                    .use(response.getCybersource().getJwk().getUse())
                    .n(response.getCybersource().getJwk().getN())
                    .kid(response.getCybersource().getJwk().getN())
                    .build());
        }

        return builder.build();
    }
}

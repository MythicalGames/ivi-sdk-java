package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.order.PaymentProviderId;
import games.mythical.ivi.sdk.proto.api.payment.CreateCheckoutSessionRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Builder
public class IVICreateCheckoutSessionRequest {
    private final String playerId;
    private PaymentProviderId providerId;

    public static CreateCheckoutSessionRequest toProto(String environmentId, IVICreateCheckoutSessionRequest request) {
        return CreateCheckoutSessionRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setPlayerId(request.playerId)
                .setProvider(PaymentProviderId.valueOf(request.providerId.toString()))
                .build();
    }
}

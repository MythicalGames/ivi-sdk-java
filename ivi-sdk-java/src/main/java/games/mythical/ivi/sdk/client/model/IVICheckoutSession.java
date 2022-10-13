package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.payment.GetCheckoutSessionResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;

@Slf4j
@Getter
@Builder
public class IVICheckoutSession {
    private final String type;
    private final String id;
    private Instant expiresAt;

    public static IVICheckoutSession fromProto(GetCheckoutSessionResponse proto) {
        return IVICheckoutSession.builder()
                .id(proto.getId())
                .type(proto.getType())
                .expiresAt(Instant.ofEpochSecond(proto.getExpiresAt().getSeconds(), proto.getExpiresAt().getNanos()))
                .build();
    }
}

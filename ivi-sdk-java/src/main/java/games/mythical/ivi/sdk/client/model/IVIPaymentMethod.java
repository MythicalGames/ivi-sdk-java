package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.payment.CreatePaymentResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IVIPaymentMethod {
    private String cardType;
    private String token;
    private String maskedNumber;
    private String expirationMonth;
    private String expirationYear;
    private String lastFour;
    private boolean defaultOption;

    public static IVIPaymentMethod fromProto(CreatePaymentResponse proto) {
        return IVIPaymentMethod.builder()
                .cardType(proto.getCardType())
                .token(proto.getToken())
                .maskedNumber(proto.getMaskedNumber())
                .expirationMonth(proto.getExpirationMonth())
                .expirationYear(proto.getExpirationYear())
                .lastFour(proto.getLastFour())
                .defaultOption(proto.getDefaultOption())
                .build();
    }
}

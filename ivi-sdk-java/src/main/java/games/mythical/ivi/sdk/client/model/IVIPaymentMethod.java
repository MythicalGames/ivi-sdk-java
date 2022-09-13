package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.payment.GetPaymentMethodResponse;
import games.mythical.ivi.sdk.proto.api.payment.PaymentMethodResponse;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

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
    private IVIOrderAddress address;
    private String scheme;

    public static IVIPaymentMethod fromProto(PaymentMethodResponse proto) {
        return IVIPaymentMethod.builder()
                .cardType(proto.getCardType())
                .token(proto.getToken())
                .maskedNumber(proto.getMaskedNumber())
                .expirationMonth(proto.getExpirationMonth())
                .expirationYear(proto.getExpirationYear())
                .lastFour(proto.getLastFour())
                .defaultOption(proto.getDefaultOption())
                .address(IVIOrderAddress.fromProto(proto.getAddress()))
                .scheme(proto.getScheme())
                .build();
    }

    public static List<IVIPaymentMethod> fromProtos(GetPaymentMethodResponse proto) {
        return proto.getPaymentMethodsList().stream()
                .map(IVIPaymentMethod::fromProto)
                .collect(Collectors.toList());
    }
}

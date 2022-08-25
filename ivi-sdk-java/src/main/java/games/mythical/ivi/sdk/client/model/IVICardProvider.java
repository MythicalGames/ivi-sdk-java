package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.payment.CardPaymentData;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IVICardProvider {

    private IVIGr4vyCard gr4vyCard;
    private boolean makeDefault;

    public static CardPaymentData toProto(IVICardProvider cardProvider) {
        var proto = CardPaymentData.newBuilder().setMakeDefault(cardProvider.makeDefault);
        if (cardProvider.gr4vyCard != null) {
            proto.setGr4Vy(IVIGr4vyCard.toProto(cardProvider.gr4vyCard));
        }
        return proto.build();
    }
}

package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.payment.Gr4vyPaymentData;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
@Builder
public class IVIGr4vyCard {
    String expMonth;
    String expYear;
    String cardType;
    String instrumentId;
    String securityCode;

    public static Gr4vyPaymentData toProto(IVIGr4vyCard card) {
        var proto = Gr4vyPaymentData.newBuilder();

        if (StringUtils.isNotEmpty(card.expMonth)) {
            proto.setExpMonth(card.expMonth);
        }
        if (StringUtils.isNotEmpty(card.expYear)) {
            proto.setExpYear(card.expYear);
        }
        if (StringUtils.isNotEmpty(card.cardType)) {
            proto.setCardType(card.cardType);
        }
        if (StringUtils.isNotEmpty(card.instrumentId)) {
            proto.setInstrumentId(card.instrumentId);
        }
        if (StringUtils.isNotEmpty(card.securityCode)) {
            proto.setSecurityCode(card.securityCode);
        }

        return proto.build();
    }
}

package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.wallet.UpholdCryptoCard;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class IVIUpholdCryptoCard {
    private String upholdId;
    private String currency;
    private BigDecimal balance;
    private String normalizedCurrency;
    private BigDecimal normalizedBalance;

    public static IVIUpholdCryptoCard fromProto(UpholdCryptoCard upholdCryptoCard) throws IVIException {
        return IVIUpholdCryptoCard.builder()
                .upholdId(upholdCryptoCard.getUpholdId())
                .currency(upholdCryptoCard.getCurrency())
                .balance(new BigDecimal(upholdCryptoCard.getBalance()))
                .normalizedCurrency(upholdCryptoCard.getNormalizedCurrency())
                .normalizedBalance(new BigDecimal(upholdCryptoCard.getNormalizedBalance()))
                .build();
    }

    public static List<IVIUpholdCryptoCard> fromProto(List<UpholdCryptoCard> upholdCryptoCards) throws IVIException {
        var result = new ArrayList<IVIUpholdCryptoCard>();
        for (var upholdCryptoCard : upholdCryptoCards) {
            result.add(IVIUpholdCryptoCard.fromProto(upholdCryptoCard));
        }
        return result;
    }
}

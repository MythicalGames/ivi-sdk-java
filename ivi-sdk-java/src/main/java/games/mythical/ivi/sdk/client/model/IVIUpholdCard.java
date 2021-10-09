package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.wallet.UpholdCard;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class IVIUpholdCard {
    private String upholdId;
    private String currency;
    private BigDecimal balance;
    private String normalizedCurrency;
    private BigDecimal normalizedBalance;

    public static IVIUpholdCard fromProto(UpholdCard upholdCard) {
        return IVIUpholdCard.builder()
                .upholdId(upholdCard.getUpholdId())
                .currency(upholdCard.getCurrency())
                .balance(new BigDecimal(upholdCard.getBalance()))
                .normalizedCurrency(upholdCard.getNormalizedCurrency())
                .normalizedBalance(new BigDecimal(upholdCard.getNormalizedBalance()))
                .build();
    }

    public static List<IVIUpholdCard> fromProto(List<UpholdCard> upholdCards) {
        return upholdCards.stream()
                .map(IVIUpholdCard::fromProto)
                .collect(Collectors.toList());
    }
}

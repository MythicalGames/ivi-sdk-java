package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.wallet.UpholdQuote;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class IVIUpholdQuote {
    private String quoteId;
    private BigDecimal requestedAmount;
    private String requestedCurrency;
    private BigDecimal quotedAmount;
    private String quotedCurrency;
    private BigDecimal normalizedQuotedAmount;
    private BigDecimal conversionFee;
    private Instant createdAt;
    private long expireInMillis;

    public static IVIUpholdQuote fromProto(UpholdQuote upholdQuote) {
        return IVIUpholdQuote.builder()
                .quoteId(upholdQuote.getQuoteId())
                .requestedAmount(new BigDecimal(upholdQuote.getRequestedAmount()))
                .requestedCurrency(upholdQuote.getRequestedCurrency())
                .quotedAmount(new BigDecimal(upholdQuote.getQuotedAmount()))
                .quotedCurrency(upholdQuote.getQuotedCurrency())
                .normalizedQuotedAmount(new BigDecimal(upholdQuote.getNormalizedQuotedAmount()))
                .conversionFee(new BigDecimal(upholdQuote.getConversionFee()))
                .createdAt(Instant.ofEpochMilli(upholdQuote.getCreatedAt()))
                .expireInMillis(upholdQuote.getExpireInMillis())
                .build();
    }
}

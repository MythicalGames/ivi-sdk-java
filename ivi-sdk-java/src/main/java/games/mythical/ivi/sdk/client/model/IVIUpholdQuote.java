package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.wallet.UpholdQuote;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

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
        var builder = IVIUpholdQuote.builder()
                .quoteId(upholdQuote.getQuoteId())
                .requestedCurrency(upholdQuote.getRequestedCurrency())
                .quotedCurrency(upholdQuote.getQuotedCurrency())
                .createdAt(Instant.ofEpochMilli(upholdQuote.getCreatedAt()))
                .expireInMillis(upholdQuote.getExpireInMillis());

        if (StringUtils.isNotBlank(upholdQuote.getRequestedAmount())) {
            builder.requestedAmount(new BigDecimal(upholdQuote.getRequestedAmount()));
        }

        if (StringUtils.isNotBlank(upholdQuote.getQuotedAmount())) {
            builder.quotedAmount(new BigDecimal(upholdQuote.getQuotedAmount()));
        }

        if (StringUtils.isNotBlank(upholdQuote.getConversionFee())) {
            builder.conversionFee(new BigDecimal(upholdQuote.getConversionFee()));
        }

        if (StringUtils.isNotBlank(upholdQuote.getNormalizedQuotedAmount())) {
            builder.normalizedQuotedAmount(new BigDecimal(upholdQuote.getNormalizedQuotedAmount()));
        }

        return builder.build();
    }
}

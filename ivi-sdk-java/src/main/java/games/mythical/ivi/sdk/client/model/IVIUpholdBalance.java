package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.wallet.Balance;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class IVIUpholdBalance {
    private BigDecimal currentBalance;
    private BigDecimal pendingBalance;

    public static IVIUpholdBalance fromProto(Balance balance) throws IVIException {
        return IVIUpholdBalance.builder()
                .currentBalance(new BigDecimal(balance.getCurrentBalance()))
                .pendingBalance(new BigDecimal(balance.getPendingBalance()))
                .build();
    }
}

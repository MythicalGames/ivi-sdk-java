package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.wallet.Wallet;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IVIWallet {
    private String accountId;
    private IVIUpholdWallet uphold;

    public static IVIWallet fromProto(Wallet wallet) throws IVIException {
        return IVIWallet.builder()
                .accountId(wallet.getAccountId())
                .uphold(IVIUpholdWallet.fromProto(wallet.getUphold()))
                .build();
    }
}

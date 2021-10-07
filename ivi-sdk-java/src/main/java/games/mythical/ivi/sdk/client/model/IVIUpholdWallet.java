package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.wallet.UpholdWallet;
import games.mythical.ivi.sdk.util.ConversionUtils;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class IVIUpholdWallet {
    private String upholdId;
    private String upholdState;
    private String upholdExternalCardId;
    private IVIUpholdBalance balance;
    private List<IVIUpholdCard> cards;
    private String email;
    private String status;
    private Map<String, Object> verifications;
    private String birthDate;
    private IVIOrderAddress address;

    public static IVIUpholdWallet fromProto(UpholdWallet upholdWallet) throws IVIException {
        return IVIUpholdWallet.builder()
                .upholdId(upholdWallet.getUpholdId())
                .upholdState(upholdWallet.getUpholdState())
                .upholdExternalCardId(upholdWallet.getUpholdExternalCardId())
                .balance(IVIUpholdBalance.fromProto(upholdWallet.getBalance()))
                .cards(IVIUpholdCard.fromProto(upholdWallet.getCardsList()))
                .email(upholdWallet.getEmail())
                .status(upholdWallet.getStatus())
                .verifications(ConversionUtils.convertProperties(upholdWallet.getVerifications()))
                .birthDate(upholdWallet.getBirthDate())
                .address(IVIOrderAddress.fromProto(upholdWallet.getAddress()))
                .build();
    }
}

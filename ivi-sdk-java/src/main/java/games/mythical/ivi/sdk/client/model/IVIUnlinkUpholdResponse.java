package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.wallet.UnlinkUpholdWalletResponse;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
@Data
@Builder
public class IVIUnlinkUpholdResponse {
    private boolean success;
    private String message;

    public static IVIUnlinkUpholdResponse fromProto(UnlinkUpholdWalletResponse proto){
        var response = IVIUnlinkUpholdResponse.builder()
                .success(proto.getSuccess());
        if(StringUtils.isNotEmpty(proto.getMessage())){
            response.message(proto.getMessage());
        }
        return response.build();
    }
}

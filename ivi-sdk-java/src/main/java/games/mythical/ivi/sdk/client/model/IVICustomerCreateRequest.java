package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.payment.CreateCustomerRequest;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
@Builder
public class IVICustomerCreateRequest {
    private String playerId;
    private String address;
    private IVICardProvider card;
    private String environmentId;

    public static CreateCustomerRequest toProto(IVICustomerCreateRequest request) {
        var proto = CreateCustomerRequest.newBuilder()
                .setPlayerId(request.playerId)
                .setEnvironmentId(request.environmentId);
        if (StringUtils.isNotEmpty(request.getAddress())) {
            proto.setAddress(request.address);
        }
        if (request.getCard() != null) {
            proto.setCard(IVICardProvider.toProto(request.card));
        }
        return proto.build();
    }
}

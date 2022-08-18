package games.mythical.ivi.sdk.client.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IVICustomerUpdateRequest {
    private String playerId;
    private String address;
    private String environmentId;
}

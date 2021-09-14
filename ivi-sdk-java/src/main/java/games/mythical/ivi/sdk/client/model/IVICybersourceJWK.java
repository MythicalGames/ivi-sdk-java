package games.mythical.ivi.sdk.client.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IVICybersourceJWK {
    private String kty;
    private String e;
    private String use;
    private String n;
    private String kid;
}

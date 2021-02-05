package games.mythical.ivi.sdk.client.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IVIItemMetadata {
    private String description;
    private String imageSmallUrl;
    private String imageLargeUrl;
    private String render;
    private String authenticityImage;
}
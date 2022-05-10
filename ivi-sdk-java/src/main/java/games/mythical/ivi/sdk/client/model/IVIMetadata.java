package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.common.Metadata;
import games.mythical.ivi.sdk.util.ConversionUtils;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

@Data
@Builder
public class IVIMetadata {
    private String name;
    private String description;
    private String image;
    private String animationUrl;
    private Map<String, Object> properties;

    public static IVIMetadata fromProto(Metadata metadata) throws IVIException {
        return IVIMetadata.builder()
                .name(metadata.getName())
                .description(metadata.getDescription())
                .image(metadata.getImage())
                .properties(ConversionUtils.convertProperties(metadata.getProperties()))
                .animationUrl(StringUtils.isNotEmpty(metadata.getAnimationUrl()) ? metadata.getAnimationUrl() : "")
                .build();



    }

    public static Metadata toProto(IVIMetadata metadata) throws IVIException {
        return Metadata.newBuilder()
                .setName(metadata.getName())
                .setDescription(metadata.getDescription())
                .setImage(metadata.getImage())
                .setProperties(ConversionUtils.convertProperties(metadata.getProperties()))
                .setAnimationUrl(StringUtils.isNotEmpty(metadata.getAnimationUrl()) ? metadata.getAnimationUrl() : "")
                .build();
    }
}
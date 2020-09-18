/*
 * IVI Engine
 * IVI Engine
 *
 * The version of the OpenAPI document: 1.0.0-SNAPSHOT
 * Contact: developer@mythical.games
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package games.mythical.ivi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UpdateProfilePictureRequest
 */
@JsonPropertyOrder({
  UpdateProfilePictureRequest.JSON_PROPERTY_IMAGE_BASE64,
  UpdateProfilePictureRequest.JSON_PROPERTY_EXTENSION
})
@JsonTypeName("UpdateProfilePictureRequest")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateProfilePictureRequest {
  public static final String JSON_PROPERTY_IMAGE_BASE64 = "imageBase64";
  private String imageBase64;

  public static final String JSON_PROPERTY_EXTENSION = "extension";
  private String extension;


  public UpdateProfilePictureRequest imageBase64(String imageBase64) {
    
    this.imageBase64 = imageBase64;
    return this;
  }

   /**
   * Get imageBase64
   * @return imageBase64
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_BASE64)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImageBase64() {
    return imageBase64;
  }


  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
  }


  public UpdateProfilePictureRequest extension(String extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExtension() {
    return extension;
  }


  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProfilePictureRequest updateProfilePictureRequest = (UpdateProfilePictureRequest) o;
    return Objects.equals(this.imageBase64, updateProfilePictureRequest.imageBase64) &&
        Objects.equals(this.extension, updateProfilePictureRequest.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageBase64, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProfilePictureRequest {\n");
    sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


/*
 * IVI Engine
 * IVI Engine
 *
 * The version of the OpenAPI document: unspecified
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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UpdateOrganizationRequest
 */
@JsonPropertyOrder({
  UpdateOrganizationRequest.JSON_PROPERTY_DISPLAY_NAME,
  UpdateOrganizationRequest.JSON_PROPERTY_NEW_OWNER,
  UpdateOrganizationRequest.JSON_PROPERTY_ENVIRONMENT_LIMITS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-17T21:49:06.785396-07:00[America/Los_Angeles]")
public class UpdateOrganizationRequest {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_NEW_OWNER = "newOwner";
  private String newOwner;

  public static final String JSON_PROPERTY_ENVIRONMENT_LIMITS = "environmentLimits";
  private Map<String, Integer> environmentLimits = null;


  public UpdateOrganizationRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UpdateOrganizationRequest newOwner(String newOwner) {
    
    this.newOwner = newOwner;
    return this;
  }

   /**
   * Get newOwner
   * @return newOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewOwner() {
    return newOwner;
  }


  public void setNewOwner(String newOwner) {
    this.newOwner = newOwner;
  }


  public UpdateOrganizationRequest environmentLimits(Map<String, Integer> environmentLimits) {
    
    this.environmentLimits = environmentLimits;
    return this;
  }

  public UpdateOrganizationRequest putEnvironmentLimitsItem(String key, Integer environmentLimitsItem) {
    if (this.environmentLimits == null) {
      this.environmentLimits = new HashMap<>();
    }
    this.environmentLimits.put(key, environmentLimitsItem);
    return this;
  }

   /**
   * Get environmentLimits
   * @return environmentLimits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Integer> getEnvironmentLimits() {
    return environmentLimits;
  }


  public void setEnvironmentLimits(Map<String, Integer> environmentLimits) {
    this.environmentLimits = environmentLimits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrganizationRequest updateOrganizationRequest = (UpdateOrganizationRequest) o;
    return Objects.equals(this.displayName, updateOrganizationRequest.displayName) &&
        Objects.equals(this.newOwner, updateOrganizationRequest.newOwner) &&
        Objects.equals(this.environmentLimits, updateOrganizationRequest.environmentLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, newOwner, environmentLimits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrganizationRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    newOwner: ").append(toIndentedString(newOwner)).append("\n");
    sb.append("    environmentLimits: ").append(toIndentedString(environmentLimits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


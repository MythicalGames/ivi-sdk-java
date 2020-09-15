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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CreateServerSecretRequest
 */
@JsonPropertyOrder({
  CreateServerSecretRequest.JSON_PROPERTY_ROLE_NAME,
  CreateServerSecretRequest.JSON_PROPERTY_DESCRIPTION,
  CreateServerSecretRequest.JSON_PROPERTY_DISABLED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:43:19.928192-07:00[America/Los_Angeles]")
public class CreateServerSecretRequest {
  public static final String JSON_PROPERTY_ROLE_NAME = "roleName";
  private String roleName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;


  public CreateServerSecretRequest roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @ApiModelProperty(example = "WRITE", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public CreateServerSecretRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateServerSecretRequest disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServerSecretRequest createServerSecretRequest = (CreateServerSecretRequest) o;
    return Objects.equals(this.roleName, createServerSecretRequest.roleName) &&
        Objects.equals(this.description, createServerSecretRequest.description) &&
        Objects.equals(this.disabled, createServerSecretRequest.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, description, disabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServerSecretRequest {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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


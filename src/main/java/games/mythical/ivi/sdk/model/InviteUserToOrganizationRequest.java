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
 * InviteUserToOrganizationRequest
 */
@JsonPropertyOrder({
  InviteUserToOrganizationRequest.JSON_PROPERTY_ROLE_NAME,
  InviteUserToOrganizationRequest.JSON_PROPERTY_USER_EMAIL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:53:22.361116-07:00[America/Los_Angeles]")
public class InviteUserToOrganizationRequest {
  public static final String JSON_PROPERTY_ROLE_NAME = "roleName";
  private String roleName;

  public static final String JSON_PROPERTY_USER_EMAIL = "userEmail";
  private String userEmail;


  public InviteUserToOrganizationRequest roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public InviteUserToOrganizationRequest userEmail(String userEmail) {
    
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserEmail() {
    return userEmail;
  }


  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteUserToOrganizationRequest inviteUserToOrganizationRequest = (InviteUserToOrganizationRequest) o;
    return Objects.equals(this.roleName, inviteUserToOrganizationRequest.roleName) &&
        Objects.equals(this.userEmail, inviteUserToOrganizationRequest.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, userEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteUserToOrganizationRequest {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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


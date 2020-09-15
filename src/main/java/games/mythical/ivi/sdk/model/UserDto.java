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
 * UserDto
 */
@JsonPropertyOrder({
  UserDto.JSON_PROPERTY_ORGANIZATION_ID,
  UserDto.JSON_PROPERTY_CREATED_TIMESTAMP,
  UserDto.JSON_PROPERTY_ROLE_NAME,
  UserDto.JSON_PROPERTY_USER_ID,
  UserDto.JSON_PROPERTY_EMAIL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:53:22.361116-07:00[America/Los_Angeles]")
public class UserDto {
  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organizationId";
  private String organizationId;

  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private String createdTimestamp;

  public static final String JSON_PROPERTY_ROLE_NAME = "roleName";
  private String roleName;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;


  public UserDto organizationId(String organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public UserDto createdTimestamp(String createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Get createdTimestamp
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(String createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public UserDto roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public UserDto userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public UserDto email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto userDto = (UserDto) o;
    return Objects.equals(this.organizationId, userDto.organizationId) &&
        Objects.equals(this.createdTimestamp, userDto.createdTimestamp) &&
        Objects.equals(this.roleName, userDto.roleName) &&
        Objects.equals(this.userId, userDto.userId) &&
        Objects.equals(this.email, userDto.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, createdTimestamp, roleName, userId, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDto {\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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


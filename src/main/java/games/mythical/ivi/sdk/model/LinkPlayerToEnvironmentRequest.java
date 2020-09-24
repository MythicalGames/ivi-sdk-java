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
 * LinkPlayerToEnvironmentRequest
 */
@JsonPropertyOrder({
  LinkPlayerToEnvironmentRequest.JSON_PROPERTY_AUTH_HEADER_KEY,
  LinkPlayerToEnvironmentRequest.JSON_PROPERTY_CALL_BACK_URL,
  LinkPlayerToEnvironmentRequest.JSON_PROPERTY_PLATFORM_USER_ID,
  LinkPlayerToEnvironmentRequest.JSON_PROPERTY_AUTH_HEADER_VALUE,
  LinkPlayerToEnvironmentRequest.JSON_PROPERTY_PLAYER_ID
})
@JsonTypeName("LinkPlayerToEnvironmentRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkPlayerToEnvironmentRequest {
  public static final String JSON_PROPERTY_AUTH_HEADER_KEY = "authHeaderKey";
  private String authHeaderKey;

  public static final String JSON_PROPERTY_CALL_BACK_URL = "callBackUrl";
  private String callBackUrl;

  public static final String JSON_PROPERTY_PLATFORM_USER_ID = "platformUserId";
  private String platformUserId;

  public static final String JSON_PROPERTY_AUTH_HEADER_VALUE = "authHeaderValue";
  private String authHeaderValue;

  public static final String JSON_PROPERTY_PLAYER_ID = "playerId";
  private String playerId;


  public LinkPlayerToEnvironmentRequest authHeaderKey(String authHeaderKey) {
    
    this.authHeaderKey = authHeaderKey;
    return this;
  }

   /**
   * Get authHeaderKey
   * @return authHeaderKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_HEADER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthHeaderKey() {
    return authHeaderKey;
  }


  public void setAuthHeaderKey(String authHeaderKey) {
    this.authHeaderKey = authHeaderKey;
  }


  public LinkPlayerToEnvironmentRequest callBackUrl(String callBackUrl) {
    
    this.callBackUrl = callBackUrl;
    return this;
  }

   /**
   * Get callBackUrl
   * @return callBackUrl
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CALL_BACK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallBackUrl() {
    return callBackUrl;
  }


  public void setCallBackUrl(String callBackUrl) {
    this.callBackUrl = callBackUrl;
  }


  public LinkPlayerToEnvironmentRequest platformUserId(String platformUserId) {
    
    this.platformUserId = platformUserId;
    return this;
  }

   /**
   * Get platformUserId
   * @return platformUserId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlatformUserId() {
    return platformUserId;
  }


  public void setPlatformUserId(String platformUserId) {
    this.platformUserId = platformUserId;
  }


  public LinkPlayerToEnvironmentRequest authHeaderValue(String authHeaderValue) {
    
    this.authHeaderValue = authHeaderValue;
    return this;
  }

   /**
   * Get authHeaderValue
   * @return authHeaderValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_HEADER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthHeaderValue() {
    return authHeaderValue;
  }


  public void setAuthHeaderValue(String authHeaderValue) {
    this.authHeaderValue = authHeaderValue;
  }


  public LinkPlayerToEnvironmentRequest playerId(String playerId) {
    
    this.playerId = playerId;
    return this;
  }

   /**
   * Get playerId
   * @return playerId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PLAYER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlayerId() {
    return playerId;
  }


  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPlayerToEnvironmentRequest linkPlayerToEnvironmentRequest = (LinkPlayerToEnvironmentRequest) o;
    return Objects.equals(this.authHeaderKey, linkPlayerToEnvironmentRequest.authHeaderKey) &&
        Objects.equals(this.callBackUrl, linkPlayerToEnvironmentRequest.callBackUrl) &&
        Objects.equals(this.platformUserId, linkPlayerToEnvironmentRequest.platformUserId) &&
        Objects.equals(this.authHeaderValue, linkPlayerToEnvironmentRequest.authHeaderValue) &&
        Objects.equals(this.playerId, linkPlayerToEnvironmentRequest.playerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authHeaderKey, callBackUrl, platformUserId, authHeaderValue, playerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPlayerToEnvironmentRequest {\n");
    sb.append("    authHeaderKey: ").append(toIndentedString(authHeaderKey)).append("\n");
    sb.append("    callBackUrl: ").append(toIndentedString(callBackUrl)).append("\n");
    sb.append("    platformUserId: ").append(toIndentedString(platformUserId)).append("\n");
    sb.append("    authHeaderValue: ").append(toIndentedString(authHeaderValue)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
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


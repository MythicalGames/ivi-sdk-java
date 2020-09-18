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
 * LinkPlayerToEnvironmentRequest
 */
@JsonPropertyOrder({
  LinkPlayerToEnvironmentRequest.JSON_PROPERTY_PLATFORM_USER_ID,
  LinkPlayerToEnvironmentRequest.JSON_PROPERTY_PLAYER_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-17T21:49:06.785396-07:00[America/Los_Angeles]")
public class LinkPlayerToEnvironmentRequest {
  public static final String JSON_PROPERTY_PLATFORM_USER_ID = "platformUserId";
  private String platformUserId;

  public static final String JSON_PROPERTY_PLAYER_ID = "playerId";
  private String playerId;


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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPlayerToEnvironmentRequest linkPlayerToEnvironmentRequest = (LinkPlayerToEnvironmentRequest) o;
    return Objects.equals(this.platformUserId, linkPlayerToEnvironmentRequest.platformUserId) &&
        Objects.equals(this.playerId, linkPlayerToEnvironmentRequest.playerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformUserId, playerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPlayerToEnvironmentRequest {\n");
    sb.append("    platformUserId: ").append(toIndentedString(platformUserId)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
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


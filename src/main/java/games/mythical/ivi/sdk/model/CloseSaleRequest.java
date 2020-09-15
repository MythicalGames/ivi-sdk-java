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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CloseSaleRequest
 */
@JsonPropertyOrder({
  CloseSaleRequest.JSON_PROPERTY_GAME_INVENTORY_IDS,
  CloseSaleRequest.JSON_PROPERTY_PLAYER_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T09:19:26.551556-07:00[America/Los_Angeles]")
public class CloseSaleRequest {
  public static final String JSON_PROPERTY_GAME_INVENTORY_IDS = "gameInventoryIds";
  private List<String> gameInventoryIds = new ArrayList<>();

  public static final String JSON_PROPERTY_PLAYER_ID = "playerId";
  private String playerId;


  public CloseSaleRequest gameInventoryIds(List<String> gameInventoryIds) {
    
    this.gameInventoryIds = gameInventoryIds;
    return this;
  }

  public CloseSaleRequest addGameInventoryIdsItem(String gameInventoryIdsItem) {
    this.gameInventoryIds.add(gameInventoryIdsItem);
    return this;
  }

   /**
   * Get gameInventoryIds
   * @return gameInventoryIds
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_GAME_INVENTORY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getGameInventoryIds() {
    return gameInventoryIds;
  }


  public void setGameInventoryIds(List<String> gameInventoryIds) {
    this.gameInventoryIds = gameInventoryIds;
  }


  public CloseSaleRequest playerId(String playerId) {
    
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
    CloseSaleRequest closeSaleRequest = (CloseSaleRequest) o;
    return Objects.equals(this.gameInventoryIds, closeSaleRequest.gameInventoryIds) &&
        Objects.equals(this.playerId, closeSaleRequest.playerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameInventoryIds, playerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloseSaleRequest {\n");
    sb.append("    gameInventoryIds: ").append(toIndentedString(gameInventoryIds)).append("\n");
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


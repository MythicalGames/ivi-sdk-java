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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CloseSaleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-14T14:31:49.595906-07:00[America/Los_Angeles]")
public class CloseSaleRequest {
  public static final String SERIALIZED_NAME_GAME_INVENTORY_IDS = "gameInventoryIds";
  @SerializedName(SERIALIZED_NAME_GAME_INVENTORY_IDS)
  private List<String> gameInventoryIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
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


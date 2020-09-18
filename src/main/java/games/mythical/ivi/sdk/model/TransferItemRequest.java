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
 * TransferItemRequest
 */
@JsonPropertyOrder({
  TransferItemRequest.JSON_PROPERTY_DEST_PLAYER_ID,
  TransferItemRequest.JSON_PROPERTY_MEMO,
  TransferItemRequest.JSON_PROPERTY_SOURCE_PLAYER_ID,
  TransferItemRequest.JSON_PROPERTY_NEW_GAME_INVENTORY_ID,
  TransferItemRequest.JSON_PROPERTY_GAME_INVENTORY_ID
})
@JsonTypeName("TransferItemRequest")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransferItemRequest {
  public static final String JSON_PROPERTY_DEST_PLAYER_ID = "destPlayerId";
  private String destPlayerId;

  public static final String JSON_PROPERTY_MEMO = "memo";
  private String memo;

  public static final String JSON_PROPERTY_SOURCE_PLAYER_ID = "sourcePlayerId";
  private String sourcePlayerId;

  public static final String JSON_PROPERTY_NEW_GAME_INVENTORY_ID = "newGameInventoryId";
  private String newGameInventoryId;

  public static final String JSON_PROPERTY_GAME_INVENTORY_ID = "gameInventoryId";
  private String gameInventoryId;


  public TransferItemRequest destPlayerId(String destPlayerId) {
    
    this.destPlayerId = destPlayerId;
    return this;
  }

   /**
   * Get destPlayerId
   * @return destPlayerId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEST_PLAYER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestPlayerId() {
    return destPlayerId;
  }


  public void setDestPlayerId(String destPlayerId) {
    this.destPlayerId = destPlayerId;
  }


  public TransferItemRequest memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "optional", value = "")
  @JsonProperty(JSON_PROPERTY_MEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public TransferItemRequest sourcePlayerId(String sourcePlayerId) {
    
    this.sourcePlayerId = sourcePlayerId;
    return this;
  }

   /**
   * Get sourcePlayerId
   * @return sourcePlayerId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_PLAYER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourcePlayerId() {
    return sourcePlayerId;
  }


  public void setSourcePlayerId(String sourcePlayerId) {
    this.sourcePlayerId = sourcePlayerId;
  }


  public TransferItemRequest newGameInventoryId(String newGameInventoryId) {
    
    this.newGameInventoryId = newGameInventoryId;
    return this;
  }

   /**
   * Get newGameInventoryId
   * @return newGameInventoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "optional", value = "")
  @JsonProperty(JSON_PROPERTY_NEW_GAME_INVENTORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewGameInventoryId() {
    return newGameInventoryId;
  }


  public void setNewGameInventoryId(String newGameInventoryId) {
    this.newGameInventoryId = newGameInventoryId;
  }


  public TransferItemRequest gameInventoryId(String gameInventoryId) {
    
    this.gameInventoryId = gameInventoryId;
    return this;
  }

   /**
   * Get gameInventoryId
   * @return gameInventoryId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_GAME_INVENTORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGameInventoryId() {
    return gameInventoryId;
  }


  public void setGameInventoryId(String gameInventoryId) {
    this.gameInventoryId = gameInventoryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferItemRequest transferItemRequest = (TransferItemRequest) o;
    return Objects.equals(this.destPlayerId, transferItemRequest.destPlayerId) &&
        Objects.equals(this.memo, transferItemRequest.memo) &&
        Objects.equals(this.sourcePlayerId, transferItemRequest.sourcePlayerId) &&
        Objects.equals(this.newGameInventoryId, transferItemRequest.newGameInventoryId) &&
        Objects.equals(this.gameInventoryId, transferItemRequest.gameInventoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destPlayerId, memo, sourcePlayerId, newGameInventoryId, gameInventoryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferItemRequest {\n");
    sb.append("    destPlayerId: ").append(toIndentedString(destPlayerId)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    sourcePlayerId: ").append(toIndentedString(sourcePlayerId)).append("\n");
    sb.append("    newGameInventoryId: ").append(toIndentedString(newGameInventoryId)).append("\n");
    sb.append("    gameInventoryId: ").append(toIndentedString(gameInventoryId)).append("\n");
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


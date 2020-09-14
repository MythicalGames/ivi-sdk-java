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
 * BuyListingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-14T14:31:49.595906-07:00[America/Los_Angeles]")
public class BuyListingRequest {
  public static final String SERIALIZED_NAME_MARKETPLACE_ID = "marketplaceId";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE_ID)
  private String marketplaceId;

  public static final String SERIALIZED_NAME_GAME_INVENTORY_IDS = "gameInventoryIds";
  @SerializedName(SERIALIZED_NAME_GAME_INVENTORY_IDS)
  private List<String> gameInventoryIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SELLER_PLAYER_ID = "sellerPlayerId";
  @SerializedName(SERIALIZED_NAME_SELLER_PLAYER_ID)
  private String sellerPlayerId;

  public static final String SERIALIZED_NAME_BUYER_PLAYER_ID = "buyerPlayerId";
  @SerializedName(SERIALIZED_NAME_BUYER_PLAYER_ID)
  private String buyerPlayerId;


  public BuyListingRequest marketplaceId(String marketplaceId) {
    
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ebay", value = "")

  public String getMarketplaceId() {
    return marketplaceId;
  }


  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }


  public BuyListingRequest gameInventoryIds(List<String> gameInventoryIds) {
    
    this.gameInventoryIds = gameInventoryIds;
    return this;
  }

  public BuyListingRequest addGameInventoryIdsItem(String gameInventoryIdsItem) {
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


  public BuyListingRequest sellerPlayerId(String sellerPlayerId) {
    
    this.sellerPlayerId = sellerPlayerId;
    return this;
  }

   /**
   * Get sellerPlayerId
   * @return sellerPlayerId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSellerPlayerId() {
    return sellerPlayerId;
  }


  public void setSellerPlayerId(String sellerPlayerId) {
    this.sellerPlayerId = sellerPlayerId;
  }


  public BuyListingRequest buyerPlayerId(String buyerPlayerId) {
    
    this.buyerPlayerId = buyerPlayerId;
    return this;
  }

   /**
   * Get buyerPlayerId
   * @return buyerPlayerId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getBuyerPlayerId() {
    return buyerPlayerId;
  }


  public void setBuyerPlayerId(String buyerPlayerId) {
    this.buyerPlayerId = buyerPlayerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyListingRequest buyListingRequest = (BuyListingRequest) o;
    return Objects.equals(this.marketplaceId, buyListingRequest.marketplaceId) &&
        Objects.equals(this.gameInventoryIds, buyListingRequest.gameInventoryIds) &&
        Objects.equals(this.sellerPlayerId, buyListingRequest.sellerPlayerId) &&
        Objects.equals(this.buyerPlayerId, buyListingRequest.buyerPlayerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, gameInventoryIds, sellerPlayerId, buyerPlayerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyListingRequest {\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    gameInventoryIds: ").append(toIndentedString(gameInventoryIds)).append("\n");
    sb.append("    sellerPlayerId: ").append(toIndentedString(sellerPlayerId)).append("\n");
    sb.append("    buyerPlayerId: ").append(toIndentedString(buyerPlayerId)).append("\n");
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


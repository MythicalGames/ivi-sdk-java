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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ListSaleRequest
 */
@JsonPropertyOrder({
  ListSaleRequest.JSON_PROPERTY_SELLER_PROCEEDS,
  ListSaleRequest.JSON_PROPERTY_OWNER_PLAYER_ID,
  ListSaleRequest.JSON_PROPERTY_SELL_BY_DAYS,
  ListSaleRequest.JSON_PROPERTY_GAME_INVENTORY_IDS,
  ListSaleRequest.JSON_PROPERTY_SALE_MODEL,
  ListSaleRequest.JSON_PROPERTY_CURRENCY
})

public class ListSaleRequest {
  public static final String JSON_PROPERTY_SELLER_PROCEEDS = "sellerProceeds";
  private BigDecimal sellerProceeds;

  public static final String JSON_PROPERTY_OWNER_PLAYER_ID = "ownerPlayerId";
  private String ownerPlayerId;

  public static final String JSON_PROPERTY_SELL_BY_DAYS = "sellByDays";
  private Integer sellByDays;

  public static final String JSON_PROPERTY_GAME_INVENTORY_IDS = "gameInventoryIds";
  private List<String> gameInventoryIds = new ArrayList<>();

  /**
   * Gets or Sets saleModel
   */
  public enum SaleModelEnum {
    FIXED_PRICE("FIXED_PRICE"),
    
    UNRECOGNIZED("UNRECOGNIZED");

    private String value;

    SaleModelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SaleModelEnum fromValue(String value) {
      for (SaleModelEnum b : SaleModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SALE_MODEL = "saleModel";
  private SaleModelEnum saleModel;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;


  public ListSaleRequest sellerProceeds(BigDecimal sellerProceeds) {
    
    this.sellerProceeds = sellerProceeds;
    return this;
  }

   /**
   * Get sellerProceeds
   * minimum: 0
   * @return sellerProceeds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.99", value = "")
  @JsonProperty(JSON_PROPERTY_SELLER_PROCEEDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSellerProceeds() {
    return sellerProceeds;
  }


  public void setSellerProceeds(BigDecimal sellerProceeds) {
    this.sellerProceeds = sellerProceeds;
  }


  public ListSaleRequest ownerPlayerId(String ownerPlayerId) {
    
    this.ownerPlayerId = ownerPlayerId;
    return this;
  }

   /**
   * Get ownerPlayerId
   * @return ownerPlayerId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OWNER_PLAYER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOwnerPlayerId() {
    return ownerPlayerId;
  }


  public void setOwnerPlayerId(String ownerPlayerId) {
    this.ownerPlayerId = ownerPlayerId;
  }


  public ListSaleRequest sellByDays(Integer sellByDays) {
    
    this.sellByDays = sellByDays;
    return this;
  }

   /**
   * Get sellByDays
   * minimum: 1
   * maximum: 364
   * @return sellByDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")
  @JsonProperty(JSON_PROPERTY_SELL_BY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSellByDays() {
    return sellByDays;
  }


  public void setSellByDays(Integer sellByDays) {
    this.sellByDays = sellByDays;
  }


  public ListSaleRequest gameInventoryIds(List<String> gameInventoryIds) {
    
    this.gameInventoryIds = gameInventoryIds;
    return this;
  }

  public ListSaleRequest addGameInventoryIdsItem(String gameInventoryIdsItem) {
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


  public ListSaleRequest saleModel(SaleModelEnum saleModel) {
    
    this.saleModel = saleModel;
    return this;
  }

   /**
   * Get saleModel
   * @return saleModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SaleModelEnum getSaleModel() {
    return saleModel;
  }


  public void setSaleModel(SaleModelEnum saleModel) {
    this.saleModel = saleModel;
  }


  public ListSaleRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSaleRequest listSaleRequest = (ListSaleRequest) o;
    return Objects.equals(this.sellerProceeds, listSaleRequest.sellerProceeds) &&
        Objects.equals(this.ownerPlayerId, listSaleRequest.ownerPlayerId) &&
        Objects.equals(this.sellByDays, listSaleRequest.sellByDays) &&
        Objects.equals(this.gameInventoryIds, listSaleRequest.gameInventoryIds) &&
        Objects.equals(this.saleModel, listSaleRequest.saleModel) &&
        Objects.equals(this.currency, listSaleRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerProceeds, ownerPlayerId, sellByDays, gameInventoryIds, saleModel, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSaleRequest {\n");
    sb.append("    sellerProceeds: ").append(toIndentedString(sellerProceeds)).append("\n");
    sb.append("    ownerPlayerId: ").append(toIndentedString(ownerPlayerId)).append("\n");
    sb.append("    sellByDays: ").append(toIndentedString(sellByDays)).append("\n");
    sb.append("    gameInventoryIds: ").append(toIndentedString(gameInventoryIds)).append("\n");
    sb.append("    saleModel: ").append(toIndentedString(saleModel)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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


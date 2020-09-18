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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MarketplaceListingDto
 */
@JsonPropertyOrder({
  MarketplaceListingDto.JSON_PROPERTY_SALE_AMOUNT,
  MarketplaceListingDto.JSON_PROPERTY_DGOODS_METADATA,
  MarketplaceListingDto.JSON_PROPERTY_CREATED_TIMESTAMP,
  MarketplaceListingDto.JSON_PROPERTY_SELLER_PLAYER_ID,
  MarketplaceListingDto.JSON_PROPERTY_BATCH_ID,
  MarketplaceListingDto.JSON_PROPERTY_FINALIZED,
  MarketplaceListingDto.JSON_PROPERTY_SELL_BY_DATE,
  MarketplaceListingDto.JSON_PROPERTY_ENVIRONMENT_ID,
  MarketplaceListingDto.JSON_PROPERTY_GAME_ITEMS,
  MarketplaceListingDto.JSON_PROPERTY_SALE_MODEL,
  MarketplaceListingDto.JSON_PROPERTY_CLOSED,
  MarketplaceListingDto.JSON_PROPERTY_CURRENCY,
  MarketplaceListingDto.JSON_PROPERTY_DGOOD_IDS,
  MarketplaceListingDto.JSON_PROPERTY_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-17T21:49:06.785396-07:00[America/Los_Angeles]")
public class MarketplaceListingDto {
  public static final String JSON_PROPERTY_SALE_AMOUNT = "saleAmount";
  private BigDecimal saleAmount;

  public static final String JSON_PROPERTY_DGOODS_METADATA = "dgoodsMetadata";
  private String dgoodsMetadata;

  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private Long createdTimestamp;

  public static final String JSON_PROPERTY_SELLER_PLAYER_ID = "sellerPlayerId";
  private String sellerPlayerId;

  public static final String JSON_PROPERTY_BATCH_ID = "batchId";
  private Long batchId;

  public static final String JSON_PROPERTY_FINALIZED = "finalized";
  private Boolean finalized;

  public static final String JSON_PROPERTY_SELL_BY_DATE = "sellByDate";
  private Long sellByDate;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environmentId";
  private String environmentId;

  public static final String JSON_PROPERTY_GAME_ITEMS = "gameItems";
  private String gameItems;

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

  public static final String JSON_PROPERTY_CLOSED = "closed";
  private Boolean closed;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DGOOD_IDS = "dgoodIds";
  private List<Long> dgoodIds = null;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;


  public MarketplaceListingDto saleAmount(BigDecimal saleAmount) {
    
    this.saleAmount = saleAmount;
    return this;
  }

   /**
   * Get saleAmount
   * @return saleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSaleAmount() {
    return saleAmount;
  }


  public void setSaleAmount(BigDecimal saleAmount) {
    this.saleAmount = saleAmount;
  }


  public MarketplaceListingDto dgoodsMetadata(String dgoodsMetadata) {
    
    this.dgoodsMetadata = dgoodsMetadata;
    return this;
  }

   /**
   * Get dgoodsMetadata
   * @return dgoodsMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DGOODS_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDgoodsMetadata() {
    return dgoodsMetadata;
  }


  public void setDgoodsMetadata(String dgoodsMetadata) {
    this.dgoodsMetadata = dgoodsMetadata;
  }


  public MarketplaceListingDto createdTimestamp(Long createdTimestamp) {
    
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

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public MarketplaceListingDto sellerPlayerId(String sellerPlayerId) {
    
    this.sellerPlayerId = sellerPlayerId;
    return this;
  }

   /**
   * Get sellerPlayerId
   * @return sellerPlayerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELLER_PLAYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSellerPlayerId() {
    return sellerPlayerId;
  }


  public void setSellerPlayerId(String sellerPlayerId) {
    this.sellerPlayerId = sellerPlayerId;
  }


  public MarketplaceListingDto batchId(Long batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBatchId() {
    return batchId;
  }


  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }


  public MarketplaceListingDto finalized(Boolean finalized) {
    
    this.finalized = finalized;
    return this;
  }

   /**
   * Get finalized
   * @return finalized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FINALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFinalized() {
    return finalized;
  }


  public void setFinalized(Boolean finalized) {
    this.finalized = finalized;
  }


  public MarketplaceListingDto sellByDate(Long sellByDate) {
    
    this.sellByDate = sellByDate;
    return this;
  }

   /**
   * Get sellByDate
   * @return sellByDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELL_BY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSellByDate() {
    return sellByDate;
  }


  public void setSellByDate(Long sellByDate) {
    this.sellByDate = sellByDate;
  }


  public MarketplaceListingDto environmentId(String environmentId) {
    
    this.environmentId = environmentId;
    return this;
  }

   /**
   * Get environmentId
   * @return environmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvironmentId() {
    return environmentId;
  }


  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }


  public MarketplaceListingDto gameItems(String gameItems) {
    
    this.gameItems = gameItems;
    return this;
  }

   /**
   * Get gameItems
   * @return gameItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GAME_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGameItems() {
    return gameItems;
  }


  public void setGameItems(String gameItems) {
    this.gameItems = gameItems;
  }


  public MarketplaceListingDto saleModel(SaleModelEnum saleModel) {
    
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


  public MarketplaceListingDto closed(Boolean closed) {
    
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  public MarketplaceListingDto currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public MarketplaceListingDto dgoodIds(List<Long> dgoodIds) {
    
    this.dgoodIds = dgoodIds;
    return this;
  }

  public MarketplaceListingDto addDgoodIdsItem(Long dgoodIdsItem) {
    if (this.dgoodIds == null) {
      this.dgoodIds = new ArrayList<>();
    }
    this.dgoodIds.add(dgoodIdsItem);
    return this;
  }

   /**
   * Get dgoodIds
   * @return dgoodIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DGOOD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getDgoodIds() {
    return dgoodIds;
  }


  public void setDgoodIds(List<Long> dgoodIds) {
    this.dgoodIds = dgoodIds;
  }


  public MarketplaceListingDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceListingDto marketplaceListingDto = (MarketplaceListingDto) o;
    return Objects.equals(this.saleAmount, marketplaceListingDto.saleAmount) &&
        Objects.equals(this.dgoodsMetadata, marketplaceListingDto.dgoodsMetadata) &&
        Objects.equals(this.createdTimestamp, marketplaceListingDto.createdTimestamp) &&
        Objects.equals(this.sellerPlayerId, marketplaceListingDto.sellerPlayerId) &&
        Objects.equals(this.batchId, marketplaceListingDto.batchId) &&
        Objects.equals(this.finalized, marketplaceListingDto.finalized) &&
        Objects.equals(this.sellByDate, marketplaceListingDto.sellByDate) &&
        Objects.equals(this.environmentId, marketplaceListingDto.environmentId) &&
        Objects.equals(this.gameItems, marketplaceListingDto.gameItems) &&
        Objects.equals(this.saleModel, marketplaceListingDto.saleModel) &&
        Objects.equals(this.closed, marketplaceListingDto.closed) &&
        Objects.equals(this.currency, marketplaceListingDto.currency) &&
        Objects.equals(this.dgoodIds, marketplaceListingDto.dgoodIds) &&
        Objects.equals(this.id, marketplaceListingDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saleAmount, dgoodsMetadata, createdTimestamp, sellerPlayerId, batchId, finalized, sellByDate, environmentId, gameItems, saleModel, closed, currency, dgoodIds, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceListingDto {\n");
    sb.append("    saleAmount: ").append(toIndentedString(saleAmount)).append("\n");
    sb.append("    dgoodsMetadata: ").append(toIndentedString(dgoodsMetadata)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    sellerPlayerId: ").append(toIndentedString(sellerPlayerId)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    finalized: ").append(toIndentedString(finalized)).append("\n");
    sb.append("    sellByDate: ").append(toIndentedString(sellByDate)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    gameItems: ").append(toIndentedString(gameItems)).append("\n");
    sb.append("    saleModel: ").append(toIndentedString(saleModel)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dgoodIds: ").append(toIndentedString(dgoodIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


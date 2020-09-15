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
 * SoldItemDto
 */
@JsonPropertyOrder({
  SoldItemDto.JSON_PROPERTY_MARKETPLACE_ID,
  SoldItemDto.JSON_PROPERTY_FINALIZED,
  SoldItemDto.JSON_PROPERTY_ENVIRONMENT_ID,
  SoldItemDto.JSON_PROPERTY_CREATED_BY,
  SoldItemDto.JSON_PROPERTY_CREATED_TIMESTAMP,
  SoldItemDto.JSON_PROPERTY_SELLER_PLAYER_ID,
  SoldItemDto.JSON_PROPERTY_BATCH_ID,
  SoldItemDto.JSON_PROPERTY_BUYER_PLAYER_ID,
  SoldItemDto.JSON_PROPERTY_TRANSACTION_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T09:19:26.551556-07:00[America/Los_Angeles]")
public class SoldItemDto {
  public static final String JSON_PROPERTY_MARKETPLACE_ID = "marketplaceId";
  private String marketplaceId;

  public static final String JSON_PROPERTY_FINALIZED = "finalized";
  private Boolean finalized;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environmentId";
  private String environmentId;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private Long createdTimestamp;

  public static final String JSON_PROPERTY_SELLER_PLAYER_ID = "sellerPlayerId";
  private String sellerPlayerId;

  public static final String JSON_PROPERTY_BATCH_ID = "batchId";
  private Long batchId;

  public static final String JSON_PROPERTY_BUYER_PLAYER_ID = "buyerPlayerId";
  private String buyerPlayerId;

  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private String transactionId;


  public SoldItemDto marketplaceId(String marketplaceId) {
    
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKETPLACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarketplaceId() {
    return marketplaceId;
  }


  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }


  public SoldItemDto finalized(Boolean finalized) {
    
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


  public SoldItemDto environmentId(String environmentId) {
    
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


  public SoldItemDto createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public SoldItemDto createdTimestamp(Long createdTimestamp) {
    
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


  public SoldItemDto sellerPlayerId(String sellerPlayerId) {
    
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


  public SoldItemDto batchId(Long batchId) {
    
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


  public SoldItemDto buyerPlayerId(String buyerPlayerId) {
    
    this.buyerPlayerId = buyerPlayerId;
    return this;
  }

   /**
   * Get buyerPlayerId
   * @return buyerPlayerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUYER_PLAYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuyerPlayerId() {
    return buyerPlayerId;
  }


  public void setBuyerPlayerId(String buyerPlayerId) {
    this.buyerPlayerId = buyerPlayerId;
  }


  public SoldItemDto transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoldItemDto soldItemDto = (SoldItemDto) o;
    return Objects.equals(this.marketplaceId, soldItemDto.marketplaceId) &&
        Objects.equals(this.finalized, soldItemDto.finalized) &&
        Objects.equals(this.environmentId, soldItemDto.environmentId) &&
        Objects.equals(this.createdBy, soldItemDto.createdBy) &&
        Objects.equals(this.createdTimestamp, soldItemDto.createdTimestamp) &&
        Objects.equals(this.sellerPlayerId, soldItemDto.sellerPlayerId) &&
        Objects.equals(this.batchId, soldItemDto.batchId) &&
        Objects.equals(this.buyerPlayerId, soldItemDto.buyerPlayerId) &&
        Objects.equals(this.transactionId, soldItemDto.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, finalized, environmentId, createdBy, createdTimestamp, sellerPlayerId, batchId, buyerPlayerId, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoldItemDto {\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    finalized: ").append(toIndentedString(finalized)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    sellerPlayerId: ").append(toIndentedString(sellerPlayerId)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    buyerPlayerId: ").append(toIndentedString(buyerPlayerId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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


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
 * ItemActionDto
 */
@JsonPropertyOrder({
  ItemActionDto.JSON_PROPERTY_FINALIZED,
  ItemActionDto.JSON_PROPERTY_DGOOD_IDS,
  ItemActionDto.JSON_PROPERTY_MESSAGE,
  ItemActionDto.JSON_PROPERTY_TRANSACTION_ID,
  ItemActionDto.JSON_PROPERTY_STATUS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T09:19:26.551556-07:00[America/Los_Angeles]")
public class ItemActionDto {
  public static final String JSON_PROPERTY_FINALIZED = "finalized";
  private Boolean finalized;

  public static final String JSON_PROPERTY_DGOOD_IDS = "dgoodIds";
  private List<Long> dgoodIds = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private String transactionId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;


  public ItemActionDto finalized(Boolean finalized) {
    
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


  public ItemActionDto dgoodIds(List<Long> dgoodIds) {
    
    this.dgoodIds = dgoodIds;
    return this;
  }

  public ItemActionDto addDgoodIdsItem(Long dgoodIdsItem) {
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


  public ItemActionDto message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ItemActionDto transactionId(String transactionId) {
    
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


  public ItemActionDto status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemActionDto itemActionDto = (ItemActionDto) o;
    return Objects.equals(this.finalized, itemActionDto.finalized) &&
        Objects.equals(this.dgoodIds, itemActionDto.dgoodIds) &&
        Objects.equals(this.message, itemActionDto.message) &&
        Objects.equals(this.transactionId, itemActionDto.transactionId) &&
        Objects.equals(this.status, itemActionDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalized, dgoodIds, message, transactionId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemActionDto {\n");
    sb.append("    finalized: ").append(toIndentedString(finalized)).append("\n");
    sb.append("    dgoodIds: ").append(toIndentedString(dgoodIds)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


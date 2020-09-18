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
 * TransactionDto
 */
@JsonPropertyOrder({
  TransactionDto.JSON_PROPERTY_FINALIZED,
  TransactionDto.JSON_PROPERTY_ENVIRONMENT_ID,
  TransactionDto.JSON_PROPERTY_DATA,
  TransactionDto.JSON_PROPERTY_CREATED_BY,
  TransactionDto.JSON_PROPERTY_CREATED_TIMESTAMP,
  TransactionDto.JSON_PROPERTY_ACTION,
  TransactionDto.JSON_PROPERTY_FINALIZED_TIMESTAMP,
  TransactionDto.JSON_PROPERTY_TRANSACTION_ID,
  TransactionDto.JSON_PROPERTY_DGOOD_ID
})

public class TransactionDto {
  public static final String JSON_PROPERTY_FINALIZED = "finalized";
  private Boolean finalized;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environmentId";
  private String environmentId;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private Long createdTimestamp;

  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_FINALIZED_TIMESTAMP = "finalizedTimestamp";
  private Long finalizedTimestamp;

  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private String transactionId;

  public static final String JSON_PROPERTY_DGOOD_ID = "dgoodId";
  private Long dgoodId;


  public TransactionDto finalized(Boolean finalized) {
    
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


  public TransactionDto environmentId(String environmentId) {
    
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


  public TransactionDto data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public TransactionDto createdBy(String createdBy) {
    
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


  public TransactionDto createdTimestamp(Long createdTimestamp) {
    
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


  public TransactionDto action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public TransactionDto finalizedTimestamp(Long finalizedTimestamp) {
    
    this.finalizedTimestamp = finalizedTimestamp;
    return this;
  }

   /**
   * Get finalizedTimestamp
   * @return finalizedTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FINALIZED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFinalizedTimestamp() {
    return finalizedTimestamp;
  }


  public void setFinalizedTimestamp(Long finalizedTimestamp) {
    this.finalizedTimestamp = finalizedTimestamp;
  }


  public TransactionDto transactionId(String transactionId) {
    
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


  public TransactionDto dgoodId(Long dgoodId) {
    
    this.dgoodId = dgoodId;
    return this;
  }

   /**
   * Get dgoodId
   * @return dgoodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DGOOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDgoodId() {
    return dgoodId;
  }


  public void setDgoodId(Long dgoodId) {
    this.dgoodId = dgoodId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDto transactionDto = (TransactionDto) o;
    return Objects.equals(this.finalized, transactionDto.finalized) &&
        Objects.equals(this.environmentId, transactionDto.environmentId) &&
        Objects.equals(this.data, transactionDto.data) &&
        Objects.equals(this.createdBy, transactionDto.createdBy) &&
        Objects.equals(this.createdTimestamp, transactionDto.createdTimestamp) &&
        Objects.equals(this.action, transactionDto.action) &&
        Objects.equals(this.finalizedTimestamp, transactionDto.finalizedTimestamp) &&
        Objects.equals(this.transactionId, transactionDto.transactionId) &&
        Objects.equals(this.dgoodId, transactionDto.dgoodId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalized, environmentId, data, createdBy, createdTimestamp, action, finalizedTimestamp, transactionId, dgoodId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDto {\n");
    sb.append("    finalized: ").append(toIndentedString(finalized)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    finalizedTimestamp: ").append(toIndentedString(finalizedTimestamp)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    dgoodId: ").append(toIndentedString(dgoodId)).append("\n");
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


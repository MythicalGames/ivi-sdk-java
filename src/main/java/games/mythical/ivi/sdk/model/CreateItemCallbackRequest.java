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
import games.mythical.ivi.sdk.model.CallbackDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CreateItemCallbackRequest
 */
@JsonPropertyOrder({
  CreateItemCallbackRequest.JSON_PROPERTY_TRANSFERABLE,
  CreateItemCallbackRequest.JSON_PROPERTY_TOKEN_NAME,
  CreateItemCallbackRequest.JSON_PROPERTY_BURNABLE,
  CreateItemCallbackRequest.JSON_PROPERTY_CALLBACK,
  CreateItemCallbackRequest.JSON_PROPERTY_MAX_SUPPLY,
  CreateItemCallbackRequest.JSON_PROPERTY_SELLABLE,
  CreateItemCallbackRequest.JSON_PROPERTY_CATEGORY,
  CreateItemCallbackRequest.JSON_PROPERTY_AGREEMENT_IDS,
  CreateItemCallbackRequest.JSON_PROPERTY_ISSUE_TIME_SPAN
})
@JsonTypeName("CreateItemCallbackRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateItemCallbackRequest {
  public static final String JSON_PROPERTY_TRANSFERABLE = "transferable";
  private Boolean transferable;

  public static final String JSON_PROPERTY_TOKEN_NAME = "tokenName";
  private String tokenName;

  public static final String JSON_PROPERTY_BURNABLE = "burnable";
  private Boolean burnable;

  public static final String JSON_PROPERTY_CALLBACK = "callback";
  private CallbackDto callback;

  public static final String JSON_PROPERTY_MAX_SUPPLY = "maxSupply";
  private Integer maxSupply;

  public static final String JSON_PROPERTY_SELLABLE = "sellable";
  private Boolean sellable;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_AGREEMENT_IDS = "agreementIds";
  private List<String> agreementIds = null;

  public static final String JSON_PROPERTY_ISSUE_TIME_SPAN = "issueTimeSpan";
  private Integer issueTimeSpan;


  public CreateItemCallbackRequest transferable(Boolean transferable) {
    
    this.transferable = transferable;
    return this;
  }

   /**
   * Get transferable
   * @return transferable
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSFERABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getTransferable() {
    return transferable;
  }


  public void setTransferable(Boolean transferable) {
    this.transferable = transferable;
  }


  public CreateItemCallbackRequest tokenName(String tokenName) {
    
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Get tokenName
   * @return tokenName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenName() {
    return tokenName;
  }


  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }


  public CreateItemCallbackRequest burnable(Boolean burnable) {
    
    this.burnable = burnable;
    return this;
  }

   /**
   * Get burnable
   * @return burnable
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BURNABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getBurnable() {
    return burnable;
  }


  public void setBurnable(Boolean burnable) {
    this.burnable = burnable;
  }


  public CreateItemCallbackRequest callback(CallbackDto callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallbackDto getCallback() {
    return callback;
  }


  public void setCallback(CallbackDto callback) {
    this.callback = callback;
  }


  public CreateItemCallbackRequest maxSupply(Integer maxSupply) {
    
    this.maxSupply = maxSupply;
    return this;
  }

   /**
   * Get maxSupply
   * minimum: 0
   * @return maxSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")
  @JsonProperty(JSON_PROPERTY_MAX_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxSupply() {
    return maxSupply;
  }


  public void setMaxSupply(Integer maxSupply) {
    this.maxSupply = maxSupply;
  }


  public CreateItemCallbackRequest sellable(Boolean sellable) {
    
    this.sellable = sellable;
    return this;
  }

   /**
   * Get sellable
   * @return sellable
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SELLABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSellable() {
    return sellable;
  }


  public void setSellable(Boolean sellable) {
    this.sellable = sellable;
  }


  public CreateItemCallbackRequest category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CreateItemCallbackRequest agreementIds(List<String> agreementIds) {
    
    this.agreementIds = agreementIds;
    return this;
  }

  public CreateItemCallbackRequest addAgreementIdsItem(String agreementIdsItem) {
    if (this.agreementIds == null) {
      this.agreementIds = new ArrayList<>();
    }
    this.agreementIds.add(agreementIdsItem);
    return this;
  }

   /**
   * Get agreementIds
   * @return agreementIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGREEMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAgreementIds() {
    return agreementIds;
  }


  public void setAgreementIds(List<String> agreementIds) {
    this.agreementIds = agreementIds;
  }


  public CreateItemCallbackRequest issueTimeSpan(Integer issueTimeSpan) {
    
    this.issueTimeSpan = issueTimeSpan;
    return this;
  }

   /**
   * Get issueTimeSpan
   * minimum: 0
   * @return issueTimeSpan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_ISSUE_TIME_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIssueTimeSpan() {
    return issueTimeSpan;
  }


  public void setIssueTimeSpan(Integer issueTimeSpan) {
    this.issueTimeSpan = issueTimeSpan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateItemCallbackRequest createItemCallbackRequest = (CreateItemCallbackRequest) o;
    return Objects.equals(this.transferable, createItemCallbackRequest.transferable) &&
        Objects.equals(this.tokenName, createItemCallbackRequest.tokenName) &&
        Objects.equals(this.burnable, createItemCallbackRequest.burnable) &&
        Objects.equals(this.callback, createItemCallbackRequest.callback) &&
        Objects.equals(this.maxSupply, createItemCallbackRequest.maxSupply) &&
        Objects.equals(this.sellable, createItemCallbackRequest.sellable) &&
        Objects.equals(this.category, createItemCallbackRequest.category) &&
        Objects.equals(this.agreementIds, createItemCallbackRequest.agreementIds) &&
        Objects.equals(this.issueTimeSpan, createItemCallbackRequest.issueTimeSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferable, tokenName, burnable, callback, maxSupply, sellable, category, agreementIds, issueTimeSpan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateItemCallbackRequest {\n");
    sb.append("    transferable: ").append(toIndentedString(transferable)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    burnable: ").append(toIndentedString(burnable)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    maxSupply: ").append(toIndentedString(maxSupply)).append("\n");
    sb.append("    sellable: ").append(toIndentedString(sellable)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    agreementIds: ").append(toIndentedString(agreementIds)).append("\n");
    sb.append("    issueTimeSpan: ").append(toIndentedString(issueTimeSpan)).append("\n");
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


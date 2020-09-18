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
import games.mythical.ivi.sdk.model.PostalAddress;
import games.mythical.ivi.sdk.model.TokenCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UpdateOrderRequest
 */
@JsonPropertyOrder({
  UpdateOrderRequest.JSON_PROPERTY_ITEM_TYPES,
  UpdateOrderRequest.JSON_PROPERTY_METADATA,
  UpdateOrderRequest.JSON_PROPERTY_ADDRESS,
  UpdateOrderRequest.JSON_PROPERTY_ORDER_ID,
  UpdateOrderRequest.JSON_PROPERTY_PLATFORM_USER_ID,
  UpdateOrderRequest.JSON_PROPERTY_TAX,
  UpdateOrderRequest.JSON_PROPERTY_SUB_TOTAL,
  UpdateOrderRequest.JSON_PROPERTY_PAYMENT_PROVIDER_ID,
  UpdateOrderRequest.JSON_PROPERTY_STATUS
})
@JsonTypeName("UpdateOrderRequest")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateOrderRequest {
  public static final String JSON_PROPERTY_ITEM_TYPES = "itemTypes";
  private List<TokenCategory> itemTypes = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = null;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private PostalAddress address;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private String orderId;

  public static final String JSON_PROPERTY_PLATFORM_USER_ID = "platformUserId";
  private String platformUserId;

  public static final String JSON_PROPERTY_TAX = "tax";
  private BigDecimal tax;

  public static final String JSON_PROPERTY_SUB_TOTAL = "subTotal";
  private BigDecimal subTotal;

  /**
   * Gets or Sets paymentProviderId
   */
  public enum PaymentProviderIdEnum {
    BRAINTREE("BRAINTREE"),
    
    COINBASE("COINBASE"),
    
    UNRECOGNIZED("UNRECOGNIZED");

    private String value;

    PaymentProviderIdEnum(String value) {
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
    public static PaymentProviderIdEnum fromValue(String value) {
      for (PaymentProviderIdEnum b : PaymentProviderIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_PROVIDER_ID = "paymentProviderId";
  private PaymentProviderIdEnum paymentProviderId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    STARTED("STARTED"),
    
    COMPLETE("COMPLETE"),
    
    UNRECOGNIZED("UNRECOGNIZED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;


  public UpdateOrderRequest itemTypes(List<TokenCategory> itemTypes) {
    
    this.itemTypes = itemTypes;
    return this;
  }

  public UpdateOrderRequest addItemTypesItem(TokenCategory itemTypesItem) {
    if (this.itemTypes == null) {
      this.itemTypes = new ArrayList<>();
    }
    this.itemTypes.add(itemTypesItem);
    return this;
  }

   /**
   * Get itemTypes
   * @return itemTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"category\":\"blanko\",\"token\":\"geisha.da\"}]", value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TokenCategory> getItemTypes() {
    return itemTypes;
  }


  public void setItemTypes(List<TokenCategory> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public UpdateOrderRequest metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public UpdateOrderRequest putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"dgood_id\":35}", value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public UpdateOrderRequest address(PostalAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostalAddress getAddress() {
    return address;
  }


  public void setAddress(PostalAddress address) {
    this.address = address;
  }


  public UpdateOrderRequest orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public UpdateOrderRequest platformUserId(String platformUserId) {
    
    this.platformUserId = platformUserId;
    return this;
  }

   /**
   * Get platformUserId
   * @return platformUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlatformUserId() {
    return platformUserId;
  }


  public void setPlatformUserId(String platformUserId) {
    this.platformUserId = platformUserId;
  }


  public UpdateOrderRequest tax(BigDecimal tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "")
  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTax() {
    return tax;
  }


  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }


  public UpdateOrderRequest subTotal(BigDecimal subTotal) {
    
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.99", value = "")
  @JsonProperty(JSON_PROPERTY_SUB_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSubTotal() {
    return subTotal;
  }


  public void setSubTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
  }


  public UpdateOrderRequest paymentProviderId(PaymentProviderIdEnum paymentProviderId) {
    
    this.paymentProviderId = paymentProviderId;
    return this;
  }

   /**
   * Get paymentProviderId
   * @return paymentProviderId
  **/
  @ApiModelProperty(example = "BRAINTREE", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentProviderIdEnum getPaymentProviderId() {
    return paymentProviderId;
  }


  public void setPaymentProviderId(PaymentProviderIdEnum paymentProviderId) {
    this.paymentProviderId = paymentProviderId;
  }


  public UpdateOrderRequest status(StatusEnum status) {
    
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

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderRequest updateOrderRequest = (UpdateOrderRequest) o;
    return Objects.equals(this.itemTypes, updateOrderRequest.itemTypes) &&
        Objects.equals(this.metadata, updateOrderRequest.metadata) &&
        Objects.equals(this.address, updateOrderRequest.address) &&
        Objects.equals(this.orderId, updateOrderRequest.orderId) &&
        Objects.equals(this.platformUserId, updateOrderRequest.platformUserId) &&
        Objects.equals(this.tax, updateOrderRequest.tax) &&
        Objects.equals(this.subTotal, updateOrderRequest.subTotal) &&
        Objects.equals(this.paymentProviderId, updateOrderRequest.paymentProviderId) &&
        Objects.equals(this.status, updateOrderRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemTypes, metadata, address, orderId, platformUserId, tax, subTotal, paymentProviderId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderRequest {\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    platformUserId: ").append(toIndentedString(platformUserId)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    paymentProviderId: ").append(toIndentedString(paymentProviderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


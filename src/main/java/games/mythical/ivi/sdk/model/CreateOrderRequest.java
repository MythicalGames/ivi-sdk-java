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
import games.mythical.ivi.sdk.model.PostalAddress;
import games.mythical.ivi.sdk.model.TokenCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreateOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-14T14:31:49.595906-07:00[America/Los_Angeles]")
public class CreateOrderRequest {
  public static final String SERIALIZED_NAME_ITEM_TYPES = "itemTypes";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<TokenCategory> itemTypes = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PostalAddress address;

  public static final String SERIALIZED_NAME_PLATFORM_USER_ID = "platformUserId";
  @SerializedName(SERIALIZED_NAME_PLATFORM_USER_ID)
  private String platformUserId;

  public static final String SERIALIZED_NAME_REQUEST_IP = "requestIp";
  @SerializedName(SERIALIZED_NAME_REQUEST_IP)
  private String requestIp;

  public static final String SERIALIZED_NAME_SUB_TOTAL = "subTotal";
  @SerializedName(SERIALIZED_NAME_SUB_TOTAL)
  private BigDecimal subTotal;

  /**
   * Gets or Sets paymentProviderId
   */
  @JsonAdapter(PaymentProviderIdEnum.Adapter.class)
  public enum PaymentProviderIdEnum {
    BRAINTREE("BRAINTREE"),
    
    COINBASE("COINBASE"),
    
    UNRECOGNIZED("UNRECOGNIZED");

    private String value;

    PaymentProviderIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentProviderIdEnum fromValue(String value) {
      for (PaymentProviderIdEnum b : PaymentProviderIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentProviderIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentProviderIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentProviderIdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentProviderIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_PROVIDER_ID = "paymentProviderId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_PROVIDER_ID)
  private PaymentProviderIdEnum paymentProviderId;


  public CreateOrderRequest itemTypes(List<TokenCategory> itemTypes) {
    
    this.itemTypes = itemTypes;
    return this;
  }

  public CreateOrderRequest addItemTypesItem(TokenCategory itemTypesItem) {
    if (this.itemTypes == null) {
      this.itemTypes = new ArrayList<TokenCategory>();
    }
    this.itemTypes.add(itemTypesItem);
    return this;
  }

   /**
   * Get itemTypes
   * @return itemTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"category\":\"blanko\",\"token\":\"seafarer.da\"}]", value = "")

  public List<TokenCategory> getItemTypes() {
    return itemTypes;
  }


  public void setItemTypes(List<TokenCategory> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public CreateOrderRequest metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CreateOrderRequest putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, Object>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"dgood_id\":1}", value = "")

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public CreateOrderRequest address(PostalAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostalAddress getAddress() {
    return address;
  }


  public void setAddress(PostalAddress address) {
    this.address = address;
  }


  public CreateOrderRequest platformUserId(String platformUserId) {
    
    this.platformUserId = platformUserId;
    return this;
  }

   /**
   * Get platformUserId
   * @return platformUserId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPlatformUserId() {
    return platformUserId;
  }


  public void setPlatformUserId(String platformUserId) {
    this.platformUserId = platformUserId;
  }


  public CreateOrderRequest requestIp(String requestIp) {
    
    this.requestIp = requestIp;
    return this;
  }

   /**
   * Get requestIp
   * @return requestIp
  **/
  @ApiModelProperty(example = "104.172.16.113", required = true, value = "")

  public String getRequestIp() {
    return requestIp;
  }


  public void setRequestIp(String requestIp) {
    this.requestIp = requestIp;
  }


  public CreateOrderRequest subTotal(BigDecimal subTotal) {
    
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(example = "19.99", required = true, value = "")

  public BigDecimal getSubTotal() {
    return subTotal;
  }


  public void setSubTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
  }


  public CreateOrderRequest paymentProviderId(PaymentProviderIdEnum paymentProviderId) {
    
    this.paymentProviderId = paymentProviderId;
    return this;
  }

   /**
   * Get paymentProviderId
   * @return paymentProviderId
  **/
  @ApiModelProperty(example = "BRAINTREE", required = true, value = "")

  public PaymentProviderIdEnum getPaymentProviderId() {
    return paymentProviderId;
  }


  public void setPaymentProviderId(PaymentProviderIdEnum paymentProviderId) {
    this.paymentProviderId = paymentProviderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequest createOrderRequest = (CreateOrderRequest) o;
    return Objects.equals(this.itemTypes, createOrderRequest.itemTypes) &&
        Objects.equals(this.metadata, createOrderRequest.metadata) &&
        Objects.equals(this.address, createOrderRequest.address) &&
        Objects.equals(this.platformUserId, createOrderRequest.platformUserId) &&
        Objects.equals(this.requestIp, createOrderRequest.requestIp) &&
        Objects.equals(this.subTotal, createOrderRequest.subTotal) &&
        Objects.equals(this.paymentProviderId, createOrderRequest.paymentProviderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemTypes, metadata, address, platformUserId, requestIp, subTotal, paymentProviderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequest {\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    platformUserId: ").append(toIndentedString(platformUserId)).append("\n");
    sb.append("    requestIp: ").append(toIndentedString(requestIp)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    paymentProviderId: ").append(toIndentedString(paymentProviderId)).append("\n");
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


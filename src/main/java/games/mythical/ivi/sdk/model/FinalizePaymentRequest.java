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
import games.mythical.ivi.sdk.model.PaymentData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FinalizePaymentRequest
 */
@JsonPropertyOrder({
  FinalizePaymentRequest.JSON_PROPERTY_ORDER_ID,
  FinalizePaymentRequest.JSON_PROPERTY_PAYMENT_PROVIDER_DATA
})

public class FinalizePaymentRequest {
  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private String orderId;

  public static final String JSON_PROPERTY_PAYMENT_PROVIDER_DATA = "paymentProviderData";
  private PaymentData paymentProviderData;


  public FinalizePaymentRequest orderId(String orderId) {
    
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


  public FinalizePaymentRequest paymentProviderData(PaymentData paymentProviderData) {
    
    this.paymentProviderData = paymentProviderData;
    return this;
  }

   /**
   * Get paymentProviderData
   * @return paymentProviderData
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_PROVIDER_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentData getPaymentProviderData() {
    return paymentProviderData;
  }


  public void setPaymentProviderData(PaymentData paymentProviderData) {
    this.paymentProviderData = paymentProviderData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinalizePaymentRequest finalizePaymentRequest = (FinalizePaymentRequest) o;
    return Objects.equals(this.orderId, finalizePaymentRequest.orderId) &&
        Objects.equals(this.paymentProviderData, finalizePaymentRequest.paymentProviderData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, paymentProviderData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalizePaymentRequest {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentProviderData: ").append(toIndentedString(paymentProviderData)).append("\n");
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


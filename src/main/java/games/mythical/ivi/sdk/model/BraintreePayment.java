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
 * BraintreePayment
 */
@JsonPropertyOrder({
  BraintreePayment.JSON_PROPERTY_BRAINTREE_PAYMENT_NONCE
})

public class BraintreePayment {
  public static final String JSON_PROPERTY_BRAINTREE_PAYMENT_NONCE = "braintreePaymentNonce";
  private String braintreePaymentNonce;


  public BraintreePayment braintreePaymentNonce(String braintreePaymentNonce) {
    
    this.braintreePaymentNonce = braintreePaymentNonce;
    return this;
  }

   /**
   * Get braintreePaymentNonce
   * @return braintreePaymentNonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAINTREE_PAYMENT_NONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBraintreePaymentNonce() {
    return braintreePaymentNonce;
  }


  public void setBraintreePaymentNonce(String braintreePaymentNonce) {
    this.braintreePaymentNonce = braintreePaymentNonce;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BraintreePayment braintreePayment = (BraintreePayment) o;
    return Objects.equals(this.braintreePaymentNonce, braintreePayment.braintreePaymentNonce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(braintreePaymentNonce);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BraintreePayment {\n");
    sb.append("    braintreePaymentNonce: ").append(toIndentedString(braintreePaymentNonce)).append("\n");
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


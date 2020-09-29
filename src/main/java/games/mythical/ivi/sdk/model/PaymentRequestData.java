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
import games.mythical.ivi.sdk.model.BraintreePaymentRequestData;
import games.mythical.ivi.sdk.model.CoinbasePaymentRequestData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PaymentRequestData
 */
@JsonPropertyOrder({
  PaymentRequestData.JSON_PROPERTY_BRAINTREE,
  PaymentRequestData.JSON_PROPERTY_COINBASE
})
@JsonTypeName("PaymentRequestData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentRequestData {
  public static final String JSON_PROPERTY_BRAINTREE = "braintree";
  private BraintreePaymentRequestData braintree;

  public static final String JSON_PROPERTY_COINBASE = "coinbase";
  private CoinbasePaymentRequestData coinbase;


  public PaymentRequestData braintree(BraintreePaymentRequestData braintree) {
    
    this.braintree = braintree;
    return this;
  }

   /**
   * Get braintree
   * @return braintree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAINTREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BraintreePaymentRequestData getBraintree() {
    return braintree;
  }


  public void setBraintree(BraintreePaymentRequestData braintree) {
    this.braintree = braintree;
  }


  public PaymentRequestData coinbase(CoinbasePaymentRequestData coinbase) {
    
    this.coinbase = coinbase;
    return this;
  }

   /**
   * Get coinbase
   * @return coinbase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COINBASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoinbasePaymentRequestData getCoinbase() {
    return coinbase;
  }


  public void setCoinbase(CoinbasePaymentRequestData coinbase) {
    this.coinbase = coinbase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequestData paymentRequestData = (PaymentRequestData) o;
    return Objects.equals(this.braintree, paymentRequestData.braintree) &&
        Objects.equals(this.coinbase, paymentRequestData.coinbase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(braintree, coinbase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestData {\n");
    sb.append("    braintree: ").append(toIndentedString(braintree)).append("\n");
    sb.append("    coinbase: ").append(toIndentedString(coinbase)).append("\n");
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


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
import games.mythical.ivi.sdk.model.BraintreeData;
import games.mythical.ivi.sdk.model.CoinbaseData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PaymentProviderData
 */
@JsonPropertyOrder({
  PaymentProviderData.JSON_PROPERTY_BRAINTREE,
  PaymentProviderData.JSON_PROPERTY_COINBASE
})
@JsonTypeName("PaymentProviderData")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentProviderData {
  public static final String JSON_PROPERTY_BRAINTREE = "braintree";
  private BraintreeData braintree;

  public static final String JSON_PROPERTY_COINBASE = "coinbase";
  private CoinbaseData coinbase;


  public PaymentProviderData braintree(BraintreeData braintree) {
    
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

  public BraintreeData getBraintree() {
    return braintree;
  }


  public void setBraintree(BraintreeData braintree) {
    this.braintree = braintree;
  }


  public PaymentProviderData coinbase(CoinbaseData coinbase) {
    
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

  public CoinbaseData getCoinbase() {
    return coinbase;
  }


  public void setCoinbase(CoinbaseData coinbase) {
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
    PaymentProviderData paymentProviderData = (PaymentProviderData) o;
    return Objects.equals(this.braintree, paymentProviderData.braintree) &&
        Objects.equals(this.coinbase, paymentProviderData.coinbase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(braintree, coinbase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProviderData {\n");
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


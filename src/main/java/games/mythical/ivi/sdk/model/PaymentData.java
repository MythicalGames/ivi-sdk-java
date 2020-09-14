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
import games.mythical.ivi.sdk.model.BraintreePayment;
import games.mythical.ivi.sdk.model.CoinbasePayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-14T14:31:49.595906-07:00[America/Los_Angeles]")
public class PaymentData {
  public static final String SERIALIZED_NAME_BRAINTREE = "braintree";
  @SerializedName(SERIALIZED_NAME_BRAINTREE)
  private BraintreePayment braintree;

  public static final String SERIALIZED_NAME_COINBASE = "coinbase";
  @SerializedName(SERIALIZED_NAME_COINBASE)
  private CoinbasePayment coinbase;


  public PaymentData braintree(BraintreePayment braintree) {
    
    this.braintree = braintree;
    return this;
  }

   /**
   * Get braintree
   * @return braintree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BraintreePayment getBraintree() {
    return braintree;
  }


  public void setBraintree(BraintreePayment braintree) {
    this.braintree = braintree;
  }


  public PaymentData coinbase(CoinbasePayment coinbase) {
    
    this.coinbase = coinbase;
    return this;
  }

   /**
   * Get coinbase
   * @return coinbase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CoinbasePayment getCoinbase() {
    return coinbase;
  }


  public void setCoinbase(CoinbasePayment coinbase) {
    this.coinbase = coinbase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentData paymentData = (PaymentData) o;
    return Objects.equals(this.braintree, paymentData.braintree) &&
        Objects.equals(this.coinbase, paymentData.coinbase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(braintree, coinbase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentData {\n");
    sb.append("    braintree: ").append(toIndentedString(braintree)).append("\n");
    sb.append("    coinbase: ").append(toIndentedString(coinbase)).append("\n");
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


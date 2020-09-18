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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CoinbaseData
 */
@JsonPropertyOrder({
  CoinbaseData.JSON_PROPERTY_COINBASE_TRANSACTION_ID
})
@JsonTypeName("CoinbaseData")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CoinbaseData {
  public static final String JSON_PROPERTY_COINBASE_TRANSACTION_ID = "coinbaseTransactionId";
  private String coinbaseTransactionId;


  public CoinbaseData coinbaseTransactionId(String coinbaseTransactionId) {
    
    this.coinbaseTransactionId = coinbaseTransactionId;
    return this;
  }

   /**
   * Get coinbaseTransactionId
   * @return coinbaseTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COINBASE_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoinbaseTransactionId() {
    return coinbaseTransactionId;
  }


  public void setCoinbaseTransactionId(String coinbaseTransactionId) {
    this.coinbaseTransactionId = coinbaseTransactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseData coinbaseData = (CoinbaseData) o;
    return Objects.equals(this.coinbaseTransactionId, coinbaseData.coinbaseTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coinbaseTransactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseData {\n");
    sb.append("    coinbaseTransactionId: ").append(toIndentedString(coinbaseTransactionId)).append("\n");
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


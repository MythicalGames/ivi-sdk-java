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
 * BraintreeData
 */
@JsonPropertyOrder({
  BraintreeData.JSON_PROPERTY_BRAINTREE_CLIENT_TOKEN
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:43:19.928192-07:00[America/Los_Angeles]")
public class BraintreeData {
  public static final String JSON_PROPERTY_BRAINTREE_CLIENT_TOKEN = "braintreeClientToken";
  private String braintreeClientToken;


  public BraintreeData braintreeClientToken(String braintreeClientToken) {
    
    this.braintreeClientToken = braintreeClientToken;
    return this;
  }

   /**
   * Get braintreeClientToken
   * @return braintreeClientToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAINTREE_CLIENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBraintreeClientToken() {
    return braintreeClientToken;
  }


  public void setBraintreeClientToken(String braintreeClientToken) {
    this.braintreeClientToken = braintreeClientToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BraintreeData braintreeData = (BraintreeData) o;
    return Objects.equals(this.braintreeClientToken, braintreeData.braintreeClientToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(braintreeClientToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BraintreeData {\n");
    sb.append("    braintreeClientToken: ").append(toIndentedString(braintreeClientToken)).append("\n");
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


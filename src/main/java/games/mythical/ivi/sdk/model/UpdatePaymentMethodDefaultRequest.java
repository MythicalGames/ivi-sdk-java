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
 * UpdatePaymentMethodDefaultRequest
 */
@JsonPropertyOrder({
  UpdatePaymentMethodDefaultRequest.JSON_PROPERTY_PAYMENT_METHOD_TOKEN,
  UpdatePaymentMethodDefaultRequest.JSON_PROPERTY_CUSTOMER_ID,
  UpdatePaymentMethodDefaultRequest.JSON_PROPERTY_DEFAULT_OPTION
})
@JsonTypeName("UpdatePaymentMethodDefaultRequest")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdatePaymentMethodDefaultRequest {
  public static final String JSON_PROPERTY_PAYMENT_METHOD_TOKEN = "paymentMethodToken";
  private String paymentMethodToken;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  public static final String JSON_PROPERTY_DEFAULT_OPTION = "defaultOption";
  private Boolean defaultOption;


  public UpdatePaymentMethodDefaultRequest paymentMethodToken(String paymentMethodToken) {
    
    this.paymentMethodToken = paymentMethodToken;
    return this;
  }

   /**
   * Get paymentMethodToken
   * @return paymentMethodToken
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentMethodToken() {
    return paymentMethodToken;
  }


  public void setPaymentMethodToken(String paymentMethodToken) {
    this.paymentMethodToken = paymentMethodToken;
  }


  public UpdatePaymentMethodDefaultRequest customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public UpdatePaymentMethodDefaultRequest defaultOption(Boolean defaultOption) {
    
    this.defaultOption = defaultOption;
    return this;
  }

   /**
   * Get defaultOption
   * @return defaultOption
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_OPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDefaultOption() {
    return defaultOption;
  }


  public void setDefaultOption(Boolean defaultOption) {
    this.defaultOption = defaultOption;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentMethodDefaultRequest updatePaymentMethodDefaultRequest = (UpdatePaymentMethodDefaultRequest) o;
    return Objects.equals(this.paymentMethodToken, updatePaymentMethodDefaultRequest.paymentMethodToken) &&
        Objects.equals(this.customerId, updatePaymentMethodDefaultRequest.customerId) &&
        Objects.equals(this.defaultOption, updatePaymentMethodDefaultRequest.defaultOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodToken, customerId, defaultOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentMethodDefaultRequest {\n");
    sb.append("    paymentMethodToken: ").append(toIndentedString(paymentMethodToken)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    defaultOption: ").append(toIndentedString(defaultOption)).append("\n");
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


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
 * BitPayPaymentRequestData
 */
@JsonPropertyOrder({
  BitPayPaymentRequestData.JSON_PROPERTY_INVOICE_ID
})
@JsonTypeName("BitPayPaymentRequestData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BitPayPaymentRequestData {
  public static final String JSON_PROPERTY_INVOICE_ID = "invoiceId";
  private String invoiceId;


  public BitPayPaymentRequestData invoiceId(String invoiceId) {
    
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceId() {
    return invoiceId;
  }


  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BitPayPaymentRequestData bitPayPaymentRequestData = (BitPayPaymentRequestData) o;
    return Objects.equals(this.invoiceId, bitPayPaymentRequestData.invoiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitPayPaymentRequestData {\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
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


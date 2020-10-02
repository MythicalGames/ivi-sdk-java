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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * BitPayOrderDto
 */
@JsonPropertyOrder({
  BitPayOrderDto.JSON_PROPERTY_INVOICE
})
@JsonTypeName("BitPayOrderDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BitPayOrderDto {
  public static final String JSON_PROPERTY_INVOICE = "invoice";
  private Map<String, Object> invoice = null;


  public BitPayOrderDto invoice(Map<String, Object> invoice) {
    
    this.invoice = invoice;
    return this;
  }

  public BitPayOrderDto putInvoiceItem(String key, Object invoiceItem) {
    if (this.invoice == null) {
      this.invoice = new HashMap<>();
    }
    this.invoice.put(key, invoiceItem);
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getInvoice() {
    return invoice;
  }


  public void setInvoice(Map<String, Object> invoice) {
    this.invoice = invoice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BitPayOrderDto bitPayOrderDto = (BitPayOrderDto) o;
    return Objects.equals(this.invoice, bitPayOrderDto.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitPayOrderDto {\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
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


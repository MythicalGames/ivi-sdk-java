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
 * PaymentDto
 */
@JsonPropertyOrder({
  PaymentDto.JSON_PROPERTY_SUCCESS,
  PaymentDto.JSON_PROPERTY_PAYMENT_INSTRUMENT_TYPE,
  PaymentDto.JSON_PROPERTY_STATUS
})
@JsonTypeName("PaymentDto")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentDto {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_TYPE = "paymentInstrumentType";
  private String paymentInstrumentType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;


  public PaymentDto success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public PaymentDto paymentInstrumentType(String paymentInstrumentType) {
    
    this.paymentInstrumentType = paymentInstrumentType;
    return this;
  }

   /**
   * Get paymentInstrumentType
   * @return paymentInstrumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentInstrumentType() {
    return paymentInstrumentType;
  }


  public void setPaymentInstrumentType(String paymentInstrumentType) {
    this.paymentInstrumentType = paymentInstrumentType;
  }


  public PaymentDto status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDto paymentDto = (PaymentDto) o;
    return Objects.equals(this.success, paymentDto.success) &&
        Objects.equals(this.paymentInstrumentType, paymentDto.paymentInstrumentType) &&
        Objects.equals(this.status, paymentDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, paymentInstrumentType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDto {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    paymentInstrumentType: ").append(toIndentedString(paymentInstrumentType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


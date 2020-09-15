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
import games.mythical.ivi.sdk.model.PostalAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PaymentMethodDto
 */
@JsonPropertyOrder({
  PaymentMethodDto.JSON_PROPERTY_ADDRESS,
  PaymentMethodDto.JSON_PROPERTY_DEFAULT_OPTION,
  PaymentMethodDto.JSON_PROPERTY_TYPE,
  PaymentMethodDto.JSON_PROPERTY_TOKEN
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:53:22.361116-07:00[America/Los_Angeles]")
public class PaymentMethodDto {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private PostalAddress address;

  public static final String JSON_PROPERTY_DEFAULT_OPTION = "defaultOption";
  private Boolean defaultOption;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;


  public PaymentMethodDto address(PostalAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostalAddress getAddress() {
    return address;
  }


  public void setAddress(PostalAddress address) {
    this.address = address;
  }


  public PaymentMethodDto defaultOption(Boolean defaultOption) {
    
    this.defaultOption = defaultOption;
    return this;
  }

   /**
   * Get defaultOption
   * @return defaultOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultOption() {
    return defaultOption;
  }


  public void setDefaultOption(Boolean defaultOption) {
    this.defaultOption = defaultOption;
  }


  public PaymentMethodDto type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PaymentMethodDto token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodDto paymentMethodDto = (PaymentMethodDto) o;
    return Objects.equals(this.address, paymentMethodDto.address) &&
        Objects.equals(this.defaultOption, paymentMethodDto.defaultOption) &&
        Objects.equals(this.type, paymentMethodDto.type) &&
        Objects.equals(this.token, paymentMethodDto.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, defaultOption, type, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodDto {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    defaultOption: ").append(toIndentedString(defaultOption)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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


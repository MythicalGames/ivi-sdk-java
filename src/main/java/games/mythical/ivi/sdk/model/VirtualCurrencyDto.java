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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * VirtualCurrencyDto
 */
@JsonPropertyOrder({
  VirtualCurrencyDto.JSON_PROPERTY_CREATED_BY,
  VirtualCurrencyDto.JSON_PROPERTY_CREATED_TIMESTAMP,
  VirtualCurrencyDto.JSON_PROPERTY_NAME,
  VirtualCurrencyDto.JSON_PROPERTY_BASE_CONVERSION,
  VirtualCurrencyDto.JSON_PROPERTY_FIAT,
  VirtualCurrencyDto.JSON_PROPERTY_ABBREVIATION,
  VirtualCurrencyDto.JSON_PROPERTY_BASE_CURRENCY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-17T21:49:06.785396-07:00[America/Los_Angeles]")
public class VirtualCurrencyDto {
  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private String createdTimestamp;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BASE_CONVERSION = "baseConversion";
  private BigDecimal baseConversion;

  public static final String JSON_PROPERTY_FIAT = "fiat";
  private Boolean fiat;

  public static final String JSON_PROPERTY_ABBREVIATION = "abbreviation";
  private String abbreviation;

  public static final String JSON_PROPERTY_BASE_CURRENCY = "baseCurrency";
  private Boolean baseCurrency;


  public VirtualCurrencyDto createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public VirtualCurrencyDto createdTimestamp(String createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Get createdTimestamp
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(String createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public VirtualCurrencyDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VirtualCurrencyDto baseConversion(BigDecimal baseConversion) {
    
    this.baseConversion = baseConversion;
    return this;
  }

   /**
   * Get baseConversion
   * @return baseConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASE_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBaseConversion() {
    return baseConversion;
  }


  public void setBaseConversion(BigDecimal baseConversion) {
    this.baseConversion = baseConversion;
  }


  public VirtualCurrencyDto fiat(Boolean fiat) {
    
    this.fiat = fiat;
    return this;
  }

   /**
   * Get fiat
   * @return fiat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFiat() {
    return fiat;
  }


  public void setFiat(Boolean fiat) {
    this.fiat = fiat;
  }


  public VirtualCurrencyDto abbreviation(String abbreviation) {
    
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * Get abbreviation
   * @return abbreviation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ABBREVIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAbbreviation() {
    return abbreviation;
  }


  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }


  public VirtualCurrencyDto baseCurrency(Boolean baseCurrency) {
    
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * Get baseCurrency
   * @return baseCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASE_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBaseCurrency() {
    return baseCurrency;
  }


  public void setBaseCurrency(Boolean baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualCurrencyDto virtualCurrencyDto = (VirtualCurrencyDto) o;
    return Objects.equals(this.createdBy, virtualCurrencyDto.createdBy) &&
        Objects.equals(this.createdTimestamp, virtualCurrencyDto.createdTimestamp) &&
        Objects.equals(this.name, virtualCurrencyDto.name) &&
        Objects.equals(this.baseConversion, virtualCurrencyDto.baseConversion) &&
        Objects.equals(this.fiat, virtualCurrencyDto.fiat) &&
        Objects.equals(this.abbreviation, virtualCurrencyDto.abbreviation) &&
        Objects.equals(this.baseCurrency, virtualCurrencyDto.baseCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdTimestamp, name, baseConversion, fiat, abbreviation, baseCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualCurrencyDto {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseConversion: ").append(toIndentedString(baseConversion)).append("\n");
    sb.append("    fiat: ").append(toIndentedString(fiat)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
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


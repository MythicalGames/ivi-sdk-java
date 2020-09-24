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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SalesTaxInfoDto
 */
@JsonPropertyOrder({
  SalesTaxInfoDto.JSON_PROPERTY_ZIP,
  SalesTaxInfoDto.JSON_PROPERTY_COUNTY_RATE,
  SalesTaxInfoDto.JSON_PROPERTY_COMBINED_TAX_RATE,
  SalesTaxInfoDto.JSON_PROPERTY_COMBINED_DISTRICT_RATE,
  SalesTaxInfoDto.JSON_PROPERTY_CITY,
  SalesTaxInfoDto.JSON_PROPERTY_COUNTY,
  SalesTaxInfoDto.JSON_PROPERTY_STATE,
  SalesTaxInfoDto.JSON_PROPERTY_STATE_RATE,
  SalesTaxInfoDto.JSON_PROPERTY_EXEMPT,
  SalesTaxInfoDto.JSON_PROPERTY_CITY_RATE
})
@JsonTypeName("SalesTaxInfoDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SalesTaxInfoDto {
  public static final String JSON_PROPERTY_ZIP = "zip";
  private String zip;

  public static final String JSON_PROPERTY_COUNTY_RATE = "countyRate";
  private BigDecimal countyRate;

  public static final String JSON_PROPERTY_COMBINED_TAX_RATE = "combinedTaxRate";
  private BigDecimal combinedTaxRate;

  public static final String JSON_PROPERTY_COMBINED_DISTRICT_RATE = "combinedDistrictRate";
  private BigDecimal combinedDistrictRate;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTY = "county";
  private String county;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_STATE_RATE = "stateRate";
  private BigDecimal stateRate;

  public static final String JSON_PROPERTY_EXEMPT = "exempt";
  private Boolean exempt;

  public static final String JSON_PROPERTY_CITY_RATE = "cityRate";
  private BigDecimal cityRate;


  public SalesTaxInfoDto zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    this.zip = zip;
  }


  public SalesTaxInfoDto countyRate(BigDecimal countyRate) {
    
    this.countyRate = countyRate;
    return this;
  }

   /**
   * Get countyRate
   * @return countyRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCountyRate() {
    return countyRate;
  }


  public void setCountyRate(BigDecimal countyRate) {
    this.countyRate = countyRate;
  }


  public SalesTaxInfoDto combinedTaxRate(BigDecimal combinedTaxRate) {
    
    this.combinedTaxRate = combinedTaxRate;
    return this;
  }

   /**
   * Get combinedTaxRate
   * @return combinedTaxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMBINED_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCombinedTaxRate() {
    return combinedTaxRate;
  }


  public void setCombinedTaxRate(BigDecimal combinedTaxRate) {
    this.combinedTaxRate = combinedTaxRate;
  }


  public SalesTaxInfoDto combinedDistrictRate(BigDecimal combinedDistrictRate) {
    
    this.combinedDistrictRate = combinedDistrictRate;
    return this;
  }

   /**
   * Get combinedDistrictRate
   * @return combinedDistrictRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMBINED_DISTRICT_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCombinedDistrictRate() {
    return combinedDistrictRate;
  }


  public void setCombinedDistrictRate(BigDecimal combinedDistrictRate) {
    this.combinedDistrictRate = combinedDistrictRate;
  }


  public SalesTaxInfoDto city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public SalesTaxInfoDto county(String county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCounty() {
    return county;
  }


  public void setCounty(String county) {
    this.county = county;
  }


  public SalesTaxInfoDto state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public SalesTaxInfoDto stateRate(BigDecimal stateRate) {
    
    this.stateRate = stateRate;
    return this;
  }

   /**
   * Get stateRate
   * @return stateRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStateRate() {
    return stateRate;
  }


  public void setStateRate(BigDecimal stateRate) {
    this.stateRate = stateRate;
  }


  public SalesTaxInfoDto exempt(Boolean exempt) {
    
    this.exempt = exempt;
    return this;
  }

   /**
   * Get exempt
   * @return exempt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExempt() {
    return exempt;
  }


  public void setExempt(Boolean exempt) {
    this.exempt = exempt;
  }


  public SalesTaxInfoDto cityRate(BigDecimal cityRate) {
    
    this.cityRate = cityRate;
    return this;
  }

   /**
   * Get cityRate
   * @return cityRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CITY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCityRate() {
    return cityRate;
  }


  public void setCityRate(BigDecimal cityRate) {
    this.cityRate = cityRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesTaxInfoDto salesTaxInfoDto = (SalesTaxInfoDto) o;
    return Objects.equals(this.zip, salesTaxInfoDto.zip) &&
        Objects.equals(this.countyRate, salesTaxInfoDto.countyRate) &&
        Objects.equals(this.combinedTaxRate, salesTaxInfoDto.combinedTaxRate) &&
        Objects.equals(this.combinedDistrictRate, salesTaxInfoDto.combinedDistrictRate) &&
        Objects.equals(this.city, salesTaxInfoDto.city) &&
        Objects.equals(this.county, salesTaxInfoDto.county) &&
        Objects.equals(this.state, salesTaxInfoDto.state) &&
        Objects.equals(this.stateRate, salesTaxInfoDto.stateRate) &&
        Objects.equals(this.exempt, salesTaxInfoDto.exempt) &&
        Objects.equals(this.cityRate, salesTaxInfoDto.cityRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zip, countyRate, combinedTaxRate, combinedDistrictRate, city, county, state, stateRate, exempt, cityRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTaxInfoDto {\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    countyRate: ").append(toIndentedString(countyRate)).append("\n");
    sb.append("    combinedTaxRate: ").append(toIndentedString(combinedTaxRate)).append("\n");
    sb.append("    combinedDistrictRate: ").append(toIndentedString(combinedDistrictRate)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateRate: ").append(toIndentedString(stateRate)).append("\n");
    sb.append("    exempt: ").append(toIndentedString(exempt)).append("\n");
    sb.append("    cityRate: ").append(toIndentedString(cityRate)).append("\n");
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


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
 * PostalAddress
 */
@JsonPropertyOrder({
  PostalAddress.JSON_PROPERTY_FIRST_NAME,
  PostalAddress.JSON_PROPERTY_LAST_NAME,
  PostalAddress.JSON_PROPERTY_COUNTRY_ISO_ALPHA2,
  PostalAddress.JSON_PROPERTY_CITY,
  PostalAddress.JSON_PROPERTY_POSTAL_CODE,
  PostalAddress.JSON_PROPERTY_ADDRESS_LINE1,
  PostalAddress.JSON_PROPERTY_ADDRESS_LINE2,
  PostalAddress.JSON_PROPERTY_STATE,
  PostalAddress.JSON_PROPERTY_COUNTRY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T09:19:26.551556-07:00[America/Los_Angeles]")
public class PostalAddress {
  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_COUNTRY_ISO_ALPHA2 = "countryIsoAlpha2";
  private String countryIsoAlpha2;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "addressLine1";
  private String addressLine1;

  public static final String JSON_PROPERTY_ADDRESS_LINE2 = "addressLine2";
  private String addressLine2;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY_NAME = "countryName";
  private String countryName;


  public PostalAddress firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PostalAddress lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public PostalAddress countryIsoAlpha2(String countryIsoAlpha2) {
    
    this.countryIsoAlpha2 = countryIsoAlpha2;
    return this;
  }

   /**
   * Get countryIsoAlpha2
   * @return countryIsoAlpha2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_ISO_ALPHA2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryIsoAlpha2() {
    return countryIsoAlpha2;
  }


  public void setCountryIsoAlpha2(String countryIsoAlpha2) {
    this.countryIsoAlpha2 = countryIsoAlpha2;
  }


  public PostalAddress city(String city) {
    
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


  public PostalAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PostalAddress addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public PostalAddress addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public PostalAddress state(String state) {
    
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


  public PostalAddress countryName(String countryName) {
    
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryName() {
    return countryName;
  }


  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostalAddress postalAddress = (PostalAddress) o;
    return Objects.equals(this.firstName, postalAddress.firstName) &&
        Objects.equals(this.lastName, postalAddress.lastName) &&
        Objects.equals(this.countryIsoAlpha2, postalAddress.countryIsoAlpha2) &&
        Objects.equals(this.city, postalAddress.city) &&
        Objects.equals(this.postalCode, postalAddress.postalCode) &&
        Objects.equals(this.addressLine1, postalAddress.addressLine1) &&
        Objects.equals(this.addressLine2, postalAddress.addressLine2) &&
        Objects.equals(this.state, postalAddress.state) &&
        Objects.equals(this.countryName, postalAddress.countryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, countryIsoAlpha2, city, postalCode, addressLine1, addressLine2, state, countryName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalAddress {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    countryIsoAlpha2: ").append(toIndentedString(countryIsoAlpha2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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


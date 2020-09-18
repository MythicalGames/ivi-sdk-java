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
 * UpdateCustomerRequest
 */
@JsonPropertyOrder({
  UpdateCustomerRequest.JSON_PROPERTY_FIRST_NAME,
  UpdateCustomerRequest.JSON_PROPERTY_LAST_NAME,
  UpdateCustomerRequest.JSON_PROPERTY_WEBSITE,
  UpdateCustomerRequest.JSON_PROPERTY_PHONE,
  UpdateCustomerRequest.JSON_PROPERTY_CUSTOMER_ID,
  UpdateCustomerRequest.JSON_PROPERTY_PAYMENT_METHOD_NONCE,
  UpdateCustomerRequest.JSON_PROPERTY_COMPANY,
  UpdateCustomerRequest.JSON_PROPERTY_FAX,
  UpdateCustomerRequest.JSON_PROPERTY_EMAIL
})
@JsonTypeName("UpdateCustomerRequest")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCustomerRequest {
  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_NONCE = "paymentMethodNonce";
  private String paymentMethodNonce;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_FAX = "fax";
  private String fax;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;


  public UpdateCustomerRequest firstName(String firstName) {
    
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


  public UpdateCustomerRequest lastName(String lastName) {
    
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


  public UpdateCustomerRequest website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public UpdateCustomerRequest phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public UpdateCustomerRequest customerId(String customerId) {
    
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


  public UpdateCustomerRequest paymentMethodNonce(String paymentMethodNonce) {
    
    this.paymentMethodNonce = paymentMethodNonce;
    return this;
  }

   /**
   * Get paymentMethodNonce
   * @return paymentMethodNonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_NONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethodNonce() {
    return paymentMethodNonce;
  }


  public void setPaymentMethodNonce(String paymentMethodNonce) {
    this.paymentMethodNonce = paymentMethodNonce;
  }


  public UpdateCustomerRequest company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public UpdateCustomerRequest fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFax() {
    return fax;
  }


  public void setFax(String fax) {
    this.fax = fax;
  }


  public UpdateCustomerRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerRequest updateCustomerRequest = (UpdateCustomerRequest) o;
    return Objects.equals(this.firstName, updateCustomerRequest.firstName) &&
        Objects.equals(this.lastName, updateCustomerRequest.lastName) &&
        Objects.equals(this.website, updateCustomerRequest.website) &&
        Objects.equals(this.phone, updateCustomerRequest.phone) &&
        Objects.equals(this.customerId, updateCustomerRequest.customerId) &&
        Objects.equals(this.paymentMethodNonce, updateCustomerRequest.paymentMethodNonce) &&
        Objects.equals(this.company, updateCustomerRequest.company) &&
        Objects.equals(this.fax, updateCustomerRequest.fax) &&
        Objects.equals(this.email, updateCustomerRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, website, phone, customerId, paymentMethodNonce, company, fax, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    paymentMethodNonce: ").append(toIndentedString(paymentMethodNonce)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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


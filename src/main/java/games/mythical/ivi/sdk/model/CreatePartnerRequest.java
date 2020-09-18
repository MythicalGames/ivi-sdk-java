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
 * CreatePartnerRequest
 */
@JsonPropertyOrder({
  CreatePartnerRequest.JSON_PROPERTY_FIRST_NAME,
  CreatePartnerRequest.JSON_PROPERTY_LAST_NAME,
  CreatePartnerRequest.JSON_PROPERTY_MANAGER_EMAIL,
  CreatePartnerRequest.JSON_PROPERTY_NOTES,
  CreatePartnerRequest.JSON_PROPERTY_MIDDLE_NAME,
  CreatePartnerRequest.JSON_PROPERTY_COMPANY,
  CreatePartnerRequest.JSON_PROPERTY_MANAGER_NAME,
  CreatePartnerRequest.JSON_PROPERTY_EMAIL
})

public class CreatePartnerRequest {
  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_MANAGER_EMAIL = "managerEmail";
  private String managerEmail;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private String middleName;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_MANAGER_NAME = "managerName";
  private String managerName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;


  public CreatePartnerRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CreatePartnerRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CreatePartnerRequest managerEmail(String managerEmail) {
    
    this.managerEmail = managerEmail;
    return this;
  }

   /**
   * Get managerEmail
   * @return managerEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "help@mythical.games", value = "")
  @JsonProperty(JSON_PROPERTY_MANAGER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManagerEmail() {
    return managerEmail;
  }


  public void setManagerEmail(String managerEmail) {
    this.managerEmail = managerEmail;
  }


  public CreatePartnerRequest notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public CreatePartnerRequest middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public CreatePartnerRequest company(String company) {
    
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


  public CreatePartnerRequest managerName(String managerName) {
    
    this.managerName = managerName;
    return this;
  }

   /**
   * Get managerName
   * @return managerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANAGER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManagerName() {
    return managerName;
  }


  public void setManagerName(String managerName) {
    this.managerName = managerName;
  }


  public CreatePartnerRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "partner@epic.com", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePartnerRequest createPartnerRequest = (CreatePartnerRequest) o;
    return Objects.equals(this.firstName, createPartnerRequest.firstName) &&
        Objects.equals(this.lastName, createPartnerRequest.lastName) &&
        Objects.equals(this.managerEmail, createPartnerRequest.managerEmail) &&
        Objects.equals(this.notes, createPartnerRequest.notes) &&
        Objects.equals(this.middleName, createPartnerRequest.middleName) &&
        Objects.equals(this.company, createPartnerRequest.company) &&
        Objects.equals(this.managerName, createPartnerRequest.managerName) &&
        Objects.equals(this.email, createPartnerRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, managerEmail, notes, middleName, company, managerName, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePartnerRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    managerEmail: ").append(toIndentedString(managerEmail)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    managerName: ").append(toIndentedString(managerName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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


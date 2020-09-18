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
 * PartnerDto
 */
@JsonPropertyOrder({
  PartnerDto.JSON_PROPERTY_ORGANIZATION_ID,
  PartnerDto.JSON_PROPERTY_FIRST_NAME,
  PartnerDto.JSON_PROPERTY_LAST_NAME,
  PartnerDto.JSON_PROPERTY_MANAGER_EMAIL,
  PartnerDto.JSON_PROPERTY_NOTES,
  PartnerDto.JSON_PROPERTY_CREATED_BY,
  PartnerDto.JSON_PROPERTY_CREATED_TIMESTAMP,
  PartnerDto.JSON_PROPERTY_MIDDLE_NAME,
  PartnerDto.JSON_PROPERTY_COMPANY,
  PartnerDto.JSON_PROPERTY_ID,
  PartnerDto.JSON_PROPERTY_MANAGER_NAME,
  PartnerDto.JSON_PROPERTY_EMAIL
})

public class PartnerDto {
  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organizationId";
  private String organizationId;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_MANAGER_EMAIL = "managerEmail";
  private String managerEmail;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private Long createdTimestamp;

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private String middleName;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MANAGER_NAME = "managerName";
  private String managerName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;


  public PartnerDto organizationId(String organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public PartnerDto firstName(String firstName) {
    
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


  public PartnerDto lastName(String lastName) {
    
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


  public PartnerDto managerEmail(String managerEmail) {
    
    this.managerEmail = managerEmail;
    return this;
  }

   /**
   * Get managerEmail
   * @return managerEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANAGER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManagerEmail() {
    return managerEmail;
  }


  public void setManagerEmail(String managerEmail) {
    this.managerEmail = managerEmail;
  }


  public PartnerDto notes(String notes) {
    
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


  public PartnerDto createdBy(String createdBy) {
    
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


  public PartnerDto createdTimestamp(Long createdTimestamp) {
    
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

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public PartnerDto middleName(String middleName) {
    
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


  public PartnerDto company(String company) {
    
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


  public PartnerDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PartnerDto managerName(String managerName) {
    
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


  public PartnerDto email(String email) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerDto partnerDto = (PartnerDto) o;
    return Objects.equals(this.organizationId, partnerDto.organizationId) &&
        Objects.equals(this.firstName, partnerDto.firstName) &&
        Objects.equals(this.lastName, partnerDto.lastName) &&
        Objects.equals(this.managerEmail, partnerDto.managerEmail) &&
        Objects.equals(this.notes, partnerDto.notes) &&
        Objects.equals(this.createdBy, partnerDto.createdBy) &&
        Objects.equals(this.createdTimestamp, partnerDto.createdTimestamp) &&
        Objects.equals(this.middleName, partnerDto.middleName) &&
        Objects.equals(this.company, partnerDto.company) &&
        Objects.equals(this.id, partnerDto.id) &&
        Objects.equals(this.managerName, partnerDto.managerName) &&
        Objects.equals(this.email, partnerDto.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, firstName, lastName, managerEmail, notes, createdBy, createdTimestamp, middleName, company, id, managerName, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerDto {\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    managerEmail: ").append(toIndentedString(managerEmail)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


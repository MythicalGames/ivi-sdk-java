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
 * UpdateMythicalUserRequest
 */
@JsonPropertyOrder({
  UpdateMythicalUserRequest.JSON_PROPERTY_FIRST_NAME,
  UpdateMythicalUserRequest.JSON_PROPERTY_LAST_NAME,
  UpdateMythicalUserRequest.JSON_PROPERTY_BIRTHDATE,
  UpdateMythicalUserRequest.JSON_PROPERTY_EMAIL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:53:22.361116-07:00[America/Los_Angeles]")
public class UpdateMythicalUserRequest {
  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_BIRTHDATE = "birthdate";
  private String birthdate;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;


  public UpdateMythicalUserRequest firstName(String firstName) {
    
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


  public UpdateMythicalUserRequest lastName(String lastName) {
    
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


  public UpdateMythicalUserRequest birthdate(String birthdate) {
    
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Get birthdate
   * @return birthdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIRTHDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBirthdate() {
    return birthdate;
  }


  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }


  public UpdateMythicalUserRequest email(String email) {
    
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
    UpdateMythicalUserRequest updateMythicalUserRequest = (UpdateMythicalUserRequest) o;
    return Objects.equals(this.firstName, updateMythicalUserRequest.firstName) &&
        Objects.equals(this.lastName, updateMythicalUserRequest.lastName) &&
        Objects.equals(this.birthdate, updateMythicalUserRequest.birthdate) &&
        Objects.equals(this.email, updateMythicalUserRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, birthdate, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMythicalUserRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
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


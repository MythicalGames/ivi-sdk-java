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
 * CreateMythicalUserRequest
 */
@JsonPropertyOrder({
  CreateMythicalUserRequest.JSON_PROPERTY_FIRST_NAME,
  CreateMythicalUserRequest.JSON_PROPERTY_LAST_NAME,
  CreateMythicalUserRequest.JSON_PROPERTY_BIRTHDATE,
  CreateMythicalUserRequest.JSON_PROPERTY_EMAIL
})
@JsonTypeName("CreateMythicalUserRequest")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateMythicalUserRequest {
  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_BIRTHDATE = "birthdate";
  private String birthdate;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;


  public CreateMythicalUserRequest firstName(String firstName) {
    
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


  public CreateMythicalUserRequest lastName(String lastName) {
    
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


  public CreateMythicalUserRequest birthdate(String birthdate) {
    
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Get birthdate
   * @return birthdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000-03-11", value = "")
  @JsonProperty(JSON_PROPERTY_BIRTHDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBirthdate() {
    return birthdate;
  }


  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }


  public CreateMythicalUserRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
    CreateMythicalUserRequest createMythicalUserRequest = (CreateMythicalUserRequest) o;
    return Objects.equals(this.firstName, createMythicalUserRequest.firstName) &&
        Objects.equals(this.lastName, createMythicalUserRequest.lastName) &&
        Objects.equals(this.birthdate, createMythicalUserRequest.birthdate) &&
        Objects.equals(this.email, createMythicalUserRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, birthdate, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMythicalUserRequest {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


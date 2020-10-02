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
 * CallbackDto
 */
@JsonPropertyOrder({
  CallbackDto.JSON_PROPERTY_AUTH_HEADER_KEY,
  CallbackDto.JSON_PROPERTY_AUTH_HEADER_VALUE,
  CallbackDto.JSON_PROPERTY_URL
})
@JsonTypeName("CallbackDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallbackDto {
  public static final String JSON_PROPERTY_AUTH_HEADER_KEY = "authHeaderKey";
  private String authHeaderKey;

  public static final String JSON_PROPERTY_AUTH_HEADER_VALUE = "authHeaderValue";
  private String authHeaderValue;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;


  public CallbackDto authHeaderKey(String authHeaderKey) {
    
    this.authHeaderKey = authHeaderKey;
    return this;
  }

   /**
   * Get authHeaderKey
   * @return authHeaderKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_HEADER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthHeaderKey() {
    return authHeaderKey;
  }


  public void setAuthHeaderKey(String authHeaderKey) {
    this.authHeaderKey = authHeaderKey;
  }


  public CallbackDto authHeaderValue(String authHeaderValue) {
    
    this.authHeaderValue = authHeaderValue;
    return this;
  }

   /**
   * Get authHeaderValue
   * @return authHeaderValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_HEADER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthHeaderValue() {
    return authHeaderValue;
  }


  public void setAuthHeaderValue(String authHeaderValue) {
    this.authHeaderValue = authHeaderValue;
  }


  public CallbackDto url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackDto callbackDto = (CallbackDto) o;
    return Objects.equals(this.authHeaderKey, callbackDto.authHeaderKey) &&
        Objects.equals(this.authHeaderValue, callbackDto.authHeaderValue) &&
        Objects.equals(this.url, callbackDto.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authHeaderKey, authHeaderValue, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackDto {\n");
    sb.append("    authHeaderKey: ").append(toIndentedString(authHeaderKey)).append("\n");
    sb.append("    authHeaderValue: ").append(toIndentedString(authHeaderValue)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * WebhookDto
 */
@JsonPropertyOrder({
  WebhookDto.JSON_PROPERTY_CREATED_TIMESTAMP,
  WebhookDto.JSON_PROPERTY_DESCRIPTION,
  WebhookDto.JSON_PROPERTY_URL,
  WebhookDto.JSON_PROPERTY_REQUIRED_QUERY_PARAMS,
  WebhookDto.JSON_PROPERTY_LAST_FAILURE_REASON,
  WebhookDto.JSON_PROPERTY_ENVIRONMENT_ID,
  WebhookDto.JSON_PROPERTY_REQUIRED_HEADERS,
  WebhookDto.JSON_PROPERTY_CREATED_BY,
  WebhookDto.JSON_PROPERTY_NAME,
  WebhookDto.JSON_PROPERTY_DISABLED,
  WebhookDto.JSON_PROPERTY_LAST_FAILURE_TIMESTAMP,
  WebhookDto.JSON_PROPERTY_ID,
  WebhookDto.JSON_PROPERTY_FAILURE_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:53:22.361116-07:00[America/Los_Angeles]")
public class WebhookDto {
  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private Long createdTimestamp;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_REQUIRED_QUERY_PARAMS = "requiredQueryParams";
  private Map<String, String> requiredQueryParams = null;

  public static final String JSON_PROPERTY_LAST_FAILURE_REASON = "lastFailureReason";
  private String lastFailureReason;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environmentId";
  private String environmentId;

  public static final String JSON_PROPERTY_REQUIRED_HEADERS = "requiredHeaders";
  private Map<String, String> requiredHeaders = null;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_LAST_FAILURE_TIMESTAMP = "lastFailureTimestamp";
  private Long lastFailureTimestamp;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_FAILURE_COUNT = "failureCount";
  private Long failureCount;


  public WebhookDto createdTimestamp(Long createdTimestamp) {
    
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


  public WebhookDto description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WebhookDto url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookDto requiredQueryParams(Map<String, String> requiredQueryParams) {
    
    this.requiredQueryParams = requiredQueryParams;
    return this;
  }

  public WebhookDto putRequiredQueryParamsItem(String key, String requiredQueryParamsItem) {
    if (this.requiredQueryParams == null) {
      this.requiredQueryParams = new HashMap<>();
    }
    this.requiredQueryParams.put(key, requiredQueryParamsItem);
    return this;
  }

   /**
   * Get requiredQueryParams
   * @return requiredQueryParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRED_QUERY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getRequiredQueryParams() {
    return requiredQueryParams;
  }


  public void setRequiredQueryParams(Map<String, String> requiredQueryParams) {
    this.requiredQueryParams = requiredQueryParams;
  }


  public WebhookDto lastFailureReason(String lastFailureReason) {
    
    this.lastFailureReason = lastFailureReason;
    return this;
  }

   /**
   * Get lastFailureReason
   * @return lastFailureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastFailureReason() {
    return lastFailureReason;
  }


  public void setLastFailureReason(String lastFailureReason) {
    this.lastFailureReason = lastFailureReason;
  }


  public WebhookDto environmentId(String environmentId) {
    
    this.environmentId = environmentId;
    return this;
  }

   /**
   * Get environmentId
   * @return environmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvironmentId() {
    return environmentId;
  }


  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }


  public WebhookDto requiredHeaders(Map<String, String> requiredHeaders) {
    
    this.requiredHeaders = requiredHeaders;
    return this;
  }

  public WebhookDto putRequiredHeadersItem(String key, String requiredHeadersItem) {
    if (this.requiredHeaders == null) {
      this.requiredHeaders = new HashMap<>();
    }
    this.requiredHeaders.put(key, requiredHeadersItem);
    return this;
  }

   /**
   * Get requiredHeaders
   * @return requiredHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRED_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getRequiredHeaders() {
    return requiredHeaders;
  }


  public void setRequiredHeaders(Map<String, String> requiredHeaders) {
    this.requiredHeaders = requiredHeaders;
  }


  public WebhookDto createdBy(String createdBy) {
    
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


  public WebhookDto name(String name) {
    
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


  public WebhookDto disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public WebhookDto lastFailureTimestamp(Long lastFailureTimestamp) {
    
    this.lastFailureTimestamp = lastFailureTimestamp;
    return this;
  }

   /**
   * Get lastFailureTimestamp
   * @return lastFailureTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_FAILURE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastFailureTimestamp() {
    return lastFailureTimestamp;
  }


  public void setLastFailureTimestamp(Long lastFailureTimestamp) {
    this.lastFailureTimestamp = lastFailureTimestamp;
  }


  public WebhookDto id(String id) {
    
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


  public WebhookDto failureCount(Long failureCount) {
    
    this.failureCount = failureCount;
    return this;
  }

   /**
   * Get failureCount
   * @return failureCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAILURE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFailureCount() {
    return failureCount;
  }


  public void setFailureCount(Long failureCount) {
    this.failureCount = failureCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookDto webhookDto = (WebhookDto) o;
    return Objects.equals(this.createdTimestamp, webhookDto.createdTimestamp) &&
        Objects.equals(this.description, webhookDto.description) &&
        Objects.equals(this.url, webhookDto.url) &&
        Objects.equals(this.requiredQueryParams, webhookDto.requiredQueryParams) &&
        Objects.equals(this.lastFailureReason, webhookDto.lastFailureReason) &&
        Objects.equals(this.environmentId, webhookDto.environmentId) &&
        Objects.equals(this.requiredHeaders, webhookDto.requiredHeaders) &&
        Objects.equals(this.createdBy, webhookDto.createdBy) &&
        Objects.equals(this.name, webhookDto.name) &&
        Objects.equals(this.disabled, webhookDto.disabled) &&
        Objects.equals(this.lastFailureTimestamp, webhookDto.lastFailureTimestamp) &&
        Objects.equals(this.id, webhookDto.id) &&
        Objects.equals(this.failureCount, webhookDto.failureCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTimestamp, description, url, requiredQueryParams, lastFailureReason, environmentId, requiredHeaders, createdBy, name, disabled, lastFailureTimestamp, id, failureCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDto {\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    requiredQueryParams: ").append(toIndentedString(requiredQueryParams)).append("\n");
    sb.append("    lastFailureReason: ").append(toIndentedString(lastFailureReason)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    requiredHeaders: ").append(toIndentedString(requiredHeaders)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    lastFailureTimestamp: ").append(toIndentedString(lastFailureTimestamp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
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


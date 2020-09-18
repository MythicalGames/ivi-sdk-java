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
 * CreateTitleRequest
 */
@JsonPropertyOrder({
  CreateTitleRequest.JSON_PROPERTY_TITLE_NAME,
  CreateTitleRequest.JSON_PROPERTY_INITIAL_ENVIRONMENT_DISPLAY_NAME,
  CreateTitleRequest.JSON_PROPERTY_INITIAL_ENVIRONMENT_TYPE
})
@JsonTypeName("CreateTitleRequest")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTitleRequest {
  public static final String JSON_PROPERTY_TITLE_NAME = "titleName";
  private String titleName;

  public static final String JSON_PROPERTY_INITIAL_ENVIRONMENT_DISPLAY_NAME = "initialEnvironmentDisplayName";
  private String initialEnvironmentDisplayName;

  /**
   * Gets or Sets initialEnvironmentType
   */
  public enum InitialEnvironmentTypeEnum {
    DEV("DEV"),
    
    QA("QA"),
    
    STAGING("STAGING"),
    
    PROD("PROD"),
    
    UNRECOGNIZED("UNRECOGNIZED");

    private String value;

    InitialEnvironmentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InitialEnvironmentTypeEnum fromValue(String value) {
      for (InitialEnvironmentTypeEnum b : InitialEnvironmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INITIAL_ENVIRONMENT_TYPE = "initialEnvironmentType";
  private InitialEnvironmentTypeEnum initialEnvironmentType;


  public CreateTitleRequest titleName(String titleName) {
    
    this.titleName = titleName;
    return this;
  }

   /**
   * Get titleName
   * @return titleName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitleName() {
    return titleName;
  }


  public void setTitleName(String titleName) {
    this.titleName = titleName;
  }


  public CreateTitleRequest initialEnvironmentDisplayName(String initialEnvironmentDisplayName) {
    
    this.initialEnvironmentDisplayName = initialEnvironmentDisplayName;
    return this;
  }

   /**
   * Get initialEnvironmentDisplayName
   * @return initialEnvironmentDisplayName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INITIAL_ENVIRONMENT_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInitialEnvironmentDisplayName() {
    return initialEnvironmentDisplayName;
  }


  public void setInitialEnvironmentDisplayName(String initialEnvironmentDisplayName) {
    this.initialEnvironmentDisplayName = initialEnvironmentDisplayName;
  }


  public CreateTitleRequest initialEnvironmentType(InitialEnvironmentTypeEnum initialEnvironmentType) {
    
    this.initialEnvironmentType = initialEnvironmentType;
    return this;
  }

   /**
   * Get initialEnvironmentType
   * @return initialEnvironmentType
  **/
  @ApiModelProperty(example = "DEV", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INITIAL_ENVIRONMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InitialEnvironmentTypeEnum getInitialEnvironmentType() {
    return initialEnvironmentType;
  }


  public void setInitialEnvironmentType(InitialEnvironmentTypeEnum initialEnvironmentType) {
    this.initialEnvironmentType = initialEnvironmentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTitleRequest createTitleRequest = (CreateTitleRequest) o;
    return Objects.equals(this.titleName, createTitleRequest.titleName) &&
        Objects.equals(this.initialEnvironmentDisplayName, createTitleRequest.initialEnvironmentDisplayName) &&
        Objects.equals(this.initialEnvironmentType, createTitleRequest.initialEnvironmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titleName, initialEnvironmentDisplayName, initialEnvironmentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTitleRequest {\n");
    sb.append("    titleName: ").append(toIndentedString(titleName)).append("\n");
    sb.append("    initialEnvironmentDisplayName: ").append(toIndentedString(initialEnvironmentDisplayName)).append("\n");
    sb.append("    initialEnvironmentType: ").append(toIndentedString(initialEnvironmentType)).append("\n");
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


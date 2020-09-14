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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateEnvironmentInstanceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-14T14:31:49.595906-07:00[America/Los_Angeles]")
public class CreateEnvironmentInstanceRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * Gets or Sets environmentType
   */
  @JsonAdapter(EnvironmentTypeEnum.Adapter.class)
  public enum EnvironmentTypeEnum {
    DEV("DEV"),
    
    QA("QA"),
    
    STAGING("STAGING"),
    
    PROD("PROD"),
    
    UNRECOGNIZED("UNRECOGNIZED");

    private String value;

    EnvironmentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentTypeEnum fromValue(String value) {
      for (EnvironmentTypeEnum b : EnvironmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT_TYPE = "environmentType";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_TYPE)
  private EnvironmentTypeEnum environmentType;


  public CreateEnvironmentInstanceRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateEnvironmentInstanceRequest environmentType(EnvironmentTypeEnum environmentType) {
    
    this.environmentType = environmentType;
    return this;
  }

   /**
   * Get environmentType
   * @return environmentType
  **/
  @ApiModelProperty(required = true, value = "")

  public EnvironmentTypeEnum getEnvironmentType() {
    return environmentType;
  }


  public void setEnvironmentType(EnvironmentTypeEnum environmentType) {
    this.environmentType = environmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest = (CreateEnvironmentInstanceRequest) o;
    return Objects.equals(this.displayName, createEnvironmentInstanceRequest.displayName) &&
        Objects.equals(this.environmentType, createEnvironmentInstanceRequest.environmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, environmentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEnvironmentInstanceRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    environmentType: ").append(toIndentedString(environmentType)).append("\n");
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


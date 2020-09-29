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
import games.mythical.ivi.sdk.model.JsonArray;
import games.mythical.ivi.sdk.model.JsonNull;
import games.mythical.ivi.sdk.model.JsonObject;
import games.mythical.ivi.sdk.model.JsonPrimitive;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * JsonElement
 */
@JsonPropertyOrder({
  JsonElement.JSON_PROPERTY_AS_BYTE,
  JsonElement.JSON_PROPERTY_AS_JSON_OBJECT,
  JsonElement.JSON_PROPERTY_AS_BIG_INTEGER,
  JsonElement.JSON_PROPERTY_JSON_PRIMITIVE,
  JsonElement.JSON_PROPERTY_AS_CHARACTER,
  JsonElement.JSON_PROPERTY_AS_NUMBER,
  JsonElement.JSON_PROPERTY_AS_BIG_DECIMAL,
  JsonElement.JSON_PROPERTY_JSON_NULL,
  JsonElement.JSON_PROPERTY_AS_FLOAT,
  JsonElement.JSON_PROPERTY_AS_LONG,
  JsonElement.JSON_PROPERTY_AS_INT,
  JsonElement.JSON_PROPERTY_AS_JSON_PRIMITIVE,
  JsonElement.JSON_PROPERTY_AS_JSON_NULL,
  JsonElement.JSON_PROPERTY_AS_SHORT,
  JsonElement.JSON_PROPERTY_AS_DOUBLE,
  JsonElement.JSON_PROPERTY_AS_JSON_ARRAY,
  JsonElement.JSON_PROPERTY_AS_STRING,
  JsonElement.JSON_PROPERTY_JSON_OBJECT,
  JsonElement.JSON_PROPERTY_JSON_ARRAY,
  JsonElement.JSON_PROPERTY_AS_BOOLEAN
})
@JsonTypeName("JsonElement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JsonElement {
  public static final String JSON_PROPERTY_AS_BYTE = "asByte";
  private byte[] asByte;

  public static final String JSON_PROPERTY_AS_JSON_OBJECT = "asJsonObject";
  private JsonObject asJsonObject;

  public static final String JSON_PROPERTY_AS_BIG_INTEGER = "asBigInteger";
  private Integer asBigInteger;

  public static final String JSON_PROPERTY_JSON_PRIMITIVE = "jsonPrimitive";
  private Boolean jsonPrimitive;

  public static final String JSON_PROPERTY_AS_CHARACTER = "asCharacter";
  private String asCharacter;

  public static final String JSON_PROPERTY_AS_NUMBER = "asNumber";
  private BigDecimal asNumber;

  public static final String JSON_PROPERTY_AS_BIG_DECIMAL = "asBigDecimal";
  private BigDecimal asBigDecimal;

  public static final String JSON_PROPERTY_JSON_NULL = "jsonNull";
  private Boolean jsonNull;

  public static final String JSON_PROPERTY_AS_FLOAT = "asFloat";
  private Float asFloat;

  public static final String JSON_PROPERTY_AS_LONG = "asLong";
  private Long asLong;

  public static final String JSON_PROPERTY_AS_INT = "asInt";
  private Integer asInt;

  public static final String JSON_PROPERTY_AS_JSON_PRIMITIVE = "asJsonPrimitive";
  private JsonPrimitive asJsonPrimitive;

  public static final String JSON_PROPERTY_AS_JSON_NULL = "asJsonNull";
  private JsonNull asJsonNull;

  public static final String JSON_PROPERTY_AS_SHORT = "asShort";
  private Integer asShort;

  public static final String JSON_PROPERTY_AS_DOUBLE = "asDouble";
  private Double asDouble;

  public static final String JSON_PROPERTY_AS_JSON_ARRAY = "asJsonArray";
  private JsonArray asJsonArray;

  public static final String JSON_PROPERTY_AS_STRING = "asString";
  private String asString;

  public static final String JSON_PROPERTY_JSON_OBJECT = "jsonObject";
  private Boolean jsonObject;

  public static final String JSON_PROPERTY_JSON_ARRAY = "jsonArray";
  private Boolean jsonArray;

  public static final String JSON_PROPERTY_AS_BOOLEAN = "asBoolean";
  private Boolean asBoolean;


  public JsonElement asByte(byte[] asByte) {
    
    this.asByte = asByte;
    return this;
  }

   /**
   * Get asByte
   * @return asByte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_BYTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getAsByte() {
    return asByte;
  }


  public void setAsByte(byte[] asByte) {
    this.asByte = asByte;
  }


  public JsonElement asJsonObject(JsonObject asJsonObject) {
    
    this.asJsonObject = asJsonObject;
    return this;
  }

   /**
   * Get asJsonObject
   * @return asJsonObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_JSON_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonObject getAsJsonObject() {
    return asJsonObject;
  }


  public void setAsJsonObject(JsonObject asJsonObject) {
    this.asJsonObject = asJsonObject;
  }


  public JsonElement asBigInteger(Integer asBigInteger) {
    
    this.asBigInteger = asBigInteger;
    return this;
  }

   /**
   * Get asBigInteger
   * @return asBigInteger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_BIG_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAsBigInteger() {
    return asBigInteger;
  }


  public void setAsBigInteger(Integer asBigInteger) {
    this.asBigInteger = asBigInteger;
  }


  public JsonElement jsonPrimitive(Boolean jsonPrimitive) {
    
    this.jsonPrimitive = jsonPrimitive;
    return this;
  }

   /**
   * Get jsonPrimitive
   * @return jsonPrimitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JSON_PRIMITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getJsonPrimitive() {
    return jsonPrimitive;
  }


  public void setJsonPrimitive(Boolean jsonPrimitive) {
    this.jsonPrimitive = jsonPrimitive;
  }


  public JsonElement asCharacter(String asCharacter) {
    
    this.asCharacter = asCharacter;
    return this;
  }

   /**
   * Get asCharacter
   * @return asCharacter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_CHARACTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsCharacter() {
    return asCharacter;
  }


  public void setAsCharacter(String asCharacter) {
    this.asCharacter = asCharacter;
  }


  public JsonElement asNumber(BigDecimal asNumber) {
    
    this.asNumber = asNumber;
    return this;
  }

   /**
   * Get asNumber
   * @return asNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAsNumber() {
    return asNumber;
  }


  public void setAsNumber(BigDecimal asNumber) {
    this.asNumber = asNumber;
  }


  public JsonElement asBigDecimal(BigDecimal asBigDecimal) {
    
    this.asBigDecimal = asBigDecimal;
    return this;
  }

   /**
   * Get asBigDecimal
   * @return asBigDecimal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_BIG_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAsBigDecimal() {
    return asBigDecimal;
  }


  public void setAsBigDecimal(BigDecimal asBigDecimal) {
    this.asBigDecimal = asBigDecimal;
  }


  public JsonElement jsonNull(Boolean jsonNull) {
    
    this.jsonNull = jsonNull;
    return this;
  }

   /**
   * Get jsonNull
   * @return jsonNull
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JSON_NULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getJsonNull() {
    return jsonNull;
  }


  public void setJsonNull(Boolean jsonNull) {
    this.jsonNull = jsonNull;
  }


  public JsonElement asFloat(Float asFloat) {
    
    this.asFloat = asFloat;
    return this;
  }

   /**
   * Get asFloat
   * @return asFloat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAsFloat() {
    return asFloat;
  }


  public void setAsFloat(Float asFloat) {
    this.asFloat = asFloat;
  }


  public JsonElement asLong(Long asLong) {
    
    this.asLong = asLong;
    return this;
  }

   /**
   * Get asLong
   * @return asLong
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_LONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAsLong() {
    return asLong;
  }


  public void setAsLong(Long asLong) {
    this.asLong = asLong;
  }


  public JsonElement asInt(Integer asInt) {
    
    this.asInt = asInt;
    return this;
  }

   /**
   * Get asInt
   * @return asInt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_INT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAsInt() {
    return asInt;
  }


  public void setAsInt(Integer asInt) {
    this.asInt = asInt;
  }


  public JsonElement asJsonPrimitive(JsonPrimitive asJsonPrimitive) {
    
    this.asJsonPrimitive = asJsonPrimitive;
    return this;
  }

   /**
   * Get asJsonPrimitive
   * @return asJsonPrimitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_JSON_PRIMITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonPrimitive getAsJsonPrimitive() {
    return asJsonPrimitive;
  }


  public void setAsJsonPrimitive(JsonPrimitive asJsonPrimitive) {
    this.asJsonPrimitive = asJsonPrimitive;
  }


  public JsonElement asJsonNull(JsonNull asJsonNull) {
    
    this.asJsonNull = asJsonNull;
    return this;
  }

   /**
   * Get asJsonNull
   * @return asJsonNull
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_JSON_NULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNull getAsJsonNull() {
    return asJsonNull;
  }


  public void setAsJsonNull(JsonNull asJsonNull) {
    this.asJsonNull = asJsonNull;
  }


  public JsonElement asShort(Integer asShort) {
    
    this.asShort = asShort;
    return this;
  }

   /**
   * Get asShort
   * @return asShort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_SHORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAsShort() {
    return asShort;
  }


  public void setAsShort(Integer asShort) {
    this.asShort = asShort;
  }


  public JsonElement asDouble(Double asDouble) {
    
    this.asDouble = asDouble;
    return this;
  }

   /**
   * Get asDouble
   * @return asDouble
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAsDouble() {
    return asDouble;
  }


  public void setAsDouble(Double asDouble) {
    this.asDouble = asDouble;
  }


  public JsonElement asJsonArray(JsonArray asJsonArray) {
    
    this.asJsonArray = asJsonArray;
    return this;
  }

   /**
   * Get asJsonArray
   * @return asJsonArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_JSON_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonArray getAsJsonArray() {
    return asJsonArray;
  }


  public void setAsJsonArray(JsonArray asJsonArray) {
    this.asJsonArray = asJsonArray;
  }


  public JsonElement asString(String asString) {
    
    this.asString = asString;
    return this;
  }

   /**
   * Get asString
   * @return asString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsString() {
    return asString;
  }


  public void setAsString(String asString) {
    this.asString = asString;
  }


  public JsonElement jsonObject(Boolean jsonObject) {
    
    this.jsonObject = jsonObject;
    return this;
  }

   /**
   * Get jsonObject
   * @return jsonObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JSON_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getJsonObject() {
    return jsonObject;
  }


  public void setJsonObject(Boolean jsonObject) {
    this.jsonObject = jsonObject;
  }


  public JsonElement jsonArray(Boolean jsonArray) {
    
    this.jsonArray = jsonArray;
    return this;
  }

   /**
   * Get jsonArray
   * @return jsonArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JSON_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getJsonArray() {
    return jsonArray;
  }


  public void setJsonArray(Boolean jsonArray) {
    this.jsonArray = jsonArray;
  }


  public JsonElement asBoolean(Boolean asBoolean) {
    
    this.asBoolean = asBoolean;
    return this;
  }

   /**
   * Get asBoolean
   * @return asBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAsBoolean() {
    return asBoolean;
  }


  public void setAsBoolean(Boolean asBoolean) {
    this.asBoolean = asBoolean;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonElement jsonElement = (JsonElement) o;
    return Arrays.equals(this.asByte, jsonElement.asByte) &&
        Objects.equals(this.asJsonObject, jsonElement.asJsonObject) &&
        Objects.equals(this.asBigInteger, jsonElement.asBigInteger) &&
        Objects.equals(this.jsonPrimitive, jsonElement.jsonPrimitive) &&
        Objects.equals(this.asCharacter, jsonElement.asCharacter) &&
        Objects.equals(this.asNumber, jsonElement.asNumber) &&
        Objects.equals(this.asBigDecimal, jsonElement.asBigDecimal) &&
        Objects.equals(this.jsonNull, jsonElement.jsonNull) &&
        Objects.equals(this.asFloat, jsonElement.asFloat) &&
        Objects.equals(this.asLong, jsonElement.asLong) &&
        Objects.equals(this.asInt, jsonElement.asInt) &&
        Objects.equals(this.asJsonPrimitive, jsonElement.asJsonPrimitive) &&
        Objects.equals(this.asJsonNull, jsonElement.asJsonNull) &&
        Objects.equals(this.asShort, jsonElement.asShort) &&
        Objects.equals(this.asDouble, jsonElement.asDouble) &&
        Objects.equals(this.asJsonArray, jsonElement.asJsonArray) &&
        Objects.equals(this.asString, jsonElement.asString) &&
        Objects.equals(this.jsonObject, jsonElement.jsonObject) &&
        Objects.equals(this.jsonArray, jsonElement.jsonArray) &&
        Objects.equals(this.asBoolean, jsonElement.asBoolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(asByte), asJsonObject, asBigInteger, jsonPrimitive, asCharacter, asNumber, asBigDecimal, jsonNull, asFloat, asLong, asInt, asJsonPrimitive, asJsonNull, asShort, asDouble, asJsonArray, asString, jsonObject, jsonArray, asBoolean);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonElement {\n");
    sb.append("    asByte: ").append(toIndentedString(asByte)).append("\n");
    sb.append("    asJsonObject: ").append(toIndentedString(asJsonObject)).append("\n");
    sb.append("    asBigInteger: ").append(toIndentedString(asBigInteger)).append("\n");
    sb.append("    jsonPrimitive: ").append(toIndentedString(jsonPrimitive)).append("\n");
    sb.append("    asCharacter: ").append(toIndentedString(asCharacter)).append("\n");
    sb.append("    asNumber: ").append(toIndentedString(asNumber)).append("\n");
    sb.append("    asBigDecimal: ").append(toIndentedString(asBigDecimal)).append("\n");
    sb.append("    jsonNull: ").append(toIndentedString(jsonNull)).append("\n");
    sb.append("    asFloat: ").append(toIndentedString(asFloat)).append("\n");
    sb.append("    asLong: ").append(toIndentedString(asLong)).append("\n");
    sb.append("    asInt: ").append(toIndentedString(asInt)).append("\n");
    sb.append("    asJsonPrimitive: ").append(toIndentedString(asJsonPrimitive)).append("\n");
    sb.append("    asJsonNull: ").append(toIndentedString(asJsonNull)).append("\n");
    sb.append("    asShort: ").append(toIndentedString(asShort)).append("\n");
    sb.append("    asDouble: ").append(toIndentedString(asDouble)).append("\n");
    sb.append("    asJsonArray: ").append(toIndentedString(asJsonArray)).append("\n");
    sb.append("    asString: ").append(toIndentedString(asString)).append("\n");
    sb.append("    jsonObject: ").append(toIndentedString(jsonObject)).append("\n");
    sb.append("    jsonArray: ").append(toIndentedString(jsonArray)).append("\n");
    sb.append("    asBoolean: ").append(toIndentedString(asBoolean)).append("\n");
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


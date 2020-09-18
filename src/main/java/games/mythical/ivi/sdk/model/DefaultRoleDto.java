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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DefaultRoleDto
 */
@JsonPropertyOrder({
  DefaultRoleDto.JSON_PROPERTY_ROLE_NAME,
  DefaultRoleDto.JSON_PROPERTY_ID,
  DefaultRoleDto.JSON_PROPERTY_TARGETS
})

public class DefaultRoleDto {
  public static final String JSON_PROPERTY_ROLE_NAME = "roleName";
  private String roleName;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  /**
   * Gets or Sets inner
   */
  public enum InnerEnum {
    CREATE("CREATE"),
    
    READ("READ"),
    
    UPDATE("UPDATE"),
    
    DELETE("DELETE");

    private String value;

    InnerEnum(String value) {
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
    public static InnerEnum fromValue(String value) {
      for (InnerEnum b : InnerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private Map<String, List<InnerEnum>> targets = null;


  public DefaultRoleDto roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public DefaultRoleDto id(UUID id) {
    
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

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public DefaultRoleDto targets(Map<String, List<InnerEnum>> targets) {
    
    this.targets = targets;
    return this;
  }

  public DefaultRoleDto putTargetsItem(String key, List<InnerEnum> targetsItem) {
    if (this.targets == null) {
      this.targets = new HashMap<>();
    }
    this.targets.put(key, targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<InnerEnum>> getTargets() {
    return targets;
  }


  public void setTargets(Map<String, List<InnerEnum>> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultRoleDto defaultRoleDto = (DefaultRoleDto) o;
    return Objects.equals(this.roleName, defaultRoleDto.roleName) &&
        Objects.equals(this.id, defaultRoleDto.id) &&
        Objects.equals(this.targets, defaultRoleDto.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, id, targets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultRoleDto {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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


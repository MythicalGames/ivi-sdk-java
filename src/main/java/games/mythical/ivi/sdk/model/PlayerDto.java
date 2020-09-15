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
import games.mythical.ivi.sdk.model.Wallet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PlayerDto
 */
@JsonPropertyOrder({
  PlayerDto.JSON_PROPERTY_PLATFORM_USER_ID,
  PlayerDto.JSON_PROPERTY_CREATED_BY,
  PlayerDto.JSON_PROPERTY_CREATED_TIMESTAMP,
  PlayerDto.JSON_PROPERTY_WALLETS,
  PlayerDto.JSON_PROPERTY_SIDECHAIN_ACCOUNT_NAME,
  PlayerDto.JSON_PROPERTY_PLAYER_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:53:22.361116-07:00[America/Los_Angeles]")
public class PlayerDto {
  public static final String JSON_PROPERTY_PLATFORM_USER_ID = "platformUserId";
  private String platformUserId;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private Long createdTimestamp;

  public static final String JSON_PROPERTY_WALLETS = "wallets";
  private Map<String, Wallet> wallets = null;

  public static final String JSON_PROPERTY_SIDECHAIN_ACCOUNT_NAME = "sidechainAccountName";
  private String sidechainAccountName;

  public static final String JSON_PROPERTY_PLAYER_ID = "playerId";
  private String playerId;


  public PlayerDto platformUserId(String platformUserId) {
    
    this.platformUserId = platformUserId;
    return this;
  }

   /**
   * Get platformUserId
   * @return platformUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlatformUserId() {
    return platformUserId;
  }


  public void setPlatformUserId(String platformUserId) {
    this.platformUserId = platformUserId;
  }


  public PlayerDto createdBy(String createdBy) {
    
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


  public PlayerDto createdTimestamp(Long createdTimestamp) {
    
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


  public PlayerDto wallets(Map<String, Wallet> wallets) {
    
    this.wallets = wallets;
    return this;
  }

  public PlayerDto putWalletsItem(String key, Wallet walletsItem) {
    if (this.wallets == null) {
      this.wallets = new HashMap<>();
    }
    this.wallets.put(key, walletsItem);
    return this;
  }

   /**
   * Get wallets
   * @return wallets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WALLETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Wallet> getWallets() {
    return wallets;
  }


  public void setWallets(Map<String, Wallet> wallets) {
    this.wallets = wallets;
  }


  public PlayerDto sidechainAccountName(String sidechainAccountName) {
    
    this.sidechainAccountName = sidechainAccountName;
    return this;
  }

   /**
   * Get sidechainAccountName
   * @return sidechainAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIDECHAIN_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSidechainAccountName() {
    return sidechainAccountName;
  }


  public void setSidechainAccountName(String sidechainAccountName) {
    this.sidechainAccountName = sidechainAccountName;
  }


  public PlayerDto playerId(String playerId) {
    
    this.playerId = playerId;
    return this;
  }

   /**
   * Get playerId
   * @return playerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlayerId() {
    return playerId;
  }


  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerDto playerDto = (PlayerDto) o;
    return Objects.equals(this.platformUserId, playerDto.platformUserId) &&
        Objects.equals(this.createdBy, playerDto.createdBy) &&
        Objects.equals(this.createdTimestamp, playerDto.createdTimestamp) &&
        Objects.equals(this.wallets, playerDto.wallets) &&
        Objects.equals(this.sidechainAccountName, playerDto.sidechainAccountName) &&
        Objects.equals(this.playerId, playerDto.playerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformUserId, createdBy, createdTimestamp, wallets, sidechainAccountName, playerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerDto {\n");
    sb.append("    platformUserId: ").append(toIndentedString(platformUserId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    wallets: ").append(toIndentedString(wallets)).append("\n");
    sb.append("    sidechainAccountName: ").append(toIndentedString(sidechainAccountName)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
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


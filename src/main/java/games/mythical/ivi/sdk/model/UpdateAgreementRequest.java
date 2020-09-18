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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UpdateAgreementRequest
 */
@JsonPropertyOrder({
  UpdateAgreementRequest.JSON_PROPERTY_TIME_FRAME_START,
  UpdateAgreementRequest.JSON_PROPERTY_NOTES,
  UpdateAgreementRequest.JSON_PROPERTY_PAY_SCHEDULE,
  UpdateAgreementRequest.JSON_PROPERTY_TIME_FRAME_END,
  UpdateAgreementRequest.JSON_PROPERTY_TITLE_ID,
  UpdateAgreementRequest.JSON_PROPERTY_ACTIVE,
  UpdateAgreementRequest.JSON_PROPERTY_GUARANTEE,
  UpdateAgreementRequest.JSON_PROPERTY_ITEM_TYPE_NAMES,
  UpdateAgreementRequest.JSON_PROPERTY_REV_SHARE_INITIAL,
  UpdateAgreementRequest.JSON_PROPERTY_NAME,
  UpdateAgreementRequest.JSON_PROPERTY_REV_SHARE_RESALE,
  UpdateAgreementRequest.JSON_PROPERTY_CURRENCY,
  UpdateAgreementRequest.JSON_PROPERTY_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-17T21:49:06.785396-07:00[America/Los_Angeles]")
public class UpdateAgreementRequest {
  public static final String JSON_PROPERTY_TIME_FRAME_START = "timeFrameStart";
  private Long timeFrameStart;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  /**
   * Gets or Sets paySchedule
   */
  public enum PayScheduleEnum {
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    UNRECOGNIZED("UNRECOGNIZED");

    private String value;

    PayScheduleEnum(String value) {
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
    public static PayScheduleEnum fromValue(String value) {
      for (PayScheduleEnum b : PayScheduleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAY_SCHEDULE = "paySchedule";
  private PayScheduleEnum paySchedule;

  public static final String JSON_PROPERTY_TIME_FRAME_END = "timeFrameEnd";
  private Long timeFrameEnd;

  public static final String JSON_PROPERTY_TITLE_ID = "titleId";
  private String titleId;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_GUARANTEE = "guarantee";
  private Integer guarantee;

  public static final String JSON_PROPERTY_ITEM_TYPE_NAMES = "itemTypeNames";
  private List<String> itemTypeNames = null;

  public static final String JSON_PROPERTY_REV_SHARE_INITIAL = "revShareInitial";
  private Double revShareInitial;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REV_SHARE_RESALE = "revShareResale";
  private Double revShareResale;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;


  public UpdateAgreementRequest timeFrameStart(Long timeFrameStart) {
    
    this.timeFrameStart = timeFrameStart;
    return this;
  }

   /**
   * Get timeFrameStart
   * @return timeFrameStart
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIME_FRAME_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimeFrameStart() {
    return timeFrameStart;
  }


  public void setTimeFrameStart(Long timeFrameStart) {
    this.timeFrameStart = timeFrameStart;
  }


  public UpdateAgreementRequest notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public UpdateAgreementRequest paySchedule(PayScheduleEnum paySchedule) {
    
    this.paySchedule = paySchedule;
    return this;
  }

   /**
   * Get paySchedule
   * @return paySchedule
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PayScheduleEnum getPaySchedule() {
    return paySchedule;
  }


  public void setPaySchedule(PayScheduleEnum paySchedule) {
    this.paySchedule = paySchedule;
  }


  public UpdateAgreementRequest timeFrameEnd(Long timeFrameEnd) {
    
    this.timeFrameEnd = timeFrameEnd;
    return this;
  }

   /**
   * Get timeFrameEnd
   * @return timeFrameEnd
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIME_FRAME_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimeFrameEnd() {
    return timeFrameEnd;
  }


  public void setTimeFrameEnd(Long timeFrameEnd) {
    this.timeFrameEnd = timeFrameEnd;
  }


  public UpdateAgreementRequest titleId(String titleId) {
    
    this.titleId = titleId;
    return this;
  }

   /**
   * Get titleId
   * @return titleId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitleId() {
    return titleId;
  }


  public void setTitleId(String titleId) {
    this.titleId = titleId;
  }


  public UpdateAgreementRequest active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public UpdateAgreementRequest guarantee(Integer guarantee) {
    
    this.guarantee = guarantee;
    return this;
  }

   /**
   * Get guarantee
   * @return guarantee
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_GUARANTEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getGuarantee() {
    return guarantee;
  }


  public void setGuarantee(Integer guarantee) {
    this.guarantee = guarantee;
  }


  public UpdateAgreementRequest itemTypeNames(List<String> itemTypeNames) {
    
    this.itemTypeNames = itemTypeNames;
    return this;
  }

  public UpdateAgreementRequest addItemTypeNamesItem(String itemTypeNamesItem) {
    if (this.itemTypeNames == null) {
      this.itemTypeNames = new ArrayList<>();
    }
    this.itemTypeNames.add(itemTypeNamesItem);
    return this;
  }

   /**
   * Get itemTypeNames
   * @return itemTypeNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_TYPE_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getItemTypeNames() {
    return itemTypeNames;
  }


  public void setItemTypeNames(List<String> itemTypeNames) {
    this.itemTypeNames = itemTypeNames;
  }


  public UpdateAgreementRequest revShareInitial(Double revShareInitial) {
    
    this.revShareInitial = revShareInitial;
    return this;
  }

   /**
   * Get revShareInitial
   * @return revShareInitial
  **/
  @ApiModelProperty(example = "0.12", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REV_SHARE_INITIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getRevShareInitial() {
    return revShareInitial;
  }


  public void setRevShareInitial(Double revShareInitial) {
    this.revShareInitial = revShareInitial;
  }


  public UpdateAgreementRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateAgreementRequest revShareResale(Double revShareResale) {
    
    this.revShareResale = revShareResale;
    return this;
  }

   /**
   * Get revShareResale
   * @return revShareResale
  **/
  @ApiModelProperty(example = "0.1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REV_SHARE_RESALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getRevShareResale() {
    return revShareResale;
  }


  public void setRevShareResale(Double revShareResale) {
    this.revShareResale = revShareResale;
  }


  public UpdateAgreementRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public UpdateAgreementRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAgreementRequest updateAgreementRequest = (UpdateAgreementRequest) o;
    return Objects.equals(this.timeFrameStart, updateAgreementRequest.timeFrameStart) &&
        Objects.equals(this.notes, updateAgreementRequest.notes) &&
        Objects.equals(this.paySchedule, updateAgreementRequest.paySchedule) &&
        Objects.equals(this.timeFrameEnd, updateAgreementRequest.timeFrameEnd) &&
        Objects.equals(this.titleId, updateAgreementRequest.titleId) &&
        Objects.equals(this.active, updateAgreementRequest.active) &&
        Objects.equals(this.guarantee, updateAgreementRequest.guarantee) &&
        Objects.equals(this.itemTypeNames, updateAgreementRequest.itemTypeNames) &&
        Objects.equals(this.revShareInitial, updateAgreementRequest.revShareInitial) &&
        Objects.equals(this.name, updateAgreementRequest.name) &&
        Objects.equals(this.revShareResale, updateAgreementRequest.revShareResale) &&
        Objects.equals(this.currency, updateAgreementRequest.currency) &&
        Objects.equals(this.id, updateAgreementRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeFrameStart, notes, paySchedule, timeFrameEnd, titleId, active, guarantee, itemTypeNames, revShareInitial, name, revShareResale, currency, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAgreementRequest {\n");
    sb.append("    timeFrameStart: ").append(toIndentedString(timeFrameStart)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    paySchedule: ").append(toIndentedString(paySchedule)).append("\n");
    sb.append("    timeFrameEnd: ").append(toIndentedString(timeFrameEnd)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    guarantee: ").append(toIndentedString(guarantee)).append("\n");
    sb.append("    itemTypeNames: ").append(toIndentedString(itemTypeNames)).append("\n");
    sb.append("    revShareInitial: ").append(toIndentedString(revShareInitial)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revShareResale: ").append(toIndentedString(revShareResale)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


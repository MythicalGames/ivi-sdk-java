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
import games.mythical.ivi.sdk.model.SearchHit;
import games.mythical.ivi.sdk.model.SearchTotal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SearchResponse
 */
@JsonPropertyOrder({
  SearchResponse.JSON_PROPERTY_TOTAL,
  SearchResponse.JSON_PROPERTY_DATA
})

public class SearchResponse {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private SearchTotal total;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<SearchHit> data = null;


  public SearchResponse total(SearchTotal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchTotal getTotal() {
    return total;
  }


  public void setTotal(SearchTotal total) {
    this.total = total;
  }


  public SearchResponse data(List<SearchHit> data) {
    
    this.data = data;
    return this;
  }

  public SearchResponse addDataItem(SearchHit dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SearchHit> getData() {
    return data;
  }


  public void setData(List<SearchHit> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponse searchResponse = (SearchResponse) o;
    return Objects.equals(this.total, searchResponse.total) &&
        Objects.equals(this.data, searchResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponse {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


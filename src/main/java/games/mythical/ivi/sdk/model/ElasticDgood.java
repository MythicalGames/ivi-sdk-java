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
 * ElasticDgood
 */
@JsonPropertyOrder({
  ElasticDgood.JSON_PROPERTY_IMAGE_SMALL,
  ElasticDgood.JSON_PROPERTY_METADATA,
  ElasticDgood.JSON_PROPERTY_DGOOD_ID,
  ElasticDgood.JSON_PROPERTY_AUTHENTICITY,
  ElasticDgood.JSON_PROPERTY_NAME,
  ElasticDgood.JSON_PROPERTY_DESCRIPTION,
  ElasticDgood.JSON_PROPERTY_CATEGORY,
  ElasticDgood.JSON_PROPERTY_IMAGE_LARGE,
  ElasticDgood.JSON_PROPERTY_TITLE,
  ElasticDgood.JSON_PROPERTY_RENDER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T09:19:26.551556-07:00[America/Los_Angeles]")
public class ElasticDgood {
  public static final String JSON_PROPERTY_IMAGE_SMALL = "image_small";
  private String imageSmall;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = null;

  public static final String JSON_PROPERTY_DGOOD_ID = "dgood_id";
  private Long dgoodId;

  public static final String JSON_PROPERTY_AUTHENTICITY = "authenticity";
  private String authenticity;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_IMAGE_LARGE = "image_large";
  private String imageLarge;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_RENDER = "render";
  private String render;


  public ElasticDgood imageSmall(String imageSmall) {
    
    this.imageSmall = imageSmall;
    return this;
  }

   /**
   * Get imageSmall
   * @return imageSmall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_SMALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageSmall() {
    return imageSmall;
  }


  public void setImageSmall(String imageSmall) {
    this.imageSmall = imageSmall;
  }


  public ElasticDgood metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public ElasticDgood putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public ElasticDgood dgoodId(Long dgoodId) {
    
    this.dgoodId = dgoodId;
    return this;
  }

   /**
   * Get dgoodId
   * @return dgoodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DGOOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDgoodId() {
    return dgoodId;
  }


  public void setDgoodId(Long dgoodId) {
    this.dgoodId = dgoodId;
  }


  public ElasticDgood authenticity(String authenticity) {
    
    this.authenticity = authenticity;
    return this;
  }

   /**
   * Get authenticity
   * @return authenticity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHENTICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticity() {
    return authenticity;
  }


  public void setAuthenticity(String authenticity) {
    this.authenticity = authenticity;
  }


  public ElasticDgood name(String name) {
    
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


  public ElasticDgood description(String description) {
    
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


  public ElasticDgood category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public ElasticDgood imageLarge(String imageLarge) {
    
    this.imageLarge = imageLarge;
    return this;
  }

   /**
   * Get imageLarge
   * @return imageLarge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_LARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageLarge() {
    return imageLarge;
  }


  public void setImageLarge(String imageLarge) {
    this.imageLarge = imageLarge;
  }


  public ElasticDgood title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ElasticDgood render(String render) {
    
    this.render = render;
    return this;
  }

   /**
   * Get render
   * @return render
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRender() {
    return render;
  }


  public void setRender(String render) {
    this.render = render;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticDgood elasticDgood = (ElasticDgood) o;
    return Objects.equals(this.imageSmall, elasticDgood.imageSmall) &&
        Objects.equals(this.metadata, elasticDgood.metadata) &&
        Objects.equals(this.dgoodId, elasticDgood.dgoodId) &&
        Objects.equals(this.authenticity, elasticDgood.authenticity) &&
        Objects.equals(this.name, elasticDgood.name) &&
        Objects.equals(this.description, elasticDgood.description) &&
        Objects.equals(this.category, elasticDgood.category) &&
        Objects.equals(this.imageLarge, elasticDgood.imageLarge) &&
        Objects.equals(this.title, elasticDgood.title) &&
        Objects.equals(this.render, elasticDgood.render);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageSmall, metadata, dgoodId, authenticity, name, description, category, imageLarge, title, render);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticDgood {\n");
    sb.append("    imageSmall: ").append(toIndentedString(imageSmall)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dgoodId: ").append(toIndentedString(dgoodId)).append("\n");
    sb.append("    authenticity: ").append(toIndentedString(authenticity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    imageLarge: ").append(toIndentedString(imageLarge)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    render: ").append(toIndentedString(render)).append("\n");
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


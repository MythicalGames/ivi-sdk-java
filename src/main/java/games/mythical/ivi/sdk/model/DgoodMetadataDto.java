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
 * DgoodMetadataDto
 */
@JsonPropertyOrder({
  DgoodMetadataDto.JSON_PROPERTY_METADATA,
  DgoodMetadataDto.JSON_PROPERTY_AUTHENTICITY,
  DgoodMetadataDto.JSON_PROPERTY_IMAGE_SMALL,
  DgoodMetadataDto.JSON_PROPERTY_NAME,
  DgoodMetadataDto.JSON_PROPERTY_DESCRIPTION,
  DgoodMetadataDto.JSON_PROPERTY_CATEGORY,
  DgoodMetadataDto.JSON_PROPERTY_IMAGE_LARGE,
  DgoodMetadataDto.JSON_PROPERTY_TITLE,
  DgoodMetadataDto.JSON_PROPERTY_RENDER,
  DgoodMetadataDto.JSON_PROPERTY_DGOOD_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:43:19.928192-07:00[America/Los_Angeles]")
public class DgoodMetadataDto {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = null;

  public static final String JSON_PROPERTY_AUTHENTICITY = "authenticity";
  private String authenticity;

  public static final String JSON_PROPERTY_IMAGE_SMALL = "imageSmall";
  private String imageSmall;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_IMAGE_LARGE = "imageLarge";
  private String imageLarge;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_RENDER = "render";
  private String render;

  public static final String JSON_PROPERTY_DGOOD_ID = "dgoodId";
  private Long dgoodId;


  public DgoodMetadataDto metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public DgoodMetadataDto putMetadataItem(String key, Object metadataItem) {
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


  public DgoodMetadataDto authenticity(String authenticity) {
    
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


  public DgoodMetadataDto imageSmall(String imageSmall) {
    
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


  public DgoodMetadataDto name(String name) {
    
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


  public DgoodMetadataDto description(String description) {
    
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


  public DgoodMetadataDto category(String category) {
    
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


  public DgoodMetadataDto imageLarge(String imageLarge) {
    
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


  public DgoodMetadataDto title(String title) {
    
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


  public DgoodMetadataDto render(String render) {
    
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


  public DgoodMetadataDto dgoodId(Long dgoodId) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DgoodMetadataDto dgoodMetadataDto = (DgoodMetadataDto) o;
    return Objects.equals(this.metadata, dgoodMetadataDto.metadata) &&
        Objects.equals(this.authenticity, dgoodMetadataDto.authenticity) &&
        Objects.equals(this.imageSmall, dgoodMetadataDto.imageSmall) &&
        Objects.equals(this.name, dgoodMetadataDto.name) &&
        Objects.equals(this.description, dgoodMetadataDto.description) &&
        Objects.equals(this.category, dgoodMetadataDto.category) &&
        Objects.equals(this.imageLarge, dgoodMetadataDto.imageLarge) &&
        Objects.equals(this.title, dgoodMetadataDto.title) &&
        Objects.equals(this.render, dgoodMetadataDto.render) &&
        Objects.equals(this.dgoodId, dgoodMetadataDto.dgoodId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, authenticity, imageSmall, name, description, category, imageLarge, title, render, dgoodId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DgoodMetadataDto {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    authenticity: ").append(toIndentedString(authenticity)).append("\n");
    sb.append("    imageSmall: ").append(toIndentedString(imageSmall)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    imageLarge: ").append(toIndentedString(imageLarge)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    render: ").append(toIndentedString(render)).append("\n");
    sb.append("    dgoodId: ").append(toIndentedString(dgoodId)).append("\n");
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


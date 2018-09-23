/*
 * Open Data Hub PostgreSQL Api Tourism
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SmgTags
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class SmgTags {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Shortname")
  private String shortname = null;

  @JsonProperty("TagName")
  private Map<String, String> tagName = null;

  @JsonProperty("ValidForEntity")
  private List<String> validForEntity = null;

  @JsonProperty("MainEntity")
  private String mainEntity = null;

  public SmgTags id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmgTags shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * Get shortname
   * @return shortname
  **/
  @ApiModelProperty(value = "")
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }

  public SmgTags tagName(Map<String, String> tagName) {
    this.tagName = tagName;
    return this;
  }

  public SmgTags putTagNameItem(String key, String tagNameItem) {
    if (this.tagName == null) {
      this.tagName = new HashMap<>();
    }
    this.tagName.put(key, tagNameItem);
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getTagName() {
    return tagName;
  }

  public void setTagName(Map<String, String> tagName) {
    this.tagName = tagName;
  }

  public SmgTags validForEntity(List<String> validForEntity) {
    this.validForEntity = validForEntity;
    return this;
  }

  public SmgTags addValidForEntityItem(String validForEntityItem) {
    if (this.validForEntity == null) {
      this.validForEntity = new ArrayList<>();
    }
    this.validForEntity.add(validForEntityItem);
    return this;
  }

   /**
   * Get validForEntity
   * @return validForEntity
  **/
  @ApiModelProperty(value = "")
  public List<String> getValidForEntity() {
    return validForEntity;
  }

  public void setValidForEntity(List<String> validForEntity) {
    this.validForEntity = validForEntity;
  }

  public SmgTags mainEntity(String mainEntity) {
    this.mainEntity = mainEntity;
    return this;
  }

   /**
   * Get mainEntity
   * @return mainEntity
  **/
  @ApiModelProperty(value = "")
  public String getMainEntity() {
    return mainEntity;
  }

  public void setMainEntity(String mainEntity) {
    this.mainEntity = mainEntity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmgTags smgTags = (SmgTags) o;
    return Objects.equals(this.id, smgTags.id) &&
        Objects.equals(this.shortname, smgTags.shortname) &&
        Objects.equals(this.tagName, smgTags.tagName) &&
        Objects.equals(this.validForEntity, smgTags.validForEntity) &&
        Objects.equals(this.mainEntity, smgTags.mainEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shortname, tagName, validForEntity, mainEntity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmgTags {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    validForEntity: ").append(toIndentedString(validForEntity)).append("\n");
    sb.append("    mainEntity: ").append(toIndentedString(mainEntity)).append("\n");
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


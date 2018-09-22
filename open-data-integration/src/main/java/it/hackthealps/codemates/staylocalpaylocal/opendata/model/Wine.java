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
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Detail;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ImageGallery;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class Wine {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Shortname")
  private String shortname = null;

  @JsonProperty("Detail")
  private Map<String, Detail> detail = null;

  @JsonProperty("Vintage")
  private Integer vintage = null;

  @JsonProperty("Awardyear")
  private Integer awardyear = null;

  @JsonProperty("CustomId")
  private String customId = null;

  @JsonProperty("CompanyId")
  private String companyId = null;

  @JsonProperty("ImageGallery")
  private List<ImageGallery> imageGallery = null;

  @JsonProperty("Awards")
  private List<String> awards = null;

  @JsonProperty("LastChange")
  private OffsetDateTime lastChange = null;

  @JsonProperty("FirstImport")
  private OffsetDateTime firstImport = null;

  @JsonProperty("Active")
  private Boolean active = null;

  @JsonProperty("SmgActive")
  private Boolean smgActive = null;

  @JsonProperty("HasLanguage")
  private List<String> hasLanguage = null;

  public Wine id(String id) {
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

  public Wine shortname(String shortname) {
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

  public Wine detail(Map<String, Detail> detail) {
    this.detail = detail;
    return this;
  }

  public Wine putDetailItem(String key, Detail detailItem) {
    if (this.detail == null) {
      this.detail = new HashMap<>();
    }
    this.detail.put(key, detailItem);
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")
  public Map<String, Detail> getDetail() {
    return detail;
  }

  public void setDetail(Map<String, Detail> detail) {
    this.detail = detail;
  }

  public Wine vintage(Integer vintage) {
    this.vintage = vintage;
    return this;
  }

   /**
   * Get vintage
   * @return vintage
  **/
  @ApiModelProperty(value = "")
  public Integer getVintage() {
    return vintage;
  }

  public void setVintage(Integer vintage) {
    this.vintage = vintage;
  }

  public Wine awardyear(Integer awardyear) {
    this.awardyear = awardyear;
    return this;
  }

   /**
   * Get awardyear
   * @return awardyear
  **/
  @ApiModelProperty(value = "")
  public Integer getAwardyear() {
    return awardyear;
  }

  public void setAwardyear(Integer awardyear) {
    this.awardyear = awardyear;
  }

  public Wine customId(String customId) {
    this.customId = customId;
    return this;
  }

   /**
   * Get customId
   * @return customId
  **/
  @ApiModelProperty(value = "")
  public String getCustomId() {
    return customId;
  }

  public void setCustomId(String customId) {
    this.customId = customId;
  }

  public Wine companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public Wine imageGallery(List<ImageGallery> imageGallery) {
    this.imageGallery = imageGallery;
    return this;
  }

  public Wine addImageGalleryItem(ImageGallery imageGalleryItem) {
    if (this.imageGallery == null) {
      this.imageGallery = new ArrayList<>();
    }
    this.imageGallery.add(imageGalleryItem);
    return this;
  }

   /**
   * Get imageGallery
   * @return imageGallery
  **/
  @ApiModelProperty(value = "")
  public List<ImageGallery> getImageGallery() {
    return imageGallery;
  }

  public void setImageGallery(List<ImageGallery> imageGallery) {
    this.imageGallery = imageGallery;
  }

  public Wine awards(List<String> awards) {
    this.awards = awards;
    return this;
  }

  public Wine addAwardsItem(String awardsItem) {
    if (this.awards == null) {
      this.awards = new ArrayList<>();
    }
    this.awards.add(awardsItem);
    return this;
  }

   /**
   * Get awards
   * @return awards
  **/
  @ApiModelProperty(value = "")
  public List<String> getAwards() {
    return awards;
  }

  public void setAwards(List<String> awards) {
    this.awards = awards;
  }

  public Wine lastChange(OffsetDateTime lastChange) {
    this.lastChange = lastChange;
    return this;
  }

   /**
   * Get lastChange
   * @return lastChange
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastChange() {
    return lastChange;
  }

  public void setLastChange(OffsetDateTime lastChange) {
    this.lastChange = lastChange;
  }

  public Wine firstImport(OffsetDateTime firstImport) {
    this.firstImport = firstImport;
    return this;
  }

   /**
   * Get firstImport
   * @return firstImport
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFirstImport() {
    return firstImport;
  }

  public void setFirstImport(OffsetDateTime firstImport) {
    this.firstImport = firstImport;
  }

  public Wine active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Wine smgActive(Boolean smgActive) {
    this.smgActive = smgActive;
    return this;
  }

   /**
   * Get smgActive
   * @return smgActive
  **/
  @ApiModelProperty(value = "")
  public Boolean isSmgActive() {
    return smgActive;
  }

  public void setSmgActive(Boolean smgActive) {
    this.smgActive = smgActive;
  }

  public Wine hasLanguage(List<String> hasLanguage) {
    this.hasLanguage = hasLanguage;
    return this;
  }

  public Wine addHasLanguageItem(String hasLanguageItem) {
    if (this.hasLanguage == null) {
      this.hasLanguage = new ArrayList<>();
    }
    this.hasLanguage.add(hasLanguageItem);
    return this;
  }

   /**
   * Get hasLanguage
   * @return hasLanguage
  **/
  @ApiModelProperty(value = "")
  public List<String> getHasLanguage() {
    return hasLanguage;
  }

  public void setHasLanguage(List<String> hasLanguage) {
    this.hasLanguage = hasLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wine wine = (Wine) o;
    return Objects.equals(this.id, wine.id) &&
        Objects.equals(this.shortname, wine.shortname) &&
        Objects.equals(this.detail, wine.detail) &&
        Objects.equals(this.vintage, wine.vintage) &&
        Objects.equals(this.awardyear, wine.awardyear) &&
        Objects.equals(this.customId, wine.customId) &&
        Objects.equals(this.companyId, wine.companyId) &&
        Objects.equals(this.imageGallery, wine.imageGallery) &&
        Objects.equals(this.awards, wine.awards) &&
        Objects.equals(this.lastChange, wine.lastChange) &&
        Objects.equals(this.firstImport, wine.firstImport) &&
        Objects.equals(this.active, wine.active) &&
        Objects.equals(this.smgActive, wine.smgActive) &&
        Objects.equals(this.hasLanguage, wine.hasLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shortname, detail, vintage, awardyear, customId, companyId, imageGallery, awards, lastChange, firstImport, active, smgActive, hasLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    vintage: ").append(toIndentedString(vintage)).append("\n");
    sb.append("    awardyear: ").append(toIndentedString(awardyear)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    imageGallery: ").append(toIndentedString(imageGallery)).append("\n");
    sb.append("    awards: ").append(toIndentedString(awards)).append("\n");
    sb.append("    lastChange: ").append(toIndentedString(lastChange)).append("\n");
    sb.append("    firstImport: ").append(toIndentedString(firstImport)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    smgActive: ").append(toIndentedString(smgActive)).append("\n");
    sb.append("    hasLanguage: ").append(toIndentedString(hasLanguage)).append("\n");
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

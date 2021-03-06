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
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ContactInfos;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Detail;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GpsPolygon;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ImageGallery;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Webcam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tourismverein
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class Tourismverein {
  @JsonProperty("RegionId")
  private String regionId = null;

  @JsonProperty("GpsPolygon")
  private List<GpsPolygon> gpsPolygon = null;

  @JsonProperty("Webcam")
  private List<Webcam> webcam = null;

  @JsonProperty("VisibleInSearch")
  private Boolean visibleInSearch = null;

  @JsonProperty("SkiareaIds")
  private List<String> skiareaIds = null;

  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Active")
  private Boolean active = null;

  @JsonProperty("CustomId")
  private String customId = null;

  @JsonProperty("Shortname")
  private String shortname = null;

  @JsonProperty("Gpstype")
  private String gpstype = null;

  @JsonProperty("Latitude")
  private Double latitude = null;

  @JsonProperty("Longitude")
  private Double longitude = null;

  @JsonProperty("Altitude")
  private Double altitude = null;

  @JsonProperty("AltitudeUnitofMeasure")
  private String altitudeUnitofMeasure = null;

  @JsonProperty("Detail")
  private Map<String, Detail> detail = null;

  @JsonProperty("ContactInfos")
  private Map<String, ContactInfos> contactInfos = null;

  @JsonProperty("ImageGallery")
  private List<ImageGallery> imageGallery = null;

  @JsonProperty("SmgTags")
  private List<String> smgTags = null;

  @JsonProperty("SmgActive")
  private Boolean smgActive = null;

  @JsonProperty("HasLanguage")
  private List<String> hasLanguage = null;

  public Tourismverein regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @ApiModelProperty(value = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public Tourismverein gpsPolygon(List<GpsPolygon> gpsPolygon) {
    this.gpsPolygon = gpsPolygon;
    return this;
  }

  public Tourismverein addGpsPolygonItem(GpsPolygon gpsPolygonItem) {
    if (this.gpsPolygon == null) {
      this.gpsPolygon = new ArrayList<>();
    }
    this.gpsPolygon.add(gpsPolygonItem);
    return this;
  }

   /**
   * Get gpsPolygon
   * @return gpsPolygon
  **/
  @ApiModelProperty(value = "")
  public List<GpsPolygon> getGpsPolygon() {
    return gpsPolygon;
  }

  public void setGpsPolygon(List<GpsPolygon> gpsPolygon) {
    this.gpsPolygon = gpsPolygon;
  }

  public Tourismverein webcam(List<Webcam> webcam) {
    this.webcam = webcam;
    return this;
  }

  public Tourismverein addWebcamItem(Webcam webcamItem) {
    if (this.webcam == null) {
      this.webcam = new ArrayList<>();
    }
    this.webcam.add(webcamItem);
    return this;
  }

   /**
   * Get webcam
   * @return webcam
  **/
  @ApiModelProperty(value = "")
  public List<Webcam> getWebcam() {
    return webcam;
  }

  public void setWebcam(List<Webcam> webcam) {
    this.webcam = webcam;
  }

  public Tourismverein visibleInSearch(Boolean visibleInSearch) {
    this.visibleInSearch = visibleInSearch;
    return this;
  }

   /**
   * Get visibleInSearch
   * @return visibleInSearch
  **/
  @ApiModelProperty(value = "")
  public Boolean isVisibleInSearch() {
    return visibleInSearch;
  }

  public void setVisibleInSearch(Boolean visibleInSearch) {
    this.visibleInSearch = visibleInSearch;
  }

  public Tourismverein skiareaIds(List<String> skiareaIds) {
    this.skiareaIds = skiareaIds;
    return this;
  }

  public Tourismverein addSkiareaIdsItem(String skiareaIdsItem) {
    if (this.skiareaIds == null) {
      this.skiareaIds = new ArrayList<>();
    }
    this.skiareaIds.add(skiareaIdsItem);
    return this;
  }

   /**
   * Get skiareaIds
   * @return skiareaIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getSkiareaIds() {
    return skiareaIds;
  }

  public void setSkiareaIds(List<String> skiareaIds) {
    this.skiareaIds = skiareaIds;
  }

  public Tourismverein id(String id) {
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

  public Tourismverein active(Boolean active) {
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

  public Tourismverein customId(String customId) {
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

  public Tourismverein shortname(String shortname) {
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

  public Tourismverein gpstype(String gpstype) {
    this.gpstype = gpstype;
    return this;
  }

   /**
   * Get gpstype
   * @return gpstype
  **/
  @ApiModelProperty(value = "")
  public String getGpstype() {
    return gpstype;
  }

  public void setGpstype(String gpstype) {
    this.gpstype = gpstype;
  }

  public Tourismverein latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Tourismverein longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Tourismverein altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

   /**
   * Get altitude
   * @return altitude
  **/
  @ApiModelProperty(value = "")
  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public Tourismverein altitudeUnitofMeasure(String altitudeUnitofMeasure) {
    this.altitudeUnitofMeasure = altitudeUnitofMeasure;
    return this;
  }

   /**
   * Get altitudeUnitofMeasure
   * @return altitudeUnitofMeasure
  **/
  @ApiModelProperty(value = "")
  public String getAltitudeUnitofMeasure() {
    return altitudeUnitofMeasure;
  }

  public void setAltitudeUnitofMeasure(String altitudeUnitofMeasure) {
    this.altitudeUnitofMeasure = altitudeUnitofMeasure;
  }

  public Tourismverein detail(Map<String, Detail> detail) {
    this.detail = detail;
    return this;
  }

  public Tourismverein putDetailItem(String key, Detail detailItem) {
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

  public Tourismverein contactInfos(Map<String, ContactInfos> contactInfos) {
    this.contactInfos = contactInfos;
    return this;
  }

  public Tourismverein putContactInfosItem(String key, ContactInfos contactInfosItem) {
    if (this.contactInfos == null) {
      this.contactInfos = new HashMap<>();
    }
    this.contactInfos.put(key, contactInfosItem);
    return this;
  }

   /**
   * Get contactInfos
   * @return contactInfos
  **/
  @ApiModelProperty(value = "")
  public Map<String, ContactInfos> getContactInfos() {
    return contactInfos;
  }

  public void setContactInfos(Map<String, ContactInfos> contactInfos) {
    this.contactInfos = contactInfos;
  }

  public Tourismverein imageGallery(List<ImageGallery> imageGallery) {
    this.imageGallery = imageGallery;
    return this;
  }

  public Tourismverein addImageGalleryItem(ImageGallery imageGalleryItem) {
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

  public Tourismverein smgTags(List<String> smgTags) {
    this.smgTags = smgTags;
    return this;
  }

  public Tourismverein addSmgTagsItem(String smgTagsItem) {
    if (this.smgTags == null) {
      this.smgTags = new ArrayList<>();
    }
    this.smgTags.add(smgTagsItem);
    return this;
  }

   /**
   * Get smgTags
   * @return smgTags
  **/
  @ApiModelProperty(value = "")
  public List<String> getSmgTags() {
    return smgTags;
  }

  public void setSmgTags(List<String> smgTags) {
    this.smgTags = smgTags;
  }

  public Tourismverein smgActive(Boolean smgActive) {
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

  public Tourismverein hasLanguage(List<String> hasLanguage) {
    this.hasLanguage = hasLanguage;
    return this;
  }

  public Tourismverein addHasLanguageItem(String hasLanguageItem) {
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
    Tourismverein tourismverein = (Tourismverein) o;
    return Objects.equals(this.regionId, tourismverein.regionId) &&
        Objects.equals(this.gpsPolygon, tourismverein.gpsPolygon) &&
        Objects.equals(this.webcam, tourismverein.webcam) &&
        Objects.equals(this.visibleInSearch, tourismverein.visibleInSearch) &&
        Objects.equals(this.skiareaIds, tourismverein.skiareaIds) &&
        Objects.equals(this.id, tourismverein.id) &&
        Objects.equals(this.active, tourismverein.active) &&
        Objects.equals(this.customId, tourismverein.customId) &&
        Objects.equals(this.shortname, tourismverein.shortname) &&
        Objects.equals(this.gpstype, tourismverein.gpstype) &&
        Objects.equals(this.latitude, tourismverein.latitude) &&
        Objects.equals(this.longitude, tourismverein.longitude) &&
        Objects.equals(this.altitude, tourismverein.altitude) &&
        Objects.equals(this.altitudeUnitofMeasure, tourismverein.altitudeUnitofMeasure) &&
        Objects.equals(this.detail, tourismverein.detail) &&
        Objects.equals(this.contactInfos, tourismverein.contactInfos) &&
        Objects.equals(this.imageGallery, tourismverein.imageGallery) &&
        Objects.equals(this.smgTags, tourismverein.smgTags) &&
        Objects.equals(this.smgActive, tourismverein.smgActive) &&
        Objects.equals(this.hasLanguage, tourismverein.hasLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, gpsPolygon, webcam, visibleInSearch, skiareaIds, id, active, customId, shortname, gpstype, latitude, longitude, altitude, altitudeUnitofMeasure, detail, contactInfos, imageGallery, smgTags, smgActive, hasLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tourismverein {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    gpsPolygon: ").append(toIndentedString(gpsPolygon)).append("\n");
    sb.append("    webcam: ").append(toIndentedString(webcam)).append("\n");
    sb.append("    visibleInSearch: ").append(toIndentedString(visibleInSearch)).append("\n");
    sb.append("    skiareaIds: ").append(toIndentedString(skiareaIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    gpstype: ").append(toIndentedString(gpstype)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    altitudeUnitofMeasure: ").append(toIndentedString(altitudeUnitofMeasure)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    contactInfos: ").append(toIndentedString(contactInfos)).append("\n");
    sb.append("    imageGallery: ").append(toIndentedString(imageGallery)).append("\n");
    sb.append("    smgTags: ").append(toIndentedString(smgTags)).append("\n");
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


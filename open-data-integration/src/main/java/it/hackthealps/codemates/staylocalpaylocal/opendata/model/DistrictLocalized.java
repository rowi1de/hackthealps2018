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
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ImageGalleryLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.WebcamLocalized;
import java.util.ArrayList;
import java.util.List;

/**
 * DistrictLocalized
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class DistrictLocalized {
  @JsonProperty("IsComune")
  private Boolean isComune = null;

  @JsonProperty("RegionId")
  private String regionId = null;

  @JsonProperty("TourismvereinId")
  private String tourismvereinId = null;

  @JsonProperty("MunicipalityId")
  private String municipalityId = null;

  @JsonProperty("SiagId")
  private String siagId = null;

  @JsonProperty("GpsPolygon")
  private List<GpsPolygon> gpsPolygon = null;

  @JsonProperty("Webcam")
  private List<WebcamLocalized> webcam = null;

  @JsonProperty("VisibleInSearch")
  private Boolean visibleInSearch = null;

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
  private Detail detail = null;

  @JsonProperty("ContactInfos")
  private ContactInfos contactInfos = null;

  @JsonProperty("ImageGallery")
  private List<ImageGalleryLocalized> imageGallery = null;

  @JsonProperty("SmgTags")
  private List<String> smgTags = null;

  @JsonProperty("SmgActive")
  private Boolean smgActive = null;

  public DistrictLocalized isComune(Boolean isComune) {
    this.isComune = isComune;
    return this;
  }

   /**
   * Get isComune
   * @return isComune
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsComune() {
    return isComune;
  }

  public void setIsComune(Boolean isComune) {
    this.isComune = isComune;
  }

  public DistrictLocalized regionId(String regionId) {
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

  public DistrictLocalized tourismvereinId(String tourismvereinId) {
    this.tourismvereinId = tourismvereinId;
    return this;
  }

   /**
   * Get tourismvereinId
   * @return tourismvereinId
  **/
  @ApiModelProperty(value = "")
  public String getTourismvereinId() {
    return tourismvereinId;
  }

  public void setTourismvereinId(String tourismvereinId) {
    this.tourismvereinId = tourismvereinId;
  }

  public DistrictLocalized municipalityId(String municipalityId) {
    this.municipalityId = municipalityId;
    return this;
  }

   /**
   * Get municipalityId
   * @return municipalityId
  **/
  @ApiModelProperty(value = "")
  public String getMunicipalityId() {
    return municipalityId;
  }

  public void setMunicipalityId(String municipalityId) {
    this.municipalityId = municipalityId;
  }

  public DistrictLocalized siagId(String siagId) {
    this.siagId = siagId;
    return this;
  }

   /**
   * Get siagId
   * @return siagId
  **/
  @ApiModelProperty(value = "")
  public String getSiagId() {
    return siagId;
  }

  public void setSiagId(String siagId) {
    this.siagId = siagId;
  }

  public DistrictLocalized gpsPolygon(List<GpsPolygon> gpsPolygon) {
    this.gpsPolygon = gpsPolygon;
    return this;
  }

  public DistrictLocalized addGpsPolygonItem(GpsPolygon gpsPolygonItem) {
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

  public DistrictLocalized webcam(List<WebcamLocalized> webcam) {
    this.webcam = webcam;
    return this;
  }

  public DistrictLocalized addWebcamItem(WebcamLocalized webcamItem) {
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
  public List<WebcamLocalized> getWebcam() {
    return webcam;
  }

  public void setWebcam(List<WebcamLocalized> webcam) {
    this.webcam = webcam;
  }

  public DistrictLocalized visibleInSearch(Boolean visibleInSearch) {
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

  public DistrictLocalized id(String id) {
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

  public DistrictLocalized active(Boolean active) {
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

  public DistrictLocalized customId(String customId) {
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

  public DistrictLocalized shortname(String shortname) {
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

  public DistrictLocalized gpstype(String gpstype) {
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

  public DistrictLocalized latitude(Double latitude) {
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

  public DistrictLocalized longitude(Double longitude) {
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

  public DistrictLocalized altitude(Double altitude) {
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

  public DistrictLocalized altitudeUnitofMeasure(String altitudeUnitofMeasure) {
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

  public DistrictLocalized detail(Detail detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")
  public Detail getDetail() {
    return detail;
  }

  public void setDetail(Detail detail) {
    this.detail = detail;
  }

  public DistrictLocalized contactInfos(ContactInfos contactInfos) {
    this.contactInfos = contactInfos;
    return this;
  }

   /**
   * Get contactInfos
   * @return contactInfos
  **/
  @ApiModelProperty(value = "")
  public ContactInfos getContactInfos() {
    return contactInfos;
  }

  public void setContactInfos(ContactInfos contactInfos) {
    this.contactInfos = contactInfos;
  }

  public DistrictLocalized imageGallery(List<ImageGalleryLocalized> imageGallery) {
    this.imageGallery = imageGallery;
    return this;
  }

  public DistrictLocalized addImageGalleryItem(ImageGalleryLocalized imageGalleryItem) {
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
  public List<ImageGalleryLocalized> getImageGallery() {
    return imageGallery;
  }

  public void setImageGallery(List<ImageGalleryLocalized> imageGallery) {
    this.imageGallery = imageGallery;
  }

  public DistrictLocalized smgTags(List<String> smgTags) {
    this.smgTags = smgTags;
    return this;
  }

  public DistrictLocalized addSmgTagsItem(String smgTagsItem) {
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

  public DistrictLocalized smgActive(Boolean smgActive) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistrictLocalized districtLocalized = (DistrictLocalized) o;
    return Objects.equals(this.isComune, districtLocalized.isComune) &&
        Objects.equals(this.regionId, districtLocalized.regionId) &&
        Objects.equals(this.tourismvereinId, districtLocalized.tourismvereinId) &&
        Objects.equals(this.municipalityId, districtLocalized.municipalityId) &&
        Objects.equals(this.siagId, districtLocalized.siagId) &&
        Objects.equals(this.gpsPolygon, districtLocalized.gpsPolygon) &&
        Objects.equals(this.webcam, districtLocalized.webcam) &&
        Objects.equals(this.visibleInSearch, districtLocalized.visibleInSearch) &&
        Objects.equals(this.id, districtLocalized.id) &&
        Objects.equals(this.active, districtLocalized.active) &&
        Objects.equals(this.customId, districtLocalized.customId) &&
        Objects.equals(this.shortname, districtLocalized.shortname) &&
        Objects.equals(this.gpstype, districtLocalized.gpstype) &&
        Objects.equals(this.latitude, districtLocalized.latitude) &&
        Objects.equals(this.longitude, districtLocalized.longitude) &&
        Objects.equals(this.altitude, districtLocalized.altitude) &&
        Objects.equals(this.altitudeUnitofMeasure, districtLocalized.altitudeUnitofMeasure) &&
        Objects.equals(this.detail, districtLocalized.detail) &&
        Objects.equals(this.contactInfos, districtLocalized.contactInfos) &&
        Objects.equals(this.imageGallery, districtLocalized.imageGallery) &&
        Objects.equals(this.smgTags, districtLocalized.smgTags) &&
        Objects.equals(this.smgActive, districtLocalized.smgActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isComune, regionId, tourismvereinId, municipalityId, siagId, gpsPolygon, webcam, visibleInSearch, id, active, customId, shortname, gpstype, latitude, longitude, altitude, altitudeUnitofMeasure, detail, contactInfos, imageGallery, smgTags, smgActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictLocalized {\n");
    
    sb.append("    isComune: ").append(toIndentedString(isComune)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    tourismvereinId: ").append(toIndentedString(tourismvereinId)).append("\n");
    sb.append("    municipalityId: ").append(toIndentedString(municipalityId)).append("\n");
    sb.append("    siagId: ").append(toIndentedString(siagId)).append("\n");
    sb.append("    gpsPolygon: ").append(toIndentedString(gpsPolygon)).append("\n");
    sb.append("    webcam: ").append(toIndentedString(webcam)).append("\n");
    sb.append("    visibleInSearch: ").append(toIndentedString(visibleInSearch)).append("\n");
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


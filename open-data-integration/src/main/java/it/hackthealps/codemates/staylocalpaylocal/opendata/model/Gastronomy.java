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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Gastronomy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class Gastronomy {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Active")
  private Boolean active = null;

  @JsonProperty("Shortname")
  private String shortname = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("DistrictId")
  private String districtId = null;

  @JsonProperty("FirstImport")
  private String firstImport = null;

  @JsonProperty("LastChange")
  private String lastChange = null;

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

  @JsonProperty("OperationSchedule")
  private List<OperationSchedule> operationSchedule = null;

  @JsonProperty("MaxSeatingCapacity")
  private Integer maxSeatingCapacity = null;

  @JsonProperty("ImageGallery")
  private List<ImageGallery> imageGallery = null;

  @JsonProperty("Detail")
  private Map<String, Detail> detail = null;

  @JsonProperty("ContactInfos")
  private Map<String, ContactInfos> contactInfos = null;

  @JsonProperty("CategoryCodes")
  private List<CategoryCodes> categoryCodes = null;

  @JsonProperty("DishRates")
  private List<DishRates> dishRates = null;

  @JsonProperty("CapacityCeremony")
  private List<CapacityCeremony> capacityCeremony = null;

  @JsonProperty("Facilities")
  private List<Facilities> facilities = null;

  @JsonProperty("MarketinggroupId")
  private List<String> marketinggroupId = null;

  @JsonProperty("LocationInfo")
  private LocationInfo locationInfo = null;

  @JsonProperty("AccommodationId")
  private String accommodationId = null;

  @JsonProperty("SmgTags")
  private List<String> smgTags = null;

  @JsonProperty("SmgActive")
  private Boolean smgActive = null;

  @JsonProperty("HasLanguage")
  private List<String> hasLanguage = null;

  public Gastronomy id(String id) {
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

  public Gastronomy active(Boolean active) {
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

  public Gastronomy shortname(String shortname) {
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

  public Gastronomy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Gastronomy districtId(String districtId) {
    this.districtId = districtId;
    return this;
  }

   /**
   * Get districtId
   * @return districtId
  **/
  @ApiModelProperty(value = "")
  public String getDistrictId() {
    return districtId;
  }

  public void setDistrictId(String districtId) {
    this.districtId = districtId;
  }

  public Gastronomy firstImport(String firstImport) {
    this.firstImport = firstImport;
    return this;
  }

   /**
   * Get firstImport
   * @return firstImport
  **/
  @ApiModelProperty(value = "")
  public String getFirstImport() {
    return firstImport;
  }

  public void setFirstImport(String firstImport) {
    this.firstImport = firstImport;
  }

  public Gastronomy lastChange(String lastChange) {
    this.lastChange = lastChange;
    return this;
  }

   /**
   * Get lastChange
   * @return lastChange
  **/
  @ApiModelProperty(value = "")
  public String getLastChange() {
    return lastChange;
  }

  public void setLastChange(String lastChange) {
    this.lastChange = lastChange;
  }

  public Gastronomy gpstype(String gpstype) {
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

  public Gastronomy latitude(Double latitude) {
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

  public Gastronomy longitude(Double longitude) {
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

  public Gastronomy altitude(Double altitude) {
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

  public Gastronomy altitudeUnitofMeasure(String altitudeUnitofMeasure) {
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

  public Gastronomy operationSchedule(List<OperationSchedule> operationSchedule) {
    this.operationSchedule = operationSchedule;
    return this;
  }

  public Gastronomy addOperationScheduleItem(OperationSchedule operationScheduleItem) {
    if (this.operationSchedule == null) {
      this.operationSchedule = new ArrayList<>();
    }
    this.operationSchedule.add(operationScheduleItem);
    return this;
  }

   /**
   * Get operationSchedule
   * @return operationSchedule
  **/
  @ApiModelProperty(value = "")
  public List<OperationSchedule> getOperationSchedule() {
    return operationSchedule;
  }

  public void setOperationSchedule(List<OperationSchedule> operationSchedule) {
    this.operationSchedule = operationSchedule;
  }

  public Gastronomy maxSeatingCapacity(Integer maxSeatingCapacity) {
    this.maxSeatingCapacity = maxSeatingCapacity;
    return this;
  }

   /**
   * Get maxSeatingCapacity
   * @return maxSeatingCapacity
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxSeatingCapacity() {
    return maxSeatingCapacity;
  }

  public void setMaxSeatingCapacity(Integer maxSeatingCapacity) {
    this.maxSeatingCapacity = maxSeatingCapacity;
  }

  public Gastronomy imageGallery(List<ImageGallery> imageGallery) {
    this.imageGallery = imageGallery;
    return this;
  }

  public Gastronomy addImageGalleryItem(ImageGallery imageGalleryItem) {
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

  public Gastronomy detail(Map<String, Detail> detail) {
    this.detail = detail;
    return this;
  }

  public Gastronomy putDetailItem(String key, Detail detailItem) {
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

  public Gastronomy contactInfos(Map<String, ContactInfos> contactInfos) {
    this.contactInfos = contactInfos;
    return this;
  }

  public Gastronomy putContactInfosItem(String key, ContactInfos contactInfosItem) {
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

  public Gastronomy categoryCodes(List<CategoryCodes> categoryCodes) {
    this.categoryCodes = categoryCodes;
    return this;
  }

  public Gastronomy addCategoryCodesItem(CategoryCodes categoryCodesItem) {
    if (this.categoryCodes == null) {
      this.categoryCodes = new ArrayList<>();
    }
    this.categoryCodes.add(categoryCodesItem);
    return this;
  }

   /**
   * Get categoryCodes
   * @return categoryCodes
  **/
  @ApiModelProperty(value = "")
  public List<CategoryCodes> getCategoryCodes() {
    return categoryCodes;
  }

  public void setCategoryCodes(List<CategoryCodes> categoryCodes) {
    this.categoryCodes = categoryCodes;
  }

  public Gastronomy dishRates(List<DishRates> dishRates) {
    this.dishRates = dishRates;
    return this;
  }

  public Gastronomy addDishRatesItem(DishRates dishRatesItem) {
    if (this.dishRates == null) {
      this.dishRates = new ArrayList<>();
    }
    this.dishRates.add(dishRatesItem);
    return this;
  }

   /**
   * Get dishRates
   * @return dishRates
  **/
  @ApiModelProperty(value = "")
  public List<DishRates> getDishRates() {
    return dishRates;
  }

  public void setDishRates(List<DishRates> dishRates) {
    this.dishRates = dishRates;
  }

  public Gastronomy capacityCeremony(List<CapacityCeremony> capacityCeremony) {
    this.capacityCeremony = capacityCeremony;
    return this;
  }

  public Gastronomy addCapacityCeremonyItem(CapacityCeremony capacityCeremonyItem) {
    if (this.capacityCeremony == null) {
      this.capacityCeremony = new ArrayList<>();
    }
    this.capacityCeremony.add(capacityCeremonyItem);
    return this;
  }

   /**
   * Get capacityCeremony
   * @return capacityCeremony
  **/
  @ApiModelProperty(value = "")
  public List<CapacityCeremony> getCapacityCeremony() {
    return capacityCeremony;
  }

  public void setCapacityCeremony(List<CapacityCeremony> capacityCeremony) {
    this.capacityCeremony = capacityCeremony;
  }

  public Gastronomy facilities(List<Facilities> facilities) {
    this.facilities = facilities;
    return this;
  }

  public Gastronomy addFacilitiesItem(Facilities facilitiesItem) {
    if (this.facilities == null) {
      this.facilities = new ArrayList<>();
    }
    this.facilities.add(facilitiesItem);
    return this;
  }

   /**
   * Get facilities
   * @return facilities
  **/
  @ApiModelProperty(value = "")
  public List<Facilities> getFacilities() {
    return facilities;
  }

  public void setFacilities(List<Facilities> facilities) {
    this.facilities = facilities;
  }

  public Gastronomy marketinggroupId(List<String> marketinggroupId) {
    this.marketinggroupId = marketinggroupId;
    return this;
  }

  public Gastronomy addMarketinggroupIdItem(String marketinggroupIdItem) {
    if (this.marketinggroupId == null) {
      this.marketinggroupId = new ArrayList<>();
    }
    this.marketinggroupId.add(marketinggroupIdItem);
    return this;
  }

   /**
   * Get marketinggroupId
   * @return marketinggroupId
  **/
  @ApiModelProperty(value = "")
  public List<String> getMarketinggroupId() {
    return marketinggroupId;
  }

  public void setMarketinggroupId(List<String> marketinggroupId) {
    this.marketinggroupId = marketinggroupId;
  }

  public Gastronomy locationInfo(LocationInfo locationInfo) {
    this.locationInfo = locationInfo;
    return this;
  }

   /**
   * Get locationInfo
   * @return locationInfo
  **/
  @ApiModelProperty(value = "")
  public LocationInfo getLocationInfo() {
    return locationInfo;
  }

  public void setLocationInfo(LocationInfo locationInfo) {
    this.locationInfo = locationInfo;
  }

  public Gastronomy accommodationId(String accommodationId) {
    this.accommodationId = accommodationId;
    return this;
  }

   /**
   * Get accommodationId
   * @return accommodationId
  **/
  @ApiModelProperty(value = "")
  public String getAccommodationId() {
    return accommodationId;
  }

  public void setAccommodationId(String accommodationId) {
    this.accommodationId = accommodationId;
  }

  public Gastronomy smgTags(List<String> smgTags) {
    this.smgTags = smgTags;
    return this;
  }

  public Gastronomy addSmgTagsItem(String smgTagsItem) {
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

  public Gastronomy smgActive(Boolean smgActive) {
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

  public Gastronomy hasLanguage(List<String> hasLanguage) {
    this.hasLanguage = hasLanguage;
    return this;
  }

  public Gastronomy addHasLanguageItem(String hasLanguageItem) {
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
    Gastronomy gastronomy = (Gastronomy) o;
    return Objects.equals(this.id, gastronomy.id) &&
        Objects.equals(this.active, gastronomy.active) &&
        Objects.equals(this.shortname, gastronomy.shortname) &&
        Objects.equals(this.type, gastronomy.type) &&
        Objects.equals(this.districtId, gastronomy.districtId) &&
        Objects.equals(this.firstImport, gastronomy.firstImport) &&
        Objects.equals(this.lastChange, gastronomy.lastChange) &&
        Objects.equals(this.gpstype, gastronomy.gpstype) &&
        Objects.equals(this.latitude, gastronomy.latitude) &&
        Objects.equals(this.longitude, gastronomy.longitude) &&
        Objects.equals(this.altitude, gastronomy.altitude) &&
        Objects.equals(this.altitudeUnitofMeasure, gastronomy.altitudeUnitofMeasure) &&
        Objects.equals(this.operationSchedule, gastronomy.operationSchedule) &&
        Objects.equals(this.maxSeatingCapacity, gastronomy.maxSeatingCapacity) &&
        Objects.equals(this.imageGallery, gastronomy.imageGallery) &&
        Objects.equals(this.detail, gastronomy.detail) &&
        Objects.equals(this.contactInfos, gastronomy.contactInfos) &&
        Objects.equals(this.categoryCodes, gastronomy.categoryCodes) &&
        Objects.equals(this.dishRates, gastronomy.dishRates) &&
        Objects.equals(this.capacityCeremony, gastronomy.capacityCeremony) &&
        Objects.equals(this.facilities, gastronomy.facilities) &&
        Objects.equals(this.marketinggroupId, gastronomy.marketinggroupId) &&
        Objects.equals(this.locationInfo, gastronomy.locationInfo) &&
        Objects.equals(this.accommodationId, gastronomy.accommodationId) &&
        Objects.equals(this.smgTags, gastronomy.smgTags) &&
        Objects.equals(this.smgActive, gastronomy.smgActive) &&
        Objects.equals(this.hasLanguage, gastronomy.hasLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, shortname, type, districtId, firstImport, lastChange, gpstype, latitude, longitude, altitude, altitudeUnitofMeasure, operationSchedule, maxSeatingCapacity, imageGallery, detail, contactInfos, categoryCodes, dishRates, capacityCeremony, facilities, marketinggroupId, locationInfo, accommodationId, smgTags, smgActive, hasLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gastronomy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    firstImport: ").append(toIndentedString(firstImport)).append("\n");
    sb.append("    lastChange: ").append(toIndentedString(lastChange)).append("\n");
    sb.append("    gpstype: ").append(toIndentedString(gpstype)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    altitudeUnitofMeasure: ").append(toIndentedString(altitudeUnitofMeasure)).append("\n");
    sb.append("    operationSchedule: ").append(toIndentedString(operationSchedule)).append("\n");
    sb.append("    maxSeatingCapacity: ").append(toIndentedString(maxSeatingCapacity)).append("\n");
    sb.append("    imageGallery: ").append(toIndentedString(imageGallery)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    contactInfos: ").append(toIndentedString(contactInfos)).append("\n");
    sb.append("    categoryCodes: ").append(toIndentedString(categoryCodes)).append("\n");
    sb.append("    dishRates: ").append(toIndentedString(dishRates)).append("\n");
    sb.append("    capacityCeremony: ").append(toIndentedString(capacityCeremony)).append("\n");
    sb.append("    facilities: ").append(toIndentedString(facilities)).append("\n");
    sb.append("    marketinggroupId: ").append(toIndentedString(marketinggroupId)).append("\n");
    sb.append("    locationInfo: ").append(toIndentedString(locationInfo)).append("\n");
    sb.append("    accommodationId: ").append(toIndentedString(accommodationId)).append("\n");
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

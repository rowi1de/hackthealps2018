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
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Measuringpoint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class Measuringpoint {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("FirstImport")
  private String firstImport = null;

  @JsonProperty("LastUpdate")
  private String lastUpdate = null;

  @JsonProperty("Active")
  private Boolean active = null;

  @JsonProperty("SmgActive")
  private Boolean smgActive = null;

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

  @JsonProperty("SnowHeight")
  private String snowHeight = null;

  @JsonProperty("newSnowHeight")
  private String newSnowHeight = null;

  @JsonProperty("Temperature")
  private String temperature = null;

  @JsonProperty("LastSnowDate")
  private String lastSnowDate = null;

  @JsonProperty("WeatherObservation")
  private List<WeatherObservation> weatherObservation = null;

  @JsonProperty("LocationInfo")
  private LocationInfo locationInfo = null;

  @JsonProperty("OwnerId")
  private String ownerId = null;

  @JsonProperty("AreaIds")
  private List<String> areaIds = null;

  public Measuringpoint id(String id) {
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

  public Measuringpoint firstImport(String firstImport) {
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

  public Measuringpoint lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Measuringpoint active(Boolean active) {
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

  public Measuringpoint smgActive(Boolean smgActive) {
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

  public Measuringpoint shortname(String shortname) {
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

  public Measuringpoint gpstype(String gpstype) {
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

  public Measuringpoint latitude(Double latitude) {
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

  public Measuringpoint longitude(Double longitude) {
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

  public Measuringpoint altitude(Double altitude) {
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

  public Measuringpoint altitudeUnitofMeasure(String altitudeUnitofMeasure) {
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

  public Measuringpoint snowHeight(String snowHeight) {
    this.snowHeight = snowHeight;
    return this;
  }

   /**
   * Get snowHeight
   * @return snowHeight
  **/
  @ApiModelProperty(value = "")
  public String getSnowHeight() {
    return snowHeight;
  }

  public void setSnowHeight(String snowHeight) {
    this.snowHeight = snowHeight;
  }

  public Measuringpoint newSnowHeight(String newSnowHeight) {
    this.newSnowHeight = newSnowHeight;
    return this;
  }

   /**
   * Get newSnowHeight
   * @return newSnowHeight
  **/
  @ApiModelProperty(value = "")
  public String getNewSnowHeight() {
    return newSnowHeight;
  }

  public void setNewSnowHeight(String newSnowHeight) {
    this.newSnowHeight = newSnowHeight;
  }

  public Measuringpoint temperature(String temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * Get temperature
   * @return temperature
  **/
  @ApiModelProperty(value = "")
  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }

  public Measuringpoint lastSnowDate(String lastSnowDate) {
    this.lastSnowDate = lastSnowDate;
    return this;
  }

   /**
   * Get lastSnowDate
   * @return lastSnowDate
  **/
  @ApiModelProperty(value = "")
  public String getLastSnowDate() {
    return lastSnowDate;
  }

  public void setLastSnowDate(String lastSnowDate) {
    this.lastSnowDate = lastSnowDate;
  }

  public Measuringpoint weatherObservation(List<WeatherObservation> weatherObservation) {
    this.weatherObservation = weatherObservation;
    return this;
  }

  public Measuringpoint addWeatherObservationItem(WeatherObservation weatherObservationItem) {
    if (this.weatherObservation == null) {
      this.weatherObservation = new ArrayList<>();
    }
    this.weatherObservation.add(weatherObservationItem);
    return this;
  }

   /**
   * Get weatherObservation
   * @return weatherObservation
  **/
  @ApiModelProperty(value = "")
  public List<WeatherObservation> getWeatherObservation() {
    return weatherObservation;
  }

  public void setWeatherObservation(List<WeatherObservation> weatherObservation) {
    this.weatherObservation = weatherObservation;
  }

  public Measuringpoint locationInfo(LocationInfo locationInfo) {
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

  public Measuringpoint ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public Measuringpoint areaIds(List<String> areaIds) {
    this.areaIds = areaIds;
    return this;
  }

  public Measuringpoint addAreaIdsItem(String areaIdsItem) {
    if (this.areaIds == null) {
      this.areaIds = new ArrayList<>();
    }
    this.areaIds.add(areaIdsItem);
    return this;
  }

   /**
   * Get areaIds
   * @return areaIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getAreaIds() {
    return areaIds;
  }

  public void setAreaIds(List<String> areaIds) {
    this.areaIds = areaIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measuringpoint measuringpoint = (Measuringpoint) o;
    return Objects.equals(this.id, measuringpoint.id) &&
        Objects.equals(this.firstImport, measuringpoint.firstImport) &&
        Objects.equals(this.lastUpdate, measuringpoint.lastUpdate) &&
        Objects.equals(this.active, measuringpoint.active) &&
        Objects.equals(this.smgActive, measuringpoint.smgActive) &&
        Objects.equals(this.shortname, measuringpoint.shortname) &&
        Objects.equals(this.gpstype, measuringpoint.gpstype) &&
        Objects.equals(this.latitude, measuringpoint.latitude) &&
        Objects.equals(this.longitude, measuringpoint.longitude) &&
        Objects.equals(this.altitude, measuringpoint.altitude) &&
        Objects.equals(this.altitudeUnitofMeasure, measuringpoint.altitudeUnitofMeasure) &&
        Objects.equals(this.snowHeight, measuringpoint.snowHeight) &&
        Objects.equals(this.newSnowHeight, measuringpoint.newSnowHeight) &&
        Objects.equals(this.temperature, measuringpoint.temperature) &&
        Objects.equals(this.lastSnowDate, measuringpoint.lastSnowDate) &&
        Objects.equals(this.weatherObservation, measuringpoint.weatherObservation) &&
        Objects.equals(this.locationInfo, measuringpoint.locationInfo) &&
        Objects.equals(this.ownerId, measuringpoint.ownerId) &&
        Objects.equals(this.areaIds, measuringpoint.areaIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstImport, lastUpdate, active, smgActive, shortname, gpstype, latitude, longitude, altitude, altitudeUnitofMeasure, snowHeight, newSnowHeight, temperature, lastSnowDate, weatherObservation, locationInfo, ownerId, areaIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measuringpoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstImport: ").append(toIndentedString(firstImport)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    smgActive: ").append(toIndentedString(smgActive)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    gpstype: ").append(toIndentedString(gpstype)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    altitudeUnitofMeasure: ").append(toIndentedString(altitudeUnitofMeasure)).append("\n");
    sb.append("    snowHeight: ").append(toIndentedString(snowHeight)).append("\n");
    sb.append("    newSnowHeight: ").append(toIndentedString(newSnowHeight)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    lastSnowDate: ").append(toIndentedString(lastSnowDate)).append("\n");
    sb.append("    weatherObservation: ").append(toIndentedString(weatherObservation)).append("\n");
    sb.append("    locationInfo: ").append(toIndentedString(locationInfo)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    areaIds: ").append(toIndentedString(areaIds)).append("\n");
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


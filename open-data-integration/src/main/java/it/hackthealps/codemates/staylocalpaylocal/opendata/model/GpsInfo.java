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

/**
 * GpsInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class GpsInfo {
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

  public GpsInfo gpstype(String gpstype) {
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

  public GpsInfo latitude(Double latitude) {
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

  public GpsInfo longitude(Double longitude) {
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

  public GpsInfo altitude(Double altitude) {
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

  public GpsInfo altitudeUnitofMeasure(String altitudeUnitofMeasure) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpsInfo gpsInfo = (GpsInfo) o;
    return Objects.equals(this.gpstype, gpsInfo.gpstype) &&
        Objects.equals(this.latitude, gpsInfo.latitude) &&
        Objects.equals(this.longitude, gpsInfo.longitude) &&
        Objects.equals(this.altitude, gpsInfo.altitude) &&
        Objects.equals(this.altitudeUnitofMeasure, gpsInfo.altitudeUnitofMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpstype, latitude, longitude, altitude, altitudeUnitofMeasure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpsInfo {\n");
    
    sb.append("    gpstype: ").append(toIndentedString(gpstype)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    altitudeUnitofMeasure: ").append(toIndentedString(altitudeUnitofMeasure)).append("\n");
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


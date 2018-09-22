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
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AreaInfoLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.DistrictInfoLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.MunicipalityInfoLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.RegionInfoLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.TvInfoLocalized;

/**
 * LocationInfoLocalized
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class LocationInfoLocalized {
  @JsonProperty("RegionInfo")
  private RegionInfoLocalized regionInfo = null;

  @JsonProperty("TvInfo")
  private TvInfoLocalized tvInfo = null;

  @JsonProperty("MunicipalityInfo")
  private MunicipalityInfoLocalized municipalityInfo = null;

  @JsonProperty("DistrictInfo")
  private DistrictInfoLocalized districtInfo = null;

  @JsonProperty("AreaInfo")
  private AreaInfoLocalized areaInfo = null;

  public LocationInfoLocalized regionInfo(RegionInfoLocalized regionInfo) {
    this.regionInfo = regionInfo;
    return this;
  }

   /**
   * Get regionInfo
   * @return regionInfo
  **/
  @ApiModelProperty(value = "")
  public RegionInfoLocalized getRegionInfo() {
    return regionInfo;
  }

  public void setRegionInfo(RegionInfoLocalized regionInfo) {
    this.regionInfo = regionInfo;
  }

  public LocationInfoLocalized tvInfo(TvInfoLocalized tvInfo) {
    this.tvInfo = tvInfo;
    return this;
  }

   /**
   * Get tvInfo
   * @return tvInfo
  **/
  @ApiModelProperty(value = "")
  public TvInfoLocalized getTvInfo() {
    return tvInfo;
  }

  public void setTvInfo(TvInfoLocalized tvInfo) {
    this.tvInfo = tvInfo;
  }

  public LocationInfoLocalized municipalityInfo(MunicipalityInfoLocalized municipalityInfo) {
    this.municipalityInfo = municipalityInfo;
    return this;
  }

   /**
   * Get municipalityInfo
   * @return municipalityInfo
  **/
  @ApiModelProperty(value = "")
  public MunicipalityInfoLocalized getMunicipalityInfo() {
    return municipalityInfo;
  }

  public void setMunicipalityInfo(MunicipalityInfoLocalized municipalityInfo) {
    this.municipalityInfo = municipalityInfo;
  }

  public LocationInfoLocalized districtInfo(DistrictInfoLocalized districtInfo) {
    this.districtInfo = districtInfo;
    return this;
  }

   /**
   * Get districtInfo
   * @return districtInfo
  **/
  @ApiModelProperty(value = "")
  public DistrictInfoLocalized getDistrictInfo() {
    return districtInfo;
  }

  public void setDistrictInfo(DistrictInfoLocalized districtInfo) {
    this.districtInfo = districtInfo;
  }

  public LocationInfoLocalized areaInfo(AreaInfoLocalized areaInfo) {
    this.areaInfo = areaInfo;
    return this;
  }

   /**
   * Get areaInfo
   * @return areaInfo
  **/
  @ApiModelProperty(value = "")
  public AreaInfoLocalized getAreaInfo() {
    return areaInfo;
  }

  public void setAreaInfo(AreaInfoLocalized areaInfo) {
    this.areaInfo = areaInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationInfoLocalized locationInfoLocalized = (LocationInfoLocalized) o;
    return Objects.equals(this.regionInfo, locationInfoLocalized.regionInfo) &&
        Objects.equals(this.tvInfo, locationInfoLocalized.tvInfo) &&
        Objects.equals(this.municipalityInfo, locationInfoLocalized.municipalityInfo) &&
        Objects.equals(this.districtInfo, locationInfoLocalized.districtInfo) &&
        Objects.equals(this.areaInfo, locationInfoLocalized.areaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionInfo, tvInfo, municipalityInfo, districtInfo, areaInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationInfoLocalized {\n");
    
    sb.append("    regionInfo: ").append(toIndentedString(regionInfo)).append("\n");
    sb.append("    tvInfo: ").append(toIndentedString(tvInfo)).append("\n");
    sb.append("    municipalityInfo: ").append(toIndentedString(municipalityInfo)).append("\n");
    sb.append("    districtInfo: ").append(toIndentedString(districtInfo)).append("\n");
    sb.append("    areaInfo: ").append(toIndentedString(areaInfo)).append("\n");
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

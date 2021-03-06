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
 * SnowReportBaseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class SnowReportBaseData {
  @JsonProperty("Id")
  private Integer id = null;

  @JsonProperty("RID")
  private String RID = null;

  @JsonProperty("Skiregion")
  private String skiregion = null;

  @JsonProperty("Areaname")
  private String areaname = null;

  @JsonProperty("LastUpdate")
  private String lastUpdate = null;

  @JsonProperty("lang")
  private String lang = null;

  @JsonProperty("SkiAreaSlopeKm")
  private String skiAreaSlopeKm = null;

  @JsonProperty("SkiMapUrl")
  private String skiMapUrl = null;

  @JsonProperty("Measuringpoints")
  private List<MeasuringpointReduced> measuringpoints = null;

  @JsonProperty("WebcamUrl")
  private List<String> webcamUrl = null;

  @JsonProperty("totalskilift")
  private String totalskilift = null;

  @JsonProperty("openskilift")
  private String openskilift = null;

  @JsonProperty("totalskiliftkm")
  private String totalskiliftkm = null;

  @JsonProperty("openskiliftkm")
  private String openskiliftkm = null;

  @JsonProperty("totalskislopes")
  private String totalskislopes = null;

  @JsonProperty("openskislopes")
  private String openskislopes = null;

  @JsonProperty("totalskislopeskm")
  private String totalskislopeskm = null;

  @JsonProperty("openskislopeskm")
  private String openskislopeskm = null;

  @JsonProperty("totaltracks")
  private String totaltracks = null;

  @JsonProperty("opentracks")
  private String opentracks = null;

  @JsonProperty("totaltrackskm")
  private String totaltrackskm = null;

  @JsonProperty("opentrackskm")
  private String opentrackskm = null;

  @JsonProperty("totalslides")
  private String totalslides = null;

  @JsonProperty("opentslides")
  private String opentslides = null;

  @JsonProperty("totalslideskm")
  private String totalslideskm = null;

  @JsonProperty("opentslideskm")
  private String opentslideskm = null;

  @JsonProperty("totaliceskating")
  private String totaliceskating = null;

  @JsonProperty("openiceskating")
  private String openiceskating = null;

  @JsonProperty("contactadress")
  private String contactadress = null;

  @JsonProperty("contacttel")
  private String contacttel = null;

  @JsonProperty("contactcap")
  private String contactcap = null;

  @JsonProperty("contactcity")
  private String contactcity = null;

  @JsonProperty("contactfax")
  private String contactfax = null;

  @JsonProperty("contactweburl")
  private String contactweburl = null;

  @JsonProperty("contactmail")
  private String contactmail = null;

  @JsonProperty("contactlogo")
  private String contactlogo = null;

  @JsonProperty("contactgpsnorth")
  private String contactgpsnorth = null;

  @JsonProperty("contactgpseast")
  private String contactgpseast = null;

  public SnowReportBaseData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SnowReportBaseData RID(String RID) {
    this.RID = RID;
    return this;
  }

   /**
   * Get RID
   * @return RID
  **/
  @ApiModelProperty(value = "")
  public String getRID() {
    return RID;
  }

  public void setRID(String RID) {
    this.RID = RID;
  }

  public SnowReportBaseData skiregion(String skiregion) {
    this.skiregion = skiregion;
    return this;
  }

   /**
   * Get skiregion
   * @return skiregion
  **/
  @ApiModelProperty(value = "")
  public String getSkiregion() {
    return skiregion;
  }

  public void setSkiregion(String skiregion) {
    this.skiregion = skiregion;
  }

  public SnowReportBaseData areaname(String areaname) {
    this.areaname = areaname;
    return this;
  }

   /**
   * Get areaname
   * @return areaname
  **/
  @ApiModelProperty(value = "")
  public String getAreaname() {
    return areaname;
  }

  public void setAreaname(String areaname) {
    this.areaname = areaname;
  }

  public SnowReportBaseData lastUpdate(String lastUpdate) {
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

  public SnowReportBaseData lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @ApiModelProperty(value = "")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public SnowReportBaseData skiAreaSlopeKm(String skiAreaSlopeKm) {
    this.skiAreaSlopeKm = skiAreaSlopeKm;
    return this;
  }

   /**
   * Get skiAreaSlopeKm
   * @return skiAreaSlopeKm
  **/
  @ApiModelProperty(value = "")
  public String getSkiAreaSlopeKm() {
    return skiAreaSlopeKm;
  }

  public void setSkiAreaSlopeKm(String skiAreaSlopeKm) {
    this.skiAreaSlopeKm = skiAreaSlopeKm;
  }

  public SnowReportBaseData skiMapUrl(String skiMapUrl) {
    this.skiMapUrl = skiMapUrl;
    return this;
  }

   /**
   * Get skiMapUrl
   * @return skiMapUrl
  **/
  @ApiModelProperty(value = "")
  public String getSkiMapUrl() {
    return skiMapUrl;
  }

  public void setSkiMapUrl(String skiMapUrl) {
    this.skiMapUrl = skiMapUrl;
  }

  public SnowReportBaseData measuringpoints(List<MeasuringpointReduced> measuringpoints) {
    this.measuringpoints = measuringpoints;
    return this;
  }

  public SnowReportBaseData addMeasuringpointsItem(MeasuringpointReduced measuringpointsItem) {
    if (this.measuringpoints == null) {
      this.measuringpoints = new ArrayList<>();
    }
    this.measuringpoints.add(measuringpointsItem);
    return this;
  }

   /**
   * Get measuringpoints
   * @return measuringpoints
  **/
  @ApiModelProperty(value = "")
  public List<MeasuringpointReduced> getMeasuringpoints() {
    return measuringpoints;
  }

  public void setMeasuringpoints(List<MeasuringpointReduced> measuringpoints) {
    this.measuringpoints = measuringpoints;
  }

  public SnowReportBaseData webcamUrl(List<String> webcamUrl) {
    this.webcamUrl = webcamUrl;
    return this;
  }

  public SnowReportBaseData addWebcamUrlItem(String webcamUrlItem) {
    if (this.webcamUrl == null) {
      this.webcamUrl = new ArrayList<>();
    }
    this.webcamUrl.add(webcamUrlItem);
    return this;
  }

   /**
   * Get webcamUrl
   * @return webcamUrl
  **/
  @ApiModelProperty(value = "")
  public List<String> getWebcamUrl() {
    return webcamUrl;
  }

  public void setWebcamUrl(List<String> webcamUrl) {
    this.webcamUrl = webcamUrl;
  }

  public SnowReportBaseData totalskilift(String totalskilift) {
    this.totalskilift = totalskilift;
    return this;
  }

   /**
   * Get totalskilift
   * @return totalskilift
  **/
  @ApiModelProperty(value = "")
  public String getTotalskilift() {
    return totalskilift;
  }

  public void setTotalskilift(String totalskilift) {
    this.totalskilift = totalskilift;
  }

  public SnowReportBaseData openskilift(String openskilift) {
    this.openskilift = openskilift;
    return this;
  }

   /**
   * Get openskilift
   * @return openskilift
  **/
  @ApiModelProperty(value = "")
  public String getOpenskilift() {
    return openskilift;
  }

  public void setOpenskilift(String openskilift) {
    this.openskilift = openskilift;
  }

  public SnowReportBaseData totalskiliftkm(String totalskiliftkm) {
    this.totalskiliftkm = totalskiliftkm;
    return this;
  }

   /**
   * Get totalskiliftkm
   * @return totalskiliftkm
  **/
  @ApiModelProperty(value = "")
  public String getTotalskiliftkm() {
    return totalskiliftkm;
  }

  public void setTotalskiliftkm(String totalskiliftkm) {
    this.totalskiliftkm = totalskiliftkm;
  }

  public SnowReportBaseData openskiliftkm(String openskiliftkm) {
    this.openskiliftkm = openskiliftkm;
    return this;
  }

   /**
   * Get openskiliftkm
   * @return openskiliftkm
  **/
  @ApiModelProperty(value = "")
  public String getOpenskiliftkm() {
    return openskiliftkm;
  }

  public void setOpenskiliftkm(String openskiliftkm) {
    this.openskiliftkm = openskiliftkm;
  }

  public SnowReportBaseData totalskislopes(String totalskislopes) {
    this.totalskislopes = totalskislopes;
    return this;
  }

   /**
   * Get totalskislopes
   * @return totalskislopes
  **/
  @ApiModelProperty(value = "")
  public String getTotalskislopes() {
    return totalskislopes;
  }

  public void setTotalskislopes(String totalskislopes) {
    this.totalskislopes = totalskislopes;
  }

  public SnowReportBaseData openskislopes(String openskislopes) {
    this.openskislopes = openskislopes;
    return this;
  }

   /**
   * Get openskislopes
   * @return openskislopes
  **/
  @ApiModelProperty(value = "")
  public String getOpenskislopes() {
    return openskislopes;
  }

  public void setOpenskislopes(String openskislopes) {
    this.openskislopes = openskislopes;
  }

  public SnowReportBaseData totalskislopeskm(String totalskislopeskm) {
    this.totalskislopeskm = totalskislopeskm;
    return this;
  }

   /**
   * Get totalskislopeskm
   * @return totalskislopeskm
  **/
  @ApiModelProperty(value = "")
  public String getTotalskislopeskm() {
    return totalskislopeskm;
  }

  public void setTotalskislopeskm(String totalskislopeskm) {
    this.totalskislopeskm = totalskislopeskm;
  }

  public SnowReportBaseData openskislopeskm(String openskislopeskm) {
    this.openskislopeskm = openskislopeskm;
    return this;
  }

   /**
   * Get openskislopeskm
   * @return openskislopeskm
  **/
  @ApiModelProperty(value = "")
  public String getOpenskislopeskm() {
    return openskislopeskm;
  }

  public void setOpenskislopeskm(String openskislopeskm) {
    this.openskislopeskm = openskislopeskm;
  }

  public SnowReportBaseData totaltracks(String totaltracks) {
    this.totaltracks = totaltracks;
    return this;
  }

   /**
   * Get totaltracks
   * @return totaltracks
  **/
  @ApiModelProperty(value = "")
  public String getTotaltracks() {
    return totaltracks;
  }

  public void setTotaltracks(String totaltracks) {
    this.totaltracks = totaltracks;
  }

  public SnowReportBaseData opentracks(String opentracks) {
    this.opentracks = opentracks;
    return this;
  }

   /**
   * Get opentracks
   * @return opentracks
  **/
  @ApiModelProperty(value = "")
  public String getOpentracks() {
    return opentracks;
  }

  public void setOpentracks(String opentracks) {
    this.opentracks = opentracks;
  }

  public SnowReportBaseData totaltrackskm(String totaltrackskm) {
    this.totaltrackskm = totaltrackskm;
    return this;
  }

   /**
   * Get totaltrackskm
   * @return totaltrackskm
  **/
  @ApiModelProperty(value = "")
  public String getTotaltrackskm() {
    return totaltrackskm;
  }

  public void setTotaltrackskm(String totaltrackskm) {
    this.totaltrackskm = totaltrackskm;
  }

  public SnowReportBaseData opentrackskm(String opentrackskm) {
    this.opentrackskm = opentrackskm;
    return this;
  }

   /**
   * Get opentrackskm
   * @return opentrackskm
  **/
  @ApiModelProperty(value = "")
  public String getOpentrackskm() {
    return opentrackskm;
  }

  public void setOpentrackskm(String opentrackskm) {
    this.opentrackskm = opentrackskm;
  }

  public SnowReportBaseData totalslides(String totalslides) {
    this.totalslides = totalslides;
    return this;
  }

   /**
   * Get totalslides
   * @return totalslides
  **/
  @ApiModelProperty(value = "")
  public String getTotalslides() {
    return totalslides;
  }

  public void setTotalslides(String totalslides) {
    this.totalslides = totalslides;
  }

  public SnowReportBaseData opentslides(String opentslides) {
    this.opentslides = opentslides;
    return this;
  }

   /**
   * Get opentslides
   * @return opentslides
  **/
  @ApiModelProperty(value = "")
  public String getOpentslides() {
    return opentslides;
  }

  public void setOpentslides(String opentslides) {
    this.opentslides = opentslides;
  }

  public SnowReportBaseData totalslideskm(String totalslideskm) {
    this.totalslideskm = totalslideskm;
    return this;
  }

   /**
   * Get totalslideskm
   * @return totalslideskm
  **/
  @ApiModelProperty(value = "")
  public String getTotalslideskm() {
    return totalslideskm;
  }

  public void setTotalslideskm(String totalslideskm) {
    this.totalslideskm = totalslideskm;
  }

  public SnowReportBaseData opentslideskm(String opentslideskm) {
    this.opentslideskm = opentslideskm;
    return this;
  }

   /**
   * Get opentslideskm
   * @return opentslideskm
  **/
  @ApiModelProperty(value = "")
  public String getOpentslideskm() {
    return opentslideskm;
  }

  public void setOpentslideskm(String opentslideskm) {
    this.opentslideskm = opentslideskm;
  }

  public SnowReportBaseData totaliceskating(String totaliceskating) {
    this.totaliceskating = totaliceskating;
    return this;
  }

   /**
   * Get totaliceskating
   * @return totaliceskating
  **/
  @ApiModelProperty(value = "")
  public String getTotaliceskating() {
    return totaliceskating;
  }

  public void setTotaliceskating(String totaliceskating) {
    this.totaliceskating = totaliceskating;
  }

  public SnowReportBaseData openiceskating(String openiceskating) {
    this.openiceskating = openiceskating;
    return this;
  }

   /**
   * Get openiceskating
   * @return openiceskating
  **/
  @ApiModelProperty(value = "")
  public String getOpeniceskating() {
    return openiceskating;
  }

  public void setOpeniceskating(String openiceskating) {
    this.openiceskating = openiceskating;
  }

  public SnowReportBaseData contactadress(String contactadress) {
    this.contactadress = contactadress;
    return this;
  }

   /**
   * Get contactadress
   * @return contactadress
  **/
  @ApiModelProperty(value = "")
  public String getContactadress() {
    return contactadress;
  }

  public void setContactadress(String contactadress) {
    this.contactadress = contactadress;
  }

  public SnowReportBaseData contacttel(String contacttel) {
    this.contacttel = contacttel;
    return this;
  }

   /**
   * Get contacttel
   * @return contacttel
  **/
  @ApiModelProperty(value = "")
  public String getContacttel() {
    return contacttel;
  }

  public void setContacttel(String contacttel) {
    this.contacttel = contacttel;
  }

  public SnowReportBaseData contactcap(String contactcap) {
    this.contactcap = contactcap;
    return this;
  }

   /**
   * Get contactcap
   * @return contactcap
  **/
  @ApiModelProperty(value = "")
  public String getContactcap() {
    return contactcap;
  }

  public void setContactcap(String contactcap) {
    this.contactcap = contactcap;
  }

  public SnowReportBaseData contactcity(String contactcity) {
    this.contactcity = contactcity;
    return this;
  }

   /**
   * Get contactcity
   * @return contactcity
  **/
  @ApiModelProperty(value = "")
  public String getContactcity() {
    return contactcity;
  }

  public void setContactcity(String contactcity) {
    this.contactcity = contactcity;
  }

  public SnowReportBaseData contactfax(String contactfax) {
    this.contactfax = contactfax;
    return this;
  }

   /**
   * Get contactfax
   * @return contactfax
  **/
  @ApiModelProperty(value = "")
  public String getContactfax() {
    return contactfax;
  }

  public void setContactfax(String contactfax) {
    this.contactfax = contactfax;
  }

  public SnowReportBaseData contactweburl(String contactweburl) {
    this.contactweburl = contactweburl;
    return this;
  }

   /**
   * Get contactweburl
   * @return contactweburl
  **/
  @ApiModelProperty(value = "")
  public String getContactweburl() {
    return contactweburl;
  }

  public void setContactweburl(String contactweburl) {
    this.contactweburl = contactweburl;
  }

  public SnowReportBaseData contactmail(String contactmail) {
    this.contactmail = contactmail;
    return this;
  }

   /**
   * Get contactmail
   * @return contactmail
  **/
  @ApiModelProperty(value = "")
  public String getContactmail() {
    return contactmail;
  }

  public void setContactmail(String contactmail) {
    this.contactmail = contactmail;
  }

  public SnowReportBaseData contactlogo(String contactlogo) {
    this.contactlogo = contactlogo;
    return this;
  }

   /**
   * Get contactlogo
   * @return contactlogo
  **/
  @ApiModelProperty(value = "")
  public String getContactlogo() {
    return contactlogo;
  }

  public void setContactlogo(String contactlogo) {
    this.contactlogo = contactlogo;
  }

  public SnowReportBaseData contactgpsnorth(String contactgpsnorth) {
    this.contactgpsnorth = contactgpsnorth;
    return this;
  }

   /**
   * Get contactgpsnorth
   * @return contactgpsnorth
  **/
  @ApiModelProperty(value = "")
  public String getContactgpsnorth() {
    return contactgpsnorth;
  }

  public void setContactgpsnorth(String contactgpsnorth) {
    this.contactgpsnorth = contactgpsnorth;
  }

  public SnowReportBaseData contactgpseast(String contactgpseast) {
    this.contactgpseast = contactgpseast;
    return this;
  }

   /**
   * Get contactgpseast
   * @return contactgpseast
  **/
  @ApiModelProperty(value = "")
  public String getContactgpseast() {
    return contactgpseast;
  }

  public void setContactgpseast(String contactgpseast) {
    this.contactgpseast = contactgpseast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowReportBaseData snowReportBaseData = (SnowReportBaseData) o;
    return Objects.equals(this.id, snowReportBaseData.id) &&
        Objects.equals(this.RID, snowReportBaseData.RID) &&
        Objects.equals(this.skiregion, snowReportBaseData.skiregion) &&
        Objects.equals(this.areaname, snowReportBaseData.areaname) &&
        Objects.equals(this.lastUpdate, snowReportBaseData.lastUpdate) &&
        Objects.equals(this.lang, snowReportBaseData.lang) &&
        Objects.equals(this.skiAreaSlopeKm, snowReportBaseData.skiAreaSlopeKm) &&
        Objects.equals(this.skiMapUrl, snowReportBaseData.skiMapUrl) &&
        Objects.equals(this.measuringpoints, snowReportBaseData.measuringpoints) &&
        Objects.equals(this.webcamUrl, snowReportBaseData.webcamUrl) &&
        Objects.equals(this.totalskilift, snowReportBaseData.totalskilift) &&
        Objects.equals(this.openskilift, snowReportBaseData.openskilift) &&
        Objects.equals(this.totalskiliftkm, snowReportBaseData.totalskiliftkm) &&
        Objects.equals(this.openskiliftkm, snowReportBaseData.openskiliftkm) &&
        Objects.equals(this.totalskislopes, snowReportBaseData.totalskislopes) &&
        Objects.equals(this.openskislopes, snowReportBaseData.openskislopes) &&
        Objects.equals(this.totalskislopeskm, snowReportBaseData.totalskislopeskm) &&
        Objects.equals(this.openskislopeskm, snowReportBaseData.openskislopeskm) &&
        Objects.equals(this.totaltracks, snowReportBaseData.totaltracks) &&
        Objects.equals(this.opentracks, snowReportBaseData.opentracks) &&
        Objects.equals(this.totaltrackskm, snowReportBaseData.totaltrackskm) &&
        Objects.equals(this.opentrackskm, snowReportBaseData.opentrackskm) &&
        Objects.equals(this.totalslides, snowReportBaseData.totalslides) &&
        Objects.equals(this.opentslides, snowReportBaseData.opentslides) &&
        Objects.equals(this.totalslideskm, snowReportBaseData.totalslideskm) &&
        Objects.equals(this.opentslideskm, snowReportBaseData.opentslideskm) &&
        Objects.equals(this.totaliceskating, snowReportBaseData.totaliceskating) &&
        Objects.equals(this.openiceskating, snowReportBaseData.openiceskating) &&
        Objects.equals(this.contactadress, snowReportBaseData.contactadress) &&
        Objects.equals(this.contacttel, snowReportBaseData.contacttel) &&
        Objects.equals(this.contactcap, snowReportBaseData.contactcap) &&
        Objects.equals(this.contactcity, snowReportBaseData.contactcity) &&
        Objects.equals(this.contactfax, snowReportBaseData.contactfax) &&
        Objects.equals(this.contactweburl, snowReportBaseData.contactweburl) &&
        Objects.equals(this.contactmail, snowReportBaseData.contactmail) &&
        Objects.equals(this.contactlogo, snowReportBaseData.contactlogo) &&
        Objects.equals(this.contactgpsnorth, snowReportBaseData.contactgpsnorth) &&
        Objects.equals(this.contactgpseast, snowReportBaseData.contactgpseast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, RID, skiregion, areaname, lastUpdate, lang, skiAreaSlopeKm, skiMapUrl, measuringpoints, webcamUrl, totalskilift, openskilift, totalskiliftkm, openskiliftkm, totalskislopes, openskislopes, totalskislopeskm, openskislopeskm, totaltracks, opentracks, totaltrackskm, opentrackskm, totalslides, opentslides, totalslideskm, opentslideskm, totaliceskating, openiceskating, contactadress, contacttel, contactcap, contactcity, contactfax, contactweburl, contactmail, contactlogo, contactgpsnorth, contactgpseast);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowReportBaseData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    RID: ").append(toIndentedString(RID)).append("\n");
    sb.append("    skiregion: ").append(toIndentedString(skiregion)).append("\n");
    sb.append("    areaname: ").append(toIndentedString(areaname)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    skiAreaSlopeKm: ").append(toIndentedString(skiAreaSlopeKm)).append("\n");
    sb.append("    skiMapUrl: ").append(toIndentedString(skiMapUrl)).append("\n");
    sb.append("    measuringpoints: ").append(toIndentedString(measuringpoints)).append("\n");
    sb.append("    webcamUrl: ").append(toIndentedString(webcamUrl)).append("\n");
    sb.append("    totalskilift: ").append(toIndentedString(totalskilift)).append("\n");
    sb.append("    openskilift: ").append(toIndentedString(openskilift)).append("\n");
    sb.append("    totalskiliftkm: ").append(toIndentedString(totalskiliftkm)).append("\n");
    sb.append("    openskiliftkm: ").append(toIndentedString(openskiliftkm)).append("\n");
    sb.append("    totalskislopes: ").append(toIndentedString(totalskislopes)).append("\n");
    sb.append("    openskislopes: ").append(toIndentedString(openskislopes)).append("\n");
    sb.append("    totalskislopeskm: ").append(toIndentedString(totalskislopeskm)).append("\n");
    sb.append("    openskislopeskm: ").append(toIndentedString(openskislopeskm)).append("\n");
    sb.append("    totaltracks: ").append(toIndentedString(totaltracks)).append("\n");
    sb.append("    opentracks: ").append(toIndentedString(opentracks)).append("\n");
    sb.append("    totaltrackskm: ").append(toIndentedString(totaltrackskm)).append("\n");
    sb.append("    opentrackskm: ").append(toIndentedString(opentrackskm)).append("\n");
    sb.append("    totalslides: ").append(toIndentedString(totalslides)).append("\n");
    sb.append("    opentslides: ").append(toIndentedString(opentslides)).append("\n");
    sb.append("    totalslideskm: ").append(toIndentedString(totalslideskm)).append("\n");
    sb.append("    opentslideskm: ").append(toIndentedString(opentslideskm)).append("\n");
    sb.append("    totaliceskating: ").append(toIndentedString(totaliceskating)).append("\n");
    sb.append("    openiceskating: ").append(toIndentedString(openiceskating)).append("\n");
    sb.append("    contactadress: ").append(toIndentedString(contactadress)).append("\n");
    sb.append("    contacttel: ").append(toIndentedString(contacttel)).append("\n");
    sb.append("    contactcap: ").append(toIndentedString(contactcap)).append("\n");
    sb.append("    contactcity: ").append(toIndentedString(contactcity)).append("\n");
    sb.append("    contactfax: ").append(toIndentedString(contactfax)).append("\n");
    sb.append("    contactweburl: ").append(toIndentedString(contactweburl)).append("\n");
    sb.append("    contactmail: ").append(toIndentedString(contactmail)).append("\n");
    sb.append("    contactlogo: ").append(toIndentedString(contactlogo)).append("\n");
    sb.append("    contactgpsnorth: ").append(toIndentedString(contactgpsnorth)).append("\n");
    sb.append("    contactgpseast: ").append(toIndentedString(contactgpseast)).append("\n");
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


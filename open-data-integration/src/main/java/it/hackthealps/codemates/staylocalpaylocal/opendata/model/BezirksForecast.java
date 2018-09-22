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
import java.time.OffsetDateTime;

/**
 * BezirksForecast
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class BezirksForecast {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("WeatherCode")
  private String weatherCode = null;

  @JsonProperty("WeatherDesc")
  private String weatherDesc = null;

  @JsonProperty("WeatherImgUrl")
  private String weatherImgUrl = null;

  @JsonProperty("MaxTemp")
  private Integer maxTemp = null;

  @JsonProperty("MinTemp")
  private Integer minTemp = null;

  @JsonProperty("Freeze")
  private Integer freeze = null;

  @JsonProperty("RainFrom")
  private Integer rainFrom = null;

  @JsonProperty("RainTo")
  private Integer rainTo = null;

  @JsonProperty("Part1")
  private Integer part1 = null;

  @JsonProperty("Part2")
  private Integer part2 = null;

  @JsonProperty("Part3")
  private Integer part3 = null;

  @JsonProperty("Part4")
  private Integer part4 = null;

  @JsonProperty("Thunderstorm")
  private Integer thunderstorm = null;

  public BezirksForecast date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public BezirksForecast weatherCode(String weatherCode) {
    this.weatherCode = weatherCode;
    return this;
  }

   /**
   * Get weatherCode
   * @return weatherCode
  **/
  @ApiModelProperty(value = "")
  public String getWeatherCode() {
    return weatherCode;
  }

  public void setWeatherCode(String weatherCode) {
    this.weatherCode = weatherCode;
  }

  public BezirksForecast weatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
    return this;
  }

   /**
   * Get weatherDesc
   * @return weatherDesc
  **/
  @ApiModelProperty(value = "")
  public String getWeatherDesc() {
    return weatherDesc;
  }

  public void setWeatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
  }

  public BezirksForecast weatherImgUrl(String weatherImgUrl) {
    this.weatherImgUrl = weatherImgUrl;
    return this;
  }

   /**
   * Get weatherImgUrl
   * @return weatherImgUrl
  **/
  @ApiModelProperty(value = "")
  public String getWeatherImgUrl() {
    return weatherImgUrl;
  }

  public void setWeatherImgUrl(String weatherImgUrl) {
    this.weatherImgUrl = weatherImgUrl;
  }

  public BezirksForecast maxTemp(Integer maxTemp) {
    this.maxTemp = maxTemp;
    return this;
  }

   /**
   * Get maxTemp
   * @return maxTemp
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxTemp() {
    return maxTemp;
  }

  public void setMaxTemp(Integer maxTemp) {
    this.maxTemp = maxTemp;
  }

  public BezirksForecast minTemp(Integer minTemp) {
    this.minTemp = minTemp;
    return this;
  }

   /**
   * Get minTemp
   * @return minTemp
  **/
  @ApiModelProperty(value = "")
  public Integer getMinTemp() {
    return minTemp;
  }

  public void setMinTemp(Integer minTemp) {
    this.minTemp = minTemp;
  }

  public BezirksForecast freeze(Integer freeze) {
    this.freeze = freeze;
    return this;
  }

   /**
   * Get freeze
   * @return freeze
  **/
  @ApiModelProperty(value = "")
  public Integer getFreeze() {
    return freeze;
  }

  public void setFreeze(Integer freeze) {
    this.freeze = freeze;
  }

  public BezirksForecast rainFrom(Integer rainFrom) {
    this.rainFrom = rainFrom;
    return this;
  }

   /**
   * Get rainFrom
   * @return rainFrom
  **/
  @ApiModelProperty(value = "")
  public Integer getRainFrom() {
    return rainFrom;
  }

  public void setRainFrom(Integer rainFrom) {
    this.rainFrom = rainFrom;
  }

  public BezirksForecast rainTo(Integer rainTo) {
    this.rainTo = rainTo;
    return this;
  }

   /**
   * Get rainTo
   * @return rainTo
  **/
  @ApiModelProperty(value = "")
  public Integer getRainTo() {
    return rainTo;
  }

  public void setRainTo(Integer rainTo) {
    this.rainTo = rainTo;
  }

  public BezirksForecast part1(Integer part1) {
    this.part1 = part1;
    return this;
  }

   /**
   * Get part1
   * @return part1
  **/
  @ApiModelProperty(value = "")
  public Integer getPart1() {
    return part1;
  }

  public void setPart1(Integer part1) {
    this.part1 = part1;
  }

  public BezirksForecast part2(Integer part2) {
    this.part2 = part2;
    return this;
  }

   /**
   * Get part2
   * @return part2
  **/
  @ApiModelProperty(value = "")
  public Integer getPart2() {
    return part2;
  }

  public void setPart2(Integer part2) {
    this.part2 = part2;
  }

  public BezirksForecast part3(Integer part3) {
    this.part3 = part3;
    return this;
  }

   /**
   * Get part3
   * @return part3
  **/
  @ApiModelProperty(value = "")
  public Integer getPart3() {
    return part3;
  }

  public void setPart3(Integer part3) {
    this.part3 = part3;
  }

  public BezirksForecast part4(Integer part4) {
    this.part4 = part4;
    return this;
  }

   /**
   * Get part4
   * @return part4
  **/
  @ApiModelProperty(value = "")
  public Integer getPart4() {
    return part4;
  }

  public void setPart4(Integer part4) {
    this.part4 = part4;
  }

  public BezirksForecast thunderstorm(Integer thunderstorm) {
    this.thunderstorm = thunderstorm;
    return this;
  }

   /**
   * Get thunderstorm
   * @return thunderstorm
  **/
  @ApiModelProperty(value = "")
  public Integer getThunderstorm() {
    return thunderstorm;
  }

  public void setThunderstorm(Integer thunderstorm) {
    this.thunderstorm = thunderstorm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BezirksForecast bezirksForecast = (BezirksForecast) o;
    return Objects.equals(this.date, bezirksForecast.date) &&
        Objects.equals(this.weatherCode, bezirksForecast.weatherCode) &&
        Objects.equals(this.weatherDesc, bezirksForecast.weatherDesc) &&
        Objects.equals(this.weatherImgUrl, bezirksForecast.weatherImgUrl) &&
        Objects.equals(this.maxTemp, bezirksForecast.maxTemp) &&
        Objects.equals(this.minTemp, bezirksForecast.minTemp) &&
        Objects.equals(this.freeze, bezirksForecast.freeze) &&
        Objects.equals(this.rainFrom, bezirksForecast.rainFrom) &&
        Objects.equals(this.rainTo, bezirksForecast.rainTo) &&
        Objects.equals(this.part1, bezirksForecast.part1) &&
        Objects.equals(this.part2, bezirksForecast.part2) &&
        Objects.equals(this.part3, bezirksForecast.part3) &&
        Objects.equals(this.part4, bezirksForecast.part4) &&
        Objects.equals(this.thunderstorm, bezirksForecast.thunderstorm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, weatherCode, weatherDesc, weatherImgUrl, maxTemp, minTemp, freeze, rainFrom, rainTo, part1, part2, part3, part4, thunderstorm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BezirksForecast {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    weatherCode: ").append(toIndentedString(weatherCode)).append("\n");
    sb.append("    weatherDesc: ").append(toIndentedString(weatherDesc)).append("\n");
    sb.append("    weatherImgUrl: ").append(toIndentedString(weatherImgUrl)).append("\n");
    sb.append("    maxTemp: ").append(toIndentedString(maxTemp)).append("\n");
    sb.append("    minTemp: ").append(toIndentedString(minTemp)).append("\n");
    sb.append("    freeze: ").append(toIndentedString(freeze)).append("\n");
    sb.append("    rainFrom: ").append(toIndentedString(rainFrom)).append("\n");
    sb.append("    rainTo: ").append(toIndentedString(rainTo)).append("\n");
    sb.append("    part1: ").append(toIndentedString(part1)).append("\n");
    sb.append("    part2: ").append(toIndentedString(part2)).append("\n");
    sb.append("    part3: ").append(toIndentedString(part3)).append("\n");
    sb.append("    part4: ").append(toIndentedString(part4)).append("\n");
    sb.append("    thunderstorm: ").append(toIndentedString(thunderstorm)).append("\n");
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

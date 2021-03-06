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
 * DishRates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class DishRates {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Shortname")
  private String shortname = null;

  @JsonProperty("MinAmount")
  private Double minAmount = null;

  @JsonProperty("MaxAmount")
  private Double maxAmount = null;

  @JsonProperty("CurrencyCode")
  private String currencyCode = null;

  public DishRates id(String id) {
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

  public DishRates shortname(String shortname) {
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

  public DishRates minAmount(Double minAmount) {
    this.minAmount = minAmount;
    return this;
  }

   /**
   * Get minAmount
   * @return minAmount
  **/
  @ApiModelProperty(value = "")
  public Double getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(Double minAmount) {
    this.minAmount = minAmount;
  }

  public DishRates maxAmount(Double maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Get maxAmount
   * @return maxAmount
  **/
  @ApiModelProperty(value = "")
  public Double getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Double maxAmount) {
    this.maxAmount = maxAmount;
  }

  public DishRates currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DishRates dishRates = (DishRates) o;
    return Objects.equals(this.id, dishRates.id) &&
        Objects.equals(this.shortname, dishRates.shortname) &&
        Objects.equals(this.minAmount, dishRates.minAmount) &&
        Objects.equals(this.maxAmount, dishRates.maxAmount) &&
        Objects.equals(this.currencyCode, dishRates.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shortname, minAmount, maxAmount, currencyCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DishRates {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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


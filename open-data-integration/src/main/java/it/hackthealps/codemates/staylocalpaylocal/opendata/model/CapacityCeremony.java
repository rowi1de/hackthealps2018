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
 * CapacityCeremony
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class CapacityCeremony {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Shortname")
  private String shortname = null;

  @JsonProperty("MaxSeatingCapacity")
  private Integer maxSeatingCapacity = null;

  public CapacityCeremony id(String id) {
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

  public CapacityCeremony shortname(String shortname) {
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

  public CapacityCeremony maxSeatingCapacity(Integer maxSeatingCapacity) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityCeremony capacityCeremony = (CapacityCeremony) o;
    return Objects.equals(this.id, capacityCeremony.id) &&
        Objects.equals(this.shortname, capacityCeremony.shortname) &&
        Objects.equals(this.maxSeatingCapacity, capacityCeremony.maxSeatingCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shortname, maxSeatingCapacity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityCeremony {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    maxSeatingCapacity: ").append(toIndentedString(maxSeatingCapacity)).append("\n");
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

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
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.OperationScheduleTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OperationSchedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class OperationSchedule {
  @JsonProperty("OperationscheduleName")
  private Map<String, String> operationscheduleName = null;

  @JsonProperty("Start")
  private OffsetDateTime start = null;

  @JsonProperty("Stop")
  private OffsetDateTime stop = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("ClosedonPublicHolidays")
  private Boolean closedonPublicHolidays = null;

  @JsonProperty("OperationScheduleTime")
  private List<OperationScheduleTime> operationScheduleTime = null;

  public OperationSchedule operationscheduleName(Map<String, String> operationscheduleName) {
    this.operationscheduleName = operationscheduleName;
    return this;
  }

  public OperationSchedule putOperationscheduleNameItem(String key, String operationscheduleNameItem) {
    if (this.operationscheduleName == null) {
      this.operationscheduleName = new HashMap<>();
    }
    this.operationscheduleName.put(key, operationscheduleNameItem);
    return this;
  }

   /**
   * Get operationscheduleName
   * @return operationscheduleName
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getOperationscheduleName() {
    return operationscheduleName;
  }

  public void setOperationscheduleName(Map<String, String> operationscheduleName) {
    this.operationscheduleName = operationscheduleName;
  }

  public OperationSchedule start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public OperationSchedule stop(OffsetDateTime stop) {
    this.stop = stop;
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStop() {
    return stop;
  }

  public void setStop(OffsetDateTime stop) {
    this.stop = stop;
  }

  public OperationSchedule type(String type) {
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

  public OperationSchedule closedonPublicHolidays(Boolean closedonPublicHolidays) {
    this.closedonPublicHolidays = closedonPublicHolidays;
    return this;
  }

   /**
   * Get closedonPublicHolidays
   * @return closedonPublicHolidays
  **/
  @ApiModelProperty(value = "")
  public Boolean isClosedonPublicHolidays() {
    return closedonPublicHolidays;
  }

  public void setClosedonPublicHolidays(Boolean closedonPublicHolidays) {
    this.closedonPublicHolidays = closedonPublicHolidays;
  }

  public OperationSchedule operationScheduleTime(List<OperationScheduleTime> operationScheduleTime) {
    this.operationScheduleTime = operationScheduleTime;
    return this;
  }

  public OperationSchedule addOperationScheduleTimeItem(OperationScheduleTime operationScheduleTimeItem) {
    if (this.operationScheduleTime == null) {
      this.operationScheduleTime = new ArrayList<>();
    }
    this.operationScheduleTime.add(operationScheduleTimeItem);
    return this;
  }

   /**
   * Get operationScheduleTime
   * @return operationScheduleTime
  **/
  @ApiModelProperty(value = "")
  public List<OperationScheduleTime> getOperationScheduleTime() {
    return operationScheduleTime;
  }

  public void setOperationScheduleTime(List<OperationScheduleTime> operationScheduleTime) {
    this.operationScheduleTime = operationScheduleTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationSchedule operationSchedule = (OperationSchedule) o;
    return Objects.equals(this.operationscheduleName, operationSchedule.operationscheduleName) &&
        Objects.equals(this.start, operationSchedule.start) &&
        Objects.equals(this.stop, operationSchedule.stop) &&
        Objects.equals(this.type, operationSchedule.type) &&
        Objects.equals(this.closedonPublicHolidays, operationSchedule.closedonPublicHolidays) &&
        Objects.equals(this.operationScheduleTime, operationSchedule.operationScheduleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationscheduleName, start, stop, type, closedonPublicHolidays, operationScheduleTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationSchedule {\n");
    
    sb.append("    operationscheduleName: ").append(toIndentedString(operationscheduleName)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    closedonPublicHolidays: ").append(toIndentedString(closedonPublicHolidays)).append("\n");
    sb.append("    operationScheduleTime: ").append(toIndentedString(operationScheduleTime)).append("\n");
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


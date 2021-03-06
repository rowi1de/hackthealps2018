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
 * EventPublisher
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class EventPublisher {
  @JsonProperty("PublisherRID")
  private String publisherRID = null;

  @JsonProperty("Ranc")
  private Integer ranc = null;

  @JsonProperty("Publish")
  private Integer publish = null;

  public EventPublisher publisherRID(String publisherRID) {
    this.publisherRID = publisherRID;
    return this;
  }

   /**
   * Get publisherRID
   * @return publisherRID
  **/
  @ApiModelProperty(value = "")
  public String getPublisherRID() {
    return publisherRID;
  }

  public void setPublisherRID(String publisherRID) {
    this.publisherRID = publisherRID;
  }

  public EventPublisher ranc(Integer ranc) {
    this.ranc = ranc;
    return this;
  }

   /**
   * Get ranc
   * @return ranc
  **/
  @ApiModelProperty(value = "")
  public Integer getRanc() {
    return ranc;
  }

  public void setRanc(Integer ranc) {
    this.ranc = ranc;
  }

  public EventPublisher publish(Integer publish) {
    this.publish = publish;
    return this;
  }

   /**
   * Get publish
   * @return publish
  **/
  @ApiModelProperty(value = "")
  public Integer getPublish() {
    return publish;
  }

  public void setPublish(Integer publish) {
    this.publish = publish;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPublisher eventPublisher = (EventPublisher) o;
    return Objects.equals(this.publisherRID, eventPublisher.publisherRID) &&
        Objects.equals(this.ranc, eventPublisher.ranc) &&
        Objects.equals(this.publish, eventPublisher.publish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publisherRID, ranc, publish);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPublisher {\n");
    
    sb.append("    publisherRID: ").append(toIndentedString(publisherRID)).append("\n");
    sb.append("    ranc: ").append(toIndentedString(ranc)).append("\n");
    sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
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


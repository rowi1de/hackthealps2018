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
 * DetailsThemed
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class DetailsThemed {
  @JsonProperty("Title")
  private String title = null;

  @JsonProperty("Intro")
  private String intro = null;

  @JsonProperty("MetaTitle")
  private String metaTitle = null;

  @JsonProperty("MetaDesc")
  private String metaDesc = null;

  public DetailsThemed title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DetailsThemed intro(String intro) {
    this.intro = intro;
    return this;
  }

   /**
   * Get intro
   * @return intro
  **/
  @ApiModelProperty(value = "")
  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

  public DetailsThemed metaTitle(String metaTitle) {
    this.metaTitle = metaTitle;
    return this;
  }

   /**
   * Get metaTitle
   * @return metaTitle
  **/
  @ApiModelProperty(value = "")
  public String getMetaTitle() {
    return metaTitle;
  }

  public void setMetaTitle(String metaTitle) {
    this.metaTitle = metaTitle;
  }

  public DetailsThemed metaDesc(String metaDesc) {
    this.metaDesc = metaDesc;
    return this;
  }

   /**
   * Get metaDesc
   * @return metaDesc
  **/
  @ApiModelProperty(value = "")
  public String getMetaDesc() {
    return metaDesc;
  }

  public void setMetaDesc(String metaDesc) {
    this.metaDesc = metaDesc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailsThemed detailsThemed = (DetailsThemed) o;
    return Objects.equals(this.title, detailsThemed.title) &&
        Objects.equals(this.intro, detailsThemed.intro) &&
        Objects.equals(this.metaTitle, detailsThemed.metaTitle) &&
        Objects.equals(this.metaDesc, detailsThemed.metaDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, intro, metaTitle, metaDesc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailsThemed {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    metaTitle: ").append(toIndentedString(metaTitle)).append("\n");
    sb.append("    metaDesc: ").append(toIndentedString(metaDesc)).append("\n");
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

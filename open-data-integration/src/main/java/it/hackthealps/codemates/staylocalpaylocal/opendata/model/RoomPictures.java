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
 * RoomPictures
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class RoomPictures {
  @JsonProperty("Pictureurl")
  private String pictureurl = null;

  public RoomPictures pictureurl(String pictureurl) {
    this.pictureurl = pictureurl;
    return this;
  }

   /**
   * Get pictureurl
   * @return pictureurl
  **/
  @ApiModelProperty(value = "")
  public String getPictureurl() {
    return pictureurl;
  }

  public void setPictureurl(String pictureurl) {
    this.pictureurl = pictureurl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomPictures roomPictures = (RoomPictures) o;
    return Objects.equals(this.pictureurl, roomPictures.pictureurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pictureurl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomPictures {\n");
    
    sb.append("    pictureurl: ").append(toIndentedString(pictureurl)).append("\n");
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


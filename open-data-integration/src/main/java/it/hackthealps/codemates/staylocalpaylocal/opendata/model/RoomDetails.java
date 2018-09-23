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
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.CancelPolicy;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.PaymentTerm;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.RoomPictures;
import java.util.ArrayList;
import java.util.List;

/**
 * RoomDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
public class RoomDetails {
  @JsonProperty("RoomId")
  private String roomId = null;

  @JsonProperty("RoomSeq")
  private Integer roomSeq = null;

  @JsonProperty("TotalPrice")
  private Double totalPrice = null;

  @JsonProperty("OfferId")
  private String offerId = null;

  @JsonProperty("Price_ws")
  private Double priceWs = null;

  @JsonProperty("Price_bb")
  private Double priceBb = null;

  @JsonProperty("Price_hb")
  private Double priceHb = null;

  @JsonProperty("Price_fb")
  private Double priceFb = null;

  @JsonProperty("Price_ai")
  private Double priceAi = null;

  @JsonProperty("Roomtype")
  private Integer roomtype = null;

  @JsonProperty("Roomfree")
  private Integer roomfree = null;

  @JsonProperty("Roommax")
  private Integer roommax = null;

  @JsonProperty("Roommin")
  private Integer roommin = null;

  @JsonProperty("Roomstd")
  private Integer roomstd = null;

  @JsonProperty("Roomtitle")
  private String roomtitle = null;

  @JsonProperty("Roomdesc")
  private String roomdesc = null;

  @JsonProperty("RoomChannelLink")
  private String roomChannelLink = null;

  @JsonProperty("TotalPriceString")
  private String totalPriceString = null;

  @JsonProperty("RoomPictures")
  private List<RoomPictures> roomPictures = null;

  @JsonProperty("PaymentTerm")
  private PaymentTerm paymentTerm = null;

  @JsonProperty("CancelPolicy")
  private CancelPolicy cancelPolicy = null;

  public RoomDetails roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @ApiModelProperty(value = "")
  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public RoomDetails roomSeq(Integer roomSeq) {
    this.roomSeq = roomSeq;
    return this;
  }

   /**
   * Get roomSeq
   * @return roomSeq
  **/
  @ApiModelProperty(value = "")
  public Integer getRoomSeq() {
    return roomSeq;
  }

  public void setRoomSeq(Integer roomSeq) {
    this.roomSeq = roomSeq;
  }

  public RoomDetails totalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @ApiModelProperty(value = "")
  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public RoomDetails offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(value = "")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public RoomDetails priceWs(Double priceWs) {
    this.priceWs = priceWs;
    return this;
  }

   /**
   * Get priceWs
   * @return priceWs
  **/
  @ApiModelProperty(value = "")
  public Double getPriceWs() {
    return priceWs;
  }

  public void setPriceWs(Double priceWs) {
    this.priceWs = priceWs;
  }

  public RoomDetails priceBb(Double priceBb) {
    this.priceBb = priceBb;
    return this;
  }

   /**
   * Get priceBb
   * @return priceBb
  **/
  @ApiModelProperty(value = "")
  public Double getPriceBb() {
    return priceBb;
  }

  public void setPriceBb(Double priceBb) {
    this.priceBb = priceBb;
  }

  public RoomDetails priceHb(Double priceHb) {
    this.priceHb = priceHb;
    return this;
  }

   /**
   * Get priceHb
   * @return priceHb
  **/
  @ApiModelProperty(value = "")
  public Double getPriceHb() {
    return priceHb;
  }

  public void setPriceHb(Double priceHb) {
    this.priceHb = priceHb;
  }

  public RoomDetails priceFb(Double priceFb) {
    this.priceFb = priceFb;
    return this;
  }

   /**
   * Get priceFb
   * @return priceFb
  **/
  @ApiModelProperty(value = "")
  public Double getPriceFb() {
    return priceFb;
  }

  public void setPriceFb(Double priceFb) {
    this.priceFb = priceFb;
  }

  public RoomDetails priceAi(Double priceAi) {
    this.priceAi = priceAi;
    return this;
  }

   /**
   * Get priceAi
   * @return priceAi
  **/
  @ApiModelProperty(value = "")
  public Double getPriceAi() {
    return priceAi;
  }

  public void setPriceAi(Double priceAi) {
    this.priceAi = priceAi;
  }

  public RoomDetails roomtype(Integer roomtype) {
    this.roomtype = roomtype;
    return this;
  }

   /**
   * Get roomtype
   * @return roomtype
  **/
  @ApiModelProperty(value = "")
  public Integer getRoomtype() {
    return roomtype;
  }

  public void setRoomtype(Integer roomtype) {
    this.roomtype = roomtype;
  }

  public RoomDetails roomfree(Integer roomfree) {
    this.roomfree = roomfree;
    return this;
  }

   /**
   * Get roomfree
   * @return roomfree
  **/
  @ApiModelProperty(value = "")
  public Integer getRoomfree() {
    return roomfree;
  }

  public void setRoomfree(Integer roomfree) {
    this.roomfree = roomfree;
  }

  public RoomDetails roommax(Integer roommax) {
    this.roommax = roommax;
    return this;
  }

   /**
   * Get roommax
   * @return roommax
  **/
  @ApiModelProperty(value = "")
  public Integer getRoommax() {
    return roommax;
  }

  public void setRoommax(Integer roommax) {
    this.roommax = roommax;
  }

  public RoomDetails roommin(Integer roommin) {
    this.roommin = roommin;
    return this;
  }

   /**
   * Get roommin
   * @return roommin
  **/
  @ApiModelProperty(value = "")
  public Integer getRoommin() {
    return roommin;
  }

  public void setRoommin(Integer roommin) {
    this.roommin = roommin;
  }

  public RoomDetails roomstd(Integer roomstd) {
    this.roomstd = roomstd;
    return this;
  }

   /**
   * Get roomstd
   * @return roomstd
  **/
  @ApiModelProperty(value = "")
  public Integer getRoomstd() {
    return roomstd;
  }

  public void setRoomstd(Integer roomstd) {
    this.roomstd = roomstd;
  }

  public RoomDetails roomtitle(String roomtitle) {
    this.roomtitle = roomtitle;
    return this;
  }

   /**
   * Get roomtitle
   * @return roomtitle
  **/
  @ApiModelProperty(value = "")
  public String getRoomtitle() {
    return roomtitle;
  }

  public void setRoomtitle(String roomtitle) {
    this.roomtitle = roomtitle;
  }

  public RoomDetails roomdesc(String roomdesc) {
    this.roomdesc = roomdesc;
    return this;
  }

   /**
   * Get roomdesc
   * @return roomdesc
  **/
  @ApiModelProperty(value = "")
  public String getRoomdesc() {
    return roomdesc;
  }

  public void setRoomdesc(String roomdesc) {
    this.roomdesc = roomdesc;
  }

  public RoomDetails roomChannelLink(String roomChannelLink) {
    this.roomChannelLink = roomChannelLink;
    return this;
  }

   /**
   * Get roomChannelLink
   * @return roomChannelLink
  **/
  @ApiModelProperty(value = "")
  public String getRoomChannelLink() {
    return roomChannelLink;
  }

  public void setRoomChannelLink(String roomChannelLink) {
    this.roomChannelLink = roomChannelLink;
  }

  public RoomDetails totalPriceString(String totalPriceString) {
    this.totalPriceString = totalPriceString;
    return this;
  }

   /**
   * Get totalPriceString
   * @return totalPriceString
  **/
  @ApiModelProperty(value = "")
  public String getTotalPriceString() {
    return totalPriceString;
  }

  public void setTotalPriceString(String totalPriceString) {
    this.totalPriceString = totalPriceString;
  }

  public RoomDetails roomPictures(List<RoomPictures> roomPictures) {
    this.roomPictures = roomPictures;
    return this;
  }

  public RoomDetails addRoomPicturesItem(RoomPictures roomPicturesItem) {
    if (this.roomPictures == null) {
      this.roomPictures = new ArrayList<>();
    }
    this.roomPictures.add(roomPicturesItem);
    return this;
  }

   /**
   * Get roomPictures
   * @return roomPictures
  **/
  @ApiModelProperty(value = "")
  public List<RoomPictures> getRoomPictures() {
    return roomPictures;
  }

  public void setRoomPictures(List<RoomPictures> roomPictures) {
    this.roomPictures = roomPictures;
  }

  public RoomDetails paymentTerm(PaymentTerm paymentTerm) {
    this.paymentTerm = paymentTerm;
    return this;
  }

   /**
   * Get paymentTerm
   * @return paymentTerm
  **/
  @ApiModelProperty(value = "")
  public PaymentTerm getPaymentTerm() {
    return paymentTerm;
  }

  public void setPaymentTerm(PaymentTerm paymentTerm) {
    this.paymentTerm = paymentTerm;
  }

  public RoomDetails cancelPolicy(CancelPolicy cancelPolicy) {
    this.cancelPolicy = cancelPolicy;
    return this;
  }

   /**
   * Get cancelPolicy
   * @return cancelPolicy
  **/
  @ApiModelProperty(value = "")
  public CancelPolicy getCancelPolicy() {
    return cancelPolicy;
  }

  public void setCancelPolicy(CancelPolicy cancelPolicy) {
    this.cancelPolicy = cancelPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomDetails roomDetails = (RoomDetails) o;
    return Objects.equals(this.roomId, roomDetails.roomId) &&
        Objects.equals(this.roomSeq, roomDetails.roomSeq) &&
        Objects.equals(this.totalPrice, roomDetails.totalPrice) &&
        Objects.equals(this.offerId, roomDetails.offerId) &&
        Objects.equals(this.priceWs, roomDetails.priceWs) &&
        Objects.equals(this.priceBb, roomDetails.priceBb) &&
        Objects.equals(this.priceHb, roomDetails.priceHb) &&
        Objects.equals(this.priceFb, roomDetails.priceFb) &&
        Objects.equals(this.priceAi, roomDetails.priceAi) &&
        Objects.equals(this.roomtype, roomDetails.roomtype) &&
        Objects.equals(this.roomfree, roomDetails.roomfree) &&
        Objects.equals(this.roommax, roomDetails.roommax) &&
        Objects.equals(this.roommin, roomDetails.roommin) &&
        Objects.equals(this.roomstd, roomDetails.roomstd) &&
        Objects.equals(this.roomtitle, roomDetails.roomtitle) &&
        Objects.equals(this.roomdesc, roomDetails.roomdesc) &&
        Objects.equals(this.roomChannelLink, roomDetails.roomChannelLink) &&
        Objects.equals(this.totalPriceString, roomDetails.totalPriceString) &&
        Objects.equals(this.roomPictures, roomDetails.roomPictures) &&
        Objects.equals(this.paymentTerm, roomDetails.paymentTerm) &&
        Objects.equals(this.cancelPolicy, roomDetails.cancelPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, roomSeq, totalPrice, offerId, priceWs, priceBb, priceHb, priceFb, priceAi, roomtype, roomfree, roommax, roommin, roomstd, roomtitle, roomdesc, roomChannelLink, totalPriceString, roomPictures, paymentTerm, cancelPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomDetails {\n");
    
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomSeq: ").append(toIndentedString(roomSeq)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    priceWs: ").append(toIndentedString(priceWs)).append("\n");
    sb.append("    priceBb: ").append(toIndentedString(priceBb)).append("\n");
    sb.append("    priceHb: ").append(toIndentedString(priceHb)).append("\n");
    sb.append("    priceFb: ").append(toIndentedString(priceFb)).append("\n");
    sb.append("    priceAi: ").append(toIndentedString(priceAi)).append("\n");
    sb.append("    roomtype: ").append(toIndentedString(roomtype)).append("\n");
    sb.append("    roomfree: ").append(toIndentedString(roomfree)).append("\n");
    sb.append("    roommax: ").append(toIndentedString(roommax)).append("\n");
    sb.append("    roommin: ").append(toIndentedString(roommin)).append("\n");
    sb.append("    roomstd: ").append(toIndentedString(roomstd)).append("\n");
    sb.append("    roomtitle: ").append(toIndentedString(roomtitle)).append("\n");
    sb.append("    roomdesc: ").append(toIndentedString(roomdesc)).append("\n");
    sb.append("    roomChannelLink: ").append(toIndentedString(roomChannelLink)).append("\n");
    sb.append("    totalPriceString: ").append(toIndentedString(totalPriceString)).append("\n");
    sb.append("    roomPictures: ").append(toIndentedString(roomPictures)).append("\n");
    sb.append("    paymentTerm: ").append(toIndentedString(paymentTerm)).append("\n");
    sb.append("    cancelPolicy: ").append(toIndentedString(cancelPolicy)).append("\n");
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

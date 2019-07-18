/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetGLClosureResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetGLClosureResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("closingDate")
  private LocalDate closingDate = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("createdDate")
  private LocalDate createdDate = null;

  @SerializedName("lastUpdatedDate")
  private LocalDate lastUpdatedDate = null;

  @SerializedName("createdByUserId")
  private Long createdByUserId = null;

  @SerializedName("createdByUsername")
  private String createdByUsername = null;

  @SerializedName("lastUpdatedByUserId")
  private Long lastUpdatedByUserId = null;

  @SerializedName("lastUpdatedByUsername")
  private String lastUpdatedByUsername = null;

  @SerializedName("comments")
  private String comments = null;

  public GetGLClosureResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "7", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetGLClosureResponse officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public GetGLClosureResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @ApiModelProperty(example = "Head Office", value = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public GetGLClosureResponse closingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
    return this;
  }

   /**
   * Get closingDate
   * @return closingDate
  **/
  @ApiModelProperty(example = "2013,1,2", value = "")
  public LocalDate getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
  }

  public GetGLClosureResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public GetGLClosureResponse createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "2013,1,3", value = "")
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public GetGLClosureResponse lastUpdatedDate(LocalDate lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(example = "2013,1,3", value = "")
  public LocalDate getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(LocalDate lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public GetGLClosureResponse createdByUserId(Long createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * Get createdByUserId
   * @return createdByUserId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(Long createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public GetGLClosureResponse createdByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
    return this;
  }

   /**
   * Get createdByUsername
   * @return createdByUsername
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getCreatedByUsername() {
    return createdByUsername;
  }

  public void setCreatedByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
  }

  public GetGLClosureResponse lastUpdatedByUserId(Long lastUpdatedByUserId) {
    this.lastUpdatedByUserId = lastUpdatedByUserId;
    return this;
  }

   /**
   * Get lastUpdatedByUserId
   * @return lastUpdatedByUserId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getLastUpdatedByUserId() {
    return lastUpdatedByUserId;
  }

  public void setLastUpdatedByUserId(Long lastUpdatedByUserId) {
    this.lastUpdatedByUserId = lastUpdatedByUserId;
  }

  public GetGLClosureResponse lastUpdatedByUsername(String lastUpdatedByUsername) {
    this.lastUpdatedByUsername = lastUpdatedByUsername;
    return this;
  }

   /**
   * Get lastUpdatedByUsername
   * @return lastUpdatedByUsername
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getLastUpdatedByUsername() {
    return lastUpdatedByUsername;
  }

  public void setLastUpdatedByUsername(String lastUpdatedByUsername) {
    this.lastUpdatedByUsername = lastUpdatedByUsername;
  }

  public GetGLClosureResponse comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(example = "closed", value = "")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGLClosureResponse getGLClosureResponse = (GetGLClosureResponse) o;
    return Objects.equals(this.id, getGLClosureResponse.id) &&
        Objects.equals(this.officeId, getGLClosureResponse.officeId) &&
        Objects.equals(this.officeName, getGLClosureResponse.officeName) &&
        Objects.equals(this.closingDate, getGLClosureResponse.closingDate) &&
        Objects.equals(this.deleted, getGLClosureResponse.deleted) &&
        Objects.equals(this.createdDate, getGLClosureResponse.createdDate) &&
        Objects.equals(this.lastUpdatedDate, getGLClosureResponse.lastUpdatedDate) &&
        Objects.equals(this.createdByUserId, getGLClosureResponse.createdByUserId) &&
        Objects.equals(this.createdByUsername, getGLClosureResponse.createdByUsername) &&
        Objects.equals(this.lastUpdatedByUserId, getGLClosureResponse.lastUpdatedByUserId) &&
        Objects.equals(this.lastUpdatedByUsername, getGLClosureResponse.lastUpdatedByUsername) &&
        Objects.equals(this.comments, getGLClosureResponse.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, officeId, officeName, closingDate, deleted, createdDate, lastUpdatedDate, createdByUserId, createdByUsername, lastUpdatedByUserId, lastUpdatedByUsername, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGLClosureResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    createdByUsername: ").append(toIndentedString(createdByUsername)).append("\n");
    sb.append("    lastUpdatedByUserId: ").append(toIndentedString(lastUpdatedByUserId)).append("\n");
    sb.append("    lastUpdatedByUsername: ").append(toIndentedString(lastUpdatedByUsername)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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


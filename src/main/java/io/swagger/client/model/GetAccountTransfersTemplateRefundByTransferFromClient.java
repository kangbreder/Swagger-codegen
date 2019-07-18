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
import io.swagger.client.model.GetAccountTransfersClientClassification;
import io.swagger.client.model.GetAccountTransfersClientType;
import io.swagger.client.model.GetAccountTransfersGender;
import io.swagger.client.model.GetAccountTransfersGroups;
import io.swagger.client.model.GetAccountTransfersStatus;
import io.swagger.client.model.GetAccountTransfersTimeline;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetAccountTransfersTemplateRefundByTransferFromClient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetAccountTransfersTemplateRefundByTransferFromClient {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private Long accountNo = null;

  @SerializedName("status")
  private GetAccountTransfersStatus status = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("activationDate")
  private LocalDate activationDate = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("gender")
  private GetAccountTransfersGender gender = null;

  @SerializedName("clientType")
  private GetAccountTransfersClientType clientType = null;

  @SerializedName("clientClassification")
  private GetAccountTransfersClientClassification clientClassification = null;

  @SerializedName("officeId")
  private Integer officeId = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("timeline")
  private GetAccountTransfersTimeline timeline = null;

  @SerializedName("groups")
  private GetAccountTransfersGroups groups = null;

  public GetAccountTransfersTemplateRefundByTransferFromClient id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient status(GetAccountTransfersStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersStatus getStatus() {
    return status;
  }

  public void setStatus(GetAccountTransfersStatus status) {
    this.status = status;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient activationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Get activationDate
   * @return activationDate
  **/
  @ApiModelProperty(example = "[2012, 2, 1]", value = "")
  public LocalDate getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(example = "Daniel", value = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "Owusu", value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "Daniel Owusu", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient gender(GetAccountTransfersGender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersGender getGender() {
    return gender;
  }

  public void setGender(GetAccountTransfersGender gender) {
    this.gender = gender;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient clientType(GetAccountTransfersClientType clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Get clientType
   * @return clientType
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersClientType getClientType() {
    return clientType;
  }

  public void setClientType(GetAccountTransfersClientType clientType) {
    this.clientType = clientType;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient clientClassification(GetAccountTransfersClientClassification clientClassification) {
    this.clientClassification = clientClassification;
    return this;
  }

   /**
   * Get clientClassification
   * @return clientClassification
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersClientClassification getClientClassification() {
    return clientClassification;
  }

  public void setClientClassification(GetAccountTransfersClientClassification clientClassification) {
    this.clientClassification = clientClassification;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient officeName(String officeName) {
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

  public GetAccountTransfersTemplateRefundByTransferFromClient timeline(GetAccountTransfersTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetAccountTransfersTimeline timeline) {
    this.timeline = timeline;
  }

  public GetAccountTransfersTemplateRefundByTransferFromClient groups(GetAccountTransfersGroups groups) {
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersGroups getGroups() {
    return groups;
  }

  public void setGroups(GetAccountTransfersGroups groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersTemplateRefundByTransferFromClient getAccountTransfersTemplateRefundByTransferFromClient = (GetAccountTransfersTemplateRefundByTransferFromClient) o;
    return Objects.equals(this.id, getAccountTransfersTemplateRefundByTransferFromClient.id) &&
        Objects.equals(this.accountNo, getAccountTransfersTemplateRefundByTransferFromClient.accountNo) &&
        Objects.equals(this.status, getAccountTransfersTemplateRefundByTransferFromClient.status) &&
        Objects.equals(this.active, getAccountTransfersTemplateRefundByTransferFromClient.active) &&
        Objects.equals(this.activationDate, getAccountTransfersTemplateRefundByTransferFromClient.activationDate) &&
        Objects.equals(this.firstname, getAccountTransfersTemplateRefundByTransferFromClient.firstname) &&
        Objects.equals(this.lastname, getAccountTransfersTemplateRefundByTransferFromClient.lastname) &&
        Objects.equals(this.displayName, getAccountTransfersTemplateRefundByTransferFromClient.displayName) &&
        Objects.equals(this.gender, getAccountTransfersTemplateRefundByTransferFromClient.gender) &&
        Objects.equals(this.clientType, getAccountTransfersTemplateRefundByTransferFromClient.clientType) &&
        Objects.equals(this.clientClassification, getAccountTransfersTemplateRefundByTransferFromClient.clientClassification) &&
        Objects.equals(this.officeId, getAccountTransfersTemplateRefundByTransferFromClient.officeId) &&
        Objects.equals(this.officeName, getAccountTransfersTemplateRefundByTransferFromClient.officeName) &&
        Objects.equals(this.timeline, getAccountTransfersTemplateRefundByTransferFromClient.timeline) &&
        Objects.equals(this.groups, getAccountTransfersTemplateRefundByTransferFromClient.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, status, active, activationDate, firstname, lastname, displayName, gender, clientType, clientClassification, officeId, officeName, timeline, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersTemplateRefundByTransferFromClient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    clientClassification: ").append(toIndentedString(clientClassification)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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


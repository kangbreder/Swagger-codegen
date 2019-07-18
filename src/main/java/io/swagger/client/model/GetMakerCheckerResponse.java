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
import org.threeten.bp.OffsetDateTime;

/**
 * GetMakerCheckerResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetMakerCheckerResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("actionName")
  private String actionName = null;

  @SerializedName("entityName")
  private String entityName = null;

  @SerializedName("resourceId")
  private Long resourceId = null;

  @SerializedName("subresourceId")
  private Long subresourceId = null;

  @SerializedName("maker")
  private String maker = null;

  @SerializedName("madeOnDate")
  private OffsetDateTime madeOnDate = null;

  @SerializedName("checker")
  private String checker = null;

  @SerializedName("checkedOnDate")
  private OffsetDateTime checkedOnDate = null;

  @SerializedName("processingResult")
  private String processingResult = null;

  @SerializedName("commandAsJson")
  private String commandAsJson = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("groupLevelName")
  private String groupLevelName = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("loanAccountNo")
  private String loanAccountNo = null;

  @SerializedName("savingsAccountNo")
  private String savingsAccountNo = null;

  @SerializedName("clientId")
  private Long clientId = null;

  @SerializedName("loanId")
  private Long loanId = null;

  @SerializedName("url")
  private String url = null;

  public GetMakerCheckerResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetMakerCheckerResponse actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }

   /**
   * Get actionName
   * @return actionName
  **/
  @ApiModelProperty(value = "")
  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  public GetMakerCheckerResponse entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @ApiModelProperty(value = "")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public GetMakerCheckerResponse resourceId(Long resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @ApiModelProperty(value = "")
  public Long getResourceId() {
    return resourceId;
  }

  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }

  public GetMakerCheckerResponse subresourceId(Long subresourceId) {
    this.subresourceId = subresourceId;
    return this;
  }

   /**
   * Get subresourceId
   * @return subresourceId
  **/
  @ApiModelProperty(value = "")
  public Long getSubresourceId() {
    return subresourceId;
  }

  public void setSubresourceId(Long subresourceId) {
    this.subresourceId = subresourceId;
  }

  public GetMakerCheckerResponse maker(String maker) {
    this.maker = maker;
    return this;
  }

   /**
   * Get maker
   * @return maker
  **/
  @ApiModelProperty(value = "")
  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public GetMakerCheckerResponse madeOnDate(OffsetDateTime madeOnDate) {
    this.madeOnDate = madeOnDate;
    return this;
  }

   /**
   * Get madeOnDate
   * @return madeOnDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getMadeOnDate() {
    return madeOnDate;
  }

  public void setMadeOnDate(OffsetDateTime madeOnDate) {
    this.madeOnDate = madeOnDate;
  }

  public GetMakerCheckerResponse checker(String checker) {
    this.checker = checker;
    return this;
  }

   /**
   * Get checker
   * @return checker
  **/
  @ApiModelProperty(value = "")
  public String getChecker() {
    return checker;
  }

  public void setChecker(String checker) {
    this.checker = checker;
  }

  public GetMakerCheckerResponse checkedOnDate(OffsetDateTime checkedOnDate) {
    this.checkedOnDate = checkedOnDate;
    return this;
  }

   /**
   * Get checkedOnDate
   * @return checkedOnDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCheckedOnDate() {
    return checkedOnDate;
  }

  public void setCheckedOnDate(OffsetDateTime checkedOnDate) {
    this.checkedOnDate = checkedOnDate;
  }

  public GetMakerCheckerResponse processingResult(String processingResult) {
    this.processingResult = processingResult;
    return this;
  }

   /**
   * Get processingResult
   * @return processingResult
  **/
  @ApiModelProperty(value = "")
  public String getProcessingResult() {
    return processingResult;
  }

  public void setProcessingResult(String processingResult) {
    this.processingResult = processingResult;
  }

  public GetMakerCheckerResponse commandAsJson(String commandAsJson) {
    this.commandAsJson = commandAsJson;
    return this;
  }

   /**
   * Get commandAsJson
   * @return commandAsJson
  **/
  @ApiModelProperty(value = "")
  public String getCommandAsJson() {
    return commandAsJson;
  }

  public void setCommandAsJson(String commandAsJson) {
    this.commandAsJson = commandAsJson;
  }

  public GetMakerCheckerResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @ApiModelProperty(value = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public GetMakerCheckerResponse groupLevelName(String groupLevelName) {
    this.groupLevelName = groupLevelName;
    return this;
  }

   /**
   * Get groupLevelName
   * @return groupLevelName
  **/
  @ApiModelProperty(value = "")
  public String getGroupLevelName() {
    return groupLevelName;
  }

  public void setGroupLevelName(String groupLevelName) {
    this.groupLevelName = groupLevelName;
  }

  public GetMakerCheckerResponse groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(value = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public GetMakerCheckerResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetMakerCheckerResponse loanAccountNo(String loanAccountNo) {
    this.loanAccountNo = loanAccountNo;
    return this;
  }

   /**
   * Get loanAccountNo
   * @return loanAccountNo
  **/
  @ApiModelProperty(value = "")
  public String getLoanAccountNo() {
    return loanAccountNo;
  }

  public void setLoanAccountNo(String loanAccountNo) {
    this.loanAccountNo = loanAccountNo;
  }

  public GetMakerCheckerResponse savingsAccountNo(String savingsAccountNo) {
    this.savingsAccountNo = savingsAccountNo;
    return this;
  }

   /**
   * Get savingsAccountNo
   * @return savingsAccountNo
  **/
  @ApiModelProperty(value = "")
  public String getSavingsAccountNo() {
    return savingsAccountNo;
  }

  public void setSavingsAccountNo(String savingsAccountNo) {
    this.savingsAccountNo = savingsAccountNo;
  }

  public GetMakerCheckerResponse clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public GetMakerCheckerResponse loanId(Long loanId) {
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @ApiModelProperty(value = "")
  public Long getLoanId() {
    return loanId;
  }

  public void setLoanId(Long loanId) {
    this.loanId = loanId;
  }

  public GetMakerCheckerResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMakerCheckerResponse getMakerCheckerResponse = (GetMakerCheckerResponse) o;
    return Objects.equals(this.id, getMakerCheckerResponse.id) &&
        Objects.equals(this.actionName, getMakerCheckerResponse.actionName) &&
        Objects.equals(this.entityName, getMakerCheckerResponse.entityName) &&
        Objects.equals(this.resourceId, getMakerCheckerResponse.resourceId) &&
        Objects.equals(this.subresourceId, getMakerCheckerResponse.subresourceId) &&
        Objects.equals(this.maker, getMakerCheckerResponse.maker) &&
        Objects.equals(this.madeOnDate, getMakerCheckerResponse.madeOnDate) &&
        Objects.equals(this.checker, getMakerCheckerResponse.checker) &&
        Objects.equals(this.checkedOnDate, getMakerCheckerResponse.checkedOnDate) &&
        Objects.equals(this.processingResult, getMakerCheckerResponse.processingResult) &&
        Objects.equals(this.commandAsJson, getMakerCheckerResponse.commandAsJson) &&
        Objects.equals(this.officeName, getMakerCheckerResponse.officeName) &&
        Objects.equals(this.groupLevelName, getMakerCheckerResponse.groupLevelName) &&
        Objects.equals(this.groupName, getMakerCheckerResponse.groupName) &&
        Objects.equals(this.clientName, getMakerCheckerResponse.clientName) &&
        Objects.equals(this.loanAccountNo, getMakerCheckerResponse.loanAccountNo) &&
        Objects.equals(this.savingsAccountNo, getMakerCheckerResponse.savingsAccountNo) &&
        Objects.equals(this.clientId, getMakerCheckerResponse.clientId) &&
        Objects.equals(this.loanId, getMakerCheckerResponse.loanId) &&
        Objects.equals(this.url, getMakerCheckerResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actionName, entityName, resourceId, subresourceId, maker, madeOnDate, checker, checkedOnDate, processingResult, commandAsJson, officeName, groupLevelName, groupName, clientName, loanAccountNo, savingsAccountNo, clientId, loanId, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMakerCheckerResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    subresourceId: ").append(toIndentedString(subresourceId)).append("\n");
    sb.append("    maker: ").append(toIndentedString(maker)).append("\n");
    sb.append("    madeOnDate: ").append(toIndentedString(madeOnDate)).append("\n");
    sb.append("    checker: ").append(toIndentedString(checker)).append("\n");
    sb.append("    checkedOnDate: ").append(toIndentedString(checkedOnDate)).append("\n");
    sb.append("    processingResult: ").append(toIndentedString(processingResult)).append("\n");
    sb.append("    commandAsJson: ").append(toIndentedString(commandAsJson)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    groupLevelName: ").append(toIndentedString(groupLevelName)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    loanAccountNo: ").append(toIndentedString(loanAccountNo)).append("\n");
    sb.append("    savingsAccountNo: ").append(toIndentedString(savingsAccountNo)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


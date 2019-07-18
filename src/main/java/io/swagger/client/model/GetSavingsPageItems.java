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
import io.swagger.client.model.GetSavingsCurrency;
import io.swagger.client.model.GetSavingsInterestCalculationDaysInYearType;
import io.swagger.client.model.GetSavingsInterestCalculationType;
import io.swagger.client.model.GetSavingsInterestCompoundingPeriodType;
import io.swagger.client.model.GetSavingsInterestPostingPeriodType;
import io.swagger.client.model.GetSavingsStatus;
import io.swagger.client.model.GetSavingsSummary;
import io.swagger.client.model.GetSavingsTimeline;
import java.io.IOException;

/**
 * GetSavingsPageItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetSavingsPageItems {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private String accountNo = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("savingsProductId")
  private Integer savingsProductId = null;

  @SerializedName("savingsProductName")
  private String savingsProductName = null;

  @SerializedName("fieldOfficerId")
  private Integer fieldOfficerId = null;

  @SerializedName("status")
  private GetSavingsStatus status = null;

  @SerializedName("timeline")
  private GetSavingsTimeline timeline = null;

  @SerializedName("currency")
  private GetSavingsCurrency currency = null;

  @SerializedName("nominalAnnualInterestRate")
  private Double nominalAnnualInterestRate = null;

  @SerializedName("interestCompoundingPeriodType")
  private GetSavingsInterestCompoundingPeriodType interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private GetSavingsInterestPostingPeriodType interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private GetSavingsInterestCalculationType interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private GetSavingsInterestCalculationDaysInYearType interestCalculationDaysInYearType = null;

  @SerializedName("summary")
  private GetSavingsSummary summary = null;

  public GetSavingsPageItems id(Integer id) {
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

  public GetSavingsPageItems accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "000000001", value = "")
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public GetSavingsPageItems clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetSavingsPageItems clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(example = "small business", value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetSavingsPageItems savingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getSavingsProductId() {
    return savingsProductId;
  }

  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }

  public GetSavingsPageItems savingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @ApiModelProperty(example = "Passbook Savings", value = "")
  public String getSavingsProductName() {
    return savingsProductName;
  }

  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }

  public GetSavingsPageItems fieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
    return this;
  }

   /**
   * Get fieldOfficerId
   * @return fieldOfficerId
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getFieldOfficerId() {
    return fieldOfficerId;
  }

  public void setFieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
  }

  public GetSavingsPageItems status(GetSavingsStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetSavingsStatus getStatus() {
    return status;
  }

  public void setStatus(GetSavingsStatus status) {
    this.status = status;
  }

  public GetSavingsPageItems timeline(GetSavingsTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @ApiModelProperty(value = "")
  public GetSavingsTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetSavingsTimeline timeline) {
    this.timeline = timeline;
  }

  public GetSavingsPageItems currency(GetSavingsCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetSavingsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetSavingsCurrency currency) {
    this.currency = currency;
  }

  public GetSavingsPageItems nominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
    return this;
  }

   /**
   * Get nominalAnnualInterestRate
   * @return nominalAnnualInterestRate
  **/
  @ApiModelProperty(example = "5.0", value = "")
  public Double getNominalAnnualInterestRate() {
    return nominalAnnualInterestRate;
  }

  public void setNominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
  }

  public GetSavingsPageItems interestCompoundingPeriodType(GetSavingsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(GetSavingsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public GetSavingsPageItems interestPostingPeriodType(GetSavingsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(GetSavingsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public GetSavingsPageItems interestCalculationType(GetSavingsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(GetSavingsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public GetSavingsPageItems interestCalculationDaysInYearType(GetSavingsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(GetSavingsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public GetSavingsPageItems summary(GetSavingsSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public GetSavingsSummary getSummary() {
    return summary;
  }

  public void setSummary(GetSavingsSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsPageItems getSavingsPageItems = (GetSavingsPageItems) o;
    return Objects.equals(this.id, getSavingsPageItems.id) &&
        Objects.equals(this.accountNo, getSavingsPageItems.accountNo) &&
        Objects.equals(this.clientId, getSavingsPageItems.clientId) &&
        Objects.equals(this.clientName, getSavingsPageItems.clientName) &&
        Objects.equals(this.savingsProductId, getSavingsPageItems.savingsProductId) &&
        Objects.equals(this.savingsProductName, getSavingsPageItems.savingsProductName) &&
        Objects.equals(this.fieldOfficerId, getSavingsPageItems.fieldOfficerId) &&
        Objects.equals(this.status, getSavingsPageItems.status) &&
        Objects.equals(this.timeline, getSavingsPageItems.timeline) &&
        Objects.equals(this.currency, getSavingsPageItems.currency) &&
        Objects.equals(this.nominalAnnualInterestRate, getSavingsPageItems.nominalAnnualInterestRate) &&
        Objects.equals(this.interestCompoundingPeriodType, getSavingsPageItems.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getSavingsPageItems.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getSavingsPageItems.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getSavingsPageItems.interestCalculationDaysInYearType) &&
        Objects.equals(this.summary, getSavingsPageItems.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, clientId, clientName, savingsProductId, savingsProductName, fieldOfficerId, status, timeline, currency, nominalAnnualInterestRate, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsPageItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    fieldOfficerId: ").append(toIndentedString(fieldOfficerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nominalAnnualInterestRate: ").append(toIndentedString(nominalAnnualInterestRate)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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


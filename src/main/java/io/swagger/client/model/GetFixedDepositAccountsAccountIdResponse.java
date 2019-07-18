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
import io.swagger.client.model.GetFixedDepositAccountsAccountChart;
import io.swagger.client.model.GetFixedDepositAccountsAccountIdCurrency;
import io.swagger.client.model.GetFixedDepositAccountsAccountIdSummary;
import io.swagger.client.model.GetFixedDepositAccountsDepositPeriodFrequency;
import io.swagger.client.model.GetFixedDepositAccountsInterestCalculationDaysInYearType;
import io.swagger.client.model.GetFixedDepositAccountsInterestCalculationType;
import io.swagger.client.model.GetFixedDepositAccountsInterestCompoundingPeriodType;
import io.swagger.client.model.GetFixedDepositAccountsInterestPostingPeriodType;
import io.swagger.client.model.GetFixedDepositAccountsMaxDepositTermType;
import io.swagger.client.model.GetFixedDepositAccountsMinDepositTermType;
import io.swagger.client.model.GetFixedDepositAccountsStatus;
import io.swagger.client.model.GetFixedDepositAccountsTimeline;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetFixedDepositAccountsAccountIdResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetFixedDepositAccountsAccountIdResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private Long accountNo = null;

  @SerializedName("externalId")
  private String externalId = null;

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
  private GetFixedDepositAccountsStatus status = null;

  @SerializedName("timeline")
  private GetFixedDepositAccountsTimeline timeline = null;

  @SerializedName("currency")
  private GetFixedDepositAccountsAccountIdCurrency currency = null;

  @SerializedName("interestCompoundingPeriodType")
  private GetFixedDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private GetFixedDepositAccountsInterestPostingPeriodType interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private GetFixedDepositAccountsInterestCalculationType interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private GetFixedDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType = null;

  @SerializedName("interestFreePeriodApplicable")
  private Boolean interestFreePeriodApplicable = null;

  @SerializedName("preClosurePenalApplicable")
  private Boolean preClosurePenalApplicable = null;

  @SerializedName("minDepositTerm")
  private Integer minDepositTerm = null;

  @SerializedName("maxDepositTerm")
  private Integer maxDepositTerm = null;

  @SerializedName("minDepositTermType")
  private GetFixedDepositAccountsMinDepositTermType minDepositTermType = null;

  @SerializedName("maxDepositTermType")
  private GetFixedDepositAccountsMaxDepositTermType maxDepositTermType = null;

  @SerializedName("depositAmount")
  private Float depositAmount = null;

  @SerializedName("maturityAmount")
  private Float maturityAmount = null;

  @SerializedName("maturityDate")
  private LocalDate maturityDate = null;

  @SerializedName("depositPeriod")
  private Integer depositPeriod = null;

  @SerializedName("depositPeriodFrequency")
  private GetFixedDepositAccountsDepositPeriodFrequency depositPeriodFrequency = null;

  @SerializedName("summary")
  private GetFixedDepositAccountsAccountIdSummary summary = null;

  @SerializedName("accountChart")
  private GetFixedDepositAccountsAccountChart accountChart = null;

  public GetFixedDepositAccountsAccountIdResponse id(Integer id) {
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

  public GetFixedDepositAccountsAccountIdResponse accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "FD000023", value = "")
  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public GetFixedDepositAccountsAccountIdResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(example = "FD-23", value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public GetFixedDepositAccountsAccountIdResponse clientId(Integer clientId) {
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

  public GetFixedDepositAccountsAccountIdResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(example = "Sangamesh N", value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetFixedDepositAccountsAccountIdResponse savingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @ApiModelProperty(example = "3", value = "")
  public Integer getSavingsProductId() {
    return savingsProductId;
  }

  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }

  public GetFixedDepositAccountsAccountIdResponse savingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @ApiModelProperty(example = "FD01", value = "")
  public String getSavingsProductName() {
    return savingsProductName;
  }

  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }

  public GetFixedDepositAccountsAccountIdResponse fieldOfficerId(Integer fieldOfficerId) {
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

  public GetFixedDepositAccountsAccountIdResponse status(GetFixedDepositAccountsStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsStatus getStatus() {
    return status;
  }

  public void setStatus(GetFixedDepositAccountsStatus status) {
    this.status = status;
  }

  public GetFixedDepositAccountsAccountIdResponse timeline(GetFixedDepositAccountsTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetFixedDepositAccountsTimeline timeline) {
    this.timeline = timeline;
  }

  public GetFixedDepositAccountsAccountIdResponse currency(GetFixedDepositAccountsAccountIdCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsAccountIdCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetFixedDepositAccountsAccountIdCurrency currency) {
    this.currency = currency;
  }

  public GetFixedDepositAccountsAccountIdResponse interestCompoundingPeriodType(GetFixedDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(GetFixedDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public GetFixedDepositAccountsAccountIdResponse interestPostingPeriodType(GetFixedDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(GetFixedDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public GetFixedDepositAccountsAccountIdResponse interestCalculationType(GetFixedDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(GetFixedDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public GetFixedDepositAccountsAccountIdResponse interestCalculationDaysInYearType(GetFixedDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(GetFixedDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public GetFixedDepositAccountsAccountIdResponse interestFreePeriodApplicable(Boolean interestFreePeriodApplicable) {
    this.interestFreePeriodApplicable = interestFreePeriodApplicable;
    return this;
  }

   /**
   * Get interestFreePeriodApplicable
   * @return interestFreePeriodApplicable
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isInterestFreePeriodApplicable() {
    return interestFreePeriodApplicable;
  }

  public void setInterestFreePeriodApplicable(Boolean interestFreePeriodApplicable) {
    this.interestFreePeriodApplicable = interestFreePeriodApplicable;
  }

  public GetFixedDepositAccountsAccountIdResponse preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
    return this;
  }

   /**
   * Get preClosurePenalApplicable
   * @return preClosurePenalApplicable
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isPreClosurePenalApplicable() {
    return preClosurePenalApplicable;
  }

  public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
  }

  public GetFixedDepositAccountsAccountIdResponse minDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @ApiModelProperty(example = "3", value = "")
  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }

  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }

  public GetFixedDepositAccountsAccountIdResponse maxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
    return this;
  }

   /**
   * Get maxDepositTerm
   * @return maxDepositTerm
  **/
  @ApiModelProperty(example = "4", value = "")
  public Integer getMaxDepositTerm() {
    return maxDepositTerm;
  }

  public void setMaxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
  }

  public GetFixedDepositAccountsAccountIdResponse minDepositTermType(GetFixedDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
    return this;
  }

   /**
   * Get minDepositTermType
   * @return minDepositTermType
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsMinDepositTermType getMinDepositTermType() {
    return minDepositTermType;
  }

  public void setMinDepositTermType(GetFixedDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
  }

  public GetFixedDepositAccountsAccountIdResponse maxDepositTermType(GetFixedDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
    return this;
  }

   /**
   * Get maxDepositTermType
   * @return maxDepositTermType
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsMaxDepositTermType getMaxDepositTermType() {
    return maxDepositTermType;
  }

  public void setMaxDepositTermType(GetFixedDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
  }

  public GetFixedDepositAccountsAccountIdResponse depositAmount(Float depositAmount) {
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * Get depositAmount
   * @return depositAmount
  **/
  @ApiModelProperty(example = "5000.0", value = "")
  public Float getDepositAmount() {
    return depositAmount;
  }

  public void setDepositAmount(Float depositAmount) {
    this.depositAmount = depositAmount;
  }

  public GetFixedDepositAccountsAccountIdResponse maturityAmount(Float maturityAmount) {
    this.maturityAmount = maturityAmount;
    return this;
  }

   /**
   * Get maturityAmount
   * @return maturityAmount
  **/
  @ApiModelProperty(example = "5140.25", value = "")
  public Float getMaturityAmount() {
    return maturityAmount;
  }

  public void setMaturityAmount(Float maturityAmount) {
    this.maturityAmount = maturityAmount;
  }

  public GetFixedDepositAccountsAccountIdResponse maturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Get maturityDate
   * @return maturityDate
  **/
  @ApiModelProperty(example = "[2014, 9, 1]", value = "")
  public LocalDate getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }

  public GetFixedDepositAccountsAccountIdResponse depositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
    return this;
  }

   /**
   * Get depositPeriod
   * @return depositPeriod
  **/
  @ApiModelProperty(example = "6", value = "")
  public Integer getDepositPeriod() {
    return depositPeriod;
  }

  public void setDepositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
  }

  public GetFixedDepositAccountsAccountIdResponse depositPeriodFrequency(GetFixedDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
    return this;
  }

   /**
   * Get depositPeriodFrequency
   * @return depositPeriodFrequency
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsDepositPeriodFrequency getDepositPeriodFrequency() {
    return depositPeriodFrequency;
  }

  public void setDepositPeriodFrequency(GetFixedDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
  }

  public GetFixedDepositAccountsAccountIdResponse summary(GetFixedDepositAccountsAccountIdSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsAccountIdSummary getSummary() {
    return summary;
  }

  public void setSummary(GetFixedDepositAccountsAccountIdSummary summary) {
    this.summary = summary;
  }

  public GetFixedDepositAccountsAccountIdResponse accountChart(GetFixedDepositAccountsAccountChart accountChart) {
    this.accountChart = accountChart;
    return this;
  }

   /**
   * Get accountChart
   * @return accountChart
  **/
  @ApiModelProperty(value = "")
  public GetFixedDepositAccountsAccountChart getAccountChart() {
    return accountChart;
  }

  public void setAccountChart(GetFixedDepositAccountsAccountChart accountChart) {
    this.accountChart = accountChart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFixedDepositAccountsAccountIdResponse getFixedDepositAccountsAccountIdResponse = (GetFixedDepositAccountsAccountIdResponse) o;
    return Objects.equals(this.id, getFixedDepositAccountsAccountIdResponse.id) &&
        Objects.equals(this.accountNo, getFixedDepositAccountsAccountIdResponse.accountNo) &&
        Objects.equals(this.externalId, getFixedDepositAccountsAccountIdResponse.externalId) &&
        Objects.equals(this.clientId, getFixedDepositAccountsAccountIdResponse.clientId) &&
        Objects.equals(this.clientName, getFixedDepositAccountsAccountIdResponse.clientName) &&
        Objects.equals(this.savingsProductId, getFixedDepositAccountsAccountIdResponse.savingsProductId) &&
        Objects.equals(this.savingsProductName, getFixedDepositAccountsAccountIdResponse.savingsProductName) &&
        Objects.equals(this.fieldOfficerId, getFixedDepositAccountsAccountIdResponse.fieldOfficerId) &&
        Objects.equals(this.status, getFixedDepositAccountsAccountIdResponse.status) &&
        Objects.equals(this.timeline, getFixedDepositAccountsAccountIdResponse.timeline) &&
        Objects.equals(this.currency, getFixedDepositAccountsAccountIdResponse.currency) &&
        Objects.equals(this.interestCompoundingPeriodType, getFixedDepositAccountsAccountIdResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getFixedDepositAccountsAccountIdResponse.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getFixedDepositAccountsAccountIdResponse.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getFixedDepositAccountsAccountIdResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.interestFreePeriodApplicable, getFixedDepositAccountsAccountIdResponse.interestFreePeriodApplicable) &&
        Objects.equals(this.preClosurePenalApplicable, getFixedDepositAccountsAccountIdResponse.preClosurePenalApplicable) &&
        Objects.equals(this.minDepositTerm, getFixedDepositAccountsAccountIdResponse.minDepositTerm) &&
        Objects.equals(this.maxDepositTerm, getFixedDepositAccountsAccountIdResponse.maxDepositTerm) &&
        Objects.equals(this.minDepositTermType, getFixedDepositAccountsAccountIdResponse.minDepositTermType) &&
        Objects.equals(this.maxDepositTermType, getFixedDepositAccountsAccountIdResponse.maxDepositTermType) &&
        Objects.equals(this.depositAmount, getFixedDepositAccountsAccountIdResponse.depositAmount) &&
        Objects.equals(this.maturityAmount, getFixedDepositAccountsAccountIdResponse.maturityAmount) &&
        Objects.equals(this.maturityDate, getFixedDepositAccountsAccountIdResponse.maturityDate) &&
        Objects.equals(this.depositPeriod, getFixedDepositAccountsAccountIdResponse.depositPeriod) &&
        Objects.equals(this.depositPeriodFrequency, getFixedDepositAccountsAccountIdResponse.depositPeriodFrequency) &&
        Objects.equals(this.summary, getFixedDepositAccountsAccountIdResponse.summary) &&
        Objects.equals(this.accountChart, getFixedDepositAccountsAccountIdResponse.accountChart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, externalId, clientId, clientName, savingsProductId, savingsProductName, fieldOfficerId, status, timeline, currency, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, interestFreePeriodApplicable, preClosurePenalApplicable, minDepositTerm, maxDepositTerm, minDepositTermType, maxDepositTermType, depositAmount, maturityAmount, maturityDate, depositPeriod, depositPeriodFrequency, summary, accountChart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFixedDepositAccountsAccountIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    fieldOfficerId: ").append(toIndentedString(fieldOfficerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    interestFreePeriodApplicable: ").append(toIndentedString(interestFreePeriodApplicable)).append("\n");
    sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
    sb.append("    minDepositTermType: ").append(toIndentedString(minDepositTermType)).append("\n");
    sb.append("    maxDepositTermType: ").append(toIndentedString(maxDepositTermType)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    maturityAmount: ").append(toIndentedString(maturityAmount)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    depositPeriod: ").append(toIndentedString(depositPeriod)).append("\n");
    sb.append("    depositPeriodFrequency: ").append(toIndentedString(depositPeriodFrequency)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    accountChart: ").append(toIndentedString(accountChart)).append("\n");
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


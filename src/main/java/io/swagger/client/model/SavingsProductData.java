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
import io.swagger.client.model.CurrencyData;
import io.swagger.client.model.EnumOptionData;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * SavingsProductData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class SavingsProductData {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("currency")
  private CurrencyData currency = null;

  @SerializedName("nominalAnnualInterestRate")
  private BigDecimal nominalAnnualInterestRate = null;

  @SerializedName("interestCompoundingPeriodType")
  private EnumOptionData interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private EnumOptionData interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private EnumOptionData interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private EnumOptionData interestCalculationDaysInYearType = null;

  @SerializedName("minRequiredOpeningBalance")
  private BigDecimal minRequiredOpeningBalance = null;

  @SerializedName("lockinPeriodFrequency")
  private Integer lockinPeriodFrequency = null;

  @SerializedName("lockinPeriodFrequencyType")
  private EnumOptionData lockinPeriodFrequencyType = null;

  @SerializedName("withdrawalFeeForTransfers")
  private Boolean withdrawalFeeForTransfers = null;

  @SerializedName("allowOverdraft")
  private Boolean allowOverdraft = null;

  @SerializedName("overdraftLimit")
  private BigDecimal overdraftLimit = null;

  @SerializedName("minRequiredBalance")
  private BigDecimal minRequiredBalance = null;

  @SerializedName("depositAccountType")
  private String depositAccountType = null;

  public SavingsProductData id(Long id) {
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

  public SavingsProductData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SavingsProductData currency(CurrencyData currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public CurrencyData getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyData currency) {
    this.currency = currency;
  }

  public SavingsProductData nominalAnnualInterestRate(BigDecimal nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
    return this;
  }

   /**
   * Get nominalAnnualInterestRate
   * @return nominalAnnualInterestRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getNominalAnnualInterestRate() {
    return nominalAnnualInterestRate;
  }

  public void setNominalAnnualInterestRate(BigDecimal nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
  }

  public SavingsProductData interestCompoundingPeriodType(EnumOptionData interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(EnumOptionData interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public SavingsProductData interestPostingPeriodType(EnumOptionData interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(EnumOptionData interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public SavingsProductData interestCalculationType(EnumOptionData interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(EnumOptionData interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public SavingsProductData interestCalculationDaysInYearType(EnumOptionData interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(EnumOptionData interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public SavingsProductData minRequiredOpeningBalance(BigDecimal minRequiredOpeningBalance) {
    this.minRequiredOpeningBalance = minRequiredOpeningBalance;
    return this;
  }

   /**
   * Get minRequiredOpeningBalance
   * @return minRequiredOpeningBalance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinRequiredOpeningBalance() {
    return minRequiredOpeningBalance;
  }

  public void setMinRequiredOpeningBalance(BigDecimal minRequiredOpeningBalance) {
    this.minRequiredOpeningBalance = minRequiredOpeningBalance;
  }

  public SavingsProductData lockinPeriodFrequency(Integer lockinPeriodFrequency) {
    this.lockinPeriodFrequency = lockinPeriodFrequency;
    return this;
  }

   /**
   * Get lockinPeriodFrequency
   * @return lockinPeriodFrequency
  **/
  @ApiModelProperty(value = "")
  public Integer getLockinPeriodFrequency() {
    return lockinPeriodFrequency;
  }

  public void setLockinPeriodFrequency(Integer lockinPeriodFrequency) {
    this.lockinPeriodFrequency = lockinPeriodFrequency;
  }

  public SavingsProductData lockinPeriodFrequencyType(EnumOptionData lockinPeriodFrequencyType) {
    this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
    return this;
  }

   /**
   * Get lockinPeriodFrequencyType
   * @return lockinPeriodFrequencyType
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getLockinPeriodFrequencyType() {
    return lockinPeriodFrequencyType;
  }

  public void setLockinPeriodFrequencyType(EnumOptionData lockinPeriodFrequencyType) {
    this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
  }

  public SavingsProductData withdrawalFeeForTransfers(Boolean withdrawalFeeForTransfers) {
    this.withdrawalFeeForTransfers = withdrawalFeeForTransfers;
    return this;
  }

   /**
   * Get withdrawalFeeForTransfers
   * @return withdrawalFeeForTransfers
  **/
  @ApiModelProperty(value = "")
  public Boolean isWithdrawalFeeForTransfers() {
    return withdrawalFeeForTransfers;
  }

  public void setWithdrawalFeeForTransfers(Boolean withdrawalFeeForTransfers) {
    this.withdrawalFeeForTransfers = withdrawalFeeForTransfers;
  }

  public SavingsProductData allowOverdraft(Boolean allowOverdraft) {
    this.allowOverdraft = allowOverdraft;
    return this;
  }

   /**
   * Get allowOverdraft
   * @return allowOverdraft
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowOverdraft() {
    return allowOverdraft;
  }

  public void setAllowOverdraft(Boolean allowOverdraft) {
    this.allowOverdraft = allowOverdraft;
  }

  public SavingsProductData overdraftLimit(BigDecimal overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
    return this;
  }

   /**
   * Get overdraftLimit
   * @return overdraftLimit
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOverdraftLimit() {
    return overdraftLimit;
  }

  public void setOverdraftLimit(BigDecimal overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  public SavingsProductData minRequiredBalance(BigDecimal minRequiredBalance) {
    this.minRequiredBalance = minRequiredBalance;
    return this;
  }

   /**
   * Get minRequiredBalance
   * @return minRequiredBalance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinRequiredBalance() {
    return minRequiredBalance;
  }

  public void setMinRequiredBalance(BigDecimal minRequiredBalance) {
    this.minRequiredBalance = minRequiredBalance;
  }

  public SavingsProductData depositAccountType(String depositAccountType) {
    this.depositAccountType = depositAccountType;
    return this;
  }

   /**
   * Get depositAccountType
   * @return depositAccountType
  **/
  @ApiModelProperty(value = "")
  public String getDepositAccountType() {
    return depositAccountType;
  }

  public void setDepositAccountType(String depositAccountType) {
    this.depositAccountType = depositAccountType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingsProductData savingsProductData = (SavingsProductData) o;
    return Objects.equals(this.id, savingsProductData.id) &&
        Objects.equals(this.name, savingsProductData.name) &&
        Objects.equals(this.currency, savingsProductData.currency) &&
        Objects.equals(this.nominalAnnualInterestRate, savingsProductData.nominalAnnualInterestRate) &&
        Objects.equals(this.interestCompoundingPeriodType, savingsProductData.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, savingsProductData.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, savingsProductData.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, savingsProductData.interestCalculationDaysInYearType) &&
        Objects.equals(this.minRequiredOpeningBalance, savingsProductData.minRequiredOpeningBalance) &&
        Objects.equals(this.lockinPeriodFrequency, savingsProductData.lockinPeriodFrequency) &&
        Objects.equals(this.lockinPeriodFrequencyType, savingsProductData.lockinPeriodFrequencyType) &&
        Objects.equals(this.withdrawalFeeForTransfers, savingsProductData.withdrawalFeeForTransfers) &&
        Objects.equals(this.allowOverdraft, savingsProductData.allowOverdraft) &&
        Objects.equals(this.overdraftLimit, savingsProductData.overdraftLimit) &&
        Objects.equals(this.minRequiredBalance, savingsProductData.minRequiredBalance) &&
        Objects.equals(this.depositAccountType, savingsProductData.depositAccountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, currency, nominalAnnualInterestRate, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, allowOverdraft, overdraftLimit, minRequiredBalance, depositAccountType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingsProductData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nominalAnnualInterestRate: ").append(toIndentedString(nominalAnnualInterestRate)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    minRequiredOpeningBalance: ").append(toIndentedString(minRequiredOpeningBalance)).append("\n");
    sb.append("    lockinPeriodFrequency: ").append(toIndentedString(lockinPeriodFrequency)).append("\n");
    sb.append("    lockinPeriodFrequencyType: ").append(toIndentedString(lockinPeriodFrequencyType)).append("\n");
    sb.append("    withdrawalFeeForTransfers: ").append(toIndentedString(withdrawalFeeForTransfers)).append("\n");
    sb.append("    allowOverdraft: ").append(toIndentedString(allowOverdraft)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
    sb.append("    minRequiredBalance: ").append(toIndentedString(minRequiredBalance)).append("\n");
    sb.append("    depositAccountType: ").append(toIndentedString(depositAccountType)).append("\n");
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

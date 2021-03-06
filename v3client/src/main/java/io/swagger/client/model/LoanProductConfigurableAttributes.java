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
import io.swagger.client.model.LoanProduct;
import java.io.IOException;

/**
 * LoanProductConfigurableAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class LoanProductConfigurableAttributes {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("loanProduct")
  private LoanProduct loanProduct = null;

  @SerializedName("amortizationBoolean")
  private Boolean amortizationBoolean = null;

  @SerializedName("interestMethodBoolean")
  private Boolean interestMethodBoolean = null;

  @SerializedName("transactionProcessingStrategyBoolean")
  private Boolean transactionProcessingStrategyBoolean = null;

  @SerializedName("interestCalcPeriodBoolean")
  private Boolean interestCalcPeriodBoolean = null;

  @SerializedName("arrearsToleranceBoolean")
  private Boolean arrearsToleranceBoolean = null;

  @SerializedName("repaymentEveryBoolean")
  private Boolean repaymentEveryBoolean = null;

  @SerializedName("graceOnPrincipalAndInterestPaymentBoolean")
  private Boolean graceOnPrincipalAndInterestPaymentBoolean = null;

  @SerializedName("graceOnArrearsAgingBoolean")
  private Boolean graceOnArrearsAgingBoolean = null;

  @SerializedName("new")
  private Boolean _new = null;

  public LoanProductConfigurableAttributes id(Long id) {
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

  public LoanProductConfigurableAttributes loanProduct(LoanProduct loanProduct) {
    this.loanProduct = loanProduct;
    return this;
  }

   /**
   * Get loanProduct
   * @return loanProduct
  **/
  @ApiModelProperty(value = "")
  public LoanProduct getLoanProduct() {
    return loanProduct;
  }

  public void setLoanProduct(LoanProduct loanProduct) {
    this.loanProduct = loanProduct;
  }

  public LoanProductConfigurableAttributes amortizationBoolean(Boolean amortizationBoolean) {
    this.amortizationBoolean = amortizationBoolean;
    return this;
  }

   /**
   * Get amortizationBoolean
   * @return amortizationBoolean
  **/
  @ApiModelProperty(value = "")
  public Boolean isAmortizationBoolean() {
    return amortizationBoolean;
  }

  public void setAmortizationBoolean(Boolean amortizationBoolean) {
    this.amortizationBoolean = amortizationBoolean;
  }

  public LoanProductConfigurableAttributes interestMethodBoolean(Boolean interestMethodBoolean) {
    this.interestMethodBoolean = interestMethodBoolean;
    return this;
  }

   /**
   * Get interestMethodBoolean
   * @return interestMethodBoolean
  **/
  @ApiModelProperty(value = "")
  public Boolean isInterestMethodBoolean() {
    return interestMethodBoolean;
  }

  public void setInterestMethodBoolean(Boolean interestMethodBoolean) {
    this.interestMethodBoolean = interestMethodBoolean;
  }

  public LoanProductConfigurableAttributes transactionProcessingStrategyBoolean(Boolean transactionProcessingStrategyBoolean) {
    this.transactionProcessingStrategyBoolean = transactionProcessingStrategyBoolean;
    return this;
  }

   /**
   * Get transactionProcessingStrategyBoolean
   * @return transactionProcessingStrategyBoolean
  **/
  @ApiModelProperty(value = "")
  public Boolean isTransactionProcessingStrategyBoolean() {
    return transactionProcessingStrategyBoolean;
  }

  public void setTransactionProcessingStrategyBoolean(Boolean transactionProcessingStrategyBoolean) {
    this.transactionProcessingStrategyBoolean = transactionProcessingStrategyBoolean;
  }

  public LoanProductConfigurableAttributes interestCalcPeriodBoolean(Boolean interestCalcPeriodBoolean) {
    this.interestCalcPeriodBoolean = interestCalcPeriodBoolean;
    return this;
  }

   /**
   * Get interestCalcPeriodBoolean
   * @return interestCalcPeriodBoolean
  **/
  @ApiModelProperty(value = "")
  public Boolean isInterestCalcPeriodBoolean() {
    return interestCalcPeriodBoolean;
  }

  public void setInterestCalcPeriodBoolean(Boolean interestCalcPeriodBoolean) {
    this.interestCalcPeriodBoolean = interestCalcPeriodBoolean;
  }

  public LoanProductConfigurableAttributes arrearsToleranceBoolean(Boolean arrearsToleranceBoolean) {
    this.arrearsToleranceBoolean = arrearsToleranceBoolean;
    return this;
  }

   /**
   * Get arrearsToleranceBoolean
   * @return arrearsToleranceBoolean
  **/
  @ApiModelProperty(value = "")
  public Boolean isArrearsToleranceBoolean() {
    return arrearsToleranceBoolean;
  }

  public void setArrearsToleranceBoolean(Boolean arrearsToleranceBoolean) {
    this.arrearsToleranceBoolean = arrearsToleranceBoolean;
  }

  public LoanProductConfigurableAttributes repaymentEveryBoolean(Boolean repaymentEveryBoolean) {
    this.repaymentEveryBoolean = repaymentEveryBoolean;
    return this;
  }

   /**
   * Get repaymentEveryBoolean
   * @return repaymentEveryBoolean
  **/
  @ApiModelProperty(value = "")
  public Boolean isRepaymentEveryBoolean() {
    return repaymentEveryBoolean;
  }

  public void setRepaymentEveryBoolean(Boolean repaymentEveryBoolean) {
    this.repaymentEveryBoolean = repaymentEveryBoolean;
  }

  public LoanProductConfigurableAttributes graceOnPrincipalAndInterestPaymentBoolean(Boolean graceOnPrincipalAndInterestPaymentBoolean) {
    this.graceOnPrincipalAndInterestPaymentBoolean = graceOnPrincipalAndInterestPaymentBoolean;
    return this;
  }

   /**
   * Get graceOnPrincipalAndInterestPaymentBoolean
   * @return graceOnPrincipalAndInterestPaymentBoolean
  **/
  @ApiModelProperty(value = "")
  public Boolean isGraceOnPrincipalAndInterestPaymentBoolean() {
    return graceOnPrincipalAndInterestPaymentBoolean;
  }

  public void setGraceOnPrincipalAndInterestPaymentBoolean(Boolean graceOnPrincipalAndInterestPaymentBoolean) {
    this.graceOnPrincipalAndInterestPaymentBoolean = graceOnPrincipalAndInterestPaymentBoolean;
  }

  public LoanProductConfigurableAttributes graceOnArrearsAgingBoolean(Boolean graceOnArrearsAgingBoolean) {
    this.graceOnArrearsAgingBoolean = graceOnArrearsAgingBoolean;
    return this;
  }

   /**
   * Get graceOnArrearsAgingBoolean
   * @return graceOnArrearsAgingBoolean
  **/
  @ApiModelProperty(value = "")
  public Boolean isGraceOnArrearsAgingBoolean() {
    return graceOnArrearsAgingBoolean;
  }

  public void setGraceOnArrearsAgingBoolean(Boolean graceOnArrearsAgingBoolean) {
    this.graceOnArrearsAgingBoolean = graceOnArrearsAgingBoolean;
  }

  public LoanProductConfigurableAttributes _new(Boolean _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @ApiModelProperty(value = "")
  public Boolean isNew() {
    return _new;
  }

  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProductConfigurableAttributes loanProductConfigurableAttributes = (LoanProductConfigurableAttributes) o;
    return Objects.equals(this.id, loanProductConfigurableAttributes.id) &&
        Objects.equals(this.loanProduct, loanProductConfigurableAttributes.loanProduct) &&
        Objects.equals(this.amortizationBoolean, loanProductConfigurableAttributes.amortizationBoolean) &&
        Objects.equals(this.interestMethodBoolean, loanProductConfigurableAttributes.interestMethodBoolean) &&
        Objects.equals(this.transactionProcessingStrategyBoolean, loanProductConfigurableAttributes.transactionProcessingStrategyBoolean) &&
        Objects.equals(this.interestCalcPeriodBoolean, loanProductConfigurableAttributes.interestCalcPeriodBoolean) &&
        Objects.equals(this.arrearsToleranceBoolean, loanProductConfigurableAttributes.arrearsToleranceBoolean) &&
        Objects.equals(this.repaymentEveryBoolean, loanProductConfigurableAttributes.repaymentEveryBoolean) &&
        Objects.equals(this.graceOnPrincipalAndInterestPaymentBoolean, loanProductConfigurableAttributes.graceOnPrincipalAndInterestPaymentBoolean) &&
        Objects.equals(this.graceOnArrearsAgingBoolean, loanProductConfigurableAttributes.graceOnArrearsAgingBoolean) &&
        Objects.equals(this._new, loanProductConfigurableAttributes._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, loanProduct, amortizationBoolean, interestMethodBoolean, transactionProcessingStrategyBoolean, interestCalcPeriodBoolean, arrearsToleranceBoolean, repaymentEveryBoolean, graceOnPrincipalAndInterestPaymentBoolean, graceOnArrearsAgingBoolean, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProductConfigurableAttributes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loanProduct: ").append(toIndentedString(loanProduct)).append("\n");
    sb.append("    amortizationBoolean: ").append(toIndentedString(amortizationBoolean)).append("\n");
    sb.append("    interestMethodBoolean: ").append(toIndentedString(interestMethodBoolean)).append("\n");
    sb.append("    transactionProcessingStrategyBoolean: ").append(toIndentedString(transactionProcessingStrategyBoolean)).append("\n");
    sb.append("    interestCalcPeriodBoolean: ").append(toIndentedString(interestCalcPeriodBoolean)).append("\n");
    sb.append("    arrearsToleranceBoolean: ").append(toIndentedString(arrearsToleranceBoolean)).append("\n");
    sb.append("    repaymentEveryBoolean: ").append(toIndentedString(repaymentEveryBoolean)).append("\n");
    sb.append("    graceOnPrincipalAndInterestPaymentBoolean: ").append(toIndentedString(graceOnPrincipalAndInterestPaymentBoolean)).append("\n");
    sb.append("    graceOnArrearsAgingBoolean: ").append(toIndentedString(graceOnArrearsAgingBoolean)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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


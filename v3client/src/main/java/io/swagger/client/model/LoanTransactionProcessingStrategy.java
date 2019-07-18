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

/**
 * LoanTransactionProcessingStrategy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class LoanTransactionProcessingStrategy {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("standardStrategy")
  private Boolean standardStrategy = null;

  @SerializedName("heavensfamilyStrategy")
  private Boolean heavensfamilyStrategy = null;

  @SerializedName("earlyPaymentStrategy")
  private Boolean earlyPaymentStrategy = null;

  @SerializedName("creocoreStrategy")
  private Boolean creocoreStrategy = null;

  @SerializedName("indianRBIStrategy")
  private Boolean indianRBIStrategy = null;

  @SerializedName("principalInterestPenaltiesFeesOrderStrategy")
  private Boolean principalInterestPenaltiesFeesOrderStrategy = null;

  @SerializedName("interestPrincipalPenaltiesFeesOrderStrategy")
  private Boolean interestPrincipalPenaltiesFeesOrderStrategy = null;

  @SerializedName("new")
  private Boolean _new = null;

  public LoanTransactionProcessingStrategy id(Long id) {
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

  public LoanTransactionProcessingStrategy standardStrategy(Boolean standardStrategy) {
    this.standardStrategy = standardStrategy;
    return this;
  }

   /**
   * Get standardStrategy
   * @return standardStrategy
  **/
  @ApiModelProperty(value = "")
  public Boolean isStandardStrategy() {
    return standardStrategy;
  }

  public void setStandardStrategy(Boolean standardStrategy) {
    this.standardStrategy = standardStrategy;
  }

  public LoanTransactionProcessingStrategy heavensfamilyStrategy(Boolean heavensfamilyStrategy) {
    this.heavensfamilyStrategy = heavensfamilyStrategy;
    return this;
  }

   /**
   * Get heavensfamilyStrategy
   * @return heavensfamilyStrategy
  **/
  @ApiModelProperty(value = "")
  public Boolean isHeavensfamilyStrategy() {
    return heavensfamilyStrategy;
  }

  public void setHeavensfamilyStrategy(Boolean heavensfamilyStrategy) {
    this.heavensfamilyStrategy = heavensfamilyStrategy;
  }

  public LoanTransactionProcessingStrategy earlyPaymentStrategy(Boolean earlyPaymentStrategy) {
    this.earlyPaymentStrategy = earlyPaymentStrategy;
    return this;
  }

   /**
   * Get earlyPaymentStrategy
   * @return earlyPaymentStrategy
  **/
  @ApiModelProperty(value = "")
  public Boolean isEarlyPaymentStrategy() {
    return earlyPaymentStrategy;
  }

  public void setEarlyPaymentStrategy(Boolean earlyPaymentStrategy) {
    this.earlyPaymentStrategy = earlyPaymentStrategy;
  }

  public LoanTransactionProcessingStrategy creocoreStrategy(Boolean creocoreStrategy) {
    this.creocoreStrategy = creocoreStrategy;
    return this;
  }

   /**
   * Get creocoreStrategy
   * @return creocoreStrategy
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreocoreStrategy() {
    return creocoreStrategy;
  }

  public void setCreocoreStrategy(Boolean creocoreStrategy) {
    this.creocoreStrategy = creocoreStrategy;
  }

  public LoanTransactionProcessingStrategy indianRBIStrategy(Boolean indianRBIStrategy) {
    this.indianRBIStrategy = indianRBIStrategy;
    return this;
  }

   /**
   * Get indianRBIStrategy
   * @return indianRBIStrategy
  **/
  @ApiModelProperty(value = "")
  public Boolean isIndianRBIStrategy() {
    return indianRBIStrategy;
  }

  public void setIndianRBIStrategy(Boolean indianRBIStrategy) {
    this.indianRBIStrategy = indianRBIStrategy;
  }

  public LoanTransactionProcessingStrategy principalInterestPenaltiesFeesOrderStrategy(Boolean principalInterestPenaltiesFeesOrderStrategy) {
    this.principalInterestPenaltiesFeesOrderStrategy = principalInterestPenaltiesFeesOrderStrategy;
    return this;
  }

   /**
   * Get principalInterestPenaltiesFeesOrderStrategy
   * @return principalInterestPenaltiesFeesOrderStrategy
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrincipalInterestPenaltiesFeesOrderStrategy() {
    return principalInterestPenaltiesFeesOrderStrategy;
  }

  public void setPrincipalInterestPenaltiesFeesOrderStrategy(Boolean principalInterestPenaltiesFeesOrderStrategy) {
    this.principalInterestPenaltiesFeesOrderStrategy = principalInterestPenaltiesFeesOrderStrategy;
  }

  public LoanTransactionProcessingStrategy interestPrincipalPenaltiesFeesOrderStrategy(Boolean interestPrincipalPenaltiesFeesOrderStrategy) {
    this.interestPrincipalPenaltiesFeesOrderStrategy = interestPrincipalPenaltiesFeesOrderStrategy;
    return this;
  }

   /**
   * Get interestPrincipalPenaltiesFeesOrderStrategy
   * @return interestPrincipalPenaltiesFeesOrderStrategy
  **/
  @ApiModelProperty(value = "")
  public Boolean isInterestPrincipalPenaltiesFeesOrderStrategy() {
    return interestPrincipalPenaltiesFeesOrderStrategy;
  }

  public void setInterestPrincipalPenaltiesFeesOrderStrategy(Boolean interestPrincipalPenaltiesFeesOrderStrategy) {
    this.interestPrincipalPenaltiesFeesOrderStrategy = interestPrincipalPenaltiesFeesOrderStrategy;
  }

  public LoanTransactionProcessingStrategy _new(Boolean _new) {
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
    LoanTransactionProcessingStrategy loanTransactionProcessingStrategy = (LoanTransactionProcessingStrategy) o;
    return Objects.equals(this.id, loanTransactionProcessingStrategy.id) &&
        Objects.equals(this.standardStrategy, loanTransactionProcessingStrategy.standardStrategy) &&
        Objects.equals(this.heavensfamilyStrategy, loanTransactionProcessingStrategy.heavensfamilyStrategy) &&
        Objects.equals(this.earlyPaymentStrategy, loanTransactionProcessingStrategy.earlyPaymentStrategy) &&
        Objects.equals(this.creocoreStrategy, loanTransactionProcessingStrategy.creocoreStrategy) &&
        Objects.equals(this.indianRBIStrategy, loanTransactionProcessingStrategy.indianRBIStrategy) &&
        Objects.equals(this.principalInterestPenaltiesFeesOrderStrategy, loanTransactionProcessingStrategy.principalInterestPenaltiesFeesOrderStrategy) &&
        Objects.equals(this.interestPrincipalPenaltiesFeesOrderStrategy, loanTransactionProcessingStrategy.interestPrincipalPenaltiesFeesOrderStrategy) &&
        Objects.equals(this._new, loanTransactionProcessingStrategy._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, standardStrategy, heavensfamilyStrategy, earlyPaymentStrategy, creocoreStrategy, indianRBIStrategy, principalInterestPenaltiesFeesOrderStrategy, interestPrincipalPenaltiesFeesOrderStrategy, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanTransactionProcessingStrategy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    standardStrategy: ").append(toIndentedString(standardStrategy)).append("\n");
    sb.append("    heavensfamilyStrategy: ").append(toIndentedString(heavensfamilyStrategy)).append("\n");
    sb.append("    earlyPaymentStrategy: ").append(toIndentedString(earlyPaymentStrategy)).append("\n");
    sb.append("    creocoreStrategy: ").append(toIndentedString(creocoreStrategy)).append("\n");
    sb.append("    indianRBIStrategy: ").append(toIndentedString(indianRBIStrategy)).append("\n");
    sb.append("    principalInterestPenaltiesFeesOrderStrategy: ").append(toIndentedString(principalInterestPenaltiesFeesOrderStrategy)).append("\n");
    sb.append("    interestPrincipalPenaltiesFeesOrderStrategy: ").append(toIndentedString(interestPrincipalPenaltiesFeesOrderStrategy)).append("\n");
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

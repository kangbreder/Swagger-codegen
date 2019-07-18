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
import io.swagger.client.model.GetLoanCurrency;
import io.swagger.client.model.GetSelfLoansLoanIdTransactionsType;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetSelfLoansLoanIdTransactionsTransactionIdResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetSelfLoansLoanIdTransactionsTransactionIdResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("type")
  private GetSelfLoansLoanIdTransactionsType type = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("manuallyReversed")
  private Boolean manuallyReversed = null;

  @SerializedName("currency")
  private GetLoanCurrency currency = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("interestPortion")
  private Float interestPortion = null;

  public GetSelfLoansLoanIdTransactionsTransactionIdResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "3", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetSelfLoansLoanIdTransactionsTransactionIdResponse type(GetSelfLoansLoanIdTransactionsType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public GetSelfLoansLoanIdTransactionsType getType() {
    return type;
  }

  public void setType(GetSelfLoansLoanIdTransactionsType type) {
    this.type = type;
  }

  public GetSelfLoansLoanIdTransactionsTransactionIdResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "[2012, 5, 14]", value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GetSelfLoansLoanIdTransactionsTransactionIdResponse manuallyReversed(Boolean manuallyReversed) {
    this.manuallyReversed = manuallyReversed;
    return this;
  }

   /**
   * Get manuallyReversed
   * @return manuallyReversed
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isManuallyReversed() {
    return manuallyReversed;
  }

  public void setManuallyReversed(Boolean manuallyReversed) {
    this.manuallyReversed = manuallyReversed;
  }

  public GetSelfLoansLoanIdTransactionsTransactionIdResponse currency(GetLoanCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetLoanCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetLoanCurrency currency) {
    this.currency = currency;
  }

  public GetSelfLoansLoanIdTransactionsTransactionIdResponse amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "559.88", value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetSelfLoansLoanIdTransactionsTransactionIdResponse interestPortion(Float interestPortion) {
    this.interestPortion = interestPortion;
    return this;
  }

   /**
   * Get interestPortion
   * @return interestPortion
  **/
  @ApiModelProperty(example = "559.88", value = "")
  public Float getInterestPortion() {
    return interestPortion;
  }

  public void setInterestPortion(Float interestPortion) {
    this.interestPortion = interestPortion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelfLoansLoanIdTransactionsTransactionIdResponse getSelfLoansLoanIdTransactionsTransactionIdResponse = (GetSelfLoansLoanIdTransactionsTransactionIdResponse) o;
    return Objects.equals(this.id, getSelfLoansLoanIdTransactionsTransactionIdResponse.id) &&
        Objects.equals(this.type, getSelfLoansLoanIdTransactionsTransactionIdResponse.type) &&
        Objects.equals(this.date, getSelfLoansLoanIdTransactionsTransactionIdResponse.date) &&
        Objects.equals(this.manuallyReversed, getSelfLoansLoanIdTransactionsTransactionIdResponse.manuallyReversed) &&
        Objects.equals(this.currency, getSelfLoansLoanIdTransactionsTransactionIdResponse.currency) &&
        Objects.equals(this.amount, getSelfLoansLoanIdTransactionsTransactionIdResponse.amount) &&
        Objects.equals(this.interestPortion, getSelfLoansLoanIdTransactionsTransactionIdResponse.interestPortion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, date, manuallyReversed, currency, amount, interestPortion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelfLoansLoanIdTransactionsTransactionIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    manuallyReversed: ").append(toIndentedString(manuallyReversed)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    interestPortion: ").append(toIndentedString(interestPortion)).append("\n");
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


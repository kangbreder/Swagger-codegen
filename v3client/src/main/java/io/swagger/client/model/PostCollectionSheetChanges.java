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
import java.util.ArrayList;
import java.util.List;

/**
 * PostCollectionSheetChanges
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class PostCollectionSheetChanges {
  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("loanTransactions")
  private List<Integer> loanTransactions = null;

  @SerializedName("SavingsTransactions")
  private List<Integer> savingsTransactions = null;

  public PostCollectionSheetChanges locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "en", value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostCollectionSheetChanges dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @ApiModelProperty(example = "dd MMMM yyyy", value = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostCollectionSheetChanges loanTransactions(List<Integer> loanTransactions) {
    this.loanTransactions = loanTransactions;
    return this;
  }

  public PostCollectionSheetChanges addLoanTransactionsItem(Integer loanTransactionsItem) {
    if (this.loanTransactions == null) {
      this.loanTransactions = new ArrayList<Integer>();
    }
    this.loanTransactions.add(loanTransactionsItem);
    return this;
  }

   /**
   * Get loanTransactions
   * @return loanTransactions
  **/
  @ApiModelProperty(example = "\"[15]\"", value = "")
  public List<Integer> getLoanTransactions() {
    return loanTransactions;
  }

  public void setLoanTransactions(List<Integer> loanTransactions) {
    this.loanTransactions = loanTransactions;
  }

  public PostCollectionSheetChanges savingsTransactions(List<Integer> savingsTransactions) {
    this.savingsTransactions = savingsTransactions;
    return this;
  }

  public PostCollectionSheetChanges addSavingsTransactionsItem(Integer savingsTransactionsItem) {
    if (this.savingsTransactions == null) {
      this.savingsTransactions = new ArrayList<Integer>();
    }
    this.savingsTransactions.add(savingsTransactionsItem);
    return this;
  }

   /**
   * Get savingsTransactions
   * @return savingsTransactions
  **/
  @ApiModelProperty(example = "\"[]\"", value = "")
  public List<Integer> getSavingsTransactions() {
    return savingsTransactions;
  }

  public void setSavingsTransactions(List<Integer> savingsTransactions) {
    this.savingsTransactions = savingsTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCollectionSheetChanges postCollectionSheetChanges = (PostCollectionSheetChanges) o;
    return Objects.equals(this.locale, postCollectionSheetChanges.locale) &&
        Objects.equals(this.dateFormat, postCollectionSheetChanges.dateFormat) &&
        Objects.equals(this.loanTransactions, postCollectionSheetChanges.loanTransactions) &&
        Objects.equals(this.savingsTransactions, postCollectionSheetChanges.savingsTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, dateFormat, loanTransactions, savingsTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCollectionSheetChanges {\n");
    
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    loanTransactions: ").append(toIndentedString(loanTransactions)).append("\n");
    sb.append("    savingsTransactions: ").append(toIndentedString(savingsTransactions)).append("\n");
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


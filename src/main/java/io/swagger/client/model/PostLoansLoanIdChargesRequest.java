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
 * PostLoansLoanIdChargesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class PostLoansLoanIdChargesRequest {
  @SerializedName("chargeId")
  private Integer chargeId = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("dueDate")
  private String dueDate = null;

  public PostLoansLoanIdChargesRequest chargeId(Integer chargeId) {
    this.chargeId = chargeId;
    return this;
  }

   /**
   * Get chargeId
   * @return chargeId
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getChargeId() {
    return chargeId;
  }

  public void setChargeId(Integer chargeId) {
    this.chargeId = chargeId;
  }

  public PostLoansLoanIdChargesRequest locale(String locale) {
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

  public PostLoansLoanIdChargesRequest amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "100.0", value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public PostLoansLoanIdChargesRequest dateFormat(String dateFormat) {
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

  public PostLoansLoanIdChargesRequest dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(example = "29 April 2013", value = "")
  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostLoansLoanIdChargesRequest postLoansLoanIdChargesRequest = (PostLoansLoanIdChargesRequest) o;
    return Objects.equals(this.chargeId, postLoansLoanIdChargesRequest.chargeId) &&
        Objects.equals(this.locale, postLoansLoanIdChargesRequest.locale) &&
        Objects.equals(this.amount, postLoansLoanIdChargesRequest.amount) &&
        Objects.equals(this.dateFormat, postLoansLoanIdChargesRequest.dateFormat) &&
        Objects.equals(this.dueDate, postLoansLoanIdChargesRequest.dueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeId, locale, amount, dateFormat, dueDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostLoansLoanIdChargesRequest {\n");
    
    sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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


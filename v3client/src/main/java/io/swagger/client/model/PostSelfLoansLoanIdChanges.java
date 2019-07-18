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
import io.swagger.client.model.PostSelfLoansLoanIdStatus;
import java.io.IOException;

/**
 * PostSelfLoansLoanIdChanges
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class PostSelfLoansLoanIdChanges {
  @SerializedName("status")
  private PostSelfLoansLoanIdStatus status = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("withdrawnOnDate")
  private String withdrawnOnDate = null;

  @SerializedName("closedOnDate")
  private String closedOnDate = null;

  public PostSelfLoansLoanIdChanges status(PostSelfLoansLoanIdStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public PostSelfLoansLoanIdStatus getStatus() {
    return status;
  }

  public void setStatus(PostSelfLoansLoanIdStatus status) {
    this.status = status;
  }

  public PostSelfLoansLoanIdChanges locale(String locale) {
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

  public PostSelfLoansLoanIdChanges dateFormat(String dateFormat) {
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

  public PostSelfLoansLoanIdChanges withdrawnOnDate(String withdrawnOnDate) {
    this.withdrawnOnDate = withdrawnOnDate;
    return this;
  }

   /**
   * Get withdrawnOnDate
   * @return withdrawnOnDate
  **/
  @ApiModelProperty(example = "20 September 2011", value = "")
  public String getWithdrawnOnDate() {
    return withdrawnOnDate;
  }

  public void setWithdrawnOnDate(String withdrawnOnDate) {
    this.withdrawnOnDate = withdrawnOnDate;
  }

  public PostSelfLoansLoanIdChanges closedOnDate(String closedOnDate) {
    this.closedOnDate = closedOnDate;
    return this;
  }

   /**
   * Get closedOnDate
   * @return closedOnDate
  **/
  @ApiModelProperty(example = "20 September 2011", value = "")
  public String getClosedOnDate() {
    return closedOnDate;
  }

  public void setClosedOnDate(String closedOnDate) {
    this.closedOnDate = closedOnDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSelfLoansLoanIdChanges postSelfLoansLoanIdChanges = (PostSelfLoansLoanIdChanges) o;
    return Objects.equals(this.status, postSelfLoansLoanIdChanges.status) &&
        Objects.equals(this.locale, postSelfLoansLoanIdChanges.locale) &&
        Objects.equals(this.dateFormat, postSelfLoansLoanIdChanges.dateFormat) &&
        Objects.equals(this.withdrawnOnDate, postSelfLoansLoanIdChanges.withdrawnOnDate) &&
        Objects.equals(this.closedOnDate, postSelfLoansLoanIdChanges.closedOnDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, locale, dateFormat, withdrawnOnDate, closedOnDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSelfLoansLoanIdChanges {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    withdrawnOnDate: ").append(toIndentedString(withdrawnOnDate)).append("\n");
    sb.append("    closedOnDate: ").append(toIndentedString(closedOnDate)).append("\n");
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


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
 * PostSavingsAccountsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class PostSavingsAccountsRequest {
  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("productId")
  private Integer productId = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("submittedOnDate")
  private String submittedOnDate = null;

  public PostSavingsAccountsRequest clientId(Integer clientId) {
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

  public PostSavingsAccountsRequest productId(Integer productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public PostSavingsAccountsRequest locale(String locale) {
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

  public PostSavingsAccountsRequest dateFormat(String dateFormat) {
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

  public PostSavingsAccountsRequest submittedOnDate(String submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @ApiModelProperty(example = "01 March 2011", value = "")
  public String getSubmittedOnDate() {
    return submittedOnDate;
  }

  public void setSubmittedOnDate(String submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSavingsAccountsRequest postSavingsAccountsRequest = (PostSavingsAccountsRequest) o;
    return Objects.equals(this.clientId, postSavingsAccountsRequest.clientId) &&
        Objects.equals(this.productId, postSavingsAccountsRequest.productId) &&
        Objects.equals(this.locale, postSavingsAccountsRequest.locale) &&
        Objects.equals(this.dateFormat, postSavingsAccountsRequest.dateFormat) &&
        Objects.equals(this.submittedOnDate, postSavingsAccountsRequest.submittedOnDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, productId, locale, dateFormat, submittedOnDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSavingsAccountsRequest {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
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


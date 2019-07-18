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
import io.swagger.client.model.PostHolidaysRequestOffices;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * PostHolidaysRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class PostHolidaysRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("fromDate")
  private LocalDate fromDate = null;

  @SerializedName("toDate")
  private LocalDate toDate = null;

  @SerializedName("repaymentsRescheduledTo")
  private LocalDate repaymentsRescheduledTo = null;

  @SerializedName("offices")
  private List<PostHolidaysRequestOffices> offices = null;

  public PostHolidaysRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Good Friday", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostHolidaysRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Good Friday", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostHolidaysRequest dateFormat(String dateFormat) {
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

  public PostHolidaysRequest locale(String locale) {
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

  public PostHolidaysRequest fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(example = "25 October 2013", value = "")
  public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public PostHolidaysRequest toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Get toDate
   * @return toDate
  **/
  @ApiModelProperty(example = "25 October 2013", value = "")
  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }

  public PostHolidaysRequest repaymentsRescheduledTo(LocalDate repaymentsRescheduledTo) {
    this.repaymentsRescheduledTo = repaymentsRescheduledTo;
    return this;
  }

   /**
   * Get repaymentsRescheduledTo
   * @return repaymentsRescheduledTo
  **/
  @ApiModelProperty(example = "26 October 2013", value = "")
  public LocalDate getRepaymentsRescheduledTo() {
    return repaymentsRescheduledTo;
  }

  public void setRepaymentsRescheduledTo(LocalDate repaymentsRescheduledTo) {
    this.repaymentsRescheduledTo = repaymentsRescheduledTo;
  }

  public PostHolidaysRequest offices(List<PostHolidaysRequestOffices> offices) {
    this.offices = offices;
    return this;
  }

  public PostHolidaysRequest addOfficesItem(PostHolidaysRequestOffices officesItem) {
    if (this.offices == null) {
      this.offices = new ArrayList<PostHolidaysRequestOffices>();
    }
    this.offices.add(officesItem);
    return this;
  }

   /**
   * Get offices
   * @return offices
  **/
  @ApiModelProperty(value = "")
  public List<PostHolidaysRequestOffices> getOffices() {
    return offices;
  }

  public void setOffices(List<PostHolidaysRequestOffices> offices) {
    this.offices = offices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostHolidaysRequest postHolidaysRequest = (PostHolidaysRequest) o;
    return Objects.equals(this.name, postHolidaysRequest.name) &&
        Objects.equals(this.description, postHolidaysRequest.description) &&
        Objects.equals(this.dateFormat, postHolidaysRequest.dateFormat) &&
        Objects.equals(this.locale, postHolidaysRequest.locale) &&
        Objects.equals(this.fromDate, postHolidaysRequest.fromDate) &&
        Objects.equals(this.toDate, postHolidaysRequest.toDate) &&
        Objects.equals(this.repaymentsRescheduledTo, postHolidaysRequest.repaymentsRescheduledTo) &&
        Objects.equals(this.offices, postHolidaysRequest.offices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, dateFormat, locale, fromDate, toDate, repaymentsRescheduledTo, offices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostHolidaysRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    repaymentsRescheduledTo: ").append(toIndentedString(repaymentsRescheduledTo)).append("\n");
    sb.append("    offices: ").append(toIndentedString(offices)).append("\n");
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


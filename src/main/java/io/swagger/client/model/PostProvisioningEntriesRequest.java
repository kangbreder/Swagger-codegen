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
 * PostProvisioningEntriesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class PostProvisioningEntriesRequest {
  @SerializedName("date")
  private String date = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("createjournalentries")
  private String createjournalentries = null;

  @SerializedName("provisioningentry")
  private String provisioningentry = null;

  @SerializedName("entries")
  private String entries = null;

  public PostProvisioningEntriesRequest date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "16 October 2015", value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PostProvisioningEntriesRequest locale(String locale) {
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

  public PostProvisioningEntriesRequest dateFormat(String dateFormat) {
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

  public PostProvisioningEntriesRequest createjournalentries(String createjournalentries) {
    this.createjournalentries = createjournalentries;
    return this;
  }

   /**
   * Get createjournalentries
   * @return createjournalentries
  **/
  @ApiModelProperty(example = "true", value = "")
  public String getCreatejournalentries() {
    return createjournalentries;
  }

  public void setCreatejournalentries(String createjournalentries) {
    this.createjournalentries = createjournalentries;
  }

  public PostProvisioningEntriesRequest provisioningentry(String provisioningentry) {
    this.provisioningentry = provisioningentry;
    return this;
  }

   /**
   * Get provisioningentry
   * @return provisioningentry
  **/
  @ApiModelProperty(value = "")
  public String getProvisioningentry() {
    return provisioningentry;
  }

  public void setProvisioningentry(String provisioningentry) {
    this.provisioningentry = provisioningentry;
  }

  public PostProvisioningEntriesRequest entries(String entries) {
    this.entries = entries;
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(value = "")
  public String getEntries() {
    return entries;
  }

  public void setEntries(String entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostProvisioningEntriesRequest postProvisioningEntriesRequest = (PostProvisioningEntriesRequest) o;
    return Objects.equals(this.date, postProvisioningEntriesRequest.date) &&
        Objects.equals(this.locale, postProvisioningEntriesRequest.locale) &&
        Objects.equals(this.dateFormat, postProvisioningEntriesRequest.dateFormat) &&
        Objects.equals(this.createjournalentries, postProvisioningEntriesRequest.createjournalentries) &&
        Objects.equals(this.provisioningentry, postProvisioningEntriesRequest.provisioningentry) &&
        Objects.equals(this.entries, postProvisioningEntriesRequest.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, locale, dateFormat, createjournalentries, provisioningentry, entries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostProvisioningEntriesRequest {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    createjournalentries: ").append(toIndentedString(createjournalentries)).append("\n");
    sb.append("    provisioningentry: ").append(toIndentedString(provisioningentry)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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


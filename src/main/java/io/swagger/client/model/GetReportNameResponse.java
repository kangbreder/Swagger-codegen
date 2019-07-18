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
import io.swagger.client.model.ResultsetColumnHeaderData;
import io.swagger.client.model.ResultsetRowData;
import java.io.IOException;

/**
 * GetReportNameResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetReportNameResponse {
  @SerializedName("columnHeaders")
  private ResultsetColumnHeaderData columnHeaders = null;

  @SerializedName("row")
  private ResultsetRowData row = null;

  public GetReportNameResponse columnHeaders(ResultsetColumnHeaderData columnHeaders) {
    this.columnHeaders = columnHeaders;
    return this;
  }

   /**
   * Get columnHeaders
   * @return columnHeaders
  **/
  @ApiModelProperty(value = "")
  public ResultsetColumnHeaderData getColumnHeaders() {
    return columnHeaders;
  }

  public void setColumnHeaders(ResultsetColumnHeaderData columnHeaders) {
    this.columnHeaders = columnHeaders;
  }

  public GetReportNameResponse row(ResultsetRowData row) {
    this.row = row;
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @ApiModelProperty(value = "")
  public ResultsetRowData getRow() {
    return row;
  }

  public void setRow(ResultsetRowData row) {
    this.row = row;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportNameResponse getReportNameResponse = (GetReportNameResponse) o;
    return Objects.equals(this.columnHeaders, getReportNameResponse.columnHeaders) &&
        Objects.equals(this.row, getReportNameResponse.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnHeaders, row);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportNameResponse {\n");
    
    sb.append("    columnHeaders: ").append(toIndentedString(columnHeaders)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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


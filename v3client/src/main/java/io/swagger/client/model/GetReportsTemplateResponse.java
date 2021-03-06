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
import io.swagger.client.model.ReportParameterData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetReportsTemplateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetReportsTemplateResponse {
  @SerializedName("allowedReportTypes")
  private List<String> allowedReportTypes = null;

  @SerializedName("allowedReportSubTypes")
  private List<String> allowedReportSubTypes = null;

  @SerializedName("allowedParameters")
  private List<ReportParameterData> allowedParameters = null;

  public GetReportsTemplateResponse allowedReportTypes(List<String> allowedReportTypes) {
    this.allowedReportTypes = allowedReportTypes;
    return this;
  }

  public GetReportsTemplateResponse addAllowedReportTypesItem(String allowedReportTypesItem) {
    if (this.allowedReportTypes == null) {
      this.allowedReportTypes = new ArrayList<String>();
    }
    this.allowedReportTypes.add(allowedReportTypesItem);
    return this;
  }

   /**
   * Get allowedReportTypes
   * @return allowedReportTypes
  **/
  @ApiModelProperty(value = "")
  public List<String> getAllowedReportTypes() {
    return allowedReportTypes;
  }

  public void setAllowedReportTypes(List<String> allowedReportTypes) {
    this.allowedReportTypes = allowedReportTypes;
  }

  public GetReportsTemplateResponse allowedReportSubTypes(List<String> allowedReportSubTypes) {
    this.allowedReportSubTypes = allowedReportSubTypes;
    return this;
  }

  public GetReportsTemplateResponse addAllowedReportSubTypesItem(String allowedReportSubTypesItem) {
    if (this.allowedReportSubTypes == null) {
      this.allowedReportSubTypes = new ArrayList<String>();
    }
    this.allowedReportSubTypes.add(allowedReportSubTypesItem);
    return this;
  }

   /**
   * Get allowedReportSubTypes
   * @return allowedReportSubTypes
  **/
  @ApiModelProperty(value = "")
  public List<String> getAllowedReportSubTypes() {
    return allowedReportSubTypes;
  }

  public void setAllowedReportSubTypes(List<String> allowedReportSubTypes) {
    this.allowedReportSubTypes = allowedReportSubTypes;
  }

  public GetReportsTemplateResponse allowedParameters(List<ReportParameterData> allowedParameters) {
    this.allowedParameters = allowedParameters;
    return this;
  }

  public GetReportsTemplateResponse addAllowedParametersItem(ReportParameterData allowedParametersItem) {
    if (this.allowedParameters == null) {
      this.allowedParameters = new ArrayList<ReportParameterData>();
    }
    this.allowedParameters.add(allowedParametersItem);
    return this;
  }

   /**
   * Get allowedParameters
   * @return allowedParameters
  **/
  @ApiModelProperty(value = "")
  public List<ReportParameterData> getAllowedParameters() {
    return allowedParameters;
  }

  public void setAllowedParameters(List<ReportParameterData> allowedParameters) {
    this.allowedParameters = allowedParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportsTemplateResponse getReportsTemplateResponse = (GetReportsTemplateResponse) o;
    return Objects.equals(this.allowedReportTypes, getReportsTemplateResponse.allowedReportTypes) &&
        Objects.equals(this.allowedReportSubTypes, getReportsTemplateResponse.allowedReportSubTypes) &&
        Objects.equals(this.allowedParameters, getReportsTemplateResponse.allowedParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedReportTypes, allowedReportSubTypes, allowedParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportsTemplateResponse {\n");
    
    sb.append("    allowedReportTypes: ").append(toIndentedString(allowedReportTypes)).append("\n");
    sb.append("    allowedReportSubTypes: ").append(toIndentedString(allowedReportSubTypes)).append("\n");
    sb.append("    allowedParameters: ").append(toIndentedString(allowedParameters)).append("\n");
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


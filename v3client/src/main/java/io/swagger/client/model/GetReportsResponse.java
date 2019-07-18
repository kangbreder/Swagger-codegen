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
 * GetReportsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetReportsResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("reportType")
  private String reportType = null;

  @SerializedName("reportSubType")
  private String reportSubType = null;

  @SerializedName("reportCategory")
  private String reportCategory = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("reportSql")
  private String reportSql = null;

  @SerializedName("coreReport")
  private Boolean coreReport = null;

  @SerializedName("useReport")
  private Boolean useReport = null;

  @SerializedName("reportParameters")
  private List<ReportParameterData> reportParameters = null;

  public GetReportsResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetReportsResponse reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @ApiModelProperty(example = "Client Listing", value = "")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public GetReportsResponse reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @ApiModelProperty(example = "Table", value = "")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public GetReportsResponse reportSubType(String reportSubType) {
    this.reportSubType = reportSubType;
    return this;
  }

   /**
   * Get reportSubType
   * @return reportSubType
  **/
  @ApiModelProperty(value = "")
  public String getReportSubType() {
    return reportSubType;
  }

  public void setReportSubType(String reportSubType) {
    this.reportSubType = reportSubType;
  }

  public GetReportsResponse reportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
    return this;
  }

   /**
   * Get reportCategory
   * @return reportCategory
  **/
  @ApiModelProperty(example = "Client", value = "")
  public String getReportCategory() {
    return reportCategory;
  }

  public void setReportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
  }

  public GetReportsResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Individual Client Report Lists the small number of defined fields on the client table.  Would expect to copy this report and add any one to one additional data for specific tenant needs. Can be run for any size MFI but you expect it only to be run within a branch for larger ones.  Depending on how many columns are displayed, there is probably is a limit of about 20/50k clients returned for html display (export to excel doesnt have that client browser/memory impact).", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetReportsResponse reportSql(String reportSql) {
    this.reportSql = reportSql;
    return this;
  }

   /**
   * Get reportSql
   * @return reportSql
  **/
  @ApiModelProperty(value = "")
  public String getReportSql() {
    return reportSql;
  }

  public void setReportSql(String reportSql) {
    this.reportSql = reportSql;
  }

  public GetReportsResponse coreReport(Boolean coreReport) {
    this.coreReport = coreReport;
    return this;
  }

   /**
   * Get coreReport
   * @return coreReport
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isCoreReport() {
    return coreReport;
  }

  public void setCoreReport(Boolean coreReport) {
    this.coreReport = coreReport;
  }

  public GetReportsResponse useReport(Boolean useReport) {
    this.useReport = useReport;
    return this;
  }

   /**
   * Get useReport
   * @return useReport
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isUseReport() {
    return useReport;
  }

  public void setUseReport(Boolean useReport) {
    this.useReport = useReport;
  }

  public GetReportsResponse reportParameters(List<ReportParameterData> reportParameters) {
    this.reportParameters = reportParameters;
    return this;
  }

  public GetReportsResponse addReportParametersItem(ReportParameterData reportParametersItem) {
    if (this.reportParameters == null) {
      this.reportParameters = new ArrayList<ReportParameterData>();
    }
    this.reportParameters.add(reportParametersItem);
    return this;
  }

   /**
   * Get reportParameters
   * @return reportParameters
  **/
  @ApiModelProperty(value = "")
  public List<ReportParameterData> getReportParameters() {
    return reportParameters;
  }

  public void setReportParameters(List<ReportParameterData> reportParameters) {
    this.reportParameters = reportParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportsResponse getReportsResponse = (GetReportsResponse) o;
    return Objects.equals(this.id, getReportsResponse.id) &&
        Objects.equals(this.reportName, getReportsResponse.reportName) &&
        Objects.equals(this.reportType, getReportsResponse.reportType) &&
        Objects.equals(this.reportSubType, getReportsResponse.reportSubType) &&
        Objects.equals(this.reportCategory, getReportsResponse.reportCategory) &&
        Objects.equals(this.description, getReportsResponse.description) &&
        Objects.equals(this.reportSql, getReportsResponse.reportSql) &&
        Objects.equals(this.coreReport, getReportsResponse.coreReport) &&
        Objects.equals(this.useReport, getReportsResponse.useReport) &&
        Objects.equals(this.reportParameters, getReportsResponse.reportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reportName, reportType, reportSubType, reportCategory, description, reportSql, coreReport, useReport, reportParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportSubType: ").append(toIndentedString(reportSubType)).append("\n");
    sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reportSql: ").append(toIndentedString(reportSql)).append("\n");
    sb.append("    coreReport: ").append(toIndentedString(coreReport)).append("\n");
    sb.append("    useReport: ").append(toIndentedString(useReport)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
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


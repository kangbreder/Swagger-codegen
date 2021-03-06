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
import io.swagger.client.model.GetFixedDepositProductsProductIdChartSlabs;
import io.swagger.client.model.GetFixedDepositProductsProductIdPeriodType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * GetFixedDepositProductsProductIdActiveChart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetFixedDepositProductsProductIdActiveChart {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("fromDate")
  private LocalDate fromDate = null;

  @SerializedName("savingsProductId")
  private Integer savingsProductId = null;

  @SerializedName("savingsProductName")
  private String savingsProductName = null;

  @SerializedName("chartSlabs")
  private List<GetFixedDepositProductsProductIdChartSlabs> chartSlabs = null;

  @SerializedName("periodTypes")
  private List<GetFixedDepositProductsProductIdPeriodType> periodTypes = null;

  public GetFixedDepositProductsProductIdActiveChart id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "8", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetFixedDepositProductsProductIdActiveChart fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(example = "[2014, 1, 1]", value = "")
  public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public GetFixedDepositProductsProductIdActiveChart savingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @ApiModelProperty(example = "8", value = "")
  public Integer getSavingsProductId() {
    return savingsProductId;
  }

  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }

  public GetFixedDepositProductsProductIdActiveChart savingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @ApiModelProperty(example = "Fixed deposit product", value = "")
  public String getSavingsProductName() {
    return savingsProductName;
  }

  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }

  public GetFixedDepositProductsProductIdActiveChart chartSlabs(List<GetFixedDepositProductsProductIdChartSlabs> chartSlabs) {
    this.chartSlabs = chartSlabs;
    return this;
  }

  public GetFixedDepositProductsProductIdActiveChart addChartSlabsItem(GetFixedDepositProductsProductIdChartSlabs chartSlabsItem) {
    if (this.chartSlabs == null) {
      this.chartSlabs = new ArrayList<GetFixedDepositProductsProductIdChartSlabs>();
    }
    this.chartSlabs.add(chartSlabsItem);
    return this;
  }

   /**
   * Get chartSlabs
   * @return chartSlabs
  **/
  @ApiModelProperty(value = "")
  public List<GetFixedDepositProductsProductIdChartSlabs> getChartSlabs() {
    return chartSlabs;
  }

  public void setChartSlabs(List<GetFixedDepositProductsProductIdChartSlabs> chartSlabs) {
    this.chartSlabs = chartSlabs;
  }

  public GetFixedDepositProductsProductIdActiveChart periodTypes(List<GetFixedDepositProductsProductIdPeriodType> periodTypes) {
    this.periodTypes = periodTypes;
    return this;
  }

  public GetFixedDepositProductsProductIdActiveChart addPeriodTypesItem(GetFixedDepositProductsProductIdPeriodType periodTypesItem) {
    if (this.periodTypes == null) {
      this.periodTypes = new ArrayList<GetFixedDepositProductsProductIdPeriodType>();
    }
    this.periodTypes.add(periodTypesItem);
    return this;
  }

   /**
   * Get periodTypes
   * @return periodTypes
  **/
  @ApiModelProperty(value = "")
  public List<GetFixedDepositProductsProductIdPeriodType> getPeriodTypes() {
    return periodTypes;
  }

  public void setPeriodTypes(List<GetFixedDepositProductsProductIdPeriodType> periodTypes) {
    this.periodTypes = periodTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFixedDepositProductsProductIdActiveChart getFixedDepositProductsProductIdActiveChart = (GetFixedDepositProductsProductIdActiveChart) o;
    return Objects.equals(this.id, getFixedDepositProductsProductIdActiveChart.id) &&
        Objects.equals(this.fromDate, getFixedDepositProductsProductIdActiveChart.fromDate) &&
        Objects.equals(this.savingsProductId, getFixedDepositProductsProductIdActiveChart.savingsProductId) &&
        Objects.equals(this.savingsProductName, getFixedDepositProductsProductIdActiveChart.savingsProductName) &&
        Objects.equals(this.chartSlabs, getFixedDepositProductsProductIdActiveChart.chartSlabs) &&
        Objects.equals(this.periodTypes, getFixedDepositProductsProductIdActiveChart.periodTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromDate, savingsProductId, savingsProductName, chartSlabs, periodTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFixedDepositProductsProductIdActiveChart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    chartSlabs: ").append(toIndentedString(chartSlabs)).append("\n");
    sb.append("    periodTypes: ").append(toIndentedString(periodTypes)).append("\n");
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


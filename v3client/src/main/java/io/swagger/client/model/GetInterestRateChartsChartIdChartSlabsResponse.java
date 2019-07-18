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
import io.swagger.client.model.GetInterestRateChartsChartIdChartSlabsIncentives;
import io.swagger.client.model.GetInterestRateChartsCurrency;
import io.swagger.client.model.GetInterestRateChartsTemplatePeriodTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetInterestRateChartsChartIdChartSlabsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetInterestRateChartsChartIdChartSlabsResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("periodTypes")
  private GetInterestRateChartsTemplatePeriodTypes periodTypes = null;

  @SerializedName("fromPeriod")
  private Integer fromPeriod = null;

  @SerializedName("toPeriod")
  private Integer toPeriod = null;

  @SerializedName("annualInterestRate")
  private Double annualInterestRate = null;

  @SerializedName("currency")
  private GetInterestRateChartsCurrency currency = null;

  @SerializedName("incentives")
  private List<GetInterestRateChartsChartIdChartSlabsIncentives> incentives = null;

  public GetInterestRateChartsChartIdChartSlabsResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetInterestRateChartsChartIdChartSlabsResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "5% interest from 1 day till 180 days of deposit", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetInterestRateChartsChartIdChartSlabsResponse periodTypes(GetInterestRateChartsTemplatePeriodTypes periodTypes) {
    this.periodTypes = periodTypes;
    return this;
  }

   /**
   * Get periodTypes
   * @return periodTypes
  **/
  @ApiModelProperty(value = "")
  public GetInterestRateChartsTemplatePeriodTypes getPeriodTypes() {
    return periodTypes;
  }

  public void setPeriodTypes(GetInterestRateChartsTemplatePeriodTypes periodTypes) {
    this.periodTypes = periodTypes;
  }

  public GetInterestRateChartsChartIdChartSlabsResponse fromPeriod(Integer fromPeriod) {
    this.fromPeriod = fromPeriod;
    return this;
  }

   /**
   * Get fromPeriod
   * @return fromPeriod
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getFromPeriod() {
    return fromPeriod;
  }

  public void setFromPeriod(Integer fromPeriod) {
    this.fromPeriod = fromPeriod;
  }

  public GetInterestRateChartsChartIdChartSlabsResponse toPeriod(Integer toPeriod) {
    this.toPeriod = toPeriod;
    return this;
  }

   /**
   * Get toPeriod
   * @return toPeriod
  **/
  @ApiModelProperty(example = "180", value = "")
  public Integer getToPeriod() {
    return toPeriod;
  }

  public void setToPeriod(Integer toPeriod) {
    this.toPeriod = toPeriod;
  }

  public GetInterestRateChartsChartIdChartSlabsResponse annualInterestRate(Double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
    return this;
  }

   /**
   * Get annualInterestRate
   * @return annualInterestRate
  **/
  @ApiModelProperty(example = "5.0", value = "")
  public Double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(Double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public GetInterestRateChartsChartIdChartSlabsResponse currency(GetInterestRateChartsCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetInterestRateChartsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetInterestRateChartsCurrency currency) {
    this.currency = currency;
  }

  public GetInterestRateChartsChartIdChartSlabsResponse incentives(List<GetInterestRateChartsChartIdChartSlabsIncentives> incentives) {
    this.incentives = incentives;
    return this;
  }

  public GetInterestRateChartsChartIdChartSlabsResponse addIncentivesItem(GetInterestRateChartsChartIdChartSlabsIncentives incentivesItem) {
    if (this.incentives == null) {
      this.incentives = new ArrayList<GetInterestRateChartsChartIdChartSlabsIncentives>();
    }
    this.incentives.add(incentivesItem);
    return this;
  }

   /**
   * Get incentives
   * @return incentives
  **/
  @ApiModelProperty(value = "")
  public List<GetInterestRateChartsChartIdChartSlabsIncentives> getIncentives() {
    return incentives;
  }

  public void setIncentives(List<GetInterestRateChartsChartIdChartSlabsIncentives> incentives) {
    this.incentives = incentives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInterestRateChartsChartIdChartSlabsResponse getInterestRateChartsChartIdChartSlabsResponse = (GetInterestRateChartsChartIdChartSlabsResponse) o;
    return Objects.equals(this.id, getInterestRateChartsChartIdChartSlabsResponse.id) &&
        Objects.equals(this.description, getInterestRateChartsChartIdChartSlabsResponse.description) &&
        Objects.equals(this.periodTypes, getInterestRateChartsChartIdChartSlabsResponse.periodTypes) &&
        Objects.equals(this.fromPeriod, getInterestRateChartsChartIdChartSlabsResponse.fromPeriod) &&
        Objects.equals(this.toPeriod, getInterestRateChartsChartIdChartSlabsResponse.toPeriod) &&
        Objects.equals(this.annualInterestRate, getInterestRateChartsChartIdChartSlabsResponse.annualInterestRate) &&
        Objects.equals(this.currency, getInterestRateChartsChartIdChartSlabsResponse.currency) &&
        Objects.equals(this.incentives, getInterestRateChartsChartIdChartSlabsResponse.incentives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, periodTypes, fromPeriod, toPeriod, annualInterestRate, currency, incentives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInterestRateChartsChartIdChartSlabsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    periodTypes: ").append(toIndentedString(periodTypes)).append("\n");
    sb.append("    fromPeriod: ").append(toIndentedString(fromPeriod)).append("\n");
    sb.append("    toPeriod: ").append(toIndentedString(toPeriod)).append("\n");
    sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    incentives: ").append(toIndentedString(incentives)).append("\n");
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


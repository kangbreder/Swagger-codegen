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
 * PostInterestRateChartsChartIdChartSlabsIncentives
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class PostInterestRateChartsChartIdChartSlabsIncentives {
  @SerializedName("entityType")
  private Integer entityType = null;

  @SerializedName("attributeName")
  private Integer attributeName = null;

  @SerializedName("conditionType")
  private Integer conditionType = null;

  @SerializedName("attributeValue")
  private Integer attributeValue = null;

  @SerializedName("incentiveType")
  private Integer incentiveType = null;

  @SerializedName("amount")
  private Float amount = null;

  public PostInterestRateChartsChartIdChartSlabsIncentives entityType(Integer entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getEntityType() {
    return entityType;
  }

  public void setEntityType(Integer entityType) {
    this.entityType = entityType;
  }

  public PostInterestRateChartsChartIdChartSlabsIncentives attributeName(Integer attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Get attributeName
   * @return attributeName
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(Integer attributeName) {
    this.attributeName = attributeName;
  }

  public PostInterestRateChartsChartIdChartSlabsIncentives conditionType(Integer conditionType) {
    this.conditionType = conditionType;
    return this;
  }

   /**
   * Get conditionType
   * @return conditionType
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getConditionType() {
    return conditionType;
  }

  public void setConditionType(Integer conditionType) {
    this.conditionType = conditionType;
  }

  public PostInterestRateChartsChartIdChartSlabsIncentives attributeValue(Integer attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

   /**
   * Get attributeValue
   * @return attributeValue
  **/
  @ApiModelProperty(example = "11", value = "")
  public Integer getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(Integer attributeValue) {
    this.attributeValue = attributeValue;
  }

  public PostInterestRateChartsChartIdChartSlabsIncentives incentiveType(Integer incentiveType) {
    this.incentiveType = incentiveType;
    return this;
  }

   /**
   * Get incentiveType
   * @return incentiveType
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getIncentiveType() {
    return incentiveType;
  }

  public void setIncentiveType(Integer incentiveType) {
    this.incentiveType = incentiveType;
  }

  public PostInterestRateChartsChartIdChartSlabsIncentives amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "-1.0", value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInterestRateChartsChartIdChartSlabsIncentives postInterestRateChartsChartIdChartSlabsIncentives = (PostInterestRateChartsChartIdChartSlabsIncentives) o;
    return Objects.equals(this.entityType, postInterestRateChartsChartIdChartSlabsIncentives.entityType) &&
        Objects.equals(this.attributeName, postInterestRateChartsChartIdChartSlabsIncentives.attributeName) &&
        Objects.equals(this.conditionType, postInterestRateChartsChartIdChartSlabsIncentives.conditionType) &&
        Objects.equals(this.attributeValue, postInterestRateChartsChartIdChartSlabsIncentives.attributeValue) &&
        Objects.equals(this.incentiveType, postInterestRateChartsChartIdChartSlabsIncentives.incentiveType) &&
        Objects.equals(this.amount, postInterestRateChartsChartIdChartSlabsIncentives.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, attributeName, conditionType, attributeValue, incentiveType, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInterestRateChartsChartIdChartSlabsIncentives {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
    sb.append("    incentiveType: ").append(toIndentedString(incentiveType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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


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
import io.swagger.client.model.GetInterestRateChartsChartIdChartSlabsAttributeName;
import io.swagger.client.model.GetInterestRateChartsChartIdChartSlabsConditionType;
import io.swagger.client.model.GetInterestRateChartsChartIdChartSlabsEntityType;
import io.swagger.client.model.GetInterestRateChartsChartIdChartSlabsIncentiveType;
import java.io.IOException;

/**
 * GetInterestRateChartsChartIdChartSlabsIncentives
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetInterestRateChartsChartIdChartSlabsIncentives {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("entityType")
  private GetInterestRateChartsChartIdChartSlabsEntityType entityType = null;

  @SerializedName("attributeName")
  private GetInterestRateChartsChartIdChartSlabsAttributeName attributeName = null;

  @SerializedName("conditionType")
  private GetInterestRateChartsChartIdChartSlabsConditionType conditionType = null;

  @SerializedName("attributeValue")
  private Integer attributeValue = null;

  @SerializedName("attributeValueDesc")
  private String attributeValueDesc = null;

  @SerializedName("incentiveType")
  private GetInterestRateChartsChartIdChartSlabsIncentiveType incentiveType = null;

  @SerializedName("amount")
  private Float amount = null;

  public GetInterestRateChartsChartIdChartSlabsIncentives id(Integer id) {
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

  public GetInterestRateChartsChartIdChartSlabsIncentives entityType(GetInterestRateChartsChartIdChartSlabsEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(value = "")
  public GetInterestRateChartsChartIdChartSlabsEntityType getEntityType() {
    return entityType;
  }

  public void setEntityType(GetInterestRateChartsChartIdChartSlabsEntityType entityType) {
    this.entityType = entityType;
  }

  public GetInterestRateChartsChartIdChartSlabsIncentives attributeName(GetInterestRateChartsChartIdChartSlabsAttributeName attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Get attributeName
   * @return attributeName
  **/
  @ApiModelProperty(value = "")
  public GetInterestRateChartsChartIdChartSlabsAttributeName getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(GetInterestRateChartsChartIdChartSlabsAttributeName attributeName) {
    this.attributeName = attributeName;
  }

  public GetInterestRateChartsChartIdChartSlabsIncentives conditionType(GetInterestRateChartsChartIdChartSlabsConditionType conditionType) {
    this.conditionType = conditionType;
    return this;
  }

   /**
   * Get conditionType
   * @return conditionType
  **/
  @ApiModelProperty(value = "")
  public GetInterestRateChartsChartIdChartSlabsConditionType getConditionType() {
    return conditionType;
  }

  public void setConditionType(GetInterestRateChartsChartIdChartSlabsConditionType conditionType) {
    this.conditionType = conditionType;
  }

  public GetInterestRateChartsChartIdChartSlabsIncentives attributeValue(Integer attributeValue) {
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

  public GetInterestRateChartsChartIdChartSlabsIncentives attributeValueDesc(String attributeValueDesc) {
    this.attributeValueDesc = attributeValueDesc;
    return this;
  }

   /**
   * Get attributeValueDesc
   * @return attributeValueDesc
  **/
  @ApiModelProperty(example = "FEMALE", value = "")
  public String getAttributeValueDesc() {
    return attributeValueDesc;
  }

  public void setAttributeValueDesc(String attributeValueDesc) {
    this.attributeValueDesc = attributeValueDesc;
  }

  public GetInterestRateChartsChartIdChartSlabsIncentives incentiveType(GetInterestRateChartsChartIdChartSlabsIncentiveType incentiveType) {
    this.incentiveType = incentiveType;
    return this;
  }

   /**
   * Get incentiveType
   * @return incentiveType
  **/
  @ApiModelProperty(value = "")
  public GetInterestRateChartsChartIdChartSlabsIncentiveType getIncentiveType() {
    return incentiveType;
  }

  public void setIncentiveType(GetInterestRateChartsChartIdChartSlabsIncentiveType incentiveType) {
    this.incentiveType = incentiveType;
  }

  public GetInterestRateChartsChartIdChartSlabsIncentives amount(Float amount) {
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
    GetInterestRateChartsChartIdChartSlabsIncentives getInterestRateChartsChartIdChartSlabsIncentives = (GetInterestRateChartsChartIdChartSlabsIncentives) o;
    return Objects.equals(this.id, getInterestRateChartsChartIdChartSlabsIncentives.id) &&
        Objects.equals(this.entityType, getInterestRateChartsChartIdChartSlabsIncentives.entityType) &&
        Objects.equals(this.attributeName, getInterestRateChartsChartIdChartSlabsIncentives.attributeName) &&
        Objects.equals(this.conditionType, getInterestRateChartsChartIdChartSlabsIncentives.conditionType) &&
        Objects.equals(this.attributeValue, getInterestRateChartsChartIdChartSlabsIncentives.attributeValue) &&
        Objects.equals(this.attributeValueDesc, getInterestRateChartsChartIdChartSlabsIncentives.attributeValueDesc) &&
        Objects.equals(this.incentiveType, getInterestRateChartsChartIdChartSlabsIncentives.incentiveType) &&
        Objects.equals(this.amount, getInterestRateChartsChartIdChartSlabsIncentives.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entityType, attributeName, conditionType, attributeValue, attributeValueDesc, incentiveType, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInterestRateChartsChartIdChartSlabsIncentives {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
    sb.append("    attributeValueDesc: ").append(toIndentedString(attributeValueDesc)).append("\n");
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


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
import io.swagger.client.model.GetLoanChargeCalculationType;
import io.swagger.client.model.GetLoanChargeCurrency;
import io.swagger.client.model.GetLoanChargeTemplateChargeAppliesTo;
import io.swagger.client.model.GetLoanChargeTemplateChargeTimeType;
import java.io.IOException;

/**
 * GetLoanChargeTemplateChargeOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetLoanChargeTemplateChargeOptions {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("penalty")
  private Boolean penalty = null;

  @SerializedName("currency")
  private GetLoanChargeCurrency currency = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("chargeTimeType")
  private GetLoanChargeTemplateChargeTimeType chargeTimeType = null;

  @SerializedName("chargeAppliesTo")
  private GetLoanChargeTemplateChargeAppliesTo chargeAppliesTo = null;

  @SerializedName("chargeCalculationType")
  private GetLoanChargeCalculationType chargeCalculationType = null;

  public GetLoanChargeTemplateChargeOptions id(Integer id) {
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

  public GetLoanChargeTemplateChargeOptions name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Collection fee", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetLoanChargeTemplateChargeOptions active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public GetLoanChargeTemplateChargeOptions penalty(Boolean penalty) {
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isPenalty() {
    return penalty;
  }

  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }

  public GetLoanChargeTemplateChargeOptions currency(GetLoanChargeCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetLoanChargeCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetLoanChargeCurrency currency) {
    this.currency = currency;
  }

  public GetLoanChargeTemplateChargeOptions amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "100.0", value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetLoanChargeTemplateChargeOptions chargeTimeType(GetLoanChargeTemplateChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @ApiModelProperty(value = "")
  public GetLoanChargeTemplateChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }

  public void setChargeTimeType(GetLoanChargeTemplateChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }

  public GetLoanChargeTemplateChargeOptions chargeAppliesTo(GetLoanChargeTemplateChargeAppliesTo chargeAppliesTo) {
    this.chargeAppliesTo = chargeAppliesTo;
    return this;
  }

   /**
   * Get chargeAppliesTo
   * @return chargeAppliesTo
  **/
  @ApiModelProperty(value = "")
  public GetLoanChargeTemplateChargeAppliesTo getChargeAppliesTo() {
    return chargeAppliesTo;
  }

  public void setChargeAppliesTo(GetLoanChargeTemplateChargeAppliesTo chargeAppliesTo) {
    this.chargeAppliesTo = chargeAppliesTo;
  }

  public GetLoanChargeTemplateChargeOptions chargeCalculationType(GetLoanChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @ApiModelProperty(value = "")
  public GetLoanChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }

  public void setChargeCalculationType(GetLoanChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoanChargeTemplateChargeOptions getLoanChargeTemplateChargeOptions = (GetLoanChargeTemplateChargeOptions) o;
    return Objects.equals(this.id, getLoanChargeTemplateChargeOptions.id) &&
        Objects.equals(this.name, getLoanChargeTemplateChargeOptions.name) &&
        Objects.equals(this.active, getLoanChargeTemplateChargeOptions.active) &&
        Objects.equals(this.penalty, getLoanChargeTemplateChargeOptions.penalty) &&
        Objects.equals(this.currency, getLoanChargeTemplateChargeOptions.currency) &&
        Objects.equals(this.amount, getLoanChargeTemplateChargeOptions.amount) &&
        Objects.equals(this.chargeTimeType, getLoanChargeTemplateChargeOptions.chargeTimeType) &&
        Objects.equals(this.chargeAppliesTo, getLoanChargeTemplateChargeOptions.chargeAppliesTo) &&
        Objects.equals(this.chargeCalculationType, getLoanChargeTemplateChargeOptions.chargeCalculationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, active, penalty, currency, amount, chargeTimeType, chargeAppliesTo, chargeCalculationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoanChargeTemplateChargeOptions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    chargeAppliesTo: ").append(toIndentedString(chargeAppliesTo)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
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


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
import io.swagger.client.model.CashierData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTellersTellerIdCashiersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetTellersTellerIdCashiersResponse {
  @SerializedName("tellerId")
  private Long tellerId = null;

  @SerializedName("tellerName")
  private String tellerName = null;

  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("cashiers")
  private List<CashierData> cashiers = null;

  public GetTellersTellerIdCashiersResponse tellerId(Long tellerId) {
    this.tellerId = tellerId;
    return this;
  }

   /**
   * Get tellerId
   * @return tellerId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getTellerId() {
    return tellerId;
  }

  public void setTellerId(Long tellerId) {
    this.tellerId = tellerId;
  }

  public GetTellersTellerIdCashiersResponse tellerName(String tellerName) {
    this.tellerName = tellerName;
    return this;
  }

   /**
   * Get tellerName
   * @return tellerName
  **/
  @ApiModelProperty(example = "Teller1", value = "")
  public String getTellerName() {
    return tellerName;
  }

  public void setTellerName(String tellerName) {
    this.tellerName = tellerName;
  }

  public GetTellersTellerIdCashiersResponse officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public GetTellersTellerIdCashiersResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @ApiModelProperty(example = "Head Office", value = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public GetTellersTellerIdCashiersResponse cashiers(List<CashierData> cashiers) {
    this.cashiers = cashiers;
    return this;
  }

  public GetTellersTellerIdCashiersResponse addCashiersItem(CashierData cashiersItem) {
    if (this.cashiers == null) {
      this.cashiers = new ArrayList<CashierData>();
    }
    this.cashiers.add(cashiersItem);
    return this;
  }

   /**
   * Get cashiers
   * @return cashiers
  **/
  @ApiModelProperty(value = "")
  public List<CashierData> getCashiers() {
    return cashiers;
  }

  public void setCashiers(List<CashierData> cashiers) {
    this.cashiers = cashiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTellersTellerIdCashiersResponse getTellersTellerIdCashiersResponse = (GetTellersTellerIdCashiersResponse) o;
    return Objects.equals(this.tellerId, getTellersTellerIdCashiersResponse.tellerId) &&
        Objects.equals(this.tellerName, getTellersTellerIdCashiersResponse.tellerName) &&
        Objects.equals(this.officeId, getTellersTellerIdCashiersResponse.officeId) &&
        Objects.equals(this.officeName, getTellersTellerIdCashiersResponse.officeName) &&
        Objects.equals(this.cashiers, getTellersTellerIdCashiersResponse.cashiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tellerId, tellerName, officeId, officeName, cashiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTellersTellerIdCashiersResponse {\n");
    
    sb.append("    tellerId: ").append(toIndentedString(tellerId)).append("\n");
    sb.append("    tellerName: ").append(toIndentedString(tellerName)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    cashiers: ").append(toIndentedString(cashiers)).append("\n");
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

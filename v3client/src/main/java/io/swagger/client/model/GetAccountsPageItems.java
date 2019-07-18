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
import io.swagger.client.model.GetAccountsChargesCurrency;
import io.swagger.client.model.GetAccountsTypePurchasedShares;
import io.swagger.client.model.GetAccountsTypeStatus;
import io.swagger.client.model.GetAccountsTypeSummary;
import io.swagger.client.model.GetAccountsTypeTimeline;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAccountsPageItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetAccountsPageItems {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private Long accountNo = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("productId")
  private Integer productId = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("status")
  private GetAccountsTypeStatus status = null;

  @SerializedName("timeline")
  private GetAccountsTypeTimeline timeline = null;

  @SerializedName("currency")
  private GetAccountsChargesCurrency currency = null;

  @SerializedName("purchasedShares")
  private List<GetAccountsTypePurchasedShares> purchasedShares = null;

  @SerializedName("summary")
  private GetAccountsTypeSummary summary = null;

  public GetAccountsPageItems id(Integer id) {
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

  public GetAccountsPageItems accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public GetAccountsPageItems clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetAccountsPageItems clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(example = "Client Name", value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetAccountsPageItems productId(Integer productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public GetAccountsPageItems productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(example = "Share Product Name", value = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public GetAccountsPageItems status(GetAccountsTypeStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetAccountsTypeStatus getStatus() {
    return status;
  }

  public void setStatus(GetAccountsTypeStatus status) {
    this.status = status;
  }

  public GetAccountsPageItems timeline(GetAccountsTypeTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @ApiModelProperty(value = "")
  public GetAccountsTypeTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetAccountsTypeTimeline timeline) {
    this.timeline = timeline;
  }

  public GetAccountsPageItems currency(GetAccountsChargesCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetAccountsChargesCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetAccountsChargesCurrency currency) {
    this.currency = currency;
  }

  public GetAccountsPageItems purchasedShares(List<GetAccountsTypePurchasedShares> purchasedShares) {
    this.purchasedShares = purchasedShares;
    return this;
  }

  public GetAccountsPageItems addPurchasedSharesItem(GetAccountsTypePurchasedShares purchasedSharesItem) {
    if (this.purchasedShares == null) {
      this.purchasedShares = new ArrayList<GetAccountsTypePurchasedShares>();
    }
    this.purchasedShares.add(purchasedSharesItem);
    return this;
  }

   /**
   * Get purchasedShares
   * @return purchasedShares
  **/
  @ApiModelProperty(value = "")
  public List<GetAccountsTypePurchasedShares> getPurchasedShares() {
    return purchasedShares;
  }

  public void setPurchasedShares(List<GetAccountsTypePurchasedShares> purchasedShares) {
    this.purchasedShares = purchasedShares;
  }

  public GetAccountsPageItems summary(GetAccountsTypeSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public GetAccountsTypeSummary getSummary() {
    return summary;
  }

  public void setSummary(GetAccountsTypeSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsPageItems getAccountsPageItems = (GetAccountsPageItems) o;
    return Objects.equals(this.id, getAccountsPageItems.id) &&
        Objects.equals(this.accountNo, getAccountsPageItems.accountNo) &&
        Objects.equals(this.clientId, getAccountsPageItems.clientId) &&
        Objects.equals(this.clientName, getAccountsPageItems.clientName) &&
        Objects.equals(this.productId, getAccountsPageItems.productId) &&
        Objects.equals(this.productName, getAccountsPageItems.productName) &&
        Objects.equals(this.status, getAccountsPageItems.status) &&
        Objects.equals(this.timeline, getAccountsPageItems.timeline) &&
        Objects.equals(this.currency, getAccountsPageItems.currency) &&
        Objects.equals(this.purchasedShares, getAccountsPageItems.purchasedShares) &&
        Objects.equals(this.summary, getAccountsPageItems.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, clientId, clientName, productId, productName, status, timeline, currency, purchasedShares, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsPageItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    purchasedShares: ").append(toIndentedString(purchasedShares)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

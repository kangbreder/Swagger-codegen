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
import io.swagger.client.model.GetAccountTransfersFromAccountType;
import io.swagger.client.model.GetAccountTransfersFromClientOptions;
import io.swagger.client.model.GetAccountTransfersPageItemsCurrency;
import io.swagger.client.model.GetAccountTransfersPageItemsFromAccount;
import io.swagger.client.model.GetAccountTransfersPageItemsFromOffice;
import io.swagger.client.model.GetAccountTransfersPageItemsToAccountType;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetAccountTransfersPageItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetAccountTransfersPageItems {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("reversed")
  private Boolean reversed = null;

  @SerializedName("currency")
  private GetAccountTransfersPageItemsCurrency currency = null;

  @SerializedName("transferAmount")
  private Float transferAmount = null;

  @SerializedName("transferDate")
  private LocalDate transferDate = null;

  @SerializedName("transferDescription")
  private String transferDescription = null;

  @SerializedName("fromOffice")
  private GetAccountTransfersPageItemsFromOffice fromOffice = null;

  @SerializedName("fromClient")
  private GetAccountTransfersFromClientOptions fromClient = null;

  @SerializedName("fromAccountType")
  private GetAccountTransfersFromAccountType fromAccountType = null;

  @SerializedName("fromAccount")
  private GetAccountTransfersPageItemsFromAccount fromAccount = null;

  @SerializedName("toOffice")
  private GetAccountTransfersPageItemsFromOffice toOffice = null;

  @SerializedName("toClient")
  private GetAccountTransfersFromClientOptions toClient = null;

  @SerializedName("toAccountType")
  private GetAccountTransfersPageItemsToAccountType toAccountType = null;

  @SerializedName("toAccount")
  private GetAccountTransfersPageItemsFromAccount toAccount = null;

  public GetAccountTransfersPageItems id(Integer id) {
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

  public GetAccountTransfersPageItems reversed(Boolean reversed) {
    this.reversed = reversed;
    return this;
  }

   /**
   * Get reversed
   * @return reversed
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isReversed() {
    return reversed;
  }

  public void setReversed(Boolean reversed) {
    this.reversed = reversed;
  }

  public GetAccountTransfersPageItems currency(GetAccountTransfersPageItemsCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersPageItemsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetAccountTransfersPageItemsCurrency currency) {
    this.currency = currency;
  }

  public GetAccountTransfersPageItems transferAmount(Float transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * Get transferAmount
   * @return transferAmount
  **/
  @ApiModelProperty(example = "200.0", value = "")
  public Float getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(Float transferAmount) {
    this.transferAmount = transferAmount;
  }

  public GetAccountTransfersPageItems transferDate(LocalDate transferDate) {
    this.transferDate = transferDate;
    return this;
  }

   /**
   * Get transferDate
   * @return transferDate
  **/
  @ApiModelProperty(example = "[2013, 4, 1]", value = "")
  public LocalDate getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(LocalDate transferDate) {
    this.transferDate = transferDate;
  }

  public GetAccountTransfersPageItems transferDescription(String transferDescription) {
    this.transferDescription = transferDescription;
    return this;
  }

   /**
   * Get transferDescription
   * @return transferDescription
  **/
  @ApiModelProperty(example = "pay off loan from savings.", value = "")
  public String getTransferDescription() {
    return transferDescription;
  }

  public void setTransferDescription(String transferDescription) {
    this.transferDescription = transferDescription;
  }

  public GetAccountTransfersPageItems fromOffice(GetAccountTransfersPageItemsFromOffice fromOffice) {
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersPageItemsFromOffice getFromOffice() {
    return fromOffice;
  }

  public void setFromOffice(GetAccountTransfersPageItemsFromOffice fromOffice) {
    this.fromOffice = fromOffice;
  }

  public GetAccountTransfersPageItems fromClient(GetAccountTransfersFromClientOptions fromClient) {
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersFromClientOptions getFromClient() {
    return fromClient;
  }

  public void setFromClient(GetAccountTransfersFromClientOptions fromClient) {
    this.fromClient = fromClient;
  }

  public GetAccountTransfersPageItems fromAccountType(GetAccountTransfersFromAccountType fromAccountType) {
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersFromAccountType getFromAccountType() {
    return fromAccountType;
  }

  public void setFromAccountType(GetAccountTransfersFromAccountType fromAccountType) {
    this.fromAccountType = fromAccountType;
  }

  public GetAccountTransfersPageItems fromAccount(GetAccountTransfersPageItemsFromAccount fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersPageItemsFromAccount getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(GetAccountTransfersPageItemsFromAccount fromAccount) {
    this.fromAccount = fromAccount;
  }

  public GetAccountTransfersPageItems toOffice(GetAccountTransfersPageItemsFromOffice toOffice) {
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersPageItemsFromOffice getToOffice() {
    return toOffice;
  }

  public void setToOffice(GetAccountTransfersPageItemsFromOffice toOffice) {
    this.toOffice = toOffice;
  }

  public GetAccountTransfersPageItems toClient(GetAccountTransfersFromClientOptions toClient) {
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersFromClientOptions getToClient() {
    return toClient;
  }

  public void setToClient(GetAccountTransfersFromClientOptions toClient) {
    this.toClient = toClient;
  }

  public GetAccountTransfersPageItems toAccountType(GetAccountTransfersPageItemsToAccountType toAccountType) {
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersPageItemsToAccountType getToAccountType() {
    return toAccountType;
  }

  public void setToAccountType(GetAccountTransfersPageItemsToAccountType toAccountType) {
    this.toAccountType = toAccountType;
  }

  public GetAccountTransfersPageItems toAccount(GetAccountTransfersPageItemsFromAccount toAccount) {
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersPageItemsFromAccount getToAccount() {
    return toAccount;
  }

  public void setToAccount(GetAccountTransfersPageItemsFromAccount toAccount) {
    this.toAccount = toAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersPageItems getAccountTransfersPageItems = (GetAccountTransfersPageItems) o;
    return Objects.equals(this.id, getAccountTransfersPageItems.id) &&
        Objects.equals(this.reversed, getAccountTransfersPageItems.reversed) &&
        Objects.equals(this.currency, getAccountTransfersPageItems.currency) &&
        Objects.equals(this.transferAmount, getAccountTransfersPageItems.transferAmount) &&
        Objects.equals(this.transferDate, getAccountTransfersPageItems.transferDate) &&
        Objects.equals(this.transferDescription, getAccountTransfersPageItems.transferDescription) &&
        Objects.equals(this.fromOffice, getAccountTransfersPageItems.fromOffice) &&
        Objects.equals(this.fromClient, getAccountTransfersPageItems.fromClient) &&
        Objects.equals(this.fromAccountType, getAccountTransfersPageItems.fromAccountType) &&
        Objects.equals(this.fromAccount, getAccountTransfersPageItems.fromAccount) &&
        Objects.equals(this.toOffice, getAccountTransfersPageItems.toOffice) &&
        Objects.equals(this.toClient, getAccountTransfersPageItems.toClient) &&
        Objects.equals(this.toAccountType, getAccountTransfersPageItems.toAccountType) &&
        Objects.equals(this.toAccount, getAccountTransfersPageItems.toAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reversed, currency, transferAmount, transferDate, transferDescription, fromOffice, fromClient, fromAccountType, fromAccount, toOffice, toClient, toAccountType, toAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersPageItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
    sb.append("    transferDescription: ").append(toIndentedString(transferDescription)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
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


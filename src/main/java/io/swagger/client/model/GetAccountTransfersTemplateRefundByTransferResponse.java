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
import io.swagger.client.model.GetAccountTransfersPageItemsToAccountType;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferCurrency;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferFromAccount;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferFromAccountOptions;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferFromClient;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferFromClientOptions;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferFromOffice;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferFromOfficeOptions;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferToAccount;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferToClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * GetAccountTransfersTemplateRefundByTransferResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetAccountTransfersTemplateRefundByTransferResponse {
  @SerializedName("currency")
  private GetAccountTransfersTemplateRefundByTransferCurrency currency = null;

  @SerializedName("transferAmount")
  private Float transferAmount = null;

  @SerializedName("transferDate")
  private LocalDate transferDate = null;

  @SerializedName("fromOffice")
  private GetAccountTransfersTemplateRefundByTransferFromOffice fromOffice = null;

  @SerializedName("fromClient")
  private GetAccountTransfersTemplateRefundByTransferFromClient fromClient = null;

  @SerializedName("fromAccountType")
  private GetAccountTransfersPageItemsToAccountType fromAccountType = null;

  @SerializedName("fromAccount")
  private GetAccountTransfersTemplateRefundByTransferFromAccount fromAccount = null;

  @SerializedName("toOffice")
  private GetAccountTransfersTemplateRefundByTransferFromOffice toOffice = null;

  @SerializedName("toClient")
  private GetAccountTransfersTemplateRefundByTransferToClient toClient = null;

  @SerializedName("toAccountType")
  private GetAccountTransfersFromAccountType toAccountType = null;

  @SerializedName("toAccount")
  private GetAccountTransfersTemplateRefundByTransferToAccount toAccount = null;

  @SerializedName("fromOfficeOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> fromOfficeOptions = null;

  @SerializedName("fromClientOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> fromClientOptions = null;

  @SerializedName("fromAccountTypeOptions")
  private List<GetAccountTransfersFromAccountType> fromAccountTypeOptions = null;

  @SerializedName("fromAccountOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromAccountOptions> fromAccountOptions = null;

  @SerializedName("toOfficeOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> toOfficeOptions = null;

  @SerializedName("toClientOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> toClientOptions = null;

  @SerializedName("toAccountTypeOptions")
  private List<GetAccountTransfersFromAccountType> toAccountTypeOptions = null;

  @SerializedName("toAccountOptions")
  private List<GetAccountTransfersTemplateRefundByTransferToAccount> toAccountOptions = null;

  public GetAccountTransfersTemplateRefundByTransferResponse currency(GetAccountTransfersTemplateRefundByTransferCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersTemplateRefundByTransferCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetAccountTransfersTemplateRefundByTransferCurrency currency) {
    this.currency = currency;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse transferAmount(Float transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * Get transferAmount
   * @return transferAmount
  **/
  @ApiModelProperty(example = "130.0", value = "")
  public Float getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(Float transferAmount) {
    this.transferAmount = transferAmount;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse transferDate(LocalDate transferDate) {
    this.transferDate = transferDate;
    return this;
  }

   /**
   * Get transferDate
   * @return transferDate
  **/
  @ApiModelProperty(example = "[2014, 11, 1]", value = "")
  public LocalDate getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(LocalDate transferDate) {
    this.transferDate = transferDate;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromOffice(GetAccountTransfersTemplateRefundByTransferFromOffice fromOffice) {
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersTemplateRefundByTransferFromOffice getFromOffice() {
    return fromOffice;
  }

  public void setFromOffice(GetAccountTransfersTemplateRefundByTransferFromOffice fromOffice) {
    this.fromOffice = fromOffice;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromClient(GetAccountTransfersTemplateRefundByTransferFromClient fromClient) {
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersTemplateRefundByTransferFromClient getFromClient() {
    return fromClient;
  }

  public void setFromClient(GetAccountTransfersTemplateRefundByTransferFromClient fromClient) {
    this.fromClient = fromClient;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromAccountType(GetAccountTransfersPageItemsToAccountType fromAccountType) {
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersPageItemsToAccountType getFromAccountType() {
    return fromAccountType;
  }

  public void setFromAccountType(GetAccountTransfersPageItemsToAccountType fromAccountType) {
    this.fromAccountType = fromAccountType;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromAccount(GetAccountTransfersTemplateRefundByTransferFromAccount fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersTemplateRefundByTransferFromAccount getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(GetAccountTransfersTemplateRefundByTransferFromAccount fromAccount) {
    this.fromAccount = fromAccount;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toOffice(GetAccountTransfersTemplateRefundByTransferFromOffice toOffice) {
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersTemplateRefundByTransferFromOffice getToOffice() {
    return toOffice;
  }

  public void setToOffice(GetAccountTransfersTemplateRefundByTransferFromOffice toOffice) {
    this.toOffice = toOffice;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toClient(GetAccountTransfersTemplateRefundByTransferToClient toClient) {
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersTemplateRefundByTransferToClient getToClient() {
    return toClient;
  }

  public void setToClient(GetAccountTransfersTemplateRefundByTransferToClient toClient) {
    this.toClient = toClient;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toAccountType(GetAccountTransfersFromAccountType toAccountType) {
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersFromAccountType getToAccountType() {
    return toAccountType;
  }

  public void setToAccountType(GetAccountTransfersFromAccountType toAccountType) {
    this.toAccountType = toAccountType;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toAccount(GetAccountTransfersTemplateRefundByTransferToAccount toAccount) {
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @ApiModelProperty(value = "")
  public GetAccountTransfersTemplateRefundByTransferToAccount getToAccount() {
    return toAccount;
  }

  public void setToAccount(GetAccountTransfersTemplateRefundByTransferToAccount toAccount) {
    this.toAccount = toAccount;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromOfficeOptions(List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> fromOfficeOptions) {
    this.fromOfficeOptions = fromOfficeOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addFromOfficeOptionsItem(GetAccountTransfersTemplateRefundByTransferFromOfficeOptions fromOfficeOptionsItem) {
    if (this.fromOfficeOptions == null) {
      this.fromOfficeOptions = new ArrayList<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions>();
    }
    this.fromOfficeOptions.add(fromOfficeOptionsItem);
    return this;
  }

   /**
   * Get fromOfficeOptions
   * @return fromOfficeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> getFromOfficeOptions() {
    return fromOfficeOptions;
  }

  public void setFromOfficeOptions(List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> fromOfficeOptions) {
    this.fromOfficeOptions = fromOfficeOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromClientOptions(List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> fromClientOptions) {
    this.fromClientOptions = fromClientOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addFromClientOptionsItem(GetAccountTransfersTemplateRefundByTransferFromClientOptions fromClientOptionsItem) {
    if (this.fromClientOptions == null) {
      this.fromClientOptions = new ArrayList<GetAccountTransfersTemplateRefundByTransferFromClientOptions>();
    }
    this.fromClientOptions.add(fromClientOptionsItem);
    return this;
  }

   /**
   * Get fromClientOptions
   * @return fromClientOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> getFromClientOptions() {
    return fromClientOptions;
  }

  public void setFromClientOptions(List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> fromClientOptions) {
    this.fromClientOptions = fromClientOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromAccountTypeOptions(List<GetAccountTransfersFromAccountType> fromAccountTypeOptions) {
    this.fromAccountTypeOptions = fromAccountTypeOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addFromAccountTypeOptionsItem(GetAccountTransfersFromAccountType fromAccountTypeOptionsItem) {
    if (this.fromAccountTypeOptions == null) {
      this.fromAccountTypeOptions = new ArrayList<GetAccountTransfersFromAccountType>();
    }
    this.fromAccountTypeOptions.add(fromAccountTypeOptionsItem);
    return this;
  }

   /**
   * Get fromAccountTypeOptions
   * @return fromAccountTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetAccountTransfersFromAccountType> getFromAccountTypeOptions() {
    return fromAccountTypeOptions;
  }

  public void setFromAccountTypeOptions(List<GetAccountTransfersFromAccountType> fromAccountTypeOptions) {
    this.fromAccountTypeOptions = fromAccountTypeOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromAccountOptions(List<GetAccountTransfersTemplateRefundByTransferFromAccountOptions> fromAccountOptions) {
    this.fromAccountOptions = fromAccountOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addFromAccountOptionsItem(GetAccountTransfersTemplateRefundByTransferFromAccountOptions fromAccountOptionsItem) {
    if (this.fromAccountOptions == null) {
      this.fromAccountOptions = new ArrayList<GetAccountTransfersTemplateRefundByTransferFromAccountOptions>();
    }
    this.fromAccountOptions.add(fromAccountOptionsItem);
    return this;
  }

   /**
   * Get fromAccountOptions
   * @return fromAccountOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromAccountOptions> getFromAccountOptions() {
    return fromAccountOptions;
  }

  public void setFromAccountOptions(List<GetAccountTransfersTemplateRefundByTransferFromAccountOptions> fromAccountOptions) {
    this.fromAccountOptions = fromAccountOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toOfficeOptions(List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> toOfficeOptions) {
    this.toOfficeOptions = toOfficeOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addToOfficeOptionsItem(GetAccountTransfersTemplateRefundByTransferFromOfficeOptions toOfficeOptionsItem) {
    if (this.toOfficeOptions == null) {
      this.toOfficeOptions = new ArrayList<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions>();
    }
    this.toOfficeOptions.add(toOfficeOptionsItem);
    return this;
  }

   /**
   * Get toOfficeOptions
   * @return toOfficeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> getToOfficeOptions() {
    return toOfficeOptions;
  }

  public void setToOfficeOptions(List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> toOfficeOptions) {
    this.toOfficeOptions = toOfficeOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toClientOptions(List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> toClientOptions) {
    this.toClientOptions = toClientOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addToClientOptionsItem(GetAccountTransfersTemplateRefundByTransferFromClientOptions toClientOptionsItem) {
    if (this.toClientOptions == null) {
      this.toClientOptions = new ArrayList<GetAccountTransfersTemplateRefundByTransferFromClientOptions>();
    }
    this.toClientOptions.add(toClientOptionsItem);
    return this;
  }

   /**
   * Get toClientOptions
   * @return toClientOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> getToClientOptions() {
    return toClientOptions;
  }

  public void setToClientOptions(List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> toClientOptions) {
    this.toClientOptions = toClientOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toAccountTypeOptions(List<GetAccountTransfersFromAccountType> toAccountTypeOptions) {
    this.toAccountTypeOptions = toAccountTypeOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addToAccountTypeOptionsItem(GetAccountTransfersFromAccountType toAccountTypeOptionsItem) {
    if (this.toAccountTypeOptions == null) {
      this.toAccountTypeOptions = new ArrayList<GetAccountTransfersFromAccountType>();
    }
    this.toAccountTypeOptions.add(toAccountTypeOptionsItem);
    return this;
  }

   /**
   * Get toAccountTypeOptions
   * @return toAccountTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetAccountTransfersFromAccountType> getToAccountTypeOptions() {
    return toAccountTypeOptions;
  }

  public void setToAccountTypeOptions(List<GetAccountTransfersFromAccountType> toAccountTypeOptions) {
    this.toAccountTypeOptions = toAccountTypeOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toAccountOptions(List<GetAccountTransfersTemplateRefundByTransferToAccount> toAccountOptions) {
    this.toAccountOptions = toAccountOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addToAccountOptionsItem(GetAccountTransfersTemplateRefundByTransferToAccount toAccountOptionsItem) {
    if (this.toAccountOptions == null) {
      this.toAccountOptions = new ArrayList<GetAccountTransfersTemplateRefundByTransferToAccount>();
    }
    this.toAccountOptions.add(toAccountOptionsItem);
    return this;
  }

   /**
   * Get toAccountOptions
   * @return toAccountOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetAccountTransfersTemplateRefundByTransferToAccount> getToAccountOptions() {
    return toAccountOptions;
  }

  public void setToAccountOptions(List<GetAccountTransfersTemplateRefundByTransferToAccount> toAccountOptions) {
    this.toAccountOptions = toAccountOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersTemplateRefundByTransferResponse getAccountTransfersTemplateRefundByTransferResponse = (GetAccountTransfersTemplateRefundByTransferResponse) o;
    return Objects.equals(this.currency, getAccountTransfersTemplateRefundByTransferResponse.currency) &&
        Objects.equals(this.transferAmount, getAccountTransfersTemplateRefundByTransferResponse.transferAmount) &&
        Objects.equals(this.transferDate, getAccountTransfersTemplateRefundByTransferResponse.transferDate) &&
        Objects.equals(this.fromOffice, getAccountTransfersTemplateRefundByTransferResponse.fromOffice) &&
        Objects.equals(this.fromClient, getAccountTransfersTemplateRefundByTransferResponse.fromClient) &&
        Objects.equals(this.fromAccountType, getAccountTransfersTemplateRefundByTransferResponse.fromAccountType) &&
        Objects.equals(this.fromAccount, getAccountTransfersTemplateRefundByTransferResponse.fromAccount) &&
        Objects.equals(this.toOffice, getAccountTransfersTemplateRefundByTransferResponse.toOffice) &&
        Objects.equals(this.toClient, getAccountTransfersTemplateRefundByTransferResponse.toClient) &&
        Objects.equals(this.toAccountType, getAccountTransfersTemplateRefundByTransferResponse.toAccountType) &&
        Objects.equals(this.toAccount, getAccountTransfersTemplateRefundByTransferResponse.toAccount) &&
        Objects.equals(this.fromOfficeOptions, getAccountTransfersTemplateRefundByTransferResponse.fromOfficeOptions) &&
        Objects.equals(this.fromClientOptions, getAccountTransfersTemplateRefundByTransferResponse.fromClientOptions) &&
        Objects.equals(this.fromAccountTypeOptions, getAccountTransfersTemplateRefundByTransferResponse.fromAccountTypeOptions) &&
        Objects.equals(this.fromAccountOptions, getAccountTransfersTemplateRefundByTransferResponse.fromAccountOptions) &&
        Objects.equals(this.toOfficeOptions, getAccountTransfersTemplateRefundByTransferResponse.toOfficeOptions) &&
        Objects.equals(this.toClientOptions, getAccountTransfersTemplateRefundByTransferResponse.toClientOptions) &&
        Objects.equals(this.toAccountTypeOptions, getAccountTransfersTemplateRefundByTransferResponse.toAccountTypeOptions) &&
        Objects.equals(this.toAccountOptions, getAccountTransfersTemplateRefundByTransferResponse.toAccountOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, transferAmount, transferDate, fromOffice, fromClient, fromAccountType, fromAccount, toOffice, toClient, toAccountType, toAccount, fromOfficeOptions, fromClientOptions, fromAccountTypeOptions, fromAccountOptions, toOfficeOptions, toClientOptions, toAccountTypeOptions, toAccountOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersTemplateRefundByTransferResponse {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    fromOfficeOptions: ").append(toIndentedString(fromOfficeOptions)).append("\n");
    sb.append("    fromClientOptions: ").append(toIndentedString(fromClientOptions)).append("\n");
    sb.append("    fromAccountTypeOptions: ").append(toIndentedString(fromAccountTypeOptions)).append("\n");
    sb.append("    fromAccountOptions: ").append(toIndentedString(fromAccountOptions)).append("\n");
    sb.append("    toOfficeOptions: ").append(toIndentedString(toOfficeOptions)).append("\n");
    sb.append("    toClientOptions: ").append(toIndentedString(toClientOptions)).append("\n");
    sb.append("    toAccountTypeOptions: ").append(toIndentedString(toAccountTypeOptions)).append("\n");
    sb.append("    toAccountOptions: ").append(toIndentedString(toAccountOptions)).append("\n");
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


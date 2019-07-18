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
import io.swagger.client.model.GetFromAccountStandingInstructionSwagger;
import io.swagger.client.model.GetFromAccountTypeStandingInstructionSwagger;
import io.swagger.client.model.GetFromClientStandingInstructionSwagger;
import io.swagger.client.model.GetFromOfficeStandingInstructionSwagger;
import io.swagger.client.model.GetInstructionTypeStandingInstructionSwagger;
import io.swagger.client.model.GetPriorityStandingInstructionSwagger;
import io.swagger.client.model.GetRecurrenceFrequencyStandingInstructionSwagger;
import io.swagger.client.model.GetRecurrenceTypeStandingInstructionSwagger;
import io.swagger.client.model.GetStatusStandingInstructionSwagger;
import io.swagger.client.model.GetToAccountStandingInstructionSwagger;
import io.swagger.client.model.GetToAccountTypeStandingInstructionSwagger;
import io.swagger.client.model.GetToClientStandingInstructionSwagger;
import io.swagger.client.model.GetToOfficeStandingInstructionSwagger;
import io.swagger.client.model.GetTransferTypeStandingInstructionSwagger;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetStandingInstructionsStandingInstructionIdResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetStandingInstructionsStandingInstructionIdResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("accountDetailId")
  private Long accountDetailId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("fromOffice")
  private GetFromOfficeStandingInstructionSwagger fromOffice = null;

  @SerializedName("fromClient")
  private GetFromClientStandingInstructionSwagger fromClient = null;

  @SerializedName("fromAccountType")
  private GetFromAccountTypeStandingInstructionSwagger fromAccountType = null;

  @SerializedName("fromAccount")
  private GetFromAccountStandingInstructionSwagger fromAccount = null;

  @SerializedName("toOffice")
  private GetToOfficeStandingInstructionSwagger toOffice = null;

  @SerializedName("toClient")
  private GetToClientStandingInstructionSwagger toClient = null;

  @SerializedName("toAccountType")
  private GetToAccountTypeStandingInstructionSwagger toAccountType = null;

  @SerializedName("toAccount")
  private GetToAccountStandingInstructionSwagger toAccount = null;

  @SerializedName("transferType")
  private GetTransferTypeStandingInstructionSwagger transferType = null;

  @SerializedName("priority")
  private GetPriorityStandingInstructionSwagger priority = null;

  @SerializedName("instructionType")
  private GetInstructionTypeStandingInstructionSwagger instructionType = null;

  @SerializedName("status")
  private GetStatusStandingInstructionSwagger status = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("validFrom")
  private LocalDate validFrom = null;

  @SerializedName("recurrenceType")
  private GetRecurrenceTypeStandingInstructionSwagger recurrenceType = null;

  @SerializedName("recurrenceFrequency")
  private GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency = null;

  @SerializedName("recurrenceInterval")
  private Integer recurrenceInterval = null;

  @SerializedName("recurrenceOnMonthDay")
  private LocalDate recurrenceOnMonthDay = null;

  public GetStandingInstructionsStandingInstructionIdResponse id(Long id) {
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

  public GetStandingInstructionsStandingInstructionIdResponse accountDetailId(Long accountDetailId) {
    this.accountDetailId = accountDetailId;
    return this;
  }

   /**
   * Get accountDetailId
   * @return accountDetailId
  **/
  @ApiModelProperty(example = "6", value = "")
  public Long getAccountDetailId() {
    return accountDetailId;
  }

  public void setAccountDetailId(Long accountDetailId) {
    this.accountDetailId = accountDetailId;
  }

  public GetStandingInstructionsStandingInstructionIdResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "test standing", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetStandingInstructionsStandingInstructionIdResponse fromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @ApiModelProperty(value = "")
  public GetFromOfficeStandingInstructionSwagger getFromOffice() {
    return fromOffice;
  }

  public void setFromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    this.fromOffice = fromOffice;
  }

  public GetStandingInstructionsStandingInstructionIdResponse fromClient(GetFromClientStandingInstructionSwagger fromClient) {
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @ApiModelProperty(value = "")
  public GetFromClientStandingInstructionSwagger getFromClient() {
    return fromClient;
  }

  public void setFromClient(GetFromClientStandingInstructionSwagger fromClient) {
    this.fromClient = fromClient;
  }

  public GetStandingInstructionsStandingInstructionIdResponse fromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @ApiModelProperty(value = "")
  public GetFromAccountTypeStandingInstructionSwagger getFromAccountType() {
    return fromAccountType;
  }

  public void setFromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    this.fromAccountType = fromAccountType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse fromAccount(GetFromAccountStandingInstructionSwagger fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @ApiModelProperty(value = "")
  public GetFromAccountStandingInstructionSwagger getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(GetFromAccountStandingInstructionSwagger fromAccount) {
    this.fromAccount = fromAccount;
  }

  public GetStandingInstructionsStandingInstructionIdResponse toOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @ApiModelProperty(value = "")
  public GetToOfficeStandingInstructionSwagger getToOffice() {
    return toOffice;
  }

  public void setToOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    this.toOffice = toOffice;
  }

  public GetStandingInstructionsStandingInstructionIdResponse toClient(GetToClientStandingInstructionSwagger toClient) {
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @ApiModelProperty(value = "")
  public GetToClientStandingInstructionSwagger getToClient() {
    return toClient;
  }

  public void setToClient(GetToClientStandingInstructionSwagger toClient) {
    this.toClient = toClient;
  }

  public GetStandingInstructionsStandingInstructionIdResponse toAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @ApiModelProperty(value = "")
  public GetToAccountTypeStandingInstructionSwagger getToAccountType() {
    return toAccountType;
  }

  public void setToAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    this.toAccountType = toAccountType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse toAccount(GetToAccountStandingInstructionSwagger toAccount) {
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @ApiModelProperty(value = "")
  public GetToAccountStandingInstructionSwagger getToAccount() {
    return toAccount;
  }

  public void setToAccount(GetToAccountStandingInstructionSwagger toAccount) {
    this.toAccount = toAccount;
  }

  public GetStandingInstructionsStandingInstructionIdResponse transferType(GetTransferTypeStandingInstructionSwagger transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @ApiModelProperty(value = "")
  public GetTransferTypeStandingInstructionSwagger getTransferType() {
    return transferType;
  }

  public void setTransferType(GetTransferTypeStandingInstructionSwagger transferType) {
    this.transferType = transferType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse priority(GetPriorityStandingInstructionSwagger priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public GetPriorityStandingInstructionSwagger getPriority() {
    return priority;
  }

  public void setPriority(GetPriorityStandingInstructionSwagger priority) {
    this.priority = priority;
  }

  public GetStandingInstructionsStandingInstructionIdResponse instructionType(GetInstructionTypeStandingInstructionSwagger instructionType) {
    this.instructionType = instructionType;
    return this;
  }

   /**
   * Get instructionType
   * @return instructionType
  **/
  @ApiModelProperty(value = "")
  public GetInstructionTypeStandingInstructionSwagger getInstructionType() {
    return instructionType;
  }

  public void setInstructionType(GetInstructionTypeStandingInstructionSwagger instructionType) {
    this.instructionType = instructionType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse status(GetStatusStandingInstructionSwagger status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetStatusStandingInstructionSwagger getStatus() {
    return status;
  }

  public void setStatus(GetStatusStandingInstructionSwagger status) {
    this.status = status;
  }

  public GetStandingInstructionsStandingInstructionIdResponse amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "150.0", value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetStandingInstructionsStandingInstructionIdResponse validFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(example = "[2014, 4, 3]", value = "")
  public LocalDate getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }

  public GetStandingInstructionsStandingInstructionIdResponse recurrenceType(GetRecurrenceTypeStandingInstructionSwagger recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * Get recurrenceType
   * @return recurrenceType
  **/
  @ApiModelProperty(value = "")
  public GetRecurrenceTypeStandingInstructionSwagger getRecurrenceType() {
    return recurrenceType;
  }

  public void setRecurrenceType(GetRecurrenceTypeStandingInstructionSwagger recurrenceType) {
    this.recurrenceType = recurrenceType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse recurrenceFrequency(GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
    return this;
  }

   /**
   * Get recurrenceFrequency
   * @return recurrenceFrequency
  **/
  @ApiModelProperty(value = "")
  public GetRecurrenceFrequencyStandingInstructionSwagger getRecurrenceFrequency() {
    return recurrenceFrequency;
  }

  public void setRecurrenceFrequency(GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
  }

  public GetStandingInstructionsStandingInstructionIdResponse recurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
    return this;
  }

   /**
   * Get recurrenceInterval
   * @return recurrenceInterval
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getRecurrenceInterval() {
    return recurrenceInterval;
  }

  public void setRecurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
  }

  public GetStandingInstructionsStandingInstructionIdResponse recurrenceOnMonthDay(LocalDate recurrenceOnMonthDay) {
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
    return this;
  }

   /**
   * Get recurrenceOnMonthDay
   * @return recurrenceOnMonthDay
  **/
  @ApiModelProperty(example = "[4, 3]", value = "")
  public LocalDate getRecurrenceOnMonthDay() {
    return recurrenceOnMonthDay;
  }

  public void setRecurrenceOnMonthDay(LocalDate recurrenceOnMonthDay) {
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStandingInstructionsStandingInstructionIdResponse getStandingInstructionsStandingInstructionIdResponse = (GetStandingInstructionsStandingInstructionIdResponse) o;
    return Objects.equals(this.id, getStandingInstructionsStandingInstructionIdResponse.id) &&
        Objects.equals(this.accountDetailId, getStandingInstructionsStandingInstructionIdResponse.accountDetailId) &&
        Objects.equals(this.name, getStandingInstructionsStandingInstructionIdResponse.name) &&
        Objects.equals(this.fromOffice, getStandingInstructionsStandingInstructionIdResponse.fromOffice) &&
        Objects.equals(this.fromClient, getStandingInstructionsStandingInstructionIdResponse.fromClient) &&
        Objects.equals(this.fromAccountType, getStandingInstructionsStandingInstructionIdResponse.fromAccountType) &&
        Objects.equals(this.fromAccount, getStandingInstructionsStandingInstructionIdResponse.fromAccount) &&
        Objects.equals(this.toOffice, getStandingInstructionsStandingInstructionIdResponse.toOffice) &&
        Objects.equals(this.toClient, getStandingInstructionsStandingInstructionIdResponse.toClient) &&
        Objects.equals(this.toAccountType, getStandingInstructionsStandingInstructionIdResponse.toAccountType) &&
        Objects.equals(this.toAccount, getStandingInstructionsStandingInstructionIdResponse.toAccount) &&
        Objects.equals(this.transferType, getStandingInstructionsStandingInstructionIdResponse.transferType) &&
        Objects.equals(this.priority, getStandingInstructionsStandingInstructionIdResponse.priority) &&
        Objects.equals(this.instructionType, getStandingInstructionsStandingInstructionIdResponse.instructionType) &&
        Objects.equals(this.status, getStandingInstructionsStandingInstructionIdResponse.status) &&
        Objects.equals(this.amount, getStandingInstructionsStandingInstructionIdResponse.amount) &&
        Objects.equals(this.validFrom, getStandingInstructionsStandingInstructionIdResponse.validFrom) &&
        Objects.equals(this.recurrenceType, getStandingInstructionsStandingInstructionIdResponse.recurrenceType) &&
        Objects.equals(this.recurrenceFrequency, getStandingInstructionsStandingInstructionIdResponse.recurrenceFrequency) &&
        Objects.equals(this.recurrenceInterval, getStandingInstructionsStandingInstructionIdResponse.recurrenceInterval) &&
        Objects.equals(this.recurrenceOnMonthDay, getStandingInstructionsStandingInstructionIdResponse.recurrenceOnMonthDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountDetailId, name, fromOffice, fromClient, fromAccountType, fromAccount, toOffice, toClient, toAccountType, toAccount, transferType, priority, instructionType, status, amount, validFrom, recurrenceType, recurrenceFrequency, recurrenceInterval, recurrenceOnMonthDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStandingInstructionsStandingInstructionIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountDetailId: ").append(toIndentedString(accountDetailId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    recurrenceFrequency: ").append(toIndentedString(recurrenceFrequency)).append("\n");
    sb.append("    recurrenceInterval: ").append(toIndentedString(recurrenceInterval)).append("\n");
    sb.append("    recurrenceOnMonthDay: ").append(toIndentedString(recurrenceOnMonthDay)).append("\n");
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


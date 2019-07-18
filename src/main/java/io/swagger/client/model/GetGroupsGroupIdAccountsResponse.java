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
import io.swagger.client.model.GetGroupsGroupIdAccountsLoanAccounts;
import io.swagger.client.model.GetGroupsGroupIdAccountsMemberLoanAccounts;
import io.swagger.client.model.GetGroupsGroupIdAccountsMemberSavingsAccounts;
import io.swagger.client.model.GetGroupsGroupIdAccountsSavingAccounts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetGroupsGroupIdAccountsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetGroupsGroupIdAccountsResponse {
  @SerializedName("loanAccounts")
  private List<GetGroupsGroupIdAccountsLoanAccounts> loanAccounts = null;

  @SerializedName("savingsAccounts")
  private List<GetGroupsGroupIdAccountsSavingAccounts> savingsAccounts = null;

  @SerializedName("memberLoanAccounts")
  private List<GetGroupsGroupIdAccountsMemberLoanAccounts> memberLoanAccounts = null;

  @SerializedName("memberSavingsAccounts")
  private List<GetGroupsGroupIdAccountsMemberSavingsAccounts> memberSavingsAccounts = null;

  public GetGroupsGroupIdAccountsResponse loanAccounts(List<GetGroupsGroupIdAccountsLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
    return this;
  }

  public GetGroupsGroupIdAccountsResponse addLoanAccountsItem(GetGroupsGroupIdAccountsLoanAccounts loanAccountsItem) {
    if (this.loanAccounts == null) {
      this.loanAccounts = new ArrayList<GetGroupsGroupIdAccountsLoanAccounts>();
    }
    this.loanAccounts.add(loanAccountsItem);
    return this;
  }

   /**
   * Get loanAccounts
   * @return loanAccounts
  **/
  @ApiModelProperty(value = "")
  public List<GetGroupsGroupIdAccountsLoanAccounts> getLoanAccounts() {
    return loanAccounts;
  }

  public void setLoanAccounts(List<GetGroupsGroupIdAccountsLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
  }

  public GetGroupsGroupIdAccountsResponse savingsAccounts(List<GetGroupsGroupIdAccountsSavingAccounts> savingsAccounts) {
    this.savingsAccounts = savingsAccounts;
    return this;
  }

  public GetGroupsGroupIdAccountsResponse addSavingsAccountsItem(GetGroupsGroupIdAccountsSavingAccounts savingsAccountsItem) {
    if (this.savingsAccounts == null) {
      this.savingsAccounts = new ArrayList<GetGroupsGroupIdAccountsSavingAccounts>();
    }
    this.savingsAccounts.add(savingsAccountsItem);
    return this;
  }

   /**
   * Get savingsAccounts
   * @return savingsAccounts
  **/
  @ApiModelProperty(value = "")
  public List<GetGroupsGroupIdAccountsSavingAccounts> getSavingsAccounts() {
    return savingsAccounts;
  }

  public void setSavingsAccounts(List<GetGroupsGroupIdAccountsSavingAccounts> savingsAccounts) {
    this.savingsAccounts = savingsAccounts;
  }

  public GetGroupsGroupIdAccountsResponse memberLoanAccounts(List<GetGroupsGroupIdAccountsMemberLoanAccounts> memberLoanAccounts) {
    this.memberLoanAccounts = memberLoanAccounts;
    return this;
  }

  public GetGroupsGroupIdAccountsResponse addMemberLoanAccountsItem(GetGroupsGroupIdAccountsMemberLoanAccounts memberLoanAccountsItem) {
    if (this.memberLoanAccounts == null) {
      this.memberLoanAccounts = new ArrayList<GetGroupsGroupIdAccountsMemberLoanAccounts>();
    }
    this.memberLoanAccounts.add(memberLoanAccountsItem);
    return this;
  }

   /**
   * Get memberLoanAccounts
   * @return memberLoanAccounts
  **/
  @ApiModelProperty(value = "")
  public List<GetGroupsGroupIdAccountsMemberLoanAccounts> getMemberLoanAccounts() {
    return memberLoanAccounts;
  }

  public void setMemberLoanAccounts(List<GetGroupsGroupIdAccountsMemberLoanAccounts> memberLoanAccounts) {
    this.memberLoanAccounts = memberLoanAccounts;
  }

  public GetGroupsGroupIdAccountsResponse memberSavingsAccounts(List<GetGroupsGroupIdAccountsMemberSavingsAccounts> memberSavingsAccounts) {
    this.memberSavingsAccounts = memberSavingsAccounts;
    return this;
  }

  public GetGroupsGroupIdAccountsResponse addMemberSavingsAccountsItem(GetGroupsGroupIdAccountsMemberSavingsAccounts memberSavingsAccountsItem) {
    if (this.memberSavingsAccounts == null) {
      this.memberSavingsAccounts = new ArrayList<GetGroupsGroupIdAccountsMemberSavingsAccounts>();
    }
    this.memberSavingsAccounts.add(memberSavingsAccountsItem);
    return this;
  }

   /**
   * Get memberSavingsAccounts
   * @return memberSavingsAccounts
  **/
  @ApiModelProperty(value = "")
  public List<GetGroupsGroupIdAccountsMemberSavingsAccounts> getMemberSavingsAccounts() {
    return memberSavingsAccounts;
  }

  public void setMemberSavingsAccounts(List<GetGroupsGroupIdAccountsMemberSavingsAccounts> memberSavingsAccounts) {
    this.memberSavingsAccounts = memberSavingsAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsGroupIdAccountsResponse getGroupsGroupIdAccountsResponse = (GetGroupsGroupIdAccountsResponse) o;
    return Objects.equals(this.loanAccounts, getGroupsGroupIdAccountsResponse.loanAccounts) &&
        Objects.equals(this.savingsAccounts, getGroupsGroupIdAccountsResponse.savingsAccounts) &&
        Objects.equals(this.memberLoanAccounts, getGroupsGroupIdAccountsResponse.memberLoanAccounts) &&
        Objects.equals(this.memberSavingsAccounts, getGroupsGroupIdAccountsResponse.memberSavingsAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAccounts, savingsAccounts, memberLoanAccounts, memberSavingsAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsGroupIdAccountsResponse {\n");
    
    sb.append("    loanAccounts: ").append(toIndentedString(loanAccounts)).append("\n");
    sb.append("    savingsAccounts: ").append(toIndentedString(savingsAccounts)).append("\n");
    sb.append("    memberLoanAccounts: ").append(toIndentedString(memberLoanAccounts)).append("\n");
    sb.append("    memberSavingsAccounts: ").append(toIndentedString(memberSavingsAccounts)).append("\n");
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


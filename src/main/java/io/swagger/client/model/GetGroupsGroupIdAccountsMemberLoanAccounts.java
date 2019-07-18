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
import io.swagger.client.model.GetGroupsGroupIdAccountsMemberLoanStatus;
import io.swagger.client.model.GetGroupsGroupIdAccountsMemberLoanType;
import java.io.IOException;

/**
 * GetGroupsGroupIdAccountsMemberLoanAccounts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetGroupsGroupIdAccountsMemberLoanAccounts {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private Long accountNo = null;

  @SerializedName("productId")
  private Integer productId = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("status")
  private GetGroupsGroupIdAccountsMemberLoanStatus status = null;

  @SerializedName("loanType")
  private GetGroupsGroupIdAccountsMemberLoanType loanType = null;

  public GetGroupsGroupIdAccountsMemberLoanAccounts id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "4", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetGroupsGroupIdAccountsMemberLoanAccounts accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "4", value = "")
  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public GetGroupsGroupIdAccountsMemberLoanAccounts productId(Integer productId) {
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

  public GetGroupsGroupIdAccountsMemberLoanAccounts productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(example = "testLoan", value = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public GetGroupsGroupIdAccountsMemberLoanAccounts status(GetGroupsGroupIdAccountsMemberLoanStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetGroupsGroupIdAccountsMemberLoanStatus getStatus() {
    return status;
  }

  public void setStatus(GetGroupsGroupIdAccountsMemberLoanStatus status) {
    this.status = status;
  }

  public GetGroupsGroupIdAccountsMemberLoanAccounts loanType(GetGroupsGroupIdAccountsMemberLoanType loanType) {
    this.loanType = loanType;
    return this;
  }

   /**
   * Get loanType
   * @return loanType
  **/
  @ApiModelProperty(value = "")
  public GetGroupsGroupIdAccountsMemberLoanType getLoanType() {
    return loanType;
  }

  public void setLoanType(GetGroupsGroupIdAccountsMemberLoanType loanType) {
    this.loanType = loanType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsGroupIdAccountsMemberLoanAccounts getGroupsGroupIdAccountsMemberLoanAccounts = (GetGroupsGroupIdAccountsMemberLoanAccounts) o;
    return Objects.equals(this.id, getGroupsGroupIdAccountsMemberLoanAccounts.id) &&
        Objects.equals(this.accountNo, getGroupsGroupIdAccountsMemberLoanAccounts.accountNo) &&
        Objects.equals(this.productId, getGroupsGroupIdAccountsMemberLoanAccounts.productId) &&
        Objects.equals(this.productName, getGroupsGroupIdAccountsMemberLoanAccounts.productName) &&
        Objects.equals(this.status, getGroupsGroupIdAccountsMemberLoanAccounts.status) &&
        Objects.equals(this.loanType, getGroupsGroupIdAccountsMemberLoanAccounts.loanType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, productId, productName, status, loanType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsGroupIdAccountsMemberLoanAccounts {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    loanType: ").append(toIndentedString(loanType)).append("\n");
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


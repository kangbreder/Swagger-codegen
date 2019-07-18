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
import io.swagger.client.model.GetLoanProductsIncomeType;
import io.swagger.client.model.GetLoanProductsLiabilityTagId;
import io.swagger.client.model.GetLoanProductsLiabilityUsage;
import java.io.IOException;

/**
 * GetLoanProductsIncomeAccountOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetLoanProductsIncomeAccountOptions {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("glCode")
  private Integer glCode = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("manualEntriesAllowed")
  private Boolean manualEntriesAllowed = null;

  @SerializedName("type")
  private GetLoanProductsIncomeType type = null;

  @SerializedName("usage")
  private GetLoanProductsLiabilityUsage usage = null;

  @SerializedName("nameDecorated")
  private String nameDecorated = null;

  @SerializedName("tagId")
  private GetLoanProductsLiabilityTagId tagId = null;

  @SerializedName("organizationRunningBalance")
  private Integer organizationRunningBalance = null;

  public GetLoanProductsIncomeAccountOptions id(Integer id) {
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

  public GetLoanProductsIncomeAccountOptions name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "income from interest", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetLoanProductsIncomeAccountOptions glCode(Integer glCode) {
    this.glCode = glCode;
    return this;
  }

   /**
   * Get glCode
   * @return glCode
  **/
  @ApiModelProperty(example = "4", value = "")
  public Integer getGlCode() {
    return glCode;
  }

  public void setGlCode(Integer glCode) {
    this.glCode = glCode;
  }

  public GetLoanProductsIncomeAccountOptions disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public GetLoanProductsIncomeAccountOptions manualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
    return this;
  }

   /**
   * Get manualEntriesAllowed
   * @return manualEntriesAllowed
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isManualEntriesAllowed() {
    return manualEntriesAllowed;
  }

  public void setManualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
  }

  public GetLoanProductsIncomeAccountOptions type(GetLoanProductsIncomeType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public GetLoanProductsIncomeType getType() {
    return type;
  }

  public void setType(GetLoanProductsIncomeType type) {
    this.type = type;
  }

  public GetLoanProductsIncomeAccountOptions usage(GetLoanProductsLiabilityUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
  public GetLoanProductsLiabilityUsage getUsage() {
    return usage;
  }

  public void setUsage(GetLoanProductsLiabilityUsage usage) {
    this.usage = usage;
  }

  public GetLoanProductsIncomeAccountOptions nameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
    return this;
  }

   /**
   * Get nameDecorated
   * @return nameDecorated
  **/
  @ApiModelProperty(example = "income from interest", value = "")
  public String getNameDecorated() {
    return nameDecorated;
  }

  public void setNameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
  }

  public GetLoanProductsIncomeAccountOptions tagId(GetLoanProductsLiabilityTagId tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @ApiModelProperty(value = "")
  public GetLoanProductsLiabilityTagId getTagId() {
    return tagId;
  }

  public void setTagId(GetLoanProductsLiabilityTagId tagId) {
    this.tagId = tagId;
  }

  public GetLoanProductsIncomeAccountOptions organizationRunningBalance(Integer organizationRunningBalance) {
    this.organizationRunningBalance = organizationRunningBalance;
    return this;
  }

   /**
   * Get organizationRunningBalance
   * @return organizationRunningBalance
  **/
  @ApiModelProperty(example = "19", value = "")
  public Integer getOrganizationRunningBalance() {
    return organizationRunningBalance;
  }

  public void setOrganizationRunningBalance(Integer organizationRunningBalance) {
    this.organizationRunningBalance = organizationRunningBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoanProductsIncomeAccountOptions getLoanProductsIncomeAccountOptions = (GetLoanProductsIncomeAccountOptions) o;
    return Objects.equals(this.id, getLoanProductsIncomeAccountOptions.id) &&
        Objects.equals(this.name, getLoanProductsIncomeAccountOptions.name) &&
        Objects.equals(this.glCode, getLoanProductsIncomeAccountOptions.glCode) &&
        Objects.equals(this.disabled, getLoanProductsIncomeAccountOptions.disabled) &&
        Objects.equals(this.manualEntriesAllowed, getLoanProductsIncomeAccountOptions.manualEntriesAllowed) &&
        Objects.equals(this.type, getLoanProductsIncomeAccountOptions.type) &&
        Objects.equals(this.usage, getLoanProductsIncomeAccountOptions.usage) &&
        Objects.equals(this.nameDecorated, getLoanProductsIncomeAccountOptions.nameDecorated) &&
        Objects.equals(this.tagId, getLoanProductsIncomeAccountOptions.tagId) &&
        Objects.equals(this.organizationRunningBalance, getLoanProductsIncomeAccountOptions.organizationRunningBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, glCode, disabled, manualEntriesAllowed, type, usage, nameDecorated, tagId, organizationRunningBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoanProductsIncomeAccountOptions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    manualEntriesAllowed: ").append(toIndentedString(manualEntriesAllowed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    nameDecorated: ").append(toIndentedString(nameDecorated)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    organizationRunningBalance: ").append(toIndentedString(organizationRunningBalance)).append("\n");
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


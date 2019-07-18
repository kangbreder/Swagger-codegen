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
import io.swagger.client.model.AccountingTagRuleData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAccountRulesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetAccountRulesResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("systemDefined")
  private Boolean systemDefined = null;

  @SerializedName("allowMultipleDebitEntries")
  private Boolean allowMultipleDebitEntries = null;

  @SerializedName("allowMultipleCreditEntries")
  private Boolean allowMultipleCreditEntries = null;

  @SerializedName("creditTags")
  private List<AccountingTagRuleData> creditTags = null;

  @SerializedName("debitTags")
  private List<AccountingTagRuleData> debitTags = null;

  public GetAccountRulesResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetAccountRulesResponse officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(value = "")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public GetAccountRulesResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @ApiModelProperty(value = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public GetAccountRulesResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetAccountRulesResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetAccountRulesResponse systemDefined(Boolean systemDefined) {
    this.systemDefined = systemDefined;
    return this;
  }

   /**
   * Get systemDefined
   * @return systemDefined
  **/
  @ApiModelProperty(value = "")
  public Boolean isSystemDefined() {
    return systemDefined;
  }

  public void setSystemDefined(Boolean systemDefined) {
    this.systemDefined = systemDefined;
  }

  public GetAccountRulesResponse allowMultipleDebitEntries(Boolean allowMultipleDebitEntries) {
    this.allowMultipleDebitEntries = allowMultipleDebitEntries;
    return this;
  }

   /**
   * Get allowMultipleDebitEntries
   * @return allowMultipleDebitEntries
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowMultipleDebitEntries() {
    return allowMultipleDebitEntries;
  }

  public void setAllowMultipleDebitEntries(Boolean allowMultipleDebitEntries) {
    this.allowMultipleDebitEntries = allowMultipleDebitEntries;
  }

  public GetAccountRulesResponse allowMultipleCreditEntries(Boolean allowMultipleCreditEntries) {
    this.allowMultipleCreditEntries = allowMultipleCreditEntries;
    return this;
  }

   /**
   * Get allowMultipleCreditEntries
   * @return allowMultipleCreditEntries
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowMultipleCreditEntries() {
    return allowMultipleCreditEntries;
  }

  public void setAllowMultipleCreditEntries(Boolean allowMultipleCreditEntries) {
    this.allowMultipleCreditEntries = allowMultipleCreditEntries;
  }

  public GetAccountRulesResponse creditTags(List<AccountingTagRuleData> creditTags) {
    this.creditTags = creditTags;
    return this;
  }

  public GetAccountRulesResponse addCreditTagsItem(AccountingTagRuleData creditTagsItem) {
    if (this.creditTags == null) {
      this.creditTags = new ArrayList<AccountingTagRuleData>();
    }
    this.creditTags.add(creditTagsItem);
    return this;
  }

   /**
   * Get creditTags
   * @return creditTags
  **/
  @ApiModelProperty(value = "")
  public List<AccountingTagRuleData> getCreditTags() {
    return creditTags;
  }

  public void setCreditTags(List<AccountingTagRuleData> creditTags) {
    this.creditTags = creditTags;
  }

  public GetAccountRulesResponse debitTags(List<AccountingTagRuleData> debitTags) {
    this.debitTags = debitTags;
    return this;
  }

  public GetAccountRulesResponse addDebitTagsItem(AccountingTagRuleData debitTagsItem) {
    if (this.debitTags == null) {
      this.debitTags = new ArrayList<AccountingTagRuleData>();
    }
    this.debitTags.add(debitTagsItem);
    return this;
  }

   /**
   * Get debitTags
   * @return debitTags
  **/
  @ApiModelProperty(value = "")
  public List<AccountingTagRuleData> getDebitTags() {
    return debitTags;
  }

  public void setDebitTags(List<AccountingTagRuleData> debitTags) {
    this.debitTags = debitTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountRulesResponse getAccountRulesResponse = (GetAccountRulesResponse) o;
    return Objects.equals(this.id, getAccountRulesResponse.id) &&
        Objects.equals(this.officeId, getAccountRulesResponse.officeId) &&
        Objects.equals(this.officeName, getAccountRulesResponse.officeName) &&
        Objects.equals(this.name, getAccountRulesResponse.name) &&
        Objects.equals(this.description, getAccountRulesResponse.description) &&
        Objects.equals(this.systemDefined, getAccountRulesResponse.systemDefined) &&
        Objects.equals(this.allowMultipleDebitEntries, getAccountRulesResponse.allowMultipleDebitEntries) &&
        Objects.equals(this.allowMultipleCreditEntries, getAccountRulesResponse.allowMultipleCreditEntries) &&
        Objects.equals(this.creditTags, getAccountRulesResponse.creditTags) &&
        Objects.equals(this.debitTags, getAccountRulesResponse.debitTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, officeId, officeName, name, description, systemDefined, allowMultipleDebitEntries, allowMultipleCreditEntries, creditTags, debitTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountRulesResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    systemDefined: ").append(toIndentedString(systemDefined)).append("\n");
    sb.append("    allowMultipleDebitEntries: ").append(toIndentedString(allowMultipleDebitEntries)).append("\n");
    sb.append("    allowMultipleCreditEntries: ").append(toIndentedString(allowMultipleCreditEntries)).append("\n");
    sb.append("    creditTags: ").append(toIndentedString(creditTags)).append("\n");
    sb.append("    debitTags: ").append(toIndentedString(debitTags)).append("\n");
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


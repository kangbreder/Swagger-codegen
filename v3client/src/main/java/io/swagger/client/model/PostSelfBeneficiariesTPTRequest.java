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
import java.io.IOException;

/**
 * PostSelfBeneficiariesTPTRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class PostSelfBeneficiariesTPTRequest {
  @SerializedName("locale")
  private String locale = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("accountNumber")
  private Long accountNumber = null;

  @SerializedName("accountType")
  private Integer accountType = null;

  @SerializedName("transferLimit")
  private Integer transferLimit = null;

  public PostSelfBeneficiariesTPTRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "en_GB", value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostSelfBeneficiariesTPTRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "beneficiary nick name", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostSelfBeneficiariesTPTRequest officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @ApiModelProperty(example = "HEAD OFFICE", value = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public PostSelfBeneficiariesTPTRequest accountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public PostSelfBeneficiariesTPTRequest accountType(Integer accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getAccountType() {
    return accountType;
  }

  public void setAccountType(Integer accountType) {
    this.accountType = accountType;
  }

  public PostSelfBeneficiariesTPTRequest transferLimit(Integer transferLimit) {
    this.transferLimit = transferLimit;
    return this;
  }

   /**
   * Get transferLimit
   * @return transferLimit
  **/
  @ApiModelProperty(example = "1000", value = "")
  public Integer getTransferLimit() {
    return transferLimit;
  }

  public void setTransferLimit(Integer transferLimit) {
    this.transferLimit = transferLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSelfBeneficiariesTPTRequest postSelfBeneficiariesTPTRequest = (PostSelfBeneficiariesTPTRequest) o;
    return Objects.equals(this.locale, postSelfBeneficiariesTPTRequest.locale) &&
        Objects.equals(this.name, postSelfBeneficiariesTPTRequest.name) &&
        Objects.equals(this.officeName, postSelfBeneficiariesTPTRequest.officeName) &&
        Objects.equals(this.accountNumber, postSelfBeneficiariesTPTRequest.accountNumber) &&
        Objects.equals(this.accountType, postSelfBeneficiariesTPTRequest.accountType) &&
        Objects.equals(this.transferLimit, postSelfBeneficiariesTPTRequest.transferLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, name, officeName, accountNumber, accountType, transferLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSelfBeneficiariesTPTRequest {\n");
    
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    transferLimit: ").append(toIndentedString(transferLimit)).append("\n");
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


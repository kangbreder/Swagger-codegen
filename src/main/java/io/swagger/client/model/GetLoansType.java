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
 * GetLoansType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetLoansType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("disbursement")
  private Boolean disbursement = null;

  @SerializedName("repaymentAtDisbursement")
  private Boolean repaymentAtDisbursement = null;

  @SerializedName("repayment")
  private Boolean repayment = null;

  @SerializedName("contra")
  private Boolean contra = null;

  @SerializedName("waiveInterest")
  private Boolean waiveInterest = null;

  @SerializedName("waiveCharges")
  private Boolean waiveCharges = null;

  @SerializedName("writeOff")
  private Boolean writeOff = null;

  @SerializedName("recoveryRepayment")
  private Boolean recoveryRepayment = null;

  public GetLoansType id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetLoansType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "loanTransactionType.repayment", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetLoansType value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "Repayment", value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public GetLoansType disbursement(Boolean disbursement) {
    this.disbursement = disbursement;
    return this;
  }

   /**
   * Get disbursement
   * @return disbursement
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isDisbursement() {
    return disbursement;
  }

  public void setDisbursement(Boolean disbursement) {
    this.disbursement = disbursement;
  }

  public GetLoansType repaymentAtDisbursement(Boolean repaymentAtDisbursement) {
    this.repaymentAtDisbursement = repaymentAtDisbursement;
    return this;
  }

   /**
   * Get repaymentAtDisbursement
   * @return repaymentAtDisbursement
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isRepaymentAtDisbursement() {
    return repaymentAtDisbursement;
  }

  public void setRepaymentAtDisbursement(Boolean repaymentAtDisbursement) {
    this.repaymentAtDisbursement = repaymentAtDisbursement;
  }

  public GetLoansType repayment(Boolean repayment) {
    this.repayment = repayment;
    return this;
  }

   /**
   * Get repayment
   * @return repayment
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isRepayment() {
    return repayment;
  }

  public void setRepayment(Boolean repayment) {
    this.repayment = repayment;
  }

  public GetLoansType contra(Boolean contra) {
    this.contra = contra;
    return this;
  }

   /**
   * Get contra
   * @return contra
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isContra() {
    return contra;
  }

  public void setContra(Boolean contra) {
    this.contra = contra;
  }

  public GetLoansType waiveInterest(Boolean waiveInterest) {
    this.waiveInterest = waiveInterest;
    return this;
  }

   /**
   * Get waiveInterest
   * @return waiveInterest
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isWaiveInterest() {
    return waiveInterest;
  }

  public void setWaiveInterest(Boolean waiveInterest) {
    this.waiveInterest = waiveInterest;
  }

  public GetLoansType waiveCharges(Boolean waiveCharges) {
    this.waiveCharges = waiveCharges;
    return this;
  }

   /**
   * Get waiveCharges
   * @return waiveCharges
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isWaiveCharges() {
    return waiveCharges;
  }

  public void setWaiveCharges(Boolean waiveCharges) {
    this.waiveCharges = waiveCharges;
  }

  public GetLoansType writeOff(Boolean writeOff) {
    this.writeOff = writeOff;
    return this;
  }

   /**
   * Get writeOff
   * @return writeOff
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isWriteOff() {
    return writeOff;
  }

  public void setWriteOff(Boolean writeOff) {
    this.writeOff = writeOff;
  }

  public GetLoansType recoveryRepayment(Boolean recoveryRepayment) {
    this.recoveryRepayment = recoveryRepayment;
    return this;
  }

   /**
   * Get recoveryRepayment
   * @return recoveryRepayment
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isRecoveryRepayment() {
    return recoveryRepayment;
  }

  public void setRecoveryRepayment(Boolean recoveryRepayment) {
    this.recoveryRepayment = recoveryRepayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansType getLoansType = (GetLoansType) o;
    return Objects.equals(this.id, getLoansType.id) &&
        Objects.equals(this.code, getLoansType.code) &&
        Objects.equals(this.value, getLoansType.value) &&
        Objects.equals(this.disbursement, getLoansType.disbursement) &&
        Objects.equals(this.repaymentAtDisbursement, getLoansType.repaymentAtDisbursement) &&
        Objects.equals(this.repayment, getLoansType.repayment) &&
        Objects.equals(this.contra, getLoansType.contra) &&
        Objects.equals(this.waiveInterest, getLoansType.waiveInterest) &&
        Objects.equals(this.waiveCharges, getLoansType.waiveCharges) &&
        Objects.equals(this.writeOff, getLoansType.writeOff) &&
        Objects.equals(this.recoveryRepayment, getLoansType.recoveryRepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, value, disbursement, repaymentAtDisbursement, repayment, contra, waiveInterest, waiveCharges, writeOff, recoveryRepayment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    disbursement: ").append(toIndentedString(disbursement)).append("\n");
    sb.append("    repaymentAtDisbursement: ").append(toIndentedString(repaymentAtDisbursement)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
    sb.append("    contra: ").append(toIndentedString(contra)).append("\n");
    sb.append("    waiveInterest: ").append(toIndentedString(waiveInterest)).append("\n");
    sb.append("    waiveCharges: ").append(toIndentedString(waiveCharges)).append("\n");
    sb.append("    writeOff: ").append(toIndentedString(writeOff)).append("\n");
    sb.append("    recoveryRepayment: ").append(toIndentedString(recoveryRepayment)).append("\n");
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


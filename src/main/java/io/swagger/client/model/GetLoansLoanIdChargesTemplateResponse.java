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
import io.swagger.client.model.GetLoanChargeTemplateChargeOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetLoansLoanIdChargesTemplateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetLoansLoanIdChargesTemplateResponse {
  @SerializedName("amountPaid")
  private Float amountPaid = null;

  @SerializedName("amountWaived")
  private Float amountWaived = null;

  @SerializedName("amountWrittenOff")
  private Float amountWrittenOff = null;

  @SerializedName("chargeOptions")
  private List<GetLoanChargeTemplateChargeOptions> chargeOptions = null;

  @SerializedName("penalty")
  private Boolean penalty = null;

  public GetLoansLoanIdChargesTemplateResponse amountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @ApiModelProperty(example = "0.0", value = "")
  public Float getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
  }

  public GetLoansLoanIdChargesTemplateResponse amountWaived(Float amountWaived) {
    this.amountWaived = amountWaived;
    return this;
  }

   /**
   * Get amountWaived
   * @return amountWaived
  **/
  @ApiModelProperty(example = "0.0", value = "")
  public Float getAmountWaived() {
    return amountWaived;
  }

  public void setAmountWaived(Float amountWaived) {
    this.amountWaived = amountWaived;
  }

  public GetLoansLoanIdChargesTemplateResponse amountWrittenOff(Float amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
    return this;
  }

   /**
   * Get amountWrittenOff
   * @return amountWrittenOff
  **/
  @ApiModelProperty(example = "0.0", value = "")
  public Float getAmountWrittenOff() {
    return amountWrittenOff;
  }

  public void setAmountWrittenOff(Float amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
  }

  public GetLoansLoanIdChargesTemplateResponse chargeOptions(List<GetLoanChargeTemplateChargeOptions> chargeOptions) {
    this.chargeOptions = chargeOptions;
    return this;
  }

  public GetLoansLoanIdChargesTemplateResponse addChargeOptionsItem(GetLoanChargeTemplateChargeOptions chargeOptionsItem) {
    if (this.chargeOptions == null) {
      this.chargeOptions = new ArrayList<GetLoanChargeTemplateChargeOptions>();
    }
    this.chargeOptions.add(chargeOptionsItem);
    return this;
  }

   /**
   * Get chargeOptions
   * @return chargeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetLoanChargeTemplateChargeOptions> getChargeOptions() {
    return chargeOptions;
  }

  public void setChargeOptions(List<GetLoanChargeTemplateChargeOptions> chargeOptions) {
    this.chargeOptions = chargeOptions;
  }

  public GetLoansLoanIdChargesTemplateResponse penalty(Boolean penalty) {
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isPenalty() {
    return penalty;
  }

  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansLoanIdChargesTemplateResponse getLoansLoanIdChargesTemplateResponse = (GetLoansLoanIdChargesTemplateResponse) o;
    return Objects.equals(this.amountPaid, getLoansLoanIdChargesTemplateResponse.amountPaid) &&
        Objects.equals(this.amountWaived, getLoansLoanIdChargesTemplateResponse.amountWaived) &&
        Objects.equals(this.amountWrittenOff, getLoansLoanIdChargesTemplateResponse.amountWrittenOff) &&
        Objects.equals(this.chargeOptions, getLoansLoanIdChargesTemplateResponse.chargeOptions) &&
        Objects.equals(this.penalty, getLoansLoanIdChargesTemplateResponse.penalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountPaid, amountWaived, amountWrittenOff, chargeOptions, penalty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansLoanIdChargesTemplateResponse {\n");
    
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    amountWaived: ").append(toIndentedString(amountWaived)).append("\n");
    sb.append("    amountWrittenOff: ").append(toIndentedString(amountWrittenOff)).append("\n");
    sb.append("    chargeOptions: ").append(toIndentedString(chargeOptions)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
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


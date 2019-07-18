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
import java.math.BigDecimal;

/**
 * LoanProductGuaranteeDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class LoanProductGuaranteeDetails {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("mandatoryGuarantee")
  private BigDecimal mandatoryGuarantee = null;

  @SerializedName("minimumGuaranteeFromOwnFunds")
  private BigDecimal minimumGuaranteeFromOwnFunds = null;

  @SerializedName("minimumGuaranteeFromGuarantor")
  private BigDecimal minimumGuaranteeFromGuarantor = null;

  @SerializedName("new")
  private Boolean _new = null;

  public LoanProductGuaranteeDetails id(Long id) {
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

  public LoanProductGuaranteeDetails mandatoryGuarantee(BigDecimal mandatoryGuarantee) {
    this.mandatoryGuarantee = mandatoryGuarantee;
    return this;
  }

   /**
   * Get mandatoryGuarantee
   * @return mandatoryGuarantee
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMandatoryGuarantee() {
    return mandatoryGuarantee;
  }

  public void setMandatoryGuarantee(BigDecimal mandatoryGuarantee) {
    this.mandatoryGuarantee = mandatoryGuarantee;
  }

  public LoanProductGuaranteeDetails minimumGuaranteeFromOwnFunds(BigDecimal minimumGuaranteeFromOwnFunds) {
    this.minimumGuaranteeFromOwnFunds = minimumGuaranteeFromOwnFunds;
    return this;
  }

   /**
   * Get minimumGuaranteeFromOwnFunds
   * @return minimumGuaranteeFromOwnFunds
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinimumGuaranteeFromOwnFunds() {
    return minimumGuaranteeFromOwnFunds;
  }

  public void setMinimumGuaranteeFromOwnFunds(BigDecimal minimumGuaranteeFromOwnFunds) {
    this.minimumGuaranteeFromOwnFunds = minimumGuaranteeFromOwnFunds;
  }

  public LoanProductGuaranteeDetails minimumGuaranteeFromGuarantor(BigDecimal minimumGuaranteeFromGuarantor) {
    this.minimumGuaranteeFromGuarantor = minimumGuaranteeFromGuarantor;
    return this;
  }

   /**
   * Get minimumGuaranteeFromGuarantor
   * @return minimumGuaranteeFromGuarantor
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinimumGuaranteeFromGuarantor() {
    return minimumGuaranteeFromGuarantor;
  }

  public void setMinimumGuaranteeFromGuarantor(BigDecimal minimumGuaranteeFromGuarantor) {
    this.minimumGuaranteeFromGuarantor = minimumGuaranteeFromGuarantor;
  }

  public LoanProductGuaranteeDetails _new(Boolean _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @ApiModelProperty(value = "")
  public Boolean isNew() {
    return _new;
  }

  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProductGuaranteeDetails loanProductGuaranteeDetails = (LoanProductGuaranteeDetails) o;
    return Objects.equals(this.id, loanProductGuaranteeDetails.id) &&
        Objects.equals(this.mandatoryGuarantee, loanProductGuaranteeDetails.mandatoryGuarantee) &&
        Objects.equals(this.minimumGuaranteeFromOwnFunds, loanProductGuaranteeDetails.minimumGuaranteeFromOwnFunds) &&
        Objects.equals(this.minimumGuaranteeFromGuarantor, loanProductGuaranteeDetails.minimumGuaranteeFromGuarantor) &&
        Objects.equals(this._new, loanProductGuaranteeDetails._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mandatoryGuarantee, minimumGuaranteeFromOwnFunds, minimumGuaranteeFromGuarantor, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProductGuaranteeDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mandatoryGuarantee: ").append(toIndentedString(mandatoryGuarantee)).append("\n");
    sb.append("    minimumGuaranteeFromOwnFunds: ").append(toIndentedString(minimumGuaranteeFromOwnFunds)).append("\n");
    sb.append("    minimumGuaranteeFromGuarantor: ").append(toIndentedString(minimumGuaranteeFromGuarantor)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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


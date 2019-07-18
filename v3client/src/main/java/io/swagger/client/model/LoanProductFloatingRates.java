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
import io.swagger.client.model.FloatingRate;
import io.swagger.client.model.LoanProduct;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * LoanProductFloatingRates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class LoanProductFloatingRates {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("loanProduct")
  private LoanProduct loanProduct = null;

  @SerializedName("floatingRate")
  private FloatingRate floatingRate = null;

  @SerializedName("interestRateDifferential")
  private BigDecimal interestRateDifferential = null;

  @SerializedName("minDifferentialLendingRate")
  private BigDecimal minDifferentialLendingRate = null;

  @SerializedName("defaultDifferentialLendingRate")
  private BigDecimal defaultDifferentialLendingRate = null;

  @SerializedName("maxDifferentialLendingRate")
  private BigDecimal maxDifferentialLendingRate = null;

  @SerializedName("floatingInterestRateCalculationAllowed")
  private Boolean floatingInterestRateCalculationAllowed = null;

  @SerializedName("new")
  private Boolean _new = null;

  public LoanProductFloatingRates id(Long id) {
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

  public LoanProductFloatingRates loanProduct(LoanProduct loanProduct) {
    this.loanProduct = loanProduct;
    return this;
  }

   /**
   * Get loanProduct
   * @return loanProduct
  **/
  @ApiModelProperty(value = "")
  public LoanProduct getLoanProduct() {
    return loanProduct;
  }

  public void setLoanProduct(LoanProduct loanProduct) {
    this.loanProduct = loanProduct;
  }

  public LoanProductFloatingRates floatingRate(FloatingRate floatingRate) {
    this.floatingRate = floatingRate;
    return this;
  }

   /**
   * Get floatingRate
   * @return floatingRate
  **/
  @ApiModelProperty(value = "")
  public FloatingRate getFloatingRate() {
    return floatingRate;
  }

  public void setFloatingRate(FloatingRate floatingRate) {
    this.floatingRate = floatingRate;
  }

  public LoanProductFloatingRates interestRateDifferential(BigDecimal interestRateDifferential) {
    this.interestRateDifferential = interestRateDifferential;
    return this;
  }

   /**
   * Get interestRateDifferential
   * @return interestRateDifferential
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInterestRateDifferential() {
    return interestRateDifferential;
  }

  public void setInterestRateDifferential(BigDecimal interestRateDifferential) {
    this.interestRateDifferential = interestRateDifferential;
  }

  public LoanProductFloatingRates minDifferentialLendingRate(BigDecimal minDifferentialLendingRate) {
    this.minDifferentialLendingRate = minDifferentialLendingRate;
    return this;
  }

   /**
   * Get minDifferentialLendingRate
   * @return minDifferentialLendingRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinDifferentialLendingRate() {
    return minDifferentialLendingRate;
  }

  public void setMinDifferentialLendingRate(BigDecimal minDifferentialLendingRate) {
    this.minDifferentialLendingRate = minDifferentialLendingRate;
  }

  public LoanProductFloatingRates defaultDifferentialLendingRate(BigDecimal defaultDifferentialLendingRate) {
    this.defaultDifferentialLendingRate = defaultDifferentialLendingRate;
    return this;
  }

   /**
   * Get defaultDifferentialLendingRate
   * @return defaultDifferentialLendingRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDefaultDifferentialLendingRate() {
    return defaultDifferentialLendingRate;
  }

  public void setDefaultDifferentialLendingRate(BigDecimal defaultDifferentialLendingRate) {
    this.defaultDifferentialLendingRate = defaultDifferentialLendingRate;
  }

  public LoanProductFloatingRates maxDifferentialLendingRate(BigDecimal maxDifferentialLendingRate) {
    this.maxDifferentialLendingRate = maxDifferentialLendingRate;
    return this;
  }

   /**
   * Get maxDifferentialLendingRate
   * @return maxDifferentialLendingRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxDifferentialLendingRate() {
    return maxDifferentialLendingRate;
  }

  public void setMaxDifferentialLendingRate(BigDecimal maxDifferentialLendingRate) {
    this.maxDifferentialLendingRate = maxDifferentialLendingRate;
  }

  public LoanProductFloatingRates floatingInterestRateCalculationAllowed(Boolean floatingInterestRateCalculationAllowed) {
    this.floatingInterestRateCalculationAllowed = floatingInterestRateCalculationAllowed;
    return this;
  }

   /**
   * Get floatingInterestRateCalculationAllowed
   * @return floatingInterestRateCalculationAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean isFloatingInterestRateCalculationAllowed() {
    return floatingInterestRateCalculationAllowed;
  }

  public void setFloatingInterestRateCalculationAllowed(Boolean floatingInterestRateCalculationAllowed) {
    this.floatingInterestRateCalculationAllowed = floatingInterestRateCalculationAllowed;
  }

  public LoanProductFloatingRates _new(Boolean _new) {
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
    LoanProductFloatingRates loanProductFloatingRates = (LoanProductFloatingRates) o;
    return Objects.equals(this.id, loanProductFloatingRates.id) &&
        Objects.equals(this.loanProduct, loanProductFloatingRates.loanProduct) &&
        Objects.equals(this.floatingRate, loanProductFloatingRates.floatingRate) &&
        Objects.equals(this.interestRateDifferential, loanProductFloatingRates.interestRateDifferential) &&
        Objects.equals(this.minDifferentialLendingRate, loanProductFloatingRates.minDifferentialLendingRate) &&
        Objects.equals(this.defaultDifferentialLendingRate, loanProductFloatingRates.defaultDifferentialLendingRate) &&
        Objects.equals(this.maxDifferentialLendingRate, loanProductFloatingRates.maxDifferentialLendingRate) &&
        Objects.equals(this.floatingInterestRateCalculationAllowed, loanProductFloatingRates.floatingInterestRateCalculationAllowed) &&
        Objects.equals(this._new, loanProductFloatingRates._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, loanProduct, floatingRate, interestRateDifferential, minDifferentialLendingRate, defaultDifferentialLendingRate, maxDifferentialLendingRate, floatingInterestRateCalculationAllowed, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProductFloatingRates {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loanProduct: ").append(toIndentedString(loanProduct)).append("\n");
    sb.append("    floatingRate: ").append(toIndentedString(floatingRate)).append("\n");
    sb.append("    interestRateDifferential: ").append(toIndentedString(interestRateDifferential)).append("\n");
    sb.append("    minDifferentialLendingRate: ").append(toIndentedString(minDifferentialLendingRate)).append("\n");
    sb.append("    defaultDifferentialLendingRate: ").append(toIndentedString(defaultDifferentialLendingRate)).append("\n");
    sb.append("    maxDifferentialLendingRate: ").append(toIndentedString(maxDifferentialLendingRate)).append("\n");
    sb.append("    floatingInterestRateCalculationAllowed: ").append(toIndentedString(floatingInterestRateCalculationAllowed)).append("\n");
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


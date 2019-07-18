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
import io.swagger.client.model.LoanProductData;
import io.swagger.client.model.ProvisioningCriteriaDefinitionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PutProvisioningCriteriaRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class PutProvisioningCriteriaRequest {
  @SerializedName("criteriaName")
  private String criteriaName = null;

  @SerializedName("loanProducts")
  private List<LoanProductData> loanProducts = null;

  @SerializedName("provisioningcriteria")
  private List<ProvisioningCriteriaDefinitionData> provisioningcriteria = null;

  public PutProvisioningCriteriaRequest criteriaName(String criteriaName) {
    this.criteriaName = criteriaName;
    return this;
  }

   /**
   * Get criteriaName
   * @return criteriaName
  **/
  @ApiModelProperty(example = "High Risk Products Criteria", value = "")
  public String getCriteriaName() {
    return criteriaName;
  }

  public void setCriteriaName(String criteriaName) {
    this.criteriaName = criteriaName;
  }

  public PutProvisioningCriteriaRequest loanProducts(List<LoanProductData> loanProducts) {
    this.loanProducts = loanProducts;
    return this;
  }

  public PutProvisioningCriteriaRequest addLoanProductsItem(LoanProductData loanProductsItem) {
    if (this.loanProducts == null) {
      this.loanProducts = new ArrayList<LoanProductData>();
    }
    this.loanProducts.add(loanProductsItem);
    return this;
  }

   /**
   * Get loanProducts
   * @return loanProducts
  **/
  @ApiModelProperty(value = "")
  public List<LoanProductData> getLoanProducts() {
    return loanProducts;
  }

  public void setLoanProducts(List<LoanProductData> loanProducts) {
    this.loanProducts = loanProducts;
  }

  public PutProvisioningCriteriaRequest provisioningcriteria(List<ProvisioningCriteriaDefinitionData> provisioningcriteria) {
    this.provisioningcriteria = provisioningcriteria;
    return this;
  }

  public PutProvisioningCriteriaRequest addProvisioningcriteriaItem(ProvisioningCriteriaDefinitionData provisioningcriteriaItem) {
    if (this.provisioningcriteria == null) {
      this.provisioningcriteria = new ArrayList<ProvisioningCriteriaDefinitionData>();
    }
    this.provisioningcriteria.add(provisioningcriteriaItem);
    return this;
  }

   /**
   * Get provisioningcriteria
   * @return provisioningcriteria
  **/
  @ApiModelProperty(value = "")
  public List<ProvisioningCriteriaDefinitionData> getProvisioningcriteria() {
    return provisioningcriteria;
  }

  public void setProvisioningcriteria(List<ProvisioningCriteriaDefinitionData> provisioningcriteria) {
    this.provisioningcriteria = provisioningcriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutProvisioningCriteriaRequest putProvisioningCriteriaRequest = (PutProvisioningCriteriaRequest) o;
    return Objects.equals(this.criteriaName, putProvisioningCriteriaRequest.criteriaName) &&
        Objects.equals(this.loanProducts, putProvisioningCriteriaRequest.loanProducts) &&
        Objects.equals(this.provisioningcriteria, putProvisioningCriteriaRequest.provisioningcriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaName, loanProducts, provisioningcriteria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutProvisioningCriteriaRequest {\n");
    
    sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
    sb.append("    loanProducts: ").append(toIndentedString(loanProducts)).append("\n");
    sb.append("    provisioningcriteria: ").append(toIndentedString(provisioningcriteria)).append("\n");
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


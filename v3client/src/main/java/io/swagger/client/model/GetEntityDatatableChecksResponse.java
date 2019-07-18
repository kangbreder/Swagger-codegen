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
import io.swagger.client.model.EnumOptionData;
import java.io.IOException;

/**
 * GetEntityDatatableChecksResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetEntityDatatableChecksResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("entity")
  private String entity = null;

  @SerializedName("status")
  private EnumOptionData status = null;

  @SerializedName("datatableName")
  private String datatableName = null;

  @SerializedName("systemDefined")
  private Boolean systemDefined = null;

  @SerializedName("order")
  private Long order = null;

  @SerializedName("productId")
  private Long productId = null;

  @SerializedName("productName")
  private String productName = null;

  public GetEntityDatatableChecksResponse id(Long id) {
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

  public GetEntityDatatableChecksResponse entity(String entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(value = "")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public GetEntityDatatableChecksResponse status(EnumOptionData status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getStatus() {
    return status;
  }

  public void setStatus(EnumOptionData status) {
    this.status = status;
  }

  public GetEntityDatatableChecksResponse datatableName(String datatableName) {
    this.datatableName = datatableName;
    return this;
  }

   /**
   * Get datatableName
   * @return datatableName
  **/
  @ApiModelProperty(value = "")
  public String getDatatableName() {
    return datatableName;
  }

  public void setDatatableName(String datatableName) {
    this.datatableName = datatableName;
  }

  public GetEntityDatatableChecksResponse systemDefined(Boolean systemDefined) {
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

  public GetEntityDatatableChecksResponse order(Long order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }

  public GetEntityDatatableChecksResponse productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public GetEntityDatatableChecksResponse productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(value = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEntityDatatableChecksResponse getEntityDatatableChecksResponse = (GetEntityDatatableChecksResponse) o;
    return Objects.equals(this.id, getEntityDatatableChecksResponse.id) &&
        Objects.equals(this.entity, getEntityDatatableChecksResponse.entity) &&
        Objects.equals(this.status, getEntityDatatableChecksResponse.status) &&
        Objects.equals(this.datatableName, getEntityDatatableChecksResponse.datatableName) &&
        Objects.equals(this.systemDefined, getEntityDatatableChecksResponse.systemDefined) &&
        Objects.equals(this.order, getEntityDatatableChecksResponse.order) &&
        Objects.equals(this.productId, getEntityDatatableChecksResponse.productId) &&
        Objects.equals(this.productName, getEntityDatatableChecksResponse.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entity, status, datatableName, systemDefined, order, productId, productName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEntityDatatableChecksResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    datatableName: ").append(toIndentedString(datatableName)).append("\n");
    sb.append("    systemDefined: ").append(toIndentedString(systemDefined)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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


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
import org.threeten.bp.LocalDate;

/**
 * GetFromOfficeResponseStandingInstructionSwagger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetFromOfficeResponseStandingInstructionSwagger {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("decoratedName")
  private String decoratedName = null;

  @SerializedName("externalId")
  private Integer externalId = null;

  @SerializedName("openingDate")
  private LocalDate openingDate = null;

  @SerializedName("hierarchy")
  private String hierarchy = null;

  public GetFromOfficeResponseStandingInstructionSwagger id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetFromOfficeResponseStandingInstructionSwagger name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Head Office", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetFromOfficeResponseStandingInstructionSwagger decoratedName(String decoratedName) {
    this.decoratedName = decoratedName;
    return this;
  }

   /**
   * Get decoratedName
   * @return decoratedName
  **/
  @ApiModelProperty(example = "Head Office", value = "")
  public String getDecoratedName() {
    return decoratedName;
  }

  public void setDecoratedName(String decoratedName) {
    this.decoratedName = decoratedName;
  }

  public GetFromOfficeResponseStandingInstructionSwagger externalId(Integer externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getExternalId() {
    return externalId;
  }

  public void setExternalId(Integer externalId) {
    this.externalId = externalId;
  }

  public GetFromOfficeResponseStandingInstructionSwagger openingDate(LocalDate openingDate) {
    this.openingDate = openingDate;
    return this;
  }

   /**
   * Get openingDate
   * @return openingDate
  **/
  @ApiModelProperty(example = "[2009, 1, 1]", value = "")
  public LocalDate getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(LocalDate openingDate) {
    this.openingDate = openingDate;
  }

  public GetFromOfficeResponseStandingInstructionSwagger hierarchy(String hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Get hierarchy
   * @return hierarchy
  **/
  @ApiModelProperty(example = ".", value = "")
  public String getHierarchy() {
    return hierarchy;
  }

  public void setHierarchy(String hierarchy) {
    this.hierarchy = hierarchy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFromOfficeResponseStandingInstructionSwagger getFromOfficeResponseStandingInstructionSwagger = (GetFromOfficeResponseStandingInstructionSwagger) o;
    return Objects.equals(this.id, getFromOfficeResponseStandingInstructionSwagger.id) &&
        Objects.equals(this.name, getFromOfficeResponseStandingInstructionSwagger.name) &&
        Objects.equals(this.decoratedName, getFromOfficeResponseStandingInstructionSwagger.decoratedName) &&
        Objects.equals(this.externalId, getFromOfficeResponseStandingInstructionSwagger.externalId) &&
        Objects.equals(this.openingDate, getFromOfficeResponseStandingInstructionSwagger.openingDate) &&
        Objects.equals(this.hierarchy, getFromOfficeResponseStandingInstructionSwagger.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, decoratedName, externalId, openingDate, hierarchy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFromOfficeResponseStandingInstructionSwagger {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decoratedName: ").append(toIndentedString(decoratedName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
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


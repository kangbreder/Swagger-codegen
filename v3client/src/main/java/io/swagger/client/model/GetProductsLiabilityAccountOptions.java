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
import io.swagger.client.model.GetProductsLiabilityType;
import io.swagger.client.model.GetProductsLiabilityUsage;
import io.swagger.client.model.GetProductsTagId;
import java.io.IOException;

/**
 * GetProductsLiabilityAccountOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetProductsLiabilityAccountOptions {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("glCode")
  private String glCode = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("manualEntriesAllowed")
  private Boolean manualEntriesAllowed = null;

  @SerializedName("type")
  private GetProductsLiabilityType type = null;

  @SerializedName("usage")
  private GetProductsLiabilityUsage usage = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("nameDecorated")
  private String nameDecorated = null;

  @SerializedName("tagId")
  private GetProductsTagId tagId = null;

  public GetProductsLiabilityAccountOptions id(Integer id) {
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

  public GetProductsLiabilityAccountOptions name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "ACCOUNT_NAME_1FJBQ", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetProductsLiabilityAccountOptions glCode(String glCode) {
    this.glCode = glCode;
    return this;
  }

   /**
   * Get glCode
   * @return glCode
  **/
  @ApiModelProperty(example = "LIABILITY_2T1461237838897", value = "")
  public String getGlCode() {
    return glCode;
  }

  public void setGlCode(String glCode) {
    this.glCode = glCode;
  }

  public GetProductsLiabilityAccountOptions disabled(Boolean disabled) {
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

  public GetProductsLiabilityAccountOptions manualEntriesAllowed(Boolean manualEntriesAllowed) {
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

  public GetProductsLiabilityAccountOptions type(GetProductsLiabilityType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public GetProductsLiabilityType getType() {
    return type;
  }

  public void setType(GetProductsLiabilityType type) {
    this.type = type;
  }

  public GetProductsLiabilityAccountOptions usage(GetProductsLiabilityUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
  public GetProductsLiabilityUsage getUsage() {
    return usage;
  }

  public void setUsage(GetProductsLiabilityUsage usage) {
    this.usage = usage;
  }

  public GetProductsLiabilityAccountOptions description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "DEFAULT_DESCRIPTION", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetProductsLiabilityAccountOptions nameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
    return this;
  }

   /**
   * Get nameDecorated
   * @return nameDecorated
  **/
  @ApiModelProperty(example = "ACCOUNT_NAME_1FJBQ", value = "")
  public String getNameDecorated() {
    return nameDecorated;
  }

  public void setNameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
  }

  public GetProductsLiabilityAccountOptions tagId(GetProductsTagId tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @ApiModelProperty(value = "")
  public GetProductsTagId getTagId() {
    return tagId;
  }

  public void setTagId(GetProductsTagId tagId) {
    this.tagId = tagId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProductsLiabilityAccountOptions getProductsLiabilityAccountOptions = (GetProductsLiabilityAccountOptions) o;
    return Objects.equals(this.id, getProductsLiabilityAccountOptions.id) &&
        Objects.equals(this.name, getProductsLiabilityAccountOptions.name) &&
        Objects.equals(this.glCode, getProductsLiabilityAccountOptions.glCode) &&
        Objects.equals(this.disabled, getProductsLiabilityAccountOptions.disabled) &&
        Objects.equals(this.manualEntriesAllowed, getProductsLiabilityAccountOptions.manualEntriesAllowed) &&
        Objects.equals(this.type, getProductsLiabilityAccountOptions.type) &&
        Objects.equals(this.usage, getProductsLiabilityAccountOptions.usage) &&
        Objects.equals(this.description, getProductsLiabilityAccountOptions.description) &&
        Objects.equals(this.nameDecorated, getProductsLiabilityAccountOptions.nameDecorated) &&
        Objects.equals(this.tagId, getProductsLiabilityAccountOptions.tagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, glCode, disabled, manualEntriesAllowed, type, usage, description, nameDecorated, tagId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductsLiabilityAccountOptions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    manualEntriesAllowed: ").append(toIndentedString(manualEntriesAllowed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nameDecorated: ").append(toIndentedString(nameDecorated)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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


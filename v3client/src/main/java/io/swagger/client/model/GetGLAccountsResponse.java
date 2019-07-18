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
import io.swagger.client.model.CodeValueData;
import io.swagger.client.model.EnumOptionData;
import java.io.IOException;

/**
 * GetGLAccountsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetGLAccountsResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentId")
  private Long parentId = null;

  @SerializedName("glCode")
  private String glCode = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("manualEntriesAllowed")
  private Boolean manualEntriesAllowed = null;

  @SerializedName("type")
  private EnumOptionData type = null;

  @SerializedName("usage")
  private EnumOptionData usage = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("nameDecorated")
  private String nameDecorated = null;

  @SerializedName("tagId")
  private CodeValueData tagId = null;

  @SerializedName("organizationRunningBalance")
  private Long organizationRunningBalance = null;

  public GetGLAccountsResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "16", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetGLAccountsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Cash", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetGLAccountsResponse parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public GetGLAccountsResponse glCode(String glCode) {
    this.glCode = glCode;
    return this;
  }

   /**
   * Get glCode
   * @return glCode
  **/
  @ApiModelProperty(example = "100001", value = "")
  public String getGlCode() {
    return glCode;
  }

  public void setGlCode(String glCode) {
    this.glCode = glCode;
  }

  public GetGLAccountsResponse disabled(Boolean disabled) {
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

  public GetGLAccountsResponse manualEntriesAllowed(Boolean manualEntriesAllowed) {
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

  public GetGLAccountsResponse type(EnumOptionData type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getType() {
    return type;
  }

  public void setType(EnumOptionData type) {
    this.type = type;
  }

  public GetGLAccountsResponse usage(EnumOptionData usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getUsage() {
    return usage;
  }

  public void setUsage(EnumOptionData usage) {
    this.usage = usage;
  }

  public GetGLAccountsResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Desc", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetGLAccountsResponse nameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
    return this;
  }

   /**
   * Get nameDecorated
   * @return nameDecorated
  **/
  @ApiModelProperty(example = "....Cash", value = "")
  public String getNameDecorated() {
    return nameDecorated;
  }

  public void setNameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
  }

  public GetGLAccountsResponse tagId(CodeValueData tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @ApiModelProperty(value = "")
  public CodeValueData getTagId() {
    return tagId;
  }

  public void setTagId(CodeValueData tagId) {
    this.tagId = tagId;
  }

  public GetGLAccountsResponse organizationRunningBalance(Long organizationRunningBalance) {
    this.organizationRunningBalance = organizationRunningBalance;
    return this;
  }

   /**
   * Get organizationRunningBalance
   * @return organizationRunningBalance
  **/
  @ApiModelProperty(example = "118437", value = "")
  public Long getOrganizationRunningBalance() {
    return organizationRunningBalance;
  }

  public void setOrganizationRunningBalance(Long organizationRunningBalance) {
    this.organizationRunningBalance = organizationRunningBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGLAccountsResponse getGLAccountsResponse = (GetGLAccountsResponse) o;
    return Objects.equals(this.id, getGLAccountsResponse.id) &&
        Objects.equals(this.name, getGLAccountsResponse.name) &&
        Objects.equals(this.parentId, getGLAccountsResponse.parentId) &&
        Objects.equals(this.glCode, getGLAccountsResponse.glCode) &&
        Objects.equals(this.disabled, getGLAccountsResponse.disabled) &&
        Objects.equals(this.manualEntriesAllowed, getGLAccountsResponse.manualEntriesAllowed) &&
        Objects.equals(this.type, getGLAccountsResponse.type) &&
        Objects.equals(this.usage, getGLAccountsResponse.usage) &&
        Objects.equals(this.description, getGLAccountsResponse.description) &&
        Objects.equals(this.nameDecorated, getGLAccountsResponse.nameDecorated) &&
        Objects.equals(this.tagId, getGLAccountsResponse.tagId) &&
        Objects.equals(this.organizationRunningBalance, getGLAccountsResponse.organizationRunningBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parentId, glCode, disabled, manualEntriesAllowed, type, usage, description, nameDecorated, tagId, organizationRunningBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGLAccountsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    manualEntriesAllowed: ").append(toIndentedString(manualEntriesAllowed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nameDecorated: ").append(toIndentedString(nameDecorated)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    organizationRunningBalance: ").append(toIndentedString(organizationRunningBalance)).append("\n");
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


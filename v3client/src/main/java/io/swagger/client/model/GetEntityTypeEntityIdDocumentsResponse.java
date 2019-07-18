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
 * GetEntityTypeEntityIdDocumentsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetEntityTypeEntityIdDocumentsResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("parentEntityType")
  private String parentEntityType = null;

  @SerializedName("parentEntityId")
  private Long parentEntityId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("storageType")
  private Integer storageType = null;

  public GetEntityTypeEntityIdDocumentsResponse id(Long id) {
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

  public GetEntityTypeEntityIdDocumentsResponse parentEntityType(String parentEntityType) {
    this.parentEntityType = parentEntityType;
    return this;
  }

   /**
   * Get parentEntityType
   * @return parentEntityType
  **/
  @ApiModelProperty(example = "clients", value = "")
  public String getParentEntityType() {
    return parentEntityType;
  }

  public void setParentEntityType(String parentEntityType) {
    this.parentEntityType = parentEntityType;
  }

  public GetEntityTypeEntityIdDocumentsResponse parentEntityId(Long parentEntityId) {
    this.parentEntityId = parentEntityId;
    return this;
  }

   /**
   * Get parentEntityId
   * @return parentEntityId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getParentEntityId() {
    return parentEntityId;
  }

  public void setParentEntityId(Long parentEntityId) {
    this.parentEntityId = parentEntityId;
  }

  public GetEntityTypeEntityIdDocumentsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Client Details Form", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetEntityTypeEntityIdDocumentsResponse fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(example = "CGAP.pdf", value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public GetEntityTypeEntityIdDocumentsResponse size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "5246719", value = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public GetEntityTypeEntityIdDocumentsResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "application/pdf", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetEntityTypeEntityIdDocumentsResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "A signed form signed by new member", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetEntityTypeEntityIdDocumentsResponse location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public GetEntityTypeEntityIdDocumentsResponse storageType(Integer storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @ApiModelProperty(value = "")
  public Integer getStorageType() {
    return storageType;
  }

  public void setStorageType(Integer storageType) {
    this.storageType = storageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEntityTypeEntityIdDocumentsResponse getEntityTypeEntityIdDocumentsResponse = (GetEntityTypeEntityIdDocumentsResponse) o;
    return Objects.equals(this.id, getEntityTypeEntityIdDocumentsResponse.id) &&
        Objects.equals(this.parentEntityType, getEntityTypeEntityIdDocumentsResponse.parentEntityType) &&
        Objects.equals(this.parentEntityId, getEntityTypeEntityIdDocumentsResponse.parentEntityId) &&
        Objects.equals(this.name, getEntityTypeEntityIdDocumentsResponse.name) &&
        Objects.equals(this.fileName, getEntityTypeEntityIdDocumentsResponse.fileName) &&
        Objects.equals(this.size, getEntityTypeEntityIdDocumentsResponse.size) &&
        Objects.equals(this.type, getEntityTypeEntityIdDocumentsResponse.type) &&
        Objects.equals(this.description, getEntityTypeEntityIdDocumentsResponse.description) &&
        Objects.equals(this.location, getEntityTypeEntityIdDocumentsResponse.location) &&
        Objects.equals(this.storageType, getEntityTypeEntityIdDocumentsResponse.storageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentEntityType, parentEntityId, name, fileName, size, type, description, location, storageType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEntityTypeEntityIdDocumentsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentEntityType: ").append(toIndentedString(parentEntityType)).append("\n");
    sb.append("    parentEntityId: ").append(toIndentedString(parentEntityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
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


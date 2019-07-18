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
import java.util.ArrayList;
import java.util.List;

/**
 * GetClientsColumnHeaderData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetClientsColumnHeaderData {
  @SerializedName("columnName")
  private String columnName = null;

  @SerializedName("columnType")
  private String columnType = null;

  @SerializedName("columnLength")
  private Integer columnLength = null;

  @SerializedName("columnDisplayType")
  private String columnDisplayType = null;

  @SerializedName("isColumnNullable")
  private Boolean isColumnNullable = null;

  @SerializedName("isColumnPrimaryKey")
  private Boolean isColumnPrimaryKey = null;

  @SerializedName("columnValues")
  private List<String> columnValues = null;

  public GetClientsColumnHeaderData columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

   /**
   * Get columnName
   * @return columnName
  **/
  @ApiModelProperty(example = "client_id", value = "")
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public GetClientsColumnHeaderData columnType(String columnType) {
    this.columnType = columnType;
    return this;
  }

   /**
   * Get columnType
   * @return columnType
  **/
  @ApiModelProperty(example = "bigint", value = "")
  public String getColumnType() {
    return columnType;
  }

  public void setColumnType(String columnType) {
    this.columnType = columnType;
  }

  public GetClientsColumnHeaderData columnLength(Integer columnLength) {
    this.columnLength = columnLength;
    return this;
  }

   /**
   * Get columnLength
   * @return columnLength
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getColumnLength() {
    return columnLength;
  }

  public void setColumnLength(Integer columnLength) {
    this.columnLength = columnLength;
  }

  public GetClientsColumnHeaderData columnDisplayType(String columnDisplayType) {
    this.columnDisplayType = columnDisplayType;
    return this;
  }

   /**
   * Get columnDisplayType
   * @return columnDisplayType
  **/
  @ApiModelProperty(example = "INTEGER", value = "")
  public String getColumnDisplayType() {
    return columnDisplayType;
  }

  public void setColumnDisplayType(String columnDisplayType) {
    this.columnDisplayType = columnDisplayType;
  }

  public GetClientsColumnHeaderData isColumnNullable(Boolean isColumnNullable) {
    this.isColumnNullable = isColumnNullable;
    return this;
  }

   /**
   * Get isColumnNullable
   * @return isColumnNullable
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsColumnNullable() {
    return isColumnNullable;
  }

  public void setIsColumnNullable(Boolean isColumnNullable) {
    this.isColumnNullable = isColumnNullable;
  }

  public GetClientsColumnHeaderData isColumnPrimaryKey(Boolean isColumnPrimaryKey) {
    this.isColumnPrimaryKey = isColumnPrimaryKey;
    return this;
  }

   /**
   * Get isColumnPrimaryKey
   * @return isColumnPrimaryKey
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsColumnPrimaryKey() {
    return isColumnPrimaryKey;
  }

  public void setIsColumnPrimaryKey(Boolean isColumnPrimaryKey) {
    this.isColumnPrimaryKey = isColumnPrimaryKey;
  }

  public GetClientsColumnHeaderData columnValues(List<String> columnValues) {
    this.columnValues = columnValues;
    return this;
  }

  public GetClientsColumnHeaderData addColumnValuesItem(String columnValuesItem) {
    if (this.columnValues == null) {
      this.columnValues = new ArrayList<String>();
    }
    this.columnValues.add(columnValuesItem);
    return this;
  }

   /**
   * Get columnValues
   * @return columnValues
  **/
  @ApiModelProperty(example = "\"[]\"", value = "")
  public List<String> getColumnValues() {
    return columnValues;
  }

  public void setColumnValues(List<String> columnValues) {
    this.columnValues = columnValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsColumnHeaderData getClientsColumnHeaderData = (GetClientsColumnHeaderData) o;
    return Objects.equals(this.columnName, getClientsColumnHeaderData.columnName) &&
        Objects.equals(this.columnType, getClientsColumnHeaderData.columnType) &&
        Objects.equals(this.columnLength, getClientsColumnHeaderData.columnLength) &&
        Objects.equals(this.columnDisplayType, getClientsColumnHeaderData.columnDisplayType) &&
        Objects.equals(this.isColumnNullable, getClientsColumnHeaderData.isColumnNullable) &&
        Objects.equals(this.isColumnPrimaryKey, getClientsColumnHeaderData.isColumnPrimaryKey) &&
        Objects.equals(this.columnValues, getClientsColumnHeaderData.columnValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, columnType, columnLength, columnDisplayType, isColumnNullable, isColumnPrimaryKey, columnValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsColumnHeaderData {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    columnLength: ").append(toIndentedString(columnLength)).append("\n");
    sb.append("    columnDisplayType: ").append(toIndentedString(columnDisplayType)).append("\n");
    sb.append("    isColumnNullable: ").append(toIndentedString(isColumnNullable)).append("\n");
    sb.append("    isColumnPrimaryKey: ").append(toIndentedString(isColumnPrimaryKey)).append("\n");
    sb.append("    columnValues: ").append(toIndentedString(columnValues)).append("\n");
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


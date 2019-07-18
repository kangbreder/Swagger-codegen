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
 * TemplateMapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class TemplateMapper {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("mapperorder")
  private Integer mapperorder = null;

  @SerializedName("mapperkey")
  private String mapperkey = null;

  @SerializedName("mappervalue")
  private String mappervalue = null;

  @SerializedName("new")
  private Boolean _new = null;

  public TemplateMapper id(Long id) {
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

  public TemplateMapper mapperorder(Integer mapperorder) {
    this.mapperorder = mapperorder;
    return this;
  }

   /**
   * Get mapperorder
   * @return mapperorder
  **/
  @ApiModelProperty(value = "")
  public Integer getMapperorder() {
    return mapperorder;
  }

  public void setMapperorder(Integer mapperorder) {
    this.mapperorder = mapperorder;
  }

  public TemplateMapper mapperkey(String mapperkey) {
    this.mapperkey = mapperkey;
    return this;
  }

   /**
   * Get mapperkey
   * @return mapperkey
  **/
  @ApiModelProperty(value = "")
  public String getMapperkey() {
    return mapperkey;
  }

  public void setMapperkey(String mapperkey) {
    this.mapperkey = mapperkey;
  }

  public TemplateMapper mappervalue(String mappervalue) {
    this.mappervalue = mappervalue;
    return this;
  }

   /**
   * Get mappervalue
   * @return mappervalue
  **/
  @ApiModelProperty(value = "")
  public String getMappervalue() {
    return mappervalue;
  }

  public void setMappervalue(String mappervalue) {
    this.mappervalue = mappervalue;
  }

  public TemplateMapper _new(Boolean _new) {
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
    TemplateMapper templateMapper = (TemplateMapper) o;
    return Objects.equals(this.id, templateMapper.id) &&
        Objects.equals(this.mapperorder, templateMapper.mapperorder) &&
        Objects.equals(this.mapperkey, templateMapper.mapperkey) &&
        Objects.equals(this.mappervalue, templateMapper.mappervalue) &&
        Objects.equals(this._new, templateMapper._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mapperorder, mapperkey, mappervalue, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMapper {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mapperorder: ").append(toIndentedString(mapperorder)).append("\n");
    sb.append("    mapperkey: ").append(toIndentedString(mapperkey)).append("\n");
    sb.append("    mappervalue: ").append(toIndentedString(mappervalue)).append("\n");
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


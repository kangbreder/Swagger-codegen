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
import io.swagger.client.model.ResponseData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QuestionData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class QuestionData {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("responseDatas")
  private List<ResponseData> responseDatas = null;

  @SerializedName("componentKey")
  private String componentKey = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("sequenceNo")
  private Integer sequenceNo = null;

  public QuestionData id(Long id) {
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

  public QuestionData responseDatas(List<ResponseData> responseDatas) {
    this.responseDatas = responseDatas;
    return this;
  }

  public QuestionData addResponseDatasItem(ResponseData responseDatasItem) {
    if (this.responseDatas == null) {
      this.responseDatas = new ArrayList<ResponseData>();
    }
    this.responseDatas.add(responseDatasItem);
    return this;
  }

   /**
   * Get responseDatas
   * @return responseDatas
  **/
  @ApiModelProperty(value = "")
  public List<ResponseData> getResponseDatas() {
    return responseDatas;
  }

  public void setResponseDatas(List<ResponseData> responseDatas) {
    this.responseDatas = responseDatas;
  }

  public QuestionData componentKey(String componentKey) {
    this.componentKey = componentKey;
    return this;
  }

   /**
   * Get componentKey
   * @return componentKey
  **/
  @ApiModelProperty(value = "")
  public String getComponentKey() {
    return componentKey;
  }

  public void setComponentKey(String componentKey) {
    this.componentKey = componentKey;
  }

  public QuestionData key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public QuestionData text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public QuestionData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QuestionData sequenceNo(Integer sequenceNo) {
    this.sequenceNo = sequenceNo;
    return this;
  }

   /**
   * Get sequenceNo
   * @return sequenceNo
  **/
  @ApiModelProperty(value = "")
  public Integer getSequenceNo() {
    return sequenceNo;
  }

  public void setSequenceNo(Integer sequenceNo) {
    this.sequenceNo = sequenceNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionData questionData = (QuestionData) o;
    return Objects.equals(this.id, questionData.id) &&
        Objects.equals(this.responseDatas, questionData.responseDatas) &&
        Objects.equals(this.componentKey, questionData.componentKey) &&
        Objects.equals(this.key, questionData.key) &&
        Objects.equals(this.text, questionData.text) &&
        Objects.equals(this.description, questionData.description) &&
        Objects.equals(this.sequenceNo, questionData.sequenceNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, responseDatas, componentKey, key, text, description, sequenceNo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    responseDatas: ").append(toIndentedString(responseDatas)).append("\n");
    sb.append("    componentKey: ").append(toIndentedString(componentKey)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
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


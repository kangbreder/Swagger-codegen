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
import io.swagger.client.model.ComponentData;
import io.swagger.client.model.QuestionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * SurveyData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class SurveyData {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("componentDatas")
  private List<ComponentData> componentDatas = null;

  @SerializedName("questionDatas")
  private List<QuestionData> questionDatas = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("validFrom")
  private OffsetDateTime validFrom = null;

  @SerializedName("validTo")
  private OffsetDateTime validTo = null;

  public SurveyData id(Long id) {
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

  public SurveyData componentDatas(List<ComponentData> componentDatas) {
    this.componentDatas = componentDatas;
    return this;
  }

  public SurveyData addComponentDatasItem(ComponentData componentDatasItem) {
    if (this.componentDatas == null) {
      this.componentDatas = new ArrayList<ComponentData>();
    }
    this.componentDatas.add(componentDatasItem);
    return this;
  }

   /**
   * Get componentDatas
   * @return componentDatas
  **/
  @ApiModelProperty(value = "")
  public List<ComponentData> getComponentDatas() {
    return componentDatas;
  }

  public void setComponentDatas(List<ComponentData> componentDatas) {
    this.componentDatas = componentDatas;
  }

  public SurveyData questionDatas(List<QuestionData> questionDatas) {
    this.questionDatas = questionDatas;
    return this;
  }

  public SurveyData addQuestionDatasItem(QuestionData questionDatasItem) {
    if (this.questionDatas == null) {
      this.questionDatas = new ArrayList<QuestionData>();
    }
    this.questionDatas.add(questionDatasItem);
    return this;
  }

   /**
   * Get questionDatas
   * @return questionDatas
  **/
  @ApiModelProperty(value = "")
  public List<QuestionData> getQuestionDatas() {
    return questionDatas;
  }

  public void setQuestionDatas(List<QuestionData> questionDatas) {
    this.questionDatas = questionDatas;
  }

  public SurveyData key(String key) {
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

  public SurveyData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SurveyData description(String description) {
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

  public SurveyData countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public SurveyData validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public SurveyData validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Get validTo
   * @return validTo
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyData surveyData = (SurveyData) o;
    return Objects.equals(this.id, surveyData.id) &&
        Objects.equals(this.componentDatas, surveyData.componentDatas) &&
        Objects.equals(this.questionDatas, surveyData.questionDatas) &&
        Objects.equals(this.key, surveyData.key) &&
        Objects.equals(this.name, surveyData.name) &&
        Objects.equals(this.description, surveyData.description) &&
        Objects.equals(this.countryCode, surveyData.countryCode) &&
        Objects.equals(this.validFrom, surveyData.validFrom) &&
        Objects.equals(this.validTo, surveyData.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, componentDatas, questionDatas, key, name, description, countryCode, validFrom, validTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    componentDatas: ").append(toIndentedString(componentDatas)).append("\n");
    sb.append("    questionDatas: ").append(toIndentedString(questionDatas)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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


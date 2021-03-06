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
import io.swagger.client.model.Grouping;
import io.swagger.client.model.HookTemplateData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetHookTemplateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetHookTemplateResponse {
  @SerializedName("templates")
  private List<HookTemplateData> templates = null;

  @SerializedName("groupings")
  private List<Grouping> groupings = null;

  public GetHookTemplateResponse templates(List<HookTemplateData> templates) {
    this.templates = templates;
    return this;
  }

  public GetHookTemplateResponse addTemplatesItem(HookTemplateData templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<HookTemplateData>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @ApiModelProperty(value = "")
  public List<HookTemplateData> getTemplates() {
    return templates;
  }

  public void setTemplates(List<HookTemplateData> templates) {
    this.templates = templates;
  }

  public GetHookTemplateResponse groupings(List<Grouping> groupings) {
    this.groupings = groupings;
    return this;
  }

  public GetHookTemplateResponse addGroupingsItem(Grouping groupingsItem) {
    if (this.groupings == null) {
      this.groupings = new ArrayList<Grouping>();
    }
    this.groupings.add(groupingsItem);
    return this;
  }

   /**
   * Get groupings
   * @return groupings
  **/
  @ApiModelProperty(value = "")
  public List<Grouping> getGroupings() {
    return groupings;
  }

  public void setGroupings(List<Grouping> groupings) {
    this.groupings = groupings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHookTemplateResponse getHookTemplateResponse = (GetHookTemplateResponse) o;
    return Objects.equals(this.templates, getHookTemplateResponse.templates) &&
        Objects.equals(this.groupings, getHookTemplateResponse.groupings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates, groupings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHookTemplateResponse {\n");
    
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    groupings: ").append(toIndentedString(groupings)).append("\n");
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


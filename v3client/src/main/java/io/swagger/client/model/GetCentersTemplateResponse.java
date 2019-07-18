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
import io.swagger.client.model.GetCentersOfficeOptions;
import io.swagger.client.model.GetCentersStaffOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * GetCentersTemplateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class GetCentersTemplateResponse {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("activationDate")
  private LocalDate activationDate = null;

  @SerializedName("officeId")
  private Integer officeId = null;

  @SerializedName("officeOptions")
  private List<GetCentersOfficeOptions> officeOptions = null;

  @SerializedName("staffOptions")
  private List<GetCentersStaffOptions> staffOptions = null;

  public GetCentersTemplateResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public GetCentersTemplateResponse activationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Get activationDate
   * @return activationDate
  **/
  @ApiModelProperty(example = "[2013, 4, 18]", value = "")
  public LocalDate getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
  }

  public GetCentersTemplateResponse officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public GetCentersTemplateResponse officeOptions(List<GetCentersOfficeOptions> officeOptions) {
    this.officeOptions = officeOptions;
    return this;
  }

  public GetCentersTemplateResponse addOfficeOptionsItem(GetCentersOfficeOptions officeOptionsItem) {
    if (this.officeOptions == null) {
      this.officeOptions = new ArrayList<GetCentersOfficeOptions>();
    }
    this.officeOptions.add(officeOptionsItem);
    return this;
  }

   /**
   * Get officeOptions
   * @return officeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetCentersOfficeOptions> getOfficeOptions() {
    return officeOptions;
  }

  public void setOfficeOptions(List<GetCentersOfficeOptions> officeOptions) {
    this.officeOptions = officeOptions;
  }

  public GetCentersTemplateResponse staffOptions(List<GetCentersStaffOptions> staffOptions) {
    this.staffOptions = staffOptions;
    return this;
  }

  public GetCentersTemplateResponse addStaffOptionsItem(GetCentersStaffOptions staffOptionsItem) {
    if (this.staffOptions == null) {
      this.staffOptions = new ArrayList<GetCentersStaffOptions>();
    }
    this.staffOptions.add(staffOptionsItem);
    return this;
  }

   /**
   * Get staffOptions
   * @return staffOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetCentersStaffOptions> getStaffOptions() {
    return staffOptions;
  }

  public void setStaffOptions(List<GetCentersStaffOptions> staffOptions) {
    this.staffOptions = staffOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCentersTemplateResponse getCentersTemplateResponse = (GetCentersTemplateResponse) o;
    return Objects.equals(this.active, getCentersTemplateResponse.active) &&
        Objects.equals(this.activationDate, getCentersTemplateResponse.activationDate) &&
        Objects.equals(this.officeId, getCentersTemplateResponse.officeId) &&
        Objects.equals(this.officeOptions, getCentersTemplateResponse.officeOptions) &&
        Objects.equals(this.staffOptions, getCentersTemplateResponse.staffOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, activationDate, officeId, officeOptions, staffOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCentersTemplateResponse {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeOptions: ").append(toIndentedString(officeOptions)).append("\n");
    sb.append("    staffOptions: ").append(toIndentedString(staffOptions)).append("\n");
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


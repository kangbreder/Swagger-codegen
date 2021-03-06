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
 * GetClientClientIdAddressesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetClientClientIdAddressesResponse {
  @SerializedName("client_id")
  private Long clientId = null;

  @SerializedName("addressType")
  private String addressType = null;

  @SerializedName("addressId")
  private Integer addressId = null;

  @SerializedName("addressTypeId")
  private Integer addressTypeId = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("addressLine1")
  private String addressLine1 = null;

  @SerializedName("addressLine2")
  private String addressLine2 = null;

  @SerializedName("addressLine3")
  private String addressLine3 = null;

  @SerializedName("townVillage")
  private String townVillage = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("countyDistrict")
  private String countyDistrict = null;

  @SerializedName("stateProvinceId")
  private Integer stateProvinceId = null;

  @SerializedName("countryName")
  private String countryName = null;

  @SerializedName("stateName")
  private String stateName = null;

  @SerializedName("countryId")
  private Integer countryId = null;

  @SerializedName("postalCode")
  private Long postalCode = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("updatedBy")
  private String updatedBy = null;

  public GetClientClientIdAddressesResponse clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "111755", value = "")
  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public GetClientClientIdAddressesResponse addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(example = "PERMANENT ADDRESS", value = "")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public GetClientClientIdAddressesResponse addressId(Integer addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Get addressId
   * @return addressId
  **/
  @ApiModelProperty(example = "14", value = "")
  public Integer getAddressId() {
    return addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }

  public GetClientClientIdAddressesResponse addressTypeId(Integer addressTypeId) {
    this.addressTypeId = addressTypeId;
    return this;
  }

   /**
   * Get addressTypeId
   * @return addressTypeId
  **/
  @ApiModelProperty(example = "804", value = "")
  public Integer getAddressTypeId() {
    return addressTypeId;
  }

  public void setAddressTypeId(Integer addressTypeId) {
    this.addressTypeId = addressTypeId;
  }

  public GetClientClientIdAddressesResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public GetClientClientIdAddressesResponse street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(example = "anki's home", value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public GetClientClientIdAddressesResponse addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @ApiModelProperty(example = "test123", value = "")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public GetClientClientIdAddressesResponse addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @ApiModelProperty(example = "iuyt", value = "")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public GetClientClientIdAddressesResponse addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Get addressLine3
   * @return addressLine3
  **/
  @ApiModelProperty(example = " ", value = "")
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public GetClientClientIdAddressesResponse townVillage(String townVillage) {
    this.townVillage = townVillage;
    return this;
  }

   /**
   * Get townVillage
   * @return townVillage
  **/
  @ApiModelProperty(example = " ", value = "")
  public String getTownVillage() {
    return townVillage;
  }

  public void setTownVillage(String townVillage) {
    this.townVillage = townVillage;
  }

  public GetClientClientIdAddressesResponse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "mumbai", value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GetClientClientIdAddressesResponse countyDistrict(String countyDistrict) {
    this.countyDistrict = countyDistrict;
    return this;
  }

   /**
   * Get countyDistrict
   * @return countyDistrict
  **/
  @ApiModelProperty(example = " ", value = "")
  public String getCountyDistrict() {
    return countyDistrict;
  }

  public void setCountyDistrict(String countyDistrict) {
    this.countyDistrict = countyDistrict;
  }

  public GetClientClientIdAddressesResponse stateProvinceId(Integer stateProvinceId) {
    this.stateProvinceId = stateProvinceId;
    return this;
  }

   /**
   * Get stateProvinceId
   * @return stateProvinceId
  **/
  @ApiModelProperty(example = "801", value = "")
  public Integer getStateProvinceId() {
    return stateProvinceId;
  }

  public void setStateProvinceId(Integer stateProvinceId) {
    this.stateProvinceId = stateProvinceId;
  }

  public GetClientClientIdAddressesResponse countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
  @ApiModelProperty(example = "UNITED STATES", value = "")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public GetClientClientIdAddressesResponse stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

   /**
   * Get stateName
   * @return stateName
  **/
  @ApiModelProperty(example = "GUJRAT", value = "")
  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public GetClientClientIdAddressesResponse countryId(Integer countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @ApiModelProperty(example = "807", value = "")
  public Integer getCountryId() {
    return countryId;
  }

  public void setCountryId(Integer countryId) {
    this.countryId = countryId;
  }

  public GetClientClientIdAddressesResponse postalCode(Long postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "400095", value = "")
  public Long getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(Long postalCode) {
    this.postalCode = postalCode;
  }

  public GetClientClientIdAddressesResponse createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = " ", value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public GetClientClientIdAddressesResponse updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @ApiModelProperty(example = " ", value = "")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientClientIdAddressesResponse getClientClientIdAddressesResponse = (GetClientClientIdAddressesResponse) o;
    return Objects.equals(this.clientId, getClientClientIdAddressesResponse.clientId) &&
        Objects.equals(this.addressType, getClientClientIdAddressesResponse.addressType) &&
        Objects.equals(this.addressId, getClientClientIdAddressesResponse.addressId) &&
        Objects.equals(this.addressTypeId, getClientClientIdAddressesResponse.addressTypeId) &&
        Objects.equals(this.isActive, getClientClientIdAddressesResponse.isActive) &&
        Objects.equals(this.street, getClientClientIdAddressesResponse.street) &&
        Objects.equals(this.addressLine1, getClientClientIdAddressesResponse.addressLine1) &&
        Objects.equals(this.addressLine2, getClientClientIdAddressesResponse.addressLine2) &&
        Objects.equals(this.addressLine3, getClientClientIdAddressesResponse.addressLine3) &&
        Objects.equals(this.townVillage, getClientClientIdAddressesResponse.townVillage) &&
        Objects.equals(this.city, getClientClientIdAddressesResponse.city) &&
        Objects.equals(this.countyDistrict, getClientClientIdAddressesResponse.countyDistrict) &&
        Objects.equals(this.stateProvinceId, getClientClientIdAddressesResponse.stateProvinceId) &&
        Objects.equals(this.countryName, getClientClientIdAddressesResponse.countryName) &&
        Objects.equals(this.stateName, getClientClientIdAddressesResponse.stateName) &&
        Objects.equals(this.countryId, getClientClientIdAddressesResponse.countryId) &&
        Objects.equals(this.postalCode, getClientClientIdAddressesResponse.postalCode) &&
        Objects.equals(this.createdBy, getClientClientIdAddressesResponse.createdBy) &&
        Objects.equals(this.updatedBy, getClientClientIdAddressesResponse.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, addressType, addressId, addressTypeId, isActive, street, addressLine1, addressLine2, addressLine3, townVillage, city, countyDistrict, stateProvinceId, countryName, stateName, countryId, postalCode, createdBy, updatedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientClientIdAddressesResponse {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    addressTypeId: ").append(toIndentedString(addressTypeId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    townVillage: ").append(toIndentedString(townVillage)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countyDistrict: ").append(toIndentedString(countyDistrict)).append("\n");
    sb.append("    stateProvinceId: ").append(toIndentedString(stateProvinceId)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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


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
import io.swagger.client.model.GetNotesNoteType;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * GetResourceTypeResourceIdNotesNoteIdResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetResourceTypeResourceIdNotesNoteIdResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("noteType")
  private GetNotesNoteType noteType = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("createdById")
  private Integer createdById = null;

  @SerializedName("createdByUsername")
  private String createdByUsername = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  @SerializedName("updatedById")
  private Integer updatedById = null;

  @SerializedName("updatedByUsername")
  private String updatedByUsername = null;

  @SerializedName("updatedOn")
  private OffsetDateTime updatedOn = null;

  public GetResourceTypeResourceIdNotesNoteIdResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "76", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetResourceTypeResourceIdNotesNoteIdResponse clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetResourceTypeResourceIdNotesNoteIdResponse noteType(GetNotesNoteType noteType) {
    this.noteType = noteType;
    return this;
  }

   /**
   * Get noteType
   * @return noteType
  **/
  @ApiModelProperty(value = "")
  public GetNotesNoteType getNoteType() {
    return noteType;
  }

  public void setNoteType(GetNotesNoteType noteType) {
    this.noteType = noteType;
  }

  public GetResourceTypeResourceIdNotesNoteIdResponse note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(example = "a note about the client", value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public GetResourceTypeResourceIdNotesNoteIdResponse createdById(Integer createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getCreatedById() {
    return createdById;
  }

  public void setCreatedById(Integer createdById) {
    this.createdById = createdById;
  }

  public GetResourceTypeResourceIdNotesNoteIdResponse createdByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
    return this;
  }

   /**
   * Get createdByUsername
   * @return createdByUsername
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getCreatedByUsername() {
    return createdByUsername;
  }

  public void setCreatedByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
  }

  public GetResourceTypeResourceIdNotesNoteIdResponse createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "1359463135000", value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public GetResourceTypeResourceIdNotesNoteIdResponse updatedById(Integer updatedById) {
    this.updatedById = updatedById;
    return this;
  }

   /**
   * Get updatedById
   * @return updatedById
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getUpdatedById() {
    return updatedById;
  }

  public void setUpdatedById(Integer updatedById) {
    this.updatedById = updatedById;
  }

  public GetResourceTypeResourceIdNotesNoteIdResponse updatedByUsername(String updatedByUsername) {
    this.updatedByUsername = updatedByUsername;
    return this;
  }

   /**
   * Get updatedByUsername
   * @return updatedByUsername
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getUpdatedByUsername() {
    return updatedByUsername;
  }

  public void setUpdatedByUsername(String updatedByUsername) {
    this.updatedByUsername = updatedByUsername;
  }

  public GetResourceTypeResourceIdNotesNoteIdResponse updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @ApiModelProperty(example = "1359463135000", value = "")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetResourceTypeResourceIdNotesNoteIdResponse getResourceTypeResourceIdNotesNoteIdResponse = (GetResourceTypeResourceIdNotesNoteIdResponse) o;
    return Objects.equals(this.id, getResourceTypeResourceIdNotesNoteIdResponse.id) &&
        Objects.equals(this.clientId, getResourceTypeResourceIdNotesNoteIdResponse.clientId) &&
        Objects.equals(this.noteType, getResourceTypeResourceIdNotesNoteIdResponse.noteType) &&
        Objects.equals(this.note, getResourceTypeResourceIdNotesNoteIdResponse.note) &&
        Objects.equals(this.createdById, getResourceTypeResourceIdNotesNoteIdResponse.createdById) &&
        Objects.equals(this.createdByUsername, getResourceTypeResourceIdNotesNoteIdResponse.createdByUsername) &&
        Objects.equals(this.createdOn, getResourceTypeResourceIdNotesNoteIdResponse.createdOn) &&
        Objects.equals(this.updatedById, getResourceTypeResourceIdNotesNoteIdResponse.updatedById) &&
        Objects.equals(this.updatedByUsername, getResourceTypeResourceIdNotesNoteIdResponse.updatedByUsername) &&
        Objects.equals(this.updatedOn, getResourceTypeResourceIdNotesNoteIdResponse.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, noteType, note, createdById, createdByUsername, createdOn, updatedById, updatedByUsername, updatedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetResourceTypeResourceIdNotesNoteIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    noteType: ").append(toIndentedString(noteType)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    createdByUsername: ").append(toIndentedString(createdByUsername)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedById: ").append(toIndentedString(updatedById)).append("\n");
    sb.append("    updatedByUsername: ").append(toIndentedString(updatedByUsername)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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


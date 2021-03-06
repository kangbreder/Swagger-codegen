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
import org.threeten.bp.LocalDate;

/**
 * GetTellersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class GetTellersResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("debitAccountId")
  private Long debitAccountId = null;

  @SerializedName("creditAccountId")
  private Long creditAccountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    INVALID("INVALID"),
    
    PENDING("PENDING"),
    
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    CLOSED("CLOSED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("officeName")
  private String officeName = null;

  public GetTellersResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "3", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetTellersResponse officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public GetTellersResponse debitAccountId(Long debitAccountId) {
    this.debitAccountId = debitAccountId;
    return this;
  }

   /**
   * Get debitAccountId
   * @return debitAccountId
  **/
  @ApiModelProperty(example = "0", value = "")
  public Long getDebitAccountId() {
    return debitAccountId;
  }

  public void setDebitAccountId(Long debitAccountId) {
    this.debitAccountId = debitAccountId;
  }

  public GetTellersResponse creditAccountId(Long creditAccountId) {
    this.creditAccountId = creditAccountId;
    return this;
  }

   /**
   * Get creditAccountId
   * @return creditAccountId
  **/
  @ApiModelProperty(example = "0", value = "")
  public Long getCreditAccountId() {
    return creditAccountId;
  }

  public void setCreditAccountId(Long creditAccountId) {
    this.creditAccountId = creditAccountId;
  }

  public GetTellersResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Teller3", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetTellersResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "[2015,2,1]", value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public GetTellersResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "ACTIVE", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GetTellersResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @ApiModelProperty(example = "Head Office", value = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTellersResponse getTellersResponse = (GetTellersResponse) o;
    return Objects.equals(this.id, getTellersResponse.id) &&
        Objects.equals(this.officeId, getTellersResponse.officeId) &&
        Objects.equals(this.debitAccountId, getTellersResponse.debitAccountId) &&
        Objects.equals(this.creditAccountId, getTellersResponse.creditAccountId) &&
        Objects.equals(this.name, getTellersResponse.name) &&
        Objects.equals(this.startDate, getTellersResponse.startDate) &&
        Objects.equals(this.status, getTellersResponse.status) &&
        Objects.equals(this.officeName, getTellersResponse.officeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, officeId, debitAccountId, creditAccountId, name, startDate, status, officeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTellersResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    debitAccountId: ").append(toIndentedString(debitAccountId)).append("\n");
    sb.append("    creditAccountId: ").append(toIndentedString(creditAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
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


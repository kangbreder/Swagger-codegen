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
import io.swagger.client.model.AppUser;
import io.swagger.client.model.GLAccount;
import io.swagger.client.model.TaxComponentHistory;
import io.swagger.client.model.TaxGroupMappings;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * TaxComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:34:25.795+01:00")
public class TaxComponent {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("createdBy")
  private AppUser createdBy = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("lastModifiedBy")
  private AppUser lastModifiedBy = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("percentage")
  private BigDecimal percentage = null;

  @SerializedName("debitAccountType")
  private Integer debitAccountType = null;

  @SerializedName("debitAcount")
  private GLAccount debitAcount = null;

  @SerializedName("creditAccountType")
  private Integer creditAccountType = null;

  @SerializedName("creditAcount")
  private GLAccount creditAcount = null;

  @SerializedName("taxComponentHistories")
  private List<TaxComponentHistory> taxComponentHistories = null;

  @SerializedName("taxGroupMappings")
  private List<TaxGroupMappings> taxGroupMappings = null;

  @SerializedName("new")
  private Boolean _new = null;

  public TaxComponent id(Long id) {
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

  public TaxComponent createdBy(AppUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public AppUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(AppUser createdBy) {
    this.createdBy = createdBy;
  }

  public TaxComponent createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public TaxComponent lastModifiedBy(AppUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public AppUser getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(AppUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public TaxComponent lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public TaxComponent percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }

  public TaxComponent debitAccountType(Integer debitAccountType) {
    this.debitAccountType = debitAccountType;
    return this;
  }

   /**
   * Get debitAccountType
   * @return debitAccountType
  **/
  @ApiModelProperty(value = "")
  public Integer getDebitAccountType() {
    return debitAccountType;
  }

  public void setDebitAccountType(Integer debitAccountType) {
    this.debitAccountType = debitAccountType;
  }

  public TaxComponent debitAcount(GLAccount debitAcount) {
    this.debitAcount = debitAcount;
    return this;
  }

   /**
   * Get debitAcount
   * @return debitAcount
  **/
  @ApiModelProperty(value = "")
  public GLAccount getDebitAcount() {
    return debitAcount;
  }

  public void setDebitAcount(GLAccount debitAcount) {
    this.debitAcount = debitAcount;
  }

  public TaxComponent creditAccountType(Integer creditAccountType) {
    this.creditAccountType = creditAccountType;
    return this;
  }

   /**
   * Get creditAccountType
   * @return creditAccountType
  **/
  @ApiModelProperty(value = "")
  public Integer getCreditAccountType() {
    return creditAccountType;
  }

  public void setCreditAccountType(Integer creditAccountType) {
    this.creditAccountType = creditAccountType;
  }

  public TaxComponent creditAcount(GLAccount creditAcount) {
    this.creditAcount = creditAcount;
    return this;
  }

   /**
   * Get creditAcount
   * @return creditAcount
  **/
  @ApiModelProperty(value = "")
  public GLAccount getCreditAcount() {
    return creditAcount;
  }

  public void setCreditAcount(GLAccount creditAcount) {
    this.creditAcount = creditAcount;
  }

  public TaxComponent taxComponentHistories(List<TaxComponentHistory> taxComponentHistories) {
    this.taxComponentHistories = taxComponentHistories;
    return this;
  }

  public TaxComponent addTaxComponentHistoriesItem(TaxComponentHistory taxComponentHistoriesItem) {
    if (this.taxComponentHistories == null) {
      this.taxComponentHistories = new ArrayList<TaxComponentHistory>();
    }
    this.taxComponentHistories.add(taxComponentHistoriesItem);
    return this;
  }

   /**
   * Get taxComponentHistories
   * @return taxComponentHistories
  **/
  @ApiModelProperty(value = "")
  public List<TaxComponentHistory> getTaxComponentHistories() {
    return taxComponentHistories;
  }

  public void setTaxComponentHistories(List<TaxComponentHistory> taxComponentHistories) {
    this.taxComponentHistories = taxComponentHistories;
  }

  public TaxComponent taxGroupMappings(List<TaxGroupMappings> taxGroupMappings) {
    this.taxGroupMappings = taxGroupMappings;
    return this;
  }

  public TaxComponent addTaxGroupMappingsItem(TaxGroupMappings taxGroupMappingsItem) {
    if (this.taxGroupMappings == null) {
      this.taxGroupMappings = new ArrayList<TaxGroupMappings>();
    }
    this.taxGroupMappings.add(taxGroupMappingsItem);
    return this;
  }

   /**
   * Get taxGroupMappings
   * @return taxGroupMappings
  **/
  @ApiModelProperty(value = "")
  public List<TaxGroupMappings> getTaxGroupMappings() {
    return taxGroupMappings;
  }

  public void setTaxGroupMappings(List<TaxGroupMappings> taxGroupMappings) {
    this.taxGroupMappings = taxGroupMappings;
  }

  public TaxComponent _new(Boolean _new) {
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
    TaxComponent taxComponent = (TaxComponent) o;
    return Objects.equals(this.id, taxComponent.id) &&
        Objects.equals(this.createdBy, taxComponent.createdBy) &&
        Objects.equals(this.createdDate, taxComponent.createdDate) &&
        Objects.equals(this.lastModifiedBy, taxComponent.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, taxComponent.lastModifiedDate) &&
        Objects.equals(this.percentage, taxComponent.percentage) &&
        Objects.equals(this.debitAccountType, taxComponent.debitAccountType) &&
        Objects.equals(this.debitAcount, taxComponent.debitAcount) &&
        Objects.equals(this.creditAccountType, taxComponent.creditAccountType) &&
        Objects.equals(this.creditAcount, taxComponent.creditAcount) &&
        Objects.equals(this.taxComponentHistories, taxComponent.taxComponentHistories) &&
        Objects.equals(this.taxGroupMappings, taxComponent.taxGroupMappings) &&
        Objects.equals(this._new, taxComponent._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, createdDate, lastModifiedBy, lastModifiedDate, percentage, debitAccountType, debitAcount, creditAccountType, creditAcount, taxComponentHistories, taxGroupMappings, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxComponent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    debitAccountType: ").append(toIndentedString(debitAccountType)).append("\n");
    sb.append("    debitAcount: ").append(toIndentedString(debitAcount)).append("\n");
    sb.append("    creditAccountType: ").append(toIndentedString(creditAccountType)).append("\n");
    sb.append("    creditAcount: ").append(toIndentedString(creditAcount)).append("\n");
    sb.append("    taxComponentHistories: ").append(toIndentedString(taxComponentHistories)).append("\n");
    sb.append("    taxGroupMappings: ").append(toIndentedString(taxGroupMappings)).append("\n");
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


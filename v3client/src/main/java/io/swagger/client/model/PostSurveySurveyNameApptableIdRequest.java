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
import org.threeten.bp.OffsetDateTime;

/**
 * PostSurveySurveyNameApptableIdRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T20:32:31.746+01:00")
public class PostSurveySurveyNameApptableIdRequest {
  @SerializedName("ppi_household_members_cd_q1_householdmembers")
  private Long ppiHouseholdMembersCdQ1Householdmembers = null;

  @SerializedName("ppi_highestschool_cd_q2_highestschool")
  private Long ppiHighestschoolCdQ2Highestschool = null;

  @SerializedName("ppi_businessoccupation_cd_q3_businessoccupation")
  private Long ppiBusinessoccupationCdQ3Businessoccupation = null;

  @SerializedName("ppi_habitablerooms_cd_q4_habitablerooms")
  private Long ppiHabitableroomsCdQ4Habitablerooms = null;

  @SerializedName("ppi_floortype_cd_q5_floortype")
  private Long ppiFloortypeCdQ5Floortype = null;

  @SerializedName("ppi_lightingsource_cd_q6_lightingsource")
  private Long ppiLightingsourceCdQ6Lightingsource = null;

  @SerializedName("ppi_irons_cd_q7_irons")
  private Long ppiIronsCdQ7Irons = null;

  @SerializedName("ppi_mosquitonets_cd_q8_mosquitonets")
  private Long ppiMosquitonetsCdQ8Mosquitonets = null;

  @SerializedName("ppi_towels_cd_q9_towels")
  private Long ppiTowelsCdQ9Towels = null;

  @SerializedName("ppi_fryingpans_cd_q10_fryingpans")
  private Long ppiFryingpansCdQ10Fryingpans = null;

  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("dateFormat")
  private OffsetDateTime dateFormat = null;

  @SerializedName("locale")
  private String locale = null;

  public PostSurveySurveyNameApptableIdRequest ppiHouseholdMembersCdQ1Householdmembers(Long ppiHouseholdMembersCdQ1Householdmembers) {
    this.ppiHouseholdMembersCdQ1Householdmembers = ppiHouseholdMembersCdQ1Householdmembers;
    return this;
  }

   /**
   * Get ppiHouseholdMembersCdQ1Householdmembers
   * @return ppiHouseholdMembersCdQ1Householdmembers
  **/
  @ApiModelProperty(example = "167", value = "")
  public Long getPpiHouseholdMembersCdQ1Householdmembers() {
    return ppiHouseholdMembersCdQ1Householdmembers;
  }

  public void setPpiHouseholdMembersCdQ1Householdmembers(Long ppiHouseholdMembersCdQ1Householdmembers) {
    this.ppiHouseholdMembersCdQ1Householdmembers = ppiHouseholdMembersCdQ1Householdmembers;
  }

  public PostSurveySurveyNameApptableIdRequest ppiHighestschoolCdQ2Highestschool(Long ppiHighestschoolCdQ2Highestschool) {
    this.ppiHighestschoolCdQ2Highestschool = ppiHighestschoolCdQ2Highestschool;
    return this;
  }

   /**
   * Get ppiHighestschoolCdQ2Highestschool
   * @return ppiHighestschoolCdQ2Highestschool
  **/
  @ApiModelProperty(example = "174", value = "")
  public Long getPpiHighestschoolCdQ2Highestschool() {
    return ppiHighestschoolCdQ2Highestschool;
  }

  public void setPpiHighestschoolCdQ2Highestschool(Long ppiHighestschoolCdQ2Highestschool) {
    this.ppiHighestschoolCdQ2Highestschool = ppiHighestschoolCdQ2Highestschool;
  }

  public PostSurveySurveyNameApptableIdRequest ppiBusinessoccupationCdQ3Businessoccupation(Long ppiBusinessoccupationCdQ3Businessoccupation) {
    this.ppiBusinessoccupationCdQ3Businessoccupation = ppiBusinessoccupationCdQ3Businessoccupation;
    return this;
  }

   /**
   * Get ppiBusinessoccupationCdQ3Businessoccupation
   * @return ppiBusinessoccupationCdQ3Businessoccupation
  **/
  @ApiModelProperty(example = "180", value = "")
  public Long getPpiBusinessoccupationCdQ3Businessoccupation() {
    return ppiBusinessoccupationCdQ3Businessoccupation;
  }

  public void setPpiBusinessoccupationCdQ3Businessoccupation(Long ppiBusinessoccupationCdQ3Businessoccupation) {
    this.ppiBusinessoccupationCdQ3Businessoccupation = ppiBusinessoccupationCdQ3Businessoccupation;
  }

  public PostSurveySurveyNameApptableIdRequest ppiHabitableroomsCdQ4Habitablerooms(Long ppiHabitableroomsCdQ4Habitablerooms) {
    this.ppiHabitableroomsCdQ4Habitablerooms = ppiHabitableroomsCdQ4Habitablerooms;
    return this;
  }

   /**
   * Get ppiHabitableroomsCdQ4Habitablerooms
   * @return ppiHabitableroomsCdQ4Habitablerooms
  **/
  @ApiModelProperty(example = "184", value = "")
  public Long getPpiHabitableroomsCdQ4Habitablerooms() {
    return ppiHabitableroomsCdQ4Habitablerooms;
  }

  public void setPpiHabitableroomsCdQ4Habitablerooms(Long ppiHabitableroomsCdQ4Habitablerooms) {
    this.ppiHabitableroomsCdQ4Habitablerooms = ppiHabitableroomsCdQ4Habitablerooms;
  }

  public PostSurveySurveyNameApptableIdRequest ppiFloortypeCdQ5Floortype(Long ppiFloortypeCdQ5Floortype) {
    this.ppiFloortypeCdQ5Floortype = ppiFloortypeCdQ5Floortype;
    return this;
  }

   /**
   * Get ppiFloortypeCdQ5Floortype
   * @return ppiFloortypeCdQ5Floortype
  **/
  @ApiModelProperty(example = "188", value = "")
  public Long getPpiFloortypeCdQ5Floortype() {
    return ppiFloortypeCdQ5Floortype;
  }

  public void setPpiFloortypeCdQ5Floortype(Long ppiFloortypeCdQ5Floortype) {
    this.ppiFloortypeCdQ5Floortype = ppiFloortypeCdQ5Floortype;
  }

  public PostSurveySurveyNameApptableIdRequest ppiLightingsourceCdQ6Lightingsource(Long ppiLightingsourceCdQ6Lightingsource) {
    this.ppiLightingsourceCdQ6Lightingsource = ppiLightingsourceCdQ6Lightingsource;
    return this;
  }

   /**
   * Get ppiLightingsourceCdQ6Lightingsource
   * @return ppiLightingsourceCdQ6Lightingsource
  **/
  @ApiModelProperty(example = "190", value = "")
  public Long getPpiLightingsourceCdQ6Lightingsource() {
    return ppiLightingsourceCdQ6Lightingsource;
  }

  public void setPpiLightingsourceCdQ6Lightingsource(Long ppiLightingsourceCdQ6Lightingsource) {
    this.ppiLightingsourceCdQ6Lightingsource = ppiLightingsourceCdQ6Lightingsource;
  }

  public PostSurveySurveyNameApptableIdRequest ppiIronsCdQ7Irons(Long ppiIronsCdQ7Irons) {
    this.ppiIronsCdQ7Irons = ppiIronsCdQ7Irons;
    return this;
  }

   /**
   * Get ppiIronsCdQ7Irons
   * @return ppiIronsCdQ7Irons
  **/
  @ApiModelProperty(example = "193", value = "")
  public Long getPpiIronsCdQ7Irons() {
    return ppiIronsCdQ7Irons;
  }

  public void setPpiIronsCdQ7Irons(Long ppiIronsCdQ7Irons) {
    this.ppiIronsCdQ7Irons = ppiIronsCdQ7Irons;
  }

  public PostSurveySurveyNameApptableIdRequest ppiMosquitonetsCdQ8Mosquitonets(Long ppiMosquitonetsCdQ8Mosquitonets) {
    this.ppiMosquitonetsCdQ8Mosquitonets = ppiMosquitonetsCdQ8Mosquitonets;
    return this;
  }

   /**
   * Get ppiMosquitonetsCdQ8Mosquitonets
   * @return ppiMosquitonetsCdQ8Mosquitonets
  **/
  @ApiModelProperty(example = "195", value = "")
  public Long getPpiMosquitonetsCdQ8Mosquitonets() {
    return ppiMosquitonetsCdQ8Mosquitonets;
  }

  public void setPpiMosquitonetsCdQ8Mosquitonets(Long ppiMosquitonetsCdQ8Mosquitonets) {
    this.ppiMosquitonetsCdQ8Mosquitonets = ppiMosquitonetsCdQ8Mosquitonets;
  }

  public PostSurveySurveyNameApptableIdRequest ppiTowelsCdQ9Towels(Long ppiTowelsCdQ9Towels) {
    this.ppiTowelsCdQ9Towels = ppiTowelsCdQ9Towels;
    return this;
  }

   /**
   * Get ppiTowelsCdQ9Towels
   * @return ppiTowelsCdQ9Towels
  **/
  @ApiModelProperty(example = "198", value = "")
  public Long getPpiTowelsCdQ9Towels() {
    return ppiTowelsCdQ9Towels;
  }

  public void setPpiTowelsCdQ9Towels(Long ppiTowelsCdQ9Towels) {
    this.ppiTowelsCdQ9Towels = ppiTowelsCdQ9Towels;
  }

  public PostSurveySurveyNameApptableIdRequest ppiFryingpansCdQ10Fryingpans(Long ppiFryingpansCdQ10Fryingpans) {
    this.ppiFryingpansCdQ10Fryingpans = ppiFryingpansCdQ10Fryingpans;
    return this;
  }

   /**
   * Get ppiFryingpansCdQ10Fryingpans
   * @return ppiFryingpansCdQ10Fryingpans
  **/
  @ApiModelProperty(example = "201", value = "")
  public Long getPpiFryingpansCdQ10Fryingpans() {
    return ppiFryingpansCdQ10Fryingpans;
  }

  public void setPpiFryingpansCdQ10Fryingpans(Long ppiFryingpansCdQ10Fryingpans) {
    this.ppiFryingpansCdQ10Fryingpans = ppiFryingpansCdQ10Fryingpans;
  }

  public PostSurveySurveyNameApptableIdRequest date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "2014-12-02 20:30:00", value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public PostSurveySurveyNameApptableIdRequest dateFormat(OffsetDateTime dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @ApiModelProperty(example = "Y-m-d H:i:s", value = "")
  public OffsetDateTime getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(OffsetDateTime dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostSurveySurveyNameApptableIdRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "en_GB", value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSurveySurveyNameApptableIdRequest postSurveySurveyNameApptableIdRequest = (PostSurveySurveyNameApptableIdRequest) o;
    return Objects.equals(this.ppiHouseholdMembersCdQ1Householdmembers, postSurveySurveyNameApptableIdRequest.ppiHouseholdMembersCdQ1Householdmembers) &&
        Objects.equals(this.ppiHighestschoolCdQ2Highestschool, postSurveySurveyNameApptableIdRequest.ppiHighestschoolCdQ2Highestschool) &&
        Objects.equals(this.ppiBusinessoccupationCdQ3Businessoccupation, postSurveySurveyNameApptableIdRequest.ppiBusinessoccupationCdQ3Businessoccupation) &&
        Objects.equals(this.ppiHabitableroomsCdQ4Habitablerooms, postSurveySurveyNameApptableIdRequest.ppiHabitableroomsCdQ4Habitablerooms) &&
        Objects.equals(this.ppiFloortypeCdQ5Floortype, postSurveySurveyNameApptableIdRequest.ppiFloortypeCdQ5Floortype) &&
        Objects.equals(this.ppiLightingsourceCdQ6Lightingsource, postSurveySurveyNameApptableIdRequest.ppiLightingsourceCdQ6Lightingsource) &&
        Objects.equals(this.ppiIronsCdQ7Irons, postSurveySurveyNameApptableIdRequest.ppiIronsCdQ7Irons) &&
        Objects.equals(this.ppiMosquitonetsCdQ8Mosquitonets, postSurveySurveyNameApptableIdRequest.ppiMosquitonetsCdQ8Mosquitonets) &&
        Objects.equals(this.ppiTowelsCdQ9Towels, postSurveySurveyNameApptableIdRequest.ppiTowelsCdQ9Towels) &&
        Objects.equals(this.ppiFryingpansCdQ10Fryingpans, postSurveySurveyNameApptableIdRequest.ppiFryingpansCdQ10Fryingpans) &&
        Objects.equals(this.date, postSurveySurveyNameApptableIdRequest.date) &&
        Objects.equals(this.dateFormat, postSurveySurveyNameApptableIdRequest.dateFormat) &&
        Objects.equals(this.locale, postSurveySurveyNameApptableIdRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ppiHouseholdMembersCdQ1Householdmembers, ppiHighestschoolCdQ2Highestschool, ppiBusinessoccupationCdQ3Businessoccupation, ppiHabitableroomsCdQ4Habitablerooms, ppiFloortypeCdQ5Floortype, ppiLightingsourceCdQ6Lightingsource, ppiIronsCdQ7Irons, ppiMosquitonetsCdQ8Mosquitonets, ppiTowelsCdQ9Towels, ppiFryingpansCdQ10Fryingpans, date, dateFormat, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSurveySurveyNameApptableIdRequest {\n");
    
    sb.append("    ppiHouseholdMembersCdQ1Householdmembers: ").append(toIndentedString(ppiHouseholdMembersCdQ1Householdmembers)).append("\n");
    sb.append("    ppiHighestschoolCdQ2Highestschool: ").append(toIndentedString(ppiHighestschoolCdQ2Highestschool)).append("\n");
    sb.append("    ppiBusinessoccupationCdQ3Businessoccupation: ").append(toIndentedString(ppiBusinessoccupationCdQ3Businessoccupation)).append("\n");
    sb.append("    ppiHabitableroomsCdQ4Habitablerooms: ").append(toIndentedString(ppiHabitableroomsCdQ4Habitablerooms)).append("\n");
    sb.append("    ppiFloortypeCdQ5Floortype: ").append(toIndentedString(ppiFloortypeCdQ5Floortype)).append("\n");
    sb.append("    ppiLightingsourceCdQ6Lightingsource: ").append(toIndentedString(ppiLightingsourceCdQ6Lightingsource)).append("\n");
    sb.append("    ppiIronsCdQ7Irons: ").append(toIndentedString(ppiIronsCdQ7Irons)).append("\n");
    sb.append("    ppiMosquitonetsCdQ8Mosquitonets: ").append(toIndentedString(ppiMosquitonetsCdQ8Mosquitonets)).append("\n");
    sb.append("    ppiTowelsCdQ9Towels: ").append(toIndentedString(ppiTowelsCdQ9Towels)).append("\n");
    sb.append("    ppiFryingpansCdQ10Fryingpans: ").append(toIndentedString(ppiFryingpansCdQ10Fryingpans)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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


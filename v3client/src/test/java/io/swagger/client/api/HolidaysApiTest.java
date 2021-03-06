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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DeleteHolidaysHolidayIdResponse;
import io.swagger.client.model.GetHolidaysResponse;
import io.swagger.client.model.PostHolidaysHolidayIdRequest;
import io.swagger.client.model.PostHolidaysHolidayIdResponse;
import io.swagger.client.model.PostHolidaysRequest;
import io.swagger.client.model.PostHolidaysResponse;
import io.swagger.client.model.PutHolidaysHolidayIdRequest;
import io.swagger.client.model.PutHolidaysHolidayIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HolidaysApi
 */
@Ignore
public class HolidaysApiTest {

    private final HolidaysApi api = new HolidaysApi();

    
    /**
     * Create a Holiday
     *
     * Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewHolidayTest() throws ApiException {
        PostHolidaysRequest body = null;
        PostHolidaysResponse response = api.createNewHoliday(body);

        // TODO: test validations
    }
    
    /**
     * Delete a Holiday
     *
     * This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Long holidayId = null;
        DeleteHolidaysHolidayIdResponse response = api.delete(holidayId);

        // TODO: test validations
    }
    
    /**
     * Activate a Holiday
     *
     * Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void handleCommandsTest() throws ApiException {
        Long holidayId = null;
        PostHolidaysHolidayIdRequest body = null;
        String command = null;
        PostHolidaysHolidayIdResponse response = api.handleCommands(holidayId, body, command);

        // TODO: test validations
    }
    
    /**
     * List Holidays
     *
     * Example Requests:  holidays?officeId&#x3D;1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllHolidaysTest() throws ApiException {
        Long officeId = null;
        String fromDate = null;
        String toDate = null;
        String locale = null;
        String dateFormat = null;
        List<GetHolidaysResponse> response = api.retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Holiday
     *
     * Example Requests:  holidays/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOneTest() throws ApiException {
        Long holidayId = null;
        GetHolidaysResponse response = api.retrieveOne(holidayId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveRepaymentScheduleUpdationTyeOptionsTest() throws ApiException {
        String response = api.retrieveRepaymentScheduleUpdationTyeOptions();

        // TODO: test validations
    }
    
    /**
     * Update a Holiday
     *
     * If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        Long holidayId = null;
        PutHolidaysHolidayIdRequest body = null;
        PutHolidaysHolidayIdResponse response = api.update(holidayId, body);

        // TODO: test validations
    }
    
}

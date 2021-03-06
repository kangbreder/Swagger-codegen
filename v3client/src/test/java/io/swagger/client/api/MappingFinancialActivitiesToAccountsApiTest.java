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
import io.swagger.client.model.DeleteFinancialActivityAccountsResponse;
import io.swagger.client.model.GetFinancialActivityAccountsResponse;
import io.swagger.client.model.PostFinancialActivityAccountsRequest;
import io.swagger.client.model.PostFinancialActivityAccountsResponse;
import io.swagger.client.model.PutFinancialActivityAccountsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MappingFinancialActivitiesToAccountsApi
 */
@Ignore
public class MappingFinancialActivitiesToAccountsApiTest {

    private final MappingFinancialActivitiesToAccountsApi api = new MappingFinancialActivitiesToAccountsApi();

    
    /**
     * Create a new Financial Activity to Accounts Mapping
     *
     * Mandatory Fields financialActivityId, glAccountId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGLAccountTest() throws ApiException {
        PostFinancialActivityAccountsRequest body = null;
        PostFinancialActivityAccountsResponse response = api.createGLAccount(body);

        // TODO: test validations
    }
    
    /**
     * Delete a Financial Activity to Account Mapping
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGLAccountTest() throws ApiException {
        Long mappingId = null;
        DeleteFinancialActivityAccountsResponse response = api.deleteGLAccount(mappingId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Financial Activity to Account Mapping 
     *
     * Example Requests:  financialactivityaccounts/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retreiveTest() throws ApiException {
        Long mappingId = null;
        GetFinancialActivityAccountsResponse response = api.retreive(mappingId);

        // TODO: test validations
    }
    
    /**
     * List Financial Activities to Accounts Mappings
     *
     * Example Requests:  financialactivityaccounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllTest() throws ApiException {
        List<GetFinancialActivityAccountsResponse> response = api.retrieveAll();

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
    public void retrieveTemplateTest() throws ApiException {
        String response = api.retrieveTemplate();

        // TODO: test validations
    }
    
    /**
     * Update a Financial Activity to Account Mapping
     *
     * the API updates the Ledger account linked to a Financial Activity  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGLAccountTest() throws ApiException {
        Long mappingId = null;
        PostFinancialActivityAccountsRequest body = null;
        PutFinancialActivityAccountsResponse response = api.updateGLAccount(mappingId, body);

        // TODO: test validations
    }
    
}

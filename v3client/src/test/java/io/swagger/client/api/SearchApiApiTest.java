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
import io.swagger.client.model.GetSearchResponse;
import io.swagger.client.model.PostAdhocQuerySearchRequest;
import io.swagger.client.model.PostAdhocQuerySearchResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApiApi
 */
@Ignore
public class SearchApiApiTest {

    private final SearchApiApi api = new SearchApiApi();

    
    /**
     * Adhoc query search
     *
     * AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void advancedSearchTest() throws ApiException {
        PostAdhocQuerySearchRequest body2 = null;
        String body = null;
        PostAdhocQuerySearchResponse response = api.advancedSearch(body2, body);

        // TODO: test validations
    }
    
    /**
     * Retrive Adhoc Search query template
     *
     * Mandatory Fields  search?query&#x3D;000000001 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAdHocSearchQueryTemplateTest() throws ApiException {
        GetSearchResponse response = api.retrieveAdHocSearchQueryTemplate();

        // TODO: test validations
    }
    
    /**
     * Search Resources
     *
     * Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDataTest() throws ApiException {
        String query = null;
        String resource = null;
        Boolean exactMatch = null;
        GetSearchResponse response = api.searchData(query, resource, exactMatch);

        // TODO: test validations
    }
    
}

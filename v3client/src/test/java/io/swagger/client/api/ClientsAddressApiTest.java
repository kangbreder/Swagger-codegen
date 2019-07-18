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
import io.swagger.client.model.GetClientClientIdAddressesResponse;
import io.swagger.client.model.PostClientClientIdAddressesRequest;
import io.swagger.client.model.PostClientClientIdAddressesResponse;
import io.swagger.client.model.PutClientClientIdAddressesRequest;
import io.swagger.client.model.PutClientClientIdAddressesResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientsAddressApi
 */
@Ignore
public class ClientsAddressApiTest {

    private final ClientsAddressApi api = new ClientsAddressApi();

    
    /**
     * Create an address for a Client
     *
     * Mandatory Fields :  type and clientId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addClientAddressTest() throws ApiException {
        Long clientid = null;
        PostClientClientIdAddressesRequest body = null;
        Long type = null;
        PostClientClientIdAddressesResponse response = api.addClientAddress(clientid, body, type);

        // TODO: test validations
    }
    
    /**
     * List all addresses for a Client
     *
     * Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressesTest() throws ApiException {
        Long clientid = null;
        String status = null;
        Long type = null;
        List<GetClientClientIdAddressesResponse> response = api.getAddresses(clientid, status, type);

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
    public void getAddressesTemplateTest() throws ApiException {
        String response = api.getAddressesTemplate();

        // TODO: test validations
    }
    
    /**
     * Update an address for a Client
     *
     * All the address fields can be updated by using update client address API  Mandatory Fields type and addressId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateClientAddressTest() throws ApiException {
        Long clientid = null;
        PutClientClientIdAddressesRequest body = null;
        PutClientClientIdAddressesResponse response = api.updateClientAddress(clientid, body);

        // TODO: test validations
    }
    
}

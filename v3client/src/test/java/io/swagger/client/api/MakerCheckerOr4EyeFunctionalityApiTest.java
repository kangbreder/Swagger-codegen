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
import io.swagger.client.model.GetMakerCheckerResponse;
import io.swagger.client.model.GetMakerCheckersSearchTemplateResponse;
import io.swagger.client.model.PostMakerCheckersResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MakerCheckerOr4EyeFunctionalityApi
 */
@Ignore
public class MakerCheckerOr4EyeFunctionalityApiTest {

    private final MakerCheckerOr4EyeFunctionalityApi api = new MakerCheckerOr4EyeFunctionalityApi();

    
    /**
     * Approve Maker Checker Entry | Reject Maker Checker Entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void approveMakerCheckerEntryTest() throws ApiException {
        Long auditId = null;
        String command = null;
        PostMakerCheckersResponse response = api.approveMakerCheckerEntry(auditId, command);

        // TODO: test validations
    }
    
    /**
     * Delete Maker Checker Entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMakerCheckerEntryTest() throws ApiException {
        Long auditId = null;
        PostMakerCheckersResponse response = api.deleteMakerCheckerEntry(auditId);

        // TODO: test validations
    }
    
    /**
     * Maker Checker Search Template
     *
     * This is a convenience resource. It can be useful when building a Checker Inbox UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with. \&quot;actionNames\&quot; and \&quot;entityNames\&quot; returned are those that the requestor has Checker approval permissions for.  Example Requests:  makercheckers/searchtemplate makercheckers/searchtemplate?fields&#x3D;entityNames
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAuditSearchTemplateTest() throws ApiException {
        GetMakerCheckersSearchTemplateResponse response = api.retrieveAuditSearchTemplate();

        // TODO: test validations
    }
    
    /**
     * List Maker Checker Entries
     *
     * Get a list of entries that can be checked by the requestor that match the criteria supplied.  Example Requests:  makercheckers  makercheckers?fields&#x3D;madeOnDate,maker,processingResult  makercheckers?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  makercheckers?officeId&#x3D;1  makercheckers?officeId&#x3D;1&amp;includeJson&#x3D;true
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveCommandsTest() throws ApiException {
        String actionName = null;
        String entityName = null;
        Long resourceId = null;
        Long makerId = null;
        String makerDateTimeFrom = null;
        String makerDateTimeTo = null;
        Integer officeId = null;
        Integer groupId = null;
        Integer clientId = null;
        Integer loanid = null;
        Integer savingsAccountId = null;
        List<GetMakerCheckerResponse> response = api.retrieveCommands(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, officeId, groupId, clientId, loanid, savingsAccountId);

        // TODO: test validations
    }
    
}
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
import java.io.File;
import io.swagger.client.model.GetAccountsTypeAccountIdResponse;
import io.swagger.client.model.GetAccountsTypeResponse;
import io.swagger.client.model.GetAccountsTypeTemplateResponse;
import io.swagger.client.model.PostAccountsTypeAccountIdRequest;
import io.swagger.client.model.PostAccountsTypeAccountIdResponse;
import io.swagger.client.model.PostAccountsTypeRequest;
import io.swagger.client.model.PostAccountsTypeResponse;
import io.swagger.client.model.PutAccountsTypeAccountIdRequest;
import io.swagger.client.model.PutAccountsTypeAccountIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShareAccountApi
 */
@Ignore
public class ShareAccountApiTest {

    private final ShareAccountApi api = new ShareAccountApi();

    
    /**
     * Submit new share application
     *
     * Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountTest() throws ApiException {
        String type = null;
        PostAccountsTypeRequest body = null;
        PostAccountsTypeResponse response = api.createAccount(type, body);

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
    public void getSharedAccountsTemplateTest() throws ApiException {
        Long officeId = null;
        String dateFormat = null;
        api.getSharedAccountsTemplate(officeId, dateFormat);

        // TODO: test validations
    }
    
    /**
     * Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
     *
     * Approve share application:  Approves share application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval share application:  Will move &#39;approved&#39; share application back to &#39;Submitted and pending approval&#39; state.  Reject share application:  Rejects share application so long as its in &#39;Submitted and pending approval&#39; state.  Activate a share account:  Results in an approved share application being converted into an &#39;active&#39; share account.  Close a share account:  Results in an Activated share application being converted into an &#39;closed&#39; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#39;Reject additional shares request on a share account&#39;  For more info visit this link - https://demo.openmf.org/api-docs/apiLive.htm#shareaccounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void handleCommandsTest() throws ApiException {
        String type = null;
        Long accountId = null;
        PostAccountsTypeAccountIdRequest body = null;
        String command = null;
        PostAccountsTypeAccountIdResponse response = api.handleCommands(type, accountId, body, command);

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
    public void postSharedAccountsTemplateTest() throws ApiException {
        File file = null;
        String locale = null;
        String dateFormat = null;
        String response = api.postSharedAccountsTemplate(file, locale, dateFormat);

        // TODO: test validations
    }
    
    /**
     * Retrieve a share application/account
     *
     * Retrieves a share application/account  Example Requests :  shareaccount/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAccountTest() throws ApiException {
        Long accountId = null;
        String type = null;
        GetAccountsTypeAccountIdResponse response = api.retrieveAccount(accountId, type);

        // TODO: test validations
    }
    
    /**
     * List share applications/accounts
     *
     * Lists share applications/accounts  Example Requests:  shareaccount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllAccountsTest() throws ApiException {
        String type = null;
        Integer offset = null;
        Integer limit = null;
        GetAccountsTypeResponse response = api.retrieveAllAccounts(type, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Retrieve Share Account Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateTest() throws ApiException {
        String type = null;
        Long clientId = null;
        Long productId = null;
        GetAccountsTypeTemplateResponse response = api.template(type, clientId, productId);

        // TODO: test validations
    }
    
    /**
     * Modify a share application
     *
     * Share application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountTest() throws ApiException {
        String type = null;
        Long accountId = null;
        PutAccountsTypeAccountIdRequest body = null;
        PutAccountsTypeAccountIdResponse response = api.updateAccount(type, accountId, body);

        // TODO: test validations
    }
    
}

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
import io.swagger.client.model.DeleteFixedDepositAccountsAccountIdResponse;
import java.io.File;
import io.swagger.client.model.GetFixedDepositAccountsAccountIdResponse;
import io.swagger.client.model.GetFixedDepositAccountsResponse;
import io.swagger.client.model.GetFixedDepositAccountsTemplateResponse;
import io.swagger.client.model.PostFixedDepositAccountsAccountIdRequest;
import io.swagger.client.model.PostFixedDepositAccountsAccountIdResponse;
import io.swagger.client.model.PostFixedDepositAccountsRequest;
import io.swagger.client.model.PostFixedDepositAccountsResponse;
import io.swagger.client.model.PutFixedDepositAccountsAccountIdRequest;
import io.swagger.client.model.PutFixedDepositAccountsAccountIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FixedDepositAccountApi
 */
@Ignore
public class FixedDepositAccountApiTest {

    private final FixedDepositAccountApi api = new FixedDepositAccountApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountClosureTemplateTest() throws ApiException {
        Long accountId = null;
        String command = null;
        String response = api.accountClosureTemplate(accountId, command);

        // TODO: test validations
    }
    
    /**
     * Delete a fixed deposit application
     *
     * At present we support hard delete of fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Long accountId = null;
        DeleteFixedDepositAccountsAccountIdResponse response = api.delete(accountId);

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
    public void getFixedDepositTemplateTest() throws ApiException {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        api.getFixedDepositTemplate(officeId, staffId, dateFormat);

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
    public void getFixedDepositTransactionTemplateTest() throws ApiException {
        Long officeId = null;
        String dateFormat = null;
        api.getFixedDepositTransactionTemplate(officeId, dateFormat);

        // TODO: test validations
    }
    
    /**
     * Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account
     *
     * Approve fixed deposit application:  Approves fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval fixed deposit application:  Will move &#39;approved&#39; fixed deposit application back to &#39;Submitted and pending approval&#39; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#39;closed&#39; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#39;Premature Closed&#39; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#39;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void handleCommandsTest() throws ApiException {
        Long accountId = null;
        PostFixedDepositAccountsAccountIdRequest body = null;
        String command = null;
        PostFixedDepositAccountsAccountIdResponse response = api.handleCommands(accountId, body, command);

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
    public void postFixedDepositTemplateTest() throws ApiException {
        File file = null;
        String locale = null;
        String dateFormat = null;
        String response = api.postFixedDepositTemplate(file, locale, dateFormat);

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
    public void postFixedDepositTransactionTemplateTest() throws ApiException {
        File file = null;
        String locale = null;
        String dateFormat = null;
        String response = api.postFixedDepositTransactionTemplate(file, locale, dateFormat);

        // TODO: test validations
    }
    
    /**
     * List Fixed deposit applications/accounts
     *
     * Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllTest() throws ApiException {
        Boolean paged = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        List<GetFixedDepositAccountsResponse> response = api.retrieveAll(paged, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Retrieve a fixed deposit application/account
     *
     * Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOneTest() throws ApiException {
        Long accountId = null;
        Boolean staffInSelectedOfficeOnly = null;
        String chargeStatus = null;
        GetFixedDepositAccountsAccountIdResponse response = api.retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus);

        // TODO: test validations
    }
    
    /**
     * Submit new fixed deposit application
     *
     * Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitApplicationTest() throws ApiException {
        PostFixedDepositAccountsRequest body = null;
        PostFixedDepositAccountsResponse response = api.submitApplication(body);

        // TODO: test validations
    }
    
    /**
     * Retrieve Fixed Deposit Account Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateTest() throws ApiException {
        Long clientId = null;
        Long groupId = null;
        Long productId = null;
        Boolean staffInSelectedOfficeOnly = null;
        GetFixedDepositAccountsTemplateResponse response = api.template(clientId, groupId, productId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }
    
    /**
     * Modify a fixed deposit application
     *
     * Fixed deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        Long accountId = null;
        PutFixedDepositAccountsAccountIdRequest body = null;
        PutFixedDepositAccountsAccountIdResponse response = api.update(accountId, body);

        // TODO: test validations
    }
    
}
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
import io.swagger.client.model.GetAccountTransfersPageItems;
import io.swagger.client.model.GetAccountTransfersResponse;
import io.swagger.client.model.GetAccountTransfersTemplateRefundByTransferResponse;
import io.swagger.client.model.GetAccountTransfersTemplateResponse;
import io.swagger.client.model.PostAccountTransfersRefundByTransferRequest;
import io.swagger.client.model.PostAccountTransfersRefundByTransferResponse;
import io.swagger.client.model.PostAccountTransfersRequest;
import io.swagger.client.model.PostAccountTransfersResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountTransfersApi
 */
@Ignore
public class AccountTransfersApiTest {

    private final AccountTransfersApi api = new AccountTransfersApi();

    
    /**
     * Create new Transfer
     *
     * Ability to create new transfer of monetary funds from one account to another.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        PostAccountTransfersRequest body = null;
        PostAccountTransfersResponse response = api.create(body);

        // TODO: test validations
    }
    
    /**
     * List account transfers
     *
     * Lists account&#39;s transfers  Example Requests:    accounttransfers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllTest() throws ApiException {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Long accountDetailId = null;
        GetAccountTransfersResponse response = api.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId);

        // TODO: test validations
    }
    
    /**
     * Retrieve account transfer
     *
     * Retrieves account transfer  Example Requests :    accounttransfers/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOneTest() throws ApiException {
        Long transferId = null;
        GetAccountTransfersPageItems response = api.retrieveOne(transferId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Account Transfer Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateTest() throws ApiException {
        Long fromOfficeId = null;
        Long fromClientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        Long toOfficeId = null;
        Long toClientId = null;
        Long toAccountId = null;
        Integer toAccountType = null;
        GetAccountTransfersTemplateResponse response = api.template(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);

        // TODO: test validations
    }
    
    /**
     * Retrieve Refund of an Active Loan by Transfer Template
     *
     * Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateRefundByTransferTest() throws ApiException {
        Long fromOfficeId = null;
        Long fromClientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        Long toOfficeId = null;
        Long toClientId = null;
        Long toAccountId = null;
        Integer toAccountType = null;
        GetAccountTransfersTemplateRefundByTransferResponse response = api.templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);

        // TODO: test validations
    }
    
    /**
     * Refund of an Active Loan by Transfer
     *
     * Ability to refund an active loan by transferring to a savings account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateRefundByTransferPostTest() throws ApiException {
        PostAccountTransfersRefundByTransferRequest body = null;
        PostAccountTransfersRefundByTransferResponse response = api.templateRefundByTransferPost(body);

        // TODO: test validations
    }
    
}

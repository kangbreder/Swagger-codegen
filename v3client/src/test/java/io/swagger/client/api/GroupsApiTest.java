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
import io.swagger.client.model.DeleteGroupsGroupIdResponse;
import java.io.File;
import io.swagger.client.model.GetGroupsGroupIdAccountsResponse;
import io.swagger.client.model.GetGroupsGroupIdResponse;
import io.swagger.client.model.GetGroupsResponse;
import io.swagger.client.model.GetGroupsTemplateResponse;
import io.swagger.client.model.PostGroupsGroupIdCommandUnassignStaffRequest;
import io.swagger.client.model.PostGroupsGroupIdCommandUnassignStaffResponse;
import io.swagger.client.model.PostGroupsGroupIdRequest;
import io.swagger.client.model.PostGroupsGroupIdResponse;
import io.swagger.client.model.PostGroupsRequest;
import io.swagger.client.model.PostGroupsResponse;
import io.swagger.client.model.PutGroupsGroupIdRequest;
import io.swagger.client.model.PutGroupsGroupIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Ignore
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    
    /**
     * Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role
     *
     * Activate a Group:  Groups can be created in a Pending state. This API exists to enable group activation.    If the group happens to be already active this API will result in an error.  Mandatory Fields: activationDate  Associate Clients:  This API allows to associate existing clients to a group.    The clients are listed from the office to which the group is associated.    If client(s) is already associated with group then API will result in an error.  Mandatory Fields: clientMembers  Disassociate Clients:  This API allows to disassociate clients from a group.    Disassociating a client with active joint liability group loans results in an error.  Mandatory Fields: clientMembers  Transfer Clients across groups:  This API allows to transfer clients from one group to another  Mandatory Fields: destinationGroupId and clients  Optional Fields: inheritDestinationGroupLoanOfficer (defaults to true) and transferActiveLoans (defaults to true)  Generate Collection Sheet:  This API retrieves repayment details of all jlg loans of all members of a group on a specified meeting date.  Mandatory Fields: calendarId and transactionDate  Save Collection Sheet:  This api allows the loan officer to perform bulk repayments of JLG loans for a group on its meeting date.  Mandatory Fields: calendarId, transactionDate, actualDisbursementDate  Optional Fields: clientsAttendance, bulkRepaymentTransaction, bulkDisbursementTransactions  Unassign a Staff:  Allows you to unassign the Staff.  Mandatory Fields: staffId  Assign a Staff:  Allows you to assign Staff to an existing Group.    The selected Staff should be belong to the same office (or an office higher up in the hierarchy) as this groupMandatory Fields: staffId  Optional Fields: inheritStaffForClientAccounts (Optional: Boolean if true all members of the group (i.e all clients with active loans and savings ) will inherit the staffId)  Close a Group:  This API exists to close a group. Groups can be closed if they don&#39;t have any non-closed clients/loans/savingsAccounts.    If the group has any active clients/loans/savingsAccount, this API will result in an error.Assign a Role:  Allows you to assign a Role to an existing member of a group.    We can define the different roles applicable to group members by adding code values to the pre-defined system code GROUPROLE. Example:Group leader etc.  Mandatory Fields: clientId, role  Unassign a Role:  Allows you to unassign Roles associated tp Group members.  Update a Role:  Allows you to update the member Role.  Mandatory Fields: role  Showing request/response for Transfer Clients across groups
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activateOrGenerateCollectionSheetTest() throws ApiException {
        Long groupId = null;
        PostGroupsGroupIdRequest body = null;
        String command = null;
        Long roleId = null;
        PostGroupsGroupIdResponse response = api.activateOrGenerateCollectionSheet(groupId, body, command, roleId);

        // TODO: test validations
    }
    
    /**
     * Create a Group
     *
     * Creates a Group  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, clientMembers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        PostGroupsRequest body = null;
        PostGroupsResponse response = api.create(body);

        // TODO: test validations
    }
    
    /**
     * Delete a Group
     *
     * A group can be deleted if it is in pending state and has no associations - clients, loans or savings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Long groupId = null;
        DeleteGroupsGroupIdResponse response = api.delete(groupId);

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
    public void getGroupsTemplateTest() throws ApiException {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        api.getGroupsTemplate(officeId, staffId, dateFormat);

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
    public void postGroupTemplateTest() throws ApiException {
        File file = null;
        String locale = null;
        String dateFormat = null;
        String response = api.postGroupTemplate(file, locale, dateFormat);

        // TODO: test validations
    }
    
    /**
     * Retrieve Group accounts overview
     *
     * Retrieves details of all Loan and Savings accounts associated with this group.    Example Requests:    groups/1/accounts      groups/1/accounts?fields&#x3D;loanAccounts,savingsAccounts,memberLoanAccounts,  memberSavingsAccounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAccountsTest() throws ApiException {
        Long groupId = null;
        GetGroupsGroupIdAccountsResponse response = api.retrieveAccounts(groupId);

        // TODO: test validations
    }
    
    /**
     * List Groups
     *
     * The default implementation of listing Groups returns 200 entries with support for pagination and sorting. Using the parameter limit with value -1 returns all entries.  Example Requests:    groups    groups?fields&#x3D;name,officeName,joinedDate    groups?offset&#x3D;10&amp;limit&#x3D;50    groups?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllTest() throws ApiException {
        String sqlSearch = null;
        Long officeId = null;
        Long staffId = null;
        String externalId = null;
        String name = null;
        String underHierarchy = null;
        Boolean paged = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Boolean orphansOnly = null;
        GetGroupsResponse response = api.retrieveAll(sqlSearch, officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, orphansOnly);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Group
     *
     * Retrieve group information.  Example Requests:    groups/1    groups/1?associations&#x3D;clientMembers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOneTest() throws ApiException {
        Long groupId = null;
        Boolean staffInSelectedOfficeOnly = null;
        Long roleId = null;
        GetGroupsGroupIdResponse response = api.retrieveOne(groupId, staffInSelectedOfficeOnly, roleId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Group Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    groups/template    groups/template?officeId&#x3D;2    groups/template?centerId&#x3D;1    groups/template?centerId&#x3D;1&amp;staffInSelectedOfficeOnly&#x3D;true
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTemplateTest() throws ApiException {
        Long officeId = null;
        Boolean center = null;
        Long centerId = null;
        String command = null;
        Boolean staffInSelectedOfficeOnly = null;
        GetGroupsTemplateResponse response = api.retrieveTemplate(officeId, center, centerId, command, staffInSelectedOfficeOnly);

        // TODO: test validations
    }
    
    /**
     * Unassign a Staff
     *
     * Allows you to unassign the Staff.  Mandatory Fields: staffId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unassignLoanOfficerTest() throws ApiException {
        Long groupId = null;
        PostGroupsGroupIdCommandUnassignStaffRequest body = null;
        PostGroupsGroupIdCommandUnassignStaffResponse response = api.unassignLoanOfficer(groupId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Group
     *
     * Updates a Group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        Long groupId = null;
        PutGroupsGroupIdRequest body = null;
        PutGroupsGroupIdResponse response = api.update(groupId, body);

        // TODO: test validations
    }
    
}

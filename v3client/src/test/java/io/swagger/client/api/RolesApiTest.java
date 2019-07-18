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
import io.swagger.client.model.DeleteRolesRoleIdResponse;
import io.swagger.client.model.GetRolesResponse;
import io.swagger.client.model.GetRolesRoleIdPermissionsResponse;
import io.swagger.client.model.GetRolesRoleIdResponse;
import io.swagger.client.model.PostRolesRequest;
import io.swagger.client.model.PostRolesResponse;
import io.swagger.client.model.PostRolesRoleIdResponse;
import io.swagger.client.model.PutRolesRoleIdPermissionsRequest;
import io.swagger.client.model.PutRolesRoleIdPermissionsResponse;
import io.swagger.client.model.PutRolesRoleIdRequest;
import io.swagger.client.model.PutRolesRoleIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
@Ignore
public class RolesApiTest {

    private final RolesApi api = new RolesApi();

    
    /**
     * Enable Role | Disable Role
     *
     * Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void actionsOnRolesTest() throws ApiException {
        Long roleId = null;
        String command = null;
        PostRolesRoleIdResponse response = api.actionsOnRoles(roleId, command);

        // TODO: test validations
    }
    
    /**
     * Create a New Role
     *
     * Mandatory Fields name, description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoleTest() throws ApiException {
        PostRolesRequest body = null;
        PostRolesResponse response = api.createRole(body);

        // TODO: test validations
    }
    
    /**
     * Delete a Role
     *
     * Description : Delete the role in case role is not associated with any users.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        Long roleId = null;
        DeleteRolesRoleIdResponse response = api.deleteRole(roleId);

        // TODO: test validations
    }
    
    /**
     * List Roles
     *
     * Example Requests:  roles   roles?fields&#x3D;name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllRolesTest() throws ApiException {
        List<GetRolesResponse> response = api.retrieveAllRoles();

        // TODO: test validations
    }
    
    /**
     * Retrieve a Role
     *
     * Example Requests:  roles/1   roles/1?fields&#x3D;name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveRoleTest() throws ApiException {
        Long roleId = null;
        GetRolesRoleIdResponse response = api.retrieveRole(roleId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Role&#39;s Permissions
     *
     * Example Requests:  roles/1/permissions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveRolePermissionsTest() throws ApiException {
        Long roleId = null;
        GetRolesRoleIdPermissionsResponse response = api.retrieveRolePermissions(roleId);

        // TODO: test validations
    }
    
    /**
     * Update a Role
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRoleTest() throws ApiException {
        Long roleId = null;
        PutRolesRoleIdRequest body = null;
        PutRolesRoleIdResponse response = api.updateRole(roleId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Role&#39;s Permissions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRolePermissionsTest() throws ApiException {
        Long roleId = null;
        PutRolesRoleIdPermissionsRequest body = null;
        PutRolesRoleIdPermissionsResponse response = api.updateRolePermissions(roleId, body);

        // TODO: test validations
    }
    
}

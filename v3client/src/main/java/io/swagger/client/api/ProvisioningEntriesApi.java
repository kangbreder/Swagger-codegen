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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.LoanProductProvisioningEntryData;
import io.swagger.client.model.PostProvisioningEntriesRequest;
import io.swagger.client.model.PostProvisioningEntriesResponse;
import io.swagger.client.model.ProvisioningEntryData;
import io.swagger.client.model.PutProvisioningEntriesRequest;
import io.swagger.client.model.PutProvisioningEntriesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvisioningEntriesApi {
    private ApiClient apiClient;

    public ProvisioningEntriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProvisioningEntriesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createProvisioningEntries
     * @param body body (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createProvisioningEntriesCall(PostProvisioningEntriesRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/provisioningentries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createProvisioningEntriesValidateBeforeCall(PostProvisioningEntriesRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createProvisioningEntriesCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create new Provisioning Entries
     * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
     * @param body body (optional)
     * @return PostProvisioningEntriesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostProvisioningEntriesResponse createProvisioningEntries(PostProvisioningEntriesRequest body) throws ApiException {
        ApiResponse<PostProvisioningEntriesResponse> resp = createProvisioningEntriesWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create new Provisioning Entries
     * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
     * @param body body (optional)
     * @return ApiResponse&lt;PostProvisioningEntriesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostProvisioningEntriesResponse> createProvisioningEntriesWithHttpInfo(PostProvisioningEntriesRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createProvisioningEntriesValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PostProvisioningEntriesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new Provisioning Entries (asynchronously)
     * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
     * @param body body (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createProvisioningEntriesAsync(PostProvisioningEntriesRequest body, final ApiCallback<PostProvisioningEntriesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createProvisioningEntriesValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostProvisioningEntriesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modifyProvisioningEntry
     * @param entryId entryId (required)
     * @param command command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry (optional)
     * @param body body (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifyProvisioningEntryCall(Long entryId, String command, PutProvisioningEntriesRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/provisioningentries/{entryId}"
            .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (command != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("command", command));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modifyProvisioningEntryValidateBeforeCall(Long entryId, String command, PutProvisioningEntriesRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'entryId' is set
        if (entryId == null) {
            throw new ApiException("Missing the required parameter 'entryId' when calling modifyProvisioningEntry(Async)");
        }
        

        com.squareup.okhttp.Call call = modifyProvisioningEntryCall(entryId, command, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Recreates Provisioning Entry
     * Recreates Provisioning Entry | createjournalentry.
     * @param entryId entryId (required)
     * @param command command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry (optional)
     * @param body body (optional)
     * @return PutProvisioningEntriesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PutProvisioningEntriesResponse modifyProvisioningEntry(Long entryId, String command, PutProvisioningEntriesRequest body) throws ApiException {
        ApiResponse<PutProvisioningEntriesResponse> resp = modifyProvisioningEntryWithHttpInfo(entryId, command, body);
        return resp.getData();
    }

    /**
     * Recreates Provisioning Entry
     * Recreates Provisioning Entry | createjournalentry.
     * @param entryId entryId (required)
     * @param command command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry (optional)
     * @param body body (optional)
     * @return ApiResponse&lt;PutProvisioningEntriesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PutProvisioningEntriesResponse> modifyProvisioningEntryWithHttpInfo(Long entryId, String command, PutProvisioningEntriesRequest body) throws ApiException {
        com.squareup.okhttp.Call call = modifyProvisioningEntryValidateBeforeCall(entryId, command, body, null, null);
        Type localVarReturnType = new TypeToken<PutProvisioningEntriesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Recreates Provisioning Entry (asynchronously)
     * Recreates Provisioning Entry | createjournalentry.
     * @param entryId entryId (required)
     * @param command command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry (optional)
     * @param body body (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modifyProvisioningEntryAsync(Long entryId, String command, PutProvisioningEntriesRequest body, final ApiCallback<PutProvisioningEntriesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = modifyProvisioningEntryValidateBeforeCall(entryId, command, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PutProvisioningEntriesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveAllProvisioningEntries
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveAllProvisioningEntriesCall(Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/provisioningentries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveAllProvisioningEntriesValidateBeforeCall(Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = retrieveAllProvisioningEntriesCall(offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all Provisioning Entries
     * 
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return List&lt;ProvisioningEntryData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ProvisioningEntryData> retrieveAllProvisioningEntries(Integer offset, Integer limit) throws ApiException {
        ApiResponse<List<ProvisioningEntryData>> resp = retrieveAllProvisioningEntriesWithHttpInfo(offset, limit);
        return resp.getData();
    }

    /**
     * List all Provisioning Entries
     * 
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return ApiResponse&lt;List&lt;ProvisioningEntryData&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ProvisioningEntryData>> retrieveAllProvisioningEntriesWithHttpInfo(Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = retrieveAllProvisioningEntriesValidateBeforeCall(offset, limit, null, null);
        Type localVarReturnType = new TypeToken<List<ProvisioningEntryData>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all Provisioning Entries (asynchronously)
     * 
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveAllProvisioningEntriesAsync(Integer offset, Integer limit, final ApiCallback<List<ProvisioningEntryData>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = retrieveAllProvisioningEntriesValidateBeforeCall(offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ProvisioningEntryData>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveProviioningEntries
     * @param entryId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param officeId  (optional)
     * @param productId  (optional)
     * @param categoryId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveProviioningEntriesCall(Long entryId, Integer offset, Integer limit, Long officeId, Long productId, Long categoryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/provisioningentries/entries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (entryId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entryId", entryId));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (officeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("officeId", officeId));
        if (productId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("productId", productId));
        if (categoryId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("categoryId", categoryId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveProviioningEntriesValidateBeforeCall(Long entryId, Integer offset, Integer limit, Long officeId, Long productId, Long categoryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = retrieveProviioningEntriesCall(entryId, offset, limit, officeId, productId, categoryId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param entryId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param officeId  (optional)
     * @param productId  (optional)
     * @param categoryId  (optional)
     * @return LoanProductProvisioningEntryData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoanProductProvisioningEntryData retrieveProviioningEntries(Long entryId, Integer offset, Integer limit, Long officeId, Long productId, Long categoryId) throws ApiException {
        ApiResponse<LoanProductProvisioningEntryData> resp = retrieveProviioningEntriesWithHttpInfo(entryId, offset, limit, officeId, productId, categoryId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param entryId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param officeId  (optional)
     * @param productId  (optional)
     * @param categoryId  (optional)
     * @return ApiResponse&lt;LoanProductProvisioningEntryData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoanProductProvisioningEntryData> retrieveProviioningEntriesWithHttpInfo(Long entryId, Integer offset, Integer limit, Long officeId, Long productId, Long categoryId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveProviioningEntriesValidateBeforeCall(entryId, offset, limit, officeId, productId, categoryId, null, null);
        Type localVarReturnType = new TypeToken<LoanProductProvisioningEntryData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param entryId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param officeId  (optional)
     * @param productId  (optional)
     * @param categoryId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveProviioningEntriesAsync(Long entryId, Integer offset, Integer limit, Long officeId, Long productId, Long categoryId, final ApiCallback<LoanProductProvisioningEntryData> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = retrieveProviioningEntriesValidateBeforeCall(entryId, offset, limit, officeId, productId, categoryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoanProductProvisioningEntryData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveProvisioningEntry
     * @param entryId entryId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveProvisioningEntryCall(Long entryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/provisioningentries/{entryId}"
            .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveProvisioningEntryValidateBeforeCall(Long entryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'entryId' is set
        if (entryId == null) {
            throw new ApiException("Missing the required parameter 'entryId' when calling retrieveProvisioningEntry(Async)");
        }
        

        com.squareup.okhttp.Call call = retrieveProvisioningEntryCall(entryId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves a Provisioning Entry
     * Returns the details of a generated Provisioning Entry.
     * @param entryId entryId (required)
     * @return ProvisioningEntryData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProvisioningEntryData retrieveProvisioningEntry(Long entryId) throws ApiException {
        ApiResponse<ProvisioningEntryData> resp = retrieveProvisioningEntryWithHttpInfo(entryId);
        return resp.getData();
    }

    /**
     * Retrieves a Provisioning Entry
     * Returns the details of a generated Provisioning Entry.
     * @param entryId entryId (required)
     * @return ApiResponse&lt;ProvisioningEntryData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProvisioningEntryData> retrieveProvisioningEntryWithHttpInfo(Long entryId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveProvisioningEntryValidateBeforeCall(entryId, null, null);
        Type localVarReturnType = new TypeToken<ProvisioningEntryData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves a Provisioning Entry (asynchronously)
     * Returns the details of a generated Provisioning Entry.
     * @param entryId entryId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveProvisioningEntryAsync(Long entryId, final ApiCallback<ProvisioningEntryData> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = retrieveProvisioningEntryValidateBeforeCall(entryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProvisioningEntryData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

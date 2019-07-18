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


import io.swagger.client.model.ReportMailingJobRunHistoryData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListReportMailingJobHistoryApi {
    private ApiClient apiClient;

    public ListReportMailingJobHistoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListReportMailingJobHistoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for retrieveAllByReportMailingJobId
     * @param reportMailingJobId reportMailingJobId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveAllByReportMailingJobIdCall(Long reportMailingJobId, Integer offset, Integer limit, String orderBy, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reportmailingjobrunhistory";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (reportMailingJobId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reportMailingJobId", reportMailingJobId));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderBy", orderBy));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));

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
    private com.squareup.okhttp.Call retrieveAllByReportMailingJobIdValidateBeforeCall(Long reportMailingJobId, Integer offset, Integer limit, String orderBy, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = retrieveAllByReportMailingJobIdCall(reportMailingJobId, offset, limit, orderBy, sortOrder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Report Mailing Job History
     * The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1
     * @param reportMailingJobId reportMailingJobId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return ReportMailingJobRunHistoryData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReportMailingJobRunHistoryData retrieveAllByReportMailingJobId(Long reportMailingJobId, Integer offset, Integer limit, String orderBy, String sortOrder) throws ApiException {
        ApiResponse<ReportMailingJobRunHistoryData> resp = retrieveAllByReportMailingJobIdWithHttpInfo(reportMailingJobId, offset, limit, orderBy, sortOrder);
        return resp.getData();
    }

    /**
     * List Report Mailing Job History
     * The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1
     * @param reportMailingJobId reportMailingJobId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return ApiResponse&lt;ReportMailingJobRunHistoryData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReportMailingJobRunHistoryData> retrieveAllByReportMailingJobIdWithHttpInfo(Long reportMailingJobId, Integer offset, Integer limit, String orderBy, String sortOrder) throws ApiException {
        com.squareup.okhttp.Call call = retrieveAllByReportMailingJobIdValidateBeforeCall(reportMailingJobId, offset, limit, orderBy, sortOrder, null, null);
        Type localVarReturnType = new TypeToken<ReportMailingJobRunHistoryData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Report Mailing Job History (asynchronously)
     * The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1
     * @param reportMailingJobId reportMailingJobId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveAllByReportMailingJobIdAsync(Long reportMailingJobId, Integer offset, Integer limit, String orderBy, String sortOrder, final ApiCallback<ReportMailingJobRunHistoryData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveAllByReportMailingJobIdValidateBeforeCall(reportMailingJobId, offset, limit, orderBy, sortOrder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReportMailingJobRunHistoryData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

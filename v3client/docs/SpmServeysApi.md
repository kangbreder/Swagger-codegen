# SpmServeysApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateOrDeactivateSurvey**](SpmServeysApi.md#activateOrDeactivateSurvey) | **POST** /surveys/{id} | Deactivate Survey
[**createSurvey**](SpmServeysApi.md#createSurvey) | **POST** /surveys | Create a Survey
[**editSurvey**](SpmServeysApi.md#editSurvey) | **PUT** /surveys/{id} | 
[**fetchAllSurveys**](SpmServeysApi.md#fetchAllSurveys) | **GET** /surveys | List all Surveys
[**findSurvey**](SpmServeysApi.md#findSurvey) | **GET** /surveys/{id} | Retrieve a Survey


<a name="activateOrDeactivateSurvey"></a>
# **activateOrDeactivateSurvey**
> activateOrDeactivateSurvey(id, command)

Deactivate Survey



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpmServeysApi;


SpmServeysApi apiInstance = new SpmServeysApi();
Long id = 789L; // Long | 
String command = "command_example"; // String | 
try {
    apiInstance.activateOrDeactivateSurvey(id, command);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmServeysApi#activateOrDeactivateSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **command** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSurvey"></a>
# **createSurvey**
> createSurvey(body)

Create a Survey

Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, value

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpmServeysApi;


SpmServeysApi apiInstance = new SpmServeysApi();
SurveyData body = new SurveyData(); // SurveyData | Create survey
try {
    apiInstance.createSurvey(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmServeysApi#createSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SurveyData**](SurveyData.md)| Create survey | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editSurvey"></a>
# **editSurvey**
> String editSurvey(id, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpmServeysApi;


SpmServeysApi apiInstance = new SpmServeysApi();
Long id = 789L; // Long | 
SurveyData body = new SurveyData(); // SurveyData | 
try {
    String result = apiInstance.editSurvey(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmServeysApi#editSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**SurveyData**](SurveyData.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchAllSurveys"></a>
# **fetchAllSurveys**
> List&lt;SurveyData&gt; fetchAllSurveys(isActive)

List all Surveys



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpmServeysApi;


SpmServeysApi apiInstance = new SpmServeysApi();
Boolean isActive = true; // Boolean | 
try {
    List<SurveyData> result = apiInstance.fetchAllSurveys(isActive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmServeysApi#fetchAllSurveys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isActive** | **Boolean**|  | [optional]

### Return type

[**List&lt;SurveyData&gt;**](SurveyData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSurvey"></a>
# **findSurvey**
> SurveyData findSurvey(id)

Retrieve a Survey



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpmServeysApi;


SpmServeysApi apiInstance = new SpmServeysApi();
Long id = 789L; // Long | Enter id
try {
    SurveyData result = apiInstance.findSurvey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmServeysApi#findSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Enter id |

### Return type

[**SurveyData**](SurveyData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


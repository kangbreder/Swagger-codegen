# SpmScorecardsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScorecard**](SpmScorecardsApi.md#createScorecard) | **POST** /surveys/scorecards/{surveyId} | Create a Scorecard entry
[**findByClient**](SpmScorecardsApi.md#findByClient) | **GET** /surveys/scorecards/clients/{clientId} | 
[**findBySurvey**](SpmScorecardsApi.md#findBySurvey) | **GET** /surveys/scorecards/{surveyId} | List all Scorecard entries
[**findBySurveyAndClient**](SpmScorecardsApi.md#findBySurveyAndClient) | **GET** /surveys/scorecards/{surveyId}/clients/{clientId} | 


<a name="createScorecard"></a>
# **createScorecard**
> createScorecard(surveyId, body)

Create a Scorecard entry

Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpmScorecardsApi;


SpmScorecardsApi apiInstance = new SpmScorecardsApi();
Long surveyId = 789L; // Long | Enter surveyId
ScorecardData body = new ScorecardData(); // ScorecardData | 
try {
    apiInstance.createScorecard(surveyId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmScorecardsApi#createScorecard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |
 **body** | [**ScorecardData**](ScorecardData.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByClient"></a>
# **findByClient**
> List&lt;ScorecardData&gt; findByClient(clientId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpmScorecardsApi;


SpmScorecardsApi apiInstance = new SpmScorecardsApi();
Long clientId = 789L; // Long | 
try {
    List<ScorecardData> result = apiInstance.findByClient(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmScorecardsApi#findByClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |

### Return type

[**List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBySurvey"></a>
# **findBySurvey**
> List&lt;Scorecard&gt; findBySurvey(surveyId)

List all Scorecard entries

List all Scorecard entries for a survey.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpmScorecardsApi;


SpmScorecardsApi apiInstance = new SpmScorecardsApi();
Long surveyId = 789L; // Long | Enter surveyId
try {
    List<Scorecard> result = apiInstance.findBySurvey(surveyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmScorecardsApi#findBySurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |

### Return type

[**List&lt;Scorecard&gt;**](Scorecard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBySurveyAndClient"></a>
# **findBySurveyAndClient**
> List&lt;ScorecardData&gt; findBySurveyAndClient(surveyId, clientId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpmScorecardsApi;


SpmScorecardsApi apiInstance = new SpmScorecardsApi();
Long surveyId = 789L; // Long | Enter surveyId
Long clientId = 789L; // Long | Enter clientId
try {
    List<ScorecardData> result = apiInstance.findBySurveyAndClient(surveyId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmScorecardsApi#findBySurveyAndClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |
 **clientId** | **Long**| Enter clientId |

### Return type

[**List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


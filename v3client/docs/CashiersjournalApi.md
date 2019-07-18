# CashiersjournalApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJournalData**](CashiersjournalApi.md#getJournalData) | **GET** /cashiersjournal | 


<a name="getJournalData"></a>
# **getJournalData**
> String getJournalData(officeId, tellerId, cashierId, dateRange)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CashiersjournalApi;


CashiersjournalApi apiInstance = new CashiersjournalApi();
Long officeId = 789L; // Long | 
Long tellerId = 789L; // Long | 
Long cashierId = 789L; // Long | 
String dateRange = "dateRange_example"; // String | 
try {
    String result = apiInstance.getJournalData(officeId, tellerId, cashierId, dateRange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashiersjournalApi#getJournalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**|  | [optional]
 **tellerId** | **Long**|  | [optional]
 **cashierId** | **Long**|  | [optional]
 **dateRange** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/html, application/json
 - **Accept**: application/json


# MixReportApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveXBRLReport**](MixReportApi.md#retrieveXBRLReport) | **GET** /mixreport | 


<a name="retrieveXBRLReport"></a>
# **retrieveXBRLReport**
> String retrieveXBRLReport(startDate, endDate, currency)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MixReportApi;


MixReportApi apiInstance = new MixReportApi();
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
String currency = "currency_example"; // String | 
try {
    String result = apiInstance.retrieveXBRLReport(startDate, endDate, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MixReportApi#retrieveXBRLReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]
 **currency** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml


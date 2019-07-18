# MixMappingApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveTaxonomyMapping**](MixMappingApi.md#retrieveTaxonomyMapping) | **GET** /mixmapping | 
[**updateTaxonomyMapping**](MixMappingApi.md#updateTaxonomyMapping) | **PUT** /mixmapping | 


<a name="retrieveTaxonomyMapping"></a>
# **retrieveTaxonomyMapping**
> String retrieveTaxonomyMapping()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MixMappingApi;


MixMappingApi apiInstance = new MixMappingApi();
try {
    String result = apiInstance.retrieveTaxonomyMapping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MixMappingApi#retrieveTaxonomyMapping");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaxonomyMapping"></a>
# **updateTaxonomyMapping**
> String updateTaxonomyMapping(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MixMappingApi;


MixMappingApi apiInstance = new MixMappingApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateTaxonomyMapping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MixMappingApi#updateTaxonomyMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


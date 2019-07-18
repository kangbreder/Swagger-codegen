# DomainNameapiv1entityentityIdimagesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewClientImage**](DomainNameapiv1entityentityIdimagesApi.md#addNewClientImage) | **POST** /{entity}/{entityId}/images | 
[**deleteClientImage**](DomainNameapiv1entityentityIdimagesApi.md#deleteClientImage) | **DELETE** /{entity}/{entityId}/images | 
[**downloadClientImage**](DomainNameapiv1entityentityIdimagesApi.md#downloadClientImage) | **GET** /{entity}/{entityId}/images | 
[**updateClientImage**](DomainNameapiv1entityentityIdimagesApi.md#updateClientImage) | **PUT** /{entity}/{entityId}/images | 


<a name="addNewClientImage"></a>
# **addNewClientImage**
> String addNewClientImage(entity, entityId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DomainNameapiv1entityentityIdimagesApi;


DomainNameapiv1entityentityIdimagesApi apiInstance = new DomainNameapiv1entityentityIdimagesApi();
String entity = "entity_example"; // String | 
Long entityId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.addNewClientImage(entity, entityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entityentityIdimagesApi#addNewClientImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**|  |
 **entityId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, text/html, application/json
 - **Accept**: application/json

<a name="deleteClientImage"></a>
# **deleteClientImage**
> String deleteClientImage(entity, entityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DomainNameapiv1entityentityIdimagesApi;


DomainNameapiv1entityentityIdimagesApi apiInstance = new DomainNameapiv1entityentityIdimagesApi();
String entity = "entity_example"; // String | 
Long entityId = 789L; // Long | 
try {
    String result = apiInstance.deleteClientImage(entity, entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entityentityIdimagesApi#deleteClientImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**|  |
 **entityId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadClientImage"></a>
# **downloadClientImage**
> downloadClientImage(entity, entityId, maxWidth, maxHeight, output)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DomainNameapiv1entityentityIdimagesApi;


DomainNameapiv1entityentityIdimagesApi apiInstance = new DomainNameapiv1entityentityIdimagesApi();
String entity = "entity_example"; // String | 
Long entityId = 789L; // Long | 
Integer maxWidth = 56; // Integer | 
Integer maxHeight = 56; // Integer | 
String output = "output_example"; // String | 
try {
    apiInstance.downloadClientImage(entity, entityId, maxWidth, maxHeight, output);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entityentityIdimagesApi#downloadClientImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**|  |
 **entityId** | **Long**|  |
 **maxWidth** | **Integer**|  | [optional]
 **maxHeight** | **Integer**|  | [optional]
 **output** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="updateClientImage"></a>
# **updateClientImage**
> String updateClientImage(entity, entityId, contentLength, file)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DomainNameapiv1entityentityIdimagesApi;


DomainNameapiv1entityentityIdimagesApi apiInstance = new DomainNameapiv1entityentityIdimagesApi();
String entity = "entity_example"; // String | 
Long entityId = 789L; // Long | 
Long contentLength = 789L; // Long | 
File file = new File("/path/to/file.txt"); // File | 
try {
    String result = apiInstance.updateClientImage(entity, entityId, contentLength, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entityentityIdimagesApi#updateClientImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**|  |
 **entityId** | **Long**|  |
 **contentLength** | **Long**|  | [optional]
 **file** | **File**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


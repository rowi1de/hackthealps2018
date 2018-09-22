# UpdateApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateUpdateAccommodation**](UpdateApi.md#updateUpdateAccommodation) | **GET** /api/Update/Accommodation/{id} | 
[**updateUpdateActivity**](UpdateApi.md#updateUpdateActivity) | **GET** /api/Update/Activity/{activitytype}/{id} | 
[**updateUpdateEvent**](UpdateApi.md#updateUpdateEvent) | **GET** /api/Update/Event/{id} | 
[**updateUpdateGastronomy**](UpdateApi.md#updateUpdateGastronomy) | **GET** /api/Update/Gastronomy/{id} | 
[**updateUpdatePackage**](UpdateApi.md#updateUpdatePackage) | **GET** /api/Update/Package/{id} | 
[**updateUpdatePoi**](UpdateApi.md#updateUpdatePoi) | **GET** /api/Update/Poi/{poitype}/{id} | 


<a name="updateUpdateAccommodation"></a>
# **updateUpdateAccommodation**
> String updateUpdateAccommodation(id)



### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.UpdateApi;


UpdateApi apiInstance = new UpdateApi();
String id = "id_example"; // String | 
try {
    String result = apiInstance.updateUpdateAccommodation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateApi#updateUpdateAccommodation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUpdateActivity"></a>
# **updateUpdateActivity**
> String updateUpdateActivity(activitytype, id)



### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.UpdateApi;


UpdateApi apiInstance = new UpdateApi();
String activitytype = "activitytype_example"; // String | 
String id = "id_example"; // String | 
try {
    String result = apiInstance.updateUpdateActivity(activitytype, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateApi#updateUpdateActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activitytype** | **String**|  |
 **id** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUpdateEvent"></a>
# **updateUpdateEvent**
> String updateUpdateEvent(id)



### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.UpdateApi;


UpdateApi apiInstance = new UpdateApi();
String id = "id_example"; // String | 
try {
    String result = apiInstance.updateUpdateEvent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateApi#updateUpdateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUpdateGastronomy"></a>
# **updateUpdateGastronomy**
> String updateUpdateGastronomy(id)



### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.UpdateApi;


UpdateApi apiInstance = new UpdateApi();
String id = "id_example"; // String | 
try {
    String result = apiInstance.updateUpdateGastronomy(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateApi#updateUpdateGastronomy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUpdatePackage"></a>
# **updateUpdatePackage**
> String updateUpdatePackage(id)



### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.UpdateApi;


UpdateApi apiInstance = new UpdateApi();
String id = "id_example"; // String | 
try {
    String result = apiInstance.updateUpdatePackage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateApi#updateUpdatePackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUpdatePoi"></a>
# **updateUpdatePoi**
> String updateUpdatePoi(poitype, id)



### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.UpdateApi;


UpdateApi apiInstance = new UpdateApi();
String poitype = "poitype_example"; // String | 
String id = "id_example"; // String | 
try {
    String result = apiInstance.updateUpdatePoi(poitype, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateApi#updateUpdatePoi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poitype** | **String**|  |
 **id** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


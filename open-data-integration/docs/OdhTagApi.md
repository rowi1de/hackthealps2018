# OdhTagApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oDHTagGetODHTagSingle**](OdhTagApi.md#oDHTagGetODHTagSingle) | **GET** /api/ODHTag/{id} | GET ODHTag Single
[**oDHTagGetODHTags**](OdhTagApi.md#oDHTagGetODHTags) | **GET** /api/ODHTag | GET ODHTag List
[**oDHTagGetODHTagsReduced**](OdhTagApi.md#oDHTagGetODHTagsReduced) | **GET** /api/ODHTagReduced | GET ODHTag List REDUCED


<a name="oDHTagGetODHTagSingle"></a>
# **oDHTagGetODHTagSingle**
> SmgTags oDHTagGetODHTagSingle(id, localizationlanguage)

GET ODHTag Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhTagApi;


OdhTagApi apiInstance = new OdhTagApi();
String id = "id_example"; // String | 
String localizationlanguage = "localizationlanguage_example"; // String | 
try {
    SmgTags result = apiInstance.oDHTagGetODHTagSingle(id, localizationlanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhTagApi#oDHTagGetODHTagSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **localizationlanguage** | **String**|  | [optional]

### Return type

[**SmgTags**](SmgTags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oDHTagGetODHTags"></a>
# **oDHTagGetODHTags**
> List&lt;SmgTags&gt; oDHTagGetODHTags(localizationlanguage, validforentity)

GET ODHTag List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhTagApi;


OdhTagApi apiInstance = new OdhTagApi();
String localizationlanguage = "localizationlanguage_example"; // String | 
String validforentity = "validforentity_example"; // String | Filter on Tags valid on Entitys (accommodation, activity, poi, smgpoi, package, gastronomy, event, article, common .. etc..)
try {
    List<SmgTags> result = apiInstance.oDHTagGetODHTags(localizationlanguage, validforentity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhTagApi#oDHTagGetODHTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localizationlanguage** | **String**|  | [optional]
 **validforentity** | **String**| Filter on Tags valid on Entitys (accommodation, activity, poi, smgpoi, package, gastronomy, event, article, common .. etc..) | [optional]

### Return type

[**List&lt;SmgTags&gt;**](SmgTags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oDHTagGetODHTagsReduced"></a>
# **oDHTagGetODHTagsReduced**
> List&lt;SmgTagReduced&gt; oDHTagGetODHTagsReduced(localizationlanguage, validforentity)

GET ODHTag List REDUCED

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhTagApi;


OdhTagApi apiInstance = new OdhTagApi();
String localizationlanguage = "localizationlanguage_example"; // String | 
String validforentity = "validforentity_example"; // String | 
try {
    List<SmgTagReduced> result = apiInstance.oDHTagGetODHTagsReduced(localizationlanguage, validforentity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhTagApi#oDHTagGetODHTagsReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localizationlanguage** | **String**|  |
 **validforentity** | **String**|  | [optional]

### Return type

[**List&lt;SmgTagReduced&gt;**](SmgTagReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


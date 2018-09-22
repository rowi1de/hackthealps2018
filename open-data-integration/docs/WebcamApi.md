# WebcamApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webcamCreateWebcamList**](WebcamApi.md#webcamCreateWebcamList) | **GET** /api/Webcam/WebcamList | GET List of all available Webcams
[**webcamGetWebcamList**](WebcamApi.md#webcamGetWebcamList) | **GET** /api/Webcam | GET Webcam List


<a name="webcamCreateWebcamList"></a>
# **webcamCreateWebcamList**
> List&lt;WebcamResult&gt; webcamCreateWebcamList()

GET List of all available Webcams

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.WebcamApi;


WebcamApi apiInstance = new WebcamApi();
try {
    List<WebcamResult> result = apiInstance.webcamCreateWebcamList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebcamApi#webcamCreateWebcamList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;WebcamResult&gt;**](WebcamResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="webcamGetWebcamList"></a>
# **webcamGetWebcamList**
> List&lt;PoiBaseInfos&gt; webcamGetWebcamList()

GET Webcam List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.WebcamApi;


WebcamApi apiInstance = new WebcamApi();
try {
    List<PoiBaseInfos> result = apiInstance.webcamGetWebcamList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebcamApi#webcamGetWebcamList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PoiBaseInfos&gt;**](PoiBaseInfos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


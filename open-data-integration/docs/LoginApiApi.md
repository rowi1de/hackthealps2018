# LoginApiApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginApiGetLogout**](LoginApiApi.md#loginApiGetLogout) | **GET** /api/Logout | 
[**loginApiPostLogin**](LoginApiApi.md#loginApiPostLogin) | **POST** /api/LoginApi | 


<a name="loginApiGetLogout"></a>
# **loginApiGetLogout**
> loginApiGetLogout()



### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.LoginApiApi;


LoginApiApi apiInstance = new LoginApiApi();
try {
    apiInstance.loginApiGetLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApiApi#loginApiGetLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="loginApiPostLogin"></a>
# **loginApiPostLogin**
> Object loginApiPostLogin(loginmodel)



### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.LoginApiApi;


LoginApiApi apiInstance = new LoginApiApi();
LoginPostModel loginmodel = new LoginPostModel(); // LoginPostModel | 
try {
    Object result = apiInstance.loginApiPostLogin(loginmodel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApiApi#loginApiPostLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginmodel** | [**LoginPostModel**](LoginPostModel.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json


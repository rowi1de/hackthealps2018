# WeatherApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**weatherGetDistrictWeather**](WeatherApi.md#weatherGetDistrictWeather) | **GET** /api/Weather/District | GET District Weather LIVE
[**weatherGetMeasuringPoint**](WeatherApi.md#weatherGetMeasuringPoint) | **GET** /api/Weather/Measuringpoint/{id} | GET Measuringpoint SINGLE
[**weatherGetMeasuringPoints**](WeatherApi.md#weatherGetMeasuringPoints) | **GET** /api/Weather/Measuringpoint | GET Measuringpoint LIST
[**weatherGetRealtimeWeather**](WeatherApi.md#weatherGetRealtimeWeather) | **GET** /api/Weather/Realtime | GET Current Realtime Weather LIVE
[**weatherGetSnowReportBase**](WeatherApi.md#weatherGetSnowReportBase) | **GET** /api/Weather/SnowReport | GET Snowreport Data LIVE
[**weatherGetWeather**](WeatherApi.md#weatherGetWeather) | **GET** /api/Weather | GET Current Suedtirol Weather LIVE


<a name="weatherGetDistrictWeather"></a>
# **weatherGetDistrictWeather**
> BezirksWeather weatherGetDistrictWeather(language, locfilter)

GET District Weather LIVE

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.WeatherApi;


WeatherApi apiInstance = new WeatherApi();
String language = "language_example"; // String | Language
String locfilter = "locfilter_example"; // String | Locfilter (possible values: tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction), 'null' = No Filter)
try {
    BezirksWeather result = apiInstance.weatherGetDistrictWeather(language, locfilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeatherApi#weatherGetDistrictWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language |
 **locfilter** | **String**| Locfilter (possible values: tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter) |

### Return type

[**BezirksWeather**](BezirksWeather.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="weatherGetMeasuringPoint"></a>
# **weatherGetMeasuringPoint**
> Measuringpoint weatherGetMeasuringPoint(id)

GET Measuringpoint SINGLE

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.WeatherApi;


WeatherApi apiInstance = new WeatherApi();
String id = "id_example"; // String | Measuringpoint ID
try {
    Measuringpoint result = apiInstance.weatherGetMeasuringPoint(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeatherApi#weatherGetMeasuringPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Measuringpoint ID |

### Return type

[**Measuringpoint**](Measuringpoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="weatherGetMeasuringPoints"></a>
# **weatherGetMeasuringPoints**
> List&lt;Measuringpoint&gt; weatherGetMeasuringPoints(elements, areafilter, skiareafilter)

GET Measuringpoint LIST

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.WeatherApi;


WeatherApi apiInstance = new WeatherApi();
Integer elements = 56; // Integer | Elements to retrieve
String areafilter = "areafilter_example"; // String | Area ID (multiple IDs possible, separated by \",\")
String skiareafilter = "skiareafilter_example"; // String | Skiarea ID
try {
    List<Measuringpoint> result = apiInstance.weatherGetMeasuringPoints(elements, areafilter, skiareafilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeatherApi#weatherGetMeasuringPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elements** | **Integer**| Elements to retrieve | [optional]
 **areafilter** | **String**| Area ID (multiple IDs possible, separated by \&quot;,\&quot;) | [optional]
 **skiareafilter** | **String**| Skiarea ID | [optional]

### Return type

[**List&lt;Measuringpoint&gt;**](Measuringpoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="weatherGetRealtimeWeather"></a>
# **weatherGetRealtimeWeather**
> WeatherRealTime weatherGetRealtimeWeather(language)

GET Current Realtime Weather LIVE

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.WeatherApi;


WeatherApi apiInstance = new WeatherApi();
String language = "language_example"; // String | Language
try {
    WeatherRealTime result = apiInstance.weatherGetRealtimeWeather(language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeatherApi#weatherGetRealtimeWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language |

### Return type

[**WeatherRealTime**](WeatherRealTime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="weatherGetSnowReportBase"></a>
# **weatherGetSnowReportBase**
> SnowReportBaseData weatherGetSnowReportBase(lang, skiareaid)

GET Snowreport Data LIVE

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.WeatherApi;


WeatherApi apiInstance = new WeatherApi();
String lang = "lang_example"; // String | Language
String skiareaid = "skiareaid_example"; // String | Skiarea ID
try {
    SnowReportBaseData result = apiInstance.weatherGetSnowReportBase(lang, skiareaid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeatherApi#weatherGetSnowReportBase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lang** | **String**| Language |
 **skiareaid** | **String**| Skiarea ID |

### Return type

[**SnowReportBaseData**](SnowReportBaseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="weatherGetWeather"></a>
# **weatherGetWeather**
> Weather weatherGetWeather(language, locfilter)

GET Current Suedtirol Weather LIVE

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.WeatherApi;


WeatherApi apiInstance = new WeatherApi();
String language = "language_example"; // String | Language
String locfilter = "locfilter_example"; // String | Locfilter (possible values: reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction), '' = No Filter). IF a Locfilter is set, only Stationdata is provided.
try {
    Weather result = apiInstance.weatherGetWeather(language, locfilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeatherApi#weatherGetWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language |
 **locfilter** | **String**| Locfilter (possible values: reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;&#39; &#x3D; No Filter). IF a Locfilter is set, only Stationdata is provided. | [optional]

### Return type

[**Weather**](Weather.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


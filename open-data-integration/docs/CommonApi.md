# CommonApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commonGetDistrict**](CommonApi.md#commonGetDistrict) | **GET** /api/District | GET District List
[**commonGetDistrictLocalized**](CommonApi.md#commonGetDistrictLocalized) | **GET** /api/DistrictLocalized | GET District Localized List
[**commonGetDistrictReduced**](CommonApi.md#commonGetDistrictReduced) | **GET** /api/DistrictReduced | GET District Reduced List
[**commonGetDistrictSingle**](CommonApi.md#commonGetDistrictSingle) | **GET** /api/District/{id} | GET District Single
[**commonGetDistrictSingleLocalized**](CommonApi.md#commonGetDistrictSingleLocalized) | **GET** /api/DistrictLocalized/{id} | GET District Localized Single
[**commonGetExperienceAreaSingle**](CommonApi.md#commonGetExperienceAreaSingle) | **GET** /api/ExperienceArea/{id} | GET ExperienceArea Single
[**commonGetExperienceAreaSingleLocalized**](CommonApi.md#commonGetExperienceAreaSingleLocalized) | **GET** /api/ExperienceAreaLocalized/{id} | GET ExperienceArea Localized Single
[**commonGetExperienceAreas**](CommonApi.md#commonGetExperienceAreas) | **GET** /api/ExperienceArea | GET Experiencearea List
[**commonGetExperienceAreasLocalized**](CommonApi.md#commonGetExperienceAreasLocalized) | **GET** /api/ExperienceAreaLocalized | GET ExperienceArea Localized List
[**commonGetExperienceAreasReduced**](CommonApi.md#commonGetExperienceAreasReduced) | **GET** /api/ExperienceAreaReduced | GET ExperienceArea Reduced List
[**commonGetMetaRegionSingle**](CommonApi.md#commonGetMetaRegionSingle) | **GET** /api/MetaRegion/{id} | GET MetaRegion Single
[**commonGetMetaRegionSingleLocalized**](CommonApi.md#commonGetMetaRegionSingleLocalized) | **GET** /api/MetaRegionLocalized/{id} | GET MetaRegion Localized Single
[**commonGetMetaRegions**](CommonApi.md#commonGetMetaRegions) | **GET** /api/MetaRegion | GET MetaRegion List
[**commonGetMetaRegionsLocalized**](CommonApi.md#commonGetMetaRegionsLocalized) | **GET** /api/MetaRegionLocalized | GET MetaRegion Localized List
[**commonGetMetaRegionsReduced**](CommonApi.md#commonGetMetaRegionsReduced) | **GET** /api/MetaRegionReduced | GET MetaRegion Reduced List
[**commonGetMunicipality**](CommonApi.md#commonGetMunicipality) | **GET** /api/Municipality | GET Municipality List
[**commonGetMunicipalityLocalized**](CommonApi.md#commonGetMunicipalityLocalized) | **GET** /api/MunicipalityLocalized | GET Municipality Localized List
[**commonGetMunicipalityReduced**](CommonApi.md#commonGetMunicipalityReduced) | **GET** /api/MunicipalityReduced | GET Municipality Reduced List
[**commonGetMunicipalitySingle**](CommonApi.md#commonGetMunicipalitySingle) | **GET** /api/Municipality/{id} | GET Municipality Single
[**commonGetMunicipalitySingleLocalized**](CommonApi.md#commonGetMunicipalitySingleLocalized) | **GET** /api/MunicipalityLocalized/{id} | GET Municipality Localized Single
[**commonGetRegionSingle**](CommonApi.md#commonGetRegionSingle) | **GET** /api/Region/{id} | GET Region Single
[**commonGetRegionSingleLocalized**](CommonApi.md#commonGetRegionSingleLocalized) | **GET** /api/RegionLocalized/{id} | GET Region Localized Single
[**commonGetRegions**](CommonApi.md#commonGetRegions) | **GET** /api/Region | GET Region List
[**commonGetRegionsLocalized**](CommonApi.md#commonGetRegionsLocalized) | **GET** /api/RegionLocalized | GET Region Localized List
[**commonGetRegionsReduced**](CommonApi.md#commonGetRegionsReduced) | **GET** /api/RegionReduced | GET Region Reduced List
[**commonGetTourismverein**](CommonApi.md#commonGetTourismverein) | **GET** /api/TourismAssociation | GET TourismAssociation List
[**commonGetTourismvereinLocalized**](CommonApi.md#commonGetTourismvereinLocalized) | **GET** /api/TourismAssociationLocalized | GET TourismAssociation Localized List
[**commonGetTourismvereinReduced**](CommonApi.md#commonGetTourismvereinReduced) | **GET** /api/TourismAssociationReduced | GET TourismAssociation Reduced List
[**commonGetTourismvereinSingle**](CommonApi.md#commonGetTourismvereinSingle) | **GET** /api/TourismAssociation/{id} | GET TourismAssociation Single
[**commonGetTourismvereinSingleLocalized**](CommonApi.md#commonGetTourismvereinSingleLocalized) | **GET** /api/TourismAssociationLocalized/{id} | GET TourismAssociation Localized Single
[**commonGetWineAwardsList**](CommonApi.md#commonGetWineAwardsList) | **GET** /api/WineAward | GET Wine Awards List
[**commonGetWineAwardsSingle**](CommonApi.md#commonGetWineAwardsSingle) | **GET** /api/WineAward/{id} | GET Wine Award Single


<a name="commonGetDistrict"></a>
# **commonGetDistrict**
> List&lt;District&gt; commonGetDistrict(elements, visibleinsearch, latitude, longitude, radius)

GET District List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String visibleinsearch = "visibleinsearch_example"; // String | Filter only Elements flagged with visibleinsearch: (possible values: 'true','false'), (default:'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<District> result = apiInstance.commonGetDistrict(elements, visibleinsearch, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetDistrict");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **visibleinsearch** | **String**| Filter only Elements flagged with visibleinsearch: (possible values: &#39;true&#39;,&#39;false&#39;), (default:&#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;District&gt;**](District.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetDistrictLocalized"></a>
# **commonGetDistrictLocalized**
> List&lt;DistrictLocalized&gt; commonGetDistrictLocalized(language, elements, visibleinsearch, latitude, longitude, radius)

GET District Localized List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String visibleinsearch = "visibleinsearch_example"; // String | Filter only Elements flagged with visibleinsearch: (possible values: 'true','false'), (default:'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<DistrictLocalized> result = apiInstance.commonGetDistrictLocalized(language, elements, visibleinsearch, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetDistrictLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **visibleinsearch** | **String**| Filter only Elements flagged with visibleinsearch: (possible values: &#39;true&#39;,&#39;false&#39;), (default:&#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;DistrictLocalized&gt;**](DistrictLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetDistrictReduced"></a>
# **commonGetDistrictReduced**
> List&lt;CommonReduced&gt; commonGetDistrictReduced(language, elements, visibleinsearch, latitude, longitude, radius)

GET District Reduced List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String visibleinsearch = "visibleinsearch_example"; // String | Filter only Elements flagged with visibleinsearch: (possible values: 'true','false'), (default:'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<CommonReduced> result = apiInstance.commonGetDistrictReduced(language, elements, visibleinsearch, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetDistrictReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **visibleinsearch** | **String**| Filter only Elements flagged with visibleinsearch: (possible values: &#39;true&#39;,&#39;false&#39;), (default:&#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;CommonReduced&gt;**](CommonReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetDistrictSingle"></a>
# **commonGetDistrictSingle**
> District commonGetDistrictSingle(id)

GET District Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
try {
    District result = apiInstance.commonGetDistrictSingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetDistrictSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |

### Return type

[**District**](District.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetDistrictSingleLocalized"></a>
# **commonGetDistrictSingleLocalized**
> DistrictLocalized commonGetDistrictSingleLocalized(id, language)

GET District Localized Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    DistrictLocalized result = apiInstance.commonGetDistrictSingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetDistrictSingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**DistrictLocalized**](DistrictLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetExperienceAreaSingle"></a>
# **commonGetExperienceAreaSingle**
> ExperienceArea commonGetExperienceAreaSingle(id)

GET ExperienceArea Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
try {
    ExperienceArea result = apiInstance.commonGetExperienceAreaSingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetExperienceAreaSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |

### Return type

[**ExperienceArea**](ExperienceArea.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetExperienceAreaSingleLocalized"></a>
# **commonGetExperienceAreaSingleLocalized**
> BaseInfosLocalized commonGetExperienceAreaSingleLocalized(id, language)

GET ExperienceArea Localized Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    BaseInfosLocalized result = apiInstance.commonGetExperienceAreaSingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetExperienceAreaSingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**BaseInfosLocalized**](BaseInfosLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetExperienceAreas"></a>
# **commonGetExperienceAreas**
> List&lt;ExperienceArea&gt; commonGetExperienceAreas(elements, visibleinsearch, latitude, longitude, radius)

GET Experiencearea List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer elements = 56; // Integer | Elements to retrieve (default = 1024)
String visibleinsearch = "visibleinsearch_example"; // String | Filter only Elements flagged with visibleinsearch: (possible values: 'true','false'), (default:'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<ExperienceArea> result = apiInstance.commonGetExperienceAreas(elements, visibleinsearch, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetExperienceAreas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elements** | **Integer**| Elements to retrieve (default &#x3D; 1024) | [optional]
 **visibleinsearch** | **String**| Filter only Elements flagged with visibleinsearch: (possible values: &#39;true&#39;,&#39;false&#39;), (default:&#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;ExperienceArea&gt;**](ExperienceArea.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetExperienceAreasLocalized"></a>
# **commonGetExperienceAreasLocalized**
> List&lt;ExperienceAreaLocalized&gt; commonGetExperienceAreasLocalized(language, elements, visibleinsearch, latitude, longitude, radius)

GET ExperienceArea Localized List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (default = 1024)
String visibleinsearch = "visibleinsearch_example"; // String | Filter only Elements flagged with visibleinsearch: (possible values: 'true','false'), (default:'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<ExperienceAreaLocalized> result = apiInstance.commonGetExperienceAreasLocalized(language, elements, visibleinsearch, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetExperienceAreasLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (default &#x3D; 1024) | [optional]
 **visibleinsearch** | **String**| Filter only Elements flagged with visibleinsearch: (possible values: &#39;true&#39;,&#39;false&#39;), (default:&#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;ExperienceAreaLocalized&gt;**](ExperienceAreaLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetExperienceAreasReduced"></a>
# **commonGetExperienceAreasReduced**
> List&lt;ExperienceAreaName&gt; commonGetExperienceAreasReduced(language, elements, visibleinsearch, latitude, longitude, radius)

GET ExperienceArea Reduced List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (default = 1024)
String visibleinsearch = "visibleinsearch_example"; // String | Filter only Elements flagged with visibleinsearch: (possible values: 'true','false'), (default:'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<ExperienceAreaName> result = apiInstance.commonGetExperienceAreasReduced(language, elements, visibleinsearch, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetExperienceAreasReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (default &#x3D; 1024) | [optional]
 **visibleinsearch** | **String**| Filter only Elements flagged with visibleinsearch: (possible values: &#39;true&#39;,&#39;false&#39;), (default:&#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;ExperienceAreaName&gt;**](ExperienceAreaName.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMetaRegionSingle"></a>
# **commonGetMetaRegionSingle**
> MetaRegion commonGetMetaRegionSingle(id)

GET MetaRegion Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
try {
    MetaRegion result = apiInstance.commonGetMetaRegionSingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMetaRegionSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |

### Return type

[**MetaRegion**](MetaRegion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMetaRegionSingleLocalized"></a>
# **commonGetMetaRegionSingleLocalized**
> MetaRegionLocalized commonGetMetaRegionSingleLocalized(id, language)

GET MetaRegion Localized Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    MetaRegionLocalized result = apiInstance.commonGetMetaRegionSingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMetaRegionSingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**MetaRegionLocalized**](MetaRegionLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMetaRegions"></a>
# **commonGetMetaRegions**
> List&lt;MetaRegion&gt; commonGetMetaRegions(elements, latitude, longitude, radius)

GET MetaRegion List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<MetaRegion> result = apiInstance.commonGetMetaRegions(elements, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMetaRegions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;MetaRegion&gt;**](MetaRegion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMetaRegionsLocalized"></a>
# **commonGetMetaRegionsLocalized**
> List&lt;MetaRegionLocalized&gt; commonGetMetaRegionsLocalized(language, elements, latitude, longitude, radius)

GET MetaRegion Localized List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<MetaRegionLocalized> result = apiInstance.commonGetMetaRegionsLocalized(language, elements, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMetaRegionsLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;MetaRegionLocalized&gt;**](MetaRegionLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMetaRegionsReduced"></a>
# **commonGetMetaRegionsReduced**
> List&lt;CommonReduced&gt; commonGetMetaRegionsReduced(language, elements, latitude, longitude, radius)

GET MetaRegion Reduced List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<CommonReduced> result = apiInstance.commonGetMetaRegionsReduced(language, elements, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMetaRegionsReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;CommonReduced&gt;**](CommonReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMunicipality"></a>
# **commonGetMunicipality**
> List&lt;Municipality&gt; commonGetMunicipality(elements, visibleinsearch, latitude, longitude, radius)

GET Municipality List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String visibleinsearch = "visibleinsearch_example"; // String | Filter only Elements flagged with visibleinsearch: (possible values: 'true','false'), (default:'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<Municipality> result = apiInstance.commonGetMunicipality(elements, visibleinsearch, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMunicipality");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **visibleinsearch** | **String**| Filter only Elements flagged with visibleinsearch: (possible values: &#39;true&#39;,&#39;false&#39;), (default:&#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;Municipality&gt;**](Municipality.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMunicipalityLocalized"></a>
# **commonGetMunicipalityLocalized**
> List&lt;MunicipalityLocalized&gt; commonGetMunicipalityLocalized(language, elements, visibleinsearch, latitude, longitude, radius)

GET Municipality Localized List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String visibleinsearch = "visibleinsearch_example"; // String | Filter only Elements flagged with visibleinsearch: (possible values: 'true','false'), (default:'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<MunicipalityLocalized> result = apiInstance.commonGetMunicipalityLocalized(language, elements, visibleinsearch, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMunicipalityLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **visibleinsearch** | **String**| Filter only Elements flagged with visibleinsearch: (possible values: &#39;true&#39;,&#39;false&#39;), (default:&#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;MunicipalityLocalized&gt;**](MunicipalityLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMunicipalityReduced"></a>
# **commonGetMunicipalityReduced**
> List&lt;CommonReduced&gt; commonGetMunicipalityReduced(language, elements, visibleinsearch, latitude, longitude, radius)

GET Municipality Reduced List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String visibleinsearch = "visibleinsearch_example"; // String | Filter only Elements flagged with visibleinsearch: (possible values: 'true','false'), (default:'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<CommonReduced> result = apiInstance.commonGetMunicipalityReduced(language, elements, visibleinsearch, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMunicipalityReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **visibleinsearch** | **String**| Filter only Elements flagged with visibleinsearch: (possible values: &#39;true&#39;,&#39;false&#39;), (default:&#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;CommonReduced&gt;**](CommonReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMunicipalitySingle"></a>
# **commonGetMunicipalitySingle**
> Municipality commonGetMunicipalitySingle(id)

GET Municipality Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
try {
    Municipality result = apiInstance.commonGetMunicipalitySingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMunicipalitySingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |

### Return type

[**Municipality**](Municipality.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetMunicipalitySingleLocalized"></a>
# **commonGetMunicipalitySingleLocalized**
> MunicipalityLocalized commonGetMunicipalitySingleLocalized(id, language)

GET Municipality Localized Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    MunicipalityLocalized result = apiInstance.commonGetMunicipalitySingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetMunicipalitySingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**MunicipalityLocalized**](MunicipalityLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetRegionSingle"></a>
# **commonGetRegionSingle**
> Region commonGetRegionSingle(id)

GET Region Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
try {
    Region result = apiInstance.commonGetRegionSingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetRegionSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |

### Return type

[**Region**](Region.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetRegionSingleLocalized"></a>
# **commonGetRegionSingleLocalized**
> RegionLocalized commonGetRegionSingleLocalized(id, language)

GET Region Localized Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    RegionLocalized result = apiInstance.commonGetRegionSingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetRegionSingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**RegionLocalized**](RegionLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetRegions"></a>
# **commonGetRegions**
> List&lt;Region&gt; commonGetRegions(elements, latitude, longitude, radius)

GET Region List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<Region> result = apiInstance.commonGetRegions(elements, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetRegions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;Region&gt;**](Region.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetRegionsLocalized"></a>
# **commonGetRegionsLocalized**
> List&lt;RegionLocalized&gt; commonGetRegionsLocalized(language, elements, latitude, longitude, radius)

GET Region Localized List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<RegionLocalized> result = apiInstance.commonGetRegionsLocalized(language, elements, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetRegionsLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;RegionLocalized&gt;**](RegionLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetRegionsReduced"></a>
# **commonGetRegionsReduced**
> List&lt;CommonReduced&gt; commonGetRegionsReduced(language, elements, latitude, longitude, radius)

GET Region Reduced List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<CommonReduced> result = apiInstance.commonGetRegionsReduced(language, elements, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetRegionsReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;CommonReduced&gt;**](CommonReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetTourismverein"></a>
# **commonGetTourismverein**
> List&lt;Tourismverein&gt; commonGetTourismverein(elements, latitude, longitude, radius)

GET TourismAssociation List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<Tourismverein> result = apiInstance.commonGetTourismverein(elements, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetTourismverein");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;Tourismverein&gt;**](Tourismverein.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetTourismvereinLocalized"></a>
# **commonGetTourismvereinLocalized**
> List&lt;TourismvereinLocalized&gt; commonGetTourismvereinLocalized(language, elements, latitude, longitude, radius)

GET TourismAssociation Localized List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
CommonApi


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<TourismvereinLocalized> result = apiInstance.commonGetTourismvereinLocalized(language, elements, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetTourismvereinLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;TourismvereinLocalized&gt;**](TourismvereinLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetTourismvereinReduced"></a>
# **commonGetTourismvereinReduced**
> List&lt;CommonReduced&gt; commonGetTourismvereinReduced(language, elements, latitude, longitude, radius)

GET TourismAssociation Reduced List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<CommonReduced> result = apiInstance.commonGetTourismvereinReduced(language, elements, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetTourismvereinReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;CommonReduced&gt;**](CommonReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetTourismvereinSingle"></a>
# **commonGetTourismvereinSingle**
> Tourismverein commonGetTourismvereinSingle(id)

GET TourismAssociation Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
try {
    Tourismverein result = apiInstance.commonGetTourismvereinSingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetTourismvereinSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |

### Return type

[**Tourismverein**](Tourismverein.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetTourismvereinSingleLocalized"></a>
# **commonGetTourismvereinSingleLocalized**
> TourismvereinLocalized commonGetTourismvereinSingleLocalized(id, language)

GET TourismAssociation Localized Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    TourismvereinLocalized result = apiInstance.commonGetTourismvereinSingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetTourismvereinSingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**TourismvereinLocalized**](TourismvereinLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetWineAwardsList"></a>
# **commonGetWineAwardsList**
> List&lt;Wine&gt; commonGetWineAwardsList(elements, wineid, companyid)

GET Wine Awards List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer elements = 56; // Integer | Elements to retrieve (0 = Get All)
String wineid = "wineid_example"; // String | WineId
String companyid = "companyid_example"; // String | Company Id
try {
    List<Wine> result = apiInstance.commonGetWineAwardsList(elements, wineid, companyid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetWineAwardsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elements** | **Integer**| Elements to retrieve (0 &#x3D; Get All) | [optional]
 **wineid** | **String**| WineId | [optional]
 **companyid** | **String**| Company Id | [optional]

### Return type

[**List&lt;Wine&gt;**](Wine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonGetWineAwardsSingle"></a>
# **commonGetWineAwardsSingle**
> Wine commonGetWineAwardsSingle(id)

GET Wine Award Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String id = "id_example"; // String | ID of the requested data
try {
    Wine result = apiInstance.commonGetWineAwardsSingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonGetWineAwardsSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the requested data |

### Return type

[**Wine**](Wine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


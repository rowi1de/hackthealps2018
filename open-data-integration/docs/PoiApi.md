# PoiApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiGetAllPoiTypesList**](PoiApi.md#poiGetAllPoiTypesList) | **GET** /api/PoiTypes | GET Poi Types List
[**poiGetAllPoisChanged**](PoiApi.md#poiGetAllPoisChanged) | **GET** /api/PoiChanged | GET Poi Changed List by Date
[**poiGetPoiFiltered**](PoiApi.md#poiGetPoiFiltered) | **GET** /api/Poi | GET Poi List
[**poiGetPoiLocalized**](PoiApi.md#poiGetPoiLocalized) | **GET** /api/PoiLocalized | GET Poi Localized List
[**poiGetPoiReduced**](PoiApi.md#poiGetPoiReduced) | **GET** /api/PoiReduced | GET Poi List Reduced
[**poiGetPoiSingle**](PoiApi.md#poiGetPoiSingle) | **GET** /api/Poi/{id} | GET Poi Single
[**poiGetPoiSingleLocalized**](PoiApi.md#poiGetPoiSingleLocalized) | **GET** /api/PoiLocalized/{id} | GET Poi Localized Single


<a name="poiGetAllPoiTypesList"></a>
# **poiGetAllPoiTypesList**
> List&lt;PoiTypes&gt; poiGetAllPoiTypesList()

GET Poi Types List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.PoiApi;


PoiApi apiInstance = new PoiApi();
try {
    List<PoiTypes> result = apiInstance.poiGetAllPoiTypesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiApi#poiGetAllPoiTypesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PoiTypes&gt;**](PoiTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiGetAllPoisChanged"></a>
# **poiGetAllPoisChanged**
> List&lt;GBLTSPoi&gt; poiGetAllPoisChanged(pagenumber, pagesize, seed, updatefrom)

GET Poi Changed List by Date

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.PoiApi;


PoiApi apiInstance = new PoiApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, 'null' disables Random Sorting, (default:0)
String updatefrom = "updatefrom_example"; // String | Date from Format (yyyy-MM-dd) (all GBActivityPoi with LastChange &gt;= datefrom are passed), (default: DateTime.Now - 1 Day)
try {
    List<GBLTSPoi> result = apiInstance.poiGetAllPoisChanged(pagenumber, pagesize, seed, updatefrom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiApi#poiGetAllPoisChanged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0) | [optional]
 **updatefrom** | **String**| Date from Format (yyyy-MM-dd) (all GBActivityPoi with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day) | [optional]

### Return type

[**List&lt;GBLTSPoi&gt;**](GBLTSPoi.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiGetPoiFiltered"></a>
# **poiGetPoiFiltered**
> List&lt;GBLTSPoi&gt; poiGetPoiFiltered(pagenumber, pagesize, poitype, subtype, idlist, locfilter, areafilter, highlight, odhtagfilter, active, odhactive, seed, latitude, longitude, radius)

GET Poi List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.PoiApi;


PoiApi apiInstance = new PoiApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String poitype = "poitype_example"; // String | Type of the Poi (possible values: STRINGS: 'Ärzte, Apotheken','Geschäfte','Kultur und Sehenswürdigkeiten','Nachtleben und Unterhaltung','Öffentliche Einrichtungen','Sport und Freizeit','Verkehr und Transport','Dienstleister','Kunsthandwerker' : BITMASK also possible: 'Ärzte, Apotheken = 1','Geschäfte = 2','Kultur und Sehenswürdigkeiten = 4','Nachtleben und Unterhaltung = 8','Öffentliche Einrichtungen = 16','Sport und Freizeit = 32','Verkehr und Transport = 64', 'Dienstleister' = 128, 'Kunsthandwerker' = 256), (default:'511')
String subtype = "subtype_example"; // String | Subtype of the Poi ('null' = Filter disabled, available Subtypes depends on the activitytype BITMASK), (default:'null')
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of Activity IDs, 'null' = No Filter), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction), 'null' = No Filter), (default:'null')
String areafilter = "areafilter_example"; // String | AreaFilter (Separator ',' IDList of AreaIDs separated by ',', 'null' : Filter disabled), (default:'null')
String highlight = "highlight_example"; // String | Highlight Filter (Show only Highlights possible values: 'true' : show only Highlight Pois, 'null' Filter disabled), (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities, (default:'null')
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null'), (default:'null')
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<GBLTSPoi> result = apiInstance.poiGetPoiFiltered(pagenumber, pagesize, poitype, subtype, idlist, locfilter, areafilter, highlight, odhtagfilter, active, odhactive, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiApi#poiGetPoiFiltered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **poitype** | **String**| Type of the Poi (possible values: STRINGS: &#39;Ärzte, Apotheken&#39;,&#39;Geschäfte&#39;,&#39;Kultur und Sehenswürdigkeiten&#39;,&#39;Nachtleben und Unterhaltung&#39;,&#39;Öffentliche Einrichtungen&#39;,&#39;Sport und Freizeit&#39;,&#39;Verkehr und Transport&#39;,&#39;Dienstleister&#39;,&#39;Kunsthandwerker&#39; : BITMASK also possible: &#39;Ärzte, Apotheken &#x3D; 1&#39;,&#39;Geschäfte &#x3D; 2&#39;,&#39;Kultur und Sehenswürdigkeiten &#x3D; 4&#39;,&#39;Nachtleben und Unterhaltung &#x3D; 8&#39;,&#39;Öffentliche Einrichtungen &#x3D; 16&#39;,&#39;Sport und Freizeit &#x3D; 32&#39;,&#39;Verkehr und Transport &#x3D; 64&#39;, &#39;Dienstleister&#39; &#x3D; 128, &#39;Kunsthandwerker&#39; &#x3D; 256), (default:&#39;511&#39;) | [optional]
 **subtype** | **String**| Subtype of the Poi (&#39;null&#39; &#x3D; Filter disabled, available Subtypes depends on the activitytype BITMASK), (default:&#39;null&#39;) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of Activity IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **areafilter** | **String**| AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;, &#39;null&#39; : Filter disabled), (default:&#39;null&#39;) | [optional]
 **highlight** | **String**| Highlight Filter (Show only Highlights possible values: &#39;true&#39; : show only Highlight Pois, &#39;null&#39; Filter disabled), (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities, (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;GBLTSPoi&gt;**](GBLTSPoi.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiGetPoiLocalized"></a>
# **poiGetPoiLocalized**
> List&lt;GBLTSActivityPoiLocalized&gt; poiGetPoiLocalized(language, pagenumber, pagesize, poitype, subtype, idlist, locfilter, areafilter, highlight, odhtagfilter, active, odhactive, seed, latitude, longitude, radius)

GET Poi Localized List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.PoiApi;


PoiApi apiInstance = new PoiApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String poitype = "poitype_example"; // String | Type of the Poi (possible values: STRINGS: 'Ärzte, Apotheken','Geschäfte','Kultur und Sehenswürdigkeiten','Nachtleben und Unterhaltung','Öffentliche Einrichtungen','Sport und Freizeit','Verkehr und Transport','Dienstleister','Kunsthandwerker' : BITMASK also possible: 'Ärzte, Apotheken = 1','Geschäfte = 2','Kultur und Sehenswürdigkeiten = 4','Nachtleben und Unterhaltung = 8','Öffentliche Einrichtungen = 16','Sport und Freizeit = 32','Verkehr und Transport = 64', 'Dienstleister' = 128, 'Kunsthandwerker' = 256), (default:'511')
String subtype = "subtype_example"; // String | Subtype of the Poi ('null' = Filter disabled, available Subtypes depends on the activitytype BITMASK), (default:'null')
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of Activity IDs, 'null' = No Filter), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction), 'null' = No Filter), (default:'null')
String areafilter = "areafilter_example"; // String | AreaFilter (Separator ',' IDList of AreaIDs separated by ',', 'null' : Filter disabled), (default:'null')
String highlight = "highlight_example"; // String | Highlight Filter (Show only Highlights possible values: 'true' : show only Highlight Pois, 'null' Filter disabled), (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities, (default:'null')
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null'), (default:'null')
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<GBLTSActivityPoiLocalized> result = apiInstance.poiGetPoiLocalized(language, pagenumber, pagesize, poitype, subtype, idlist, locfilter, areafilter, highlight, odhtagfilter, active, odhactive, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiApi#poiGetPoiLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **poitype** | **String**| Type of the Poi (possible values: STRINGS: &#39;Ärzte, Apotheken&#39;,&#39;Geschäfte&#39;,&#39;Kultur und Sehenswürdigkeiten&#39;,&#39;Nachtleben und Unterhaltung&#39;,&#39;Öffentliche Einrichtungen&#39;,&#39;Sport und Freizeit&#39;,&#39;Verkehr und Transport&#39;,&#39;Dienstleister&#39;,&#39;Kunsthandwerker&#39; : BITMASK also possible: &#39;Ärzte, Apotheken &#x3D; 1&#39;,&#39;Geschäfte &#x3D; 2&#39;,&#39;Kultur und Sehenswürdigkeiten &#x3D; 4&#39;,&#39;Nachtleben und Unterhaltung &#x3D; 8&#39;,&#39;Öffentliche Einrichtungen &#x3D; 16&#39;,&#39;Sport und Freizeit &#x3D; 32&#39;,&#39;Verkehr und Transport &#x3D; 64&#39;, &#39;Dienstleister&#39; &#x3D; 128, &#39;Kunsthandwerker&#39; &#x3D; 256), (default:&#39;511&#39;) | [optional]
 **subtype** | **String**| Subtype of the Poi (&#39;null&#39; &#x3D; Filter disabled, available Subtypes depends on the activitytype BITMASK), (default:&#39;null&#39;) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of Activity IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **areafilter** | **String**| AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;, &#39;null&#39; : Filter disabled), (default:&#39;null&#39;) | [optional]
 **highlight** | **String**| Highlight Filter (Show only Highlights possible values: &#39;true&#39; : show only Highlight Pois, &#39;null&#39; Filter disabled), (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities, (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;GBLTSActivityPoiLocalized&gt;**](GBLTSActivityPoiLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiGetPoiReduced"></a>
# **poiGetPoiReduced**
> List&lt;ActivityPoiReduced&gt; poiGetPoiReduced(language, poitype, subtype, locfilter, areafilter, highlight, odhtagfilter, active, odhactive, latitude, longitude, radius)

GET Poi List Reduced

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.PoiApi;


PoiApi apiInstance = new PoiApi();
String language = "language_example"; // String | Localization Language, (default:'en')
String poitype = "poitype_example"; // String | Type of the Poi (possible values: STRINGS: 'Ärzte, Apotheken','Geschäfte','Kultur und Sehenswürdigkeiten','Nachtleben und Unterhaltung','Öffentliche Einrichtungen','Sport und Freizeit','Verkehr und Transport','Dienstleister','Kunsthandwerker' : BITMASK also possible: 'Ärzte, Apotheken = 1','Geschäfte = 2','Kultur und Sehenswürdigkeiten = 4','Nachtleben und Unterhaltung = 8','Öffentliche Einrichtungen = 16','Sport und Freizeit = 32','Verkehr und Transport = 64', 'Dienstleister' = 128, 'Kunsthandwerker' = 256), (default:'511')
String subtype = "subtype_example"; // String | Subtype of the Activity (BITMASK Filter = available SubTypes depends on the selected Activity Type), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String areafilter = "areafilter_example"; // String | AreaFilter (Separator ',' IDList of AreaIDs separated by ','), (default:'null')
String highlight = "highlight_example"; // String | Hightlight Filter (possible values: 'false' = only Activities with Highlight false, 'true' = only Activities with Highlight true), (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<ActivityPoiReduced> result = apiInstance.poiGetPoiReduced(language, poitype, subtype, locfilter, areafilter, highlight, odhtagfilter, active, odhactive, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiApi#poiGetPoiReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **poitype** | **String**| Type of the Poi (possible values: STRINGS: &#39;Ärzte, Apotheken&#39;,&#39;Geschäfte&#39;,&#39;Kultur und Sehenswürdigkeiten&#39;,&#39;Nachtleben und Unterhaltung&#39;,&#39;Öffentliche Einrichtungen&#39;,&#39;Sport und Freizeit&#39;,&#39;Verkehr und Transport&#39;,&#39;Dienstleister&#39;,&#39;Kunsthandwerker&#39; : BITMASK also possible: &#39;Ärzte, Apotheken &#x3D; 1&#39;,&#39;Geschäfte &#x3D; 2&#39;,&#39;Kultur und Sehenswürdigkeiten &#x3D; 4&#39;,&#39;Nachtleben und Unterhaltung &#x3D; 8&#39;,&#39;Öffentliche Einrichtungen &#x3D; 16&#39;,&#39;Sport und Freizeit &#x3D; 32&#39;,&#39;Verkehr und Transport &#x3D; 64&#39;, &#39;Dienstleister&#39; &#x3D; 128, &#39;Kunsthandwerker&#39; &#x3D; 256), (default:&#39;511&#39;) | [optional]
 **subtype** | **String**| Subtype of the Activity (BITMASK Filter &#x3D; available SubTypes depends on the selected Activity Type), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **areafilter** | **String**| AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;) | [optional]
 **highlight** | **String**| Hightlight Filter (possible values: &#39;false&#39; &#x3D; only Activities with Highlight false, &#39;true&#39; &#x3D; only Activities with Highlight true), (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;ActivityPoiReduced&gt;**](ActivityPoiReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiGetPoiSingle"></a>
# **poiGetPoiSingle**
> GBLTSPoi poiGetPoiSingle(id)

GET Poi Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.PoiApi;


PoiApi apiInstance = new PoiApi();
String id = "id_example"; // String | ID of the Poi
try {
    GBLTSPoi result = apiInstance.poiGetPoiSingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiApi#poiGetPoiSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Poi |

### Return type

[**GBLTSPoi**](GBLTSPoi.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiGetPoiSingleLocalized"></a>
# **poiGetPoiSingleLocalized**
> GBLTSActivityPoiLocalized poiGetPoiSingleLocalized(id, language)

GET Poi Localized Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.PoiApi;


PoiApi apiInstance = new PoiApi();
String id = "id_example"; // String | ID of the Poi
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    GBLTSActivityPoiLocalized result = apiInstance.poiGetPoiSingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiApi#poiGetPoiSingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Poi |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**GBLTSActivityPoiLocalized**](GBLTSActivityPoiLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


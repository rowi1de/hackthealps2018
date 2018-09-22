# OdhActivityPoiApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oDHActivityPoiGetAllODHActivityPoiChanged**](OdhActivityPoiApi.md#oDHActivityPoiGetAllODHActivityPoiChanged) | **GET** /api/ODHActivityPoiChanged | GET ODHActivityPoi Changed List by Date
[**oDHActivityPoiGetAllODHActivityPoiTypesList**](OdhActivityPoiApi.md#oDHActivityPoiGetAllODHActivityPoiTypesList) | **GET** /api/ODHActivityPoiTypes | GET ODHActivityPoi Types List
[**oDHActivityPoiGetODHActivityPoiList**](OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiList) | **GET** /api/ODHActivityPoi | GET ODHActivityPoi List
[**oDHActivityPoiGetODHActivityPoiListLocalized**](OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiListLocalized) | **GET** /api/ODHActivityPoiLocalized | GET ODHActivityPoi List Localized
[**oDHActivityPoiGetODHActivityPoiListReduced**](OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiListReduced) | **GET** /api/ODHActivityPoiReduced | GET ODHActivityPoi List Reduced
[**oDHActivityPoiGetODHActivityPoiSingle**](OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiSingle) | **GET** /api/ODHActivityPoi/{id} | GET ODHActivityPoi Single
[**oDHActivityPoiGetODHActivityPoiSingleLocalized**](OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiSingleLocalized) | **GET** /api/ODHActivityPoiLocalized/{id} | GET ODHActivityPoi Single Reduced


<a name="oDHActivityPoiGetAllODHActivityPoiChanged"></a>
# **oDHActivityPoiGetAllODHActivityPoiChanged**
> List&lt;ODHActivityPoi&gt; oDHActivityPoiGetAllODHActivityPoiChanged(pagenumber, pagesize, seed, updatefrom)

GET ODHActivityPoi Changed List by Date

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhActivityPoiApi;


OdhActivityPoiApi apiInstance = new OdhActivityPoiApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, 'null' disables Random Sorting, (default:0)
String updatefrom = "updatefrom_example"; // String | Date from Format (yyyy-MM-dd) (all ODHActivityPoi with LastChange &gt;= datefrom are passed), (default: DateTime.Now - 1 Day)
try {
    List<ODHActivityPoi> result = apiInstance.oDHActivityPoiGetAllODHActivityPoiChanged(pagenumber, pagesize, seed, updatefrom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhActivityPoiApi#oDHActivityPoiGetAllODHActivityPoiChanged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0) | [optional]
 **updatefrom** | **String**| Date from Format (yyyy-MM-dd) (all ODHActivityPoi with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day) | [optional]

### Return type

[**List&lt;ODHActivityPoi&gt;**](ODHActivityPoi.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oDHActivityPoiGetAllODHActivityPoiTypesList"></a>
# **oDHActivityPoiGetAllODHActivityPoiTypesList**
> List&lt;SmgPoiTypes&gt; oDHActivityPoiGetAllODHActivityPoiTypesList()

GET ODHActivityPoi Types List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhActivityPoiApi;


OdhActivityPoiApi apiInstance = new OdhActivityPoiApi();
try {
    List<SmgPoiTypes> result = apiInstance.oDHActivityPoiGetAllODHActivityPoiTypesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhActivityPoiApi#oDHActivityPoiGetAllODHActivityPoiTypesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SmgPoiTypes&gt;**](SmgPoiTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oDHActivityPoiGetODHActivityPoiList"></a>
# **oDHActivityPoiGetODHActivityPoiList**
> List&lt;ODHActivityPoi&gt; oDHActivityPoiGetODHActivityPoiList(pagenumber, pagesize, type, subtype, poitype, idlist, locfilter, langfilter, areafilter, highlight, source, odhtagfilter, odhactive, seed, latitude, longitude, radius)

GET ODHActivityPoi List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhActivityPoiApi;


OdhActivityPoiApi apiInstance = new OdhActivityPoiApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String type = "type_example"; // String | Type of the ODHActivityPoi ('null' = Filter disabled, possible values: BITMASK: 'Wellness = 1','Winter = 2','Summer = 4','Culture = 8','Other = 16','Gastronomy = 32'), (default: 63 == ALL), ALSO POSSIBLE USE OF STRINGS: 'Wellness Entspannung','Winter','Sommer','Kultur Sehenswürdigkeiten','Anderes','Essen Trinken'
String subtype = "subtype_example"; // String | Subtype of the ODHActivityPoi ('null' = Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype reference to ODHActivityPoiTypes)
String poitype = "poitype_example"; // String | Additional Type of the ODHActivityPoi ('null' = Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype, SubType reference to ODHActivityPoiTypes)
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of ODHActivityPoi IDs), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String langfilter = "langfilter_example"; // String | ODHActivityPoi Langfilter (returns only SmgPois available in the selected Language, Separator ',' possible values: 'de,it,en,nl,sc,pl,fr,ru', 'null': Filter disabled)
String areafilter = "areafilter_example"; // String | AreaFilter (Separator ',' IDList of AreaIDs separated by ','), (default:'null')
String highlight = "highlight_example"; // String | Hightlight Filter (possible values: 'false' = only ODHActivityPoi with Highlight false, 'true' = only ODHActivityPoi with Highlight true), (default:'null')
String source = "source_example"; // String | Source Filter (possible Values: 'null' Displays all ODHActivityPoi, 'None', 'ActivityData', 'PoiData','GastronomicData','MuseumData','Magnolia','Content','VerticalLife','SuedtirolWein','Archapp' (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/ODHTag'), (default:'null')
String odhactive = "odhactive_example"; // String | odhactive (Published) ODHActivityPoi Filter (possible Values: 'true' only published ODHActivityPoi, 'false' only not published ODHActivityPoi, (default:'null')
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<ODHActivityPoi> result = apiInstance.oDHActivityPoiGetODHActivityPoiList(pagenumber, pagesize, type, subtype, poitype, idlist, locfilter, langfilter, areafilter, highlight, source, odhtagfilter, odhactive, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhActivityPoiApi#oDHActivityPoiGetODHActivityPoiList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **type** | **String**| Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, possible values: BITMASK: &#39;Wellness &#x3D; 1&#39;,&#39;Winter &#x3D; 2&#39;,&#39;Summer &#x3D; 4&#39;,&#39;Culture &#x3D; 8&#39;,&#39;Other &#x3D; 16&#39;,&#39;Gastronomy &#x3D; 32&#39;), (default: 63 &#x3D;&#x3D; ALL), ALSO POSSIBLE USE OF STRINGS: &#39;Wellness Entspannung&#39;,&#39;Winter&#39;,&#39;Sommer&#39;,&#39;Kultur Sehenswürdigkeiten&#39;,&#39;Anderes&#39;,&#39;Essen Trinken&#39; | [optional]
 **subtype** | **String**| Subtype of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype reference to ODHActivityPoiTypes) | [optional]
 **poitype** | **String**| Additional Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype, SubType reference to ODHActivityPoiTypes) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of ODHActivityPoi IDs), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **langfilter** | **String**| ODHActivityPoi Langfilter (returns only SmgPois available in the selected Language, Separator &#39;,&#39; possible values: &#39;de,it,en,nl,sc,pl,fr,ru&#39;, &#39;null&#39;: Filter disabled) | [optional]
 **areafilter** | **String**| AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;) | [optional]
 **highlight** | **String**| Hightlight Filter (possible values: &#39;false&#39; &#x3D; only ODHActivityPoi with Highlight false, &#39;true&#39; &#x3D; only ODHActivityPoi with Highlight true), (default:&#39;null&#39;) | [optional]
 **source** | **String**| Source Filter (possible Values: &#39;null&#39; Displays all ODHActivityPoi, &#39;None&#39;, &#39;ActivityData&#39;, &#39;PoiData&#39;,&#39;GastronomicData&#39;,&#39;MuseumData&#39;,&#39;Magnolia&#39;,&#39;Content&#39;,&#39;VerticalLife&#39;,&#39;SuedtirolWein&#39;,&#39;Archapp&#39; (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/ODHTag&#39;), (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| odhactive (Published) ODHActivityPoi Filter (possible Values: &#39;true&#39; only published ODHActivityPoi, &#39;false&#39; only not published ODHActivityPoi, (default:&#39;null&#39;) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;ODHActivityPoi&gt;**](ODHActivityPoi.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oDHActivityPoiGetODHActivityPoiListLocalized"></a>
# **oDHActivityPoiGetODHActivityPoiListLocalized**
> List&lt;ODHActivityPoiLocalized&gt; oDHActivityPoiGetODHActivityPoiListLocalized(language, pagenumber, pagesize, type, subtype, poitype, idlist, locfilter, langfilter, areafilter, highlight, source, odhtagfilter, odhactive, seed, latitude, longitude, radius)

GET ODHActivityPoi List Localized

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhActivityPoiApi;


OdhActivityPoiApi apiInstance = new OdhActivityPoiApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String type = "type_example"; // String | Type of the ODHActivityPoi ('null' = Filter disabled, possible values: BITMASK: 'Wellness = 1','Winter = 2','Summer = 4','Culture = 8','Other = 16','Gastronomy = 32'), (default: 63 == ALL), ALSO POSSIBLE USE OF STRINGS: 'Wellness Entspannung','Winter','Sommer','Kultur Sehenswürdigkeiten','Anderes','Essen Trinken'
String subtype = "subtype_example"; // String | Subtype of the ODHActivityPoi ('null' = Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype reference to ODHActivityPoiTypes)
String poitype = "poitype_example"; // String | Additional Type of the ODHActivityPoi ('null' = Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype, SubType reference to ODHActivityPoiTypes)
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of ODHActivityPoi IDs), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String langfilter = "langfilter_example"; // String | ODHActivityPoi Langfilter (returns only SmgPois available in the selected Language, Separator ',' possible values: 'de,it,en,nl,sc,pl,fr,ru', 'null': Filter disabled)
String areafilter = "areafilter_example"; // String | AreaFilter (Separator ',' IDList of AreaIDs separated by ','), (default:'null')
String highlight = "highlight_example"; // String | Hightlight Filter (possible values: 'false' = only ODHActivityPoi with Highlight false, 'true' = only ODHActivityPoi with Highlight true), (default:'null')
String source = "source_example"; // String | Source Filter (possible Values: 'null' Displays all ODHActivityPoi, 'None', 'ActivityData', 'PoiData','GastronomicData','MuseumData','Magnolia','Content','VerticalLife','SuedtirolWein','Archapp' (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/ODHTag'), (default:'null')
String odhactive = "odhactive_example"; // String | odhactive (Published) ODHActivityPoi Filter (possible Values: 'true' only published ODHActivityPoi, 'false' only not published ODHActivityPoi, (default:'null')
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<ODHActivityPoiLocalized> result = apiInstance.oDHActivityPoiGetODHActivityPoiListLocalized(language, pagenumber, pagesize, type, subtype, poitype, idlist, locfilter, langfilter, areafilter, highlight, source, odhtagfilter, odhactive, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhActivityPoiApi#oDHActivityPoiGetODHActivityPoiListLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **type** | **String**| Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, possible values: BITMASK: &#39;Wellness &#x3D; 1&#39;,&#39;Winter &#x3D; 2&#39;,&#39;Summer &#x3D; 4&#39;,&#39;Culture &#x3D; 8&#39;,&#39;Other &#x3D; 16&#39;,&#39;Gastronomy &#x3D; 32&#39;), (default: 63 &#x3D;&#x3D; ALL), ALSO POSSIBLE USE OF STRINGS: &#39;Wellness Entspannung&#39;,&#39;Winter&#39;,&#39;Sommer&#39;,&#39;Kultur Sehenswürdigkeiten&#39;,&#39;Anderes&#39;,&#39;Essen Trinken&#39; | [optional]
 **subtype** | **String**| Subtype of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype reference to ODHActivityPoiTypes) | [optional]
 **poitype** | **String**| Additional Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype, SubType reference to ODHActivityPoiTypes) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of ODHActivityPoi IDs), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **langfilter** | **String**| ODHActivityPoi Langfilter (returns only SmgPois available in the selected Language, Separator &#39;,&#39; possible values: &#39;de,it,en,nl,sc,pl,fr,ru&#39;, &#39;null&#39;: Filter disabled) | [optional]
 **areafilter** | **String**| AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;) | [optional]
 **highlight** | **String**| Hightlight Filter (possible values: &#39;false&#39; &#x3D; only ODHActivityPoi with Highlight false, &#39;true&#39; &#x3D; only ODHActivityPoi with Highlight true), (default:&#39;null&#39;) | [optional]
 **source** | **String**| Source Filter (possible Values: &#39;null&#39; Displays all ODHActivityPoi, &#39;None&#39;, &#39;ActivityData&#39;, &#39;PoiData&#39;,&#39;GastronomicData&#39;,&#39;MuseumData&#39;,&#39;Magnolia&#39;,&#39;Content&#39;,&#39;VerticalLife&#39;,&#39;SuedtirolWein&#39;,&#39;Archapp&#39; (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/ODHTag&#39;), (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| odhactive (Published) ODHActivityPoi Filter (possible Values: &#39;true&#39; only published ODHActivityPoi, &#39;false&#39; only not published ODHActivityPoi, (default:&#39;null&#39;) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;ODHActivityPoiLocalized&gt;**](ODHActivityPoiLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oDHActivityPoiGetODHActivityPoiListReduced"></a>
# **oDHActivityPoiGetODHActivityPoiListReduced**
> List&lt;ActivityPoiReduced&gt; oDHActivityPoiGetODHActivityPoiListReduced(language, type, subtype, poitype, locfilter, langfilter, areafilter, highlight, source, odhtagfilter, odhactive, latitude, longitude, radius)

GET ODHActivityPoi List Reduced

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhActivityPoiApi;


OdhActivityPoiApi apiInstance = new OdhActivityPoiApi();
String language = "language_example"; // String | Localization Language, (default:'en')
String type = "type_example"; // String | Type of the ODHActivityPoi ('null' = Filter disabled, possible values: BITMASK: 'Wellness = 1','Winter = 2','Summer = 4','Culture = 8','Other = 16','Gastronomy = 32'), (default: 63 == ALL), ALSO POSSIBLE USE OF STRINGS: 'Wellness Entspannung','Winter','Sommer','Kultur Sehenswürdigkeiten','Anderes','Essen Trinken'
String subtype = "subtype_example"; // String | Subtype of the ODHActivityPoi ('null' = Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype reference to ODHActivityPoiTypes)
String poitype = "poitype_example"; // String | Additional Type of the ODHActivityPoi ('null' = Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype, SubType reference to ODHActivityPoiTypes)
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String langfilter = "langfilter_example"; // String | ODHActivityPoi Langfilter (returns only SmgPois available in the selected Language, Separator ',' possible values: 'de,it,en,nl,sc,pl,fr,ru', 'null': Filter disabled)
String areafilter = "areafilter_example"; // String | AreaFilter (Separator ',' IDList of AreaIDs separated by ','), (default:'null')
String highlight = "highlight_example"; // String | Hightlight Filter (possible values: 'false' = only ODHActivityPoi with Highlight false, 'true' = only ODHActivityPoi with Highlight true), (default:'null')
String source = "source_example"; // String | Source Filter (possible Values: 'null' Displays all ODHActivityPoi, 'None', 'ActivityData', 'PoiData','GastronomicData','MuseumData','Magnolia','Content','VerticalLife','SuedtirolWein','Archapp' (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/ODHTag'), (default:'null')
String odhactive = "odhactive_example"; // String | odhactive (Published) ODHActivityPoi Filter (possible Values: 'true' only published ODHActivityPoi, 'false' only not published ODHActivityPoi, (default:'null')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<ActivityPoiReduced> result = apiInstance.oDHActivityPoiGetODHActivityPoiListReduced(language, type, subtype, poitype, locfilter, langfilter, areafilter, highlight, source, odhtagfilter, odhactive, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhActivityPoiApi#oDHActivityPoiGetODHActivityPoiListReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **type** | **String**| Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, possible values: BITMASK: &#39;Wellness &#x3D; 1&#39;,&#39;Winter &#x3D; 2&#39;,&#39;Summer &#x3D; 4&#39;,&#39;Culture &#x3D; 8&#39;,&#39;Other &#x3D; 16&#39;,&#39;Gastronomy &#x3D; 32&#39;), (default: 63 &#x3D;&#x3D; ALL), ALSO POSSIBLE USE OF STRINGS: &#39;Wellness Entspannung&#39;,&#39;Winter&#39;,&#39;Sommer&#39;,&#39;Kultur Sehenswürdigkeiten&#39;,&#39;Anderes&#39;,&#39;Essen Trinken&#39; | [optional]
 **subtype** | **String**| Subtype of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype reference to ODHActivityPoiTypes) | [optional]
 **poitype** | **String**| Additional Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype, SubType reference to ODHActivityPoiTypes) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **langfilter** | **String**| ODHActivityPoi Langfilter (returns only SmgPois available in the selected Language, Separator &#39;,&#39; possible values: &#39;de,it,en,nl,sc,pl,fr,ru&#39;, &#39;null&#39;: Filter disabled) | [optional]
 **areafilter** | **String**| AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;) | [optional]
 **highlight** | **String**| Hightlight Filter (possible values: &#39;false&#39; &#x3D; only ODHActivityPoi with Highlight false, &#39;true&#39; &#x3D; only ODHActivityPoi with Highlight true), (default:&#39;null&#39;) | [optional]
 **source** | **String**| Source Filter (possible Values: &#39;null&#39; Displays all ODHActivityPoi, &#39;None&#39;, &#39;ActivityData&#39;, &#39;PoiData&#39;,&#39;GastronomicData&#39;,&#39;MuseumData&#39;,&#39;Magnolia&#39;,&#39;Content&#39;,&#39;VerticalLife&#39;,&#39;SuedtirolWein&#39;,&#39;Archapp&#39; (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/ODHTag&#39;), (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| odhactive (Published) ODHActivityPoi Filter (possible Values: &#39;true&#39; only published ODHActivityPoi, &#39;false&#39; only not published ODHActivityPoi, (default:&#39;null&#39;) | [optional]
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

<a name="oDHActivityPoiGetODHActivityPoiSingle"></a>
# **oDHActivityPoiGetODHActivityPoiSingle**
> ODHActivityPoi oDHActivityPoiGetODHActivityPoiSingle(id)

GET ODHActivityPoi Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhActivityPoiApi;


OdhActivityPoiApi apiInstance = new OdhActivityPoiApi();
String id = "id_example"; // String | ID of the Poi
try {
    ODHActivityPoi result = apiInstance.oDHActivityPoiGetODHActivityPoiSingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhActivityPoiApi#oDHActivityPoiGetODHActivityPoiSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Poi |

### Return type

[**ODHActivityPoi**](ODHActivityPoi.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oDHActivityPoiGetODHActivityPoiSingleLocalized"></a>
# **oDHActivityPoiGetODHActivityPoiSingleLocalized**
> ODHActivityPoiLocalized oDHActivityPoiGetODHActivityPoiSingleLocalized(id, language)

GET ODHActivityPoi Single Reduced

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.OdhActivityPoiApi;


OdhActivityPoiApi apiInstance = new OdhActivityPoiApi();
String id = "id_example"; // String | ID of the Poi
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    ODHActivityPoiLocalized result = apiInstance.oDHActivityPoiGetODHActivityPoiSingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OdhActivityPoiApi#oDHActivityPoiGetODHActivityPoiSingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Poi |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**ODHActivityPoiLocalized**](ODHActivityPoiLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


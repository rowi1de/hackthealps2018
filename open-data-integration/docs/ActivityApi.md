# ActivityApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activityGetActivityFilteredLocalized**](ActivityApi.md#activityGetActivityFilteredLocalized) | **GET** /api/ActivityLocalized | GET Activity List Localized
[**activityGetActivityList**](ActivityApi.md#activityGetActivityList) | **GET** /api/Activity | GET Activity List
[**activityGetActivityReduced**](ActivityApi.md#activityGetActivityReduced) | **GET** /api/ActivityReduced | GET Activity List Reduced
[**activityGetActivitySingle**](ActivityApi.md#activityGetActivitySingle) | **GET** /api/Activity/{id} | GET Activity Single
[**activityGetActivitySingleLocalized**](ActivityApi.md#activityGetActivitySingleLocalized) | **GET** /api/ActivityLocalized/{id} | GET Activity Single Localized
[**activityGetAllActivityChanged**](ActivityApi.md#activityGetAllActivityChanged) | **GET** /api/ActivityChanged | GET Activity Changed List by Date
[**activityGetAllActivityTypesList**](ActivityApi.md#activityGetAllActivityTypesList) | **GET** /api/ActivityTypes | GET Activity Types List


<a name="activityGetActivityFilteredLocalized"></a>
# **activityGetActivityFilteredLocalized**
> List&lt;GBLTSActivityPoiLocalized&gt; activityGetActivityFilteredLocalized(language, pagenumber, pagesize, activitytype, subtype, idlist, locfilter, areafilter, distancefilter, altitudefilter, durationfilter, highlight, difficultyfilter, odhtagfilter, active, odhactive, seed, latitude, longitude, radius)

GET Activity List Localized

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.ActivityApi;


ActivityApi apiInstance = new ActivityApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String activitytype = "activitytype_example"; // String | Type of the Activity (possible values: STRINGS: 'Berg','Radfahren','Stadtrundgang','Pferdesport','Wandern','Laufen und Fitness','Loipen','Rodelbahnen','Piste','Aufstiegsanlagen' - BITMASK also possible: 'Berg = 1','Radfahren = 2','Stadtrundgang = 4','Pferdesport = 8','Wandern = 16','Laufen und Fitness = 32','Loipen = 64','Rodelbahnen = 128,'Piste = 256,'Aufstiegsanlagen = 512), (default:'1023')
String subtype = "subtype_example"; // String | Subtype of the Activity (BITMASK Filter = available SubTypes depends on the selected Activity Type), (default:'null')
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of Activity IDs), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String areafilter = "areafilter_example"; // String | AreaFilter (Separator ',' IDList of AreaIDs separated by ','), (default:'null')
String distancefilter = "distancefilter_example"; // String | Distance Range Filter (Separator ',' example Value: 15,40 Distance from 15 up to 40 Km), (default:'null')
String altitudefilter = "altitudefilter_example"; // String | Altitude Range Filter (Separator ',' example Value: 500,1000 Altitude from 500 up to 1000 metres), (default:'null')
String durationfilter = "durationfilter_example"; // String | Duration Range Filter (Separator ',' example Value: 1,3 Duration from 1 to 3 hours), (default:'null')
String highlight = "highlight_example"; // String | Hightlight Filter (possible values: 'false' = only Activities with Highlight false, 'true' = only Activities with Highlight true), (default:'null')
String difficultyfilter = "difficultyfilter_example"; // String | Difficulty Filter (possible values: '1' = easy, '2' = medium, '3' = difficult), (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null')
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<GBLTSActivityPoiLocalized> result = apiInstance.activityGetActivityFilteredLocalized(language, pagenumber, pagesize, activitytype, subtype, idlist, locfilter, areafilter, distancefilter, altitudefilter, durationfilter, highlight, difficultyfilter, odhtagfilter, active, odhactive, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivityApi#activityGetActivityFilteredLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **activitytype** | **String**| Type of the Activity (possible values: STRINGS: &#39;Berg&#39;,&#39;Radfahren&#39;,&#39;Stadtrundgang&#39;,&#39;Pferdesport&#39;,&#39;Wandern&#39;,&#39;Laufen und Fitness&#39;,&#39;Loipen&#39;,&#39;Rodelbahnen&#39;,&#39;Piste&#39;,&#39;Aufstiegsanlagen&#39; - BITMASK also possible: &#39;Berg &#x3D; 1&#39;,&#39;Radfahren &#x3D; 2&#39;,&#39;Stadtrundgang &#x3D; 4&#39;,&#39;Pferdesport &#x3D; 8&#39;,&#39;Wandern &#x3D; 16&#39;,&#39;Laufen und Fitness &#x3D; 32&#39;,&#39;Loipen &#x3D; 64&#39;,&#39;Rodelbahnen &#x3D; 128,&#39;Piste &#x3D; 256,&#39;Aufstiegsanlagen &#x3D; 512), (default:&#39;1023&#39;) | [optional]
 **subtype** | **String**| Subtype of the Activity (BITMASK Filter &#x3D; available SubTypes depends on the selected Activity Type), (default:&#39;null&#39;) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **areafilter** | **String**| AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;) | [optional]
 **distancefilter** | **String**| Distance Range Filter (Separator &#39;,&#39; example Value: 15,40 Distance from 15 up to 40 Km), (default:&#39;null&#39;) | [optional]
 **altitudefilter** | **String**| Altitude Range Filter (Separator &#39;,&#39; example Value: 500,1000 Altitude from 500 up to 1000 metres), (default:&#39;null&#39;) | [optional]
 **durationfilter** | **String**| Duration Range Filter (Separator &#39;,&#39; example Value: 1,3 Duration from 1 to 3 hours), (default:&#39;null&#39;) | [optional]
 **highlight** | **String**| Hightlight Filter (possible values: &#39;false&#39; &#x3D; only Activities with Highlight false, &#39;true&#39; &#x3D; only Activities with Highlight true), (default:&#39;null&#39;) | [optional]
 **difficultyfilter** | **String**| Difficulty Filter (possible values: &#39;1&#39; &#x3D; easy, &#39;2&#39; &#x3D; medium, &#39;3&#39; &#x3D; difficult), (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;) | [optional]
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

<a name="activityGetActivityList"></a>
# **activityGetActivityList**
> List&lt;GBLTSActivity&gt; activityGetActivityList(pagenumber, pagesize, activitytype, subtype, idlist, locfilter, areafilter, distancefilter, altitudefilter, durationfilter, highlight, difficultyfilter, odhtagfilter, active, odhactive, seed, latitude, longitude, radius)

GET Activity List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.ActivityApi;


ActivityApi apiInstance = new ActivityApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String activitytype = "activitytype_example"; // String | Type of the Activity (possible values: STRINGS: 'Berg','Radfahren','Stadtrundgang','Pferdesport','Wandern','Laufen und Fitness','Loipen','Rodelbahnen','Piste','Aufstiegsanlagen' - BITMASK also possible: 'Berg = 1','Radfahren = 2','Stadtrundgang = 4','Pferdesport = 8','Wandern = 16','Laufen und Fitness = 32','Loipen = 64','Rodelbahnen = 128,'Piste = 256,'Aufstiegsanlagen = 512), (default:'1023')
String subtype = "subtype_example"; // String | Subtype of the Activity (BITMASK Filter = available SubTypes depends on the selected Activity Type), (default:'null')
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of Activity IDs), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String areafilter = "areafilter_example"; // String | AreaFilter (Separator ',' IDList of AreaIDs separated by ','), (default:'null')
String distancefilter = "distancefilter_example"; // String | Distance Range Filter (Separator ',' example Value: 15,40 Distance from 15 up to 40 Km), (default:'null')
String altitudefilter = "altitudefilter_example"; // String | Altitude Range Filter (Separator ',' example Value: 500,1000 Altitude from 500 up to 1000 metres), (default:'null')
String durationfilter = "durationfilter_example"; // String | Duration Range Filter (Separator ',' example Value: 1,3 Duration from 1 to 3 hours), (default:'null')
String highlight = "highlight_example"; // String | Hightlight Filter (possible values: 'false' = only Activities with Highlight false, 'true' = only Activities with Highlight true), (default:'null')
String difficultyfilter = "difficultyfilter_example"; // String | Difficulty Filter (possible values: '1' = easy, '2' = medium, '3' = difficult), (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/ODHTag?validforentity=activity'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null')
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<GBLTSActivity> result = apiInstance.activityGetActivityList(pagenumber, pagesize, activitytype, subtype, idlist, locfilter, areafilter, distancefilter, altitudefilter, durationfilter, highlight, difficultyfilter, odhtagfilter, active, odhactive, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivityApi#activityGetActivityList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **activitytype** | **String**| Type of the Activity (possible values: STRINGS: &#39;Berg&#39;,&#39;Radfahren&#39;,&#39;Stadtrundgang&#39;,&#39;Pferdesport&#39;,&#39;Wandern&#39;,&#39;Laufen und Fitness&#39;,&#39;Loipen&#39;,&#39;Rodelbahnen&#39;,&#39;Piste&#39;,&#39;Aufstiegsanlagen&#39; - BITMASK also possible: &#39;Berg &#x3D; 1&#39;,&#39;Radfahren &#x3D; 2&#39;,&#39;Stadtrundgang &#x3D; 4&#39;,&#39;Pferdesport &#x3D; 8&#39;,&#39;Wandern &#x3D; 16&#39;,&#39;Laufen und Fitness &#x3D; 32&#39;,&#39;Loipen &#x3D; 64&#39;,&#39;Rodelbahnen &#x3D; 128,&#39;Piste &#x3D; 256,&#39;Aufstiegsanlagen &#x3D; 512), (default:&#39;1023&#39;) | [optional]
 **subtype** | **String**| Subtype of the Activity (BITMASK Filter &#x3D; available SubTypes depends on the selected Activity Type), (default:&#39;null&#39;) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **areafilter** | **String**| AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;) | [optional]
 **distancefilter** | **String**| Distance Range Filter (Separator &#39;,&#39; example Value: 15,40 Distance from 15 up to 40 Km), (default:&#39;null&#39;) | [optional]
 **altitudefilter** | **String**| Altitude Range Filter (Separator &#39;,&#39; example Value: 500,1000 Altitude from 500 up to 1000 metres), (default:&#39;null&#39;) | [optional]
 **durationfilter** | **String**| Duration Range Filter (Separator &#39;,&#39; example Value: 1,3 Duration from 1 to 3 hours), (default:&#39;null&#39;) | [optional]
 **highlight** | **String**| Hightlight Filter (possible values: &#39;false&#39; &#x3D; only Activities with Highlight false, &#39;true&#39; &#x3D; only Activities with Highlight true), (default:&#39;null&#39;) | [optional]
 **difficultyfilter** | **String**| Difficulty Filter (possible values: &#39;1&#39; &#x3D; easy, &#39;2&#39; &#x3D; medium, &#39;3&#39; &#x3D; difficult), (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/ODHTag?validforentity&#x3D;activity&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;GBLTSActivity&gt;**](GBLTSActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="activityGetActivityReduced"></a>
# **activityGetActivityReduced**
> List&lt;ActivityPoiReduced&gt; activityGetActivityReduced(language, activitytype, subtype, locfilter, areafilter, distancefilter, altitudefilter, durationfilter, highlight, difficultyfilter, odhtagfilter, active, odhactive, latitude, longitude, radius)

GET Activity List Reduced

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.ActivityApi;


ActivityApi apiInstance = new ActivityApi();
String language = "language_example"; // String | Localization Language, (default:'en')
String activitytype = "activitytype_example"; // String | Type of the Activity (possible values: STRINGS: 'Berg','Radfahren','Stadtrundgang','Pferdesport','Wandern','Laufen und Fitness','Loipen','Rodelbahnen','Piste','Aufstiegsanlagen' - BITMASK also possible: 'Berg = 1','Radfahren = 2','Stadtrundgang = 4','Pferdesport = 8','Wandern = 16','Laufen und Fitness = 32','Loipen = 64','Rodelbahnen = 128,'Piste = 256,'Aufstiegsanlagen = 512), (default:'1023')
String subtype = "subtype_example"; // String | Subtype of the Activity (BITMASK Filter = available SubTypes depends on the selected Activity Type), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String areafilter = "areafilter_example"; // String | AreaFilter (Separator ',' IDList of AreaIDs separated by ','), (default:'null')
String distancefilter = "distancefilter_example"; // String | Distance Range Filter (Separator ',' example Value: 15,40 Distance from 15 up to 40 Km), (default:'null')
String altitudefilter = "altitudefilter_example"; // String | Altitude Range Filter (Separator ',' example Value: 500,1000 Altitude from 500 up to 1000 metres), (default:'null')
String durationfilter = "durationfilter_example"; // String | Duration Range Filter (Separator ',' example Value: 1,3 Duration from 1 to 3 hours), (default:'null')
String highlight = "highlight_example"; // String | Hightlight Filter (possible values: 'false' = only Activities with Highlight false, 'true' = only Activities with Highlight true), (default:'null')
String difficultyfilter = "difficultyfilter_example"; // String | Difficulty Filter (possible values: '1' = easy, '2' = medium, '3' = difficult), (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<ActivityPoiReduced> result = apiInstance.activityGetActivityReduced(language, activitytype, subtype, locfilter, areafilter, distancefilter, altitudefilter, durationfilter, highlight, difficultyfilter, odhtagfilter, active, odhactive, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivityApi#activityGetActivityReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **activitytype** | **String**| Type of the Activity (possible values: STRINGS: &#39;Berg&#39;,&#39;Radfahren&#39;,&#39;Stadtrundgang&#39;,&#39;Pferdesport&#39;,&#39;Wandern&#39;,&#39;Laufen und Fitness&#39;,&#39;Loipen&#39;,&#39;Rodelbahnen&#39;,&#39;Piste&#39;,&#39;Aufstiegsanlagen&#39; - BITMASK also possible: &#39;Berg &#x3D; 1&#39;,&#39;Radfahren &#x3D; 2&#39;,&#39;Stadtrundgang &#x3D; 4&#39;,&#39;Pferdesport &#x3D; 8&#39;,&#39;Wandern &#x3D; 16&#39;,&#39;Laufen und Fitness &#x3D; 32&#39;,&#39;Loipen &#x3D; 64&#39;,&#39;Rodelbahnen &#x3D; 128,&#39;Piste &#x3D; 256,&#39;Aufstiegsanlagen &#x3D; 512), (default:&#39;1023&#39;) | [optional]
 **subtype** | **String**| Subtype of the Activity (BITMASK Filter &#x3D; available SubTypes depends on the selected Activity Type), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **areafilter** | **String**| AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;) | [optional]
 **distancefilter** | **String**| Distance Range Filter (Separator &#39;,&#39; example Value: 15,40 Distance from 15 up to 40 Km), (default:&#39;null&#39;) | [optional]
 **altitudefilter** | **String**| Altitude Range Filter (Separator &#39;,&#39; example Value: 500,1000 Altitude from 500 up to 1000 metres), (default:&#39;null&#39;) | [optional]
 **durationfilter** | **String**| Duration Range Filter (Separator &#39;,&#39; example Value: 1,3 Duration from 1 to 3 hours), (default:&#39;null&#39;) | [optional]
 **highlight** | **String**| Hightlight Filter (possible values: &#39;false&#39; &#x3D; only Activities with Highlight false, &#39;true&#39; &#x3D; only Activities with Highlight true), (default:&#39;null&#39;) | [optional]
 **difficultyfilter** | **String**| Difficulty Filter (possible values: &#39;1&#39; &#x3D; easy, &#39;2&#39; &#x3D; medium, &#39;3&#39; &#x3D; difficult), (default:&#39;null&#39;) | [optional]
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

<a name="activityGetActivitySingle"></a>
# **activityGetActivitySingle**
> GBLTSActivity activityGetActivitySingle(id)

GET Activity Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.ActivityApi;


ActivityApi apiInstance = new ActivityApi();
String id = "id_example"; // String | ID of the Activity
try {
    GBLTSActivity result = apiInstance.activityGetActivitySingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivityApi#activityGetActivitySingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Activity |

### Return type

[**GBLTSActivity**](GBLTSActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="activityGetActivitySingleLocalized"></a>
# **activityGetActivitySingleLocalized**
> GBLTSActivityPoiLocalized activityGetActivitySingleLocalized(id, language)

GET Activity Single Localized

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.ActivityApi;


ActivityApi apiInstance = new ActivityApi();
String id = "id_example"; // String | ID of the Activity
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    GBLTSActivityPoiLocalized result = apiInstance.activityGetActivitySingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivityApi#activityGetActivitySingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Activity |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**GBLTSActivityPoiLocalized**](GBLTSActivityPoiLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="activityGetAllActivityChanged"></a>
# **activityGetAllActivityChanged**
> List&lt;GBLTSActivity&gt; activityGetAllActivityChanged(pagenumber, pagesize, seed, updatefrom)

GET Activity Changed List by Date

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.ActivityApi;


ActivityApi apiInstance = new ActivityApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, 'null' disables Random Sorting, (default:0)
String updatefrom = "updatefrom_example"; // String | Date from Format (yyyy-MM-dd) (all GBActivityPoi with LastChange &gt;= datefrom are passed), (default: DateTime.Now - 1 Day)
try {
    List<GBLTSActivity> result = apiInstance.activityGetAllActivityChanged(pagenumber, pagesize, seed, updatefrom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivityApi#activityGetAllActivityChanged");
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

[**List&lt;GBLTSActivity&gt;**](GBLTSActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="activityGetAllActivityTypesList"></a>
# **activityGetAllActivityTypesList**
> List&lt;ActivityTypes&gt; activityGetAllActivityTypesList()

GET Activity Types List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.ActivityApi;


ActivityApi apiInstance = new ActivityApi();
try {
    List<ActivityTypes> result = apiInstance.activityGetAllActivityTypesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivityApi#activityGetAllActivityTypesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ActivityTypes&gt;**](ActivityTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


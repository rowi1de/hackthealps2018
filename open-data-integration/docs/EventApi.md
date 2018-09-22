# EventApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventGetAllEventTopicList**](EventApi.md#eventGetAllEventTopicList) | **GET** /api/EventTopics | GET Event Topic List
[**eventGetAllEventsChanged**](EventApi.md#eventGetAllEventsChanged) | **GET** /api/EventChanged | GET Event Changed List by Date
[**eventGetEventLocalizedSingle**](EventApi.md#eventGetEventLocalizedSingle) | **GET** /api/EventLocalized/{id} | GET Event Localized Single
[**eventGetEventSingle**](EventApi.md#eventGetEventSingle) | **GET** /api/Event/{id} | GET Event Single
[**eventGetEvents**](EventApi.md#eventGetEvents) | **GET** /api/Event | GET Event List
[**eventGetEventsLocalized**](EventApi.md#eventGetEventsLocalized) | **GET** /api/EventLocalized | GET Event Localized List
[**eventGetEventsReduced**](EventApi.md#eventGetEventsReduced) | **GET** /api/EventReduced | GET Event List Reduced


<a name="eventGetAllEventTopicList"></a>
# **eventGetAllEventTopicList**
> List&lt;EventTypes&gt; eventGetAllEventTopicList()

GET Event Topic List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventApi;


EventApi apiInstance = new EventApi();
try {
    List<EventTypes> result = apiInstance.eventGetAllEventTopicList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#eventGetAllEventTopicList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EventTypes&gt;**](EventTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventGetAllEventsChanged"></a>
# **eventGetAllEventsChanged**
> List&lt;Event&gt; eventGetAllEventsChanged(pagenumber, pagesize, seed, updatefrom)

GET Event Changed List by Date

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventApi;


EventApi apiInstance = new EventApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, 'null' disables Random Sorting, (default:0)
String updatefrom = "updatefrom_example"; // String | Date from Format (yyyy-MM-dd) (all Event with LastChange &gt;= datefrom are passed), (default: DateTime.Now - 1 Day)
try {
    List<Event> result = apiInstance.eventGetAllEventsChanged(pagenumber, pagesize, seed, updatefrom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#eventGetAllEventsChanged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0) | [optional]
 **updatefrom** | **String**| Date from Format (yyyy-MM-dd) (all Event with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day) | [optional]

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventGetEventLocalizedSingle"></a>
# **eventGetEventLocalizedSingle**
> EventLocalized eventGetEventLocalizedSingle(id, language)

GET Event Localized Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventApi;


EventApi apiInstance = new EventApi();
String id = "id_example"; // String | ID of the Event
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    EventLocalized result = apiInstance.eventGetEventLocalizedSingle(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#eventGetEventLocalizedSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Event |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**EventLocalized**](EventLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventGetEventSingle"></a>
# **eventGetEventSingle**
> Event eventGetEventSingle(id)

GET Event Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventApi;


EventApi apiInstance = new EventApi();
String id = "id_example"; // String | ID of the Event
try {
    Event result = apiInstance.eventGetEventSingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#eventGetEventSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Event |

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventGetEvents"></a>
# **eventGetEvents**
> List&lt;Event&gt; eventGetEvents(pagenumber, pagesize, idlist, locfilter, rancfilter, typefilter, topicfilter, orgfilter, odhtagfilter, active, odhactive, begindate, enddate, seed, latitude, longitude, radius)

GET Event List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventApi;


EventApi apiInstance = new EventApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of Activity IDs, 'null' = No Filter), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction), 'null' = No Filter), (default:'null')
String rancfilter = "rancfilter_example"; // String | Rancfilter (Ranc 0-5 possible)
String typefilter = "typefilter_example"; // String | Typefilter (Type of Event: not used yet)
String topicfilter = "topicfilter_example"; // String | Topic ID Filter (Filter by Topic ID) BITMASK
String orgfilter = "orgfilter_example"; // String | Organization Filter (Filter by Organizer RID)
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null'), (default:'null')
String active = "active_example"; // String | Active Events Filter (possible Values: 'true' only Active Events, 'false' only Disabled Events, (default:'null')
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null'), (default:'null')
String begindate = "begindate_example"; // String | BeginDate of Events (Format: yyyy-MM-dd)
String enddate = "enddate_example"; // String | EndDate of Events (Format: yyyy-MM-dd)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<Event> result = apiInstance.eventGetEvents(pagenumber, pagesize, idlist, locfilter, rancfilter, typefilter, topicfilter, orgfilter, odhtagfilter, active, odhactive, begindate, enddate, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#eventGetEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of Activity IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **rancfilter** | **String**| Rancfilter (Ranc 0-5 possible) | [optional]
 **typefilter** | **String**| Typefilter (Type of Event: not used yet) | [optional]
 **topicfilter** | **String**| Topic ID Filter (Filter by Topic ID) BITMASK | [optional]
 **orgfilter** | **String**| Organization Filter (Filter by Organizer RID) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Events Filter (possible Values: &#39;true&#39; only Active Events, &#39;false&#39; only Disabled Events, (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **begindate** | **String**| BeginDate of Events (Format: yyyy-MM-dd) | [optional]
 **enddate** | **String**| EndDate of Events (Format: yyyy-MM-dd) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventGetEventsLocalized"></a>
# **eventGetEventsLocalized**
> List&lt;EventLocalized&gt; eventGetEventsLocalized(language, pagenumber, pagesize, idlist, locfilter, rancfilter, typefilter, topicfilter, orgfilter, odhtagfilter, active, odhactive, begindate, enddate, seed, latitude, longitude, radius)

GET Event Localized List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
EventApi


EventApi apiInstance = new EventApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of Activity IDs, 'null' = No Filter), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction), 'null' = No Filter), (default:'null')
String rancfilter = "rancfilter_example"; // String | Rancfilter (Ranc 0-5 possible)
String typefilter = "typefilter_example"; // String | Typefilter (Type of Event: not used yet)
String topicfilter = "topicfilter_example"; // String | Topic ID Filter (Filter by Topic ID) BITMASK
String orgfilter = "orgfilter_example"; // String | Organization Filter (Filter by Organizer RID)
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null'), (default:'null')
String active = "active_example"; // String | Active Events Filter (possible Values: 'true' only Active Events, 'false' only Disabled Events, (default:'null')
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null'), (default:'null')
String begindate = "begindate_example"; // String | BeginDate of Events (Format: yyyy-MM-dd)
String enddate = "enddate_example"; // String | EndDate of Events (Format: yyyy-MM-dd)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<EventLocalized> result = apiInstance.eventGetEventsLocalized(language, pagenumber, pagesize, idlist, locfilter, rancfilter, typefilter, topicfilter, orgfilter, odhtagfilter, active, odhactive, begindate, enddate, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#eventGetEventsLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of Activity IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **rancfilter** | **String**| Rancfilter (Ranc 0-5 possible) | [optional]
 **typefilter** | **String**| Typefilter (Type of Event: not used yet) | [optional]
 **topicfilter** | **String**| Topic ID Filter (Filter by Topic ID) BITMASK | [optional]
 **orgfilter** | **String**| Organization Filter (Filter by Organizer RID) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Events Filter (possible Values: &#39;true&#39; only Active Events, &#39;false&#39; only Disabled Events, (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **begindate** | **String**| BeginDate of Events (Format: yyyy-MM-dd) | [optional]
 **enddate** | **String**| EndDate of Events (Format: yyyy-MM-dd) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;EventLocalized&gt;**](EventLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventGetEventsReduced"></a>
# **eventGetEventsReduced**
> List&lt;EventReduced&gt; eventGetEventsReduced(language, locfilter, rancfilter, typefilter, topicfilter, orgfilter, odhtagfilter, active, odhactive, latitude, longitude, radius)

GET Event List Reduced

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventApi;


EventApi apiInstance = new EventApi();
String language = "language_example"; // String | Localization Language, (default:'en')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction), 'null' = No Filter), (default:'null')
String rancfilter = "rancfilter_example"; // String | Rancfilter (Ranc 0-5 possible)
String typefilter = "typefilter_example"; // String | Typefilter (Type of Event: not used yet)
String topicfilter = "topicfilter_example"; // String | Topic ID Filter (Filter by Topic ID) BITMASK
String orgfilter = "orgfilter_example"; // String | Organization Filter (Filter by Organizer RID)
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null'), (default:'null')
String active = "active_example"; // String | Active Events Filter (possible Values: 'true' only Active Events, 'false' only Disabled Events, (default:'null')
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null'), (default:'null')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<EventReduced> result = apiInstance.eventGetEventsReduced(language, locfilter, rancfilter, typefilter, topicfilter, orgfilter, odhtagfilter, active, odhactive, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#eventGetEventsReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **rancfilter** | **String**| Rancfilter (Ranc 0-5 possible) | [optional]
 **typefilter** | **String**| Typefilter (Type of Event: not used yet) | [optional]
 **topicfilter** | **String**| Topic ID Filter (Filter by Topic ID) BITMASK | [optional]
 **orgfilter** | **String**| Organization Filter (Filter by Organizer RID) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Events Filter (possible Values: &#39;true&#39; only Active Events, &#39;false&#39; only Disabled Events, (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;EventReduced&gt;**](EventReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


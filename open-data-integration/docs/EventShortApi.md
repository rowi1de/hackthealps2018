# EventShortApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventShortGet**](EventShortApi.md#eventShortGet) | **GET** /api/EventShort | GET EventShort List
[**eventShortGetReducedAsync**](EventShortApi.md#eventShortGetReducedAsync) | **GET** /api/EventShort/Reduced | GET EventShort Reduced List
[**eventShortGet_0**](EventShortApi.md#eventShortGet_0) | **GET** /api/EventShort/Detail/{id} | GET EventShort Single
[**eventShortGetbyRoomBooked**](EventShortApi.md#eventShortGetbyRoomBooked) | **GET** /api/EventShort/GetbyRoomBooked | GET EventShort List by Room Occupation


<a name="eventShortGet"></a>
# **eventShortGet**
> ResultEventShort eventShortGet(pagenumber, pagesize, startdate, enddate, datetimeformat, source, eventlocation, onlyactive, eventids)

GET EventShort List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventShortApi;


EventShortApi apiInstance = new EventShortApi();
Integer pagenumber = 56; // Integer | Pagenumber (Integer)
Integer pagesize = 56; // Integer | Pagesize (Integer, max 0124)
String startdate = "startdate_example"; // String | Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
String enddate = "enddate_example"; // String | Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
String datetimeformat = "datetimeformat_example"; // String | not provided, use default format, for unix timestamp pass \"uxtimestamp\"
String source = "source_example"; // String | Source of the data, (possible values 'Content' or 'EBMS')
String eventlocation = "eventlocation_example"; // String | Event Location, (possible values, 'NOI' or 'EC')
String onlyactive = "onlyactive_example"; // String | 'true' if only Events marked as Active by Eurac should be displayed
String eventids = "eventids_example"; // String | comma separated list of event ids
try {
    ResultEventShort result = apiInstance.eventShortGet(pagenumber, pagesize, startdate, enddate, datetimeformat, source, eventlocation, onlyactive, eventids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventShortApi#eventShortGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber (Integer) | [optional]
 **pagesize** | **Integer**| Pagesize (Integer, max 0124) | [optional]
 **startdate** | **String**| Format (yyyy-MM-dd HH:mm) default or Unix Timestamp | [optional]
 **enddate** | **String**| Format (yyyy-MM-dd HH:mm) default or Unix Timestamp | [optional]
 **datetimeformat** | **String**| not provided, use default format, for unix timestamp pass \&quot;uxtimestamp\&quot; | [optional]
 **source** | **String**| Source of the data, (possible values &#39;Content&#39; or &#39;EBMS&#39;) | [optional]
 **eventlocation** | **String**| Event Location, (possible values, &#39;NOI&#39; or &#39;EC&#39;) | [optional]
 **onlyactive** | **String**| &#39;true&#39; if only Events marked as Active by Eurac should be displayed | [optional]
 **eventids** | **String**| comma separated list of event ids | [optional]

### Return type

[**ResultEventShort**](ResultEventShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventShortGetReducedAsync"></a>
# **eventShortGetReducedAsync**
> List&lt;EventShortReduced&gt; eventShortGetReducedAsync(language, startdate, enddate, datetimeformat, source, eventlocation, onlyactive)

GET EventShort Reduced List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventShortApi;


EventShortApi apiInstance = new EventShortApi();
String language = "language_example"; // String | Localization Language
String startdate = "startdate_example"; // String | Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
String enddate = "enddate_example"; // String | Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
String datetimeformat = "datetimeformat_example"; // String | not provided, use default format, for unix timestamp pass \"uxtimestamp\"
String source = "source_example"; // String | Source of the data, (possible values 'Content' or 'EBMS')
String eventlocation = "eventlocation_example"; // String | Event Location, (possible values, 'NOI' or 'EC')
String onlyactive = "onlyactive_example"; // String | 'true' if only Events marked as Active by Eurac should be displayed
try {
    List<EventShortReduced> result = apiInstance.eventShortGetReducedAsync(language, startdate, enddate, datetimeformat, source, eventlocation, onlyactive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventShortApi#eventShortGetReducedAsync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language |
 **startdate** | **String**| Format (yyyy-MM-dd HH:mm) default or Unix Timestamp | [optional]
 **enddate** | **String**| Format (yyyy-MM-dd HH:mm) default or Unix Timestamp | [optional]
 **datetimeformat** | **String**| not provided, use default format, for unix timestamp pass \&quot;uxtimestamp\&quot; | [optional]
 **source** | **String**| Source of the data, (possible values &#39;Content&#39; or &#39;EBMS&#39;) | [optional]
 **eventlocation** | **String**| Event Location, (possible values, &#39;NOI&#39; or &#39;EC&#39;) | [optional]
 **onlyactive** | **String**| &#39;true&#39; if only Events marked as Active by Eurac should be displayed | [optional]

### Return type

[**List&lt;EventShortReduced&gt;**](EventShortReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventShortGet_0"></a>
# **eventShortGet_0**
> List&lt;EventShort&gt; eventShortGet_0(id)

GET EventShort Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventShortApi;


EventShortApi apiInstance = new EventShortApi();
String id = "id_example"; // String | Id of the Event
try {
    List<EventShort> result = apiInstance.eventShortGet_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventShortApi#eventShortGet_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the Event |

### Return type

[**List&lt;EventShort&gt;**](EventShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventShortGetbyRoomBooked"></a>
# **eventShortGetbyRoomBooked**
> List&lt;EventShortByRoom&gt; eventShortGetbyRoomBooked(startdate, enddate, datetimeformat, source, eventlocation, onlyactive, eventids)

GET EventShort List by Room Occupation

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.EventShortApi;


EventShortApi apiInstance = new EventShortApi();
String startdate = "startdate_example"; // String | Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
String enddate = "enddate_example"; // String | Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
String datetimeformat = "datetimeformat_example"; // String | not provided, use default format, for unix timestamp pass \"uxtimestamp\"
String source = "source_example"; // String | Source of the data, (possible values 'Content' or 'EBMS')
String eventlocation = "eventlocation_example"; // String | Event Location, (possible values, 'NOI' or 'EC')
String onlyactive = "onlyactive_example"; // String | 'true' if only Events marked as Active by Eurac should be displayed
String eventids = "eventids_example"; // String | comma separated list of event ids
try {
    List<EventShortByRoom> result = apiInstance.eventShortGetbyRoomBooked(startdate, enddate, datetimeformat, source, eventlocation, onlyactive, eventids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventShortApi#eventShortGetbyRoomBooked");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startdate** | **String**| Format (yyyy-MM-dd HH:mm) default or Unix Timestamp | [optional]
 **enddate** | **String**| Format (yyyy-MM-dd HH:mm) default or Unix Timestamp | [optional]
 **datetimeformat** | **String**| not provided, use default format, for unix timestamp pass \&quot;uxtimestamp\&quot; | [optional]
 **source** | **String**| Source of the data, (possible values &#39;Content&#39; or &#39;EBMS&#39;) | [optional]
 **eventlocation** | **String**| Event Location, (possible values, &#39;NOI&#39; or &#39;EC&#39;) | [optional]
 **onlyactive** | **String**| &#39;true&#39; if only Events marked as Active by Eurac should be displayed | [optional]
 **eventids** | **String**| comma separated list of event ids | [optional]

### Return type

[**List&lt;EventShortByRoom&gt;**](EventShortByRoom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


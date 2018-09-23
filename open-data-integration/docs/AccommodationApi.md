# AccommodationApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accommodationGetAccoRoomInfos**](AccommodationApi.md#accommodationGetAccoRoomInfos) | **GET** /api/AccommodationRoom | GET Accommodation Room Info by AccoID
[**accommodationGetAccommodation**](AccommodationApi.md#accommodationGetAccommodation) | **GET** /api/Accommodation/{id} | GET Accommodation Single
[**accommodationGetAccommodationLocalized**](AccommodationApi.md#accommodationGetAccommodationLocalized) | **GET** /api/AccommodationLocalized/{id} | GET Accommodation Single Localized
[**accommodationGetAccommodations**](AccommodationApi.md#accommodationGetAccommodations) | **GET** /api/Accommodation | GET Accommodation List
[**accommodationGetAccommodationsLocalized**](AccommodationApi.md#accommodationGetAccommodationsLocalized) | **GET** /api/AccommodationLocalized | GET Accommodation List Localized
[**accommodationGetAllAccommodationFeatueresList**](AccommodationApi.md#accommodationGetAllAccommodationFeatueresList) | **GET** /api/AccommodationFeatures | GET Accommodation Feature List (LTS Features)
[**accommodationGetAllAccommodationTypesList**](AccommodationApi.md#accommodationGetAllAccommodationTypesList) | **GET** /api/AccommodationTypes | GET Accommodation Types List
[**accommodationGetAllAccommodationsChanged**](AccommodationApi.md#accommodationGetAllAccommodationsChanged) | **GET** /api/AccommodationChanged | GET Accommodation Changed List by Date
[**accommodationGetReducedAccosAsync**](AccommodationApi.md#accommodationGetReducedAccosAsync) | **GET** /api/AccommodationReduced | 
[**accommodationPostAvailableAccommodations**](AccommodationApi.md#accommodationPostAvailableAccommodations) | **POST** /api/AccommodationAvailable | POST Available Accommodations MSS / LCS on posted IDs
[**accommodationPostAvailableMSSResponseonlyAccommodations**](AccommodationApi.md#accommodationPostAvailableMSSResponseonlyAccommodations) | **POST** /api/AvailabilityCheck | POST Available Accommodations MSS / LCS on posted IDs only Availability Response
[**accommodationPostAvailableMSSResponseonlyAllAccommodations**](AccommodationApi.md#accommodationPostAvailableMSSResponseonlyAllAccommodations) | **GET** /api/AvailabilityCheckAll | POST Available Accommodations (All) MSS / LCS only Availability Response


<a name="accommodationGetAccoRoomInfos"></a>
# **accommodationGetAccoRoomInfos**
> List&lt;AccoRoom&gt; accommodationGetAccoRoomInfos(accoid, idsource)

GET Accommodation Room Info by AccoID

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
String accoid = "accoid_example"; // String | Accommodation ID
String idsource = "idsource_example"; // String | ID Source Filter (possible values:'lts','hgv'), (default:'lts')
try {
    List<AccoRoom> result = apiInstance.accommodationGetAccoRoomInfos(accoid, idsource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationGetAccoRoomInfos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accoid** | **String**| Accommodation ID |
 **idsource** | **String**| ID Source Filter (possible values:&#39;lts&#39;,&#39;hgv&#39;), (default:&#39;lts&#39;) | [optional]

### Return type

[**List&lt;AccoRoom&gt;**](AccoRoom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accommodationGetAccommodation"></a>
# **accommodationGetAccommodation**
> Accommodation accommodationGetAccommodation(id, idsource, language, boardfilter, arrival, departure, roominfo, bokfilter, availabilitycheck)

GET Accommodation Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
String id = "id_example"; // String | ID of the Accommodation
String idsource = "idsource_example"; // String | ID Source Filter (possible values:'lts','hgv'), (default:'lts')
String language = "language_example"; // String | Language of the Availability Response (possible values: 'de','it','en'), (default:'de')
String boardfilter = "boardfilter_example"; // String | Boardfilter (BITMASK values: 0 = (all boards), 1 = (without board), 2 = (breakfast), 4 = (half board), 8 = (full board), 16 = (All inclusive), 'null' = No Filter), (default:'0')
String arrival = "arrival_example"; // String | Arrival Date (yyyy-MM-dd) REQUIRED, (default:'Today')
String departure = "departure_example"; // String | Departure Date (yyyy-MM-dd) REQUIRED, (default:'Tomorrow')
String roominfo = "roominfo_example"; // String | Roominfo Filter REQUIRED (Splitter for Rooms '|' Splitter for Persons Ages ',' possible Values Example 1-18,10|1-18 = 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:'1-18,18')
String bokfilter = "bokfilter_example"; // String | Booking Channels Filter REQUIRED (Separator ',' possible values: hgv = (Booking Südtirol), htl = (Hotel.de), exp = (Expedia), bok = (Booking.com), lts = (LTS Availability check)), (default:'hgv')
String availabilitycheck = "availabilitycheck_example"; // String | Availability Check enabled/disabled (possible Values: 'true', 'false), (default Value: 'false')
try {
    Accommodation result = apiInstance.accommodationGetAccommodation(id, idsource, language, boardfilter, arrival, departure, roominfo, bokfilter, availabilitycheck);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationGetAccommodation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Accommodation |
 **idsource** | **String**| ID Source Filter (possible values:&#39;lts&#39;,&#39;hgv&#39;), (default:&#39;lts&#39;) | [optional]
 **language** | **String**| Language of the Availability Response (possible values: &#39;de&#39;,&#39;it&#39;,&#39;en&#39;), (default:&#39;de&#39;) | [optional]
 **boardfilter** | **String**| Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter), (default:&#39;0&#39;) | [optional]
 **arrival** | **String**| Arrival Date (yyyy-MM-dd) REQUIRED, (default:&#39;Today&#39;) | [optional]
 **departure** | **String**| Departure Date (yyyy-MM-dd) REQUIRED, (default:&#39;Tomorrow&#39;) | [optional]
 **roominfo** | **String**| Roominfo Filter REQUIRED (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:&#39;1-18,18&#39;) | [optional]
 **bokfilter** | **String**| Booking Channels Filter REQUIRED (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), lts &#x3D; (LTS Availability check)), (default:&#39;hgv&#39;) | [optional]
 **availabilitycheck** | **String**| Availability Check enabled/disabled (possible Values: &#39;true&#39;, &#39;false), (default Value: &#39;false&#39;) | [optional]

### Return type

[**Accommodation**](Accommodation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accommodationGetAccommodationLocalized"></a>
# **accommodationGetAccommodationLocalized**
> AccommodationLocalized accommodationGetAccommodationLocalized(id, language, idsource, boardfilter, arrival, departure, roominfo, bokfilter, availabilitycheck)

GET Accommodation Single Localized

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
String id = "id_example"; // String | ID of the Accommodation
String language = "language_example"; // String | Localization Language
String idsource = "idsource_example"; // String | ID Source Filter (possible values:'lts','hgv'), (default:'lts')
String boardfilter = "boardfilter_example"; // String | Boardfilter (BITMASK values: 0 = (all boards), 1 = (without board), 2 = (breakfast), 4 = (half board), 8 = (full board), 16 = (All inclusive), 'null' = No Filter), (default:'0')
String arrival = "arrival_example"; // String | Arrival Date (yyyy-MM-dd) REQUIRED, (default:'Today')
String departure = "departure_example"; // String | Departure Date (yyyy-MM-dd) REQUIRED, (default:'Tomorrow')
String roominfo = "roominfo_example"; // String | Roominfo Filter REQUIRED (Splitter for Rooms '|' Splitter for Persons Ages ',' possible Values Example 1-18,10|1-18 = 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:'1-18,18')
String bokfilter = "bokfilter_example"; // String | Booking Channels Filter REQUIRED (Separator ',' possible values: hgv = (Booking Südtirol), htl = (Hotel.de), exp = (Expedia), bok = (Booking.com), lts = (LTS Availability check)), (default:'hgv')
String availabilitycheck = "availabilitycheck_example"; // String | Availability Check enabled/disabled (possible Values: 'true', 'false), (default Value: 'false')
try {
    AccommodationLocalized result = apiInstance.accommodationGetAccommodationLocalized(id, language, idsource, boardfilter, arrival, departure, roominfo, bokfilter, availabilitycheck);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationGetAccommodationLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Accommodation |
 **language** | **String**| Localization Language | [optional]
 **idsource** | **String**| ID Source Filter (possible values:&#39;lts&#39;,&#39;hgv&#39;), (default:&#39;lts&#39;) | [optional]
 **boardfilter** | **String**| Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter), (default:&#39;0&#39;) | [optional]
 **arrival** | **String**| Arrival Date (yyyy-MM-dd) REQUIRED, (default:&#39;Today&#39;) | [optional]
 **departure** | **String**| Departure Date (yyyy-MM-dd) REQUIRED, (default:&#39;Tomorrow&#39;) | [optional]
 **roominfo** | **String**| Roominfo Filter REQUIRED (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:&#39;1-18,18&#39;) | [optional]
 **bokfilter** | **String**| Booking Channels Filter REQUIRED (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), lts &#x3D; (LTS Availability check)), (default:&#39;hgv&#39;) | [optional]
 **availabilitycheck** | **String**| Availability Check enabled/disabled (possible Values: &#39;true&#39;, &#39;false), (default Value: &#39;false&#39;) | [optional]

### Return type

[**AccommodationLocalized**](AccommodationLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accommodationGetAccommodations"></a>
# **accommodationGetAccommodations**
> List&lt;Accommodation&gt; accommodationGetAccommodations(pagenumber, pagesize, seed, categoryfilter, typefilter, boardfilter, featurefilter, themefilter, badgefilter, idfilter, locfilter, odhtagfilter, odhactive, active, arrival, departure, roominfo, bokfilter, language, availabilitycheck, latitude, longitude, radius)

GET Accommodation List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (If availabilitycheck set, pagesize has no effect all Accommodations are returned), (default:10)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, 'null' disables Random Sorting, (default:0)
String categoryfilter = "categoryfilter_example"; // String | Categoryfilter (BITMASK values: 1 = (not categorized), 2 = (1star), 4 = (1flower), 8 = (1sun), 14 = (1star/1flower/1sun), 16 = (2stars), 32 = (2flowers), 64 = (2suns), 112 = (2stars/2flowers/2suns), 128 = (3stars), 256 = (3flowers), 512 = (3suns), 1024 = (3sstars), 1920 = (3stars/3flowers/3suns/3sstars), 2048 = (4stars), 4096 = (4flowers), 8192 = (4suns), 16384 = (4sstars), 30720 = (4stars/4flowers/4suns/4sstars), 32768 = (5stars), 65536 = (5flowers), 131072 = (5suns), 229376 = (5stars/5flowers/5suns), 'null' = No Filter), (default:'null')
String typefilter = "typefilter_example"; // String | Typefilter (BITMASK values: 1 = (HotelPension), 2 = (BedBreakfast), 4 = (Farm), 8 = (Camping), 16 = (Youth), 32 = (Mountain), 64 = (Apartment), 'null' = No Filter), (default:'null')
String boardfilter = "boardfilter_example"; // String | Boardfilter (BITMASK values: 0 = (all boards), 1 = (without board), 2 = (breakfast), 4 = (half board), 8 = (full board), 16 = (All inclusive), 'null' = No Filter), (default:'0')
String featurefilter = "featurefilter_example"; // String | FeatureFilter (BITMASK values: 1 = (Ruhig gelegen), 2 = (Tagung), 4 = (Schwimmbad), 8 = (Sauna), 16 = (Garage), 32 = (Abholservice), 64 = (Wlan), 128 = (Barrierefrei), 256 = (Allergikerküche), 1024 = (Kleine Haustiere), 2048 = (Gruppenfreundlich), 'null' = No Filter), (default:'null')
String themefilter = "themefilter_example"; // String | Themefilter (BITMASK values: 1 = (Gourment), 2 = (In der Höhe), 4 = (Regionale Wellness), 8 = (Biken), 16 = (Familie), 32 = (Wandern), 64 = (Wein), 128 = (Städtisches Flair), 256 = (Am Skigebiet), 512 = (Mediterran), 1024 = (Dolomiten), 2048 = (Alpin), 4096 = (Kleine Betriebe), 8192 = (Hütten und Berggasthöfe), 16384 = (Bäuerliche Welten), 'null' = No Filter), (default:'null')
String badgefilter = "badgefilter_example"; // String | BadgeFilter (BITMASK values: 1 = (Wellnesshotel), 2 = (Familienhotel), 4 = (Bikehotel), 8 = (Bauernhof), 16 = (Behindertengerecht), 32 = (Wanderhotel), 64 = (Südtirol Privatvermieter), 128 = (Vinum Hotels), 'null' = No Filter), (default:'null')
String idfilter = "idfilter_example"; // String | IDFilter (Separator ',' List of Accommodation IDs, 'null' = No Filter), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction), 'null' = No Filter), (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | ODHTag Filter (String, Separator ',' more ODHTags possible, 'null' = No Filter, available ODHTags reference to 'api/ODHTag?validforentity=accommodation'), (default:'null')
String odhactive = "odhactive_example"; // String | ODHActive Filter (possible Values: 'null' Displays all Accommodations, 'true' only ODH Active Accommodations, 'false' only ODH Disabled Accommodations, (default:'null')
String active = "active_example"; // String | TIC Active Filter (possible Values: 'null' Displays all Accommodations, 'true' only TIC Active Accommodations, 'false' only TIC Disabled Accommodations, (default:'null')
String arrival = "arrival_example"; // String | Arrival Date (yyyy-MM-dd) REQUIRED, (default:'Today')
String departure = "departure_example"; // String | Departure Date (yyyy-MM-dd) REQUIRED, (default:'Tomorrow')
String roominfo = "roominfo_example"; // String | Roominfo Filter REQUIRED (Splitter for Rooms '|' Splitter for Persons Ages ',' possible Values Example 1-18,10|1-18 = 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:'1-18,18')
String bokfilter = "bokfilter_example"; // String | Booking Channels Filter REQUIRED (Separator ',' possible values: hgv = (Booking Südtirol), htl = (Hotel.de), exp = (Expedia), bok = (Booking.com), lts = (LTS Availability check)), (default:'hgv')
String language = "language_example"; // String | Language of the Availability Response (possible values: 'de','it','en'), (default:'de')
String availabilitycheck = "availabilitycheck_example"; // String | Availability Check enabled/disabled (possible Values: 'true', 'false), (default Value: 'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<Accommodation> result = apiInstance.accommodationGetAccommodations(pagenumber, pagesize, seed, categoryfilter, typefilter, boardfilter, featurefilter, themefilter, badgefilter, idfilter, locfilter, odhtagfilter, odhactive, active, arrival, departure, roominfo, bokfilter, language, availabilitycheck, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationGetAccommodations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (If availabilitycheck set, pagesize has no effect all Accommodations are returned), (default:10) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0) | [optional]
 **categoryfilter** | **String**| Categoryfilter (BITMASK values: 1 &#x3D; (not categorized), 2 &#x3D; (1star), 4 &#x3D; (1flower), 8 &#x3D; (1sun), 14 &#x3D; (1star/1flower/1sun), 16 &#x3D; (2stars), 32 &#x3D; (2flowers), 64 &#x3D; (2suns), 112 &#x3D; (2stars/2flowers/2suns), 128 &#x3D; (3stars), 256 &#x3D; (3flowers), 512 &#x3D; (3suns), 1024 &#x3D; (3sstars), 1920 &#x3D; (3stars/3flowers/3suns/3sstars), 2048 &#x3D; (4stars), 4096 &#x3D; (4flowers), 8192 &#x3D; (4suns), 16384 &#x3D; (4sstars), 30720 &#x3D; (4stars/4flowers/4suns/4sstars), 32768 &#x3D; (5stars), 65536 &#x3D; (5flowers), 131072 &#x3D; (5suns), 229376 &#x3D; (5stars/5flowers/5suns), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **typefilter** | **String**| Typefilter (BITMASK values: 1 &#x3D; (HotelPension), 2 &#x3D; (BedBreakfast), 4 &#x3D; (Farm), 8 &#x3D; (Camping), 16 &#x3D; (Youth), 32 &#x3D; (Mountain), 64 &#x3D; (Apartment), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **boardfilter** | **String**| Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter), (default:&#39;0&#39;) | [optional]
 **featurefilter** | **String**| FeatureFilter (BITMASK values: 1 &#x3D; (Ruhig gelegen), 2 &#x3D; (Tagung), 4 &#x3D; (Schwimmbad), 8 &#x3D; (Sauna), 16 &#x3D; (Garage), 32 &#x3D; (Abholservice), 64 &#x3D; (Wlan), 128 &#x3D; (Barrierefrei), 256 &#x3D; (Allergikerküche), 1024 &#x3D; (Kleine Haustiere), 2048 &#x3D; (Gruppenfreundlich), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **themefilter** | **String**| Themefilter (BITMASK values: 1 &#x3D; (Gourment), 2 &#x3D; (In der Höhe), 4 &#x3D; (Regionale Wellness), 8 &#x3D; (Biken), 16 &#x3D; (Familie), 32 &#x3D; (Wandern), 64 &#x3D; (Wein), 128 &#x3D; (Städtisches Flair), 256 &#x3D; (Am Skigebiet), 512 &#x3D; (Mediterran), 1024 &#x3D; (Dolomiten), 2048 &#x3D; (Alpin), 4096 &#x3D; (Kleine Betriebe), 8192 &#x3D; (Hütten und Berggasthöfe), 16384 &#x3D; (Bäuerliche Welten), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **badgefilter** | **String**| BadgeFilter (BITMASK values: 1 &#x3D; (Wellnesshotel), 2 &#x3D; (Familienhotel), 4 &#x3D; (Bikehotel), 8 &#x3D; (Bauernhof), 16 &#x3D; (Behindertengerecht), 32 &#x3D; (Wanderhotel), 64 &#x3D; (Südtirol Privatvermieter), 128 &#x3D; (Vinum Hotels), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **idfilter** | **String**| IDFilter (Separator &#39;,&#39; List of Accommodation IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| ODHTag Filter (String, Separator &#39;,&#39; more ODHTags possible, &#39;null&#39; &#x3D; No Filter, available ODHTags reference to &#39;api/ODHTag?validforentity&#x3D;accommodation&#39;), (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| ODHActive Filter (possible Values: &#39;null&#39; Displays all Accommodations, &#39;true&#39; only ODH Active Accommodations, &#39;false&#39; only ODH Disabled Accommodations, (default:&#39;null&#39;) | [optional]
 **active** | **String**| TIC Active Filter (possible Values: &#39;null&#39; Displays all Accommodations, &#39;true&#39; only TIC Active Accommodations, &#39;false&#39; only TIC Disabled Accommodations, (default:&#39;null&#39;) | [optional]
 **arrival** | **String**| Arrival Date (yyyy-MM-dd) REQUIRED, (default:&#39;Today&#39;) | [optional]
 **departure** | **String**| Departure Date (yyyy-MM-dd) REQUIRED, (default:&#39;Tomorrow&#39;) | [optional]
 **roominfo** | **String**| Roominfo Filter REQUIRED (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:&#39;1-18,18&#39;) | [optional]
 **bokfilter** | **String**| Booking Channels Filter REQUIRED (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), lts &#x3D; (LTS Availability check)), (default:&#39;hgv&#39;) | [optional]
 **language** | **String**| Language of the Availability Response (possible values: &#39;de&#39;,&#39;it&#39;,&#39;en&#39;), (default:&#39;de&#39;) | [optional]
 **availabilitycheck** | **String**| Availability Check enabled/disabled (possible Values: &#39;true&#39;, &#39;false), (default Value: &#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;Accommodation&gt;**](Accommodation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accommodationGetAccommodationsLocalized"></a>
# **accommodationGetAccommodationsLocalized**
> List&lt;AccommodationLocalized&gt; accommodationGetAccommodationsLocalized(pagenumber, pagesize, seed, language, categoryfilter, typefilter, boardfilter, featurefilter, themefilter, badgefilter, idfilter, locfilter, odhtagfilter, odhactive, active, arrival, departure, roominfo, bokfilter, availabilitycheck, latitude, longitude, radius)

GET Accommodation List Localized

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (If availabilitycheck set, pagesize has no effect all Accommodations are returned), (default:10)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, 'null' disables Random Sorting, (default:0)
String language = "language_example"; // String | Language of the Availability Response (possible values: 'de','it','en'), (default:'de')
String categoryfilter = "categoryfilter_example"; // String | Categoryfilter (BITMASK values: 1 = (not categorized), 2 = (1star), 4 = (1flower), 8 = (1sun), 14 = (1star/1flower/1sun), 16 = (2stars), 32 = (2flowers), 64 = (2suns), 112 = (2stars/2flowers/2suns), 128 = (3stars), 256 = (3flowers), 512 = (3suns), 1024 = (3sstars), 1920 = (3stars/3flowers/3suns/3sstars), 2048 = (4stars), 4096 = (4flowers), 8192 = (4suns), 16384 = (4sstars), 30720 = (4stars/4flowers/4suns/4sstars), 32768 = (5stars), 65536 = (5flowers), 131072 = (5suns), 229376 = (5stars/5flowers/5suns), 'null' = No Filter), (default:'null')
String typefilter = "typefilter_example"; // String | Typefilter (BITMASK values: 1 = (HotelPension), 2 = (BedBreakfast), 4 = (Farm), 8 = (Camping), 16 = (Youth), 32 = (Mountain), 64 = (Apartment), 'null' = No Filter), (default:'null')
String boardfilter = "boardfilter_example"; // String | Boardfilter (BITMASK values: 0 = (all boards), 1 = (without board), 2 = (breakfast), 4 = (half board), 8 = (full board), 16 = (All inclusive), 'null' = No Filter), (default:'0')
String featurefilter = "featurefilter_example"; // String | FeatureFilter (BITMASK values: 1 = (Ruhig gelegen), 2 = (Tagung), 4 = (Schwimmbad), 8 = (Sauna), 16 = (Garage), 32 = (Abholservice), 64 = (Wlan), 128 = (Barrierefrei), 256 = (Allergikerküche), 1024 = (Kleine Haustiere), 2048 = (Gruppenfreundlich), 'null' = No Filter), (default:'null')
String themefilter = "themefilter_example"; // String | Themefilter (BITMASK values: 1 = (Gourment), 2 = (In der Höhe), 4 = (Regionale Wellness), 8 = (Biken), 16 = (Familie), 32 = (Wandern), 64 = (Wein), 128 = (Städtisches Flair), 256 = (Am Skigebiet), 512 = (Mediterran), 1024 = (Dolomiten), 2048 = (Alpin), 4096 = (Kleine Betriebe), 8192 = (Hütten und Berggasthöfe), 16384 = (Bäuerliche Welten), 'null' = No Filter), (default:'null')
String badgefilter = "badgefilter_example"; // String | BadgeFilter (BITMASK values: 1 = (Wellnesshotel), 2 = (Familienhotel), 4 = (Bikehotel), 8 = (Bauernhof), 16 = (Behindertengerecht), 32 = (Wanderhotel), 64 = (Südtirol Privatvermieter), 128 = (Vinum Hotels), 'null' = No Filter), (default:'null')
String idfilter = "idfilter_example"; // String | IDFilter (Separator ',' List of Accommodation IDs, 'null' = No Filter), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction), 'null' = No Filter), (default:'null')
String odhtagfilter = "odhtagfilter_example"; // String | ODHTag Filter (String, Separator ',' more ODHTags possible, 'null' = No Filter, available ODHTags reference to 'api/ODHTag?validforentity=accommodation'), (default:'null')
String odhactive = "odhactive_example"; // String | ODHActive Filter (possible Values: 'null' Displays all Accommodations, 'true' only ODH Active Accommodations, 'false' only ODH Disabled Accommodations, (default:'null')
String active = "active_example"; // String | TIC Active Filter (possible Values: 'null' Displays all Accommodations, 'true' only TIC Active Accommodations, 'false' only TIC Disabled Accommodations, (default:'null')
String arrival = "arrival_example"; // String | Arrival Date (yyyy-MM-dd) REQUIRED, (default:'Today')
String departure = "departure_example"; // String | Departure Date (yyyy-MM-dd) REQUIRED, (default:'Tomorrow')
String roominfo = "roominfo_example"; // String | Roominfo Filter REQUIRED (Splitter for Rooms '|' Splitter for Persons Ages ',' possible Values Example 1-18,10|1-18 = 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:'1-18,18')
String bokfilter = "bokfilter_example"; // String | Booking Channels Filter REQUIRED (Separator ',' possible values: hgv = (Booking Südtirol), htl = (Hotel.de), exp = (Expedia), bok = (Booking.com), lts = (LTS Availability check)), (default:'hgv')
String availabilitycheck = "availabilitycheck_example"; // String | Availability Check enabled/disabled (possible Values: 'true', 'false), (default Value: 'false')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<AccommodationLocalized> result = apiInstance.accommodationGetAccommodationsLocalized(pagenumber, pagesize, seed, language, categoryfilter, typefilter, boardfilter, featurefilter, themefilter, badgefilter, idfilter, locfilter, odhtagfilter, odhactive, active, arrival, departure, roominfo, bokfilter, availabilitycheck, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationGetAccommodationsLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (If availabilitycheck set, pagesize has no effect all Accommodations are returned), (default:10) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0) | [optional]
 **language** | **String**| Language of the Availability Response (possible values: &#39;de&#39;,&#39;it&#39;,&#39;en&#39;), (default:&#39;de&#39;) | [optional]
 **categoryfilter** | **String**| Categoryfilter (BITMASK values: 1 &#x3D; (not categorized), 2 &#x3D; (1star), 4 &#x3D; (1flower), 8 &#x3D; (1sun), 14 &#x3D; (1star/1flower/1sun), 16 &#x3D; (2stars), 32 &#x3D; (2flowers), 64 &#x3D; (2suns), 112 &#x3D; (2stars/2flowers/2suns), 128 &#x3D; (3stars), 256 &#x3D; (3flowers), 512 &#x3D; (3suns), 1024 &#x3D; (3sstars), 1920 &#x3D; (3stars/3flowers/3suns/3sstars), 2048 &#x3D; (4stars), 4096 &#x3D; (4flowers), 8192 &#x3D; (4suns), 16384 &#x3D; (4sstars), 30720 &#x3D; (4stars/4flowers/4suns/4sstars), 32768 &#x3D; (5stars), 65536 &#x3D; (5flowers), 131072 &#x3D; (5suns), 229376 &#x3D; (5stars/5flowers/5suns), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **typefilter** | **String**| Typefilter (BITMASK values: 1 &#x3D; (HotelPension), 2 &#x3D; (BedBreakfast), 4 &#x3D; (Farm), 8 &#x3D; (Camping), 16 &#x3D; (Youth), 32 &#x3D; (Mountain), 64 &#x3D; (Apartment), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **boardfilter** | **String**| Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter), (default:&#39;0&#39;) | [optional]
 **featurefilter** | **String**| FeatureFilter (BITMASK values: 1 &#x3D; (Ruhig gelegen), 2 &#x3D; (Tagung), 4 &#x3D; (Schwimmbad), 8 &#x3D; (Sauna), 16 &#x3D; (Garage), 32 &#x3D; (Abholservice), 64 &#x3D; (Wlan), 128 &#x3D; (Barrierefrei), 256 &#x3D; (Allergikerküche), 1024 &#x3D; (Kleine Haustiere), 2048 &#x3D; (Gruppenfreundlich), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **themefilter** | **String**| Themefilter (BITMASK values: 1 &#x3D; (Gourment), 2 &#x3D; (In der Höhe), 4 &#x3D; (Regionale Wellness), 8 &#x3D; (Biken), 16 &#x3D; (Familie), 32 &#x3D; (Wandern), 64 &#x3D; (Wein), 128 &#x3D; (Städtisches Flair), 256 &#x3D; (Am Skigebiet), 512 &#x3D; (Mediterran), 1024 &#x3D; (Dolomiten), 2048 &#x3D; (Alpin), 4096 &#x3D; (Kleine Betriebe), 8192 &#x3D; (Hütten und Berggasthöfe), 16384 &#x3D; (Bäuerliche Welten), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **badgefilter** | **String**| BadgeFilter (BITMASK values: 1 &#x3D; (Wellnesshotel), 2 &#x3D; (Familienhotel), 4 &#x3D; (Bikehotel), 8 &#x3D; (Bauernhof), 16 &#x3D; (Behindertengerecht), 32 &#x3D; (Wanderhotel), 64 &#x3D; (Südtirol Privatvermieter), 128 &#x3D; (Vinum Hotels), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **idfilter** | **String**| IDFilter (Separator &#39;,&#39; List of Accommodation IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;) | [optional]
 **odhtagfilter** | **String**| ODHTag Filter (String, Separator &#39;,&#39; more ODHTags possible, &#39;null&#39; &#x3D; No Filter, available ODHTags reference to &#39;api/ODHTag?validforentity&#x3D;accommodation&#39;), (default:&#39;null&#39;) | [optional]
 **odhactive** | **String**| ODHActive Filter (possible Values: &#39;null&#39; Displays all Accommodations, &#39;true&#39; only ODH Active Accommodations, &#39;false&#39; only ODH Disabled Accommodations, (default:&#39;null&#39;) | [optional]
 **active** | **String**| TIC Active Filter (possible Values: &#39;null&#39; Displays all Accommodations, &#39;true&#39; only TIC Active Accommodations, &#39;false&#39; only TIC Disabled Accommodations, (default:&#39;null&#39;) | [optional]
 **arrival** | **String**| Arrival Date (yyyy-MM-dd) REQUIRED, (default:&#39;Today&#39;) | [optional]
 **departure** | **String**| Departure Date (yyyy-MM-dd) REQUIRED, (default:&#39;Tomorrow&#39;) | [optional]
 **roominfo** | **String**| Roominfo Filter REQUIRED (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:&#39;1-18,18&#39;) | [optional]
 **bokfilter** | **String**| Booking Channels Filter REQUIRED (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), lts &#x3D; (LTS Availability check)), (default:&#39;hgv&#39;) | [optional]
 **availabilitycheck** | **String**| Availability Check enabled/disabled (possible Values: &#39;true&#39;, &#39;false), (default Value: &#39;false&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;AccommodationLocalized&gt;**](AccommodationLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accommodationGetAllAccommodationFeatueresList"></a>
# **accommodationGetAllAccommodationFeatueresList**
> List&lt;AccoTypes&gt; accommodationGetAllAccommodationFeatueresList(source)

GET Accommodation Feature List (LTS Features)

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
String source = "source_example"; // String | IF source = \"lts\" the Features list is returned in XML Format directly from LTS, (default: blank)
try {
    List<AccoTypes> result = apiInstance.accommodationGetAllAccommodationFeatueresList(source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationGetAllAccommodationFeatueresList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**| IF source &#x3D; \&quot;lts\&quot; the Features list is returned in XML Format directly from LTS, (default: blank) | [optional]

### Return type

[**List&lt;AccoTypes&gt;**](AccoTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accommodationGetAllAccommodationTypesList"></a>
# **accommodationGetAllAccommodationTypesList**
> List&lt;AccoTypes&gt; accommodationGetAllAccommodationTypesList()

GET Accommodation Types List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
try {
    List<AccoTypes> result = apiInstance.accommodationGetAllAccommodationTypesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationGetAllAccommodationTypesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AccoTypes&gt;**](AccoTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accommodationGetAllAccommodationsChanged"></a>
# **accommodationGetAllAccommodationsChanged**
> List&lt;Accommodation&gt; accommodationGetAllAccommodationsChanged(pagenumber, pagesize, seed, updatefrom)

GET Accommodation Changed List by Date

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, 'null' disables Random Sorting, (default:0)
String updatefrom = "updatefrom_example"; // String | Date from Format (yyyy-MM-dd) (all Accos with LastChange &gt;= datefrom are passed), (default: DateTime.Now - 1 Day)
try {
    List<Accommodation> result = apiInstance.accommodationGetAllAccommodationsChanged(pagenumber, pagesize, seed, updatefrom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationGetAllAccommodationsChanged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0) | [optional]
 **updatefrom** | **String**| Date from Format (yyyy-MM-dd) (all Accos with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day) | [optional]

### Return type

[**List&lt;Accommodation&gt;**](Accommodation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accommodationGetReducedAccosAsync"></a>
# **accommodationGetReducedAccosAsync**
> List&lt;AccommodationReduced&gt; accommodationGetReducedAccosAsync(language, categoryfilter, typefilter, boardfilter, featurefilter, themefilter, badgefilter, locfilter, odhtagfilter, odhactive, active, latitude, longitude, radius)



### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
String language = "language_example"; // String | 
String categoryfilter = "categoryfilter_example"; // String | 
String typefilter = "typefilter_example"; // String | 
String boardfilter = "boardfilter_example"; // String | 
String featurefilter = "featurefilter_example"; // String | 
String themefilter = "themefilter_example"; // String | 
String badgefilter = "badgefilter_example"; // String | 
String locfilter = "locfilter_example"; // String | 
String odhtagfilter = "odhtagfilter_example"; // String | 
String odhactive = "odhactive_example"; // String | 
String active = "active_example"; // String | 
String latitude = "latitude_example"; // String | 
String longitude = "longitude_example"; // String | 
String radius = "radius_example"; // String | 
try {
    List<AccommodationReduced> result = apiInstance.accommodationGetReducedAccosAsync(language, categoryfilter, typefilter, boardfilter, featurefilter, themefilter, badgefilter, locfilter, odhtagfilter, odhactive, active, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationGetReducedAccosAsync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**|  | [optional]
 **categoryfilter** | **String**|  | [optional]
 **typefilter** | **String**|  | [optional]
 **boardfilter** | **String**|  | [optional]
 **featurefilter** | **String**|  | [optional]
 **themefilter** | **String**|  | [optional]
 **badgefilter** | **String**|  | [optional]
 **locfilter** | **String**|  | [optional]
 **odhtagfilter** | **String**|  | [optional]
 **odhactive** | **String**|  | [optional]
 **active** | **String**|  | [optional]
 **latitude** | **String**|  | [optional]
 **longitude** | **String**|  | [optional]
 **radius** | **String**|  | [optional]

### Return type

[**List&lt;AccommodationReduced&gt;**](AccommodationReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accommodationPostAvailableAccommodations"></a>
# **accommodationPostAvailableAccommodations**
> List&lt;Accommodation&gt; accommodationPostAvailableAccommodations(idfilter, language, boardfilter, arrival, departure, roominfo, bokfilter, source, detail)

POST Available Accommodations MSS / LCS on posted IDs

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
String idfilter = "idfilter_example"; // String | Posted Accommodation IDs
String language = "language_example"; // String | Language of the Availability Response
String boardfilter = "boardfilter_example"; // String | Boardfilter (BITMASK values: 0 = (all boards), 1 = (without board), 2 = (breakfast), 4 = (half board), 8 = (full board), 16 = (All inclusive), 'null' = No Filter)
String arrival = "arrival_example"; // String | Arrival Date (yyyy-MM-dd) REQUIRED
String departure = "departure_example"; // String | Departure Date (yyyy-MM-dd) REQUIRED
String roominfo = "roominfo_example"; // String | Roominfo Filter (Splitter for Rooms '|' Splitter for Persons Ages ',' possible Values Example 1-18,10|1-18 = 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18) REQUIRED
String bokfilter = "bokfilter_example"; // String | Booking Channels Filter (Separator ',' possible values: hgv = (Booking Südtirol), htl = (Hotel.de), exp = (Expedia), bok = (Booking.com), pos = (LTS Booking Portals)) REQUIRED
String source = "source_example"; // String | Source of the Requester (possible value: 'sinfo' = Suedtirol.info, 'sbalance' = Südtirol Balance) REQUIRED
String detail = "detail_example"; // String | Include Offer Details (Boolean, 1 = full Details)
try {
    List<Accommodation> result = apiInstance.accommodationPostAvailableAccommodations(idfilter, language, boardfilter, arrival, departure, roominfo, bokfilter, source, detail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationPostAvailableAccommodations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idfilter** | **String**| Posted Accommodation IDs |
 **language** | **String**| Language of the Availability Response | [optional]
 **boardfilter** | **String**| Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter) | [optional]
 **arrival** | **String**| Arrival Date (yyyy-MM-dd) REQUIRED | [optional]
 **departure** | **String**| Departure Date (yyyy-MM-dd) REQUIRED | [optional]
 **roominfo** | **String**| Roominfo Filter (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18) REQUIRED | [optional]
 **bokfilter** | **String**| Booking Channels Filter (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), pos &#x3D; (LTS Booking Portals)) REQUIRED | [optional]
 **source** | **String**| Source of the Requester (possible value: &#39;sinfo&#39; &#x3D; Suedtirol.info, &#39;sbalance&#39; &#x3D; Südtirol Balance) REQUIRED | [optional]
 **detail** | **String**| Include Offer Details (Boolean, 1 &#x3D; full Details) | [optional]

### Return type

[**List&lt;Accommodation&gt;**](Accommodation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="accommodationPostAvailableMSSResponseonlyAccommodations"></a>
# **accommodationPostAvailableMSSResponseonlyAccommodations**
> List&lt;MssResponseShort&gt; accommodationPostAvailableMSSResponseonlyAccommodations(idfilter, language, boardfilter, arrival, departure, roominfo, bokfilter, source, detail)

POST Available Accommodations MSS / LCS on posted IDs only Availability Response

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
String idfilter = "idfilter_example"; // String | Posted Accommodation IDs
String language = "language_example"; // String | Language of the Availability Response
String boardfilter = "boardfilter_example"; // String | Boardfilter (BITMASK values: 0 = (all boards), 1 = (without board), 2 = (breakfast), 4 = (half board), 8 = (full board), 16 = (All inclusive), 'null' = No Filter)
String arrival = "arrival_example"; // String | Arrival Date (yyyy-MM-dd) REQUIRED
String departure = "departure_example"; // String | Departure Date (yyyy-MM-dd) REQUIRED
String roominfo = "roominfo_example"; // String | Roominfo Filter (Splitter for Rooms '|' Splitter for Persons Ages ',' possible Values Example 1-18,10|1-18 = 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18) REQUIRED
String bokfilter = "bokfilter_example"; // String | Booking Channels Filter (Separator ',' possible values: hgv = (Booking Südtirol), htl = (Hotel.de), exp = (Expedia), bok = (Booking.com), pos = (LTS Booking Portals)) REQUIRED
String source = "source_example"; // String | Source of the Requester (possible value: 'sinfo' = Suedtirol.info, 'sbalance' = Südtirol Balance) REQUIRED
String detail = "detail_example"; // String | Include Offer Details (Boolean, 1 = full Details)
try {
    List<MssResponseShort> result = apiInstance.accommodationPostAvailableMSSResponseonlyAccommodations(idfilter, language, boardfilter, arrival, departure, roominfo, bokfilter, source, detail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationPostAvailableMSSResponseonlyAccommodations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idfilter** | **String**| Posted Accommodation IDs |
 **language** | **String**| Language of the Availability Response | [optional]
 **boardfilter** | **String**| Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter) | [optional]
 **arrival** | **String**| Arrival Date (yyyy-MM-dd) REQUIRED | [optional]
 **departure** | **String**| Departure Date (yyyy-MM-dd) REQUIRED | [optional]
 **roominfo** | **String**| Roominfo Filter (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18) REQUIRED | [optional]
 **bokfilter** | **String**| Booking Channels Filter (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), pos &#x3D; (LTS Booking Portals)) REQUIRED | [optional]
 **source** | **String**| Source of the Requester (possible value: &#39;sinfo&#39; &#x3D; Suedtirol.info, &#39;sbalance&#39; &#x3D; Südtirol Balance) REQUIRED | [optional]
 **detail** | **String**| Include Offer Details (Boolean, 1 &#x3D; full Details) | [optional]

### Return type

[**List&lt;MssResponseShort&gt;**](MssResponseShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="accommodationPostAvailableMSSResponseonlyAllAccommodations"></a>
# **accommodationPostAvailableMSSResponseonlyAllAccommodations**
> List&lt;MssResponseShort&gt; accommodationPostAvailableMSSResponseonlyAllAccommodations(language, boardfilter, arrival, departure, roominfo, bokfilter, source, detail)

POST Available Accommodations (All) MSS / LCS only Availability Response

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
String language = "language_example"; // String | Language of the Availability Response
String boardfilter = "boardfilter_example"; // String | Boardfilter (BITMASK values: 0 = (all boards), 1 = (without board), 2 = (breakfast), 4 = (half board), 8 = (full board), 16 = (All inclusive), 'null' = No Filter)
String arrival = "arrival_example"; // String | Arrival Date (yyyy-MM-dd) REQUIRED
String departure = "departure_example"; // String | Departure Date (yyyy-MM-dd) REQUIRED
String roominfo = "roominfo_example"; // String | Roominfo Filter (Splitter for Rooms '|' Splitter for Persons Ages ',' possible Values Example 1-18,10|1-18 = 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18) REQUIRED
String bokfilter = "bokfilter_example"; // String | Booking Channels Filter (Separator ',' possible values: hgv = (Booking Südtirol), htl = (Hotel.de), exp = (Expedia), bok = (Booking.com), pos = (LTS Booking Portals)) REQUIRED
String source = "source_example"; // String | Source of the Requester (possible value: 'sinfo' = Suedtirol.info, 'sbalance' = Südtirol Balance) REQUIRED
String detail = "detail_example"; // String | Include Offer Details (Boolean, 1 = full Details)
try {
    List<MssResponseShort> result = apiInstance.accommodationPostAvailableMSSResponseonlyAllAccommodations(language, boardfilter, arrival, departure, roominfo, bokfilter, source, detail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#accommodationPostAvailableMSSResponseonlyAllAccommodations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language of the Availability Response | [optional]
 **boardfilter** | **String**| Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter) | [optional]
 **arrival** | **String**| Arrival Date (yyyy-MM-dd) REQUIRED | [optional]
 **departure** | **String**| Departure Date (yyyy-MM-dd) REQUIRED | [optional]
 **roominfo** | **String**| Roominfo Filter (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18) REQUIRED | [optional]
 **bokfilter** | **String**| Booking Channels Filter (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), pos &#x3D; (LTS Booking Portals)) REQUIRED | [optional]
 **source** | **String**| Source of the Requester (possible value: &#39;sinfo&#39; &#x3D; Suedtirol.info, &#39;sbalance&#39; &#x3D; Südtirol Balance) REQUIRED | [optional]
 **detail** | **String**| Include Offer Details (Boolean, 1 &#x3D; full Details) | [optional]

### Return type

[**List&lt;MssResponseShort&gt;**](MssResponseShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


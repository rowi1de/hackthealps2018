# GastronomyApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gastronomyGetAllGastronomyChanged**](GastronomyApi.md#gastronomyGetAllGastronomyChanged) | **GET** /api/GastronomyChanged | GET Gastronomy Changed List by Date
[**gastronomyGetAllGastronomyTypesList**](GastronomyApi.md#gastronomyGetAllGastronomyTypesList) | **GET** /api/GastronomyTypes | GET Gastronomy Types List
[**gastronomyGetGastronomyList**](GastronomyApi.md#gastronomyGetGastronomyList) | **GET** /api/Gastronomy | GET Gastronomy List
[**gastronomyGetGastronomyListLocalized**](GastronomyApi.md#gastronomyGetGastronomyListLocalized) | **GET** /api/GastronomyLocalized | GET Gastronomy Localized List
[**gastronomyGetGastronomyListReduced**](GastronomyApi.md#gastronomyGetGastronomyListReduced) | **GET** /api/GastronomyReduced | GET Gastronomy Reduced List
[**gastronomyGetGastronomySingle**](GastronomyApi.md#gastronomyGetGastronomySingle) | **GET** /api/Gastronomy/{id} | GET Gastronomy Single
[**gastronomyGetGastronomySingleLocalized**](GastronomyApi.md#gastronomyGetGastronomySingleLocalized) | **GET** /api/GastronomyLocalized/{id} | GET Gastronomy Localized Single


<a name="gastronomyGetAllGastronomyChanged"></a>
# **gastronomyGetAllGastronomyChanged**
> List&lt;Gastronomy&gt; gastronomyGetAllGastronomyChanged(pagenumber, pagesize, seed, updatefrom)

GET Gastronomy Changed List by Date

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.GastronomyApi;


GastronomyApi apiInstance = new GastronomyApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, 'null' disables Random Sorting, (default:0)
String updatefrom = "updatefrom_example"; // String | Date from Format (yyyy-MM-dd) (all Gastronomy with LastChange &gt;= datefrom are passed), (default: DateTime.Now - 1 Day)
try {
    List<Gastronomy> result = apiInstance.gastronomyGetAllGastronomyChanged(pagenumber, pagesize, seed, updatefrom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastronomyApi#gastronomyGetAllGastronomyChanged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0) | [optional]
 **updatefrom** | **String**| Date from Format (yyyy-MM-dd) (all Gastronomy with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day) | [optional]

### Return type

[**List&lt;Gastronomy&gt;**](Gastronomy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gastronomyGetAllGastronomyTypesList"></a>
# **gastronomyGetAllGastronomyTypesList**
> List&lt;GastronomyTypes&gt; gastronomyGetAllGastronomyTypesList()

GET Gastronomy Types List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.GastronomyApi;


GastronomyApi apiInstance = new GastronomyApi();
try {
    List<GastronomyTypes> result = apiInstance.gastronomyGetAllGastronomyTypesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastronomyApi#gastronomyGetAllGastronomyTypesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GastronomyTypes&gt;**](GastronomyTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gastronomyGetGastronomyList"></a>
# **gastronomyGetGastronomyList**
> List&lt;Gastronomy&gt; gastronomyGetGastronomyList(pagenumber, pagesize, idlist, locfilter, dishcodefilter, ceremonycodefilter, categorycodefilter, facilitycodefilter, cuisinecodefilter, odhtagfilter, active, odhactive, seed, latitude, longitude, radius)

GET Gastronomy List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.GastronomyApi;


GastronomyApi apiInstance = new GastronomyApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of Activity IDs), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String dishcodefilter = "dishcodefilter_example"; // String | Dish Code Filter (BITMASK values: 1 = (Speisen), 2 = (Vorspeise), 4 = (Hauptspeise), 8 = (Nachspeise), 16 = (Tagesgericht), 32 = (Menü), 64 = (Degustationsmenü), 128 = (Kindermenüs), 256 = (Mittagsmenüs)
String ceremonycodefilter = "ceremonycodefilter_example"; // String | Ceremony Code Filter (BITMASK  values: 1 = (Familienfeiern), 2 = (Hochzeiten), 4 = (Geburtstagsfeiern), 8 = (Firmenessen), 16 = (Weihnachtsessen), 32 = (Sylvestermenü), 64 = (Seminare / Tagungen), 128 = (Versammlungen)
String categorycodefilter = "categorycodefilter_example"; // String | Category Code Filter (BITMASK  values: 1 = (Restaurant), 2 = (Bar / Café / Bistro), 4 = (Pub / Disco), 8 = (Apres Ski), 16 = (Jausenstation), 32 = (Pizzeria), 64 = (Bäuerlicher Schankbetrieb), 128 = (Buschenschank), 256 = (Hofschank), 512 = (Törggele Lokale), 1024 = (Schnellimbiss), 2048 = (Mensa), 4096 = (Vinothek /Weinhaus / Taverne), 8192 = (Eisdiele), 16348 = (Gasthaus), 32768 = (Gasthof), 65536 = (Braugarten), 131072 = (Schutzhütte), 262144 = (Alm), 524288 = (Skihütte)
String facilitycodefilter = "facilitycodefilter_example"; // String | Facility Code Filter (BITMASK  values: 1 = (American Express), 2 = (Diners Club), 4 = (Eurocard / Mastercard), 8 = (Visa), 16 = (Hunde erlaubt), 32 = (Geeignet für Busse), 64 = (Garten), 128 = (Garagen), 256 = (Bierbar), 512 = (Kinderspielplatz), 1024 = (Spielzimmer), 2048 = (Spielplatz), 4096 = (Parkplätze), 8192 = (Raucherräume), 16348 = (Terrasse), 32768 = (Behindertengerecht), 65536 = (Biergarten), 131072 = (Aussichtsterrasse), 262144 = (Wintergarten), 524288 = (Gault Millau Südtirol), 1048576 = (Guida Espresso), 2097152 = (Gambero Rosso), 4194304 = (Feinschmecker), 8388608 = (Aral Schlemmer Atlas), 16777216 = (Varta Führer), 33554432 = (Bertelsmann), 67108864 = (Preis für Südtiroler Weinkultur), 134217728 = (Michelin), 268435456 = (Roter Hahn), 536870912 = (Tafelspitz))
String cuisinecodefilter = "cuisinecodefilter_example"; // String | Cuisine Code Filter (BITMASK  values: 1 = (Vegetarische Küche), 2 = (Glutenfreie Küche), 4 = (Laktosefreie Kost), 8 = (Warme Küche), 16 = (Südtiroler Spezialitäten), 32 = (Gourmet Küche), 64 = (Italienische Küche), 128 = (Internationale Küche), 256 = (Pizza), 512 = (Fischspezialitäten), 1024 = (Asiatische Küche), 2048 = (Wildspezialitäten), 4096 = (Produkte eigener Erzeugung), 8192 = (Diätküche), 16348 = (Grillspezialitäten), 32768 = (Ladinische Küche), 65536 = (Kleine Karte), 131072 = (Fischwochen), 262144 = (Spargelwochen), 524288 = (Lammwochen), 1048576 = (Wildwochen), 2097152 = (Vorspeisewochen), 4194304 = (Nudelwochen), 8388608 = (Kräuterwochen), 16777216 = (Kindermenüs), 33554432 = (Mittagsmenüs))
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null')
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<Gastronomy> result = apiInstance.gastronomyGetGastronomyList(pagenumber, pagesize, idlist, locfilter, dishcodefilter, ceremonycodefilter, categorycodefilter, facilitycodefilter, cuisinecodefilter, odhtagfilter, active, odhactive, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastronomyApi#gastronomyGetGastronomyList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **dishcodefilter** | **String**| Dish Code Filter (BITMASK values: 1 &#x3D; (Speisen), 2 &#x3D; (Vorspeise), 4 &#x3D; (Hauptspeise), 8 &#x3D; (Nachspeise), 16 &#x3D; (Tagesgericht), 32 &#x3D; (Menü), 64 &#x3D; (Degustationsmenü), 128 &#x3D; (Kindermenüs), 256 &#x3D; (Mittagsmenüs) | [optional]
 **ceremonycodefilter** | **String**| Ceremony Code Filter (BITMASK  values: 1 &#x3D; (Familienfeiern), 2 &#x3D; (Hochzeiten), 4 &#x3D; (Geburtstagsfeiern), 8 &#x3D; (Firmenessen), 16 &#x3D; (Weihnachtsessen), 32 &#x3D; (Sylvestermenü), 64 &#x3D; (Seminare / Tagungen), 128 &#x3D; (Versammlungen) | [optional]
 **categorycodefilter** | **String**| Category Code Filter (BITMASK  values: 1 &#x3D; (Restaurant), 2 &#x3D; (Bar / Café / Bistro), 4 &#x3D; (Pub / Disco), 8 &#x3D; (Apres Ski), 16 &#x3D; (Jausenstation), 32 &#x3D; (Pizzeria), 64 &#x3D; (Bäuerlicher Schankbetrieb), 128 &#x3D; (Buschenschank), 256 &#x3D; (Hofschank), 512 &#x3D; (Törggele Lokale), 1024 &#x3D; (Schnellimbiss), 2048 &#x3D; (Mensa), 4096 &#x3D; (Vinothek /Weinhaus / Taverne), 8192 &#x3D; (Eisdiele), 16348 &#x3D; (Gasthaus), 32768 &#x3D; (Gasthof), 65536 &#x3D; (Braugarten), 131072 &#x3D; (Schutzhütte), 262144 &#x3D; (Alm), 524288 &#x3D; (Skihütte) | [optional]
 **facilitycodefilter** | **String**| Facility Code Filter (BITMASK  values: 1 &#x3D; (American Express), 2 &#x3D; (Diners Club), 4 &#x3D; (Eurocard / Mastercard), 8 &#x3D; (Visa), 16 &#x3D; (Hunde erlaubt), 32 &#x3D; (Geeignet für Busse), 64 &#x3D; (Garten), 128 &#x3D; (Garagen), 256 &#x3D; (Bierbar), 512 &#x3D; (Kinderspielplatz), 1024 &#x3D; (Spielzimmer), 2048 &#x3D; (Spielplatz), 4096 &#x3D; (Parkplätze), 8192 &#x3D; (Raucherräume), 16348 &#x3D; (Terrasse), 32768 &#x3D; (Behindertengerecht), 65536 &#x3D; (Biergarten), 131072 &#x3D; (Aussichtsterrasse), 262144 &#x3D; (Wintergarten), 524288 &#x3D; (Gault Millau Südtirol), 1048576 &#x3D; (Guida Espresso), 2097152 &#x3D; (Gambero Rosso), 4194304 &#x3D; (Feinschmecker), 8388608 &#x3D; (Aral Schlemmer Atlas), 16777216 &#x3D; (Varta Führer), 33554432 &#x3D; (Bertelsmann), 67108864 &#x3D; (Preis für Südtiroler Weinkultur), 134217728 &#x3D; (Michelin), 268435456 &#x3D; (Roter Hahn), 536870912 &#x3D; (Tafelspitz)) | [optional]
 **cuisinecodefilter** | **String**| Cuisine Code Filter (BITMASK  values: 1 &#x3D; (Vegetarische Küche), 2 &#x3D; (Glutenfreie Küche), 4 &#x3D; (Laktosefreie Kost), 8 &#x3D; (Warme Küche), 16 &#x3D; (Südtiroler Spezialitäten), 32 &#x3D; (Gourmet Küche), 64 &#x3D; (Italienische Küche), 128 &#x3D; (Internationale Küche), 256 &#x3D; (Pizza), 512 &#x3D; (Fischspezialitäten), 1024 &#x3D; (Asiatische Küche), 2048 &#x3D; (Wildspezialitäten), 4096 &#x3D; (Produkte eigener Erzeugung), 8192 &#x3D; (Diätküche), 16348 &#x3D; (Grillspezialitäten), 32768 &#x3D; (Ladinische Küche), 65536 &#x3D; (Kleine Karte), 131072 &#x3D; (Fischwochen), 262144 &#x3D; (Spargelwochen), 524288 &#x3D; (Lammwochen), 1048576 &#x3D; (Wildwochen), 2097152 &#x3D; (Vorspeisewochen), 4194304 &#x3D; (Nudelwochen), 8388608 &#x3D; (Kräuterwochen), 16777216 &#x3D; (Kindermenüs), 33554432 &#x3D; (Mittagsmenüs)) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;Gastronomy&gt;**](Gastronomy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gastronomyGetGastronomyListLocalized"></a>
# **gastronomyGetGastronomyListLocalized**
> List&lt;GastronomyLocalized&gt; gastronomyGetGastronomyListLocalized(language, pagenumber, pagesize, idlist, locfilter, dishcodefilter, ceremonycodefilter, categorycodefilter, facilitycodefilter, cuisinecodefilter, odhtagfilter, active, odhactive, seed, latitude, longitude, radius)

GET Gastronomy Localized List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.GastronomyApi;


GastronomyApi apiInstance = new GastronomyApi();
String language = "language_example"; // String | Localization Language, (default:'en')
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of Activity IDs), (default:'null')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String dishcodefilter = "dishcodefilter_example"; // String | Dish Code Filter (BITMASK values: 1 = (Speisen), 2 = (Vorspeise), 4 = (Hauptspeise), 8 = (Nachspeise), 16 = (Tagesgericht), 32 = (Menü), 64 = (Degustationsmenü), 128 = (Kindermenüs), 256 = (Mittagsmenüs)
String ceremonycodefilter = "ceremonycodefilter_example"; // String | Ceremony Code Filter (BITMASK  values: 1 = (Familienfeiern), 2 = (Hochzeiten), 4 = (Geburtstagsfeiern), 8 = (Firmenessen), 16 = (Weihnachtsessen), 32 = (Sylvestermenü), 64 = (Seminare / Tagungen), 128 = (Versammlungen)
String categorycodefilter = "categorycodefilter_example"; // String | Category Code Filter (BITMASK  values: 1 = (Restaurant), 2 = (Bar / Café / Bistro), 4 = (Pub / Disco), 8 = (Apres Ski), 16 = (Jausenstation), 32 = (Pizzeria), 64 = (Bäuerlicher Schankbetrieb), 128 = (Buschenschank), 256 = (Hofschank), 512 = (Törggele Lokale), 1024 = (Schnellimbiss), 2048 = (Mensa), 4096 = (Vinothek /Weinhaus / Taverne), 8192 = (Eisdiele), 16348 = (Gasthaus), 32768 = (Gasthof), 65536 = (Braugarten), 131072 = (Schutzhütte), 262144 = (Alm), 524288 = (Skihütte)
String facilitycodefilter = "facilitycodefilter_example"; // String | Facility Code Filter (BITMASK  values: 1 = (American Express), 2 = (Diners Club), 4 = (Eurocard / Mastercard), 8 = (Visa), 16 = (Hunde erlaubt), 32 = (Geeignet für Busse), 64 = (Garten), 128 = (Garagen), 256 = (Bierbar), 512 = (Kinderspielplatz), 1024 = (Spielzimmer), 2048 = (Spielplatz), 4096 = (Parkplätze), 8192 = (Raucherräume), 16348 = (Terrasse), 32768 = (Behindertengerecht), 65536 = (Biergarten), 131072 = (Aussichtsterrasse), 262144 = (Wintergarten), 524288 = (Gault Millau Südtirol), 1048576 = (Guida Espresso), 2097152 = (Gambero Rosso), 4194304 = (Feinschmecker), 8388608 = (Aral Schlemmer Atlas), 16777216 = (Varta Führer), 33554432 = (Bertelsmann), 67108864 = (Preis für Südtiroler Weinkultur), 134217728 = (Michelin), 268435456 = (Roter Hahn), 536870912 = (Tafelspitz))
String cuisinecodefilter = "cuisinecodefilter_example"; // String | Cuisine Code Filter (BITMASK  values: 1 = (Vegetarische Küche), 2 = (Glutenfreie Küche), 4 = (Laktosefreie Kost), 8 = (Warme Küche), 16 = (Südtiroler Spezialitäten), 32 = (Gourmet Küche), 64 = (Italienische Küche), 128 = (Internationale Küche), 256 = (Pizza), 512 = (Fischspezialitäten), 1024 = (Asiatische Küche), 2048 = (Wildspezialitäten), 4096 = (Produkte eigener Erzeugung), 8192 = (Diätküche), 16348 = (Grillspezialitäten), 32768 = (Ladinische Küche), 65536 = (Kleine Karte), 131072 = (Fischwochen), 262144 = (Spargelwochen), 524288 = (Lammwochen), 1048576 = (Wildwochen), 2097152 = (Vorspeisewochen), 4194304 = (Nudelwochen), 8388608 = (Kräuterwochen), 16777216 = (Kindermenüs), 33554432 = (Mittagsmenüs))
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null')
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<GastronomyLocalized> result = apiInstance.gastronomyGetGastronomyListLocalized(language, pagenumber, pagesize, idlist, locfilter, dishcodefilter, ceremonycodefilter, categorycodefilter, facilitycodefilter, cuisinecodefilter, odhtagfilter, active, odhactive, seed, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastronomyApi#gastronomyGetGastronomyListLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **dishcodefilter** | **String**| Dish Code Filter (BITMASK values: 1 &#x3D; (Speisen), 2 &#x3D; (Vorspeise), 4 &#x3D; (Hauptspeise), 8 &#x3D; (Nachspeise), 16 &#x3D; (Tagesgericht), 32 &#x3D; (Menü), 64 &#x3D; (Degustationsmenü), 128 &#x3D; (Kindermenüs), 256 &#x3D; (Mittagsmenüs) | [optional]
 **ceremonycodefilter** | **String**| Ceremony Code Filter (BITMASK  values: 1 &#x3D; (Familienfeiern), 2 &#x3D; (Hochzeiten), 4 &#x3D; (Geburtstagsfeiern), 8 &#x3D; (Firmenessen), 16 &#x3D; (Weihnachtsessen), 32 &#x3D; (Sylvestermenü), 64 &#x3D; (Seminare / Tagungen), 128 &#x3D; (Versammlungen) | [optional]
 **categorycodefilter** | **String**| Category Code Filter (BITMASK  values: 1 &#x3D; (Restaurant), 2 &#x3D; (Bar / Café / Bistro), 4 &#x3D; (Pub / Disco), 8 &#x3D; (Apres Ski), 16 &#x3D; (Jausenstation), 32 &#x3D; (Pizzeria), 64 &#x3D; (Bäuerlicher Schankbetrieb), 128 &#x3D; (Buschenschank), 256 &#x3D; (Hofschank), 512 &#x3D; (Törggele Lokale), 1024 &#x3D; (Schnellimbiss), 2048 &#x3D; (Mensa), 4096 &#x3D; (Vinothek /Weinhaus / Taverne), 8192 &#x3D; (Eisdiele), 16348 &#x3D; (Gasthaus), 32768 &#x3D; (Gasthof), 65536 &#x3D; (Braugarten), 131072 &#x3D; (Schutzhütte), 262144 &#x3D; (Alm), 524288 &#x3D; (Skihütte) | [optional]
 **facilitycodefilter** | **String**| Facility Code Filter (BITMASK  values: 1 &#x3D; (American Express), 2 &#x3D; (Diners Club), 4 &#x3D; (Eurocard / Mastercard), 8 &#x3D; (Visa), 16 &#x3D; (Hunde erlaubt), 32 &#x3D; (Geeignet für Busse), 64 &#x3D; (Garten), 128 &#x3D; (Garagen), 256 &#x3D; (Bierbar), 512 &#x3D; (Kinderspielplatz), 1024 &#x3D; (Spielzimmer), 2048 &#x3D; (Spielplatz), 4096 &#x3D; (Parkplätze), 8192 &#x3D; (Raucherräume), 16348 &#x3D; (Terrasse), 32768 &#x3D; (Behindertengerecht), 65536 &#x3D; (Biergarten), 131072 &#x3D; (Aussichtsterrasse), 262144 &#x3D; (Wintergarten), 524288 &#x3D; (Gault Millau Südtirol), 1048576 &#x3D; (Guida Espresso), 2097152 &#x3D; (Gambero Rosso), 4194304 &#x3D; (Feinschmecker), 8388608 &#x3D; (Aral Schlemmer Atlas), 16777216 &#x3D; (Varta Führer), 33554432 &#x3D; (Bertelsmann), 67108864 &#x3D; (Preis für Südtiroler Weinkultur), 134217728 &#x3D; (Michelin), 268435456 &#x3D; (Roter Hahn), 536870912 &#x3D; (Tafelspitz)) | [optional]
 **cuisinecodefilter** | **String**| Cuisine Code Filter (BITMASK  values: 1 &#x3D; (Vegetarische Küche), 2 &#x3D; (Glutenfreie Küche), 4 &#x3D; (Laktosefreie Kost), 8 &#x3D; (Warme Küche), 16 &#x3D; (Südtiroler Spezialitäten), 32 &#x3D; (Gourmet Küche), 64 &#x3D; (Italienische Küche), 128 &#x3D; (Internationale Küche), 256 &#x3D; (Pizza), 512 &#x3D; (Fischspezialitäten), 1024 &#x3D; (Asiatische Küche), 2048 &#x3D; (Wildspezialitäten), 4096 &#x3D; (Produkte eigener Erzeugung), 8192 &#x3D; (Diätküche), 16348 &#x3D; (Grillspezialitäten), 32768 &#x3D; (Ladinische Küche), 65536 &#x3D; (Kleine Karte), 131072 &#x3D; (Fischwochen), 262144 &#x3D; (Spargelwochen), 524288 &#x3D; (Lammwochen), 1048576 &#x3D; (Wildwochen), 2097152 &#x3D; (Vorspeisewochen), 4194304 &#x3D; (Nudelwochen), 8388608 &#x3D; (Kräuterwochen), 16777216 &#x3D; (Kindermenüs), 33554432 &#x3D; (Mittagsmenüs)) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;GastronomyLocalized&gt;**](GastronomyLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gastronomyGetGastronomyListReduced"></a>
# **gastronomyGetGastronomyListReduced**
> List&lt;GastronomyReduced&gt; gastronomyGetGastronomyListReduced(language, locfilter, dishcodefilter, ceremonycodefilter, categorycodefilter, facilitycodefilter, cuisinecodefilter, odhtagfilter, active, odhactive, latitude, longitude, radius)

GET Gastronomy Reduced List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.GastronomyApi;


GastronomyApi apiInstance = new GastronomyApi();
String language = "language_example"; // String | Localization Language, (default:'en')
String locfilter = "locfilter_example"; // String | Locfilter (Separator ',' possible values: reg + REGIONID = (Filter by Region), reg + REGIONID = (Filter by Region), tvs + TOURISMVEREINID = (Filter by Tourismverein), mun + MUNICIPALITYID = (Filter by Municipality), fra + FRACTIONID = (Filter by Fraction)), (default:'null')
String dishcodefilter = "dishcodefilter_example"; // String | Dish Code Filter (BITMASK values: 1 = (Speisen), 2 = (Vorspeise), 4 = (Hauptspeise), 8 = (Nachspeise), 16 = (Tagesgericht), 32 = (Menü), 64 = (Degustationsmenü), 128 = (Kindermenüs), 256 = (Mittagsmenüs)
String ceremonycodefilter = "ceremonycodefilter_example"; // String | Ceremony Code Filter (BITMASK  values: 1 = (Familienfeiern), 2 = (Hochzeiten), 4 = (Geburtstagsfeiern), 8 = (Firmenessen), 16 = (Weihnachtsessen), 32 = (Sylvestermenü), 64 = (Seminare / Tagungen), 128 = (Versammlungen)
String categorycodefilter = "categorycodefilter_example"; // String | Category Code Filter (BITMASK  values: 1 = (Restaurant), 2 = (Bar / Café / Bistro), 4 = (Pub / Disco), 8 = (Apres Ski), 16 = (Jausenstation), 32 = (Pizzeria), 64 = (Bäuerlicher Schankbetrieb), 128 = (Buschenschank), 256 = (Hofschank), 512 = (Törggele Lokale), 1024 = (Schnellimbiss), 2048 = (Mensa), 4096 = (Vinothek /Weinhaus / Taverne), 8192 = (Eisdiele), 16348 = (Gasthaus), 32768 = (Gasthof), 65536 = (Braugarten), 131072 = (Schutzhütte), 262144 = (Alm), 524288 = (Skihütte)
String facilitycodefilter = "facilitycodefilter_example"; // String | Facility Code Filter (BITMASK  values: 1 = (American Express), 2 = (Diners Club), 4 = (Eurocard / Mastercard), 8 = (Visa), 16 = (Hunde erlaubt), 32 = (Geeignet für Busse), 64 = (Garten), 128 = (Garagen), 256 = (Bierbar), 512 = (Kinderspielplatz), 1024 = (Spielzimmer), 2048 = (Spielplatz), 4096 = (Parkplätze), 8192 = (Raucherräume), 16348 = (Terrasse), 32768 = (Behindertengerecht), 65536 = (Biergarten), 131072 = (Aussichtsterrasse), 262144 = (Wintergarten), 524288 = (Gault Millau Südtirol), 1048576 = (Guida Espresso), 2097152 = (Gambero Rosso), 4194304 = (Feinschmecker), 8388608 = (Aral Schlemmer Atlas), 16777216 = (Varta Führer), 33554432 = (Bertelsmann), 67108864 = (Preis für Südtiroler Weinkultur), 134217728 = (Michelin), 268435456 = (Roter Hahn), 536870912 = (Tafelspitz))
String cuisinecodefilter = "cuisinecodefilter_example"; // String | Cuisine Code Filter (BITMASK  values: 1 = (Vegetarische Küche), 2 = (Glutenfreie Küche), 4 = (Laktosefreie Kost), 8 = (Warme Küche), 16 = (Südtiroler Spezialitäten), 32 = (Gourmet Küche), 64 = (Italienische Küche), 128 = (Internationale Küche), 256 = (Pizza), 512 = (Fischspezialitäten), 1024 = (Asiatische Küche), 2048 = (Wildspezialitäten), 4096 = (Produkte eigener Erzeugung), 8192 = (Diätküche), 16348 = (Grillspezialitäten), 32768 = (Ladinische Küche), 65536 = (Kleine Karte), 131072 = (Fischwochen), 262144 = (Spargelwochen), 524288 = (Lammwochen), 1048576 = (Wildwochen), 2097152 = (Vorspeisewochen), 4194304 = (Nudelwochen), 8388608 = (Kräuterwochen), 16777216 = (Kindermenüs), 33554432 = (Mittagsmenüs))
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null')
String latitude = "latitude_example"; // String | GeoFilter Latitude Format: '46.624975', 'null' = disabled, (default:'null')
String longitude = "longitude_example"; // String | GeoFilter Longitude Format: '11.369909', 'null' = disabled, (default:'null')
String radius = "radius_example"; // String | Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:'null')
try {
    List<GastronomyReduced> result = apiInstance.gastronomyGetGastronomyListReduced(language, locfilter, dishcodefilter, ceremonycodefilter, categorycodefilter, facilitycodefilter, cuisinecodefilter, odhtagfilter, active, odhactive, latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastronomyApi#gastronomyGetGastronomyListReduced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]
 **locfilter** | **String**| Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;) | [optional]
 **dishcodefilter** | **String**| Dish Code Filter (BITMASK values: 1 &#x3D; (Speisen), 2 &#x3D; (Vorspeise), 4 &#x3D; (Hauptspeise), 8 &#x3D; (Nachspeise), 16 &#x3D; (Tagesgericht), 32 &#x3D; (Menü), 64 &#x3D; (Degustationsmenü), 128 &#x3D; (Kindermenüs), 256 &#x3D; (Mittagsmenüs) | [optional]
 **ceremonycodefilter** | **String**| Ceremony Code Filter (BITMASK  values: 1 &#x3D; (Familienfeiern), 2 &#x3D; (Hochzeiten), 4 &#x3D; (Geburtstagsfeiern), 8 &#x3D; (Firmenessen), 16 &#x3D; (Weihnachtsessen), 32 &#x3D; (Sylvestermenü), 64 &#x3D; (Seminare / Tagungen), 128 &#x3D; (Versammlungen) | [optional]
 **categorycodefilter** | **String**| Category Code Filter (BITMASK  values: 1 &#x3D; (Restaurant), 2 &#x3D; (Bar / Café / Bistro), 4 &#x3D; (Pub / Disco), 8 &#x3D; (Apres Ski), 16 &#x3D; (Jausenstation), 32 &#x3D; (Pizzeria), 64 &#x3D; (Bäuerlicher Schankbetrieb), 128 &#x3D; (Buschenschank), 256 &#x3D; (Hofschank), 512 &#x3D; (Törggele Lokale), 1024 &#x3D; (Schnellimbiss), 2048 &#x3D; (Mensa), 4096 &#x3D; (Vinothek /Weinhaus / Taverne), 8192 &#x3D; (Eisdiele), 16348 &#x3D; (Gasthaus), 32768 &#x3D; (Gasthof), 65536 &#x3D; (Braugarten), 131072 &#x3D; (Schutzhütte), 262144 &#x3D; (Alm), 524288 &#x3D; (Skihütte) | [optional]
 **facilitycodefilter** | **String**| Facility Code Filter (BITMASK  values: 1 &#x3D; (American Express), 2 &#x3D; (Diners Club), 4 &#x3D; (Eurocard / Mastercard), 8 &#x3D; (Visa), 16 &#x3D; (Hunde erlaubt), 32 &#x3D; (Geeignet für Busse), 64 &#x3D; (Garten), 128 &#x3D; (Garagen), 256 &#x3D; (Bierbar), 512 &#x3D; (Kinderspielplatz), 1024 &#x3D; (Spielzimmer), 2048 &#x3D; (Spielplatz), 4096 &#x3D; (Parkplätze), 8192 &#x3D; (Raucherräume), 16348 &#x3D; (Terrasse), 32768 &#x3D; (Behindertengerecht), 65536 &#x3D; (Biergarten), 131072 &#x3D; (Aussichtsterrasse), 262144 &#x3D; (Wintergarten), 524288 &#x3D; (Gault Millau Südtirol), 1048576 &#x3D; (Guida Espresso), 2097152 &#x3D; (Gambero Rosso), 4194304 &#x3D; (Feinschmecker), 8388608 &#x3D; (Aral Schlemmer Atlas), 16777216 &#x3D; (Varta Führer), 33554432 &#x3D; (Bertelsmann), 67108864 &#x3D; (Preis für Südtiroler Weinkultur), 134217728 &#x3D; (Michelin), 268435456 &#x3D; (Roter Hahn), 536870912 &#x3D; (Tafelspitz)) | [optional]
 **cuisinecodefilter** | **String**| Cuisine Code Filter (BITMASK  values: 1 &#x3D; (Vegetarische Küche), 2 &#x3D; (Glutenfreie Küche), 4 &#x3D; (Laktosefreie Kost), 8 &#x3D; (Warme Küche), 16 &#x3D; (Südtiroler Spezialitäten), 32 &#x3D; (Gourmet Küche), 64 &#x3D; (Italienische Küche), 128 &#x3D; (Internationale Küche), 256 &#x3D; (Pizza), 512 &#x3D; (Fischspezialitäten), 1024 &#x3D; (Asiatische Küche), 2048 &#x3D; (Wildspezialitäten), 4096 &#x3D; (Produkte eigener Erzeugung), 8192 &#x3D; (Diätküche), 16348 &#x3D; (Grillspezialitäten), 32768 &#x3D; (Ladinische Küche), 65536 &#x3D; (Kleine Karte), 131072 &#x3D; (Fischwochen), 262144 &#x3D; (Spargelwochen), 524288 &#x3D; (Lammwochen), 1048576 &#x3D; (Wildwochen), 2097152 &#x3D; (Vorspeisewochen), 4194304 &#x3D; (Nudelwochen), 8388608 &#x3D; (Kräuterwochen), 16777216 &#x3D; (Kindermenüs), 33554432 &#x3D; (Mittagsmenüs)) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;) | [optional]
 **latitude** | **String**| GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **longitude** | **String**| GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;) | [optional]
 **radius** | **String**| Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;) | [optional]

### Return type

[**List&lt;GastronomyReduced&gt;**](GastronomyReduced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gastronomyGetGastronomySingle"></a>
# **gastronomyGetGastronomySingle**
> Gastronomy gastronomyGetGastronomySingle(id)

GET Gastronomy Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.GastronomyApi;


GastronomyApi apiInstance = new GastronomyApi();
String id = "id_example"; // String | ID of the Gastronomy
try {
    Gastronomy result = apiInstance.gastronomyGetGastronomySingle(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastronomyApi#gastronomyGetGastronomySingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Gastronomy |

### Return type

[**Gastronomy**](Gastronomy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gastronomyGetGastronomySingleLocalized"></a>
# **gastronomyGetGastronomySingleLocalized**
> GastronomyLocalized gastronomyGetGastronomySingleLocalized(id, language)

GET Gastronomy Localized Single

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.GastronomyApi;


GastronomyApi apiInstance = new GastronomyApi();
String id = "id_example"; // String | ID of the Gastronomy
String language = "language_example"; // String | Localization Language, (default:'en')
try {
    GastronomyLocalized result = apiInstance.gastronomyGetGastronomySingleLocalized(id, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastronomyApi#gastronomyGetGastronomySingleLocalized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Gastronomy |
 **language** | **String**| Localization Language, (default:&#39;en&#39;) | [optional]

### Return type

[**GastronomyLocalized**](GastronomyLocalized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


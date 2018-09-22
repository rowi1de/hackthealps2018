# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import it.hackthealps.codemates.staylocalpaylocal.invoker.*;
import it.hackthealps.codemates.staylocalpaylocal.invoker.auth.*;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.*;
import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;

import java.io.File;
import java.util.*;

public class AccommodationApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://tourism.opendatahub.bz.it*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccommodationApi* | [**accommodationGetAccoRoomInfos**](docs/AccommodationApi.md#accommodationGetAccoRoomInfos) | **GET** /api/AccommodationRoom | GET Accommodation Room Info by AccoID
*AccommodationApi* | [**accommodationGetAccommodation**](docs/AccommodationApi.md#accommodationGetAccommodation) | **GET** /api/Accommodation/{id} | GET Accommodation Single
*AccommodationApi* | [**accommodationGetAccommodationLocalized**](docs/AccommodationApi.md#accommodationGetAccommodationLocalized) | **GET** /api/AccommodationLocalized/{id} | GET Accommodation Single Localized
*AccommodationApi* | [**accommodationGetAccommodations**](docs/AccommodationApi.md#accommodationGetAccommodations) | **GET** /api/Accommodation | GET Accommodation List
*AccommodationApi* | [**accommodationGetAccommodationsLocalized**](docs/AccommodationApi.md#accommodationGetAccommodationsLocalized) | **GET** /api/AccommodationLocalized | GET Accommodation List Localized
*AccommodationApi* | [**accommodationGetAllAccommodationFeatueresList**](docs/AccommodationApi.md#accommodationGetAllAccommodationFeatueresList) | **GET** /api/AccommodationFeatures | GET Accommodation Feature List (LTS Features)
*AccommodationApi* | [**accommodationGetAllAccommodationTypesList**](docs/AccommodationApi.md#accommodationGetAllAccommodationTypesList) | **GET** /api/AccommodationTypes | GET Accommodation Types List
*AccommodationApi* | [**accommodationGetAllAccommodationsChanged**](docs/AccommodationApi.md#accommodationGetAllAccommodationsChanged) | **GET** /api/AccommodationChanged | GET Accommodation Changed List by Date
*AccommodationApi* | [**accommodationGetReducedAccosAsync**](docs/AccommodationApi.md#accommodationGetReducedAccosAsync) | **GET** /api/AccommodationReduced | 
*AccommodationApi* | [**accommodationPostAvailableAccommodations**](docs/AccommodationApi.md#accommodationPostAvailableAccommodations) | **POST** /api/AccommodationAvailable | POST Available Accommodations MSS / LCS on posted IDs
*AccommodationApi* | [**accommodationPostAvailableMSSResponseonlyAccommodations**](docs/AccommodationApi.md#accommodationPostAvailableMSSResponseonlyAccommodations) | **POST** /api/AvailabilityCheck | POST Available Accommodations MSS / LCS on posted IDs only Availability Response
*AccommodationApi* | [**accommodationPostAvailableMSSResponseonlyAllAccommodations**](docs/AccommodationApi.md#accommodationPostAvailableMSSResponseonlyAllAccommodations) | **GET** /api/AvailabilityCheckAll | POST Available Accommodations (All) MSS / LCS only Availability Response
*ActivityApi* | [**activityGetActivityFilteredLocalized**](docs/ActivityApi.md#activityGetActivityFilteredLocalized) | **GET** /api/ActivityLocalized | GET Activity List Localized
*ActivityApi* | [**activityGetActivityList**](docs/ActivityApi.md#activityGetActivityList) | **GET** /api/Activity | GET Activity List
*ActivityApi* | [**activityGetActivityReduced**](docs/ActivityApi.md#activityGetActivityReduced) | **GET** /api/ActivityReduced | GET Activity List Reduced
*ActivityApi* | [**activityGetActivitySingle**](docs/ActivityApi.md#activityGetActivitySingle) | **GET** /api/Activity/{id} | GET Activity Single
*ActivityApi* | [**activityGetActivitySingleLocalized**](docs/ActivityApi.md#activityGetActivitySingleLocalized) | **GET** /api/ActivityLocalized/{id} | GET Activity Single Localized
*ActivityApi* | [**activityGetAllActivityChanged**](docs/ActivityApi.md#activityGetAllActivityChanged) | **GET** /api/ActivityChanged | GET Activity Changed List by Date
*ActivityApi* | [**activityGetAllActivityTypesList**](docs/ActivityApi.md#activityGetAllActivityTypesList) | **GET** /api/ActivityTypes | GET Activity Types List
*ArticleApi* | [**articleGetArticleList**](docs/ArticleApi.md#articleGetArticleList) | **GET** /api/Article | GET Activity List
*CommonApi* | [**commonGetDistrict**](docs/CommonApi.md#commonGetDistrict) | **GET** /api/District | GET District List
*CommonApi* | [**commonGetDistrictLocalized**](docs/CommonApi.md#commonGetDistrictLocalized) | **GET** /api/DistrictLocalized | GET District Localized List
*CommonApi* | [**commonGetDistrictReduced**](docs/CommonApi.md#commonGetDistrictReduced) | **GET** /api/DistrictReduced | GET District Reduced List
*CommonApi* | [**commonGetDistrictSingle**](docs/CommonApi.md#commonGetDistrictSingle) | **GET** /api/District/{id} | GET District Single
*CommonApi* | [**commonGetDistrictSingleLocalized**](docs/CommonApi.md#commonGetDistrictSingleLocalized) | **GET** /api/DistrictLocalized/{id} | GET District Localized Single
*CommonApi* | [**commonGetExperienceAreaSingle**](docs/CommonApi.md#commonGetExperienceAreaSingle) | **GET** /api/ExperienceArea/{id} | GET ExperienceArea Single
*CommonApi* | [**commonGetExperienceAreaSingleLocalized**](docs/CommonApi.md#commonGetExperienceAreaSingleLocalized) | **GET** /api/ExperienceAreaLocalized/{id} | GET ExperienceArea Localized Single
*CommonApi* | [**commonGetExperienceAreas**](docs/CommonApi.md#commonGetExperienceAreas) | **GET** /api/ExperienceArea | GET Experiencearea List
*CommonApi* | [**commonGetExperienceAreasLocalized**](docs/CommonApi.md#commonGetExperienceAreasLocalized) | **GET** /api/ExperienceAreaLocalized | GET ExperienceArea Localized List
*CommonApi* | [**commonGetExperienceAreasReduced**](docs/CommonApi.md#commonGetExperienceAreasReduced) | **GET** /api/ExperienceAreaReduced | GET ExperienceArea Reduced List
*CommonApi* | [**commonGetMetaRegionSingle**](docs/CommonApi.md#commonGetMetaRegionSingle) | **GET** /api/MetaRegion/{id} | GET MetaRegion Single
*CommonApi* | [**commonGetMetaRegionSingleLocalized**](docs/CommonApi.md#commonGetMetaRegionSingleLocalized) | **GET** /api/MetaRegionLocalized/{id} | GET MetaRegion Localized Single
*CommonApi* | [**commonGetMetaRegions**](docs/CommonApi.md#commonGetMetaRegions) | **GET** /api/MetaRegion | GET MetaRegion List
*CommonApi* | [**commonGetMetaRegionsLocalized**](docs/CommonApi.md#commonGetMetaRegionsLocalized) | **GET** /api/MetaRegionLocalized | GET MetaRegion Localized List
*CommonApi* | [**commonGetMetaRegionsReduced**](docs/CommonApi.md#commonGetMetaRegionsReduced) | **GET** /api/MetaRegionReduced | GET MetaRegion Reduced List
*CommonApi* | [**commonGetMunicipality**](docs/CommonApi.md#commonGetMunicipality) | **GET** /api/Municipality | GET Municipality List
*CommonApi* | [**commonGetMunicipalityLocalized**](docs/CommonApi.md#commonGetMunicipalityLocalized) | **GET** /api/MunicipalityLocalized | GET Municipality Localized List
*CommonApi* | [**commonGetMunicipalityReduced**](docs/CommonApi.md#commonGetMunicipalityReduced) | **GET** /api/MunicipalityReduced | GET Municipality Reduced List
*CommonApi* | [**commonGetMunicipalitySingle**](docs/CommonApi.md#commonGetMunicipalitySingle) | **GET** /api/Municipality/{id} | GET Municipality Single
*CommonApi* | [**commonGetMunicipalitySingleLocalized**](docs/CommonApi.md#commonGetMunicipalitySingleLocalized) | **GET** /api/MunicipalityLocalized/{id} | GET Municipality Localized Single
*CommonApi* | [**commonGetRegionSingle**](docs/CommonApi.md#commonGetRegionSingle) | **GET** /api/Region/{id} | GET Region Single
*CommonApi* | [**commonGetRegionSingleLocalized**](docs/CommonApi.md#commonGetRegionSingleLocalized) | **GET** /api/RegionLocalized/{id} | GET Region Localized Single
*CommonApi* | [**commonGetRegions**](docs/CommonApi.md#commonGetRegions) | **GET** /api/Region | GET Region List
*CommonApi* | [**commonGetRegionsLocalized**](docs/CommonApi.md#commonGetRegionsLocalized) | **GET** /api/RegionLocalized | GET Region Localized List
*CommonApi* | [**commonGetRegionsReduced**](docs/CommonApi.md#commonGetRegionsReduced) | **GET** /api/RegionReduced | GET Region Reduced List
*CommonApi* | [**commonGetTourismverein**](docs/CommonApi.md#commonGetTourismverein) | **GET** /api/TourismAssociation | GET TourismAssociation List
*CommonApi* | [**commonGetTourismvereinLocalized**](docs/CommonApi.md#commonGetTourismvereinLocalized) | **GET** /api/TourismAssociationLocalized | GET TourismAssociation Localized List
*CommonApi* | [**commonGetTourismvereinReduced**](docs/CommonApi.md#commonGetTourismvereinReduced) | **GET** /api/TourismAssociationReduced | GET TourismAssociation Reduced List
*CommonApi* | [**commonGetTourismvereinSingle**](docs/CommonApi.md#commonGetTourismvereinSingle) | **GET** /api/TourismAssociation/{id} | GET TourismAssociation Single
*CommonApi* | [**commonGetTourismvereinSingleLocalized**](docs/CommonApi.md#commonGetTourismvereinSingleLocalized) | **GET** /api/TourismAssociationLocalized/{id} | GET TourismAssociation Localized Single
*CommonApi* | [**commonGetWineAwardsList**](docs/CommonApi.md#commonGetWineAwardsList) | **GET** /api/WineAward | GET Wine Awards List
*CommonApi* | [**commonGetWineAwardsSingle**](docs/CommonApi.md#commonGetWineAwardsSingle) | **GET** /api/WineAward/{id} | GET Wine Award Single
*EventApi* | [**eventGetAllEventTopicList**](docs/EventApi.md#eventGetAllEventTopicList) | **GET** /api/EventTopics | GET Event Topic List
*EventApi* | [**eventGetAllEventsChanged**](docs/EventApi.md#eventGetAllEventsChanged) | **GET** /api/EventChanged | GET Event Changed List by Date
*EventApi* | [**eventGetEventLocalizedSingle**](docs/EventApi.md#eventGetEventLocalizedSingle) | **GET** /api/EventLocalized/{id} | GET Event Localized Single
*EventApi* | [**eventGetEventSingle**](docs/EventApi.md#eventGetEventSingle) | **GET** /api/Event/{id} | GET Event Single
*EventApi* | [**eventGetEvents**](docs/EventApi.md#eventGetEvents) | **GET** /api/Event | GET Event List
*EventApi* | [**eventGetEventsLocalized**](docs/EventApi.md#eventGetEventsLocalized) | **GET** /api/EventLocalized | GET Event Localized List
*EventApi* | [**eventGetEventsReduced**](docs/EventApi.md#eventGetEventsReduced) | **GET** /api/EventReduced | GET Event List Reduced
*EventShortApi* | [**eventShortGet**](docs/EventShortApi.md#eventShortGet) | **GET** /api/EventShort | GET EventShort List
*EventShortApi* | [**eventShortGetReducedAsync**](docs/EventShortApi.md#eventShortGetReducedAsync) | **GET** /api/EventShort/Reduced | GET EventShort Reduced List
*EventShortApi* | [**eventShortGet_0**](docs/EventShortApi.md#eventShortGet_0) | **GET** /api/EventShort/Detail/{id} | GET EventShort Single
*EventShortApi* | [**eventShortGetbyRoomBooked**](docs/EventShortApi.md#eventShortGetbyRoomBooked) | **GET** /api/EventShort/GetbyRoomBooked | GET EventShort List by Room Occupation
*GastronomyApi* | [**gastronomyGetAllGastronomyChanged**](docs/GastronomyApi.md#gastronomyGetAllGastronomyChanged) | **GET** /api/GastronomyChanged | GET Gastronomy Changed List by Date
*GastronomyApi* | [**gastronomyGetAllGastronomyTypesList**](docs/GastronomyApi.md#gastronomyGetAllGastronomyTypesList) | **GET** /api/GastronomyTypes | GET Gastronomy Types List
*GastronomyApi* | [**gastronomyGetGastronomyList**](docs/GastronomyApi.md#gastronomyGetGastronomyList) | **GET** /api/Gastronomy | GET Gastronomy List
*GastronomyApi* | [**gastronomyGetGastronomyListLocalized**](docs/GastronomyApi.md#gastronomyGetGastronomyListLocalized) | **GET** /api/GastronomyLocalized | GET Gastronomy Localized List
*GastronomyApi* | [**gastronomyGetGastronomyListReduced**](docs/GastronomyApi.md#gastronomyGetGastronomyListReduced) | **GET** /api/GastronomyReduced | GET Gastronomy Reduced List
*GastronomyApi* | [**gastronomyGetGastronomySingle**](docs/GastronomyApi.md#gastronomyGetGastronomySingle) | **GET** /api/Gastronomy/{id} | GET Gastronomy Single
*GastronomyApi* | [**gastronomyGetGastronomySingleLocalized**](docs/GastronomyApi.md#gastronomyGetGastronomySingleLocalized) | **GET** /api/GastronomyLocalized/{id} | GET Gastronomy Localized Single
*LoginApiApi* | [**loginApiGetLogout**](docs/LoginApiApi.md#loginApiGetLogout) | **GET** /api/Logout | 
*LoginApiApi* | [**loginApiPostLogin**](docs/LoginApiApi.md#loginApiPostLogin) | **POST** /api/LoginApi | 
*OdhActivityPoiApi* | [**oDHActivityPoiGetAllODHActivityPoiChanged**](docs/OdhActivityPoiApi.md#oDHActivityPoiGetAllODHActivityPoiChanged) | **GET** /api/ODHActivityPoiChanged | GET ODHActivityPoi Changed List by Date
*OdhActivityPoiApi* | [**oDHActivityPoiGetAllODHActivityPoiTypesList**](docs/OdhActivityPoiApi.md#oDHActivityPoiGetAllODHActivityPoiTypesList) | **GET** /api/ODHActivityPoiTypes | GET ODHActivityPoi Types List
*OdhActivityPoiApi* | [**oDHActivityPoiGetODHActivityPoiList**](docs/OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiList) | **GET** /api/ODHActivityPoi | GET ODHActivityPoi List
*OdhActivityPoiApi* | [**oDHActivityPoiGetODHActivityPoiListLocalized**](docs/OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiListLocalized) | **GET** /api/ODHActivityPoiLocalized | GET ODHActivityPoi List Localized
*OdhActivityPoiApi* | [**oDHActivityPoiGetODHActivityPoiListReduced**](docs/OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiListReduced) | **GET** /api/ODHActivityPoiReduced | GET ODHActivityPoi List Reduced
*OdhActivityPoiApi* | [**oDHActivityPoiGetODHActivityPoiSingle**](docs/OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiSingle) | **GET** /api/ODHActivityPoi/{id} | GET ODHActivityPoi Single
*OdhActivityPoiApi* | [**oDHActivityPoiGetODHActivityPoiSingleLocalized**](docs/OdhActivityPoiApi.md#oDHActivityPoiGetODHActivityPoiSingleLocalized) | **GET** /api/ODHActivityPoiLocalized/{id} | GET ODHActivityPoi Single Reduced
*OdhTagApi* | [**oDHTagGetODHTagSingle**](docs/OdhTagApi.md#oDHTagGetODHTagSingle) | **GET** /api/ODHTag/{id} | GET ODHTag Single
*OdhTagApi* | [**oDHTagGetODHTags**](docs/OdhTagApi.md#oDHTagGetODHTags) | **GET** /api/ODHTag | GET ODHTag List
*OdhTagApi* | [**oDHTagGetODHTagsReduced**](docs/OdhTagApi.md#oDHTagGetODHTagsReduced) | **GET** /api/ODHTagReduced | GET ODHTag List REDUCED
*PoiApi* | [**poiGetAllPoiTypesList**](docs/PoiApi.md#poiGetAllPoiTypesList) | **GET** /api/PoiTypes | GET Poi Types List
*PoiApi* | [**poiGetAllPoisChanged**](docs/PoiApi.md#poiGetAllPoisChanged) | **GET** /api/PoiChanged | GET Poi Changed List by Date
*PoiApi* | [**poiGetPoiFiltered**](docs/PoiApi.md#poiGetPoiFiltered) | **GET** /api/Poi | GET Poi List
*PoiApi* | [**poiGetPoiLocalized**](docs/PoiApi.md#poiGetPoiLocalized) | **GET** /api/PoiLocalized | GET Poi Localized List
*PoiApi* | [**poiGetPoiReduced**](docs/PoiApi.md#poiGetPoiReduced) | **GET** /api/PoiReduced | GET Poi List Reduced
*PoiApi* | [**poiGetPoiSingle**](docs/PoiApi.md#poiGetPoiSingle) | **GET** /api/Poi/{id} | GET Poi Single
*PoiApi* | [**poiGetPoiSingleLocalized**](docs/PoiApi.md#poiGetPoiSingleLocalized) | **GET** /api/PoiLocalized/{id} | GET Poi Localized Single
*UpdateApi* | [**updateUpdateAccommodation**](docs/UpdateApi.md#updateUpdateAccommodation) | **GET** /api/Update/Accommodation/{id} | 
*UpdateApi* | [**updateUpdateActivity**](docs/UpdateApi.md#updateUpdateActivity) | **GET** /api/Update/Activity/{activitytype}/{id} | 
*UpdateApi* | [**updateUpdateEvent**](docs/UpdateApi.md#updateUpdateEvent) | **GET** /api/Update/Event/{id} | 
*UpdateApi* | [**updateUpdateGastronomy**](docs/UpdateApi.md#updateUpdateGastronomy) | **GET** /api/Update/Gastronomy/{id} | 
*UpdateApi* | [**updateUpdatePackage**](docs/UpdateApi.md#updateUpdatePackage) | **GET** /api/Update/Package/{id} | 
*UpdateApi* | [**updateUpdatePoi**](docs/UpdateApi.md#updateUpdatePoi) | **GET** /api/Update/Poi/{poitype}/{id} | 
*WeatherApi* | [**weatherGetDistrictWeather**](docs/WeatherApi.md#weatherGetDistrictWeather) | **GET** /api/Weather/District | GET District Weather LIVE
*WeatherApi* | [**weatherGetMeasuringPoint**](docs/WeatherApi.md#weatherGetMeasuringPoint) | **GET** /api/Weather/Measuringpoint/{id} | GET Measuringpoint SINGLE
*WeatherApi* | [**weatherGetMeasuringPoints**](docs/WeatherApi.md#weatherGetMeasuringPoints) | **GET** /api/Weather/Measuringpoint | GET Measuringpoint LIST
*WeatherApi* | [**weatherGetRealtimeWeather**](docs/WeatherApi.md#weatherGetRealtimeWeather) | **GET** /api/Weather/Realtime | GET Current Realtime Weather LIVE
*WeatherApi* | [**weatherGetSnowReportBase**](docs/WeatherApi.md#weatherGetSnowReportBase) | **GET** /api/Weather/SnowReport | GET Snowreport Data LIVE
*WeatherApi* | [**weatherGetWeather**](docs/WeatherApi.md#weatherGetWeather) | **GET** /api/Weather | GET Current Suedtirol Weather LIVE
*WebcamApi* | [**webcamCreateWebcamList**](docs/WebcamApi.md#webcamCreateWebcamList) | **GET** /api/Webcam/WebcamList | GET List of all available Webcams
*WebcamApi* | [**webcamGetWebcamList**](docs/WebcamApi.md#webcamGetWebcamList) | **GET** /api/Webcam | GET Webcam List


## Documentation for Models

 - [AccoBookingChannel](docs/AccoBookingChannel.md)
 - [AccoDetail](docs/AccoDetail.md)
 - [AccoFeature](docs/AccoFeature.md)
 - [AccoRoom](docs/AccoRoom.md)
 - [AccoRoomDetail](docs/AccoRoomDetail.md)
 - [AccoTypes](docs/AccoTypes.md)
 - [Accommodation](docs/Accommodation.md)
 - [AccommodationLocalized](docs/AccommodationLocalized.md)
 - [AccommodationReduced](docs/AccommodationReduced.md)
 - [ActivityPoiReduced](docs/ActivityPoiReduced.md)
 - [ActivityTypes](docs/ActivityTypes.md)
 - [AdditionalArticleInfos](docs/AdditionalArticleInfos.md)
 - [AdditionalPoiInfos](docs/AdditionalPoiInfos.md)
 - [AreaInfo](docs/AreaInfo.md)
 - [AreaInfoLocalized](docs/AreaInfoLocalized.md)
 - [Article](docs/Article.md)
 - [ArticleLinkInfo](docs/ArticleLinkInfo.md)
 - [Bank](docs/Bank.md)
 - [BaseInfosLocalized](docs/BaseInfosLocalized.md)
 - [BezirksForecast](docs/BezirksForecast.md)
 - [BezirksWeather](docs/BezirksWeather.md)
 - [CancelPolicy](docs/CancelPolicy.md)
 - [CapacityCeremony](docs/CapacityCeremony.md)
 - [CategoryCodes](docs/CategoryCodes.md)
 - [CommonReduced](docs/CommonReduced.md)
 - [Conditions](docs/Conditions.md)
 - [ContactInfos](docs/ContactInfos.md)
 - [Detail](docs/Detail.md)
 - [DetailThemed](docs/DetailThemed.md)
 - [DetailsThemed](docs/DetailsThemed.md)
 - [DishRates](docs/DishRates.md)
 - [District](docs/District.md)
 - [DistrictInfo](docs/DistrictInfo.md)
 - [DistrictInfoLocalized](docs/DistrictInfoLocalized.md)
 - [DistrictLocalized](docs/DistrictLocalized.md)
 - [Event](docs/Event.md)
 - [EventAdditionalInfos](docs/EventAdditionalInfos.md)
 - [EventDate](docs/EventDate.md)
 - [EventLocalized](docs/EventLocalized.md)
 - [EventPrice](docs/EventPrice.md)
 - [EventPublisher](docs/EventPublisher.md)
 - [EventReduced](docs/EventReduced.md)
 - [EventShort](docs/EventShort.md)
 - [EventShortByRoom](docs/EventShortByRoom.md)
 - [EventShortReduced](docs/EventShortReduced.md)
 - [EventTypes](docs/EventTypes.md)
 - [ExperienceArea](docs/ExperienceArea.md)
 - [ExperienceAreaLocalized](docs/ExperienceAreaLocalized.md)
 - [ExperienceAreaName](docs/ExperienceAreaName.md)
 - [Facilities](docs/Facilities.md)
 - [Forecast](docs/Forecast.md)
 - [GBLTSActivity](docs/GBLTSActivity.md)
 - [GBLTSActivityPoiLocalized](docs/GBLTSActivityPoiLocalized.md)
 - [GBLTSPoi](docs/GBLTSPoi.md)
 - [Gastronomy](docs/Gastronomy.md)
 - [GastronomyLocalized](docs/GastronomyLocalized.md)
 - [GastronomyReduced](docs/GastronomyReduced.md)
 - [GastronomyTypes](docs/GastronomyTypes.md)
 - [GpsInfo](docs/GpsInfo.md)
 - [GpsPolygon](docs/GpsPolygon.md)
 - [GpsTrack](docs/GpsTrack.md)
 - [ImageGallery](docs/ImageGallery.md)
 - [ImageGalleryLocalized](docs/ImageGalleryLocalized.md)
 - [LTSTags](docs/LTSTags.md)
 - [LTSTagsLocalized](docs/LTSTagsLocalized.md)
 - [LocationInfo](docs/LocationInfo.md)
 - [LocationInfoLocalized](docs/LocationInfoLocalized.md)
 - [LoginPostModel](docs/LoginPostModel.md)
 - [Measuringpoint](docs/Measuringpoint.md)
 - [MeasuringpointReduced](docs/MeasuringpointReduced.md)
 - [MetaRegion](docs/MetaRegion.md)
 - [MetaRegionLocalized](docs/MetaRegionLocalized.md)
 - [Mountain](docs/Mountain.md)
 - [MssResponseShort](docs/MssResponseShort.md)
 - [Municipality](docs/Municipality.md)
 - [MunicipalityInfo](docs/MunicipalityInfo.md)
 - [MunicipalityInfoLocalized](docs/MunicipalityInfoLocalized.md)
 - [MunicipalityLocalized](docs/MunicipalityLocalized.md)
 - [ODHActivityPoi](docs/ODHActivityPoi.md)
 - [ODHActivityPoiLocalized](docs/ODHActivityPoiLocalized.md)
 - [OperationSchedule](docs/OperationSchedule.md)
 - [OperationScheduleTime](docs/OperationScheduleTime.md)
 - [PaymentTerm](docs/PaymentTerm.md)
 - [Penalty](docs/Penalty.md)
 - [PoiBaseInfos](docs/PoiBaseInfos.md)
 - [PoiProperty](docs/PoiProperty.md)
 - [PoiTypes](docs/PoiTypes.md)
 - [Ratings](docs/Ratings.md)
 - [RealTimeMeasurements](docs/RealTimeMeasurements.md)
 - [Region](docs/Region.md)
 - [RegionInfo](docs/RegionInfo.md)
 - [RegionInfoLocalized](docs/RegionInfoLocalized.md)
 - [RegionLocalized](docs/RegionLocalized.md)
 - [RelatedContent](docs/RelatedContent.md)
 - [ResultEventShort](docs/ResultEventShort.md)
 - [RoomBooked](docs/RoomBooked.md)
 - [RoomDetails](docs/RoomDetails.md)
 - [RoomPictures](docs/RoomPictures.md)
 - [SmgPoiTypes](docs/SmgPoiTypes.md)
 - [SmgTagReduced](docs/SmgTagReduced.md)
 - [SmgTags](docs/SmgTags.md)
 - [SnowReportBaseData](docs/SnowReportBaseData.md)
 - [Stationdata](docs/Stationdata.md)
 - [Topic](docs/Topic.md)
 - [Tourismverein](docs/Tourismverein.md)
 - [TourismvereinLocalized](docs/TourismvereinLocalized.md)
 - [TvInfo](docs/TvInfo.md)
 - [TvInfoLocalized](docs/TvInfoLocalized.md)
 - [Weather](docs/Weather.md)
 - [WeatherObservation](docs/WeatherObservation.md)
 - [WeatherRealTime](docs/WeatherRealTime.md)
 - [Webcam](docs/Webcam.md)
 - [WebcamLocalized](docs/WebcamLocalized.md)
 - [WebcamResult](docs/WebcamResult.md)
 - [Wine](docs/Wine.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




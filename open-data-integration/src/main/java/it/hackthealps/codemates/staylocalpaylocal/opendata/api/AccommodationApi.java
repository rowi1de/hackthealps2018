package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccoRoom;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccoTypes;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Accommodation;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationReduced;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.MssResponseShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
@Component("it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi")
public class AccommodationApi {
    private ApiClient apiClient;

    public AccommodationApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccommodationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET Accommodation Room Info by AccoID
     * 
     * <p><b>200</b> - MssResult Object
     * @param accoid Accommodation ID
     * @param idsource ID Source Filter (possible values:&#39;lts&#39;,&#39;hgv&#39;), (default:&#39;lts&#39;)
     * @return List&lt;AccoRoom&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccoRoom> accommodationGetAccoRoomInfos(String accoid, String idsource) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'accoid' is set
        if (accoid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accoid' when calling accommodationGetAccoRoomInfos");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/AccommodationRoom").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accoid", accoid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idsource", idsource));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<AccoRoom>> returnType = new ParameterizedTypeReference<List<AccoRoom>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Accommodation Single
     * 
     * <p><b>200</b> - Accommodation Object
     * @param id ID of the Accommodation
     * @param idsource ID Source Filter (possible values:&#39;lts&#39;,&#39;hgv&#39;), (default:&#39;lts&#39;)
     * @param language Language of the Availability Response (possible values: &#39;de&#39;,&#39;it&#39;,&#39;en&#39;), (default:&#39;de&#39;)
     * @param boardfilter Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter), (default:&#39;0&#39;)
     * @param arrival Arrival Date (yyyy-MM-dd) REQUIRED, (default:&#39;Today&#39;)
     * @param departure Departure Date (yyyy-MM-dd) REQUIRED, (default:&#39;Tomorrow&#39;)
     * @param roominfo Roominfo Filter REQUIRED (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:&#39;1-18,18&#39;)
     * @param bokfilter Booking Channels Filter REQUIRED (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), lts &#x3D; (LTS Availability check)), (default:&#39;hgv&#39;)
     * @param availabilitycheck Availability Check enabled/disabled (possible Values: &#39;true&#39;, &#39;false), (default Value: &#39;false&#39;)
     * @return Accommodation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Accommodation accommodationGetAccommodation(String id, String idsource, String language, String boardfilter, String arrival, String departure, String roominfo, String bokfilter, String availabilitycheck) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accommodationGetAccommodation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Accommodation/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idsource", idsource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "boardfilter", boardfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrival", arrival));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "departure", departure));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roominfo", roominfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "bokfilter", bokfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availabilitycheck", availabilitycheck));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Accommodation> returnType = new ParameterizedTypeReference<Accommodation>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Accommodation Single Localized
     * 
     * <p><b>200</b> - Accommodation Localized Object
     * @param id ID of the Accommodation
     * @param language Localization Language
     * @param idsource ID Source Filter (possible values:&#39;lts&#39;,&#39;hgv&#39;), (default:&#39;lts&#39;)
     * @param boardfilter Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter), (default:&#39;0&#39;)
     * @param arrival Arrival Date (yyyy-MM-dd) REQUIRED, (default:&#39;Today&#39;)
     * @param departure Departure Date (yyyy-MM-dd) REQUIRED, (default:&#39;Tomorrow&#39;)
     * @param roominfo Roominfo Filter REQUIRED (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:&#39;1-18,18&#39;)
     * @param bokfilter Booking Channels Filter REQUIRED (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), lts &#x3D; (LTS Availability check)), (default:&#39;hgv&#39;)
     * @param availabilitycheck Availability Check enabled/disabled (possible Values: &#39;true&#39;, &#39;false), (default Value: &#39;false&#39;)
     * @return AccommodationLocalized
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccommodationLocalized accommodationGetAccommodationLocalized(String id, String language, String idsource, String boardfilter, String arrival, String departure, String roominfo, String bokfilter, String availabilitycheck) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accommodationGetAccommodationLocalized");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/AccommodationLocalized/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idsource", idsource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "boardfilter", boardfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrival", arrival));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "departure", departure));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roominfo", roominfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "bokfilter", bokfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availabilitycheck", availabilitycheck));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AccommodationLocalized> returnType = new ParameterizedTypeReference<AccommodationLocalized>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Accommodation List
     * 
     * <p><b>200</b> - Array of Accommodation Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (If availabilitycheck set, pagesize has no effect all Accommodations are returned), (default:10)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0)
     * @param categoryfilter Categoryfilter (BITMASK values: 1 &#x3D; (not categorized), 2 &#x3D; (1star), 4 &#x3D; (1flower), 8 &#x3D; (1sun), 14 &#x3D; (1star/1flower/1sun), 16 &#x3D; (2stars), 32 &#x3D; (2flowers), 64 &#x3D; (2suns), 112 &#x3D; (2stars/2flowers/2suns), 128 &#x3D; (3stars), 256 &#x3D; (3flowers), 512 &#x3D; (3suns), 1024 &#x3D; (3sstars), 1920 &#x3D; (3stars/3flowers/3suns/3sstars), 2048 &#x3D; (4stars), 4096 &#x3D; (4flowers), 8192 &#x3D; (4suns), 16384 &#x3D; (4sstars), 30720 &#x3D; (4stars/4flowers/4suns/4sstars), 32768 &#x3D; (5stars), 65536 &#x3D; (5flowers), 131072 &#x3D; (5suns), 229376 &#x3D; (5stars/5flowers/5suns), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param typefilter Typefilter (BITMASK values: 1 &#x3D; (HotelPension), 2 &#x3D; (BedBreakfast), 4 &#x3D; (Farm), 8 &#x3D; (Camping), 16 &#x3D; (Youth), 32 &#x3D; (Mountain), 64 &#x3D; (Apartment), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param boardfilter Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter), (default:&#39;0&#39;)
     * @param featurefilter FeatureFilter (BITMASK values: 1 &#x3D; (Ruhig gelegen), 2 &#x3D; (Tagung), 4 &#x3D; (Schwimmbad), 8 &#x3D; (Sauna), 16 &#x3D; (Garage), 32 &#x3D; (Abholservice), 64 &#x3D; (Wlan), 128 &#x3D; (Barrierefrei), 256 &#x3D; (Allergikerküche), 1024 &#x3D; (Kleine Haustiere), 2048 &#x3D; (Gruppenfreundlich), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param themefilter Themefilter (BITMASK values: 1 &#x3D; (Gourment), 2 &#x3D; (In der Höhe), 4 &#x3D; (Regionale Wellness), 8 &#x3D; (Biken), 16 &#x3D; (Familie), 32 &#x3D; (Wandern), 64 &#x3D; (Wein), 128 &#x3D; (Städtisches Flair), 256 &#x3D; (Am Skigebiet), 512 &#x3D; (Mediterran), 1024 &#x3D; (Dolomiten), 2048 &#x3D; (Alpin), 4096 &#x3D; (Kleine Betriebe), 8192 &#x3D; (Hütten und Berggasthöfe), 16384 &#x3D; (Bäuerliche Welten), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param badgefilter BadgeFilter (BITMASK values: 1 &#x3D; (Wellnesshotel), 2 &#x3D; (Familienhotel), 4 &#x3D; (Bikehotel), 8 &#x3D; (Bauernhof), 16 &#x3D; (Behindertengerecht), 32 &#x3D; (Wanderhotel), 64 &#x3D; (Südtirol Privatvermieter), 128 &#x3D; (Vinum Hotels), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param idfilter IDFilter (Separator &#39;,&#39; List of Accommodation IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param odhtagfilter ODHTag Filter (String, Separator &#39;,&#39; more ODHTags possible, &#39;null&#39; &#x3D; No Filter, available ODHTags reference to &#39;api/ODHTag?validforentity&#x3D;accommodation&#39;), (default:&#39;null&#39;)
     * @param odhactive ODHActive Filter (possible Values: &#39;null&#39; Displays all Accommodations, &#39;true&#39; only ODH Active Accommodations, &#39;false&#39; only ODH Disabled Accommodations, (default:&#39;null&#39;)
     * @param active TIC Active Filter (possible Values: &#39;null&#39; Displays all Accommodations, &#39;true&#39; only TIC Active Accommodations, &#39;false&#39; only TIC Disabled Accommodations, (default:&#39;null&#39;)
     * @param arrival Arrival Date (yyyy-MM-dd) REQUIRED, (default:&#39;Today&#39;)
     * @param departure Departure Date (yyyy-MM-dd) REQUIRED, (default:&#39;Tomorrow&#39;)
     * @param roominfo Roominfo Filter REQUIRED (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:&#39;1-18,18&#39;)
     * @param bokfilter Booking Channels Filter REQUIRED (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), lts &#x3D; (LTS Availability check)), (default:&#39;hgv&#39;)
     * @param language Language of the Availability Response (possible values: &#39;de&#39;,&#39;it&#39;,&#39;en&#39;), (default:&#39;de&#39;)
     * @param availabilitycheck Availability Check enabled/disabled (possible Values: &#39;true&#39;, &#39;false), (default Value: &#39;false&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;Accommodation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccommodationResult accommodationGetAccommodations(Integer pagenumber, Integer pagesize, String seed,
            String categoryfilter, String typefilter, String boardfilter, String featurefilter, String themefilter,
            String badgefilter, String idfilter, String locfilter, String odhtagfilter, String odhactive, String active,
            String arrival, String departure, String roominfo, String bokfilter, String language,
            String availabilitycheck, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Accommodation").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seed", seed));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "categoryfilter", categoryfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "typefilter", typefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "boardfilter", boardfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "featurefilter", featurefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "themefilter", themefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "badgefilter", badgefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idfilter", idfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhactive", odhactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrival", arrival));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "departure", departure));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roominfo", roominfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "bokfilter", bokfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availabilitycheck", availabilitycheck));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "latitude", latitude));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "longitude", longitude));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "radius", radius));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AccommodationResult> returnType = new ParameterizedTypeReference<AccommodationResult>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Accommodation List Localized
     * 
     * <p><b>200</b> - Array of Accommodation Localized Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (If availabilitycheck set, pagesize has no effect all Accommodations are returned), (default:10)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0)
     * @param language Language of the Availability Response (possible values: &#39;de&#39;,&#39;it&#39;,&#39;en&#39;), (default:&#39;de&#39;)
     * @param categoryfilter Categoryfilter (BITMASK values: 1 &#x3D; (not categorized), 2 &#x3D; (1star), 4 &#x3D; (1flower), 8 &#x3D; (1sun), 14 &#x3D; (1star/1flower/1sun), 16 &#x3D; (2stars), 32 &#x3D; (2flowers), 64 &#x3D; (2suns), 112 &#x3D; (2stars/2flowers/2suns), 128 &#x3D; (3stars), 256 &#x3D; (3flowers), 512 &#x3D; (3suns), 1024 &#x3D; (3sstars), 1920 &#x3D; (3stars/3flowers/3suns/3sstars), 2048 &#x3D; (4stars), 4096 &#x3D; (4flowers), 8192 &#x3D; (4suns), 16384 &#x3D; (4sstars), 30720 &#x3D; (4stars/4flowers/4suns/4sstars), 32768 &#x3D; (5stars), 65536 &#x3D; (5flowers), 131072 &#x3D; (5suns), 229376 &#x3D; (5stars/5flowers/5suns), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param typefilter Typefilter (BITMASK values: 1 &#x3D; (HotelPension), 2 &#x3D; (BedBreakfast), 4 &#x3D; (Farm), 8 &#x3D; (Camping), 16 &#x3D; (Youth), 32 &#x3D; (Mountain), 64 &#x3D; (Apartment), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param boardfilter Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter), (default:&#39;0&#39;)
     * @param featurefilter FeatureFilter (BITMASK values: 1 &#x3D; (Ruhig gelegen), 2 &#x3D; (Tagung), 4 &#x3D; (Schwimmbad), 8 &#x3D; (Sauna), 16 &#x3D; (Garage), 32 &#x3D; (Abholservice), 64 &#x3D; (Wlan), 128 &#x3D; (Barrierefrei), 256 &#x3D; (Allergikerküche), 1024 &#x3D; (Kleine Haustiere), 2048 &#x3D; (Gruppenfreundlich), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param themefilter Themefilter (BITMASK values: 1 &#x3D; (Gourment), 2 &#x3D; (In der Höhe), 4 &#x3D; (Regionale Wellness), 8 &#x3D; (Biken), 16 &#x3D; (Familie), 32 &#x3D; (Wandern), 64 &#x3D; (Wein), 128 &#x3D; (Städtisches Flair), 256 &#x3D; (Am Skigebiet), 512 &#x3D; (Mediterran), 1024 &#x3D; (Dolomiten), 2048 &#x3D; (Alpin), 4096 &#x3D; (Kleine Betriebe), 8192 &#x3D; (Hütten und Berggasthöfe), 16384 &#x3D; (Bäuerliche Welten), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param badgefilter BadgeFilter (BITMASK values: 1 &#x3D; (Wellnesshotel), 2 &#x3D; (Familienhotel), 4 &#x3D; (Bikehotel), 8 &#x3D; (Bauernhof), 16 &#x3D; (Behindertengerecht), 32 &#x3D; (Wanderhotel), 64 &#x3D; (Südtirol Privatvermieter), 128 &#x3D; (Vinum Hotels), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param idfilter IDFilter (Separator &#39;,&#39; List of Accommodation IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param odhtagfilter ODHTag Filter (String, Separator &#39;,&#39; more ODHTags possible, &#39;null&#39; &#x3D; No Filter, available ODHTags reference to &#39;api/ODHTag?validforentity&#x3D;accommodation&#39;), (default:&#39;null&#39;)
     * @param odhactive ODHActive Filter (possible Values: &#39;null&#39; Displays all Accommodations, &#39;true&#39; only ODH Active Accommodations, &#39;false&#39; only ODH Disabled Accommodations, (default:&#39;null&#39;)
     * @param active TIC Active Filter (possible Values: &#39;null&#39; Displays all Accommodations, &#39;true&#39; only TIC Active Accommodations, &#39;false&#39; only TIC Disabled Accommodations, (default:&#39;null&#39;)
     * @param arrival Arrival Date (yyyy-MM-dd) REQUIRED, (default:&#39;Today&#39;)
     * @param departure Departure Date (yyyy-MM-dd) REQUIRED, (default:&#39;Tomorrow&#39;)
     * @param roominfo Roominfo Filter REQUIRED (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18), (default:&#39;1-18,18&#39;)
     * @param bokfilter Booking Channels Filter REQUIRED (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), lts &#x3D; (LTS Availability check)), (default:&#39;hgv&#39;)
     * @param availabilitycheck Availability Check enabled/disabled (possible Values: &#39;true&#39;, &#39;false), (default Value: &#39;false&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;AccommodationLocalized&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccommodationLocalized> accommodationGetAccommodationsLocalized(Integer pagenumber, Integer pagesize, String seed, String language, String categoryfilter, String typefilter, String boardfilter, String featurefilter, String themefilter, String badgefilter, String idfilter, String locfilter, String odhtagfilter, String odhactive, String active, String arrival, String departure, String roominfo, String bokfilter, String availabilitycheck, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/AccommodationLocalized").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seed", seed));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "categoryfilter", categoryfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "typefilter", typefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "boardfilter", boardfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "featurefilter", featurefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "themefilter", themefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "badgefilter", badgefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idfilter", idfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhactive", odhactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrival", arrival));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "departure", departure));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roominfo", roominfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "bokfilter", bokfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availabilitycheck", availabilitycheck));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "latitude", latitude));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "longitude", longitude));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "radius", radius));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<AccommodationLocalized>> returnType = new ParameterizedTypeReference<List<AccommodationLocalized>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Accommodation Feature List (LTS Features)
     * 
     * <p><b>200</b> - Array of AccommodationType Objects
     * @param source IF source &#x3D; \&quot;lts\&quot; the Features list is returned in XML Format directly from LTS, (default: blank)
     * @return List&lt;AccoTypes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccoTypes> accommodationGetAllAccommodationFeatueresList(String source) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/AccommodationFeatures").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<AccoTypes>> returnType = new ParameterizedTypeReference<List<AccoTypes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Accommodation Types List
     * 
     * <p><b>200</b> - Array of AccommodationType Objects
     * @return List&lt;AccoTypes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccoTypes> accommodationGetAllAccommodationTypesList() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/AccommodationTypes").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<AccoTypes>> returnType = new ParameterizedTypeReference<List<AccoTypes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Accommodation Changed List by Date
     * 
     * <p><b>200</b> - Array of Accommodation Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0)
     * @param updatefrom Date from Format (yyyy-MM-dd) (all Accos with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day)
     * @return List&lt;Accommodation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccommodationResult accommodationGetAllAccommodationsChanged(Integer pagenumber, Integer pagesize,
            String seed, String updatefrom) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/AccommodationChanged").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seed", seed));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatefrom", updatefrom));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AccommodationResult> returnType = new ParameterizedTypeReference<AccommodationResult>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Accommodation Reduced Object
     * @param language The language parameter
     * @param categoryfilter The categoryfilter parameter
     * @param typefilter The typefilter parameter
     * @param boardfilter The boardfilter parameter
     * @param featurefilter The featurefilter parameter
     * @param themefilter The themefilter parameter
     * @param badgefilter The badgefilter parameter
     * @param locfilter The locfilter parameter
     * @param odhtagfilter The odhtagfilter parameter
     * @param odhactive The odhactive parameter
     * @param active The active parameter
     * @param latitude The latitude parameter
     * @param longitude The longitude parameter
     * @param radius The radius parameter
     * @return List&lt;AccommodationReduced&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccommodationReduced> accommodationGetReducedAccosAsync(String language, String categoryfilter, String typefilter, String boardfilter, String featurefilter, String themefilter, String badgefilter, String locfilter, String odhtagfilter, String odhactive, String active, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/AccommodationReduced").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "categoryfilter", categoryfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "typefilter", typefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "boardfilter", boardfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "featurefilter", featurefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "themefilter", themefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "badgefilter", badgefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhactive", odhactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "latitude", latitude));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "longitude", longitude));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "radius", radius));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<AccommodationReduced>> returnType = new ParameterizedTypeReference<List<AccommodationReduced>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * POST Available Accommodations MSS / LCS on posted IDs
     * 
     * <p><b>200</b> - Accommodation Object
     * @param idfilter Posted Accommodation IDs
     * @param language Language of the Availability Response
     * @param boardfilter Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter)
     * @param arrival Arrival Date (yyyy-MM-dd) REQUIRED
     * @param departure Departure Date (yyyy-MM-dd) REQUIRED
     * @param roominfo Roominfo Filter (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18) REQUIRED
     * @param bokfilter Booking Channels Filter (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), pos &#x3D; (LTS Booking Portals)) REQUIRED
     * @param source Source of the Requester (possible value: &#39;sinfo&#39; &#x3D; Suedtirol.info, &#39;sbalance&#39; &#x3D; Südtirol Balance) REQUIRED
     * @param detail Include Offer Details (Boolean, 1 &#x3D; full Details)
     * @return List&lt;Accommodation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccommodationResult accommodationPostAvailableAccommodations(String idfilter, String language,
            String boardfilter, String arrival, String departure, String roominfo, String bokfilter, String source,
            String detail) throws RestClientException {
        Object postBody = idfilter;
        
        // verify the required parameter 'idfilter' is set
        if (idfilter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idfilter' when calling accommodationPostAvailableAccommodations");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/AccommodationAvailable").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "boardfilter", boardfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrival", arrival));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "departure", departure));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roominfo", roominfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "bokfilter", bokfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "detail", detail));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AccommodationResult> returnType = new ParameterizedTypeReference<AccommodationResult>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * POST Available Accommodations MSS / LCS on posted IDs only Availability Response
     * 
     * <p><b>200</b> - MssResponseShort Object
     * @param idfilter Posted Accommodation IDs
     * @param language Language of the Availability Response
     * @param boardfilter Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter)
     * @param arrival Arrival Date (yyyy-MM-dd) REQUIRED
     * @param departure Departure Date (yyyy-MM-dd) REQUIRED
     * @param roominfo Roominfo Filter (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18) REQUIRED
     * @param bokfilter Booking Channels Filter (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), pos &#x3D; (LTS Booking Portals)) REQUIRED
     * @param source Source of the Requester (possible value: &#39;sinfo&#39; &#x3D; Suedtirol.info, &#39;sbalance&#39; &#x3D; Südtirol Balance) REQUIRED
     * @param detail Include Offer Details (Boolean, 1 &#x3D; full Details)
     * @return List&lt;MssResponseShort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MssResponseShort> accommodationPostAvailableMSSResponseonlyAccommodations(String idfilter, String language, String boardfilter, String arrival, String departure, String roominfo, String bokfilter, String source, String detail) throws RestClientException {
        Object postBody = idfilter;
        
        // verify the required parameter 'idfilter' is set
        if (idfilter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idfilter' when calling accommodationPostAvailableMSSResponseonlyAccommodations");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/AvailabilityCheck").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "boardfilter", boardfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrival", arrival));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "departure", departure));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roominfo", roominfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "bokfilter", bokfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "detail", detail));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<MssResponseShort>> returnType = new ParameterizedTypeReference<List<MssResponseShort>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * POST Available Accommodations (All) MSS / LCS only Availability Response
     * 
     * <p><b>200</b> - MssResult Object
     * @param language Language of the Availability Response
     * @param boardfilter Boardfilter (BITMASK values: 0 &#x3D; (all boards), 1 &#x3D; (without board), 2 &#x3D; (breakfast), 4 &#x3D; (half board), 8 &#x3D; (full board), 16 &#x3D; (All inclusive), &#39;null&#39; &#x3D; No Filter)
     * @param arrival Arrival Date (yyyy-MM-dd) REQUIRED
     * @param departure Departure Date (yyyy-MM-dd) REQUIRED
     * @param roominfo Roominfo Filter (Splitter for Rooms &#39;|&#39; Splitter for Persons Ages &#39;,&#39; possible Values Example 1-18,10|1-18 &#x3D; 2 Rooms, Room 1 for 2 person Age 18 and Age 10, Room 2 for 1 Person Age 18) REQUIRED
     * @param bokfilter Booking Channels Filter (Separator &#39;,&#39; possible values: hgv &#x3D; (Booking Südtirol), htl &#x3D; (Hotel.de), exp &#x3D; (Expedia), bok &#x3D; (Booking.com), pos &#x3D; (LTS Booking Portals)) REQUIRED
     * @param source Source of the Requester (possible value: &#39;sinfo&#39; &#x3D; Suedtirol.info, &#39;sbalance&#39; &#x3D; Südtirol Balance) REQUIRED
     * @param detail Include Offer Details (Boolean, 1 &#x3D; full Details)
     * @return List&lt;MssResponseShort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MssResponseShort> accommodationPostAvailableMSSResponseonlyAllAccommodations(String language, String boardfilter, String arrival, String departure, String roominfo, String bokfilter, String source, String detail) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/AvailabilityCheckAll").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "boardfilter", boardfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrival", arrival));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "departure", departure));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roominfo", roominfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "bokfilter", bokfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "detail", detail));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<MssResponseShort>> returnType = new ParameterizedTypeReference<List<MssResponseShort>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ActivityPoiReduced;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ActivityTypes;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GBLTSActivity;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GBLTSActivityPoiLocalized;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
@Component("it.hackthealps.codemates.staylocalpaylocal.api.ActivityApi")
public class ActivityApi {
    private ApiClient apiClient;

    public ActivityApi() {
        this(new ApiClient());
    }

    @Autowired
    public ActivityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET Activity List Localized
     * 
     * <p><b>200</b> - Array of ActivityLocalized Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param activitytype Type of the Activity (possible values: STRINGS: &#39;Berg&#39;,&#39;Radfahren&#39;,&#39;Stadtrundgang&#39;,&#39;Pferdesport&#39;,&#39;Wandern&#39;,&#39;Laufen und Fitness&#39;,&#39;Loipen&#39;,&#39;Rodelbahnen&#39;,&#39;Piste&#39;,&#39;Aufstiegsanlagen&#39; - BITMASK also possible: &#39;Berg &#x3D; 1&#39;,&#39;Radfahren &#x3D; 2&#39;,&#39;Stadtrundgang &#x3D; 4&#39;,&#39;Pferdesport &#x3D; 8&#39;,&#39;Wandern &#x3D; 16&#39;,&#39;Laufen und Fitness &#x3D; 32&#39;,&#39;Loipen &#x3D; 64&#39;,&#39;Rodelbahnen &#x3D; 128,&#39;Piste &#x3D; 256,&#39;Aufstiegsanlagen &#x3D; 512), (default:&#39;1023&#39;)
     * @param subtype Subtype of the Activity (BITMASK Filter &#x3D; available SubTypes depends on the selected Activity Type), (default:&#39;null&#39;)
     * @param idlist IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param areafilter AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;)
     * @param distancefilter Distance Range Filter (Separator &#39;,&#39; example Value: 15,40 Distance from 15 up to 40 Km), (default:&#39;null&#39;)
     * @param altitudefilter Altitude Range Filter (Separator &#39;,&#39; example Value: 500,1000 Altitude from 500 up to 1000 metres), (default:&#39;null&#39;)
     * @param durationfilter Duration Range Filter (Separator &#39;,&#39; example Value: 1,3 Duration from 1 to 3 hours), (default:&#39;null&#39;)
     * @param highlight Hightlight Filter (possible values: &#39;false&#39; &#x3D; only Activities with Highlight false, &#39;true&#39; &#x3D; only Activities with Highlight true), (default:&#39;null&#39;)
     * @param difficultyfilter Difficulty Filter (possible values: &#39;1&#39; &#x3D; easy, &#39;2&#39; &#x3D; medium, &#39;3&#39; &#x3D; difficult), (default:&#39;null&#39;)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;GBLTSActivityPoiLocalized&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GBLTSActivityPoiLocalized> activityGetActivityFilteredLocalized(String language, Integer pagenumber, Integer pagesize, String activitytype, String subtype, String idlist, String locfilter, String areafilter, String distancefilter, String altitudefilter, String durationfilter, String highlight, String difficultyfilter, String odhtagfilter, String active, String odhactive, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ActivityLocalized").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "activitytype", activitytype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subtype", subtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "distancefilter", distancefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "altitudefilter", altitudefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "durationfilter", durationfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "highlight", highlight));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "difficultyfilter", difficultyfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhactive", odhactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seed", seed));
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

        ParameterizedTypeReference<List<GBLTSActivityPoiLocalized>> returnType = new ParameterizedTypeReference<List<GBLTSActivityPoiLocalized>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Activity List
     * 
     * <p><b>200</b> - Array of Activity Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param activitytype Type of the Activity (possible values: STRINGS: &#39;Berg&#39;,&#39;Radfahren&#39;,&#39;Stadtrundgang&#39;,&#39;Pferdesport&#39;,&#39;Wandern&#39;,&#39;Laufen und Fitness&#39;,&#39;Loipen&#39;,&#39;Rodelbahnen&#39;,&#39;Piste&#39;,&#39;Aufstiegsanlagen&#39; - BITMASK also possible: &#39;Berg &#x3D; 1&#39;,&#39;Radfahren &#x3D; 2&#39;,&#39;Stadtrundgang &#x3D; 4&#39;,&#39;Pferdesport &#x3D; 8&#39;,&#39;Wandern &#x3D; 16&#39;,&#39;Laufen und Fitness &#x3D; 32&#39;,&#39;Loipen &#x3D; 64&#39;,&#39;Rodelbahnen &#x3D; 128,&#39;Piste &#x3D; 256,&#39;Aufstiegsanlagen &#x3D; 512), (default:&#39;1023&#39;)
     * @param subtype Subtype of the Activity (BITMASK Filter &#x3D; available SubTypes depends on the selected Activity Type), (default:&#39;null&#39;)
     * @param idlist IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param areafilter AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;)
     * @param distancefilter Distance Range Filter (Separator &#39;,&#39; example Value: 15,40 Distance from 15 up to 40 Km), (default:&#39;null&#39;)
     * @param altitudefilter Altitude Range Filter (Separator &#39;,&#39; example Value: 500,1000 Altitude from 500 up to 1000 metres), (default:&#39;null&#39;)
     * @param durationfilter Duration Range Filter (Separator &#39;,&#39; example Value: 1,3 Duration from 1 to 3 hours), (default:&#39;null&#39;)
     * @param highlight Hightlight Filter (possible values: &#39;false&#39; &#x3D; only Activities with Highlight false, &#39;true&#39; &#x3D; only Activities with Highlight true), (default:&#39;null&#39;)
     * @param difficultyfilter Difficulty Filter (possible values: &#39;1&#39; &#x3D; easy, &#39;2&#39; &#x3D; medium, &#39;3&#39; &#x3D; difficult), (default:&#39;null&#39;)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/ODHTag?validforentity&#x3D;activity&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;GBLTSActivity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GBLTSActivity> activityGetActivityList(Integer pagenumber, Integer pagesize, String activitytype, String subtype, String idlist, String locfilter, String areafilter, String distancefilter, String altitudefilter, String durationfilter, String highlight, String difficultyfilter, String odhtagfilter, String active, String odhactive, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Activity").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "activitytype", activitytype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subtype", subtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "distancefilter", distancefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "altitudefilter", altitudefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "durationfilter", durationfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "highlight", highlight));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "difficultyfilter", difficultyfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhactive", odhactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seed", seed));
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

        ParameterizedTypeReference<List<GBLTSActivity>> returnType = new ParameterizedTypeReference<List<GBLTSActivity>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Activity List Reduced
     * 
     * <p><b>200</b> - Array of Activity Reduced Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param activitytype Type of the Activity (possible values: STRINGS: &#39;Berg&#39;,&#39;Radfahren&#39;,&#39;Stadtrundgang&#39;,&#39;Pferdesport&#39;,&#39;Wandern&#39;,&#39;Laufen und Fitness&#39;,&#39;Loipen&#39;,&#39;Rodelbahnen&#39;,&#39;Piste&#39;,&#39;Aufstiegsanlagen&#39; - BITMASK also possible: &#39;Berg &#x3D; 1&#39;,&#39;Radfahren &#x3D; 2&#39;,&#39;Stadtrundgang &#x3D; 4&#39;,&#39;Pferdesport &#x3D; 8&#39;,&#39;Wandern &#x3D; 16&#39;,&#39;Laufen und Fitness &#x3D; 32&#39;,&#39;Loipen &#x3D; 64&#39;,&#39;Rodelbahnen &#x3D; 128,&#39;Piste &#x3D; 256,&#39;Aufstiegsanlagen &#x3D; 512), (default:&#39;1023&#39;)
     * @param subtype Subtype of the Activity (BITMASK Filter &#x3D; available SubTypes depends on the selected Activity Type), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param areafilter AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;)
     * @param distancefilter Distance Range Filter (Separator &#39;,&#39; example Value: 15,40 Distance from 15 up to 40 Km), (default:&#39;null&#39;)
     * @param altitudefilter Altitude Range Filter (Separator &#39;,&#39; example Value: 500,1000 Altitude from 500 up to 1000 metres), (default:&#39;null&#39;)
     * @param durationfilter Duration Range Filter (Separator &#39;,&#39; example Value: 1,3 Duration from 1 to 3 hours), (default:&#39;null&#39;)
     * @param highlight Hightlight Filter (possible values: &#39;false&#39; &#x3D; only Activities with Highlight false, &#39;true&#39; &#x3D; only Activities with Highlight true), (default:&#39;null&#39;)
     * @param difficultyfilter Difficulty Filter (possible values: &#39;1&#39; &#x3D; easy, &#39;2&#39; &#x3D; medium, &#39;3&#39; &#x3D; difficult), (default:&#39;null&#39;)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;ActivityPoiReduced&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ActivityPoiReduced> activityGetActivityReduced(String language, String activitytype, String subtype, String locfilter, String areafilter, String distancefilter, String altitudefilter, String durationfilter, String highlight, String difficultyfilter, String odhtagfilter, String active, String odhactive, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ActivityReduced").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "activitytype", activitytype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subtype", subtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "distancefilter", distancefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "altitudefilter", altitudefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "durationfilter", durationfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "highlight", highlight));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "difficultyfilter", difficultyfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhactive", odhactive));
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

        ParameterizedTypeReference<List<ActivityPoiReduced>> returnType = new ParameterizedTypeReference<List<ActivityPoiReduced>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Activity Single
     * 
     * <p><b>200</b> - Activity Object
     * @param id ID of the Activity
     * @return GBLTSActivity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GBLTSActivity activityGetActivitySingle(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling activityGetActivitySingle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Activity/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<GBLTSActivity> returnType = new ParameterizedTypeReference<GBLTSActivity>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Activity Single Localized
     * 
     * <p><b>200</b> - ActivityLocalized Object
     * @param id ID of the Activity
     * @param language Localization Language, (default:&#39;en&#39;)
     * @return GBLTSActivityPoiLocalized
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GBLTSActivityPoiLocalized activityGetActivitySingleLocalized(String id, String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling activityGetActivitySingleLocalized");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/ActivityLocalized/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<GBLTSActivityPoiLocalized> returnType = new ParameterizedTypeReference<GBLTSActivityPoiLocalized>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Activity Changed List by Date
     * 
     * <p><b>200</b> - Array of PoiBaseInfos Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0)
     * @param updatefrom Date from Format (yyyy-MM-dd) (all GBActivityPoi with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day)
     * @return List&lt;GBLTSActivity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GBLTSActivity> activityGetAllActivityChanged(Integer pagenumber, Integer pagesize, String seed, String updatefrom) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ActivityChanged").build().toUriString();
        
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

        ParameterizedTypeReference<List<GBLTSActivity>> returnType = new ParameterizedTypeReference<List<GBLTSActivity>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Activity Types List
     * 
     * <p><b>200</b> - Array of ActivityType Objects
     * @return List&lt;ActivityTypes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ActivityTypes> activityGetAllActivityTypesList() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ActivityTypes").build().toUriString();
        
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

        ParameterizedTypeReference<List<ActivityTypes>> returnType = new ParameterizedTypeReference<List<ActivityTypes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

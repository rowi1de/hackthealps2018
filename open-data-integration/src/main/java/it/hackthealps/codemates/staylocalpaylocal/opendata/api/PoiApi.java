package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ActivityPoiReduced;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GBLTSActivityPoiLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GBLTSPoi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.PoiResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.PoiTypes;

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
@Component("it.hackthealps.codemates.staylocalpaylocal.api.PoiApi")
public class PoiApi {
    private ApiClient apiClient;

    public PoiApi() {
        this(new ApiClient());
    }

    @Autowired
    public PoiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET Poi Types List
     * 
     * <p><b>200</b> - Array of PoiType Objects
     * @return List&lt;PoiTypes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PoiTypes> poiGetAllPoiTypesList() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/PoiTypes").build().toUriString();
        
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

        ParameterizedTypeReference<List<PoiTypes>> returnType = new ParameterizedTypeReference<List<PoiTypes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Poi Changed List by Date
     * 
     * <p><b>200</b> - Array of LTSPoi Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0)
     * @param updatefrom Date from Format (yyyy-MM-dd) (all GBActivityPoi with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day)
     * @return List&lt;GBLTSPoi&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiResult poiGetAllPoisChanged(Integer pagenumber, Integer pagesize, String seed, String updatefrom) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/PoiChanged").build().toUriString();
        
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

        ParameterizedTypeReference<PoiResult> returnType = new ParameterizedTypeReference<PoiResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Poi List
     * 
     * <p><b>200</b> - Array of LTSPoi Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param poitype Type of the Poi (possible values: STRINGS: &#39;Ärzte, Apotheken&#39;,&#39;Geschäfte&#39;,&#39;Kultur und Sehenswürdigkeiten&#39;,&#39;Nachtleben und Unterhaltung&#39;,&#39;Öffentliche Einrichtungen&#39;,&#39;Sport und Freizeit&#39;,&#39;Verkehr und Transport&#39;,&#39;Dienstleister&#39;,&#39;Kunsthandwerker&#39; : BITMASK also possible: &#39;Ärzte, Apotheken &#x3D; 1&#39;,&#39;Geschäfte &#x3D; 2&#39;,&#39;Kultur und Sehenswürdigkeiten &#x3D; 4&#39;,&#39;Nachtleben und Unterhaltung &#x3D; 8&#39;,&#39;Öffentliche Einrichtungen &#x3D; 16&#39;,&#39;Sport und Freizeit &#x3D; 32&#39;,&#39;Verkehr und Transport &#x3D; 64&#39;, &#39;Dienstleister&#39; &#x3D; 128, &#39;Kunsthandwerker&#39; &#x3D; 256), (default:&#39;511&#39;)
     * @param subtype Subtype of the Poi (&#39;null&#39; &#x3D; Filter disabled, available Subtypes depends on the activitytype BITMASK), (default:&#39;null&#39;)
     * @param idlist IDFilter (Separator &#39;,&#39; List of Activity IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param areafilter AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;, &#39;null&#39; : Filter disabled), (default:&#39;null&#39;)
     * @param highlight Highlight Filter (Show only Highlights possible values: &#39;true&#39; : show only Highlight Pois, &#39;null&#39; Filter disabled), (default:&#39;null&#39;)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities, (default:&#39;null&#39;)
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;GBLTSPoi&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiResult poiGetPoiFiltered(Integer pagenumber, Integer pagesize, String poitype, String subtype, String idlist, String locfilter, String areafilter, String highlight, String odhtagfilter, String active, String odhactive, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Poi").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "poitype", poitype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subtype", subtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "highlight", highlight));
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

        ParameterizedTypeReference<PoiResult> returnType = new ParameterizedTypeReference<PoiResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Poi Localized List
     * 
     * <p><b>200</b> - Array of LTSPoiLocalized Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param poitype Type of the Poi (possible values: STRINGS: &#39;Ärzte, Apotheken&#39;,&#39;Geschäfte&#39;,&#39;Kultur und Sehenswürdigkeiten&#39;,&#39;Nachtleben und Unterhaltung&#39;,&#39;Öffentliche Einrichtungen&#39;,&#39;Sport und Freizeit&#39;,&#39;Verkehr und Transport&#39;,&#39;Dienstleister&#39;,&#39;Kunsthandwerker&#39; : BITMASK also possible: &#39;Ärzte, Apotheken &#x3D; 1&#39;,&#39;Geschäfte &#x3D; 2&#39;,&#39;Kultur und Sehenswürdigkeiten &#x3D; 4&#39;,&#39;Nachtleben und Unterhaltung &#x3D; 8&#39;,&#39;Öffentliche Einrichtungen &#x3D; 16&#39;,&#39;Sport und Freizeit &#x3D; 32&#39;,&#39;Verkehr und Transport &#x3D; 64&#39;, &#39;Dienstleister&#39; &#x3D; 128, &#39;Kunsthandwerker&#39; &#x3D; 256), (default:&#39;511&#39;)
     * @param subtype Subtype of the Poi (&#39;null&#39; &#x3D; Filter disabled, available Subtypes depends on the activitytype BITMASK), (default:&#39;null&#39;)
     * @param idlist IDFilter (Separator &#39;,&#39; List of Activity IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param areafilter AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;, &#39;null&#39; : Filter disabled), (default:&#39;null&#39;)
     * @param highlight Highlight Filter (Show only Highlights possible values: &#39;true&#39; : show only Highlight Pois, &#39;null&#39; Filter disabled), (default:&#39;null&#39;)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities, (default:&#39;null&#39;)
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;GBLTSActivityPoiLocalized&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GBLTSActivityPoiLocalized> poiGetPoiLocalized(String language, Integer pagenumber, Integer pagesize, String poitype, String subtype, String idlist, String locfilter, String areafilter, String highlight, String odhtagfilter, String active, String odhactive, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/PoiLocalized").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "poitype", poitype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subtype", subtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "highlight", highlight));
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
     * GET Poi List Reduced
     * 
     * <p><b>200</b> - Array of Poi Reduced Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param poitype Type of the Poi (possible values: STRINGS: &#39;Ärzte, Apotheken&#39;,&#39;Geschäfte&#39;,&#39;Kultur und Sehenswürdigkeiten&#39;,&#39;Nachtleben und Unterhaltung&#39;,&#39;Öffentliche Einrichtungen&#39;,&#39;Sport und Freizeit&#39;,&#39;Verkehr und Transport&#39;,&#39;Dienstleister&#39;,&#39;Kunsthandwerker&#39; : BITMASK also possible: &#39;Ärzte, Apotheken &#x3D; 1&#39;,&#39;Geschäfte &#x3D; 2&#39;,&#39;Kultur und Sehenswürdigkeiten &#x3D; 4&#39;,&#39;Nachtleben und Unterhaltung &#x3D; 8&#39;,&#39;Öffentliche Einrichtungen &#x3D; 16&#39;,&#39;Sport und Freizeit &#x3D; 32&#39;,&#39;Verkehr und Transport &#x3D; 64&#39;, &#39;Dienstleister&#39; &#x3D; 128, &#39;Kunsthandwerker&#39; &#x3D; 256), (default:&#39;511&#39;)
     * @param subtype Subtype of the Activity (BITMASK Filter &#x3D; available SubTypes depends on the selected Activity Type), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param areafilter AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;)
     * @param highlight Hightlight Filter (possible values: &#39;false&#39; &#x3D; only Activities with Highlight false, &#39;true&#39; &#x3D; only Activities with Highlight true), (default:&#39;null&#39;)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;ActivityPoiReduced&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ActivityPoiReduced> poiGetPoiReduced(String language, String poitype, String subtype, String locfilter, String areafilter, String highlight, String odhtagfilter, String active, String odhactive, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/PoiReduced").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "poitype", poitype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subtype", subtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "highlight", highlight));
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
     * GET Poi Single
     * 
     * <p><b>200</b> - LTSPoi Object
     * @param id ID of the Poi
     * @return GBLTSPoi
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GBLTSPoi poiGetPoiSingle(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling poiGetPoiSingle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Poi/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<GBLTSPoi> returnType = new ParameterizedTypeReference<GBLTSPoi>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Poi Localized Single
     * 
     * <p><b>200</b> - LTSPoiLocalized Object
     * @param id ID of the Poi
     * @param language Localization Language, (default:&#39;en&#39;)
     * @return GBLTSActivityPoiLocalized
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GBLTSActivityPoiLocalized poiGetPoiSingleLocalized(String id, String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling poiGetPoiSingleLocalized");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/PoiLocalized/{id}").buildAndExpand(uriVariables).toUriString();
        
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
}

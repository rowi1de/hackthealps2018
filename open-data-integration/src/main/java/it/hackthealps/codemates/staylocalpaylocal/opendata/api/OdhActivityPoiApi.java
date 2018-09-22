package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ActivityPoiReduced;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ODHActivityPoi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ODHActivityPoiLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.SmgPoiTypes;

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
@Component("it.hackthealps.codemates.staylocalpaylocal.api.OdhActivityPoiApi")
public class OdhActivityPoiApi {
    private ApiClient apiClient;

    public OdhActivityPoiApi() {
        this(new ApiClient());
    }

    @Autowired
    public OdhActivityPoiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET ODHActivityPoi Changed List by Date
     * 
     * <p><b>200</b> - Array of ODHActivityPoi Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0)
     * @param updatefrom Date from Format (yyyy-MM-dd) (all ODHActivityPoi with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day)
     * @return List&lt;ODHActivityPoi&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ODHActivityPoi> oDHActivityPoiGetAllODHActivityPoiChanged(Integer pagenumber, Integer pagesize, String seed, String updatefrom) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ODHActivityPoiChanged").build().toUriString();
        
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

        ParameterizedTypeReference<List<ODHActivityPoi>> returnType = new ParameterizedTypeReference<List<ODHActivityPoi>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET ODHActivityPoi Types List
     * 
     * <p><b>200</b> - Array of ActivityPoiType Objects
     * @return List&lt;SmgPoiTypes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SmgPoiTypes> oDHActivityPoiGetAllODHActivityPoiTypesList() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ODHActivityPoiTypes").build().toUriString();
        
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

        ParameterizedTypeReference<List<SmgPoiTypes>> returnType = new ParameterizedTypeReference<List<SmgPoiTypes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET ODHActivityPoi List
     * 
     * <p><b>200</b> - Array of ODHActivityPoi Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param type Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, possible values: BITMASK: &#39;Wellness &#x3D; 1&#39;,&#39;Winter &#x3D; 2&#39;,&#39;Summer &#x3D; 4&#39;,&#39;Culture &#x3D; 8&#39;,&#39;Other &#x3D; 16&#39;,&#39;Gastronomy &#x3D; 32&#39;), (default: 63 &#x3D;&#x3D; ALL), ALSO POSSIBLE USE OF STRINGS: &#39;Wellness Entspannung&#39;,&#39;Winter&#39;,&#39;Sommer&#39;,&#39;Kultur Sehenswürdigkeiten&#39;,&#39;Anderes&#39;,&#39;Essen Trinken&#39;
     * @param subtype Subtype of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype reference to ODHActivityPoiTypes)
     * @param poitype Additional Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype, SubType reference to ODHActivityPoiTypes)
     * @param idlist IDFilter (Separator &#39;,&#39; List of ODHActivityPoi IDs), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param langfilter ODHActivityPoi Langfilter (returns only SmgPois available in the selected Language, Separator &#39;,&#39; possible values: &#39;de,it,en,nl,sc,pl,fr,ru&#39;, &#39;null&#39;: Filter disabled)
     * @param areafilter AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;)
     * @param highlight Hightlight Filter (possible values: &#39;false&#39; &#x3D; only ODHActivityPoi with Highlight false, &#39;true&#39; &#x3D; only ODHActivityPoi with Highlight true), (default:&#39;null&#39;)
     * @param source Source Filter (possible Values: &#39;null&#39; Displays all ODHActivityPoi, &#39;None&#39;, &#39;ActivityData&#39;, &#39;PoiData&#39;,&#39;GastronomicData&#39;,&#39;MuseumData&#39;,&#39;Magnolia&#39;,&#39;Content&#39;,&#39;VerticalLife&#39;,&#39;SuedtirolWein&#39;,&#39;Archapp&#39; (default:&#39;null&#39;)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/ODHTag&#39;), (default:&#39;null&#39;)
     * @param odhactive odhactive (Published) ODHActivityPoi Filter (possible Values: &#39;true&#39; only published ODHActivityPoi, &#39;false&#39; only not published ODHActivityPoi, (default:&#39;null&#39;)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;ODHActivityPoi&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ODHActivityPoi> oDHActivityPoiGetODHActivityPoiList(Integer pagenumber, Integer pagesize, String type, String subtype, String poitype, String idlist, String locfilter, String langfilter, String areafilter, String highlight, String source, String odhtagfilter, String odhactive, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ODHActivityPoi").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subtype", subtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "poitype", poitype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "langfilter", langfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "highlight", highlight));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
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

        ParameterizedTypeReference<List<ODHActivityPoi>> returnType = new ParameterizedTypeReference<List<ODHActivityPoi>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET ODHActivityPoi List Localized
     * 
     * <p><b>200</b> - Array of ODHActivityPoiLocalized Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param type Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, possible values: BITMASK: &#39;Wellness &#x3D; 1&#39;,&#39;Winter &#x3D; 2&#39;,&#39;Summer &#x3D; 4&#39;,&#39;Culture &#x3D; 8&#39;,&#39;Other &#x3D; 16&#39;,&#39;Gastronomy &#x3D; 32&#39;), (default: 63 &#x3D;&#x3D; ALL), ALSO POSSIBLE USE OF STRINGS: &#39;Wellness Entspannung&#39;,&#39;Winter&#39;,&#39;Sommer&#39;,&#39;Kultur Sehenswürdigkeiten&#39;,&#39;Anderes&#39;,&#39;Essen Trinken&#39;
     * @param subtype Subtype of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype reference to ODHActivityPoiTypes)
     * @param poitype Additional Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype, SubType reference to ODHActivityPoiTypes)
     * @param idlist IDFilter (Separator &#39;,&#39; List of ODHActivityPoi IDs), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param langfilter ODHActivityPoi Langfilter (returns only SmgPois available in the selected Language, Separator &#39;,&#39; possible values: &#39;de,it,en,nl,sc,pl,fr,ru&#39;, &#39;null&#39;: Filter disabled)
     * @param areafilter AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;)
     * @param highlight Hightlight Filter (possible values: &#39;false&#39; &#x3D; only ODHActivityPoi with Highlight false, &#39;true&#39; &#x3D; only ODHActivityPoi with Highlight true), (default:&#39;null&#39;)
     * @param source Source Filter (possible Values: &#39;null&#39; Displays all ODHActivityPoi, &#39;None&#39;, &#39;ActivityData&#39;, &#39;PoiData&#39;,&#39;GastronomicData&#39;,&#39;MuseumData&#39;,&#39;Magnolia&#39;,&#39;Content&#39;,&#39;VerticalLife&#39;,&#39;SuedtirolWein&#39;,&#39;Archapp&#39; (default:&#39;null&#39;)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/ODHTag&#39;), (default:&#39;null&#39;)
     * @param odhactive odhactive (Published) ODHActivityPoi Filter (possible Values: &#39;true&#39; only published ODHActivityPoi, &#39;false&#39; only not published ODHActivityPoi, (default:&#39;null&#39;)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;ODHActivityPoiLocalized&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ODHActivityPoiLocalized> oDHActivityPoiGetODHActivityPoiListLocalized(String language, Integer pagenumber, Integer pagesize, String type, String subtype, String poitype, String idlist, String locfilter, String langfilter, String areafilter, String highlight, String source, String odhtagfilter, String odhactive, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ODHActivityPoiLocalized").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subtype", subtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "poitype", poitype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "langfilter", langfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "highlight", highlight));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
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

        ParameterizedTypeReference<List<ODHActivityPoiLocalized>> returnType = new ParameterizedTypeReference<List<ODHActivityPoiLocalized>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET ODHActivityPoi List Reduced
     * 
     * <p><b>200</b> - Array of ODHActivityPoiReduced Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param type Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, possible values: BITMASK: &#39;Wellness &#x3D; 1&#39;,&#39;Winter &#x3D; 2&#39;,&#39;Summer &#x3D; 4&#39;,&#39;Culture &#x3D; 8&#39;,&#39;Other &#x3D; 16&#39;,&#39;Gastronomy &#x3D; 32&#39;), (default: 63 &#x3D;&#x3D; ALL), ALSO POSSIBLE USE OF STRINGS: &#39;Wellness Entspannung&#39;,&#39;Winter&#39;,&#39;Sommer&#39;,&#39;Kultur Sehenswürdigkeiten&#39;,&#39;Anderes&#39;,&#39;Essen Trinken&#39;
     * @param subtype Subtype of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype reference to ODHActivityPoiTypes)
     * @param poitype Additional Type of the ODHActivityPoi (&#39;null&#39; &#x3D; Filter disabled, BITMASK Filter, available SubTypes depends on the selected Maintype, SubType reference to ODHActivityPoiTypes)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param langfilter ODHActivityPoi Langfilter (returns only SmgPois available in the selected Language, Separator &#39;,&#39; possible values: &#39;de,it,en,nl,sc,pl,fr,ru&#39;, &#39;null&#39;: Filter disabled)
     * @param areafilter AreaFilter (Separator &#39;,&#39; IDList of AreaIDs separated by &#39;,&#39;), (default:&#39;null&#39;)
     * @param highlight Hightlight Filter (possible values: &#39;false&#39; &#x3D; only ODHActivityPoi with Highlight false, &#39;true&#39; &#x3D; only ODHActivityPoi with Highlight true), (default:&#39;null&#39;)
     * @param source Source Filter (possible Values: &#39;null&#39; Displays all ODHActivityPoi, &#39;None&#39;, &#39;ActivityData&#39;, &#39;PoiData&#39;,&#39;GastronomicData&#39;,&#39;MuseumData&#39;,&#39;Magnolia&#39;,&#39;Content&#39;,&#39;VerticalLife&#39;,&#39;SuedtirolWein&#39;,&#39;Archapp&#39; (default:&#39;null&#39;)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/ODHTag&#39;), (default:&#39;null&#39;)
     * @param odhactive odhactive (Published) ODHActivityPoi Filter (possible Values: &#39;true&#39; only published ODHActivityPoi, &#39;false&#39; only not published ODHActivityPoi, (default:&#39;null&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;ActivityPoiReduced&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ActivityPoiReduced> oDHActivityPoiGetODHActivityPoiListReduced(String language, String type, String subtype, String poitype, String locfilter, String langfilter, String areafilter, String highlight, String source, String odhtagfilter, String odhactive, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ODHActivityPoiReduced").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subtype", subtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "poitype", poitype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "langfilter", langfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "highlight", highlight));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
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
     * GET ODHActivityPoi Single
     * 
     * <p><b>200</b> - ODHActivityPoi Object
     * @param id ID of the Poi
     * @return ODHActivityPoi
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ODHActivityPoi oDHActivityPoiGetODHActivityPoiSingle(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling oDHActivityPoiGetODHActivityPoiSingle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/ODHActivityPoi/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ODHActivityPoi> returnType = new ParameterizedTypeReference<ODHActivityPoi>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET ODHActivityPoi Single Reduced
     * 
     * <p><b>200</b> - ODHActivityPoiLocalized Object
     * @param id ID of the Poi
     * @param language Localization Language, (default:&#39;en&#39;)
     * @return ODHActivityPoiLocalized
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ODHActivityPoiLocalized oDHActivityPoiGetODHActivityPoiSingleLocalized(String id, String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling oDHActivityPoiGetODHActivityPoiSingleLocalized");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/ODHActivityPoiLocalized/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ODHActivityPoiLocalized> returnType = new ParameterizedTypeReference<ODHActivityPoiLocalized>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

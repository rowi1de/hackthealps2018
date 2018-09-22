package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Event;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventReduced;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventTypes;

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
@Component("it.hackthealps.codemates.staylocalpaylocal.api.EventApi")
public class EventApi {
    private ApiClient apiClient;

    public EventApi() {
        this(new ApiClient());
    }

    @Autowired
    public EventApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET Event Topic List
     * 
     * <p><b>200</b> - Array of PoiType Objects
     * @return List&lt;EventTypes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EventTypes> eventGetAllEventTopicList() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/EventTopics").build().toUriString();
        
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

        ParameterizedTypeReference<List<EventTypes>> returnType = new ParameterizedTypeReference<List<EventTypes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Event Changed List by Date
     * 
     * <p><b>200</b> - Array of Event Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0)
     * @param updatefrom Date from Format (yyyy-MM-dd) (all Event with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day)
     * @return List&lt;Event&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Event> eventGetAllEventsChanged(Integer pagenumber, Integer pagesize, String seed, String updatefrom) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/EventChanged").build().toUriString();
        
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

        ParameterizedTypeReference<List<Event>> returnType = new ParameterizedTypeReference<List<Event>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Event Localized Single
     * 
     * <p><b>200</b> - EventLocalized Object
     * @param id ID of the Event
     * @param language Localization Language, (default:&#39;en&#39;)
     * @return EventLocalized
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventLocalized eventGetEventLocalizedSingle(String id, String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling eventGetEventLocalizedSingle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/EventLocalized/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<EventLocalized> returnType = new ParameterizedTypeReference<EventLocalized>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Event Single
     * 
     * <p><b>200</b> - Event Object
     * @param id ID of the Event
     * @return Event
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Event eventGetEventSingle(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling eventGetEventSingle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Event/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Event> returnType = new ParameterizedTypeReference<Event>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Event List
     * 
     * <p><b>200</b> - Array of Event Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param idlist IDFilter (Separator &#39;,&#39; List of Activity IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param rancfilter Rancfilter (Ranc 0-5 possible)
     * @param typefilter Typefilter (Type of Event: not used yet)
     * @param topicfilter Topic ID Filter (Filter by Topic ID) BITMASK
     * @param orgfilter Organization Filter (Filter by Organizer RID)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param active Active Events Filter (possible Values: &#39;true&#39; only Active Events, &#39;false&#39; only Disabled Events, (default:&#39;null&#39;)
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param begindate BeginDate of Events (Format: yyyy-MM-dd)
     * @param enddate EndDate of Events (Format: yyyy-MM-dd)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;Event&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Event> eventGetEvents(Integer pagenumber, Integer pagesize, String idlist, String locfilter, String rancfilter, String typefilter, String topicfilter, String orgfilter, String odhtagfilter, String active, String odhactive, String begindate, String enddate, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Event").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "rancfilter", rancfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "typefilter", typefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "topicfilter", topicfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orgfilter", orgfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhactive", odhactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "begindate", begindate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enddate", enddate));
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

        ParameterizedTypeReference<List<Event>> returnType = new ParameterizedTypeReference<List<Event>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Event Localized List
     * 
     * <p><b>200</b> - Array of EventLocalized Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param idlist IDFilter (Separator &#39;,&#39; List of Activity IDs, &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param rancfilter Rancfilter (Ranc 0-5 possible)
     * @param typefilter Typefilter (Type of Event: not used yet)
     * @param topicfilter Topic ID Filter (Filter by Topic ID) BITMASK
     * @param orgfilter Organization Filter (Filter by Organizer RID)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param active Active Events Filter (possible Values: &#39;true&#39; only Active Events, &#39;false&#39; only Disabled Events, (default:&#39;null&#39;)
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param begindate BeginDate of Events (Format: yyyy-MM-dd)
     * @param enddate EndDate of Events (Format: yyyy-MM-dd)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;EventLocalized&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EventLocalized> eventGetEventsLocalized(String language, Integer pagenumber, Integer pagesize, String idlist, String locfilter, String rancfilter, String typefilter, String topicfilter, String orgfilter, String odhtagfilter, String active, String odhactive, String begindate, String enddate, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/EventLocalized").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "rancfilter", rancfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "typefilter", typefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "topicfilter", topicfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orgfilter", orgfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhactive", odhactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "begindate", begindate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enddate", enddate));
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

        ParameterizedTypeReference<List<EventLocalized>> returnType = new ParameterizedTypeReference<List<EventLocalized>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Event List Reduced
     * 
     * <p><b>200</b> - Array of EventReduced Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter), (default:&#39;null&#39;)
     * @param rancfilter Rancfilter (Ranc 0-5 possible)
     * @param typefilter Typefilter (Type of Event: not used yet)
     * @param topicfilter Topic ID Filter (Filter by Topic ID) BITMASK
     * @param orgfilter Organization Filter (Filter by Organizer RID)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param active Active Events Filter (possible Values: &#39;true&#39; only Active Events, &#39;false&#39; only Disabled Events, (default:&#39;null&#39;)
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;), (default:&#39;null&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;EventReduced&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EventReduced> eventGetEventsReduced(String language, String locfilter, String rancfilter, String typefilter, String topicfilter, String orgfilter, String odhtagfilter, String active, String odhactive, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/EventReduced").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "rancfilter", rancfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "typefilter", typefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "topicfilter", topicfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orgfilter", orgfilter));
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

        ParameterizedTypeReference<List<EventReduced>> returnType = new ParameterizedTypeReference<List<EventReduced>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventShort;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventShortByRoom;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventShortReduced;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ResultEventShort;

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
@Component("EventShortApi")
public class EventShortApi {
    private ApiClient apiClient;

    public EventShortApi() {
        this(new ApiClient());
    }

    @Autowired
    public EventShortApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET EventShort List
     * 
     * <p><b>200</b> - Result Object with EventShort List
     * @param pagenumber Pagenumber (Integer)
     * @param pagesize Pagesize (Integer, max 0124)
     * @param startdate Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
     * @param enddate Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
     * @param datetimeformat not provided, use default format, for unix timestamp pass \&quot;uxtimestamp\&quot;
     * @param source Source of the data, (possible values &#39;Content&#39; or &#39;EBMS&#39;)
     * @param eventlocation Event Location, (possible values, &#39;NOI&#39; or &#39;EC&#39;)
     * @param onlyactive &#39;true&#39; if only Events marked as Active by Eurac should be displayed
     * @param eventids comma separated list of event ids
     * @return ResultEventShort
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultEventShort eventShortGet(Integer pagenumber, Integer pagesize, String startdate, String enddate, String datetimeformat, String source, String eventlocation, String onlyactive, String eventids) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/EventShort").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startdate", startdate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enddate", enddate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datetimeformat", datetimeformat));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventlocation", eventlocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyactive", onlyactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventids", eventids));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ResultEventShort> returnType = new ParameterizedTypeReference<ResultEventShort>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET EventShort Reduced List
     * 
     * <p><b>200</b> - List of EventShortReduced Objects
     * @param language Localization Language
     * @param startdate Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
     * @param enddate Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
     * @param datetimeformat not provided, use default format, for unix timestamp pass \&quot;uxtimestamp\&quot;
     * @param source Source of the data, (possible values &#39;Content&#39; or &#39;EBMS&#39;)
     * @param eventlocation Event Location, (possible values, &#39;NOI&#39; or &#39;EC&#39;)
     * @param onlyactive &#39;true&#39; if only Events marked as Active by Eurac should be displayed
     * @return List&lt;EventShortReduced&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EventShortReduced> eventShortGetReducedAsync(String language, String startdate, String enddate, String datetimeformat, String source, String eventlocation, String onlyactive) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'language' when calling eventShortGetReducedAsync");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/EventShort/Reduced").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startdate", startdate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enddate", enddate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datetimeformat", datetimeformat));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventlocation", eventlocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyactive", onlyactive));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<EventShortReduced>> returnType = new ParameterizedTypeReference<List<EventShortReduced>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET EventShort Single
     * 
     * <p><b>200</b> - EventShort Object
     * @param id Id of the Event
     * @return List&lt;EventShort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EventShort> eventShortGet_0(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling eventShortGet_0");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/EventShort/Detail/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<EventShort>> returnType = new ParameterizedTypeReference<List<EventShort>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET EventShort List by Room Occupation
     * 
     * <p><b>200</b> - List of EventShortByRoom Objects
     * @param startdate Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
     * @param enddate Format (yyyy-MM-dd HH:mm) default or Unix Timestamp
     * @param datetimeformat not provided, use default format, for unix timestamp pass \&quot;uxtimestamp\&quot;
     * @param source Source of the data, (possible values &#39;Content&#39; or &#39;EBMS&#39;)
     * @param eventlocation Event Location, (possible values, &#39;NOI&#39; or &#39;EC&#39;)
     * @param onlyactive &#39;true&#39; if only Events marked as Active by Eurac should be displayed
     * @param eventids comma separated list of event ids
     * @return List&lt;EventShortByRoom&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EventShortByRoom> eventShortGetbyRoomBooked(String startdate, String enddate, String datetimeformat, String source, String eventlocation, String onlyactive, String eventids) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/EventShort/GetbyRoomBooked").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startdate", startdate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enddate", enddate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datetimeformat", datetimeformat));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventlocation", eventlocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyactive", onlyactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventids", eventids));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<EventShortByRoom>> returnType = new ParameterizedTypeReference<List<EventShortByRoom>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

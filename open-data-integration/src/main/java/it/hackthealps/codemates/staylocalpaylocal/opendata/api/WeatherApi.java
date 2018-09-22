package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.BezirksWeather;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Measuringpoint;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.SnowReportBaseData;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Weather;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.WeatherRealTime;

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
@Component("it.hackthealps.codemates.staylocalpaylocal.api.WeatherApi")
public class WeatherApi {
    private ApiClient apiClient;

    public WeatherApi() {
        this(new ApiClient());
    }

    @Autowired
    public WeatherApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET District Weather LIVE
     * 
     * <p><b>200</b> - BezirksWeather
     * @param language Language
     * @param locfilter Locfilter (possible values: tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;null&#39; &#x3D; No Filter)
     * @return BezirksWeather
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BezirksWeather weatherGetDistrictWeather(String language, String locfilter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'language' when calling weatherGetDistrictWeather");
        }
        
        // verify the required parameter 'locfilter' is set
        if (locfilter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locfilter' when calling weatherGetDistrictWeather");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Weather/District").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<BezirksWeather> returnType = new ParameterizedTypeReference<BezirksWeather>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Measuringpoint SINGLE
     * 
     * <p><b>200</b> - Measuringpoint
     * @param id Measuringpoint ID
     * @return Measuringpoint
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Measuringpoint weatherGetMeasuringPoint(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling weatherGetMeasuringPoint");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Weather/Measuringpoint/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Measuringpoint> returnType = new ParameterizedTypeReference<Measuringpoint>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Measuringpoint LIST
     * 
     * <p><b>200</b> - List of Mesuringpoints
     * @param elements Elements to retrieve
     * @param areafilter Area ID (multiple IDs possible, separated by \&quot;,\&quot;)
     * @param skiareafilter Skiarea ID
     * @return List&lt;Measuringpoint&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Measuringpoint> weatherGetMeasuringPoints(Integer elements, String areafilter, String skiareafilter) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Weather/Measuringpoint").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "elements", elements));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "areafilter", areafilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skiareafilter", skiareafilter));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Measuringpoint>> returnType = new ParameterizedTypeReference<List<Measuringpoint>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Current Realtime Weather LIVE
     * 
     * <p><b>200</b> - WeatherRealTime
     * @param language Language
     * @return WeatherRealTime
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WeatherRealTime weatherGetRealtimeWeather(String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'language' when calling weatherGetRealtimeWeather");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Weather/Realtime").build().toUriString();
        
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

        ParameterizedTypeReference<WeatherRealTime> returnType = new ParameterizedTypeReference<WeatherRealTime>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Snowreport Data LIVE
     * 
     * <p><b>200</b> - SnowReportBaseData
     * @param lang Language
     * @param skiareaid Skiarea ID
     * @return SnowReportBaseData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SnowReportBaseData weatherGetSnowReportBase(String lang, String skiareaid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lang' when calling weatherGetSnowReportBase");
        }
        
        // verify the required parameter 'skiareaid' is set
        if (skiareaid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'skiareaid' when calling weatherGetSnowReportBase");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Weather/SnowReport").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skiareaid", skiareaid));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SnowReportBaseData> returnType = new ParameterizedTypeReference<SnowReportBaseData>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Current Suedtirol Weather LIVE
     * 
     * <p><b>200</b> - Weather
     * @param language Language
     * @param locfilter Locfilter (possible values: reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction), &#39;&#39; &#x3D; No Filter). IF a Locfilter is set, only Stationdata is provided.
     * @return Weather
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Weather weatherGetWeather(String language, String locfilter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'language' when calling weatherGetWeather");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Weather").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Weather> returnType = new ParameterizedTypeReference<Weather>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.SmgTagReduced;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.SmgTags;

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
@Component("it.hackthealps.codemates.staylocalpaylocal.api.OdhTagApi")
public class OdhTagApi {
    private ApiClient apiClient;

    public OdhTagApi() {
        this(new ApiClient());
    }

    @Autowired
    public OdhTagApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET ODHTag Single
     * 
     * <p><b>200</b> - SmgTag Object
     * @param id 
     * @param localizationlanguage 
     * @return SmgTags
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SmgTags oDHTagGetODHTagSingle(String id, String localizationlanguage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling oDHTagGetODHTagSingle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/ODHTag/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "localizationlanguage", localizationlanguage));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SmgTags> returnType = new ParameterizedTypeReference<SmgTags>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET ODHTag List
     * 
     * <p><b>200</b> - Array of SmgTags Objects
     * @param localizationlanguage 
     * @param validforentity Filter on Tags valid on Entitys (accommodation, activity, poi, smgpoi, package, gastronomy, event, article, common .. etc..)
     * @return List&lt;SmgTags&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SmgTags> oDHTagGetODHTags(String localizationlanguage, String validforentity) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/ODHTag").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "localizationlanguage", localizationlanguage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "validforentity", validforentity));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<SmgTags>> returnType = new ParameterizedTypeReference<List<SmgTags>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET ODHTag List REDUCED
     * 
     * <p><b>200</b> - Array of SmgTagReduced Objects
     * @param localizationlanguage 
     * @param validforentity 
     * @return List&lt;SmgTagReduced&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SmgTagReduced> oDHTagGetODHTagsReduced(String localizationlanguage, String validforentity) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'localizationlanguage' is set
        if (localizationlanguage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'localizationlanguage' when calling oDHTagGetODHTagsReduced");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/ODHTagReduced").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "localizationlanguage", localizationlanguage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "validforentity", validforentity));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<SmgTagReduced>> returnType = new ParameterizedTypeReference<List<SmgTagReduced>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T03:00:41.182+02:00")
@Component("it.hackthealps.codemates.staylocalpaylocal.api.ArticleApi")
public class ArticleApi {
    private ApiClient apiClient;

    public ArticleApi() {
        this(new ApiClient());
    }

    @Autowired
    public ArticleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET Activity List
     * 
     * <p><b>200</b> - Array of Article Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param articletype Type of the Article (possible values: &#39;basisartikel&#39;,&#39;buchtippartikel&#39;,&#39;contentartikel&#39;,&#39;veranstaltungsartikel&#39;,&#39;presseartikel&#39;,&#39;rezeptartikel&#39;,&#39;reiseveranstalter&#39;,&#39;b2bartikel&#39;, &#39;null&#39; &#x3D; Filter disabled)
     * @param articlesubtype Sub Type of the Article (depends on the Maintype of the Article &#39;null&#39; &#x3D; Filter disabled)
     * @param idlist IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;)
     * @param langfilter Language Filter (Gets only Articles Available in the passed Language)
     * @param sortbyarticledate Sort By Articledate (&#39;true&#39; sorts Articles by Articledate)
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @return List&lt;Article&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Article> articleGetArticleList(Integer pagenumber, Integer pagesize, String articletype, String articlesubtype, String idlist, String langfilter, String sortbyarticledate, String odhtagfilter, String active, String odhactive, String seed) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Article").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "articletype", articletype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "articlesubtype", articlesubtype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "langfilter", langfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortbyarticledate", sortbyarticledate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhtagfilter", odhtagfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "odhactive", odhactive));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seed", seed));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Article>> returnType = new ParameterizedTypeReference<List<Article>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

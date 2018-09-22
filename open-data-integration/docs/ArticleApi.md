# ArticleApi

All URIs are relative to *http://tourism.opendatahub.bz.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**articleGetArticleList**](ArticleApi.md#articleGetArticleList) | **GET** /api/Article | GET Activity List


<a name="articleGetArticleList"></a>
# **articleGetArticleList**
> List&lt;Article&gt; articleGetArticleList(pagenumber, pagesize, articletype, articlesubtype, idlist, langfilter, sortbyarticledate, odhtagfilter, active, odhactive, seed)

GET Activity List

### Example
```java
// Import classes:
//import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiException;
//import it.hackthealps.codemates.staylocalpaylocal.api.ArticleApi;


ArticleApi apiInstance = new ArticleApi();
Integer pagenumber = 56; // Integer | Pagenumber, (default:1)
Integer pagesize = 56; // Integer | Elements per Page (max 1024), (default:10)
String articletype = "articletype_example"; // String | Type of the Article (possible values: 'basisartikel','buchtippartikel','contentartikel','veranstaltungsartikel','presseartikel','rezeptartikel','reiseveranstalter','b2bartikel', 'null' = Filter disabled)
String articlesubtype = "articlesubtype_example"; // String | Sub Type of the Article (depends on the Maintype of the Article 'null' = Filter disabled)
String idlist = "idlist_example"; // String | IDFilter (Separator ',' List of Activity IDs), (default:'null')
String langfilter = "langfilter_example"; // String | Language Filter (Gets only Articles Available in the passed Language)
String sortbyarticledate = "sortbyarticledate_example"; // String | Sort By Articledate ('true' sorts Articles by Articledate)
String odhtagfilter = "odhtagfilter_example"; // String | Taglist Filter (String, Separator ',' more Tags possible, available Tags reference to 'api/SmgTag/ByMainEntity/Activity'), (default:'null')
String active = "active_example"; // String | Active Activities Filter (possible Values: 'true' only Active Activities, 'false' only Disabled Activities
String odhactive = "odhactive_example"; // String | odhactive (Published) Activities Filter (possible Values: 'true' only published Activities, 'false' only not published Activities, (default:'null')
String seed = "seed_example"; // String | Seed '1 - 10' for Random Sorting, '0' generates a Random Seed, not provided disables Random Sorting, (default:'0')
try {
    List<Article> result = apiInstance.articleGetArticleList(pagenumber, pagesize, articletype, articlesubtype, idlist, langfilter, sortbyarticledate, odhtagfilter, active, odhactive, seed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticleApi#articleGetArticleList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagenumber** | **Integer**| Pagenumber, (default:1) | [optional]
 **pagesize** | **Integer**| Elements per Page (max 1024), (default:10) | [optional]
 **articletype** | **String**| Type of the Article (possible values: &#39;basisartikel&#39;,&#39;buchtippartikel&#39;,&#39;contentartikel&#39;,&#39;veranstaltungsartikel&#39;,&#39;presseartikel&#39;,&#39;rezeptartikel&#39;,&#39;reiseveranstalter&#39;,&#39;b2bartikel&#39;, &#39;null&#39; &#x3D; Filter disabled) | [optional]
 **articlesubtype** | **String**| Sub Type of the Article (depends on the Maintype of the Article &#39;null&#39; &#x3D; Filter disabled) | [optional]
 **idlist** | **String**| IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;) | [optional]
 **langfilter** | **String**| Language Filter (Gets only Articles Available in the passed Language) | [optional]
 **sortbyarticledate** | **String**| Sort By Articledate (&#39;true&#39; sorts Articles by Articledate) | [optional]
 **odhtagfilter** | **String**| Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;) | [optional]
 **active** | **String**| Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities | [optional]
 **odhactive** | **String**| odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;) | [optional]
 **seed** | **String**| Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;) | [optional]

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


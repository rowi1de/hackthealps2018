package it.hackthealps.codemates.staylocalpaylocal.opendata.api;

import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Gastronomy;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyLocalized;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyReduced;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyTypes;

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
@Component("it.hackthealps.codemates.staylocalpaylocal.api.GastronomyApi")
public class GastronomyApi {
    private ApiClient apiClient;

    public GastronomyApi() {
        this(new ApiClient());
    }

    @Autowired
    public GastronomyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GET Gastronomy Changed List by Date
     * 
     * <p><b>200</b> - Array of Gastronomy Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, &#39;null&#39; disables Random Sorting, (default:0)
     * @param updatefrom Date from Format (yyyy-MM-dd) (all Gastronomy with LastChange &amp;gt;&#x3D; datefrom are passed), (default: DateTime.Now - 1 Day)
     * @return List&lt;Gastronomy&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GastronomyResult gastronomyGetAllGastronomyChanged(Integer pagenumber, Integer pagesize, String seed, String updatefrom) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/GastronomyChanged").build().toUriString();
        
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

        ParameterizedTypeReference<GastronomyResult> returnType = new ParameterizedTypeReference<GastronomyResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Gastronomy Types List
     * 
     * <p><b>200</b> - Array of GastronomyTypes Objects
     * @return List&lt;GastronomyTypes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GastronomyTypes> gastronomyGetAllGastronomyTypesList() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/GastronomyTypes").build().toUriString();
        
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

        ParameterizedTypeReference<List<GastronomyTypes>> returnType = new ParameterizedTypeReference<List<GastronomyTypes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Gastronomy List
     * 
     * <p><b>200</b> - Array of Gastronomy Objects
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param idlist IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param dishcodefilter Dish Code Filter (BITMASK values: 1 &#x3D; (Speisen), 2 &#x3D; (Vorspeise), 4 &#x3D; (Hauptspeise), 8 &#x3D; (Nachspeise), 16 &#x3D; (Tagesgericht), 32 &#x3D; (Menü), 64 &#x3D; (Degustationsmenü), 128 &#x3D; (Kindermenüs), 256 &#x3D; (Mittagsmenüs)
     * @param ceremonycodefilter Ceremony Code Filter (BITMASK  values: 1 &#x3D; (Familienfeiern), 2 &#x3D; (Hochzeiten), 4 &#x3D; (Geburtstagsfeiern), 8 &#x3D; (Firmenessen), 16 &#x3D; (Weihnachtsessen), 32 &#x3D; (Sylvestermenü), 64 &#x3D; (Seminare / Tagungen), 128 &#x3D; (Versammlungen)
     * @param categorycodefilter Category Code Filter (BITMASK  values: 1 &#x3D; (Restaurant), 2 &#x3D; (Bar / Café / Bistro), 4 &#x3D; (Pub / Disco), 8 &#x3D; (Apres Ski), 16 &#x3D; (Jausenstation), 32 &#x3D; (Pizzeria), 64 &#x3D; (Bäuerlicher Schankbetrieb), 128 &#x3D; (Buschenschank), 256 &#x3D; (Hofschank), 512 &#x3D; (Törggele Lokale), 1024 &#x3D; (Schnellimbiss), 2048 &#x3D; (Mensa), 4096 &#x3D; (Vinothek /Weinhaus / Taverne), 8192 &#x3D; (Eisdiele), 16348 &#x3D; (Gasthaus), 32768 &#x3D; (Gasthof), 65536 &#x3D; (Braugarten), 131072 &#x3D; (Schutzhütte), 262144 &#x3D; (Alm), 524288 &#x3D; (Skihütte)
     * @param facilitycodefilter Facility Code Filter (BITMASK  values: 1 &#x3D; (American Express), 2 &#x3D; (Diners Club), 4 &#x3D; (Eurocard / Mastercard), 8 &#x3D; (Visa), 16 &#x3D; (Hunde erlaubt), 32 &#x3D; (Geeignet für Busse), 64 &#x3D; (Garten), 128 &#x3D; (Garagen), 256 &#x3D; (Bierbar), 512 &#x3D; (Kinderspielplatz), 1024 &#x3D; (Spielzimmer), 2048 &#x3D; (Spielplatz), 4096 &#x3D; (Parkplätze), 8192 &#x3D; (Raucherräume), 16348 &#x3D; (Terrasse), 32768 &#x3D; (Behindertengerecht), 65536 &#x3D; (Biergarten), 131072 &#x3D; (Aussichtsterrasse), 262144 &#x3D; (Wintergarten), 524288 &#x3D; (Gault Millau Südtirol), 1048576 &#x3D; (Guida Espresso), 2097152 &#x3D; (Gambero Rosso), 4194304 &#x3D; (Feinschmecker), 8388608 &#x3D; (Aral Schlemmer Atlas), 16777216 &#x3D; (Varta Führer), 33554432 &#x3D; (Bertelsmann), 67108864 &#x3D; (Preis für Südtiroler Weinkultur), 134217728 &#x3D; (Michelin), 268435456 &#x3D; (Roter Hahn), 536870912 &#x3D; (Tafelspitz))
     * @param cuisinecodefilter Cuisine Code Filter (BITMASK  values: 1 &#x3D; (Vegetarische Küche), 2 &#x3D; (Glutenfreie Küche), 4 &#x3D; (Laktosefreie Kost), 8 &#x3D; (Warme Küche), 16 &#x3D; (Südtiroler Spezialitäten), 32 &#x3D; (Gourmet Küche), 64 &#x3D; (Italienische Küche), 128 &#x3D; (Internationale Küche), 256 &#x3D; (Pizza), 512 &#x3D; (Fischspezialitäten), 1024 &#x3D; (Asiatische Küche), 2048 &#x3D; (Wildspezialitäten), 4096 &#x3D; (Produkte eigener Erzeugung), 8192 &#x3D; (Diätküche), 16348 &#x3D; (Grillspezialitäten), 32768 &#x3D; (Ladinische Küche), 65536 &#x3D; (Kleine Karte), 131072 &#x3D; (Fischwochen), 262144 &#x3D; (Spargelwochen), 524288 &#x3D; (Lammwochen), 1048576 &#x3D; (Wildwochen), 2097152 &#x3D; (Vorspeisewochen), 4194304 &#x3D; (Nudelwochen), 8388608 &#x3D; (Kräuterwochen), 16777216 &#x3D; (Kindermenüs), 33554432 &#x3D; (Mittagsmenüs))
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;Gastronomy&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GastronomyResult gastronomyGetGastronomyList(Integer pagenumber, Integer pagesize, String idlist, String locfilter, String dishcodefilter, String ceremonycodefilter, String categorycodefilter, String facilitycodefilter, String cuisinecodefilter, String odhtagfilter, String active, String odhactive, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Gastronomy").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dishcodefilter", dishcodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ceremonycodefilter", ceremonycodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "categorycodefilter", categorycodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "facilitycodefilter", facilitycodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cuisinecodefilter", cuisinecodefilter));
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

        ParameterizedTypeReference<GastronomyResult> returnType = new ParameterizedTypeReference<GastronomyResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Gastronomy Localized List
     * 
     * <p><b>200</b> - Array of GastronomyLocalized Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param pagenumber Pagenumber, (default:1)
     * @param pagesize Elements per Page (max 1024), (default:10)
     * @param idlist IDFilter (Separator &#39;,&#39; List of Activity IDs), (default:&#39;null&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param dishcodefilter Dish Code Filter (BITMASK values: 1 &#x3D; (Speisen), 2 &#x3D; (Vorspeise), 4 &#x3D; (Hauptspeise), 8 &#x3D; (Nachspeise), 16 &#x3D; (Tagesgericht), 32 &#x3D; (Menü), 64 &#x3D; (Degustationsmenü), 128 &#x3D; (Kindermenüs), 256 &#x3D; (Mittagsmenüs)
     * @param ceremonycodefilter Ceremony Code Filter (BITMASK  values: 1 &#x3D; (Familienfeiern), 2 &#x3D; (Hochzeiten), 4 &#x3D; (Geburtstagsfeiern), 8 &#x3D; (Firmenessen), 16 &#x3D; (Weihnachtsessen), 32 &#x3D; (Sylvestermenü), 64 &#x3D; (Seminare / Tagungen), 128 &#x3D; (Versammlungen)
     * @param categorycodefilter Category Code Filter (BITMASK  values: 1 &#x3D; (Restaurant), 2 &#x3D; (Bar / Café / Bistro), 4 &#x3D; (Pub / Disco), 8 &#x3D; (Apres Ski), 16 &#x3D; (Jausenstation), 32 &#x3D; (Pizzeria), 64 &#x3D; (Bäuerlicher Schankbetrieb), 128 &#x3D; (Buschenschank), 256 &#x3D; (Hofschank), 512 &#x3D; (Törggele Lokale), 1024 &#x3D; (Schnellimbiss), 2048 &#x3D; (Mensa), 4096 &#x3D; (Vinothek /Weinhaus / Taverne), 8192 &#x3D; (Eisdiele), 16348 &#x3D; (Gasthaus), 32768 &#x3D; (Gasthof), 65536 &#x3D; (Braugarten), 131072 &#x3D; (Schutzhütte), 262144 &#x3D; (Alm), 524288 &#x3D; (Skihütte)
     * @param facilitycodefilter Facility Code Filter (BITMASK  values: 1 &#x3D; (American Express), 2 &#x3D; (Diners Club), 4 &#x3D; (Eurocard / Mastercard), 8 &#x3D; (Visa), 16 &#x3D; (Hunde erlaubt), 32 &#x3D; (Geeignet für Busse), 64 &#x3D; (Garten), 128 &#x3D; (Garagen), 256 &#x3D; (Bierbar), 512 &#x3D; (Kinderspielplatz), 1024 &#x3D; (Spielzimmer), 2048 &#x3D; (Spielplatz), 4096 &#x3D; (Parkplätze), 8192 &#x3D; (Raucherräume), 16348 &#x3D; (Terrasse), 32768 &#x3D; (Behindertengerecht), 65536 &#x3D; (Biergarten), 131072 &#x3D; (Aussichtsterrasse), 262144 &#x3D; (Wintergarten), 524288 &#x3D; (Gault Millau Südtirol), 1048576 &#x3D; (Guida Espresso), 2097152 &#x3D; (Gambero Rosso), 4194304 &#x3D; (Feinschmecker), 8388608 &#x3D; (Aral Schlemmer Atlas), 16777216 &#x3D; (Varta Führer), 33554432 &#x3D; (Bertelsmann), 67108864 &#x3D; (Preis für Südtiroler Weinkultur), 134217728 &#x3D; (Michelin), 268435456 &#x3D; (Roter Hahn), 536870912 &#x3D; (Tafelspitz))
     * @param cuisinecodefilter Cuisine Code Filter (BITMASK  values: 1 &#x3D; (Vegetarische Küche), 2 &#x3D; (Glutenfreie Küche), 4 &#x3D; (Laktosefreie Kost), 8 &#x3D; (Warme Küche), 16 &#x3D; (Südtiroler Spezialitäten), 32 &#x3D; (Gourmet Küche), 64 &#x3D; (Italienische Küche), 128 &#x3D; (Internationale Küche), 256 &#x3D; (Pizza), 512 &#x3D; (Fischspezialitäten), 1024 &#x3D; (Asiatische Küche), 2048 &#x3D; (Wildspezialitäten), 4096 &#x3D; (Produkte eigener Erzeugung), 8192 &#x3D; (Diätküche), 16348 &#x3D; (Grillspezialitäten), 32768 &#x3D; (Ladinische Küche), 65536 &#x3D; (Kleine Karte), 131072 &#x3D; (Fischwochen), 262144 &#x3D; (Spargelwochen), 524288 &#x3D; (Lammwochen), 1048576 &#x3D; (Wildwochen), 2097152 &#x3D; (Vorspeisewochen), 4194304 &#x3D; (Nudelwochen), 8388608 &#x3D; (Kräuterwochen), 16777216 &#x3D; (Kindermenüs), 33554432 &#x3D; (Mittagsmenüs))
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;)
     * @param seed Seed &#39;1 - 10&#39; for Random Sorting, &#39;0&#39; generates a Random Seed, not provided disables Random Sorting, (default:&#39;0&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;GastronomyLocalized&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GastronomyLocalized> gastronomyGetGastronomyListLocalized(String language, Integer pagenumber, Integer pagesize, String idlist, String locfilter, String dishcodefilter, String ceremonycodefilter, String categorycodefilter, String facilitycodefilter, String cuisinecodefilter, String odhtagfilter, String active, String odhactive, String seed, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/GastronomyLocalized").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagenumber", pagenumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagesize", pagesize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idlist", idlist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dishcodefilter", dishcodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ceremonycodefilter", ceremonycodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "categorycodefilter", categorycodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "facilitycodefilter", facilitycodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cuisinecodefilter", cuisinecodefilter));
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

        ParameterizedTypeReference<List<GastronomyLocalized>> returnType = new ParameterizedTypeReference<List<GastronomyLocalized>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Gastronomy Reduced List
     * 
     * <p><b>200</b> - Array of GastronomyReduced Objects
     * @param language Localization Language, (default:&#39;en&#39;)
     * @param locfilter Locfilter (Separator &#39;,&#39; possible values: reg + REGIONID &#x3D; (Filter by Region), reg + REGIONID &#x3D; (Filter by Region), tvs + TOURISMVEREINID &#x3D; (Filter by Tourismverein), mun + MUNICIPALITYID &#x3D; (Filter by Municipality), fra + FRACTIONID &#x3D; (Filter by Fraction)), (default:&#39;null&#39;)
     * @param dishcodefilter Dish Code Filter (BITMASK values: 1 &#x3D; (Speisen), 2 &#x3D; (Vorspeise), 4 &#x3D; (Hauptspeise), 8 &#x3D; (Nachspeise), 16 &#x3D; (Tagesgericht), 32 &#x3D; (Menü), 64 &#x3D; (Degustationsmenü), 128 &#x3D; (Kindermenüs), 256 &#x3D; (Mittagsmenüs)
     * @param ceremonycodefilter Ceremony Code Filter (BITMASK  values: 1 &#x3D; (Familienfeiern), 2 &#x3D; (Hochzeiten), 4 &#x3D; (Geburtstagsfeiern), 8 &#x3D; (Firmenessen), 16 &#x3D; (Weihnachtsessen), 32 &#x3D; (Sylvestermenü), 64 &#x3D; (Seminare / Tagungen), 128 &#x3D; (Versammlungen)
     * @param categorycodefilter Category Code Filter (BITMASK  values: 1 &#x3D; (Restaurant), 2 &#x3D; (Bar / Café / Bistro), 4 &#x3D; (Pub / Disco), 8 &#x3D; (Apres Ski), 16 &#x3D; (Jausenstation), 32 &#x3D; (Pizzeria), 64 &#x3D; (Bäuerlicher Schankbetrieb), 128 &#x3D; (Buschenschank), 256 &#x3D; (Hofschank), 512 &#x3D; (Törggele Lokale), 1024 &#x3D; (Schnellimbiss), 2048 &#x3D; (Mensa), 4096 &#x3D; (Vinothek /Weinhaus / Taverne), 8192 &#x3D; (Eisdiele), 16348 &#x3D; (Gasthaus), 32768 &#x3D; (Gasthof), 65536 &#x3D; (Braugarten), 131072 &#x3D; (Schutzhütte), 262144 &#x3D; (Alm), 524288 &#x3D; (Skihütte)
     * @param facilitycodefilter Facility Code Filter (BITMASK  values: 1 &#x3D; (American Express), 2 &#x3D; (Diners Club), 4 &#x3D; (Eurocard / Mastercard), 8 &#x3D; (Visa), 16 &#x3D; (Hunde erlaubt), 32 &#x3D; (Geeignet für Busse), 64 &#x3D; (Garten), 128 &#x3D; (Garagen), 256 &#x3D; (Bierbar), 512 &#x3D; (Kinderspielplatz), 1024 &#x3D; (Spielzimmer), 2048 &#x3D; (Spielplatz), 4096 &#x3D; (Parkplätze), 8192 &#x3D; (Raucherräume), 16348 &#x3D; (Terrasse), 32768 &#x3D; (Behindertengerecht), 65536 &#x3D; (Biergarten), 131072 &#x3D; (Aussichtsterrasse), 262144 &#x3D; (Wintergarten), 524288 &#x3D; (Gault Millau Südtirol), 1048576 &#x3D; (Guida Espresso), 2097152 &#x3D; (Gambero Rosso), 4194304 &#x3D; (Feinschmecker), 8388608 &#x3D; (Aral Schlemmer Atlas), 16777216 &#x3D; (Varta Führer), 33554432 &#x3D; (Bertelsmann), 67108864 &#x3D; (Preis für Südtiroler Weinkultur), 134217728 &#x3D; (Michelin), 268435456 &#x3D; (Roter Hahn), 536870912 &#x3D; (Tafelspitz))
     * @param cuisinecodefilter Cuisine Code Filter (BITMASK  values: 1 &#x3D; (Vegetarische Küche), 2 &#x3D; (Glutenfreie Küche), 4 &#x3D; (Laktosefreie Kost), 8 &#x3D; (Warme Küche), 16 &#x3D; (Südtiroler Spezialitäten), 32 &#x3D; (Gourmet Küche), 64 &#x3D; (Italienische Küche), 128 &#x3D; (Internationale Küche), 256 &#x3D; (Pizza), 512 &#x3D; (Fischspezialitäten), 1024 &#x3D; (Asiatische Küche), 2048 &#x3D; (Wildspezialitäten), 4096 &#x3D; (Produkte eigener Erzeugung), 8192 &#x3D; (Diätküche), 16348 &#x3D; (Grillspezialitäten), 32768 &#x3D; (Ladinische Küche), 65536 &#x3D; (Kleine Karte), 131072 &#x3D; (Fischwochen), 262144 &#x3D; (Spargelwochen), 524288 &#x3D; (Lammwochen), 1048576 &#x3D; (Wildwochen), 2097152 &#x3D; (Vorspeisewochen), 4194304 &#x3D; (Nudelwochen), 8388608 &#x3D; (Kräuterwochen), 16777216 &#x3D; (Kindermenüs), 33554432 &#x3D; (Mittagsmenüs))
     * @param odhtagfilter Taglist Filter (String, Separator &#39;,&#39; more Tags possible, available Tags reference to &#39;api/SmgTag/ByMainEntity/Activity&#39;), (default:&#39;null&#39;)
     * @param active Active Activities Filter (possible Values: &#39;true&#39; only Active Activities, &#39;false&#39; only Disabled Activities
     * @param odhactive odhactive (Published) Activities Filter (possible Values: &#39;true&#39; only published Activities, &#39;false&#39; only not published Activities, (default:&#39;null&#39;)
     * @param latitude GeoFilter Latitude Format: &#39;46.624975&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param longitude GeoFilter Longitude Format: &#39;11.369909&#39;, &#39;null&#39; &#x3D; disabled, (default:&#39;null&#39;)
     * @param radius Radius to Search in Meters. Only Object withhin the given point and radius are returned and sorted by distance. Random Sorting is disabled if the GeoFilter Informations are provided, (default:&#39;null&#39;)
     * @return List&lt;GastronomyReduced&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GastronomyReduced> gastronomyGetGastronomyListReduced(String language, String locfilter, String dishcodefilter, String ceremonycodefilter, String categorycodefilter, String facilitycodefilter, String cuisinecodefilter, String odhtagfilter, String active, String odhactive, String latitude, String longitude, String radius) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/GastronomyReduced").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locfilter", locfilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dishcodefilter", dishcodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ceremonycodefilter", ceremonycodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "categorycodefilter", categorycodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "facilitycodefilter", facilitycodefilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cuisinecodefilter", cuisinecodefilter));
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

        ParameterizedTypeReference<List<GastronomyReduced>> returnType = new ParameterizedTypeReference<List<GastronomyReduced>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Gastronomy Single
     * 
     * <p><b>200</b> - Gastronomy Object
     * @param id ID of the Gastronomy
     * @return Gastronomy
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Gastronomy gastronomyGetGastronomySingle(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gastronomyGetGastronomySingle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Gastronomy/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Gastronomy> returnType = new ParameterizedTypeReference<Gastronomy>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GET Gastronomy Localized Single
     * 
     * <p><b>200</b> - GastronomyLocalized Object
     * @param id ID of the Gastronomy
     * @param language Localization Language, (default:&#39;en&#39;)
     * @return GastronomyLocalized
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GastronomyLocalized gastronomyGetGastronomySingleLocalized(String id, String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gastronomyGetGastronomySingleLocalized");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/GastronomyLocalized/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<GastronomyLocalized> returnType = new ParameterizedTypeReference<GastronomyLocalized>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package it.hackthealps.codemates.staylocalpaylocal.opendata.config;

import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;
import it.hackthealps.codemates.staylocalpaylocal.api.LoginApiApi;
import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@Slf4j
public class OpenDataConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    ApiClient apiClient(OpenDataProperties openDataProperties) {
        ApiClient apiClient = new ApiClient(restTemplate());
        apiClient.setBasePath(openDataProperties.getHostname());
        return apiClient;
    }
}

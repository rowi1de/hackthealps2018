package it.hackthealps.codemates.staylocalpaylocal.opendata.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
@Slf4j
public class OpenDataConfig {

    @Bean
    RestTemplate restTemplate() {
      return new RestTemplate();
    }

    @Bean
    HttpMessageConverter messageConverter(){
        return new MappingJackson2HttpMessageConverter(objectMapper());
    }

    @Primary
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS,true);
        return objectMapper;
    }

    @Bean
    ApiClient apiClient(OpenDataProperties openDataProperties) {
        ApiClient apiClient = new ApiClient(restTemplate());
        apiClient.setBasePath(openDataProperties.getHostname());
        return apiClient;
    }
}

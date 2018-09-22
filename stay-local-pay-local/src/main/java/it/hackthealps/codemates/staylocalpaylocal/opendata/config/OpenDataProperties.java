package it.hackthealps.codemates.staylocalpaylocal.opendata.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix = "opendata")
@Configuration
public class OpenDataProperties {
    String user;
    String password;
    String hostname;
}

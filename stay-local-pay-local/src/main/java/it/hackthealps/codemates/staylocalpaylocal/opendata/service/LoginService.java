package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.hackthealps.codemates.staylocalpaylocal.opendata.api.LoginApiApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.config.OpenDataProperties;
import it.hackthealps.codemates.staylocalpaylocal.opendata.invoker.ApiClient;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccessTokenModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.LoginPostModel;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@ConfigurationProperties(prefix = "opendata")
public class LoginService {

    private final ApiClient apiClient;

    private final LoginApiApi loginApiApi;

    private final ObjectMapper objectMapper;

    private final OpenDataProperties openDataProperties;

    public void login(){
        LoginPostModel loginPostModel = new LoginPostModel();
        loginPostModel.setUsername(openDataProperties.getUser());
        loginPostModel.setPswd(openDataProperties.getPassword());
        AccessTokenModel loginResult = objectMapper.convertValue(loginApiApi.loginApiPostLogin(loginPostModel), AccessTokenModel.class);
        apiClient.addDefaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + loginResult.access_token);
    }
}

package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import javax.transaction.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.hackthealps.codemates.staylocalpaylocal.api.LoginApiApi;
import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiClient;
import it.hackthealps.codemates.staylocalpaylocal.opendata.config.OpenDataProperties;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccessTokenModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccessTokenRepository;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.LoginPostModel;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
        Object loginResult =  loginApiApi.loginApiPostLogin(loginPostModel);
        AccessTokenModel token = objectMapper.convertValue(loginResult, AccessTokenModel.class);
        //FIXME: Swagger is missing Auth Method
        apiClient.addDefaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token.access_token);
    }
}

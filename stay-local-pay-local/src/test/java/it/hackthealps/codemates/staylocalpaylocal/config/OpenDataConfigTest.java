package it.hackthealps.codemates.staylocalpaylocal.config;

import static org.junit.Assert.*;

import it.hackthealps.codemates.staylocalpaylocal.api.LoginApiApi;
import it.hackthealps.codemates.staylocalpaylocal.invoker.ApiClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class OpenDataConfigTest {

    @Test
    public void apiClient(@Autowired ApiClient apiClient){
        assertNotNull(apiClient);
    }

    @Test
    public void loginApi(@Autowired LoginApiApi loginApiApi){
        assertNotNull(loginApiApi);
    }

}
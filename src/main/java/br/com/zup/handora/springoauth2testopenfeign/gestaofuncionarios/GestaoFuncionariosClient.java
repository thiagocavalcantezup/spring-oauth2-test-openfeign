package br.com.zup.handora.springoauth2testopenfeign.gestaofuncionarios;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.zup.handora.springoauth2testopenfeign.configs.OAuth2FeignRequestInterceptor;

@FeignClient(name = "gestaoFuncionarios", url = GestaoFuncionariosClient.BASE_URI, configuration = GestaoFuncionariosClient.Config.class)
public interface GestaoFuncionariosClient {

    public final static String BASE_URI = "http://localhost:8080/oauth2-resourceserver-gestao-funcionarios/api/funcionarios";

    @GetMapping
    public List<FuncionarioResponse> listar();

    class Config {

        @Bean
        OAuth2FeignRequestInterceptor oAuth2FeignRequestInterceptor(OAuth2AuthorizedClientManager clientManager) {
            return new OAuth2FeignRequestInterceptor(clientManager, "gestao-funcionarios");
        }

    }

}

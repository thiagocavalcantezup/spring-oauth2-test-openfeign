package br.com.zup.handora.springoauth2testopenfeign.meuscontatos;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.zup.handora.springoauth2testopenfeign.configs.OAuth2FeignRequestInterceptor;

@FeignClient(name = "meusContatos", url = MeusContatosClient.BASE_URI, configuration = MeusContatosClient.Config.class)
public interface MeusContatosClient {

    public final static String BASE_URI = "http://localhost:8080/api/contatos";

    @GetMapping
    public List<ContatoResponse> listar();

    class Config {

        @Bean
        OAuth2FeignRequestInterceptor oAuth2FeignRequestInterceptor(OAuth2AuthorizedClientManager clientManager) {
            return new OAuth2FeignRequestInterceptor(clientManager, "meus-contatos");
        }

    }

}

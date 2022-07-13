package br.com.zup.handora.springoauth2testopenfeign.livraria;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.zup.handora.springoauth2testopenfeign.configs.OAuth2FeignRequestInterceptor;

@FeignClient(name = "livraria", url = LivrariaClient.BASE_URI, configuration = LivrariaClient.Config.class)
public interface LivrariaClient {

    public final static String BASE_URI = "http://localhost:8080/oauth2-resourceserver-livraria/api";

    @GetMapping("/livros/{livroId}")
    public Optional<DetalhesDoLivroResponse> detalharLivro(@PathVariable Long livroId);

    @GetMapping("/autores/{autorId}")
    public Optional<DetalhesDoAutorResponse> detalharAutor(@PathVariable Long autorId);

    class Config {

        @Bean
        OAuth2FeignRequestInterceptor oAuth2FeignRequestInterceptor(OAuth2AuthorizedClientManager clientManager) {
            return new OAuth2FeignRequestInterceptor(clientManager, "livraria");
        }

    }

}

package br.com.zup.handora.springoauth2testopenfeign.minhasfigurinhas;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.zup.handora.springoauth2testopenfeign.configs.OAuth2FeignRequestInterceptor;

@Validated
@FeignClient(name = "minhasFigurinhas", url = MinhasFigurinhasClient.BASE_URI, configuration = MinhasFigurinhasClient.Config.class)
public interface MinhasFigurinhasClient {

    public final static String BASE_URI = "http://localhost:8080/oauth2-resourceserver-minhas-figurinhas/api";

    @PostMapping("/albuns")
    public ResponseEntity<Void> cadastrarAlbum(@RequestBody @Valid NovoAlbumOutputRequest request);

    @GetMapping("/albuns/{albumId}")
    public DetalhesDoAlbumInputResponse detalharAlbum(@PathVariable Long albumId);

    class Config {

        @Bean
        OAuth2FeignRequestInterceptor oAuth2FeignRequestInterceptor(OAuth2AuthorizedClientManager clientManager) {
            return new OAuth2FeignRequestInterceptor(clientManager, "minhas-figurinhas");
        }

    }

}

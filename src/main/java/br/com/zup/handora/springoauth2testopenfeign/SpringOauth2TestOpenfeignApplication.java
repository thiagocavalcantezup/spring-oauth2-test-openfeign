package br.com.zup.handora.springoauth2testopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringOauth2TestOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2TestOpenfeignApplication.class, args);
    }

}

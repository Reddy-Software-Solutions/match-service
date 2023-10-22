package com.malli.matchservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Match Service", description = "This is a Spring Boot Match Microservice"))
//@OpenAPIDefinition(info = @Info(title = "Match Service", description = "This is a Spring Boot Match Microservice"), security = @SecurityRequirement(name = "AUTHORIZATION"))
//@SecurityScheme(name = "AUTHORIZATION", scheme = "api_key", type = SecuritySchemeType.APIKEY, in = SecuritySchemeIn.HEADER, paramName = "secretKey")
@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
public class MatchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatchServiceApplication.class, args);
    }

}

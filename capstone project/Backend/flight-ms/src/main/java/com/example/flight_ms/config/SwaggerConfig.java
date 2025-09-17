package com.example.flight_ms.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI flightDataOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Flight Microservice API")
                .version("1.0")
                .description("API documentation for the Flight-Data Service"));
    }
}
package com.example.bookingms.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI bookingOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Booking Microservice API")
                .version("1.0")
                .description("API documentation for the Booking Service"));
    }
}
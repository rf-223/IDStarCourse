package com.idstarcourse.latihan.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {
    @Bean
    public OpenAPI springDoc() {
        return new OpenAPI()
                .info(new Info()
                        .title("Latihan Level 4 ")
                        .version("v1"));
    }
}

package tw.com.aitc.sa.SpringCloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI initOpenAPI() {
        return new OpenAPI().info(
            new Info().title("線上API說明").description("OpenAPI").version("v1.0")
        );
    }
}

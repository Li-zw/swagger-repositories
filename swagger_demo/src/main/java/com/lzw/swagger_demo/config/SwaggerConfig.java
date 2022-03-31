package com.lzw.swagger_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @Author LZW
 * @Description
 * @Date 2022-03-29 21:23
 * @Version 1.0
 */
@Configuration
public class SwaggerConfig {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo());
    }


    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger 接口文档")
                .description("Api说明")
                .contact(new Contact("LZW", "null", "null"))
                .version("1.0")
                .build();
    }
}

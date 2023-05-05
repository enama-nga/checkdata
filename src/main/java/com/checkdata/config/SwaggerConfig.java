package com.checkdata.config;


import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//@Configuration
//@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title(" Tech Interface - Spring Boot Configuration ")
                .description("\"Swagger configuration for application\"")
                .version("1.1.0")
                .license("Apache 2.0")
                .licenseUrl("https://www.apache.org.licences/LICENCE-2.0\"")
                .contact(new Contact("Tech Interface","https://www.example","patrice.alphonse-enama@capgemini.com"))
                .build();


    }
}

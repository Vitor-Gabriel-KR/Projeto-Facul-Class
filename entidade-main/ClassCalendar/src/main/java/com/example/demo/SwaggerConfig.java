package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .select()
            .apis(RequestHandlerSelectors
                .basePackage("com.example.demo.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());

    }
    
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
            .title("API - ClassCalendar")
            .description("Api de agendamento de monitorias desenvolvido na disciplina de Engenharia de Software")
            .version("1.0")
            .termsOfServiceUrl("https://github.com/nickoolaz/Trabalho-Esw")
            .license("Dieyson Gustavo, Rafael Mantovani, Nicolas Araujo, Nicolas Correia" )
            .build();
    }
}

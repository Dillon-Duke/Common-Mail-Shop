package com.tencent.config;

import com.tencent.entity.SwaggerProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author dillon
 * @Date 2020/3/21 23:26
 * @Version 1.0
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket docket( SwaggerProperty property){
        return new Docket(DocumentationType.SWAGGER_2)  //文档为swagger2
                .apiInfo(apiInfo(property))
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage(property.getBasePackage()))
                .build();
    }

    private ApiInfo apiInfo(SwaggerProperty property){
        Contact contact = new Contact(property.getName(),property.getUrl(),property.getEmail());
        return new ApiInfoBuilder()
                .contact(contact)
                .title(property.getTitle())
                .description(property.getDestription())
                .termsOfServiceUrl(property.getTermOfServiceUrl())
                .license(property.getLicense())
                .build();
    }
}

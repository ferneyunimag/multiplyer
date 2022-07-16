package com.multiply.bigInteger.multiplyer.configuration;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {

    private static ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Library API")
                .description("This is Library API")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .build();
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.OAS_30)
                //.tags(new Tag("accounts", "accounts related"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.multiply.bigInteger.multipliyer"))
                .build()
                .apiInfo(apiInfo());
    }

}

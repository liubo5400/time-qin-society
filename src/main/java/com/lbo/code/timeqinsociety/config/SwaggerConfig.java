package com.lbo.code.timeqinsociety.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import io.swagger.models.Swagger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
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

@ConditionalOnClass(value = {Swagger.class})
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerConfig {

    @Bean
    public Docket gzSpiderDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).groupName("时光的琴-管理后台")
                .select().apis(RequestHandlerSelectors.basePackage("com.lbo.code.timeqinsociety.web.controller.admin"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("liubo","","");
        return new ApiInfoBuilder()
                .title("API接口文档")//标题
                .description("API接口的描述")//文档接口的描述
                .contact(contact)
                .version("1.0")//版本号
                .build();
    }

}

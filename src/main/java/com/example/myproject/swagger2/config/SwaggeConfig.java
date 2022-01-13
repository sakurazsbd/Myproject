package com.example.myproject.swagger2.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: lixl
 * @Date: 2021/9/17 20:24
 * @Descrption
 */

@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggeConfig {

    @Value("${springfox.documentation.enable}")
    private boolean enabled;

    //配置swagger的bean实例
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("myproject")
                .apiInfo(apiInfo())
                .enable(enabled)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();

//        return new Docket(DocumentationType.SWAGGER_2);   //直接这么写也是ok的
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Myproject Api 接口文档")
                .description("Api 接口文档")
                .version("v1.0")
                .build();
    }

}

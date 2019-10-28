package com.cango.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author
 * @description
 * @date 2019/10/28
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.cango"))// 指定扫描包下面的注解
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)) //获取有指定注解的方法
                .paths(PathSelectors.any())
                .build();
    }
    // 创建api的基本信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("集成Swagger2构建RESTful APIs")
                .description("集成Swagger2构建RESTful APIs")
                .termsOfServiceUrl("")
                .contact(new Contact("enjoy","com.xxxx.com","123@123.cn"))
                .version("1.0.0")
                .build();
    }
    /*@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())	//创建API基本信息
                .groupName("")	//指定分组，对应(/v2/api-docs?group=)
                .pathMapping("")	//base地址，最终会拼接Controller中的地址
                .select()		//控制要暴露的接口
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)) //获取有指定注解的方法
//				.apis(RequestHandlerSelectors.basePackage("com.cango.center.pboc.controller"))	//通过指定扫描包暴露接口
                .paths(PathSelectors.any())	//设置过滤规则暴露R接口
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("车和家车贷服务")
                .description("")
                .version("1.0")
                .termsOfServiceUrl("")
                .license("")
                .licenseUrl("")
                .build();
    }*/


}

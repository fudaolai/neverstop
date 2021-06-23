package com.example.neverstop.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
 *
 * 配置swagger
 * @author daolai.fu
 */

@EnableSwagger2
@Configuration
@ConditionalOnProperty(prefix = "myConfig", name = "swagger-ui-open", havingValue = "true")
public class Swagger2 {

    /**
     * 创建API应用
     *
     * apiInfo（）增加APi相关信息
     * 通过select()函数返回一个APiSelectorBuilder实例 用来控制哪些接口暴露给Swagger来展示
     *
     * 本例子采用指定扫描包路径来定义指定要建立API的目录
     */


    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.nerverstop"))
                .paths(PathSelectors.any())
                .build();
    }


    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("neverstop项目测试Swagger")
                .description("neverstop项目描述")
                .version("1.0")
                .build();


    }


}

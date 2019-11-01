package com.cango;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @description
 *
 * @EnableAutoConfiguration
 * @ComponentScan(basePackages = {"com.cango"})
 * @Configuration
 * 这三个注解相当于@SpringApplication 默认扫描当前类所在的目录下所有的包
 * 可以指定扫描的类 不会出现加载多余类占用CPU资源的情况
 * @date 2019/10/28
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.cango.mapper"})
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.cango"})
//@Configuration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}

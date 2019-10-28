package com.cango;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author
 * @description
 * @date 2019/10/28
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.cango.mapper"})
//@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}

package com.cango.exception;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author
 * @description
 * 全局异常处理类
 * @date 2019/10/28
 */
//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {RuntimeException.class})
    public String defaultErrorHandler(HttpServletRequest req, Exception e){
        e.printStackTrace();
        return "我是异常类";
    }



    /**
     *  出现404时候的处理 比如url错误的情况
     *  因此需要在controller加一个 404 的方法
     *  WebServerFactoryCustomizer 是在springboot2.x中有的
     *  如果是1.x就需要使用 EmbeddedServletContainerCustomizer
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return (factory -> {
            ErrorPage errorPage404 = new ErrorPage(HttpStatus.NOT_FOUND  ,"/404.do");
            factory.addErrorPages(errorPage404);
        });
    }

    /*@Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return (container -> {
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.do");
            container.addErrorPages( error404Page);
        });
    }*/
}

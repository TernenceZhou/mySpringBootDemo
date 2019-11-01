package com.cango.config.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author
 * @description
 * @date 2019/10/31
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.cango.controller")
//public class WebConfig  extends WebMvcConfigurerAdapter {
public class WebConfig implements WebMvcConfigurer {

    // 创建SpringMVC视图解析器
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        // 可以在JSP页面中通过${}访问beans
        viewResolver.setExposeContextBeansAsAttributes(true);

        registry.viewResolver(viewResolver);
    }
}

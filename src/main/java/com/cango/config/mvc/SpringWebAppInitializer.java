package com.cango.config.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author
 * @description
 *
 * SpringMvc中的DispatcherServlet配置类
 *
 * @date 2019/10/31
 */
@Configuration
public class SpringWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements
        WebApplicationInitializer {

    //加载配置中心 spring核心
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

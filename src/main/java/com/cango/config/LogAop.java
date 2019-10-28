package com.cango.config;

import com.cango.controller.UserController;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author
 * @description
 * 统一日志切面类
 * @date 2019/10/28
 */
@Aspect
@Component
public class LogAop {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);


    /**
     * 第一个* 任意修饰符返回值得
     * 第二个* 任意类
     * 第三个 * 任意方法
     * .. 任意参数
     */
    @Pointcut(value = "execution(* com.cango.controller.*.*(..))")
    public void webLog(){

    }

    @Before(value = "webLog()")
    public void doBefore(JoinPoint joinpoint) throws Throwable{
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String name = (String) enu.nextElement();
            logger.info("name:{},value:{}", name, request.getParameter(name));
        }
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info(" 返回内容 : " + ret);
    }
}

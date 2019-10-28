package com.cango.controller;

import com.cango.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author
 * @description
 * @date 2019/10/28
 */
@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/hello")
    public Object sayHello() {
        logger.debug("这是hello");
        //debug不会输出任何内容 因为boot中的默认的日志级别是info
        return "hello";
    }
    @RequestMapping("/login")
    public String login(String username,String passwd) {
        boolean login = iUserService.login(username, passwd);
        if(login) {
            return "登陆成功";
        }else {
            return  "登陆失败";
        }
    }

    @RequestMapping("/register")
    public String register(String username,String passwd) {
        boolean login = iUserService.register(username, passwd);
        if(login) {
            return "注册成功";
        }else {
            return  "注册失败";
        }
    }
    @RequestMapping("/batchAdd")
    public String batchAdd(String username,String passwd) {
        iUserService.batchAdd(username, passwd);
        return "成功";
    }

    @RequestMapping("/404.do")
    public Object error_404() {
        logger.info("-**************异常捕获后的装换方法");
        return "你要找的页面，被lison偷吃了！";
    }
}

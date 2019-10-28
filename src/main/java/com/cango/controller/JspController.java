package com.cango.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author
 * @description
 * @date 2019/10/28
 */
@Controller
@RequestMapping("/jsp")
public class JspController {


    @RequestMapping("/hi")
    public String sayHello() {
        return "index";
    }

}

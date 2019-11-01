package com.cango.controller;

import com.cango.model.EnjoyOrder;
import com.cango.model.EnjoyUser;
import com.cango.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @description
 * 多数据源测试controller
 * 可同时入库
 * @date 2019/10/30
 */
@RestController
public class DataSourceTestController {

    @Autowired
    private IOrderService iOrderService;


    @RequestMapping("/doubleDatasource")
    public void datasource(){
        EnjoyUser users = new EnjoyUser();
        users.setUsername("enjoy");
        users.setPasswd("123");
        users.setId(1);

        EnjoyOrder orders = new EnjoyOrder();
        orders.setAccount(12);
        orders.setName("娃娃");
        orders.setUserId(1);
        iOrderService.addOrder(orders,users);
    }

}

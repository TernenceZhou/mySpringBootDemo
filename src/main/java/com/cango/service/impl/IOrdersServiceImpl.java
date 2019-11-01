package com.cango.service.impl;

import com.cango.mapper.orders.EnjoyOrderMapper;
import com.cango.mapper.user.EnjoyUserMapper;
import com.cango.model.EnjoyOrder;
import com.cango.model.EnjoyUser;
import com.cango.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author
 * @description
 * @date 2019/10/30
 */
@Service
public class IOrdersServiceImpl implements IOrderService {

    @Autowired
    private EnjoyOrderMapper orderMapper;

    @Autowired
    private EnjoyUserMapper userMapper;

    @Override
    @Transactional //测试分布式事务 jta+atomikos
    public void addOrder(EnjoyOrder orders, EnjoyUser users){
        userMapper.insertSelective(users);
        int i = 10 /0;
        orderMapper.insertSelective(orders);
    }
}

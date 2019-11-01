package com.cango.service;

import com.cango.model.EnjoyOrder;
import com.cango.model.EnjoyUser;

/**
 * @author
 * @description
 * @date 2019/10/30
 */
public interface IOrderService {

    void addOrder(EnjoyOrder orders, EnjoyUser users);
}

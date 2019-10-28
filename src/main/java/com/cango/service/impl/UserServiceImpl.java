package com.cango.service.impl;

import com.cango.mapper.EnjoyUserMapper;
import com.cango.model.EnjoyUser;
import com.cango.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author
 * @description
 * @date 2019/10/28
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private EnjoyUserMapper usersMapper;



    @Override
    public boolean login(String username, String passwd) {
        EnjoyUser users = usersMapper.findByUsernameAndPasswd(username, passwd);
        return users != null;
    }

    @Override
    public boolean register(String username, String passwd) {
        EnjoyUser users = new EnjoyUser();
        users.setUsername(username);
        users.setPasswd(passwd);
        int cnt = usersMapper.insertSelective(users);
        return cnt > 0;
    }

    @Override
    @Transactional//事务注解 发生运行时异常但是回滚了插入数据库的操作
    public void batchAdd(String username, String passwd) {
        EnjoyUser users = new EnjoyUser();
        users.setUsername(username);
        users.setPasswd(passwd);
        usersMapper.insertSelective(users);
        int i = 10 /0;
        users = new EnjoyUser();
        users.setUsername(username+"2");
        users.setPasswd(passwd);
        usersMapper.insertSelective(users);
    }
}

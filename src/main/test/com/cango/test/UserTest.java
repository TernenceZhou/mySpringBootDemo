package com.cango.test;

import com.cango.Application;
import com.cango.mapper.EnjoyUserMapper;
import com.cango.model.EnjoyUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author
 * @description
 * @date 2019/10/28
 */
@SpringBootTest(classes = {Application.class})
@RunWith(SpringRunner.class)
public class UserTest {


    @Autowired
    private EnjoyUserMapper mapper;

    @Test
    public void test(){
        EnjoyUser user = mapper.findByUsernameAndPasswd("a", "b");
        System.out.println(user);
    }

}

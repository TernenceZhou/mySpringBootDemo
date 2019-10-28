package com.cango.mapper;

import com.cango.model.EnjoyUser;
import org.apache.ibatis.annotations.Param;

public interface EnjoyUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EnjoyUser record);

    int insertSelective(EnjoyUser record);

    EnjoyUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EnjoyUser record);

    int updateByPrimaryKey(EnjoyUser record);

    EnjoyUser findByUsernameAndPasswd(@Param("username") String username, @Param("passwd") String passwd);
}
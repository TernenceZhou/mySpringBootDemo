package com.cango.mapper.orders;

import com.cango.model.EnjoyOrder;

public interface EnjoyOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EnjoyOrder record);

    int insertSelective(EnjoyOrder record);

    EnjoyOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EnjoyOrder record);

    int updateByPrimaryKey(EnjoyOrder record);
}
package com.cango.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.cango.model.EnjoyUser;
import com.cango.mapper.EnjoyUserMapper;
@Service
public class EnjoyUserService{

    @Resource
    private EnjoyUserMapper enjoyUserMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return enjoyUserMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(EnjoyUser record) {
        return enjoyUserMapper.insert(record);
    }

    
    public int insertSelective(EnjoyUser record) {
        return enjoyUserMapper.insertSelective(record);
    }

    
    public EnjoyUser selectByPrimaryKey(Integer id) {
        return enjoyUserMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(EnjoyUser record) {
        return enjoyUserMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(EnjoyUser record) {
        return enjoyUserMapper.updateByPrimaryKey(record);
    }

}

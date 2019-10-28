package com.cango.service;

/**
 * @author
 * @description
 * @date 2019/10/28
 */
public interface IUserService {
    boolean login(String username,String passwd);
    boolean register(String username,String passwd);
    void batchAdd(String username,String passwd);
}

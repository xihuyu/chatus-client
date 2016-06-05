package com.chatus.service;

import com.chatus.domain.User;

/**
 * Created by gaopan on 16/6/5.
 */
public interface UserService {

    /**
     * 保存用户
     * @param user
     */
    public void insert(User user);


    /**
     * 根据用户名查询
     * @param name
     * @return
     */
    public User findUserByName(String name);

}

package com.chatus.dao;

import com.chatus.base.dao.BaseDao;
import com.chatus.domain.User;

/**
 * Created by gaopan on 16/6/5.
 */
public interface UserDao extends BaseDao<User> {

    /**
     * 根据用户名查询用户信息
     * @param uName
     * @return
     */
    public User findUserByName(String uName);
}

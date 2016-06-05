package com.chatus.dao.impl;

import com.chatus.base.dao.impl.BaseDaoImpl;
import com.chatus.dao.UserDao;
import com.chatus.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by gaopan on 16/6/5.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    public User findUserByName(String uName) {
        return super.getSessionTemplate().selectOne(getStatementId("findUserByName"), uName);
    }
}

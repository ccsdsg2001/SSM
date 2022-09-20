package com.atguigu.spring.service.impl;

import com.atguigu.spring.DAO.UserDao;
import com.atguigu.spring.service.UserService;

/**
 * @author cc
 * @date 2022年09月20日 23:05
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {

    }
}

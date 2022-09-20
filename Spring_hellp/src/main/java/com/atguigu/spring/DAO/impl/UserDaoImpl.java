package com.atguigu.spring.DAO.impl;

import com.atguigu.spring.DAO.UserDao;
import com.atguigu.spring.service.UserService;
import com.atguigu.spring.service.impl.UserServiceImpl;

/**
 * @author cc
 * @date 2022年09月20日 23:06
 */
public class UserDaoImpl implements UserDao {
    private UserService userService ;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void saveUser() {
        System.out.println("baocuncahenggon");
    }
}

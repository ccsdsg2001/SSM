package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;

/**
 * @author cc
 * @date 2022年09月20日 23:04
 */
public class Usercontroller {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveuser(){
        userService.saveUser();
    }


}

package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author cc
 * @date 2022年09月21日 12:43
 */

//@Controller("controller")
@Controller
public class Usercontroller {
    @Autowired(required = false)
//    @Qualifier("UserServiceimpl");
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }


}

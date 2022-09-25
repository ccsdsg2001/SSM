package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cc
 * @date 2022年09月24日 16:21
 */
@Controller
public class hellocontroller {


    @RequestMapping("/")
    public String protal(){
        //将逻辑视图返回
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}

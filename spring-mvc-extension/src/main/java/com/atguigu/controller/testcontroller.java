package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cc
 * @date 2022年09月27日 22:23
 */
@Controller
public class testcontroller {

    @RequestMapping("/test/hello")
    public String test(){
        return "success";
    }
}

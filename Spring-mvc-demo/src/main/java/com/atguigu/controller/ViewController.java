package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cc
 * @date 2022年09月25日 21:15
 */
@Controller
public class ViewController {

    @RequestMapping("/test/view/thymeleaf")
    public String test(){
        return "success";

    }

    @RequestMapping("/test/view/forward")
    public String tesst1(){
        return "forward:/test/model";
    }

    @RequestMapping("/test/view/redirect")
    public String test1(){
        return "redirect:/test/model";
    }

}

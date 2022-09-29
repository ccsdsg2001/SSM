package com.atguigu.controller;

import com.atguigu.service.helloservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author cc
 * @date 2022年09月29日 21:08
 */
@Controller
public class controller {

    @Autowired
    private helloservice helloservice;
}

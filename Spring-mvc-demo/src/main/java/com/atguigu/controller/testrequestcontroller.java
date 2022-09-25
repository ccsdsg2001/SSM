package com.atguigu.controller;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author cc
 * @date 2022年09月24日 20:15
 */
@Controller
//@RequestMapping("/test") //写在类时 设置映射请求的请求路径的初始信息
public class testrequestcontroller {

//@RequestMapping 的params属性 浏览器发送请求的参数必须满足params的设置

    @RequestMapping(value = {"/hello","/abc"},method = {RequestMethod.GET,RequestMethod.POST},
   //params = {"username","!password"},
            headers = {"referer"}) //写在方法时 设置映射请求请求路径的具体信息 value属性 作用:通过请求的请求路径匹配请求 是数组类型,当前浏览器的所发送的请求路径匹配value属性任何一个值
    //method属性是requestmethod 类型的数组,当前浏览器所发送的请求的请求方式匹配method属性种的任何一种, 则当前请求就会被注解所标记的方法匹配
    //requestmapping 注解的headers属性 通过请求的请求头信息匹配请求，发送的请求头信息必须满足headers属性的设置
//    @GetMapping
    public String hello(){
        return "success";
    }


    //支持ant风格的路径 在value属性中设置一些特殊字符 不包括字符本身
    @RequestMapping("/**/test/ant")
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/test/rest/{id}/{username} ")
    public String testrest(@PathVariable("id") Integer id,@PathVariable("username") String username)
    {
        System.out.println("id"+ id+"username"+username);

        return "success";
    }




}

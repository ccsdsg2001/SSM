package com.atguigu.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author cc
 * @date 2022年09月25日 15:33
 */
@Controller
public class testCpntroller {
//通过servletapi获取 在形参位置设置HTTPServletRequest类型的形参 在控制器中使用reques对象
    @RequestMapping("/param/servletAPI")
    public String getAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+password);
        return  "success";

    }

    //2通过控制器方法的形参获取 只需要在控制器方法的形参位置,设置一个形参,形参的名字和亲给u的参数名字一致即可
//    @RequestMapping("/param")
//    public String getParam(@RequestParam(value = "userName",required = false,defaultValue = "heelo") String username,
//                           String password, @RequestHeader("referer") String referer//@CookieValue("JSESSIONID") String jsessionId
//    ){
//        //requestParam:将请求参数和控制器方法的形参绑定 三个属性 value:设置和形参绑定的请求参数的名字 required:设置是否必须传输value所对应的请求参数
//        System.out.println(username+password+"referer:"+referer+"C");
//        return "success";
//
//    }


    @RequestMapping("/param")
    public String getParamPOjo(User user){
        //通过控制器方法的实体类类型来获取参数
        System.out.println(user);



        return "success";
    }


}

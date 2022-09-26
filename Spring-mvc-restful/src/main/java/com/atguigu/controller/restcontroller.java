package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author cc
 * @date 2022年09月26日 10:43
 */
@Controller
public class restcontroller {


//    查询所有用户信息--》/user--》get
//    根据id查询用户信息--》/user/1--》get
//    添加用户信息--》/user--》post
//    修改用户信息--》/user--》put
//    删除用户信息--》/user/1--》delete



//    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String Getalluser(){
        System.out.println("查询用户信息");
        return "success";
    }

    @GetMapping("/user/{id}")
//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String Getuser(@PathVariable("id") Integer id){
        System.out.println("查询用户信息"+id);
        return "success";
    }

    @PostMapping("/user")
//    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertuset(){
        System.out.println("添加童虎信息");
        return "success";
    }

    //浏览器只能发送get和post请求
    //若要发送put和delete请求 要在web.xml配置中 配置一个过滤器HiddenHttpMethodFilter
    //配置过滤器之后 1.要当前请求为post  2.当前请求必须传输参数 _method ,_method的值才是最终请求方式
    @PutMapping("/user")
//    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String tuset(){
        System.out.println("修改童虎信息");
        return "success";
    }

    @DeleteMapping("/user/{id}")
//    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String tuse1t(@PathVariable("id") Integer id){
        System.out.println("修改童虎信息" + id);
        return "success";
    }

}

package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author cc
 * @date 2022年09月25日 20:15
 */
@Controller
public class testscoperController {

    //向域对象共享数据 1.使用ModelAndView向请求域共享数据 将Modelandview作为返回值
    @RequestMapping("/test/mav")
    public ModelAndView modelAndView(){
        //包含model和view的工能 model:向请求域中共享数据 view:设置逻辑视图实现跳转
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequestScope", "hello");
        //设置逻辑视图
        modelAndView.setViewName("success");
        return modelAndView;
    }

    //2.使用model向请求域共享数据
    @RequestMapping("/test/model")
    public String test(Model model){
        model.addAttribute("testRequestScope","model2");
        return "success";

    }

    //3.使用modelmap共享数据
    @RequestMapping("/test/modelmap")
    public String test(ModelMap model){
        model.addAttribute("testRequestScope","model123");
        return "success";

    }


    @RequestMapping("/test/map")
    public String test(Map<String,Object> model){
        model.put("testRequestScope","model");
        return "success";

    }

    @RequestMapping("/test/session")
    public String test(HttpSession session){
        session.setAttribute("test", "session");
        return "success";
    }
    @RequestMapping("/test/application")
    public String test1(HttpSession session){
        ServletContext servletContext=session.getServletContext();
        servletContext.setAttribute("test","application");
        return "success";
    }
}

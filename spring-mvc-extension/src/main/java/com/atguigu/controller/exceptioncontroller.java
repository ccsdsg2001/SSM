package com.atguigu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author cc
 * @date 2022年09月28日 19:01
 */
//将当前类标识异常处理组件
@ControllerAdvice
public class exceptioncontroller {

//设置要处理的异常信息
    @ExceptionHandler(ArithmeticException.class)
    public String exception(Throwable ex,Model model){
        model.addAttribute("ex", ex);
        return "error";

    }
}

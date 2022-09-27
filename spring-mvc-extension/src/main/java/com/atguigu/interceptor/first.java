package com.atguigu.interceptor;

import com.sun.org.glassfish.gmbal.IncludeSubclass;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author cc
 * @date 2022年09月27日 22:27
 */

@Component
public class first implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //在控制器方法执行之前执行,其返回值表示对控制器方法的拦截或放行
        System.out.println("ad");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //控制器方法执行之后执行
        System.out.println("a");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //在控制器执行之后,且渲染视图完毕之后
        System.out.println("af");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
    //执行顺序跟springmvc配置文件配置顺序有关
    //若拦截器中有拦截器的prehandle()返回false 和之前的prehandle()都会执行
}

package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cc
 * @date 2022年09月27日 14:07
 * requestBody:将请求体中的内容和形参进行绑定
 * 使用@requestBody 注解 将json格式的请求参数转换炜Java对象
 * a.导入jackson的依赖 b.在springmvc 的配置文件中<mvc:annotation-driven></mvc:annotation-driven>
 * c.在处理请求的控制器方法的形参位置,直接设置json格式的请求参数压要转换的java类型的形参
 *
 *         responseBody:将所标识的控制器方法的返回值作为响应报文的响应体相应到浏览器
 *
 *         使用@responsebody注解响应浏览器json格式的数据
 *         a.导入jackson的依赖 b.在springmvc 的配置文件中<mvc:annotation-driven></mvc:annotation-driven>
 *         c.将需要转换炜json字符串的java对象直接作为控制器方法的返回值,使用@responsebody注解标识控制器方法
 *
 *         常用的java对象转换为json的结果: 实体类-->json对象
 *         map-->json对象
 *         list-->json对象
 *
 */
@Controller
//@RestController @respongbody+@controller
public class ajaxcontroller {

    @RequestMapping("/test/ajax")
    public void test(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {
        System.out.println(id);
        response.getWriter().write("hello");

    }

    @RequestMapping("/test/RequestBody/json")
    public void testrequestbody(@RequestBody User user,HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("hell reques");

    }

    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String tet(){
        return "success";
    }
//    @RequestMapping("/test/RequestBody/json")
//    public void testrequestbody(@RequestBody Map<String,Object> map, HttpServletResponse response) throws IOException {
//        System.out.println(map);
//        response.getWriter().write("hell reques");
//
//    }

    @RequestMapping("/test/response/json")
    @ResponseBody
    public List<User> test(){
        User user =new User(1001,"adm","123",20,"nan");
        User user1 =new User(1002,"adm","123",20,"nan");
        User user2 =new User(1003,"adm","123",20,"nan");
        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user1);
        users.add(user2);

        return users;
    }
//    public Map<String,Object> test(){
//        User user =new User(1001,"adm","123",20,"nan");
//        User user1 =new User(1002,"adm","123",20,"nan");
//        User user2 =new User(1003,"adm","123",20,"nan");
//        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
//        stringObjectHashMap.put("1", user);
//        stringObjectHashMap.put("2", user1);
//        stringObjectHashMap.put("3", user2);
//        return stringObjectHashMap;
//    }
//    public User test(){
//        User user =new User(1001,"adm","123",20,"nan");
//        return user;
//    }

}

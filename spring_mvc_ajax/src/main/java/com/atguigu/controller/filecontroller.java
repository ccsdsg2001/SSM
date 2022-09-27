package com.atguigu.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

/**
 * @author cc
 * @date 2022年09月27日 17:37
 * responseEntity ：可以作为控制器方法的返回值，标识响应到浏览器的完整的响应报文
 * 文件上传要求： 1.form表单请求方式 为post 2.form表单必须设置属性 enctype=multipart/form-data
 */
@Controller
public class filecontroller {

    @RequestMapping("/test/down")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
//获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
//获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("img");
        realPath = realPath+ File.separator+"1.png ";
//创建输入流
        InputStream is = new FileInputStream(realPath);
//创建字节数组
        byte[] bytes = new byte[is.available()];
//将流读到字节数组中
        is.read(bytes);
//创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
//设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
//设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
//创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, statusCode);
//关闭输入流
        is.close();
        return responseEntity;
    }


    @RequestMapping("/test/up")
    public String tet(MultipartFile photo,HttpSession session) throws IOException {
        // 获取上传文件名
        String originalFilename = photo.getOriginalFilename();
        String hzname = originalFilename.substring(originalFilename.lastIndexOf("."));
        //获取uuid
        String string = UUID.randomUUID().toString();
        //拼接新文件名
        originalFilename=string+hzname;
        System.out.println(originalFilename);
        //获取servletcontext对象
        ServletContext servletContext=session.getServletContext();
        //获取当前工程下的photo目录的真实luj
        String photo1 = servletContext.getRealPath("photo");
        //创建photo所对应的file对象
        File file = new File(photo1);
        //判断是否存在
        if(!file.exists()){
            file.mkdir();
        }
        String finalpath=photo1+File.separator+originalFilename;
        FileOutputStream fileOutputStream = new FileOutputStream();
        //实现文件上传
        photo.transferTo(new File(finalpath));
        return "success";
    }
}

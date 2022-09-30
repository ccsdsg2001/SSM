package com.atguigu.controller;

import com.atguigu.pojo.emp;
import com.atguigu.service.servicetest;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月29日 21:54
 * 查询员工信息  /emp-->get
 * 查询员工分页信息  /emp/page/1-->get
 * 查询id员工信息  /emp/1-->get
 * 跳转到添加页面  /to/add-->get
 * 添加员工信息  /emp-->post
 * 修改员工信息  /emp-->put
 * 删除员工信息  /emp/1-->delete
 */
@Controller
public class controller {

    @Autowired
    private servicetest  servicetest;

    @GetMapping("/emp")
    public String getallemp(Model model){
        //查询所有员工信息
       List<emp> list = servicetest.getAllEmp();
// 将员工信息在请求域中共享
       model.addAttribute("emplist", list);
       //跳转到emp_list
        return "emp_list";
    }

    @GetMapping("/emp/page/{pageNum}")
    public String getEmpByPage(@PathVariable("pageNum") Integer pagenum, Model model){
        //调用业务逻辑 获取员工分页信息
        PageInfo<emp> pageInfo = servicetest.getEmpPage(pagenum);
        model.addAttribute("page", pageInfo);
        return "emp_list";

    }


//    @GetMapping("/empee")
//    public String toemplist(){
//        return "emp_list";
//    }

}

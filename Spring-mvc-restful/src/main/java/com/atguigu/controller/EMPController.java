package com.atguigu.controller;

import com.atguigu.controller.DAO.EmployeeDAO;
import com.atguigu.controller.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author cc
 * @date 2022年09月26日 17:38
 * 查询所有的员工信息 --》/emp-->GET
 * 跳转到添加页面 --》/to/add-->GET
 * 新增员工信息 --》/emp-->post
 * 跳转到修改页面 --》/emp/1->GET
 * 修改员工信息 --》/emp-->PUT
 * 删除信息-->/emp/1 -->DELETE
 *
 */
@Controller
public class EMPController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String getAllEmp(Model model) {
        //获取员工信息学
        Collection<Employee> all = employeeDAO.getAll();
        //将信息放在请求域中共享
        model.addAttribute("emp", all);
        return "emplist";

    }

    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public String addEmp(Employee employee) {
        //保存员工信息
        employeeDAO.save(employee);

        //重定向到列表功能
        return "redirect:/emp";

    }

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") Integer id, Model model) {

        Employee employee = employeeDAO.get(id);

        model.addAttribute("emp", employee);

        return "emp_update";

    }

    @RequestMapping(value = "/emp", method = RequestMethod.PUT)
    public String update(Employee employee) {
        //修改员工信息
        employeeDAO.save(employee);
        //重定向列表功能
        return "redirect:/emp";
    }

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
    public String update(@PathVariable("id") Integer id) {
        //修改员工信息
        employeeDAO.delete(id);
        //重定向列表功能
        return "redirect:/emp";
    }
}

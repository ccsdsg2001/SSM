package com.atguigu.service;

import com.atguigu.pojo.emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface servicetest {
    List<emp> getAllEmp();

    PageInfo<emp> getEmpPage(Integer pagenum);
}

package com.atguigu.service.impl;

import com.atguigu.mapper.Empmapper;
import com.atguigu.pojo.emp;
import com.atguigu.service.servicetest;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月29日 22:06
 */
@Service
@Transactional
public class serviceimpl implements servicetest {

    @Autowired
    private Empmapper empmapper;

    @Override
    public List<emp> getAllEmp() {
        return empmapper.getAllemp();

    }

    @Override
    public PageInfo<emp> getEmpPage(Integer pagenum) {
        //开启分页功能
        PageHelper.startPage(pagenum,6);
        //查询所有员工信息
        List<emp> allemp = empmapper.getAllemp();
        //获取分页相关数据
        PageInfo<emp> page=new PageInfo<>(allemp,5);
        return page;
    }
}

package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    List<Emp> getEmp(Emp emp);
    //批量添加
    void insert(@Param("emps") List<Emp> emps);

    void delete(@Param("empIds")Integer[] empIds);
}

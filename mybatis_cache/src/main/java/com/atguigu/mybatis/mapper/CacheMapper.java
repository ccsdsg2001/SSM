package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author cc
 * @date 2022年09月18日 15:30
 */
public interface CacheMapper {
    Emp get(@Param("empId")Integer empId);
}

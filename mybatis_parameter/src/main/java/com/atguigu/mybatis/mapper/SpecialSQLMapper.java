package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface SpecialSQLMapper {

    List<User> getUserBy(@Param("mohu") String mohu);

    void delete(@Param("ids") String ids);

    void insert(User user);

    List<User> getUserList(@Param("tableName") String tableName);
    }


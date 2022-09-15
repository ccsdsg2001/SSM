package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public interface SelectMapper {

    User getUserByid(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();

    @MapKey("id")
    Map<String,Object> getUserByIDTOmap(@Param("id") Integer id);

    List<Map<String,Object>> getUsermap();
}

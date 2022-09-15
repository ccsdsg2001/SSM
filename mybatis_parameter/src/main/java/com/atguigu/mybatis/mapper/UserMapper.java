package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {

    User getUserByUsername(String username);

    User checkLogin(String username,String password);

    User checkLoginBymap(Map<String,Object> map);

    void inseruser(User user);

    User checkLoginByParam(@Param("username") String username,@Param("password") String password);


}

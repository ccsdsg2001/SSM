package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author cc
 * @date 2022年09月21日 12:45
 */

@Repository
public class UserDAOIML implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存");
    }
}

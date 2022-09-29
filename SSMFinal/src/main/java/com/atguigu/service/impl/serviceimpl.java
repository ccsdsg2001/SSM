package com.atguigu.service.impl;

import com.atguigu.service.servicetest;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author cc
 * @date 2022年09月29日 22:06
 */
@Service
@Transactional
public class serviceimpl implements servicetest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
}

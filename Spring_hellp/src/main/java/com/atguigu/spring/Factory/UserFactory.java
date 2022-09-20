package com.atguigu.spring.Factory;

import com.atguigu.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author cc
 * @date 2022年09月20日 22:36
 */
public class UserFactory implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}

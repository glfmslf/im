package com.yy.conf;

import com.yy.common.BeanCondition;
import com.yy.service.UserService;
import com.yy.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * AUTHOR: youyu  工号：S37565
 * CREATED_DATE: 2018/6/21 9:39
 */
@Configuration
@ComponentScan(basePackages = "com.yy")
public class BeanConfiguration {

    @Bean
    @Conditional(BeanCondition.class)
    public UserService setUservice(UserService userService){
        return new UserServiceImpl();
    }
}

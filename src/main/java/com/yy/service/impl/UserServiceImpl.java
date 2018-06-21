package com.yy.service.impl;

import com.yy.dao.UserDao;
import com.yy.pojo.User;
import com.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AUTHOR: youyu  工号：S37565
 * CREATED_DATE: 2018/6/11 9:49
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    public User getUser(String userId) {
        return null;
    }
}

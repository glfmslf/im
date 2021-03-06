package com.yy.ctrl;

import com.yy.conf.AuthLogin;
import com.yy.pojo.User;
import com.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR: yy
 * CREATED_DATE: 2018/6/7 22:21
 */
@Controller
@RequestMapping("/account")
public class UserCtrl {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAccount.do")
    public String getUserList(){
        return "index";
    }

    @AuthLogin(requred = true,value = "无权限啊")
    @RequestMapping("/login.do")
    public String login(){
        return "";
    }
    public String register(User user){


        userService.getUser(user.getCustId());
        return null;
    }
}

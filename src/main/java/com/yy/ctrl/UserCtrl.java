package com.yy.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR: yy
 * CREATED_DATE: 2018/6/7 22:21
 */
@Controller
@RequestMapping("/account")
public class UserCtrl {

    @RequestMapping("/getAccount.do")
    public String getUserList(){
        return "index";
    }

    @RequestMapping("/login.do")
    public String login(){
        return "";
    }
}

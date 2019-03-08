package com.aaa.ssm.controller;

import com.aaa.ssm.service.UserService;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * user list
     * @return
     */
    @ResponseBody
    @RequestMapping("/list")
    public Object list(){
        return userService.getUserList();
    }
}

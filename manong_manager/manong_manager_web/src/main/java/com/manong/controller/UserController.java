package com.manong.controller;

import com.manong.pojo.UserS;
import com.manong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/{userid}")
    @ResponseBody
    public UserS getUserById(@PathVariable Integer userid){
        UserS user = userService.getUserById(userid);
        return user;
    }
}

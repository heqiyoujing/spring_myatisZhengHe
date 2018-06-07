package com.cn.hnust.controller;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {

    @Resource
    private IUserService userService = null;

    @RequestMapping("/")
    public User GetUser(HttpServletRequest request, HttpServletResponse response){
        int userId = Integer.parseInt(request.getParameter("UserId"));
        User user = userService.getUserById(userId);
        return user;
    }
}


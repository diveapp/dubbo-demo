package com.happy.home.dubbo.web.controller;

import com.happy.home.dubbo.common.api.UserService;
import com.happy.home.dubbo.common.vo.UserVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lijixiao
 * @date: 2020-07-29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping
    public UserVO getUser(){
        return userService.getUser();
    }
}

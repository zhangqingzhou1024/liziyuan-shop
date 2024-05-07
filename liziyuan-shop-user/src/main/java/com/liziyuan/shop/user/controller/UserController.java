package com.liziyuan.shop.user.controller;

import com.liziyuan.shop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zqz
 * @date 2024-05-07 17:27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("getOrderNo")
    public String getOrderNo(String userId) {
        return userService.getOrderNo(userId);
    }
}

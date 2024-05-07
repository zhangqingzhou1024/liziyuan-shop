package com.liziyuan.shop.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zqz
 * @date 2024-05-07 17:27
 */
@RestController
@RequestMapping("/user")
// 动态刷新配置
@RefreshScope
public class HelloWordController {

    @Value("${liziyuan-shop-user.test.userId}")
    private String userId;

    @GetMapping("getUserConfigTest")
    public String getUserConfigTest(){
        return userId != null ? userId : "未获取到配置";
    }
}

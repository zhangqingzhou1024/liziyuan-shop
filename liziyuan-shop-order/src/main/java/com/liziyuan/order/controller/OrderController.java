package com.liziyuan.order.controller;

import com.liziyuan.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zqz
 * @date 2024-05-07 18:32
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("getOrderNo")
    public String getOrderNo(String userId) {
        return orderService.getOrderNo(userId);
    }
}


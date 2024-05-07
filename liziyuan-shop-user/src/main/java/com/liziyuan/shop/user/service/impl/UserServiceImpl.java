package com.liziyuan.shop.user.service.impl;

import com.liziyuan.shop.user.feign.OrderFeign;
import com.liziyuan.shop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zqz
 * @date 2024-05-07 18:43
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private OrderFeign orderFeign;

    @Override
    public String getOrderNo(String userId) {
        return orderFeign.getOrderNo(userId);
    }
}

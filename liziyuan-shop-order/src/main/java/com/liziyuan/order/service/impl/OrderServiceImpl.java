package com.liziyuan.order.service.impl;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.liziyuan.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author zqz
 * @date 2024-05-07 18:33
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String getOrderNo(String userId) {
        if (StringUtils.isNotEmpty(userId) && userId.equals("mdx123456")){
            return "O111222333444";
        }
        return "订单不存在";
    }
}


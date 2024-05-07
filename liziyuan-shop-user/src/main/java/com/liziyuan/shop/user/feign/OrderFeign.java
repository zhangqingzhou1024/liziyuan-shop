package com.liziyuan.shop.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zqz
 * @date 2024-05-07 18:39
 */
@FeignClient(value = "liziyuan-shop-order")
@Component
public interface OrderFeign {

    @GetMapping("order/getOrderNo")
    String getOrderNo(String userId);

}

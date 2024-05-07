package com.liziyuan.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zqz
 * @date 2024-05-07 16:51
 */
@SpringBootApplication
//@EnableFeignClients
@EnableDiscoveryClient
public class LiZiYuanShopOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiZiYuanShopOrderApplication.class, args);
        System.out.println("===============》LiZiYuanShopOrderApplication 启动成功！《===============");
    }
}

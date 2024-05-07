package com.liziyuan.shop.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zqz
 * @date 2024-05-07 16:51
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LiZiYuanShopUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiZiYuanShopUserApplication.class, args);
        System.out.println("===============》LiZiYuanShopUserApplication 启动成功！《===============");
    }
}

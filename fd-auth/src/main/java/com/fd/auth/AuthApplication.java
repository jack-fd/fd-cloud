package com.fd.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 权限验证服务
 *
 * @author mq
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AuthApplication extends SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}

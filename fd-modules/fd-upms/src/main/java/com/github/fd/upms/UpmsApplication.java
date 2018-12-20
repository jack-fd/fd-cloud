package com.github.fd.upms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 用户权限系统
 *
 * @author fd
 */
@EnableEurekaClient
@SpringBootApplication
public class UpmsApplication extends SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsApplication.class, args);
    }
}

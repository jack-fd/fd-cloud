package com.github.fd.cipher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置管理
 *
 * @author mq
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class CipherApplication {

    public static void main(String[] args) {
        SpringApplication.run(CipherApplication.class, args);
    }
}

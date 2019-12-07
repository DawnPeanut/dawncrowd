package com.dawn.crowd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//比eurekaclient更通用
@SpringBootApplication
@MapperScan("com.dawn.crowd.mapper")
public class CrowdMainType {
    public static void main(String[] args) {
        SpringApplication.run(CrowdMainType.class, args);
    }
}

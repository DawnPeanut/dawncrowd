package com.dawn.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class CrowdMainType {

    public static void main(String[] args) {
        SpringApplication.run(CrowdMainType.class,args);
    }
}

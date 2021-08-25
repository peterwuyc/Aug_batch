package com.example.eureka01server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//激活Eureka服务器
@EnableEurekaServer
public class Eureka01ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Eureka01ServerApplication.class, args);
    }

}

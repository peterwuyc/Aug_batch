package com.example.springclou01provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springclou01ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springclou01ProviderApplication.class, args);
    }

}

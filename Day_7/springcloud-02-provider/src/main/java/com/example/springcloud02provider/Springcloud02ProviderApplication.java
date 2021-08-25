package com.example.springcloud02provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springcloud02ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud02ProviderApplication.class, args);
    }

}

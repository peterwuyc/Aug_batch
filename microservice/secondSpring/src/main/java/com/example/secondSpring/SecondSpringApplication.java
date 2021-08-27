package com.example.secondSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecondSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondSpringApplication.class, args);
	}

}

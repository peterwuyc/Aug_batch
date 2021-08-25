package com.example.springcloud01consumer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/demo")
    public String getProvider(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://01-EUREKA-PROVIDER/demo",String.class);
        String body = responseEntity.getBody();
        return "Eureka中的消费者-------------" + body;

    }
}

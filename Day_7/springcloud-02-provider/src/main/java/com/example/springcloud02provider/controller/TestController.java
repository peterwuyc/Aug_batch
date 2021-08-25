package com.example.springcloud02provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/demo")
    public String getProvider(){
        return "Eureka中的服务提供者8082";
    }
}

package com.example.springcloud02provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/demo")
    public String getProvider(){
        return "Eureka中的服务提供者8082";
    }
    @GetMapping("/test01")
    public String test01(){
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "沉睡5s的服务提供者";
    }
    @GetMapping("/test02")
    public String test02(){
        String str = null;
        str.length();
        return "带异常的的服务提供者";
    }
}

package com.example.springclou01provider.controller;

import com.example.springclou01provider.controller.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/demo")
    public String getProvider(){
        return "Eureka中的服务提供者";
    }
    @GetMapping("/getUser")
    public Object getUser(User user){
        user.setName("更改");
        System.out.println(user.getName());
        return user;
    }
}

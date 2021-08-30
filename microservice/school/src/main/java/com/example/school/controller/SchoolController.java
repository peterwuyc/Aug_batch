package com.example.school.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/school")
    public String getSchool(){
        return "School"+serverPort;
    }
}

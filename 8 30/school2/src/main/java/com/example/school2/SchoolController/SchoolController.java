package com.example.school2.SchoolController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class SchoolController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/school")
    public  String getSchool(){
        return "school "+ serverPort;
    }
}

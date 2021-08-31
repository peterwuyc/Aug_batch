package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SCHOOL")
@Component
public class FeignService {

    @GetMapping("/school")
    String getSchool();

}

package com.example.spring0813.controller;

import com.example.spring0813.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller2 {

    @Autowired
    private Service service;

    private Service service2;
}

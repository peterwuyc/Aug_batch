package com.example.demo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseController {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        System.out.println(e.getMessage());
        return e.getMessage();
    }

}

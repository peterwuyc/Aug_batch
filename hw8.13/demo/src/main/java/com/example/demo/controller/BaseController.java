package com.example.demo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(NullPointerException e){
        System.out.println("NullPionterException");
        return "NullPionterException";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        System.err.println(e.getMessage());
        return "Exception";
    }
}

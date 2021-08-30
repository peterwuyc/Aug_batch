package com.example.demo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


public class Ehandler {
    @ExceptionHandler(Exception.class)
    public String allException(Exception e){
        System.err.println("Somebody better fix this");
        return "Somebody better fix this";
    }
}

package com.example.secondSpring.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//----------------------
//8.12 全局化处理
//--------------------
@RestControllerAdvice
public class BaseController {
    //--------------------------------------------
    //8.13 hibernate[!米国] mybatis ORM
    //------------------------------------------

    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(NullPointerException e){
        System.out.println("NullPointerException");
        return "NullPointerException";
    }
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        System.err.println(e.getMessage());
        return "Exception";
    }
}

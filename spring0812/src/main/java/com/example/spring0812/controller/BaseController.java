package com.example.spring0812.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//----------------------
//8.12 全局化处理
//--------------------
@RestControllerAdvice
public class BaseController {

    //全局化处理 exception
    //从子类开始 抛出
    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(NullPointerException e){
        System.out.println("NullPointerException");
        return  "error is "+e.getMessage() + " data";
    }

    //8.12 assignment 自由发挥
    //自己写exception
    //在service里故意抛出
    @ExceptionHandler(ArrayIndexOutOfBoundsException .class)
    public String handleArrayIndexOutOfBoundsException (ArrayIndexOutOfBoundsException  e){
        //if(e)
        System.err.println("ArrayIndexOutOfBoundsException ");
        return e.getMessage();
    }

    //exception大类
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        //if(e)
        System.err.println("Exception");
        return e.getMessage();
    }

}

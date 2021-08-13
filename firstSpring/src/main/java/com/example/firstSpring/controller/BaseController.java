package com.example.firstSpring.controller;

import com.example.firstSpring.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.controller
 * @ClassName : BaseController.java
 * @createTime : 2021/8/12 15:15
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */
@RestControllerAdvice
public class BaseController {

    //全局化处理 exception
    //从子类开始 抛出
    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(NullPointerException e){
        System.out.println("NullPointerException");
        return  "error is "+e.getMessage() + " data";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        //if(e)
        System.err.println("Exception");
        return e.getMessage();
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






}

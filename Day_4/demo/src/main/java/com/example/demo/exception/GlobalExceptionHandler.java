package com.example.demo.exception;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = NullPointerException.class)
    public String handelException(NullPointerException e){
        System.err.println(e.getMessage());
        return "Null Pointer Exception";
    }

    @ExceptionHandler(value = ArrayIndexOutOfBoundsException.class)
    public String handelException(ArrayIndexOutOfBoundsException e){
        System.err.println(e.getMessage());
        return "ArrayIndex Out Of Bounds Exception";
    }
}

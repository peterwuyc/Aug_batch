package com.example.secondSpring.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("my student Interceptor!");
//        //response.setStatus(401);
//        return HandlerInterceptor.super.preHandle(request, response, handler);
        //return false;
        return true;
    }

}

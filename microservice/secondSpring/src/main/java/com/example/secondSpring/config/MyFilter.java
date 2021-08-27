package com.example.secondSpring.config;

import com.example.secondSpring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {

    @Autowired
    private Service service;

    //不用管
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String index = request.getParameter("index");
        //String index = servletRequest.getParameter("index");
        if(index.equalsIgnoreCase("10")) throw new RuntimeException("error");
        System.out.println(index);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    //不用管
    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}

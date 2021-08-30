package com.example.demo.config;

import javax.servlet.*;
import java.io.IOException;

public class FilterStudent implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String index=servletRequest.getParameter("index");
        if(index.equalsIgnoreCase("666")){
            throw new RuntimeException("EEEEEEEEEEEErrror");
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}

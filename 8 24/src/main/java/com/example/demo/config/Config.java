package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

@Configuration
public class Config {
    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();

        filterRegistrationBean.setFilter(new FilterStudent());
        filterRegistrationBean.setOrder(2);
        filterRegistrationBean.addUrlPatterns("/student/*");

        filterRegistrationBean.setFilter(new FilterTeacher());
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.addUrlPatterns("/teacher/*");

        return filterRegistrationBean;
    }

}

package com.example.secondSpring.config;

import com.example.secondSpring.entity.Student;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    //------------------------
    //8.12 需要被IOC的容器
    //-----------------------
    @Bean
    public Student getStudent1(){
        return new Student(3,"Cat",23);
    }
    @Bean
    public Student getStudent2(){
        return new Student(4,"Dog",24);
    }
    @Bean(name="thirdIOC")
    public Student getStudent3(){
        return new Student(5,"thirdIOC",25);
    }

    //8.19 filter
    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setOrder(1);
        //filterRegistrationBean.addUrlPatterns("/**"); //any paths
        filterRegistrationBean.addUrlPatterns("/gp/*");
        return filterRegistrationBean;
    }

    //8.26
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}

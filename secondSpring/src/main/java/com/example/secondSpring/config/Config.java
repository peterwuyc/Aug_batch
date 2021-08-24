package com.example.secondSpring.config;

import com.example.secondSpring.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

}

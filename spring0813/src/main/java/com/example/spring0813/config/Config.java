package com.example.spring0813.config;

import com.example.spring0813.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Student getStudent(){
        return new Student(2,"siyang",30);
    }
}

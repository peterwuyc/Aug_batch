package com.example.spring0812.config;

import com.example.spring0812.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Student getStudent(){
        return new Student(2,"siyang",30);
    }
}

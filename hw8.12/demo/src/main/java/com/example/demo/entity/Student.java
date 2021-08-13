package com.example.demo.entity;

import org.springframework.context.annotation.Bean;

public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Bean
    public Integer getId() {
        return id;
    }
    @Bean
    public String getName() {
        return name;
    }
    @Bean
    public Integer getAge() {
        return age;
    }
    @Bean
    public void setId(Integer id) {
        this.id = id;
    }
    @Bean
    public void setName(String name) {
        this.name = name;
    }
    @Bean
    public void setAge(Integer age) {
        this.age = age;
    }
}

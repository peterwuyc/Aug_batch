package com.example.demo.config;

import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

//    @Bean
//    public Student getStudent(){
//        return new Student(2,"abd",28);
//    }
//    The following candidates were found but could not be injected:
//            - User-defined bean method 'getStudent' in 'Config'



//    @Bean
//    public Student getStudent2(){
//        return new Student(3,"iop",26);
//    }
//     Controller.java :
//   @Autowired
//   @Qualifier("getStudent2")
//   private Student student;
//     or
//     @Bean(name="tyu")
//    public Student getStudent2(){
//        return new Student(3,"iop",26);
//    }
//     Controller.java :
//   @Autowired
//   @Qualifier("tyu")
//   private Student student;



}

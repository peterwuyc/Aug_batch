package com.example.firstSpring.Config;

import com.example.firstSpring.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.Config
 * @ClassName : Config.java
 * @createTime : 2021/8/12 14:28
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 *  实例化
 */
@Configuration
public class Config {

    /**
     * l两个bean时候
     * controller那边的@autowired就不知道去哪个了
     * @Autowired
     * @Qualifier("getStudent2")
     * */
//    @Bean //一个实例
//    public Student getStudent1(){
//        return new Student(2, "siyang",25);
//    }

/*
    @Bean //一个实例
    public Student getStudent2(){
        return new Student(3, "ruochao",30,[]);
    }*/

}

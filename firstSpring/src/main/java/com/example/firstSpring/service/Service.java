package com.example.firstSpring.service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.service
 * @ClassName : Service.java
 * @createTime : 2021/8/10 14:25
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */

import com.example.firstSpring.entity.Student;

import java.util.*;
public interface Service {

    List<Student> getAllElements();
    Student getElementByKey(Integer key);
    void updateElementByKey(Integer key, Student student);
    void createElement(Integer key, Student student);
    void deleteElementByKey(Integer key);
}

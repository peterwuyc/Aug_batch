package com.example.secondSpring.dao;

import com.example.secondSpring.entity.Student;

import java.util.List;

public interface Dao {

    List<Student> getAllElement();
    Student getElementByKey(Integer key);
    void createElement(Integer key, Student student);
    void updateElementByKey(Integer key, Student student);
    void deleteElementByKey(Integer key);
}

//在连入DB之后Dao就被抛弃了

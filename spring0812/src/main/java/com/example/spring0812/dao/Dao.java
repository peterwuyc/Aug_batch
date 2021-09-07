package com.example.spring0812.dao;

import com.example.spring0812.entity.Student;

import java.util.List;

public interface Dao {
    List<Student> getAllElement();
    Student getElementByKey(Integer key);
    void updateElementByKey(Integer key, Student student);
    void createElement(Integer key, Student student);
    void deleteElementByKey(Integer key);
}

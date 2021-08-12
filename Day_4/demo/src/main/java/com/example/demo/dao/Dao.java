package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface Dao {
    List<Student> getAllElements();
    Student getElementByKey(Integer id);
    void updateElementByKey(Integer id, Student student);
    void createElement(Integer id, Student student);
    void deleteElementByKey(Integer id);
}

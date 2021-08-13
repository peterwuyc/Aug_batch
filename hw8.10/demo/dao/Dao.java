package com.example.demo.dao;



import com.example.demo.entity.Student;

import java.util.List;

public interface Dao {
    List<Student> getAllElements();
    Student getElementByKey(Integer Key);
    void updateElementByKey(Integer key,Student student);
    void createElement(Integer Key,Student student);
    void deleteElementByKey(Integer key);
}

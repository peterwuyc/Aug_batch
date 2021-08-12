package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface Dao {
    List getAllElements();
    Student getElementByKey(Integer key) throws Exception;
    void updateElementByKey(Integer key, Student student) throws Exception;
    void createElement(Integer key,Student student) throws Exception;
    void deleteElementByKey(Integer key) throws Exception;

}

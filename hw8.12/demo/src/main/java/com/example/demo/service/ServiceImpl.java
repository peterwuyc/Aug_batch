package com.example.demo.service;

import com.example.demo.dao.Dao;
import com.example.demo.dao.DaoImpl;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    @Autowired
    private Dao dao;

    @Override
    public void updateElementByKey(Integer key, Student student) {
        dao.updateElementByKey(key,student);
    }

    @Override
    public void deleteElementByKey(Integer key) {
        dao.deleteElementByKey(key);
    }

    @Override
    public Student getElementByKey(Integer key) {
        return dao.getElementByKey(key);
    }

    @Override
    public void createElement(Integer key, Student student) {
        dao.createElement(key,student);
    }

    @Override
    public List<Student> getAllElements() {
        return dao.getAllElements();
    }
}

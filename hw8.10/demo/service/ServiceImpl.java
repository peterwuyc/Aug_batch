package com.example.demo.service;

import com.example.demo.dao.Dao;
import com.example.demo.dao.DaoImpl;
import com.example.demo.entity.Student;

import java.util.List;

public class ServiceImpl implements Service{

    Dao dao = new DaoImpl();

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

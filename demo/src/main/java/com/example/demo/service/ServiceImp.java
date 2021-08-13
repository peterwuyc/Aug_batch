package com.example.demo.service;

import com.example.demo.dao.Dao;
import com.example.demo.dao.DaoImp;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImp implements Service{
    @Autowired
    private Dao dao;

    public ServiceImp( ){

    }
    @Override
    public List getAllElements() {
        return dao.getAllElements();
    }

    @Override
    public Student getElementByKey(Integer key) throws Exception {
        return dao.getElementByKey(key);
    }

    @Override
    public void updateElementByKey(Integer key, Student student) throws Exception {
        dao.updateElementByKey(key,student);
    }

    @Override
    public void createElement(Integer key, Student student) throws Exception {
        dao.createElement(key,student);
    }

    @Override
    public void deleteElementByKey(Integer key) throws Exception {
        dao.deleteElementByKey(key);
    }
}
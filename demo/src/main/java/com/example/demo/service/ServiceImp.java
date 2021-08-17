package com.example.demo.service;

import com.example.demo.dao.Dao;
import com.example.demo.dao.DaoImp;
import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImp implements Service{
    @Autowired
    private Dao dao;

    @Autowired
    private StudentRepo studentRepo;

    public ServiceImp( ){

    }
    @Override
    public List getAllElements() {
        //return dao.getAllElements();
        return studentRepo.findAll();
    }

    @Override
    public Student getElementByKey(Integer key) throws Exception {
        return studentRepo.getById(key);
    }

    @Override
    public void updateElementByKey(Integer key, Student student) throws Exception {
        //.updateElementByKey(key,student);
        studentRepo.save(student);
    }

    @Override
    public void createElement(Integer key, Student student) throws Exception {
        studentRepo.save(student);
    }

    @Override
    public void deleteElementByKey(Integer key) throws Exception {
        studentRepo.deleteById(key);
    }
}
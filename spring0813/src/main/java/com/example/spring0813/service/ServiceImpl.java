package com.example.spring0813.service;

import com.example.spring0813.dao.Dao;
import com.example.spring0813.dao.StudentRepo;
import com.example.spring0813.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    //---------------------
    //8.12 ways of Dependency Injection
    //----------------------

    //way 1
//    @Autowired
//    private Dao dao;// = new DaoImpl();

    //way 2
    private Dao dao;
    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    //way 3
//    private Dao dao;
//    @Autowired
//    public ServiceImpl(Dao dao) {
//        this.dao = dao;
//    }

    //8.13
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllElements() {
        return studentRepo.findAll();
        //dao.getAllElement();
    }

    @Override
    public Student getElementByKey(Integer key) {
        return dao.getElementByKey(key);
    }

    @Override
    public void updateElementByKey(Integer key, Student student) {
        dao.updateElementByKey(key,student);
    }

    @Override
    public void createElement(Integer key, Student student) {
        dao.createElement(key, student);

    }

    @Override
    public void deleteElementByKey(Integer key) {
        dao.deleteElementByKey(key);
    }
}

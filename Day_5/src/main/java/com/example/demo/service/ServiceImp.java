package com.example.demo.service;



import com.example.demo.dao.Dao;
import com.example.demo.dao.DaoImp;
import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@org.springframework.stereotype.Service
@Service
public class ServiceImp implements DemoService {
//    @Autowired
//    private Dao dao;
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List getAllElements() {
        List<String> elements = new ArrayList(studentRepo.findAll());
        return elements;
    }

    @Override
    public void updateElementByKey(Integer id, Student student){
        studentRepo.save(student);

    }

    @Override
    public void createElement(Integer id, Student student) {
        studentRepo.save(student);

    }

    @Override
    public void deleteElementByKey(Integer id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Student getElementByKey(Integer id) {
        return studentRepo.getById((id));
    }

}

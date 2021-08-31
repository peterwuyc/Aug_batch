package com.example.demo.service;

import com.example.demo.dao.Dao;
import com.example.demo.dao.DaoImp;
import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

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
    public Student getElementByKey(Integer id) throws Exception {

        //Optional<Student> optionalStudent = studentRepo.findById(id);
        return studentRepo.findStudentById(id);
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

    @Override
    public Page<Student> getStudentPage(int index,int size) {
        Sort.Order nameSort = new Sort.Order(Sort.Direction.ASC,"name");
        Sort.Order idSort = new Sort.Order(Sort.Direction.ASC,"id");
        return studentRepo.findStudentPage(PageRequest.of(index,size,Sort.by(nameSort,idSort)));
    }
}
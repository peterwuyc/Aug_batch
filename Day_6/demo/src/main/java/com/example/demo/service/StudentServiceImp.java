package com.example.demo.service;



import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {
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

        return studentRepo.getById(id);
    }

    @Override
    public Page<Student> getStudentByPage(int size, int index) {
        int id = 20;
        Sort.Order sort = new Sort.Order(Sort.Direction.ASC, "name");
        return studentRepo.findAllByPage(id, PageRequest.of(index, size, Sort.by(sort)));
    }

}

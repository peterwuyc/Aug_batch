package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentBodyRequest;
import com.example.demo.service.Service;
import com.example.demo.service.ServiceImp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service service;// = new ServiceImp();


    @GetMapping(value = "/gp/student")
    public ResponseEntity<Student> get(@RequestParam("id")Integer id) throws Exception {
        Student student = service.getElementByKey(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping(value = "/gp/student", consumes = {"application/json"})
    public String post(@RequestBody StudentBodyRequest request) throws Exception {
        Student student = new Student();
        BeanUtils.copyProperties(request,student);
        service.createElement(student.getId(),student);
        return "successful create";

    }

    @DeleteMapping(value = "/gp/student")
    public String delet(@RequestParam("id")Integer id) throws Exception {
        service.deleteElementByKey(id);
        return "successful delete";
    }

    @PutMapping(value = "/gp/student")
    public String put(@RequestBody StudentBodyRequest request) throws Exception {
        Student student = new Student();
        BeanUtils.copyProperties(request,student);
        service.updateElementByKey(student.getId(),student);
        return "successful update";
    }

    @GetMapping(value = "/gp/student/all")
    public List get(){
        return service.getAllElements();
    }
}

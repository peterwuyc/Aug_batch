package com.example.firstSpring.controller;
import com.example.firstSpring.entity.Student;
import com.example.firstSpring.entity.studentBodyRequest;
import com.example.firstSpring.service.Service;
import com.example.firstSpring.service.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0

 */
@RestController
public class Controller {
    Service service = new ServiceImpl();

    @GetMapping(value = "/gp/student")
    public String get(){
       //student student = new student();
        return "Example Get Success";
    }

    @GetMapping(value = "/gp/students")
    //internet fail
    public List<Student> getAllStudent(){
        //student student = new student();
        return service.getAllElements();
    }

    @GetMapping(value = "gp/student/{id}")
    public Student getByID(@PathVariable Integer id){
        return service.getElementByKey(id);
    }


    @PostMapping(value = "/gp/student")
    public String post(@RequestBody studentBodyRequest request){
        Student student = new Student( ) ;
        BeanUtils.copyProperties(request, student);
        service.createElement(request.getId(), student);
        return "Post Success";
    }

    //assigment 8.10
    @PutMapping(value = "/gp/updateStudent")
    public String put(@RequestBody studentBodyRequest request){
        Student student = new Student( ) ;
        BeanUtils.copyProperties(request, student);
        service.createElement(request.getId(), student);
        return "Put Success";
    }
    //assignment 8.10
    @DeleteMapping(value="/gp/delete/{id}")
    public String delete(@RequestBody  studentBodyRequest request) {
        service.deleteElementByKey(request.getId());
        return "Delete Success";
    }
}
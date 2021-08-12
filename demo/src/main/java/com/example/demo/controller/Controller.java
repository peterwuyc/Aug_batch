package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentBodyRequest;
import com.example.demo.service.Service;
import com.example.demo.service.ServiceImp;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    Service service = new ServiceImp();


    @GetMapping(value = "/gp/student")
    public String get(@RequestParam("id")Integer id){
        try {
            service.getElementByKey(id);
            return "successful get";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @PostMapping(value = "/gp/student", consumes = {"application/json"})
    public String post(@RequestBody StudentBodyRequest request){
        Student student = new Student();
        BeanUtils.copyProperties(request,student);
        try {
            service.createElement(student.getId(),student);
            service.getAllElements();
            return "successful create";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @DeleteMapping(value = "/gp/student")
    public String delet(@RequestParam("id")Integer id){
        try {
            service.deleteElementByKey(id);
            service.getAllElements();
            return "successful delete";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @PutMapping(value = "/gp/student")
    public String put(@RequestBody StudentBodyRequest request){
        Student student = new Student();
        BeanUtils.copyProperties(request,student);
        try {
            service.updateElementByKey(student.getId(),student);
            service.getAllElements();
            return "successful update";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    @GetMapping(value = "/gp/student/all")
    public List get(){
        return service.getAllElements();
    }
}

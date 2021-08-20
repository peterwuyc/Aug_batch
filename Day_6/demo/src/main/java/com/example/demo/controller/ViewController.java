package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ViewController {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/t")
    public String hello(Map<String, String> map, @RequestParam(name = "id") Integer id){
        Student student = studentService.getElementByKey(id);
        map.put("name",student.getName());
        return "hello";
    }
}

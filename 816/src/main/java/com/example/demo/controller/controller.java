package com.example.demo.controller;
import com.example.demo.entity.StudentBodyRequest;
import com.example.demo.entity.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.Service;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private Service service;


    @PutMapping(value = "/gp/student/{id}/{name}/{age}")
    public String post(@PathVariable("id") Integer id, @PathVariable("name") String name, @PathVariable("age") Integer age)
    {
        service.createNewStudent(id,name,age);
        return "done add";
        /*
        http://localhost:8080/gp/student/11
         */
    }
    @PostMapping(value = "/gp/student/")
    public String put(@RequestBody StudentBodyRequest body)
    {

        service.updateStudent(body.getId(), body.getName(), body.getAge());
        return "done update";
    }
    @GetMapping(value = "/gp/student/{id}")
    public String get1(@PathVariable("id") Integer id){
        service.getOneStudent(id);
        return "done get1";
    }
    @GetMapping(value = "/gp/student/")
    public List<student> getall(){
        System.out.println(">>>>>>>>>ADAWDADAWDAD");
        return service.getAllStudent();
    }
    @DeleteMapping(value = "/gp/student/{id}")
    public String  delete(@PathVariable("id") Integer id){
        return service.deleteStudent(id);
    }

}

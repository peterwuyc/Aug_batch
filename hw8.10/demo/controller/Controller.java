package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentBodyRequest;
import com.example.demo.service.Service;
import com.example.demo.service.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    Service service = new ServiceImpl();
//       @PostMapping(value="/qp/student")
//    public String post(@RequestParam("id")Integer id, @RequestParam("name")String name, @RequestParam("age")Integer age){
//        Student student=new Student();
//        student.setAge(age);
//        student.setId(id);
//        student.setName(name);
//        service.createElement(id,student);
//        return "success";
//    }



    @PostMapping(value="/qp/student",consumes = {"application/Json"})
    public String post(@RequestBody StudentBodyRequest request){
        Student student=new Student();
        BeanUtils.copyProperties(request,student);
        service.createElement(student.getId(), student);
        return "success";
    }


    @GetMapping(value = "/qp/student/{id}")
    public String get(@PathVariable("id")Integer id) {
        service.getElementByKey(id);    //error
        return "success";
    }

    @PutMapping(value = "/qp/student", consumes = {"application/Json"})
    public String put(@RequestBody StudentBodyRequest request){
        Student student=new Student();
        BeanUtils.copyProperties(request,student);
        service.updateElementByKey(student.getId(), student);
        return "success";
        }

     @DeleteMapping(value = "/qp/student/{id}")
     public void delete(@PathVariable("id")Integer id) {
        service.deleteElementByKey(id);
     }

}
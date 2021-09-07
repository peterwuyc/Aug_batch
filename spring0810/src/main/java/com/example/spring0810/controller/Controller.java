package com.example.spring0810.controller;

import com.example.spring0810.entity.Student;
import com.example.spring0810.entity.StudentBodyRequest;
import com.example.spring0810.service.Service;
import com.example.spring0810.service.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    Service service = new ServiceImpl();

    @GetMapping("/810/get")
    public String getExample(){
        return "get success";
    }
    @PostMapping ("/810/student/{id}/{name}/{age}")
    public String post(@PathVariable("id")Integer id, @PathVariable("name")String name, @PathVariable("age") Integer age){
        Student student = new Student();
        student.setAge(age);
        student.setId(id);
        student.setName(name);
        service.createElement(id, student); //创建
        return "post success";
    }

    @GetMapping("810/student/{id}")
    public Student get(@PathVariable("id")Integer id){
        return service.getElementByKey(id);
    }


    //---------------
    //collect data from postman
    //http://localhost:8001/810/student?id=14&name=cc&age=30
    //----------------
    @PostMapping ("/810/student")
    public String postFromPostman(@RequestParam("id")Integer id,
                                  @RequestParam("name")String name,
                                  @RequestParam("age")Integer age){
        Student student = new Student();
        student.setAge(age);
        student.setId(id);
        student.setName(name);
        service.createElement(id, student); //创建
        return "post success";
    }
    //---------------
    //modify from studentBodyRequest
    //----------------
    @PostMapping(value="810/studentRequest",consumes = {"application/json"})
    public String postRequest(@RequestBody StudentBodyRequest request){
        Student student=new Student();
        BeanUtils.copyProperties(request,student);
        service.createElement(student.getId(), student);
        return "post request success";
    }


    @PutMapping(value = "/810/update", consumes = {"application/json"})
    public String update(@RequestBody StudentBodyRequest request){
        Student student=new Student();
        BeanUtils.copyProperties(request,student);
        service.updateElementByKey(student.getId(), student);

        return "update success";
    }

    @DeleteMapping("/810/deleteStudent/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        service.deleteElementByKey(id);
        return "delete id: "+id+" success";
    }
    @GetMapping(value = "/810/students")
    //8.10 internet error
    public List<Student> getAll(){
        return service.getAllElements();
    }

}

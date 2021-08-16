package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentBodyRequest;
import com.example.demo.service.DemoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private DemoService service;

    @GetMapping(value = "/findStudent/{id}")
    public Student getStudentById(@PathVariable Integer id){

        return service.getElementByKey(id);
    }
    @GetMapping(value = "/ExcpetionTest")
    public void excpetionTest(){
        int[] list = new int[2];
        int cur = list[2];

    }

    @GetMapping(value = "/getAllStudent")
    public List<Student> getAllStudent(){
        return service.getAllElements();
    }

    @PostMapping(value = "/createStudent")
    public void createStudent(@RequestBody StudentBodyRequest request){

        Student student = new Student();
        int id = request.getId();
        BeanUtils.copyProperties(request, student);
        service.createElement(id, student);

    }

    @PutMapping(value = "/UpdateStudent")
//  public void update(@org.jetbrains.annotations.NotNull @RequestBody StudentBodyRequest request)
    public String update(@RequestBody StudentBodyRequest request){
        try{
            Student student = new Student();
            int id = request.getId();
            BeanUtils.copyProperties(request, student);
            service.updateElementByKey(id, student);
            return "Update Success";
        }
        catch (Exception e){
            System.out.println(e);
            return "Update Failed, Something Wrong ";
        }

    }

    @DeleteMapping(value = "/delete")
    public String deleteById(@RequestParam Integer id){
        try{
            service.deleteElementByKey(id);
            return "Delete Success";
        }
        catch (Exception e){
            System.out.println(e);
            return "Delete Failed, Something Wrong ";
        }
    }

}

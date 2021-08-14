package com.example.firstSpring.controller;
import com.example.firstSpring.entity.Student;
import com.example.firstSpring.entity.studentBodyRequest;
import com.example.firstSpring.service.Service;
import com.example.firstSpring.service.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.controller
 * @ClassName : Controller1.java

 */
//标注了一个controller
@RestController
public class Controller {

    //8.12 内容补充
    // inverse of control   IOC 什么是IOC? 控制反转
    //人不管 电脑管
    // dependency injection DI 什么是DI? 依赖注入

    //@autowired 用于很多个service时候用的
    //不用实例化这么多（不用new这么多）
    @Autowired
    private Service service;

    //@Autowired
    //@Qualifier("getStudent2")
    //private Student student;
    //Service service = new ServiceImpl();

    @GetMapping(value = "/gp/student")
    public List<Student> get(){
    //public String get(){
        //8.12
        //人为制造out of bounds array 抛出
//        int[] test = new int[3];
//        test[0] = 10;
//        test[1] = 20;
//        test[2] = 30;
//        test[3] = 40;
        //人为制造空指针 for BaseController
//        Student s=null;
//        s.getId();
//        return student;
        return service.getAllElements();
        //return "simple get success";
    }

    @GetMapping(value = "/gp/students")
    //8.10 internet error
    public List<Student> getAll(){
        return service.getAllElements();
    }

    @GetMapping(value = "gp/student/{id}")
    public Student getByID(@PathVariable Integer id){
        return service.getElementByKey(id);
    }


    @PostMapping(value = "/gp/student")
    public String post(@RequestBody studentBodyRequest request,
                       HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse){
        //8.12 底层
        //http request, response
        //httpServletRequest.get

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
package com.example.secondSpring.controller;

import com.example.secondSpring.entity.Student;
import com.example.secondSpring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
//@RestController = @controller + @ResponseBody [面试考点]
public class ViewController {
    @Autowired
    Service service;

    //@GetMapping("/demo/teacher")
    @RequestMapping(method = RequestMethod.GET,value = "/demo/teacher")
    //如果加了@ResponseBody就不会随跳转到view 不回去搜索模板引擎了
    //@ResponseBody
    public String successPage(Map<String,Object> map){
        service.getAllElement();
        map.put("people","person");
        return "success";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/demo/student")
    //如果加了@ResponseBody就不会随跳转到view 不回去搜索模板引擎了
    //@ResponseBody
    public String studentPage(Map<String,Object> map){
        List<Student> students = service.getAllElement();
        map.put("student", students);
        return "student";
    }
}

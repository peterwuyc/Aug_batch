package com.example.demo.controller;

import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherBodyRequest;
import com.example.demo.service.TeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "/Teacher/getAll")
    public List<Teacher> getAllElement(){
        return teacherService.getAllElement();
    }

    @PostMapping(value = "/Teacher/createElement")
    public void createElement(@RequestBody TeacherBodyRequest request){
        Teacher teacher = new Teacher();
        int id = request.getId();
        BeanUtils.copyProperties(request, teacher);
        teacherService.createElementById(teacher);
    }
    @GetMapping(value = "/Teacher/getById/{id}")
    public Teacher getById(@PathVariable int id){
        return teacherService.getElementById(id);
    }
    @PutMapping(value = "/Teacher/update")
    public void upDateName(@RequestBody TeacherBodyRequest request){
        teacherService.updateElementById(request);
    }
}

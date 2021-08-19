package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentBodyRequest;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherRequestBody;
import com.example.demo.service.TeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    private TeacherService teacherService;
    @Autowired
    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @GetMapping("/demo/teacher/{id}")
    public ResponseEntity<Teacher> findTeacherById(@PathVariable("id") Integer id){
       return ResponseEntity.ok(teacherService.findById(id));
    }

    @PutMapping("/demo/teacher")
    public ResponseEntity<String> updateTeacher(@RequestBody TeacherRequestBody request) throws Exception {
        teacherService.updateTeacher(request);
        return ResponseEntity.ok("success");
    }
}

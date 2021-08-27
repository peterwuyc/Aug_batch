package com.example.secondSpring.controller;

import com.example.secondSpring.entity.Teacher;
import com.example.secondSpring.entity.TeacherRequestBody;
import com.example.secondSpring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/db/teacher/{id}")
    public ResponseEntity<Teacher> findTeacherById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(teacherService.findById(id));
    }

    @PutMapping("/db/teacher")
    public ResponseEntity<String> updateTeacher(@RequestBody TeacherRequestBody teacherRequestBody){
        teacherService.updateTeacher(teacherRequestBody);
        return ResponseEntity.ok("update success");
    }

    @PostMapping("/db/newTeacher")
    public ResponseEntity<String> createTeacher(@RequestBody TeacherRequestBody teacherRequestBody){
        teacherService.createTeacher(teacherRequestBody);
        return ResponseEntity.ok("create success");
    }

//    @DeleteMapping("/db/deleteTeacher/{id}")
//    public ResponseEntity<String> deleteTeacher(@PathVariable("id") Integer id){
//        teacherService.deleteTeacher(teacherService);
//        return "delete success";
//    }

}

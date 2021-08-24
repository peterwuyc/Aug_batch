package com.example.demo.controller;
import com.example.demo.Service.TeacherTableService;
import com.example.demo.Service.TeacherTableServiceImp;
import com.example.demo.entity.TeacherBodyRequest;
import com.example.demo.entity.teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherTableController {
    @Autowired
    private TeacherTableService service;

    @GetMapping("/teacher/{id}")
    public ResponseEntity<teacher> findTeacherByID(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.findByID(id));
    }

    @PutMapping("/teacher")
    public ResponseEntity<String> updateTeacher(@RequestBody TeacherBodyRequest body){
        service.updateTeacher(body);
        return ResponseEntity.ok("success");
    }
}

package com.example.firstSpring.controller;

import com.example.firstSpring.entity.Teacher;
import com.example.firstSpring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.controller
 * @ClassName : TeacherController.java
 * @createTime : 2021/8/16 14:20
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */
//@RestController
//public class TeacherController {
//    @Autowired
//    private TeacherService teacherService;
//    @GetMapping("/demo/teacher/{id}")
//    public ResponseEntity<Teacher> findTeacherById(@PathVariable("id") Integer id){
//
//    }
//}

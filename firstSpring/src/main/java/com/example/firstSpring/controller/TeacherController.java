package com.example.firstSpring.controller;

import com.example.firstSpring.entity.Teacher;
import com.example.firstSpring.entity.TeacherRequestBody;
import com.example.firstSpring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

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
@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    //about 几种传参方式
    @GetMapping("/demo/teacher/{id}")
    //ResponseEntity<返回一个泛型>
    public ResponseEntity<Teacher> findTeacherById(@PathVariable("id")Integer id){
        return ResponseEntity.ok( teacherService.findById(id));
    }

    @PutMapping("/demo/teacher")
    public ResponseEntity<String> updateTeacher(@RequestBody TeacherRequestBody teacherRequestBody){
        teacherService.updateTeacher(teacherRequestBody);
        return ResponseEntity.ok("update success");
        //?
        //about 节省资源

        //ResponseEntity.noContent(); 方便返回各种各样的东西 //204
        //about how to use ResponseEntity
//        ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(204);
//        return bodyBuilder.body("can not found");
    }
}

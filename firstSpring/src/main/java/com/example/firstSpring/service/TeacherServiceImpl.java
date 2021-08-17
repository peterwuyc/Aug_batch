package com.example.firstSpring.service;

import com.example.firstSpring.dao.TeacherRepo;
import com.example.firstSpring.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.service
 * @ClassName : TeacherServiceImpl.java
 * @createTime : 2021/8/16 14:16
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */

//public class TeacherServiceImpl implements TeacherService{
//    private TeacherRepo  teacherRepo;
//    @Autowired
//    public  void setTeacherService(TeacherRepo teacherRepo){
//        this.teacherRepo = teacherRepo;
//    }
//    @Override
//    public Teacher findById(Integer id){
//        Optional<Teacher> optionalTeacher =  TeacherRepo.findById(id);
//        return optionalTeacher.orElse(null);
//    }
//}

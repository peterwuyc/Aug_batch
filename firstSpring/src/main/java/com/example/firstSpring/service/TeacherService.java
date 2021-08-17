package com.example.firstSpring.service;

import com.example.firstSpring.entity.Student;
import com.example.firstSpring.entity.Teacher;
import com.example.firstSpring.entity.TeacherRequestBody;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.service
 * @ClassName : TeacherService.java
 * @createTime : 2021/8/16 14:15
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */

public interface TeacherService {
    //一个操作的表一个repo
    Teacher findById(Integer id);
    void updateTeacher(TeacherRequestBody teacherRequestBody);
    void createTeacher(TeacherRequestBody teacherRequestBody);
    void deleteTeacher(TeacherRequestBody teacherRequestBody);
}

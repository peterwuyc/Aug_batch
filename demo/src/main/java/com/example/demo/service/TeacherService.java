package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherRequestBody;

public interface TeacherService {
    Teacher findById(Integer id);
    void updateTeacher(TeacherRequestBody teacherRequestBody);
}

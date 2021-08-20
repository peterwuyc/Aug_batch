package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherBodyRequest;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllElement();
    Teacher getElementById(int id);
    void updateElementById(TeacherBodyRequest teacherBodyRequest);
    void createElementById(Teacher teacher);
}

package com.example.demo.Service;


import com.example.demo.entity.TeacherBodyRequest;
import com.example.demo.entity.teacher;

public interface TeacherTableService {
    teacher findByID(Integer id);
    void updateTeacher(TeacherBodyRequest body);
}

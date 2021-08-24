package com.example.demo.Service;


import com.example.demo.entity.TeacherBodyRequest;
import com.example.demo.entity.teacher;

import java.util.List;

public interface TeacherTableService {
    teacher findByID(Integer id);
    void updateTeacher(TeacherBodyRequest body);
    List<teacher> getAllTeachers();
    teacher getById(Integer id);
}

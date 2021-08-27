package com.example.secondSpring.service;

import com.example.secondSpring.entity.Teacher;
import com.example.secondSpring.entity.TeacherRequestBody;

import javax.persistence.criteria.CriteriaBuilder;

public interface TeacherService {

    Teacher findById(Integer id);
    void updateTeacher(TeacherRequestBody teacherRequestBody);
    void createTeacher(TeacherRequestBody teacherRequestBody);
    void deleteTeacher(TeacherRequestBody teacherRequestBody);
}

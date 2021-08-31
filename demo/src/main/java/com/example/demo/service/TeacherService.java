package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherRequestBody;
import org.springframework.data.domain.Page;

public interface TeacherService {
    Teacher findById(Integer id);
    void updateTeacher(TeacherRequestBody teacherRequestBody);
    Page<Teacher> getTeacherPage(int index, int size);
}

package com.example.demo.Dao;

import com.example.demo.entity.student;

public interface Dao {

    void createNewStudent(Integer id, String name, Integer age);
    String deleteStudent(Integer id);
    void updateStudent(Integer id, String name, Integer age);
    void getAllStudent();
    student getOneStudent(Integer id);
}

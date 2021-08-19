package com.example.demo.Service;

import com.example.demo.entity.student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface Service {

    void createNewStudent(Integer id, String name, Integer age);
    String deleteStudent(Integer id);
    void updateStudent(Integer id, String name, Integer age);
    List<student> getAllStudent();
    student getOneStudent(Integer id);
    Page<student> findStudentWithPages(Integer index, Integer size);
}

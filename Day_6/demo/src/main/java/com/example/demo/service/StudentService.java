package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface StudentService {
    List<Student> getAllElements(); // 对返回值进行排序，按照升序返回结果 String getElementByKey(Integer key);
    void updateElementByKey(Integer id, Student student);
    void createElement(Integer id, Student student);
    void deleteElementByKey(Integer id);
    Student getElementByKey(Integer id);
    Page<Student> getStudentByPage(int size, int index);
}

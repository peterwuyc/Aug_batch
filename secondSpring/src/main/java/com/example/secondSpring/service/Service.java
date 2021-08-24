package com.example.secondSpring.service;

import com.example.secondSpring.entity.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface Service {

    List<Student> getAllElement();
    Student getElementByKey(Integer key);
    void createElement(Integer key, Student student);
    void updateElementByKey(Integer key, Student student);
    void deleteElementByKey(Integer key);

    //----------------------
    // 8.17 page分页
    //--------------------
    Page<Student> findStudentPage(int index, int size);

}

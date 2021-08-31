package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Service {
    List getAllElements(); // 对返回值进行排序，按照升序返回结果
    Student getElementByKey(Integer key) throws Exception;
    void updateElementByKey(Integer key,Student student) throws Exception;
    void createElement(Integer key,Student student) throws Exception;
    void deleteElementByKey(Integer key) throws Exception;
    Page<Student> getStudentPage(int index,int size);
}

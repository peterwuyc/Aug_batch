package com.example.firstSpring.service;

import com.example.firstSpring.dao.Dao;
import com.example.firstSpring.dao.DaoImpl;
import com.example.firstSpring.entity.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.service
 * @ClassName : ServiceImpl.java
 * @createTime : 2021/8/10 14:38
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */

public class ServiceImpl implements Service{
    private Dao dao = new DaoImpl();
    public ServiceImpl() {
    }


    @Override
    public List<Student> getAllElements() {
        return dao.getAllElement();
    }

    @Override
    public Student getElementByKey(Integer key) {
        return dao.getElementByKey(key);
    }

    @Override
    public void updateElementByKey(Integer key, Student student) {
        dao.updateElementByKey(key, student);
    }

    @Override
    public void createElement(Integer key, Student student) {
        dao.createElement(key,student);
    }

    @Override
    public void deleteElementByKey(Integer key) {
        dao.deleteElementByKey(key);
    }
}

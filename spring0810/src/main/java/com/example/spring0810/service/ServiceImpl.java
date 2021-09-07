package com.example.spring0810.service;

import com.example.spring0810.dao.Dao;
import com.example.spring0810.dao.DaoImpl;
import com.example.spring0810.entity.Student;

import java.util.List;

public class ServiceImpl implements Service {

    private Dao dao = new DaoImpl();

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
        dao.updateElementByKey(key,student);
    }

    @Override
    public void createElement(Integer key, Student student) {
        dao.createElement(key, student);

    }

    @Override
    public void deleteElementByKey(Integer key) {
        dao.deleteElementByKey(key);
    }
}

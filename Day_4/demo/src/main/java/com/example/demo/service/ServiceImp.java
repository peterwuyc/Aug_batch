package com.example.demo.service;



import com.example.demo.dao.Dao;
import com.example.demo.dao.DaoImp;
import com.example.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class ServiceImp implements Service {
    private Dao dao = new DaoImp();

    @Override
    public List getAllElements() {
        List<String> elements = new ArrayList(dao.getAllElements());
        return elements;
    }

    @Override
    public void updateElementByKey(Integer id, Student student){
        dao.updateElementByKey(id, student);

    }

    @Override
    public void createElement(Integer id, Student student) {
        dao.createElement(id, student);

    }

    @Override
    public void deleteElementByKey(Integer id) {
        dao.deleteElementByKey(id);
    }

    @Override
    public Student getElementByKey(Integer id) {
        return dao.getElementByKey(id);
    }
}

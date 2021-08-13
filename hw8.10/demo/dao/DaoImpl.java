package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaoImpl implements Dao {
    private static Map<Integer,Student> map=new HashMap<>();

    @Override
    public void createElement(Integer key, Student student) {
        map.put(key,student);
    }

    @Override
    public Student getElementByKey(Integer key) {
        return map.get(key);
    }

    @Override
    public List<Student> getAllElements() {
        for (Integer i: map.keySet()){
            System.out.print(i);
            System.out.println(map.get(i));
        }
        return null;
    }

    @Override
    public void deleteElementByKey(Integer key) {
        map.remove(key);
    }

    @Override
    public void updateElementByKey(Integer key, Student student) {
        map.put(key, student);
    }
}


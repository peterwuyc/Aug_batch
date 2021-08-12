package com.example.demo.dao;


import com.example.demo.entity.Student;

import java.util.*;

public class DaoImp implements Dao {
    private static Map<Integer, Student> map = new HashMap<Integer,Student>();

    @Override
    public List<Student> getAllElements() {    // 对返回值进行排序，按照升序返回结果
        List<Student> elements = new ArrayList<>();
        for(Map.Entry<Integer, Student> entry :  map.entrySet()){
            elements.add(map.get(entry.getKey()));
        }
        Collections.sort(elements);
        return elements;
    }

    @Override
    public Student getElementByKey(Integer id) {
        return map.get(id);
    }

    @Override
    public void updateElementByKey(Integer id, Student student) {
        map.put(id, student);
    }

    @Override
    public void createElement(Integer key, Student student) {
        map.put(key, student);
    }

    @Override
    public void deleteElementByKey(Integer id) {
        map.remove(id);
    }
}

package com.example.spring0810.dao;

import com.example.spring0810.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaoImpl implements Dao {
    //id student
    private static Map<Integer, Student> map = new HashMap<>();
    @Override
    public List<Student> getAllElement() {
        List<Student> studentList = new ArrayList<>();
        while(!map.isEmpty()){
            for(Map.Entry<Integer, Student> entry:map.entrySet()){
                Integer id = entry.getKey();
                studentList.add(map.get(id));
            }
        }
        return studentList;
    }

    @Override
    public Student getElementByKey(Integer key) {
        return map.get(key);
    }

    @Override
    public void updateElementByKey(Integer key, Student student) {
        map.put(key,student);
    }

    @Override
    public void createElement(Integer key, Student student) {
        map.put(key, student);

    }

    @Override
    public void deleteElementByKey(Integer key) {
        map.remove(key);
    }
}

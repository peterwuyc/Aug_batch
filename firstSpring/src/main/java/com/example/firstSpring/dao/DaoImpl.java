package com.example.firstSpring.dao;

import com.example.firstSpring.entity.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.dao
 * @ClassName : DaoImpl.java
 * @createTime : 2021/8/10 14:27
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */

public class DaoImpl implements Dao {
    private static Map<Integer, Student> map = new HashMap<>();
    public DaoImpl() {
    }

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
        map.put(key,student);
    }

    @Override
    public void deleteElementByKey(Integer key) {
        map.remove(key);
    }
}

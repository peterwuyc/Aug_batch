package com.example.secondSpring.dao;

import com.example.secondSpring.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

@Repository //8.12
public class DaoImpl implements Dao{

    private static Map<Integer,Student> map = new HashMap<>();

    //----------------------------
    //8.17 改成page to do
    //----------------------------
    @Override
    public List<Student> getAllElement() {
        if(map.keySet().size()==0){
            System.out.println("Empty Map");
        }
        List<Student> res = new ArrayList<Student>();
        for(Integer i:map.keySet()){
            System.out.println(i+" "+map.get(i));
            res.add(map.get(i));
        }
        return res;
    }

    @Override
    public Student getElementByKey(Integer key) {
        return map.get(key);
    }

    @Override
    public void createElement(Integer key, Student student) {
        map.put(key, student);

    }

    @Override
    public void updateElementByKey(Integer key, Student student) {
        map.put(key, student);
    }

    @Override
    public void deleteElementByKey(Integer key) {
        map.remove(key);
    }
}

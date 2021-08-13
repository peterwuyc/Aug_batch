package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DaoImp implements Dao{
    private Map<Integer,Student> map;

    public DaoImp() {
        map  = new HashMap<Integer, Student>();
    }

    @Override
    public List getAllElements() {
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
    public Student getElementByKey(Integer key) throws Exception {
        if(!map.containsKey(key)){
            throw new Exception("Key does not exist");
        }else{
            return (map.get(key));
        }

    }


    @Override
    public void updateElementByKey(Integer key, Student student) throws Exception {
        if(!map.containsKey(key)){
            throw new Exception("Key does not exist");
        }
        map.put(key,student);
    }

    @Override
    public void createElement(Integer key, Student student) throws Exception {
        if(map.containsKey(key)){
            throw new Exception("Key exist");
        }
        map.put(key,student);
    }

    @Override
    public void deleteElementByKey(Integer key) throws Exception {
        if(!map.containsKey(key)){
            throw new Exception("Key does not exist");
        }
        map.remove(key);
    }
}
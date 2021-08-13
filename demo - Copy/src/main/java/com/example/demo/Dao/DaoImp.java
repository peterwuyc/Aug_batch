package com.example.demo.Dao;

import com.example.demo.entity.student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DaoImp implements Dao {
    student student;
    Map<Integer, student> map=new HashMap<>();

    @Override
    public void createNewStudent(Integer id, String name, Integer age) {
        student=new student(id,name,age);
        map.put(id,student);
        System.out.print(id + " created.\n");
    }

    @Override
    public String deleteStudent(Integer id) {
        if(map.containsKey(id)){
            System.out.print(id + " removed.\n");
            map.remove(id);
            return "id+ removed.";
        }else{
            System.out.print(id + " not found.\n");
            return id + "not found";
        }
    }

    @Override
    public void updateStudent(Integer id, String name, Integer age) {
        if(map.containsKey(id)){
            System.out.print("Student " + name + " has been updated.\n");
            student=new student(id,name,age);
            map.put(id, student);
        }
        else{System.out.print("Student "+ name + " not exist. No op.\n");}
    }

    @Override
    public void getAllStudent() {

    }

    @Override
    public student getOneStudent(Integer id) {
        if(map.containsKey(id)){
            System.out.print(id + " is " + map.get(id) +"\n");
            return map.get(id);
        }
        else{
            System.out.print(id + " not found.\n");
            return null;
        }
    }
}

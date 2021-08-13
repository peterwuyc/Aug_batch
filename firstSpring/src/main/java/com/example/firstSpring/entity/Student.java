package com.example.firstSpring.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.entity
 * @ClassName : Student.java
 * @createTime : 2021/8/10 15:30
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    //8.12
    private List<String> list=new ArrayList<>();
    //private List<Student> students = new ArrayList<>();

    public Student(){}

    public Student(Integer id, String name, Integer age, List<String> list){
        this.id = id;
        this.name = name;
        this.age = age;
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Result{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

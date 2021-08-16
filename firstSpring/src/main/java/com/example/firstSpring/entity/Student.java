package com.example.firstSpring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
//8.13
//for jpa
@Entity
@Table(name = "student")
//一个类对应一个表
public class Student {
    //8.13映射数据库
    //table里面的primary key@Id
    @Id
    private Integer id; //查找时候就默认这个
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

    //8.12
    //private List<String> list=new ArrayList<>();
    //private List<Student> students = new ArrayList<>();

    public Student(){}

    public Student(Integer id, String name, Integer age, List<String> list){
        this.id = id;
        this.name = name;
        this.age = age;
        //this.list = list;
    }

//    public List<String> getList() {
//        return list;
//    }

//    public void setList(List<String> list) {
//        this.list = list;
//    }

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

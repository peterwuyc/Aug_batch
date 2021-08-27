package com.example.secondSpring.entity;

import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//-------------------------
//8.13 映射DB
//Entity Table Id Column
//-------------------------
@Entity
@Table(name="student")
@Where(clause = "is_deleted=false")
public class Student {

    @Id
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {

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
}

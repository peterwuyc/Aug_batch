package com.example.demo.entity;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student implements Comparable<Student> {
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Id
    private int id;

    public Student() {
    }

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }



//    @Override
//    public int compareTo(@NotNull Student o) {
//        return this.name.compareTo(o.getName());
//    }
    @Override
    public int compareTo(@NotNull Student o) {
        return this.getId() - o.getId();
    }
}

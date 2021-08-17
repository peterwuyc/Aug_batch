package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="student")
public class student {
    @Id
    int id;
    @Column(name="Name")
    String name;
    @Column(name="Age")
    int age;

    public student(int i, String nam, int ag){

        id=i;
        name=nam;
        age=ag;

    }

    public student() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

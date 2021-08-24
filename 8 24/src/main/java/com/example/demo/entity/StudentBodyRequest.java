package com.example.demo.entity;

public class StudentBodyRequest {
    int id;
    String name;
    int age;

    public StudentBodyRequest(int i, String nam, int ag){

        id=i;
        name=nam;
        age=ag;

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

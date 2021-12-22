package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

     @Id
     private Integer id;
     @Column(name = "name")
     private String name;
     @Column(name = "age")
     private Integer age;

     public Student() {
     }

     public Student(Integer id, String name, Integer age) {
          this.id = id;
          this.name = name;
          this.age = age;
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
     public int hashCode(){
          return 0;
     }



}

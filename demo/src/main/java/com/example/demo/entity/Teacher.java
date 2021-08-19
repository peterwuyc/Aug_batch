package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teacher")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Teacher {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;

    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "class_id")
    private MyClass myClass;

    @ManyToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinTable(name = "teacher_student_map",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> students = new HashSet<>();

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

    public MyClass getMyClass() {
        return myClass;
    }

    public void setMyClass(MyClass myClass) {
        this.myClass = myClass;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}

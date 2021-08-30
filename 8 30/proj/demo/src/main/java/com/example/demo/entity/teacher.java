package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="teacher")
public class teacher {
    @Id
    private Integer id;
    @Column(name="name")
    private String name;

    @OneToOne
    @JoinColumn(name="class_id")
    private siyangclass siyangclass;

    @ManyToMany
    @JoinTable(name="teacher_student_map",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name="student_id"))
    private Set<student> students=new HashSet<>();

    public Set<student> getStudents() {
        return students;
    }

    public void setStudents(Set<student> students) {
        this.students = students;
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

    public com.example.demo.entity.siyangclass getSiyangclass() {
        return siyangclass;
    }

    public void setSiyangclass(com.example.demo.entity.siyangclass siyangclass) {
        this.siyangclass = siyangclass;
    }
}

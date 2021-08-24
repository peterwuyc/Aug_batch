package com.example.secondSpring.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Teacher {
    @Id
    private Integer id;
    @Column(name="name")
    private String name;

    //------------------------
    //8.16 映射另外的表
    //-----------------------
    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
//    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="class_id")
    private MyClass myClass;

    //-----------------
    @ManyToMany(cascade = {},fetch=FetchType.EAGER)
    @JoinTable(name="teacher_student_map",
                joinColumns = @JoinColumn(name="teacher_id"),
                    inverseJoinColumns = @JoinColumn(name="student_id"))
    private Set<Student> student = new HashSet<>();


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

    public Set<Student> getStudent() {
        return student;
    }

    public void setStudent(Set<Student> student) {
        this.student = student;
    }
}

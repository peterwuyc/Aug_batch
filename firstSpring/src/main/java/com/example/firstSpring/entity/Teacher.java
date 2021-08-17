package com.example.firstSpring.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.entity
 * @ClassName : Teacher.java
 * @createTime : 2021/8/16 14:12
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */
@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    private Integer id;
    @Column(name="name")
    private String name;

    //为了拿关联数据
    //FetchType.EAGER 直接加载
    //@OneToOne(fetch = FetchType.LAZY) //lazy loading
    //all = 所有集
    @OneToOne(cascade = {CascadeType.ALL} ,fetch = FetchType.EAGER)
    //about lazy loading
    //proxy代理对象,
    //外键关联
    @JoinColumn(name="class_id")
    private MyClass myClass;

    //manytomany
    @ManyToMany(cascade = {},fetch = FetchType.EAGER)
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

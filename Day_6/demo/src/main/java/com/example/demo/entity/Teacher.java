package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
@Table(name = "teacher")
public class Teacher{
    @Id
    private int id;
    @Column(name = "name")
    private String name;
/////////////////////////////////////
////////以course为外键////////////////
//    @Column(name = "course")
//    private String course;
/////////////////////////////////////
    @Column(name = "age")
    private String age;


    @ManyToMany(cascade = {}, fetch = FetchType.LAZY)
    @JoinTable(name = "student_course_mapping",
                joinColumns = @JoinColumn(name = "course_id"),
                inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> studentSet;

//////////////////////////////////////////////////////////////////////
//////////////////////连接到course_info///////////////////////////////
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "course")
    private CourseInfo courseInfo;

    public CourseInfo getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

////////////////////////////////////////////////////////////////////////
//////////连接到Course表/////////////////////////////////////////////////
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "course_id")
//    private Courses courses;
//
//    public Courses getCourses() {
//        return courses;
//    }
//
//    public void setCourses(Courses courses) {
//        this.courses = courses;
//    }

//    public String getCourse() {
//        return course;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }
///////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////
    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

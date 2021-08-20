package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_course_mapping")
public class StudentCourseMapping {
    @Id
    private int id;
    @Column(name = "student_id")
    private int studentID;
    @Column(name = "course_id")
    private String courseId;
}

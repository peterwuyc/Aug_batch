package com.example.demo.service;

import com.example.demo.dao.TeacherRepo;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherBodyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImp implements TeacherService {
    private TeacherRepo teacherRepo;
    @Autowired
    public void setTeacherRepo(TeacherRepo teacherRepo){
        this.teacherRepo = teacherRepo;

    }

    @Override
    public List<Teacher> getAllElement() {
        return teacherRepo.findAll();
    }

    @Override
    public Teacher getElementById(int id) {
        return teacherRepo.getById(id);
    }

    @Override
    public void updateElementById(TeacherBodyRequest teacherBodyRequest) {
        int id = teacherBodyRequest.getId();
        String name = teacherBodyRequest.getName();
        Teacher teacher = teacherRepo.findById(id).get();
        teacher.setName(name);
        teacher.setCourseInfo(teacherBodyRequest.getCourseInfo());
        teacherRepo.save(teacher);


    }

    @Override
    public void createElementById(Teacher teacher) {
        teacherRepo.save(teacher);

    }
}

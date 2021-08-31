package com.example.demo.service;

import com.example.demo.dao.TeacherRepo;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImp implements TeacherService {

    private TeacherRepo teacherRepo;
    @Autowired
    public void setTeacherRepo(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @Override
    public Teacher findById(Integer id) {
        Optional<Teacher> optionalTeacher = teacherRepo.findById(id);
        return optionalTeacher.orElse(null);
        //return teacherRepo.getById(id);
    }

    @Override
    public void updateTeacher(TeacherRequestBody teacherRequestBody) {
            Teacher teacher = teacherRepo.findById(teacherRequestBody.getId()).get();
            teacher.setName(teacherRequestBody.getName());
            teacher.setMyClass(teacherRequestBody.getMyClass());
            teacherRepo.save(teacher);
    }

    @Override
    public Page<Teacher> getTeacherPage(int index, int size) {
        return null;
    }
}

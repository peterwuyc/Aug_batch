package com.example.secondSpring.service;

import com.example.secondSpring.dao.TeacherRepo;
import com.example.secondSpring.entity.Teacher;
import com.example.secondSpring.entity.TeacherRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{

    private TeacherRepo teacherRepo;

    @Autowired
    public void setTeacherRepo(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @Override
    public Teacher findById(Integer id) {
        Optional<Teacher> optionalTeacher = teacherRepo.findById(id);
        return optionalTeacher.orElse(null);
//        optionalTeacher.isPresent()
//        optionalTeacher.isEmpty();
    }

    @Override
    public void updateTeacher(TeacherRequestBody teacherRequestBody) {
        Teacher teacher = teacherRepo.findById(teacherRequestBody.getId()).get();
        teacher.setName(teacherRequestBody.getName());
        teacher.setMyClass(teacherRequestBody.getMyClass());
        System.out.println(teacher.getMyClass().getName());
        teacherRepo.save(teacher);
    }

    @Override
    public void createTeacher(TeacherRequestBody teacherRequestBody) {
        Teacher teacher = new Teacher();// = teacherRepo.findById(teacherRequestBody.getId()).get();
        teacher.setId(teacherRequestBody.getId());
        teacher.setName(teacherRequestBody.getName());
        teacher.setMyClass(teacherRequestBody.getMyClass());
        //System.out.println(teacher.getMyClass().getName());
        teacherRepo.save(teacher);
    }

    //-------------------------
    //软删除
    //-------------------------
    @Override
    public void deleteTeacher(TeacherRequestBody teacherRequestBody) {
        Teacher teacher = teacherRepo.findById(teacherRequestBody.getId()).get();
        //teacher.setIsDeleted(true);
//        teacher.setId(null);
//        teacher.setName(null);
//        teacher.setMyClass(null);
        teacherRepo.save(teacher);
    }
}

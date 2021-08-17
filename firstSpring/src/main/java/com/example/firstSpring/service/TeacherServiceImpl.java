package com.example.firstSpring.service;

import com.example.firstSpring.dao.TeacherRepo;
import com.example.firstSpring.entity.Teacher;
import com.example.firstSpring.entity.TeacherRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.service
 * @ClassName : TeacherServiceImpl.java
 * @createTime : 2021/8/16 14:16
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */
@Service
public class TeacherServiceImpl implements TeacherService{

    private TeacherRepo teacherRepo;

    @Autowired
    public void setTeacherRepo(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @Override
    public Teacher findById(Integer id) {
        Optional<Teacher> optionalTeacher=  teacherRepo.findById(id);
        //optionalTeacher.isPresent();
        //return optionalTeacher.get();
        //如果不为空就返回teacher or返回空
        return optionalTeacher.orElse(null);
    }

    @Override
    public void updateTeacher(TeacherRequestBody teacherRequestBody) {
        Teacher teacher = teacherRepo.findById(teacherRequestBody.getId()).get();
        teacher.setName(teacherRequestBody.getName());
        //System.out.println(teacher.getMyClass().getName());
        teacher.setMyClass(teacherRequestBody.getMyClass());
        teacherRepo.save(teacher);
    }

    @Override
    public void deleteTeacher(TeacherRequestBody teacherRequestBody){
//        Teacher teacher=teacherRepo.findAll().set();
//        teacher.setId(teacherRequestBody.getId());

    }
    @Override
    public void createTeacher(TeacherRequestBody teacherRequestBody){

    }
}

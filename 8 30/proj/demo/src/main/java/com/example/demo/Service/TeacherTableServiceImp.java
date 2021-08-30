package com.example.demo.Service;


import com.example.demo.Dao.TeacherTable;
import com.example.demo.entity.TeacherBodyRequest;
import com.example.demo.entity.teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TeacherTableServiceImp implements TeacherTableService {
    private TeacherTable table;
    @Autowired
    public void SetTable(TeacherTable table){
        this.table = table;
    }

    @Override
    public teacher findByID(Integer id) {
        Optional<teacher> optionalTeacher=table.findById(id);
        return optionalTeacher.orElse(null);
    }

    @Override
    public void updateTeacher(TeacherBodyRequest body){
        teacher teacher=table.findById(body.getId()).get();
        teacher.setName(body.getName());
        table.save(teacher);
    }

    @Override
    public List<teacher> getAllTeachers() {
        return table.findAll();
    }

    @Override
    public teacher getById(Integer id) {
        return table.findById(id).orElse(null);
    }

}

package com.example.demo.Service;
import com.example.demo.Dao.Dao;
import com.example.demo.Dao.DaoImp;
import com.example.demo.Dao.StudentTable;
import com.example.demo.entity.student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImp implements Service {

    private Dao dao=new DaoImp();
    @Autowired
    private StudentTable studentTable;

    public List<student> getAllStudent(){
        return studentTable.findAll();
    }

    @Override
    public void createNewStudent(Integer id, String name, Integer age) {
          dao.createNewStudent(id,name ,age );
    }

    @Override
    public String deleteStudent(Integer id) {
        return dao.deleteStudent(id);
    }

    @Override
    public void updateStudent(Integer id, String name, Integer age) {
        dao.updateStudent(id,name,age);
    }


    @Override
    public student getOneStudent(Integer id) {
        return dao.getOneStudent(id);
    }
}

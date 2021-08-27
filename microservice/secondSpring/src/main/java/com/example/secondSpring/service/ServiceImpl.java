package com.example.secondSpring.service;

import com.example.secondSpring.dao.Dao;
import com.example.secondSpring.dao.DaoImpl;
import com.example.secondSpring.dao.StudentRepo;
import com.example.secondSpring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

// for autowire
@org.springframework.stereotype.Service //8.12
public class ServiceImpl implements Service{

    //private Dao dao = new DaoImpl();
    //using DI 第二种
    //用了Student之后就不用了
    @Autowired
    private Dao dao;

    //第三种
//    @Autowired
//    public void setDao(Dao dao){
//        this.dao = dao;
//    }

    //--------------------------------------------------
    //8.13
    //--------------------------------------------------
    @Autowired
    private StudentRepo studentRepo;


    @Override
    public List<Student> getAllElement() {
        return studentRepo.findAll(); //connect DB
        //return dao.getAllElement();
    }

    @Override
    public Student getElementByKey(Integer key) {
        return dao.getElementByKey(key);
    }

    @Override
    public void createElement(Integer key, Student student) {
        dao.createElement(key, student);
    }

    @Override
    public void updateElementByKey(Integer key, Student student) {
        dao.updateElementByKey(key, student);
    }

    @Override
    public void deleteElementByKey(Integer key) {
        dao.deleteElementByKey(key);
    }

    //----------------------
    // 8.17 page分页
    //--------------------
    @Override
    public Page<Student> findStudentPage(int index, int size) {
        Sort.Order sort = new Sort.Order(Sort.Direction.DESC, "name");
        return studentRepo.findStudentPage(PageRequest.of(index, size, Sort.by(sort)));
    }
}

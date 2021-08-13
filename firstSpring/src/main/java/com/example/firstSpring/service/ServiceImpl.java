package com.example.firstSpring.service;

import com.example.firstSpring.dao.Dao;
import com.example.firstSpring.dao.DaoImpl;
import com.example.firstSpring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.service
 * @ClassName : ServiceImpl.java
 * @createTime : 2021/8/10 14:38
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    //8.12.2021
    //互相依赖注入三种方法 dependency injection
    //1.
    //不推荐
    //about java的rejection , 非常占用资源
    //@Autowired 把bean从容器spring拿到
    private  Dao dao;
    //2. 常规的new
    //private Dao dao = new DaoImpl();
    //3.方法注入
    //best
    @Autowired
    public void setDao(Dao dao){
        this.dao = dao;
    }
    //4.构造器
    //@Autowired
    public ServiceImpl(Dao dao){
        this.dao = dao;
        //先扫描dao 在扫描service
    }
    //public ServiceImpl() {
    //}


    @Override
    //8.12 here
    public List<Student> getAllElements() {
        //throw new RuntimeException();
        //return null;
        return dao.getAllElement();
    }

    @Override
    public Student getElementByKey(Integer key) {
        //throw new handleNoHandlerFoundException(key);
        return dao.getElementByKey(key);
    }

    @Override
    public void updateElementByKey(Integer key, Student student) {
        dao.updateElementByKey(key, student);
    }

    @Override
    public void createElement(Integer key, Student student) {
        dao.createElement(key,student);
    }

    @Override
    public void deleteElementByKey(Integer key) {
//        if(key.isNull()){
//            throw new myExceptionHandler();
//        }

        dao.deleteElementByKey(key);
    }
}

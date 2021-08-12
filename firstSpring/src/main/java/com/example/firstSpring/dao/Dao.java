package com.example.firstSpring.dao;
import com.example.firstSpring.entity.Student;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.dao
 * @ClassName : Dao.java
 * @createTime : 2021/8/10 14:24
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */

public interface Dao {

    List<Student> getAllElement();
    Student getElementByKey(Integer key);
    void updateElementByKey(Integer key, Student student);
    void createElement(Integer key, Student student);
    void deleteElementByKey(Integer key);
}

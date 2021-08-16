package com.example.firstSpring.dao;

import com.example.firstSpring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.dao
 * @ClassName : StudentRepo.java
 * @createTime : 2021/8/13 14:36
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */
//加不加都行 已经extends了
//@Repository
public interface StudentRepo  extends JpaRepository<Student, Integer> {

}

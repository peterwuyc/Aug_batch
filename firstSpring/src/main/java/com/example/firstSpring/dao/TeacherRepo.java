package com.example.firstSpring.dao;

import com.example.firstSpring.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.dao
 * @ClassName : TeacherRepo.java
 * @createTime : 2021/8/16 14:14
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 */
@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}

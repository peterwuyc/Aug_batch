package com.example.spring0813.dao;

import com.example.spring0813.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//8.13 Jpa
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}

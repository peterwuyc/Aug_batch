package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    @Query(value = "SELECT * FROM student s where s.id <:id", nativeQuery = true)
    Page<Student> findAllByPage(@Param("id") Integer id, Pageable pageable);

}

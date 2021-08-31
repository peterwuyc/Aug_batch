package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query(value = "SELECT s.* FROM Student s WHERE s.id =?1",nativeQuery = true)
    Student findStudentById(Integer id);
    @Query(value = "SELECT s FROM Student s")
    Page<Student> findStudentPage(Pageable pageable);
}

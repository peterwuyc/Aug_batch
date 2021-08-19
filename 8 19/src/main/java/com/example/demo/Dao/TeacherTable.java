package com.example.demo.Dao;
import com.example.demo.entity.teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherTable extends JpaRepository<teacher,Integer> {
}

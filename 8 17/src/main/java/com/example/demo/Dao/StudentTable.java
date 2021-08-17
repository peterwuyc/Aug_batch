
package com.example.demo.Dao;
import com.example.demo.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentTable extends JpaRepository<student,Integer> {
}

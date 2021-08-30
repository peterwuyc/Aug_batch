
package com.example.demo.Dao;
import com.example.demo.entity.student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentTable extends JpaRepository<student,Integer> {


    @Query(value = "SELECT s FROM student s")
    Page<student> findStudentWithPages(Pageable pageable);


}

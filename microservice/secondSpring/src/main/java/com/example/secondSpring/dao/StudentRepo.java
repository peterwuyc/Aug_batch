package com.example.secondSpring.dao;

import com.example.secondSpring.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//StudentRepo可以假设为Dao 和DaoImpl的结合
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> { //泛型，id

    //------------------------------------------------------------------------------------------
    // 8.17 JPQL
    //------------------------------------------------------------------------------------------
//    @Query(value="FROM Student s WHERE s.id=:id and s.name=:name")
//    Student findById(@Param("id") Integer id, @Param("name") String name);
    @Query(value="FROM Student s WHERE s.id=:id",nativeQuery = true)
    Student findStudentById(@Param("id") Integer id);

    //----------------------
    // 8.17 page分页
    //--------------------
    @Query(value="SELECT s FROM Student s")
    Page<Student> findStudentPage(Pageable pageable);

}

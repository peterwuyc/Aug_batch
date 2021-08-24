package com.example.secondSpring.controller;

import com.example.secondSpring.config.Product;
import com.example.secondSpring.dao.StudentRepo;
import com.example.secondSpring.entity.Student;
import com.example.secondSpring.entity.StudentBodyRequest;
import com.example.secondSpring.service.Service;
import com.example.secondSpring.service.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {
    //-------------------------
    //8.12 IOC 控制反转 & DI 依赖注入 【面试考点， what how why好处】
    //-------------------------
    //before:
    //Service service = new ServiceImpl();
    @Autowired
    private Service service;

    //-------------------------
    //8.10 testing server.port
    //8.10 simple post&get
    //-------------------------
    @GetMapping(value = "/gp/student/")
    public String get(){
        return "success";
    }
    @PostMapping(value = "/gp/student")
    public String post(){
        return "success";
    }

    @GetMapping(value = "/gp/student/{id}")
    public Student get2(@PathVariable("id") Integer id){
        return service.getElementByKey(id);
    }

    @PostMapping(value="/gp/student/{id}/{name}/{age}")
    public String Post2(@PathVariable("id") Integer id,
                      @PathVariable("name") String name,
                      @PathVariable("age") Integer age){
        Student student = new Student();
        student.setAge(age);
        student.setId(id);
        student.setName(name);

        service.createElement(id,student);
        return "post success";
    }


    //-------------------------
    //8.10 bodyRequest
    //-------------------------
    @PostMapping(value="/gp/studentBodyRequest", consumes = {"application/json"})
    public String Post3(@RequestBody StudentBodyRequest studentBodyRequest){
        Student student = new Student();
        BeanUtils.copyProperties(studentBodyRequest,student);
        service.createElement(student.getId(),student);
        return "post bodyRequest success";
    }

    //------------------------------------------------------------------------------------------
    // 8.10 assignment: update delete get<List>
    //------------------------------------------------------------------------------------------
    @PutMapping(value="/gp/studentBodyRequest",consumes = {"application/json"})
    public String put(@RequestBody StudentBodyRequest studentBodyRequest){
        Student student = new Student();
        BeanUtils.copyProperties(studentBodyRequest,student);
        service.updateElementByKey(student.getId(), student);
        return "put success";
    }

    @DeleteMapping(value="/gp/studentBodyRequest/{id}")
    public String delete(@RequestBody StudentBodyRequest studentBodyRequest){
        Student student = new Student();
        BeanUtils.copyProperties(studentBodyRequest,student);
        service.deleteElementByKey(student.getId());
        return "delete success";
    }

    @GetMapping(value="/gp/students")
    public List<Student> getAllStudents(){
        return service.getAllElement();
    }
    //---------------------------------------------------------------------------------------------------

    //-------------------------
    //8.12 IOC
    //-------------------------
    @Autowired
    //@Qualifier("getStudent2") //指明了config里第二个数据
    @Qualifier("thirdIOC")
    private Student student;
    //默认返回了config里面的数据
    @GetMapping(value="/gp/studentBean")
    public Student get4(){
        return student;
    }

    @PostMapping(value = "/gp/student4")
    public String post4(@RequestBody StudentBodyRequest studentBodyRequest){
        //上下文

        Student student = new Student();
        BeanUtils.copyProperties(studentBodyRequest,student);
        service.createElement(student.getId(),student);
        return "post4 bodyRequest success";
    }

    //------------------------------------------------------------------------------------------
    // 8.13 after connecting MySql DB
    //------------------------------------------------------------------------------------------
    @GetMapping(value = "/db/students/")
    public List<Student> getAll(){
        return service.getAllElement();
    }

    //------------------------------------------------------------------------------------------
    // 8.17 JPQL
    //------------------------------------------------------------------------------------------
    @Autowired
    private StudentRepo studentRepo;
    @GetMapping(value = "/jpql/student/{id}")
    public Student jpqlGet(@PathVariable("id")Integer id){
        return studentRepo.findStudentById(id);
        //return service.getAllElement();
    }

    //------------------------------------------------------------------------------------------
    // 8.17 page
    //------------------------------------------------------------------------------------------
    @GetMapping(value = "/jpql/student")
    public ResponseEntity<Page<Student>> jpqlGet(@RequestParam("index") Integer index, @RequestParam("size") Integer size){
        return ResponseEntity.ok(service.findStudentPage(index, size));
        //return service.getAllElement();
    }
    //http://localhost:8083/jpql/student?index=0&size=2

    //---------------------------------------------------------------------------------
    // 8.17 配置文件
    //--------------------------------------------------------------------------------
    @Value("${myGithub.url}")
    private String url;

    @GetMapping(value = "/url/")
    public ResponseEntity<String> getPZ(){
        return ResponseEntity.ok(url);
    }

    //----------------------------------
    @Autowired
    private Product product;

    @GetMapping(value = "/product/")
    public ResponseEntity<Product> getPd(){
        System.out.println(product);
        return ResponseEntity.ok(product);
    }

    //-------------------------------------
    @Autowired
    private ApplicationContext ioc;
    @GetMapping(value = "/ioc/")
    public ResponseEntity<Product> getIoc(){

        Product product = (Product) ioc.getBean("product");
        System.out.println(product);
        return ResponseEntity.ok(product);
    }

}

package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentBodyRequest;
import com.example.demo.service.Service;
import com.example.demo.service.ServiceImp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service service;// = new ServiceImp();

//    private RestTemplate restTemplate;
//    @Autowired
//    public void setRestTemplate(RestTemplate restTemplate){
//        this.restTemplate=restTemplate;
//    }
    @Value("${test.url}")
    private String url;

    @GetMapping(value = "/gp/student")
    public ResponseEntity<Student> get(@RequestParam("id")Integer id) throws Exception {
        Student student = service.getElementByKey(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping(value = "/gp/student", consumes = {"application/json"})
    public String post(@RequestBody StudentBodyRequest request) throws Exception {
        Student student = new Student();
        BeanUtils.copyProperties(request,student);
        service.createElement(student.getId(),student);
        return "successful create";

    }

    @DeleteMapping(value = "/gp/student")
    public String delet(@RequestParam("id")Integer id) throws Exception {
        service.deleteElementByKey(id);
        return "successful delete";
    }

    @PutMapping(value = "/gp/student")
    public String put(@RequestBody StudentBodyRequest request) throws Exception {
        Student student = new Student();
        BeanUtils.copyProperties(request,student);
        service.updateElementByKey(student.getId(),student);
        return "successful update";
    }

    @GetMapping(value = "/gp/student/all")
    public List get(){
        return service.getAllElements();
    }

    @GetMapping(value = "/gp/student/page")
    public ResponseEntity<Page<Student>> getPage(@RequestParam("index")Integer index, @RequestParam("size") Integer size){
        return ResponseEntity.ok(service.getStudentPage(index,size));
    }
    @GetMapping(value = "/gp/url")
    public ResponseEntity<String> getUrl(){
        return ResponseEntity.ok(url);
    }

//    @GetMapping(value = "/restemplate")
//    public ResponseEntity<String> getRestTemplate(){
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://SCHOOL/school",String.class);
//        //ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8001/school",String.class);
//        //restTemplate.exchange("http://localhost:8001/school",HttpMethod.GET,String.class);
//        return responseEntity;
//    }

}

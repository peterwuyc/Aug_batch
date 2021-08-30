package com.example.demo.controller;

import com.example.demo.Dao.StudentTable;
import com.example.demo.Service.Service;
import com.example.demo.Service.TeacherTableService;
import com.example.demo.entity.StudentBodyRequest;
import com.example.demo.entity.student;
import com.example.demo.entity.teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class WebViewController {
    @Autowired
    private Service Sservice;

    @Autowired
    private TeacherTableService Tservice;

    @RequestMapping("/studentList")
    public String toStudentListPage(Map<String,Object> map){
        List<student> students=Sservice.getAllStudent();
        map.put("students",students);
        return "studentList";
    }
    @RequestMapping("/studentDetail")
    public String getStudentDetailById(Map<String,Object> map,@RequestParam("id")String id){
        student studentD=Sservice.getOneStudent(Integer.parseInt(id));
        map.put("studentD",studentD);
        return "studentDetail";
    }

    @RequestMapping("/teacherList")
    public  String toTeacherList(Map<String,Object> map){
        List<teacher> teachers=Tservice.getAllTeachers();
        map.put("teachers",teachers);
        return "teacherList";
    }
    @RequestMapping("/teacherDetail")
    public  String teacherDetail(Map<String,Object> map,@RequestParam("id")String id){
        teacher teachers=Tservice.getById(Integer.parseInt(id));
        map.put("teacherD",teachers);
        return "teacherDetail";
    }

}

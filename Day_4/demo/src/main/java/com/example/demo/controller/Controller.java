package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentBodyRequest;
import com.example.demo.service.Service;
import com.example.demo.service.ServiceImp;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private Service service = new ServiceImp();

    @GetMapping(value = "/findStudent/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return service.getElementByKey(id);
    }

    @GetMapping(value = "/getAllStudent")
    public List<Student> getAllStudent(){
        try{
            return service.getAllElements();
        }
        catch(Exception e){
            return null;
        }
    }
    @PostMapping(value = "/createStudent")
    public void createStudent(@RequestBody StudentBodyRequest request){
        try {
            Student student = new Student();
            int id = request.getId();
            BeanUtils.copyProperties(request, student);
            service.createElement(id, student);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    @PutMapping(value = "/UpdateStudent")
//  public void update(@org.jetbrains.annotations.NotNull @RequestBody StudentBodyRequest request)
    public String update(@RequestBody StudentBodyRequest request){
        try{
            Student student = new Student();
            int id = request.getId();
            BeanUtils.copyProperties(request, student);
            service.updateElementByKey(id, student);
            return "Update Success";
        }
        catch (Exception e){
            System.out.println(e);
            return "Update Failed, Something Wrong ";
        }

    }
    @DeleteMapping(value = "/delete")
    public String deleteById(@RequestParam Integer id){
        try{
            service.deleteElementByKey(id);
            return "Delete Success";
        }
        catch (Exception e){
            System.out.println(e);
            return "Delete Failed, Something Wrong ";
        }
    }

}

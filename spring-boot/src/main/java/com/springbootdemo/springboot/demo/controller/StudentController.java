package com.springbootdemo.springboot.demo.controller;


import com.springbootdemo.springboot.demo.entity.Student;
import com.springbootdemo.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    @ResponseBody
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}

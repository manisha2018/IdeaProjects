package com.springbootdemo.springboot.student.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootdemo.springboot.student.entity.Student;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private Student student;

    public List getStudents(){
        List<Student> studentList= Arrays.asList(new Student(1,"Varun","JVM"),
                new Student(2,"kiran","QA"));
        return studentList;
    }

}

package com.springbootdemo.springboot.demo.service;


import com.springbootdemo.springboot.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootdemo.springboot.demo.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {

//    @Autowired
//    private Student student;

    @Autowired
    StudentRepository studentRepository;

    public List getStudents(){
//        List<Student> studentList= Arrays.asList(new Student(1,"Varun","JVM"),
//                new Student(2,"kiran","QA"));
//        return studentList;

        List<Student> studentList =new ArrayList<>();
        Iterator<Student> studentIterator= studentRepository.findAll().iterator();
        studentIterator.forEachRemaining(studentList::add);
        return studentList;
    }

}

package com.springbootdemo.springboot.demo.repository;


import com.springbootdemo.springboot.demo.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}

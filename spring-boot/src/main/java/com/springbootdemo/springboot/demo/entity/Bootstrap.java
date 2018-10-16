package com.springbootdemo.springboot.demo.entity;

import com.springbootdemo.springboot.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrap {

    @Autowired
    private StudentRepository studentRepository;

    @EventListener(ApplicationStartedEvent.class)
    public void init() {
        //System.out.println("Hey how are you!!");
        Iterator<Student> iterator = studentRepository.findAll().iterator();
        if (!iterator.hasNext()) {
            for (int i = 1; i <= 5; i++) {
                Student student = new Student(i, "Student" + i, "JVM" + i);
                studentRepository.save(student);
                System.out.println("student" + i + "added");
            }

        }
        System.out.println("Application is up and running");
    }
}

package com.springbootdemo.springboot.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private Integer id;
    private String name;
    private String Competency;

    public Student() {
    }

    public Student(Integer id, String name, String competency) {
        this.id = id;
        this.name = name;
        Competency = competency;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompetency() {
        return Competency;
    }

    public void setCompetency(String competency) {
        Competency = competency;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Competency='" + Competency + '\'' +
                '}';
    }
}

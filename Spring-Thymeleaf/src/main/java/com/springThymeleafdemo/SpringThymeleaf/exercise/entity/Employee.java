package com.springThymeleafdemo.SpringThymeleaf.exercise.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private Integer id;
    private String name;
    private Integer age;
    private Double salary;
    private Boolean isAdmin;

    public Employee() {
    }

    public Employee(Integer id, String name, Integer age, Double salary, Boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isAdmin = isAdmin;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}

package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Employee {

    @Id
    private Integer Id;

    private String name;
    private Double salary;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

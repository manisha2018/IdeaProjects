/*
Write a program to sort Employee objects based on highest salary
        using Comparator. Employee class{ Double Age; Double Salary; String Name;}
*/

package com.bootcamp.collection.Question4;

import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    private double age;

    Employee(String name, double salary, double age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}


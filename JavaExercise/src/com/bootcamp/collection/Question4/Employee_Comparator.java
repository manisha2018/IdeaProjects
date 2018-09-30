package com.bootcamp.collection.Question4;

import java.util.Comparator;

class Employee_Comparator implements Comparator<Employee> {
    public int compare(Employee employeeA,Employee employeeB){
        if(employeeA.getSalary() == employeeB.getSalary()){
            return 0;
        }
        if(employeeA.getSalary() < employeeB.getSalary()){
            return 1;
        }
        else {
            return -1;
        }
    }
}

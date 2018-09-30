/*
Write a program to sort Employee objects based on highest salary
        using Comparator. Employee class{ Double Age; Double Salary; String Name;}
*/

package com.bootcamp.collection.Question4;

import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("name1",11111.32,23));
        arrayList.add(new Employee("name2",22222.55,54));
        arrayList.add(new Employee("name3",53555.66,25));
        arrayList.add(new Employee("name4",44444.32,24));
        arrayList.add(new Employee("name5",66667.32,66));
        arrayList.add(new Employee("name6",77777.32,43));
        arrayList.add(new Employee("name7",88888.32,24));
        arrayList.add(new Employee("name8",99999.32,35));
        arrayList.add(new Employee("name9",95748.99,45));

        arrayList.sort(new Employee_Comparator());
        for (Employee employee:arrayList){
            System.out.println(employee.getSalary());
        }
    }
}

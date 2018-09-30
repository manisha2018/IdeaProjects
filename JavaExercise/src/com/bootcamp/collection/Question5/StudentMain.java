/*
Write a program to sort the Student objects based on Score ,
        if the score are same then sort on First Name .
        Class Student{ String Name; Double Score; Double Age;}
*/

package com.bootcamp.collection.Question5;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student("Name1",1000,34));
        arrayList.add(new Student("Manisha",1000,45));
        arrayList.add(new Student("Name3",3000,56));
        arrayList.add(new Student("Name4",7000,24));
        arrayList.add(new Student("Name5",33000,74));
        arrayList.add(new Student("Name6",1500,23));
        arrayList.add(new Student("Deva",1500,52));
        arrayList.add(new Student("Name8",9000,22));
        arrayList.add(new Student("Name9",8800,32));

        arrayList.sort(new Student_Comparator());
        for (Student student:arrayList){
            System.out.println("Name is: " +student.getName()+" Score is: "+student.getScore());
        }
    }
}

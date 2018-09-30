package com.bootcamp.collection.Question5;

import java.util.Comparator;

class Student_Comparator implements Comparator<Student> {
    public int compare(Student student1,Student student2){
        if (student1.getScore()==student2.getScore()){
            return student1.getName().compareTo(student2.getName());
        }
        if(student1.getScore()>student2.getScore()){
            return 1;
        }
        else {
            return -1;
        }
    }
}

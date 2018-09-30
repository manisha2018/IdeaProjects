/*
Write a program to sort the Student objects based on Score ,
        if the score are same then sort on First Name .
        Class Student{ String Name; Double Score; Double Age;}
*/

package com.bootcamp.collection.Question5;
class Student {
    private String name;
    private double score;
    private double age;

    public Student(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}

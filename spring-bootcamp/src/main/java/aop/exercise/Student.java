package aop.exercise;

import java.io.IOException;

public class Student {

    private String id;
    private String name;
    private String competency;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", competency='" + competency + '\'' +
                '}';
    }

    public void studentTest(){
        System.out.println("This is student class test method");
    }

    void throwExcepion() throws Exception {
        throw new Exception();
    }

    void throwIOException() throws IOException {
        throw new IOException();
    }

    public Integer getInteger(Integer a) {
        return a;
    }

   public void display(){
       System.out.println("this is the student class");
   }
}

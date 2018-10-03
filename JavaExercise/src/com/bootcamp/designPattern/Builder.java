//Implement Builder pattern to create a student object with more than 6 fields.
package com.bootcamp.designPattern;

class Student {
    private String name;
    private Integer id;
    private Integer age;
    private String competencyOpted;
    private String courseOpted;
    private Integer fees;
    private Double marks;

    public Student(StudentBuilder studentBuilder) {
        name = studentBuilder.getName();
        id = studentBuilder.getId();
        age = studentBuilder.getAge();
        competencyOpted = studentBuilder.getCompetencyOpted();
        courseOpted = studentBuilder.getCourseOpted();
        fees = studentBuilder.getFees();
        marks = studentBuilder.getMarks();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCompetencyOpted() {
        return competencyOpted;
    }

    public void setCompetencyOpted(String competencyOpted) {
        this.competencyOpted = competencyOpted;
    }

    public String getCourseOpted() {
        return courseOpted;
    }

    public void setCourseOpted(String courseOpted) {
        this.courseOpted = courseOpted;
    }

    public Integer getFees() {
        return fees;
    }

    public void setFees(Integer fees) {
        this.fees = fees;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", competencyOpted='" + competencyOpted + '\'' +
                ", courseOpted='" + courseOpted + '\'' +
                ", fees=" + fees +
                ", marks=" + marks +
                '}';
    }
}

//TODO:WHy created set method with the Class name as return type:
class StudentBuilder {
    private String name;
    private Integer id;
    private Integer age;
    private String competencyOpted;
    private String courseOpted;
    private Integer fees;
    private Double marks;

    public StudentBuilder(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public StudentBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public StudentBuilder hasAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getCompetencyOpted() {
        return competencyOpted;
    }

    public StudentBuilder hasSelectedCompetency(String competencyOpted) {
        this.competencyOpted = competencyOpted;
        return this;
    }

    public String getCourseOpted() {
        return courseOpted;
    }

    public StudentBuilder admittedInCourse(String courseOpted) {
        this.courseOpted = courseOpted;
        return this;
    }

    public Integer getFees() {
        return fees;
    }

    public StudentBuilder paidFees(Integer fees) {
        this.fees = fees;
        return this;
    }

    public Double getMarks() {
        return marks;
    }

    public StudentBuilder setMarks(Double marks) {
        this.marks = marks;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

}

public class Builder {
    public static void main(String[] args) {
        Student student = new StudentBuilder("Manisha", 3028)
                .hasAge(23)
                .hasSelectedCompetency("JVM")
                .admittedInCourse("MCA")
                .paidFees(10000)
                .setMarks(200.0)
                .build();
        System.out.println(student);
    }

}

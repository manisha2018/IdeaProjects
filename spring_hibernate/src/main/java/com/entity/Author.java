package com.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Author {

    /*TODO:6) Rename all the fields using column annotation.*/
    @Id
    @Column(name = "authorId")
    private Integer Id;

    @Column(name = "fname")
    private String firstName;

    //TODO:7) Mark lastName as @Transient.
    //Made the lname null with update mode.
    //With Create Mode,No lname
    @Transient
    @Column(name="lname")
    private String lastName;

    @Column(name="hasAge")
    private Integer age;

    //TODO:8) Use @Temporal for date of birth of Author.
    //Date format changed with update mode.
    //With Create mode,only date is shown
    @Temporal(TemporalType.DATE)
    @Column(name = "dateOfBirth")
    private Date dob;

    public Author() {
    }

    public Author(Integer id, String firstName, String lastName, Integer age, Date dob) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Author{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

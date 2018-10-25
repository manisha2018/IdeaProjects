package com.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Author {

    /*TODO:6) Rename all the fields using column annotation.*/

    /*TODO:9)Generate Id for Author Using IDENTITY and TABLE starategy.*/
    @Id
    @Column(name = "authorId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "fname")
    private String firstName;

    //TODO:7) Mark lastName as @Transient.
    /*
    Made the lname null with update mode.
    With Create Mode,No lname
    */
    @Transient
    @Column(name = "lname")
    private String lastName;

    @Column(name = "hasAge")
    private Integer age;

    //TODO:8) Use @Temporal for date of birth of Author.
    /*
    Date format changed with update mode.
    With Create mode,only date is shown
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "dateOfBirth")
    private Date dob;


    /* TODO:
    Create instance variable of Address class
     inside Author class and save it as embedded object.
     */
    @Embedded
    private Address address;

    /*
    TODO:12) Introduce a List of subjects for author.
    Create another table as Author_subjects
    */
    @ElementCollection
    List<String> subjects = new ArrayList<>();

    @OneToMany
    private Set<Book> books=new HashSet<Book>();

    public Author() {
    }

    public Author(String firstName, String lastName, Integer age, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

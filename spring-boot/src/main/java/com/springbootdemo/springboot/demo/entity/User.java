package com.springbootdemo.springboot.demo.entity;

import org.springframework.stereotype.Component;

//@Component
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return userName;
    }

    public void setFirstName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return password;
    }

    public void setLastName(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


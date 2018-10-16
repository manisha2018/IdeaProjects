package com.springbootdemo.springboot.demo.service;

import com.springbootdemo.springboot.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//@Service
public class UserService {

    private User user;

    public List<User> getUser(){
        List<User> list= Arrays.asList(new User("Admin","admin"),
                new User("user1","user1"));
        return list;
    }
}

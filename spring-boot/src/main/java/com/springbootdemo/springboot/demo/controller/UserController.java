package com.springbootdemo.springboot.demo.controller;

import com.springbootdemo.springboot.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    Logger logger= LoggerFactory.getLogger(UserController.class);

     @Autowired
     private UserService userService;

    @GetMapping("/user")
    public List getAllUsers(){
        logger.info("Tracing User Controller");
        return userService.getUser();
    }
}

package com.springbootdemo.springboot.demo.controller;

import com.springbootdemo.springboot.demo.entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DatabaseController {

    @Autowired
    Database database;

    @GetMapping("/database")
    @ResponseBody
    public String getDatabaseDetails() {
     System.out.println(database.getPort());
        return "DataBase Name" + database.getName() + "DataBase Port" + database.getPort();
    }
}

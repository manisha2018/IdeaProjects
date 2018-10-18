package com.springThymeleafdemo.SpringThymeleaf.Demo.controller;

import com.springThymeleafdemo.SpringThymeleaf.Demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String fetchUsers(Model model){
        model.addAttribute("users",populateUsers());
        return "users";
    }

    @GetMapping("/user")
    private List populateUsers(){
        List<User> users= Arrays.asList(new User(1L,"user1",true,230000.0),
                new User(2L,"user2",false,2300.0));
        return users;
    }

    @PostMapping("/register")
    private String register(@ModelAttribute("user") User user){
        return "users";
    }
}

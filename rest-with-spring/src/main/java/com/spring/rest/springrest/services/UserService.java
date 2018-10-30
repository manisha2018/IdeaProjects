package com.spring.rest.springrest.services;

import com.spring.rest.springrest.entities.User;
import com.spring.rest.springrest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    /*TODO:
    Create a Rest API for Student using noun plurals for endpoint and
     http verbs for different operations.*/
    public List<User> getAllUsers(){
        return (List<User>)userRepository.findAll();
    }

    public User update( User user) {
        Iterator<User> iterator = userRepository.findAll().iterator();
        if (!iterator.hasNext()) {
            for (int i = 1; i < 8; i++) {
                user = new User("Sam",26);
                userRepository.save(user);
            }
        }
        else {
            userRepository.save(user);
        }
        return user;
    }

    /*TODO:
    * Create a Customise Exception Handler.*/
    public Optional<User> getUserById(Integer id){
        return userRepository.findById(id);
    }



}

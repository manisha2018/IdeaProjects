package com.spring.rest.springrest.controllers;


import com.spring.rest.springrest.entities.*;
import com.spring.rest.springrest.exceptions.UserNotFoundException;
import com.spring.rest.springrest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    MessageSource messageSource;

//    @GetMapping("/")
//    User updateUsers(){
//        System.out.println(userService.update());
//        return userService.update();
//    }

    @GetMapping("/")
    List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    Optional<User> getUserById(@PathVariable Integer id) {
        Optional<User> user = userService.getUserById(id);
        if (user == null) {
            throw new UserNotFoundException("User not found!!");
        }
        return userService.getUserById(id);
    }

    /*TODO:
     * 3) Print the Validation Messages of student Entity in response.*/

    @PostMapping("/users")
    ResponseEntity<User> saveUser(@Valid @RequestBody User user) {
        userService.update(user);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/users")
    String helloWorld(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        System.out.println("hello world");
        System.out.println(locale.getLanguage());
        return messageSource.getMessage("good.morning.message", null, locale);
    }

    //URI Versioning

    @GetMapping("/users/V1")
    UserVersion1 getPersonV1() {
        return new UserVersion1("Peter Parker");
    }

    @GetMapping("/users/V2")
    UserVersion2 getPersonV2() {
        return new UserVersion2(new Name("Peter", "Parker"));
    }

    //Parameter Versioning
    // /users/param?version=1
    @GetMapping(value = "/users/param", params = "version=1")
    UserVersion1 getPersonParam1() {
        return new UserVersion1("Peter Parker");
    }

    @GetMapping(value = "/users/param", params = "version=2")
    UserVersion2 getPersonParam2() {
        return new UserVersion2(new Name("Peter", "Parker"));
    }


    //Header Versioning
    //API-VERSION 1 header required with request
    @GetMapping(value = "/users/header", headers = "API-VERSION=1")
    UserVersion1 getPersonHeader1() {
        return new UserVersion1("Peter Parker");
    }

    @GetMapping(value = "/users/header", headers = "API-VERSION=2")
    UserVersion2 getPersonHeader2() {
        return new UserVersion2(new Name("Peter", "Parker"));
    }

    /*TODO:
    * Perform CRUD operations on the resource below using   RestTemplate
      https://jsonplaceholder.typicode.com/posts   (2 Marks)*/

    @GetMapping("/post")
    public String getPost(){
        RestTemplate restTemplate = new RestTemplate();
        String url="https://jsonplaceholder.typicode.com/posts/1";
        ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
        System.out.println(response.getStatusCode().toString());
        System.out.println(response.getHeaders().toString());
        return response.getBody();
    }

    @PostMapping("/createPost")
    public ResponseEntity<Post> createPost(){
        String url="https://jsonplaceholder.typicode.com/posts";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(new Post(10000,10000,"title1","description1"),httpHeaders);
        Post post=restTemplate.postForObject(url,request,Post.class);
        System.out.println(post);
        return new ResponseEntity<Post>(post, HttpStatus.CREATED);
    }

    @PutMapping("/updatePost")
    public ResponseEntity<Post> updatePost(){
        String url="https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(new Post(111,10000,"title1","description1"),httpHeaders);
        return restTemplate.exchange(url, HttpMethod.PUT,request,Post.class);
    }

    @DeleteMapping("/deletePost")
    public void deletePost(){
        String url="https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(httpHeaders);
        restTemplate.exchange(url,HttpMethod.DELETE,request,Post.class);
    }
}

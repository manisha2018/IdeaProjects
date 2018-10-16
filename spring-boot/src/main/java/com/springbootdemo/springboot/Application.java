package com.springbootdemo.springboot;

import com.springbootdemo.springboot.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.springbootdemo.springboot.demo.entity"})
@EnableJpaRepositories(basePackages = {"com.springbootdemo.springboot.demo.repository"})
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }
}

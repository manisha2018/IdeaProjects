package com.spring.dataJPA.springdataJPA;

import com.spring.dataJPA.springdataJPA.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.spring.dataJPA.springdataJPA.entity"})
@EnableJpaRepositories(basePackages = {"com.spring.dataJPA.springdataJPA.repository"})
public class SpringDataJpaApplication {


    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringDataJpaApplication.class, args);
        PersonService personService = applicationContext.getBean(PersonService.class);

        //TODO:Perform all the methods inside CrudRepository for Person Class.
        System.out.println(personService.update());
        System.out.println(personService.read());
        personService.delete();
    }
}

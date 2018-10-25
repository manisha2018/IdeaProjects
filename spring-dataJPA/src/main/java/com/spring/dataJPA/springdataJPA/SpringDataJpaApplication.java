package com.spring.dataJPA.springdataJPA;

import com.spring.dataJPA.springdataJPA.entity.Person;
import com.spring.dataJPA.springdataJPA.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;

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
        // personService.delete();

        /*TODO:For class Person find person declare methods in repository to
         * TODO:find person by firstname, lastname and Id.*/
        List<String> list = personService.getFirstName("First2");
        System.out.println(list);


        List<Person> list1 = personService.getLastName("Last2");
        System.out.println(list1);

        Optional<Person> optionalPerson = personService.getId();
        System.out.println(optionalPerson);

        /*TODO:Use @Query to fetch firstname of the Person whose age is 25.*/
        System.out.println(personService.fetchFirstNameUsingAge(25));

        /*TODO:Use @Query to fetch firstname and lastname of the Person whose age is 25.*/
        System.out.println(personService.getNames(25));

        /*TODO:Get complete information of the Employee whose age is 25 using @Query.*/
        System.out.println(personService.getAllDetailsOfPerson(25));

        /*TODO:Count Person where name is "Peter" using @Query.*/
        System.out.println(personService.countAllSameFirstName("Peter"));
    }
}

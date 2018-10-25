package com.spring.dataJPA.springdataJPA.repository;

import com.spring.dataJPA.springdataJPA.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person,Integer> {

        List<String> findByFirstName(String firstName);

        List<Person> findByLastName(String lastName);

        Optional<Person> findById(Integer id);

        @Query("select firstName from Person where age=:age")
        String findByAge(@Param("age") Integer age);

        @Query("select firstName,lastName from Person where age=:age")
        List<Person> findByAges(@Param("age") Integer age);

        @Query("select p from Person p where p.age=:age")
        List<Person> findAllByAge(@Param("age") Integer age);

        //TODO:Count Person where name is "Peter" using @Query.
        @Query("SELECT Count(*) from Person p where p.firstName=:name")
        List<Person> countByName(@Param("name") String name);

}

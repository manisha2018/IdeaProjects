package com.spring.dataJPA.springdataJPA.repository;

import com.spring.dataJPA.springdataJPA.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Integer> {


}

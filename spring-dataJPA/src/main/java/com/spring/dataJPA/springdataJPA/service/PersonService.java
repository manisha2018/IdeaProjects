package com.spring.dataJPA.springdataJPA.service;

import com.spring.dataJPA.springdataJPA.entity.Person;
import com.spring.dataJPA.springdataJPA.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    private Person person;

    public Person update() {
        Iterator<Person> iterator = personRepository.findAll().iterator();
        if (!iterator.hasNext()) {
            for (int i = 1; i < 5; i++) {
                person = new Person(i,"First" + i, "last" + i, 22000 + i, 22 + i);
                personRepository.save(person);
            }
        }
        return person;
    }

    public List<Person> read() {
        List<Person> personList = new ArrayList<>();
        Iterator<Person> personIterator = personRepository.findAll().iterator();
        personIterator.forEachRemaining(personList::add);
        return personList;
    }

    public void delete() {
        personRepository.deleteById(1);
    }
}

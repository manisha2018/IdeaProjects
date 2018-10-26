package com.spring.dataJPA.springdataJPA.service;

import com.spring.dataJPA.springdataJPA.entity.Person;
import com.spring.dataJPA.springdataJPA.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    private Person person;

    public Person update() {
        Iterator<Person> iterator = personRepository.findAll().iterator();
        if (iterator.hasNext()) {
            for (int i = 1; i < 8; i++) {
                person = new Person("Manisha" + i, "Goyal" + i, 22000 + i, 22 + i);
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


    public List<String> getFirstName(String name) {
        return personRepository.findByFirstName(name);
    }

    public List<Person> getLastName(String name) {
        return personRepository.findByLastName(name);
    }

    public Optional<Person> getId() {
        Optional<Person> optionalPerson = personRepository.findById(2);
        return optionalPerson;
    }

    public String fetchFirstNameUsingAge(Integer age) {
        return personRepository.findByAge(age);
    }

    public List<Person> getNames(Integer age) {
        return personRepository.findByAges(age);
    }

    public List<Person> getAllDetailsOfPerson(Integer age) {
        return personRepository.findAllByAge(age);
    }

    public List<Person> countAllSameFirstName(String name) {
        return personRepository.countByName(name);
    }

    public Integer countPersonById(Integer id) {
        return personRepository.countById(id);
    }

    public Person getDistinct(String fname) {
        return personRepository.findDistinctByFirstName(fname);
    }

    public List<Person> getByNameOrAge(String fname, Integer age) {
        return personRepository.findByFirstNameOrAge(fname, age);
    }

    public List<Person> getByNameAndAge(String fname, Integer age) {
        return personRepository.findByFirstNameAndAge(fname, age);
    }

    public List<Person> getByAgeBetween(Integer min, Integer max) {
        return personRepository.findByAgeBetween(min, max);
    }

    public List<Person> getLessThanAge(Integer age) {
        return personRepository.findByAgeLessThan(age);
    }

    public List<Person> getGreaterAge(Integer age) {
        return personRepository.findByAgeGreaterThanEqual(age);
    }

    public List<Person> getByNameMatching(String fname) {
        return personRepository.findByFirstNameLike(fname);
    }

    public List<Person> getByNotName(String fname) {
        return personRepository.findByFirstNameNot(fname);
    }

    public List<Person> getByAgeIn(List<Integer> ageList) {
        return personRepository.findByAgeIn(ageList);
    }

    public List<Person> getByIgnoreCase(String fname) {
        return personRepository.findByFirstNameIgnoreCase(fname);
    }

}

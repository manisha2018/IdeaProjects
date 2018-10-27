package com.spring.dataJPA.springdataJPA.service;

import com.spring.dataJPA.springdataJPA.entity.Person;
import com.spring.dataJPA.springdataJPA.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
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

    /*TODO: JPA Specification*/
    /*TODO:
    Use JPA Criteria API for following operations for person

        equals
        gt
        lt
        and
        or
        between
    * */

    public List<Person> findPersonEqualsId() {
        Specification<Person> personSpecification = (Specification<Person>) (root, query, cb) -> {
            Path path = root.get("id");
            Predicate predicate = cb.equal(path, 5);
            return predicate;
        };
        return personRepository.findAll(personSpecification);
    }

    public List<Person> findAllPerson() {
        Specification<Person> personSpecification = (Specification<Person>) (root, query, cb) -> {
            Path path = root.get("id");
            Predicate predicate = cb.gt(path, 5);
            return predicate;
        };
        return personRepository.findAll(personSpecification);
    }

    public List<Person> findAllPersonLessThanId() {
        Specification<Person> personSpecification = (Specification<Person>) (root, query, cb) -> {
            Path path = root.get("id");
            Predicate predicate = cb.lt(path, 5);
            return predicate;
        };
        return personRepository.findAll(personSpecification);
    }

    public List<Person> findAllPersonMatchingAndCondition() {
        Specification<Person> personSpecification = (Specification<Person>) (root, query, cb) -> {
            Path path = root.get("id");
            Path path1 = root.get("firstName");
            Predicate predicate = cb.and(cb.equal(path1, "Peter1"), cb.lt(path, 7));
            return predicate;
        };
        return personRepository.findAll(personSpecification);
    }

    public List<Person> findAllPersonMatchingOrCondition() {
        Specification<Person> personSpecification = (Specification<Person>) (root, query, cb) -> {
            Path path = root.get("id");
            Path path1 = root.get("firstName");
            Predicate predicate = cb.or(cb.equal(path1, "Peter1"), cb.lt(path, 7));
            return predicate;
        };
        return personRepository.findAll(personSpecification);
    }

    public List<Person> findAllPersonMatchingBetweenCondition() {
        Specification<Person> personSpecification = (Specification<Person>) (root, query, cb) -> {
            Path path = root.get("id");

            Predicate predicate = cb.between(path, 1, 4);
            return predicate;
        };
        return personRepository.findAll(personSpecification);
    }

    /*TODO:Get the persons greater than age 25 and sort them in descending order according to id by method query.*/
    public List<Person> findPersonByAgeAndOrderByID(Integer age) {
        return personRepository.findByAgeGreaterThanOrderByIdDesc(age);
    }

    /*TODO:Do  the question above using the Sort class.*/
    public List<Person> sort(Integer age) {
        return personRepository.findByAgeGreaterThan(age,(new Sort(Sort.Direction.DESC, "id")));

    }

    /*TODO:Apply Pagination on Person entities.*/
    public List<Person> findAllPersonUsingPage() {
        Page<Person> employeePage = personRepository.findAll(new PageRequest(1, 3, new Sort(Sort.Direction.DESC, "id")));
        List<Person> employeeList = employeePage.getContent();
        return employeeList;
    }
}

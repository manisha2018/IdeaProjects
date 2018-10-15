package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DummyDao extends Dummy {

    @Autowired
    private Dummy dummy;

    public Dummy entityName() {
        System.out.println("This is Repository class");
        dummy.setName("Manisha");
        return dummy;
    }
}

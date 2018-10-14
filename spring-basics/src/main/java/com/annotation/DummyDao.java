package com.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class DummyDao extends Dummy {

    private Dummy dummy;

    public Dummy writeName() {
        System.out.println("This is Repository class");
        dummy.setName("Manisha");
        return dummy;
    }
}

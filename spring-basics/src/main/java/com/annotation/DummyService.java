package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

    @Autowired
    private DummyDao dummyDao;

    public Dummy writeName(){
        System.out.println("This is Service Class");
        return dummyDao.writeName();
    }
}

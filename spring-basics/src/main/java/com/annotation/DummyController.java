package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DummyController {

    @Autowired
    private DummyService dummyService;
        public Dummy writeName(){
            System.out.println("This is Controller Class");
            return dummyService.writeName();
        }
}

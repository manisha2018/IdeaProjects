package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DummyMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DummyConfig.class);
        DummyController dummyController = applicationContext.getBean(DummyController.class);
        dummyController.getAllName();

    }
}

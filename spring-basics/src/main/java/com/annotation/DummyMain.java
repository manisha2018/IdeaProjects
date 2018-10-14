package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DummyMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotation-config.xml");
        DummyController dummyController=applicationContext.getBean(DummyController.class);
        dummyController.writeName();

    }
}

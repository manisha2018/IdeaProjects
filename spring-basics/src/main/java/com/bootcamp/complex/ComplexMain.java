package com.bootcamp.complex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext
                ("config-complex.xml");
        Complex complex = applicationContext.getBean(Complex.class);
        System.out.println(complex);

    }
}

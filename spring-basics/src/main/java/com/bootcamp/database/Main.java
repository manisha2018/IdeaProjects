package com.bootcamp.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("configDB.xml");
        Database database=applicationContext.getBean(Database.class);
        System.out.println(database);

    }
}

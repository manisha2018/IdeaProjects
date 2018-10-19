package com.exercise.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext
                ("event-config.xml");
        Database database = ctx.getBean(Database.class);
//         System.out.println(database);
//        database.connect();
//        ctx.start();
//        ctx.stop();
        System.out.println("*****************************************");
        MultiEventListener multiEventListener = ctx.getBean(MultiEventListener.class);

        database.display();
//        ctx.close();
    }
}
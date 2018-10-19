package com.exercise.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class DatabaseListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        System.out.println("Firing" +event);
    }
}

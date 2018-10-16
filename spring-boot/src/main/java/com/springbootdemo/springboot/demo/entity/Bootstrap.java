package com.springbootdemo.springboot.demo.entity;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap {

    @EventListener(ApplicationStartedEvent.class)
    public void init(){
        System.out.println("Hey how are you!!");
    }
}

package com.exercise.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Database implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;
    private String name;
    private Integer Port;

    public String getName() {
        System.out.println("This is getName method");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        System.out.println("This is getPort method");
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", Port=" + Port +
                '}';
    }

    public void connect() {
        //    System.out.println("connecting....");
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("Connecting");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    void display() {
        System.out.println("This is the Database Class");
    }

    public String test(){
        return "Test Method";
    }
}

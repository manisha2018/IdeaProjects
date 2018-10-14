package com.exercise.event;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DatabaseAspect {

    @Before("execution(void display())")
    void beforeAdvice() {
        System.out.println("Before advice is running");
    }

}

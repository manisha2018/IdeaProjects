package com.exercise.event;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class DatabaseAspect {

    /*TODO:
    Try all AOP wild expressions which we discussed,
    on the Database class which we created..
    * */
    @Before("execution(void display())")
    void beforeAdvice() {
        System.out.println("Before advice is running");
    }

    @Before("execution(* get*())")
    void beforeAdvice1() {
        System.out.println("This is before all get methods");
    }

    @Before("execution(* com.exercise.event.Database.*())")
    void beforeAdvice2() {
        System.out.println("This is before all methods with no argument");
    }

    @Before("execution(void *())")
    void beforeAdvice3() {
        System.out.println("Running before advice");
    }

    @Before("execution(* *())")
    void beforeAdvice4() {
        System.out.println("Running before any method which takes no argument");
    }

    @Before("execution(* *(..))")
    void beforeAdvice5() {
        System.out.println("Running before any method");
    }

    /*TODO:
    Apply Before, After, AfterReturning, AfterThrowing and Around Advice
     for the methods of the database class.
*/
    @AfterReturning(pointcut = "execution(public String getName())", returning = "returnValue")
    void afterReturningAdvice(String returnValue) {
        System.out.println("Running AfterReturning " + returnValue);
    }

    @AfterThrowing(pointcut = "execution(void throwException())", throwing = "ex")
    void afterReturningAdvice(Exception ex) {
        System.out.println("Running AfterThrowing " + ex);
    }

    @After("execution(void display())")
    void afterAdvice(){
        System.out.println("Running after advice");
    }

    @Around("execution(void display())")
    void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around before");
        proceedingJoinPoint.proceed();
        System.out.println("Around after");
    }
}

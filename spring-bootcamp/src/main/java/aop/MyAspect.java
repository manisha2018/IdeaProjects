package aop;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class MyAspect {
    @Before("execution(void display())")
    void beforeAdvice() {
        System.out.println("Before advice is running");
    }


    @AfterReturning(pointcut = "execution(Integer getNumber())", returning = "returnValue")
    void afterReturningAdvice(Integer returnValue) {
        System.out.println("Running AfterReturning " + returnValue);
    }
}

package aop.Question1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentAspect {

    /*TODO:
    Create a logging aspect. Create a pointcut to log all methods Of services .
    * */

    @Pointcut("within(aop.Question1.Student.*)")
    public void allMethodsPointcut(){
        System.out.println("get all the methods");
    }
}

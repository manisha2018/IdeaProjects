package aop.exercise;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class StudentAspect {

    /*TODO:
    Create a logging aspect. Create a pointcut to log all methods Of services .
    * */

    //Question 1
    @Before("execution(* aop.exercise.Student.getName())")
    public void logBeforeGetName(JoinPoint joinPoint) {
        System.out.println("log before getName() : " + joinPoint.getSignature().getName());
    }

    /*TODO:Add a logging statement before and after the method ends*/
    //Question 2
    @Before("execution(* aop.exercise.Student.getId())")
    public void logBeforeGetStudentId(JoinPoint joinPoint) {
        System.out.println("log before getStudentId() : " + joinPoint.getSignature().getName());
    }

    //Question 2
    @After("execution(* aop.exercise.Student.getId())")
    public void logAfterGetEmployeeId(JoinPoint joinPoint) {
        System.out.println("log after getStudentId() : " + joinPoint.getSignature().getName());
    }

    @AfterThrowing(pointcut = "execution(void throwIOException())", throwing = "ex")
    void afterThrowingIO(Exception ex) {

        System.out.println("Running AfterThrowing " + ex);
    }

    /*TODO:
     * Apply execution, within, args, this and bean expressions on
     * the before and after advice of service bean.*/

    @Before("bean(student))")
    void beforeAdviceEmployee() {

        System.out.println("Running before advice of employee2");
    }

    //Question 4
    @Before("within(aop.exercise.*)")
    void before() {

        System.out.println("Running before advice from within");
    }

    //Question 4
    @Before("this(aop.exercise.Student)")
    void beforeRun() {

        System.out.println("Running before advice from this");
    }

    //Question 4
    @After("bean(student))")
    void AfterAdviceEmployee() {

        System.out.println("Running before advice of student");
    }

    //Question 4
    @After("this(aop.exercise.Student)")
    void AfterRun() {

        System.out.println("Running before advice from this");
    }

    /*TODO:Demonstrate the use of pointCut @Pointcut annotation and Reuse the expression created*/

    @Pointcut("execution(public void display())")
    public void displayPointCut() {
        System.out.println("hii");
    }

    @Before("displayPointCut()")
    public void runningAfterDisplayPointCut() {

        System.out.println("running After Display PointCut");
    }

    @Before("execution(* aop.exercise.Student.getCompetency())")
    public void logBeforeGetEmployeeName(JoinPoint joinPoint) {
        System.out.println("log before getCompetency() : " + joinPoint.getSignature().getName());
    }

    /*TODO:
     Access the properties of the JoinPoint in before advice.
     Print Signature of method being called and its arguments
     */
    @Before("execution(Integer getInteger(Integer))")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("---------------------");
        System.out.println("Running before advice in JoinPoint");
        System.out.println(joinPoint);
        System.out.println("get this " + joinPoint.getThis());
        System.out.println("get signature " + joinPoint.getSignature());
        Object[] objects = joinPoint.getArgs();
        for (Object object : objects) {
            System.out.println(object);
        }
        System.out.println("----------");
    }
}

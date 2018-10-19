package aop.Question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("aop-config.xml");
        StudentService studentService= context.getBean(StudentService.class);
        System.out.println(studentService.getStudent());
    }
}

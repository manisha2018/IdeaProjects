package aop.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");
        Student student = context.getBean("student", Student.class);
        student.getName();
        System.out.println(student.getName());

        System.out.println(student.getId());

        // student.throwIOException();
        student.display();
        student.getInteger(2);
    }
}

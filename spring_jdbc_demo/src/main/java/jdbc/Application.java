package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-config.xml");
        SpringJdbc springJdbc=applicationContext.getBean(SpringJdbc.class);
        springJdbc.preparedStatement();

        //CustomJDBCTemplate customJDBCTemplate=applicationContext.getBean(CustomJDBCTemplate.class);
        CustomJDBCTemplate customJDBCTemplate=(CustomJDBCTemplate) applicationContext.getBean("customJDBCTemplate");
        System.out.print("Number of users are:");
        customJDBCTemplate.countUser();
    }

}

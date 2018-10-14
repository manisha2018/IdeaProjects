package aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
        ctx.start();

        DummyAop dummyAop = ctx.getBean(DummyAop.class);
        dummyAop.display();
        ctx.stop();
    }
}

package study.spi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SomeService bean = context.getBean(SomeService.class);

        System.out.println(bean.getClass());

        bean.someMethod();


    }
}

package liusheng.main.consumer;

import liusheng.main.service.SomeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.consumer.xml");
        applicationContext.start();

        SomeService someService = applicationContext.getBean("someService", SomeService.class);

        System.out.println(someService.hello("Hello"));
        System.in.read();
    }
}

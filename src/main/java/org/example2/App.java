package org.example2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("example2.xml");

        Car obj = (Car) context.getBean("car");
        obj.drive();

    }
}

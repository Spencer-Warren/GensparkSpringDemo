package org.examples.example1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Vehicle obj = context.getBean("Vehicle", Vehicle.class);
        obj.drive();

    }
}

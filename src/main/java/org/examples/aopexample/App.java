package org.examples.aopexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Alien alien = context.getBean("alien", Alien.class);
        alien.show();
    }
}

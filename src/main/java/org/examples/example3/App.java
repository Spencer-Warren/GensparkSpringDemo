package org.examples.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Phone obj =  context.getBean("phone", Phone.class);
        obj.config();

    }
}

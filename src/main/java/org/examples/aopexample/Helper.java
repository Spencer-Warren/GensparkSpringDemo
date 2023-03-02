package org.examples.aopexample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
    @Before("execution(public void show())")
    public void SecurityCheckIn() {
        System.out.println("Security Check-In");
    }

    @Before("execution(public void show())")
    public void LogBegins() {
        System.out.println("Log Begins");
    }
@After("execution(public void show())")
    public void SecurityCheckOut() {
        System.out.println("Security Check-Out");
    }
    @After("execution(public void show())")

    public void LogEnds() {
        System.out.println("Log Ends");
    }
}


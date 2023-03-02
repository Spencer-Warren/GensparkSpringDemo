package org.examples.aopexample;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    public void show() {
        System.out.println("This contains the main Logic.");
    }
}

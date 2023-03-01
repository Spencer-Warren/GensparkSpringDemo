package org.example2;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    Tire tire;

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void init() {
        System.out.println("Car bean is going through init.");
    }

    public void destroy() {
        System.out.println("Car bean will destroy now.");
    }

    public void drive() {
        System.out.println("Driving a car");
        System.out.println(tire);
    }
}

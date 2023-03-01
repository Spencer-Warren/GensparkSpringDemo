package org.examples.example1;

public class Car implements Vehicle {
    Tire tire;

//    public Car(Tire tire) {
//        this.tire = tire;
//    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void drive() {

        System.out.println("Driving a car");
        System.out.println(tire);
    }
}

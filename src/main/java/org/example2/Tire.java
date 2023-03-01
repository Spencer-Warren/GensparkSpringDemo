package org.example2;

import org.springframework.stereotype.Component;

@Component
public class Tire {
    private String brandName;
    private int size;

    public void setBrandName(String brandName) {
        System.out.println("Tire.setBrandName() called");
        this.brandName = brandName;
    }

    public void setSize(int size) {
        System.out.println("Tire.setSize() called");
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "brandName='" + brandName + '\'' +
                ", size=" + size +
                '}';
    }
}

package org.example;

public class Tire {
    private String brandName;
    private int size;

//    public Tire(String brandName, int size) {
//        this.brandName = brandName;
//        this.size = size;
//    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setSize(int size) {
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

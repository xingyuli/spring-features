package org.swordess.toy.spring.annotationbased.autowired;

public class Vehicle {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand;
    }

}

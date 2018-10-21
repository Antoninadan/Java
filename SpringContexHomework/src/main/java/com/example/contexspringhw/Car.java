package com.example.contexspringhw;

import org.springframework.beans.factory.annotation.Autowired;

public class Car extends Vehicle {

    private String type;
    @Autowired
    private CarDriver driver;

    public Car() {

    }

    public Car(String type, CarDriver driver) {
        this.type = type;
        this.driver = driver;
    }

    public Car(String brand, String color, String type, CarDriver driver) {
        super(brand, color);
        this.type = type;
        this.driver = driver;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(CarDriver driver) {
        this.driver = driver;
    }

    @Override
    public void move() {
        System.out.println(driver.getName() + ": Bz-z-z-z");
    }
}

package com.example.contexspringhw;

import org.springframework.beans.factory.annotation.Autowired;

public class Lorry extends Vehicle {

    private double loadCapacity;
    @Autowired
    private LorryDriver driver;

    public Lorry() {

    }

    public Lorry(double loadCapacity, LorryDriver driver) {
        this.loadCapacity = loadCapacity;
        this.driver = driver;
    }

    public Lorry(String brand, String color, double loadCapacity, LorryDriver driver) {
        super(brand, color);
        this.loadCapacity = loadCapacity;
        this.driver = driver;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public LorryDriver getDriver() {
        return driver;
    }

    public void setDriver(LorryDriver driver) {
        this.driver = driver;
    }

    @Override
    public void move() {
        System.out.println(driver.getName() + ": Hr-r-r-r-r!");
    }
}
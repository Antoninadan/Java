package com.example.contexspringhw;

public class CarDriver extends Driver {

    public CarDriver() {
    }

    public CarDriver(String name, int age, String education) {
        super(name, age, education);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + ": I am not pedestrian... But step by step...");
    }
}

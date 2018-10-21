package com.example.contexspringhw;

public class ShipDriver extends Driver {

    public ShipDriver() {
    }

    public ShipDriver(String name, int age, String education) {
        super(name, age, education);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + ": So far... But I am a super captain...");
    }
}

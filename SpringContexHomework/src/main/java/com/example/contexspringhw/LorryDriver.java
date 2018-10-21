package com.example.contexspringhw;

public class LorryDriver extends Driver {

    public LorryDriver() {
    }

    public LorryDriver(String name, int age, String education) {
        super(name, age, education);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + ": Ok... Let's walk...");
    }
}

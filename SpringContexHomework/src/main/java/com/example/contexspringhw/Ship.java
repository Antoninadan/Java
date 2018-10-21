package com.example.contexspringhw;

import org.springframework.beans.factory.annotation.Autowired;

public class Ship extends Vehicle{

    private int displacement;
    @Autowired
    private ShipDriver captain;

    public Ship() {

    }

    public Ship(int displacement, ShipDriver captain) {
        this.displacement = displacement;
        this.captain = captain;
    }

    public Ship(String brand, String color, int displacement, ShipDriver captain) {
        super(brand, color);
        this.displacement = displacement;
        this.captain = captain;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public Driver getCaptain() {
        return captain;
    }

    public void setCaptain(ShipDriver captain) {
        this.captain = captain;
    }

    @Override
    public void move() {
        System.out.println(captain.getName() + ": Too-too");
    }

}

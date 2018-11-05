package com.example.autospring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Manufactor {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Manufactor() {
    }

    public Manufactor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manufactor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

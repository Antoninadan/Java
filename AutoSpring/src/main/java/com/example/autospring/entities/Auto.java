package com.example.autospring.entities;

import javax.persistence.*;

@Entity
public class Auto {
    @Id
    @GeneratedValue
    private Long id;

    private String mark;
    private Integer engineSize;

    @ManyToOne
    @JoinColumn(name = "manufactor_id")
    private Manufactor manufactor;

    public Auto() {
    }

    public Auto(String mark, Integer engineSize) {
        this.mark = mark;
        this.engineSize = engineSize;
    }

    public Auto(String mark, Integer engineSize, Manufactor manufactor) {
        this.mark = mark;
        this.engineSize = engineSize;
        this.manufactor = manufactor;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Integer engineSize) {
        this.engineSize = engineSize;
    }

    public Manufactor getManufactor() {
        return manufactor;
    }

    public void setManufactor(Manufactor manufactor) {
        this.manufactor = manufactor;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", engineSize=" + engineSize +
                ", manufactor=" + manufactor +
                '}';
    }
}


//    insert into manufactor VALUES (1, 'Volvo')
//    insert into auto VALUES (1, 2, 'X5', 1)
//    select * from auto
//            select * from manufactor
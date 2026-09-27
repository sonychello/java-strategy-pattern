package org.example;

import org.example.kindOfMove.DriveACar;
import org.example.kindOfMove.Fly;
import org.example.kindOfMove.RideAHorse;
import org.example.kindOfMove.Walk;

import java.util.Objects;

public class Hero {
    public Hero(String name) {
        this.name = name;
    }

    public Hero() {
        this("Lol");
    }

    private String name;
    private Strategy strategy;

    void setName(String name) {
        this.name = name;
    }

    void getName() {
        System.out.println("Your hero's name: " + this.name);
    }

    void setStrategy(String kindOfMove) throws IllegalArgumentException {
        if (Objects.equals(kindOfMove, "fly")) {
            this.strategy = new Fly();
        } else if (Objects.equals(kindOfMove, "walk")) {
            this.strategy = new Walk();
        } else if (Objects.equals(kindOfMove, "ride a horse")) {
            this.strategy = new RideAHorse();
        } else if (Objects.equals(kindOfMove, "drive a car")) {
            this.strategy = new DriveACar();
        } else {
            throw new IllegalArgumentException("Invalid command! Try again:");
        }
    }

    void move() {
        this.strategy.move();
    }
}

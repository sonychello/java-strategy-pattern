package org.example.kindOfMove;

import org.example.Strategy;

public class Fly implements Strategy {
    void Fly() {}

    @Override
    public void move() {
        System.out.println("Let's go to the Heaven!");
    }
}

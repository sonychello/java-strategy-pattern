package org.example.kindOfMove;

import org.example.Strategy;

public class RideAHorse implements Strategy {
    void RideAHorse() {}

    @Override
    public void move() {
        System.out.println("Let's go my favourite horse!");
    }
}

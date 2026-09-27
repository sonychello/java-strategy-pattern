package org.example.kindOfMove;

import org.example.Strategy;

public class Walk implements Strategy {
    void Walk() {}

    @Override
    public void move() {
        System.out.println("Let's go walk!");
    }
}

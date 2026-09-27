package org.example.kindOfMove;

import org.example.Strategy;

public class DriveACar implements Strategy {
    void DriveACar() {}

    @Override
    public void move() {
        System.out.println("Let's go drive at speed!");
    }
}

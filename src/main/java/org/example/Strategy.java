package org.example;

public interface Strategy {
    void move();
    static void printStr() {
        System.out.println("Hello");
    }
}

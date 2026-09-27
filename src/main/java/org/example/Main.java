package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String command;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Let's go play! Enter your hero's name:");
        name = scanner.nextLine();
        Hero hero = new Hero(name);
        Strategy.printStr();

        while (true) {
            System.out.println("You can choose what you want to do with you hero:\n" +
                    "\tFor set new name write 1\n" +
                    "\tFor get really name write 2\n" +
                    "\tFor set new kind of move write 3\n" +
                    "For ending game write 0");
            command = scanner.nextLine();
            if (Objects.equals(command, "1")) {
                System.out.println("Enter new name for your hero:");
                name = scanner.nextLine();
                hero.setName(name);
            } else if (Objects.equals(command, "2")) {
                hero.getName();
            } else if (Objects.equals(command, "3")) {
                System.out.println("Enter kind of move:\n\twalk\n\tfly\n\tride a horse\n\tdrive a car");
                command = scanner.nextLine();
                try {
                    hero.setStrategy(command);
                    hero.move();
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (Objects.equals(command, "0")) {
                break;
            }
        }
    }
}
# Java Strategy Pattern

A Java project demonstrating the **Strategy design pattern**.

The project models a game hero (`Hero`) who can move between two points using different movement strategies, such as walking, riding a horse, flying, and other possible movement methods.

The movement strategy can be selected and changed at runtime without changing the `Hero` class.

## Task

Implement classes that allow:

* creating a game hero;
* defining different movement strategies;
* moving the hero between two points;
* changing the movement method during program execution;
* demonstrating the work of the implemented strategies.

## Design Pattern

The project uses the **Strategy** design pattern.

The movement behavior is separated into independent strategy classes. The `Hero` class uses the selected strategy to perform movement and can switch to another strategy at runtime.

## Technologies

* Java
* Object-oriented programming
* Strategy design pattern

## Demonstration

The program demonstrates movement using different strategies and changing the selected strategy during execution.

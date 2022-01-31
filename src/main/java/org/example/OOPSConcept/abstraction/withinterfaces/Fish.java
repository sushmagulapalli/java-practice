package org.example.OOPSConcept.abstraction.withinterfaces;

public class Fish implements Animal {
    @Override
    public void move() {
        System.out.println("Move - swimming as a fish");
    }

    @Override
    public void eat() {
        System.out.println("Eat - eating as a fish");
    }

    @Override
    public void see() {
        System.out.println("See - watching as a fish");
    }
}

package org.example.OOPSConcept.abstraction.withinterfaces;

public class Bird implements Animal {
    @Override
    public void move() {
        System.out.println("Move - flying as a bird");
    }

    @Override
    public void eat() {
        System.out.println("Eat - eating as a bird");
    }

    @Override
    public void see() {
        System.out.println("See - watching as a bird");
    }
}

package org.example.OOPSConcept.abstraction.withabstractclass;

public class Fish extends Animal {

    @Override
    void move() {
        System.out.println("Move - swimming as a fish");
    }

    @Override
    void eat() {
        System.out.println("Eat - eating as a fish");
    }
}

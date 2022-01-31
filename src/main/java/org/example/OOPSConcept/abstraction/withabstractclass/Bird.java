package org.example.OOPSConcept.abstraction.withabstractclass;

public class Bird extends Animal {

    @Override
    void move() {
        System.out.println("Move - Flying as a bird");
    }

    @Override
    void eat() {
        System.out.println("Eat - eating as a bird");
    }
}

package org.example.OOPSConcept.abstraction.withabstractclass;

public class TestBird {

    public static void main(String[] args) {
        Animal animal = new Bird();

        animal.eat();
        animal.move();
        animal.label();

    }
}
